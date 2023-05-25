package com.artemis.flamingo_fire.ui.acts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.artemis.flamingo_fire.R
import com.artemis.flamingo_fire.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding = ActivityMainBinding.inflate(layoutInflater)
        binding = mainBinding
        setContentView(mainBinding.root)


        //toolbar
        val toolBar = binding.flamingoToolbar
        setSupportActionBar(toolBar)

        // Retrieve NavController from the NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.flamingo_fire_nav_host) as NavHostFragment
        navController = navHostFragment.navController

        //Setup action bar for use with nav controller
        setupActionBarWithNavController(navController)

    }

    /**
     * Handle navigation when the user chooses Up from the action bar.
     */
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}