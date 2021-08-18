package com.intan.latihanui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.intan.latihanui.fragments.BookmarkFragment
import com.intan.latihanui.fragments.HomeFragment
import com.intan.latihanui.fragments.NotificationFragment

class BerandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val homeFragment = HomeFragment()
        val bookmarkFragment = BookmarkFragment()
        val notificationFragment = NotificationFragment()
        val bottomNavigationView = findViewById <BottomNavigationView> (R.id.bottomNavigationView)


        makeCurrentFragment(homeFragment)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_notifications -> makeCurrentFragment(notificationFragment)
                R.id.ic_bookmark -> makeCurrentFragment(bookmarkFragment)
            }
        }
    }
    private fun makeCurrentFragment(fragment : Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}