package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_beranda.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportActionBar()?.setHomeAsUpIndicator(R.drawable.ic_baseline_account_circle_24);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);

        setTitle("Hai, Bicissss");

        var menu : Menu = bottomView.menu
        selectedMenu(menu.getItem(0))
        bottomView.setOnNavigationItemSelectedListener {
                item: MenuItem ->  selectedMenu(item)

            false
        }
    }

    private fun selectedMenu(item : MenuItem) {
        item.isChecked = true
        when(item.itemId) {
            R.id.berandaMenu -> selectedFragment(BerandaFragment.getInstance())
            R.id.tiketMenu -> selectedFragment(TiketFragment.getInstance())
            R.id.infoMenu -> selectedFragment(InfoFragment.getInstance())
        }
    }

    fun selectedFragment(fragment: Fragment) {
        var transaction : FragmentTransaction? = getSupportFragmentManager().beginTransaction()
        transaction?.replace(R.id.rootFragment, fragment)
        transaction?.commit()
    }
}