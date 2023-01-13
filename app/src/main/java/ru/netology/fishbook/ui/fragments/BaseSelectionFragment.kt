package ru.netology.fishbook.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.netology.fishbook.R

class BaseSelectionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("REGFRAGMENT", "onCreateView()")
        return inflater.inflate(R.layout.fragment_base_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("REGFRAGMENT", "onViewCreated()")
    }

    companion object {

        fun newInstance() = BaseSelectionFragment()
    }
}