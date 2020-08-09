package inn.mroyek.bismillahsiakad.presentation.ui.krs.reducekrs

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.gson.Gson
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import dagger.android.support.AndroidSupportInjection
import inn.mroyek.bismillahsiakad.MySiakad.Companion.pref
import inn.mroyek.bismillahsiakad.R
import inn.mroyek.bismillahsiakad.data.request.DeleteSomeKrsRequest
import inn.mroyek.bismillahsiakad.data.response.KrsResponse.KrsResult
import kotlinx.android.synthetic.main.fragment_reduce_krs.*
import kotlinx.android.synthetic.main.fragment_reduce_krs.view.*
import javax.inject.Inject

class ReduceKrsFragment : BottomSheetDialogFragment(), ReduceKrsContract, ReduceKrsAdapter.ItemKrsSelectedListener {

    @Inject
    lateinit var presenter: ReduceKrsPresenter

    private val sharePref = pref

    private val adapterKrs = GroupAdapter<GroupieViewHolder>()

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
        return inflater.inflate(R.layout.fragment_reduce_krs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.rv_reduce_krs.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterKrs
        }

        presenter.getKrsbyUser(sharePref.user.username)
    }

    override fun getKrs(listKrs: List<KrsResult?>) {
        adapterKrs.clear()
        listKrs.forEach {
            adapterKrs.add(ReduceKrsAdapter(it, this))
        }

        adapterKrs.notifyDataSetChanged()
    }

    override fun deleteSomeKrs(sukses: String) {
        Toast.makeText(context, sukses, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }

    override fun onItemKrsSelected(item: DeleteSomeKrsRequest.DeleteSomeKrsRequestItem) {
        Log.d("isinyaa", "onItemKrsSelected: ${Gson().toJson(item)} wkwk $item")

        val astaga = DeleteSomeKrsRequest()
        astaga.add(item)
//        astaga.add(item)
        Log.d("isinyaaaa", ": wkwk $astaga")
        val okeeh = Gson().toJson(astaga)
        Log.d("isinyaaaawkwk", ": wkwk $okeeh")
        btn_reduce_krs.setOnClickListener {
            presenter.reduceSomeKrs(astaga)
        }
    }

}
