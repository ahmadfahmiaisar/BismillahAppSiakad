// Generated by Dagger (https://google.github.io/dagger).
package inn.mroyek.bismillahsiakad.di.component;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import inn.mroyek.bismillahsiakad.MySiakad;
import inn.mroyek.bismillahsiakad.MySiakad_MembersInjector;
import inn.mroyek.bismillahsiakad.data.repository.HomeRepository;
import inn.mroyek.bismillahsiakad.data.repository.HomeRepository_Factory;
import inn.mroyek.bismillahsiakad.data.repository.LoginRepository;
import inn.mroyek.bismillahsiakad.data.repository.LoginRepository_Factory;
import inn.mroyek.bismillahsiakad.data.repository.dhs.DhsRepository;
import inn.mroyek.bismillahsiakad.data.repository.dhs.DhsRepository_Factory;
import inn.mroyek.bismillahsiakad.data.repository.krs.AddKrsRepository;
import inn.mroyek.bismillahsiakad.data.repository.krs.AddKrsRepository_Factory;
import inn.mroyek.bismillahsiakad.data.repository.krs.DeleteSomeKrsRepository;
import inn.mroyek.bismillahsiakad.data.repository.krs.DeleteSomeKrsRepository_Factory;
import inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository;
import inn.mroyek.bismillahsiakad.data.repository.krs.KrsRepository_Factory;
import inn.mroyek.bismillahsiakad.data.service.DhsService;
import inn.mroyek.bismillahsiakad.data.service.KrsService;
import inn.mroyek.bismillahsiakad.data.service.UserService;
import inn.mroyek.bismillahsiakad.di.module.ActivityModule_DhsActivity;
import inn.mroyek.bismillahsiakad.di.module.ActivityModule_HomeActivity;
import inn.mroyek.bismillahsiakad.di.module.ActivityModule_InputActivity;
import inn.mroyek.bismillahsiakad.di.module.ActivityModule_KrsActivity;
import inn.mroyek.bismillahsiakad.di.module.ActivityModule_LoginActivity;
import inn.mroyek.bismillahsiakad.di.module.FragmentModule_AddKrsFragment;
import inn.mroyek.bismillahsiakad.di.module.FragmentModule_ReduceKrsFragment;
import inn.mroyek.bismillahsiakad.di.module.NetworkModule_ProvideOkHttpClientFactory;
import inn.mroyek.bismillahsiakad.di.module.NetworkModule_ProvideRetrofitFactory;
import inn.mroyek.bismillahsiakad.di.module.ServiceModule_ProvideApiServiceFactory;
import inn.mroyek.bismillahsiakad.di.module.ServiceModule_ProvideDhsServiceFactory;
import inn.mroyek.bismillahsiakad.di.module.ServiceModule_ProvideKrsServiceFactory;
import inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsActivity;
import inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsActivity_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.dhs.DhsPresenter;
import inn.mroyek.bismillahsiakad.presentation.ui.home.HomeActivity;
import inn.mroyek.bismillahsiakad.presentation.ui.home.HomeActivity_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.home.HomePresenter;
import inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiActivity;
import inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiActivity_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.inputnilai.InputNilaiPresenter;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsFragment_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs.AddKrsPresenter;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsActivity;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsActivity_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.parent.KrsPresenter;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsFragment_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs.ReduceKrsPresenter;
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity;
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginActivity_MembersInjector;
import inn.mroyek.bismillahsiakad.presentation.ui.login.LoginPresenter;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityModule_LoginActivity.LoginActivitySubcomponent.Builder>
      loginActivitySubcomponentBuilderProvider;

  private Provider<ActivityModule_HomeActivity.HomeActivitySubcomponent.Builder>
      homeActivitySubcomponentBuilderProvider;

  private Provider<ActivityModule_KrsActivity.KrsActivitySubcomponent.Builder>
      krsActivitySubcomponentBuilderProvider;

  private Provider<ActivityModule_DhsActivity.DhsActivitySubcomponent.Builder>
      dhsActivitySubcomponentBuilderProvider;

  private Provider<ActivityModule_InputActivity.InputNilaiActivitySubcomponent.Builder>
      inputNilaiActivitySubcomponentBuilderProvider;

  private Provider<FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent.Builder>
      reduceKrsFragmentSubcomponentBuilderProvider;

  private Provider<FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent.Builder>
      addKrsFragmentSubcomponentBuilderProvider;

  private Provider<Application> applicationProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<UserService> provideApiServiceProvider;

  private Provider<KrsService> provideKrsServiceProvider;

  private Provider<DhsService> provideDhsServiceProvider;

  private DaggerAppComponent(Builder builder) {

    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(7)
        .put(LoginActivity.class, (Provider) loginActivitySubcomponentBuilderProvider)
        .put(HomeActivity.class, (Provider) homeActivitySubcomponentBuilderProvider)
        .put(KrsActivity.class, (Provider) krsActivitySubcomponentBuilderProvider)
        .put(DhsActivity.class, (Provider) dhsActivitySubcomponentBuilderProvider)
        .put(InputNilaiActivity.class, (Provider) inputNilaiActivitySubcomponentBuilderProvider)
        .put(ReduceKrsFragment.class, (Provider) reduceKrsFragmentSubcomponentBuilderProvider)
        .put(AddKrsFragment.class, (Provider) addKrsFragmentSubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.loginActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_LoginActivity.LoginActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_LoginActivity.LoginActivitySubcomponent.Builder get() {
            return new LoginActivitySubcomponentBuilder();
          }
        };
    this.homeActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_HomeActivity.HomeActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_HomeActivity.HomeActivitySubcomponent.Builder get() {
            return new HomeActivitySubcomponentBuilder();
          }
        };
    this.krsActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_KrsActivity.KrsActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_KrsActivity.KrsActivitySubcomponent.Builder get() {
            return new KrsActivitySubcomponentBuilder();
          }
        };
    this.dhsActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_DhsActivity.DhsActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_DhsActivity.DhsActivitySubcomponent.Builder get() {
            return new DhsActivitySubcomponentBuilder();
          }
        };
    this.inputNilaiActivitySubcomponentBuilderProvider =
        new Provider<ActivityModule_InputActivity.InputNilaiActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_InputActivity.InputNilaiActivitySubcomponent.Builder get() {
            return new InputNilaiActivitySubcomponentBuilder();
          }
        };
    this.reduceKrsFragmentSubcomponentBuilderProvider =
        new Provider<FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent.Builder>() {
          @Override
          public FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent.Builder get() {
            return new ReduceKrsFragmentSubcomponentBuilder();
          }
        };
    this.addKrsFragmentSubcomponentBuilderProvider =
        new Provider<FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent.Builder>() {
          @Override
          public FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent.Builder get() {
            return new AddKrsFragmentSubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideOkHttpClientProvider =
        DoubleCheck.provider(NetworkModule_ProvideOkHttpClientFactory.create(applicationProvider));
    this.provideRetrofitProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetrofitFactory.create(provideOkHttpClientProvider));
    this.provideApiServiceProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideApiServiceFactory.create(provideRetrofitProvider));
    this.provideKrsServiceProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideKrsServiceFactory.create(provideRetrofitProvider));
    this.provideDhsServiceProvider =
        DoubleCheck.provider(
            ServiceModule_ProvideDhsServiceFactory.create(provideRetrofitProvider));
  }

  @Override
  public void inject(MySiakad app) {
    injectMySiakad(app);
  }

  private MySiakad injectMySiakad(MySiakad instance) {
    MySiakad_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    MySiakad_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application app) {
      this.application = Preconditions.checkNotNull(app);
      return this;
    }
  }

  private final class LoginActivitySubcomponentBuilder
      extends ActivityModule_LoginActivity.LoginActivitySubcomponent.Builder {
    private LoginActivity seedInstance;

    @Override
    public ActivityModule_LoginActivity.LoginActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, LoginActivity.class);
      return new LoginActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActivitySubcomponentImpl
      implements ActivityModule_LoginActivity.LoginActivitySubcomponent {
    private Provider<LoginRepository> loginRepositoryProvider;

    private LoginActivitySubcomponentImpl(LoginActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private LoginPresenter getLoginPresenter() {
      return new LoginPresenter(loginRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginActivitySubcomponentBuilder builder) {
      this.loginRepositoryProvider =
          SingleCheck.provider(
              LoginRepository_Factory.create(DaggerAppComponent.this.provideApiServiceProvider));
    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectPresenter(instance, getLoginPresenter());
      return instance;
    }
  }

  private final class HomeActivitySubcomponentBuilder
      extends ActivityModule_HomeActivity.HomeActivitySubcomponent.Builder {
    private HomeActivity seedInstance;

    @Override
    public ActivityModule_HomeActivity.HomeActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, HomeActivity.class);
      return new HomeActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(HomeActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class HomeActivitySubcomponentImpl
      implements ActivityModule_HomeActivity.HomeActivitySubcomponent {
    private Provider<HomeRepository> homeRepositoryProvider;

    private HomeActivitySubcomponentImpl(HomeActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private HomePresenter getHomePresenter() {
      return new HomePresenter(homeRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final HomeActivitySubcomponentBuilder builder) {
      this.homeRepositoryProvider =
          SingleCheck.provider(
              HomeRepository_Factory.create(DaggerAppComponent.this.provideApiServiceProvider));
    }

    @Override
    public void inject(HomeActivity arg0) {
      injectHomeActivity(arg0);
    }

    private HomeActivity injectHomeActivity(HomeActivity instance) {
      HomeActivity_MembersInjector.injectPresenter(instance, getHomePresenter());
      return instance;
    }
  }

  private final class KrsActivitySubcomponentBuilder
      extends ActivityModule_KrsActivity.KrsActivitySubcomponent.Builder {
    private KrsActivity seedInstance;

    @Override
    public ActivityModule_KrsActivity.KrsActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, KrsActivity.class);
      return new KrsActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(KrsActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class KrsActivitySubcomponentImpl
      implements ActivityModule_KrsActivity.KrsActivitySubcomponent {
    private Provider<KrsRepository> krsRepositoryProvider;

    private KrsActivitySubcomponentImpl(KrsActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private KrsPresenter getKrsPresenter() {
      return new KrsPresenter(krsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final KrsActivitySubcomponentBuilder builder) {
      this.krsRepositoryProvider =
          SingleCheck.provider(
              KrsRepository_Factory.create(DaggerAppComponent.this.provideKrsServiceProvider));
    }

    @Override
    public void inject(KrsActivity arg0) {
      injectKrsActivity(arg0);
    }

    private KrsActivity injectKrsActivity(KrsActivity instance) {
      KrsActivity_MembersInjector.injectPresenter(instance, getKrsPresenter());
      return instance;
    }
  }

  private final class DhsActivitySubcomponentBuilder
      extends ActivityModule_DhsActivity.DhsActivitySubcomponent.Builder {
    private DhsActivity seedInstance;

    @Override
    public ActivityModule_DhsActivity.DhsActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, DhsActivity.class);
      return new DhsActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(DhsActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class DhsActivitySubcomponentImpl
      implements ActivityModule_DhsActivity.DhsActivitySubcomponent {
    private Provider<DhsRepository> dhsRepositoryProvider;

    private DhsActivitySubcomponentImpl(DhsActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private DhsPresenter getDhsPresenter() {
      return new DhsPresenter(dhsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final DhsActivitySubcomponentBuilder builder) {
      this.dhsRepositoryProvider =
          SingleCheck.provider(
              DhsRepository_Factory.create(DaggerAppComponent.this.provideDhsServiceProvider));
    }

    @Override
    public void inject(DhsActivity arg0) {
      injectDhsActivity(arg0);
    }

    private DhsActivity injectDhsActivity(DhsActivity instance) {
      DhsActivity_MembersInjector.injectPresenter(instance, getDhsPresenter());
      return instance;
    }
  }

  private final class InputNilaiActivitySubcomponentBuilder
      extends ActivityModule_InputActivity.InputNilaiActivitySubcomponent.Builder {
    private InputNilaiActivity seedInstance;

    @Override
    public ActivityModule_InputActivity.InputNilaiActivitySubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, InputNilaiActivity.class);
      return new InputNilaiActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(InputNilaiActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class InputNilaiActivitySubcomponentImpl
      implements ActivityModule_InputActivity.InputNilaiActivitySubcomponent {
    private Provider<DhsRepository> dhsRepositoryProvider;

    private InputNilaiActivitySubcomponentImpl(InputNilaiActivitySubcomponentBuilder builder) {

      initialize(builder);
    }

    private InputNilaiPresenter getInputNilaiPresenter() {
      return new InputNilaiPresenter(dhsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final InputNilaiActivitySubcomponentBuilder builder) {
      this.dhsRepositoryProvider =
          SingleCheck.provider(
              DhsRepository_Factory.create(DaggerAppComponent.this.provideDhsServiceProvider));
    }

    @Override
    public void inject(InputNilaiActivity arg0) {
      injectInputNilaiActivity(arg0);
    }

    private InputNilaiActivity injectInputNilaiActivity(InputNilaiActivity instance) {
      InputNilaiActivity_MembersInjector.injectPresenter(instance, getInputNilaiPresenter());
      return instance;
    }
  }

  private final class ReduceKrsFragmentSubcomponentBuilder
      extends FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent.Builder {
    private ReduceKrsFragment seedInstance;

    @Override
    public FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, ReduceKrsFragment.class);
      return new ReduceKrsFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ReduceKrsFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ReduceKrsFragmentSubcomponentImpl
      implements FragmentModule_ReduceKrsFragment.ReduceKrsFragmentSubcomponent {
    private Provider<DeleteSomeKrsRepository> deleteSomeKrsRepositoryProvider;

    private Provider<KrsRepository> krsRepositoryProvider;

    private ReduceKrsFragmentSubcomponentImpl(ReduceKrsFragmentSubcomponentBuilder builder) {

      initialize(builder);
    }

    private ReduceKrsPresenter getReduceKrsPresenter() {
      return new ReduceKrsPresenter(
          deleteSomeKrsRepositoryProvider.get(), krsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ReduceKrsFragmentSubcomponentBuilder builder) {
      this.deleteSomeKrsRepositoryProvider =
          SingleCheck.provider(
              DeleteSomeKrsRepository_Factory.create(
                  DaggerAppComponent.this.provideKrsServiceProvider));
      this.krsRepositoryProvider =
          SingleCheck.provider(
              KrsRepository_Factory.create(DaggerAppComponent.this.provideKrsServiceProvider));
    }

    @Override
    public void inject(ReduceKrsFragment arg0) {
      injectReduceKrsFragment(arg0);
    }

    private ReduceKrsFragment injectReduceKrsFragment(ReduceKrsFragment instance) {
      ReduceKrsFragment_MembersInjector.injectPresenter(instance, getReduceKrsPresenter());
      return instance;
    }
  }

  private final class AddKrsFragmentSubcomponentBuilder
      extends FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent.Builder {
    private AddKrsFragment seedInstance;

    @Override
    public FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent build() {
      Preconditions.checkBuilderRequirement(seedInstance, AddKrsFragment.class);
      return new AddKrsFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(AddKrsFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class AddKrsFragmentSubcomponentImpl
      implements FragmentModule_AddKrsFragment.AddKrsFragmentSubcomponent {
    private Provider<AddKrsRepository> addKrsRepositoryProvider;

    private AddKrsFragmentSubcomponentImpl(AddKrsFragmentSubcomponentBuilder builder) {

      initialize(builder);
    }

    private AddKrsPresenter getAddKrsPresenter() {
      return new AddKrsPresenter(addKrsRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AddKrsFragmentSubcomponentBuilder builder) {
      this.addKrsRepositoryProvider =
          SingleCheck.provider(
              AddKrsRepository_Factory.create(DaggerAppComponent.this.provideKrsServiceProvider));
    }

    @Override
    public void inject(AddKrsFragment arg0) {
      injectAddKrsFragment(arg0);
    }

    private AddKrsFragment injectAddKrsFragment(AddKrsFragment instance) {
      AddKrsFragment_MembersInjector.injectPresenter(instance, getAddKrsPresenter());
      return instance;
    }
  }
}
