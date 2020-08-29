package inn.mroyek.bismillahsiakad.presentation.ui.krs.addkrs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.AndroidSupportInjection
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.common.logD
import inn.mroyek.bismillahsiakad.data.request.InsertKrsRequest
import inn.mroyek.bismillahsiakad.data.response.MatkulResponse.ListMatkul
import kotlinx.android.synthetic.main.fragment_add_krs.*
import kotlinx.android.synthetic.main.fragment_add_krs.view.*
import javax.inject.Inject

class AddKrsFragment : BottomSheetDialogFragment(), AddKrsContract, AddKrsAdapter.ItemMatkulSelectedListener {

    @Inject
    lateinit var presenter: AddKrsPresenter

    private val adapterAddKrs = GroupAdapter<GroupieViewHolder>()

    companion object {
        var requested = InsertKrsRequest()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
        setStyle(STYLE_NORMAL, R.style.BottomSheetDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.bind(this)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_krs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.rv_add_krs.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterAddKrs
        }

        presenter.getMatkul()
    }

    override fun getMatkul(listMatkul: List<ListMatkul?>) {
        adapterAddKrs.clear()
        listMatkul.forEach {
            adapterAddKrs.add(AddKrsAdapter(it, this))
        }
    }

    override fun insertKrs(response: String) {
        Toast.makeText(context, response, Toast.LENGTH_LONG).show()
    }

    override fun onItemMatkulSelected(request: InsertKrsRequest) {
        logD("isinyacok", "nyobainCok: $request")
        btn_add_krs.setOnClickListener {
            presenter.insertKrs(request)
            dismiss()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}