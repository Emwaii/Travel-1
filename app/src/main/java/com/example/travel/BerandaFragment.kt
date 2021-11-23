package com.example.travel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_beranda.*

class BerandaFragment : Fragment() {

    companion object {
        fun getInstance() : BerandaFragment = BerandaFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
//        banner_view_pager.adapter = BannerAdapter(bannerList)
//        banner_view_pager.offscreenPageLimit = 1

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

}