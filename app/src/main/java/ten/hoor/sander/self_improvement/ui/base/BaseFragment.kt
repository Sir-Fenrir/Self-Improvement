package ten.hoor.sander.self_improvement.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

abstract class BaseFragment(private val viewToUse: Int) : Fragment() {

    private lateinit var baseViewModel: BaseViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        baseViewModel =
            ViewModelProviders.of(this).get(BaseViewModel::class.java)
        return inflater.inflate(viewToUse, container, false)
    }
}