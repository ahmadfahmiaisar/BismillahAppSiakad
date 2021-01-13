package inn.mroyek.bismillahsiakad.presentation.ui.perwalian

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import dagger.android.AndroidInjection
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.KrsResponse
import kotlinx.android.synthetic.main.activity_perwalian.*
import javax.inject.Inject

class PerwalianActivity : AppCompatActivity(), PerwalianContract {

    @Inject
    lateinit var presenter: PerwalianPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perwalian)
        presenter.bind(this)

        searchUsername.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                presenter.getKrsbyUsername(query)
                Toast.makeText(this@PerwalianActivity, query, Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
    }

    override fun getKrsByUsername(listKrs: List<KrsResponse.KrsResult?>) {

    }

    override fun postStatusKrs(response: String) {

    }

    override fun loading(loading: Boolean) {
        pg_loading.visibility = if (loading) View.VISIBLE else View.GONE
    }

    fun goBack(view: View) {
        view.setOnClickListener { finish() }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}