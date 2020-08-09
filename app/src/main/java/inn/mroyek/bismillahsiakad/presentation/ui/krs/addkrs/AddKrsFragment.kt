package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.presentation.ui.krs.KrsPresenter
import javax.inject.Inject

class AddKrsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_krs, container, false)
    }

}