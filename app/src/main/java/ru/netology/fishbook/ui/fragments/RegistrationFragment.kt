package ru.netology.fishbook.ui.fragments

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.netology.fishbook.R


class RegistrationFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("REGFRAGMENT", "onCreateView()")
        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("REGFRAGMENT", "onViewCreated()")
    }

    companion object {

        fun newInstance() = RegistrationFragment()
    }

//    override fun onAttach(activity: Activity) {
//        super.onAttach(activity)
//        Log.e("REGFRAGMENT", "onAttach()")
//
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.e("REGFRAGMENT", "onCreate()")
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        Log.e("REGFRAGMENT", "onActivityCreated()")
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.e("REGFRAGMENT", "onStart()")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("REGFRAGMENT", "onResume()")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e("REGFRAGMENT", "onPause()")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("REGFRAGMENT", "onStop()")
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        Log.e("REGFRAGMENT", "onDestroyView()")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("REGFRAGMENT", "onDestroy()")
//
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        Log.e("REGFRAGMENT", "onDetach()")
//    }


}