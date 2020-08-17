package inn.mroyek.bismillahsiakad.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import inn.mroyek.bismillahsiakad.BuildConfig
import inn.mroyek.bismillahsiakad.data.service.DhsService
import inn.mroyek.bismillahsiakad.data.service.KrsService
import inn.mroyek.bismillahsiakad.data.service.UserService
import io.reactivex.schedulers.Schedulers
import okhttp3.Cache
import okhttp3.CacheControl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
object NetworkModule {
    private const val CACHE_CONTROL_HEADER = "Cache-Control"

    @JvmStatic
    @Singleton
    @Provides
    fun provideOkHttpClient(app: Application): OkHttpClient {
        val context: Context = app.applicationContext

        /*val cacheControl = CacheControl.Builder()
            .maxAge(10, TimeUnit.DAYS)
            .build()*/

//        val cache = Cache(File(context.cacheDir, "cache"), 10 * 1024 * 1024)

        return OkHttpClient.Builder()
//            .cache(cache)
            .connectTimeout(2000, TimeUnit.SECONDS)
            .writeTimeout(2000, TimeUnit.SECONDS)
            .readTimeout(2000, TimeUnit.SECONDS)
            .addNetworkInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .addNetworkInterceptor { chain ->
                chain.proceed(chain.request())
                    .newBuilder()
//                    .header(CACHE_CONTROL_HEADER, cacheControl.toString())
                    .build()
            }
            .addInterceptor { chain ->
                val request = chain.request()
                    .newBuilder()
//                    .cacheControl(cacheControl)
                    .build()
                return@addInterceptor chain.proceed(request)
            }
            .build()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @JvmStatic
    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): UserService = retrofit.create(
        UserService::class.java
    )

    @JvmStatic
    @Provides
    @Singleton
    fun provideKrsService(retrofit: Retrofit): KrsService = retrofit.create(
        KrsService::class.java
    )

    @JvmStatic
    @Provides
    @Singleton
    fun provideDhsService(retrofit: Retrofit): DhsService = retrofit.create(
        DhsService::class.java
    )
}