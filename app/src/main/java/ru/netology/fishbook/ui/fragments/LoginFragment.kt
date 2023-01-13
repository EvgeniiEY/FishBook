package ru.netology.fishbook.ui.fragments

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import ru.netology.fishbook.R
import ru.netology.fishbook.dto.Navigation


class LoginFragment : Fragment() {
    private lateinit var registerButton: TextView
    private lateinit var listener: Navigation
    override fun onAttach(context: Context) {

        super.onAttach(context)
        if (context is Navigation) {
            listener = context
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("FRAGMENT", "onCreateView()")
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)

    }

    private fun initView(view: View) {
        registerButton = view.findViewById(R.id.transitionSignUp)
        registerButton.setOnClickListener {
            listener.openRegistrationFragment()
            /// TODO:
//            val intent = Intent(
//                Intent.ACTION_VIEW, Uri.parse("https://ya.ru/"))

        }
    }

    companion object {

        fun newInstance() = LoginFragment()
    }

//
//
//
//    override fun onAttach(activity: Activity) {
//        super.onAttach(activity)
//        Log.e("FRAGMENT", "onAttach()")
//
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        Log.e("FRAGMENT", "onActivityCreated()")
//    }
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FRAGMENT", "onCreate()")
    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.e("FRAGMENT", "onStart()")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("FRAGMENT", "onResume()")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e("FRAGMENT", "onPause()")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("FRAGMENT", "onStop()")
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        Log.e("FRAGMENT", "onDestroyView()")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("FRAGMENT", "onDestroy()")
//
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        Log.e("FRAGMENT", "onDetach()")
//    }

}