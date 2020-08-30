package inn.mroyek.bismillahsiakad.presentation.ui.dhs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.response.DhsResponse

class DhsActivity : AppCompatActivity(), DhsContract {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dhs)
    }

    fun goBack(view: View) {}

    override fun getDhs(listdhs: List<DhsResponse.ListDhs?>) {
        TODO("Not yet implemented")
    }
}