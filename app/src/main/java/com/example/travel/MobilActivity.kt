package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MobilActivity : AppCompatActivity() {
    private lateinit var lmobil: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobil)
        getSupportActionBar()?.setHomeAsUpIndicator(R.drawable.ic_back);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        lmobil = findViewById(R.id.list_mobil)
        lmobil.setHasFixedSize(true)
        setTitle("Jenis Mobil");
        showRecyclerList()
        }

    private fun showRecyclerList() {
        lmobil.layoutManager = LinearLayoutManager(this)

    }
}