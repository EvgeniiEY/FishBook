package ru.netology.fishbook.dto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import ru.netology.fishbook.R
import ru.netology.fishbook.ui.fragments.LoginFragment
import ru.netology.fishbook.ui.fragments.RegistrationFragment

class AuthActivity : AppCompatActivity(), Navigation {

    lateinit var navController: NavController


    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        // получаем NavController
// TODO: почитать в текте ранее про НаХостФрагмент
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment? ?: return
        navController = host.navController
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.baseSelectionFragment, R.id.guideSelectionFragment), drawerLayout)
        val sideBar = findViewById<NavigationView>(R.id.nav_view)


        setupActionBarWithNavController(navController, appBarConfiguration)
        sideBar.setupWithNavController(navController)

        Log.e("TAG", "onCreate()")

    }


    override fun openLoginFragment() {
        replaceFragment(LoginFragment.newInstance())
    }

    override fun openRegistrationFragment() {
//        navController.navigate(R.id.action_AuthFragment_to_RegistrationFragment)
//        replaceFragment(RegistrationFragment.newInstance())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

}

interface Navigation {

    fun openLoginFragment()

    fun openRegistrationFragment()


}