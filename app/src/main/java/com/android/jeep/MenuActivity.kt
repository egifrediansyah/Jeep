package com.android.jeep

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_activity.*

class MenuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)

        spesifikasi.setOnClickListener {
            startActivity(Intent(this, Spesifikasi::class.java))
        }

        harga.setOnClickListener{
            startActivity(Intent(this,Harga::class.java))
        }

        sejarahjeep.setOnClickListener{
            startActivity(Intent(this,Sejarah::class.java))
        }

        alamat.setOnClickListener{
            startActivity(Intent(this,Alamat::class.java))
        }
    }
}