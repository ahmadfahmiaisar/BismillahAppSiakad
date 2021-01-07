package inn.mroyek.bismillahsiakad.presentation.ui.khs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.KhsResponse
import javax.inject.Inject

class KhsActivity : AppCompatActivity(), KhsContract {
    @Inject
    lateinit var presenter: KhsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khs)
        presenter.bind(this)
    }

    override fun getKhs(listKhs: List<KhsResponse.ListKhs>) {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}