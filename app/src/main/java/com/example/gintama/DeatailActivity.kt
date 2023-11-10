package com.example.gintama

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.example.gintama.R

class DeatailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatail)

        val photo = intent.getIntExtra("photo", R.drawable.ic_launcher_foreground)
        val title = intent.getStringExtra("title") ?: "Judul Artikel"
        val description = intent.getStringExtra("description") ?: "Deskripsi Artikel"
        val keterangan = intent.getStringExtra("keterangan") ?: getString(R.string.keterangan_default)
        //tvDetailKeterangan.text = keterangan

        //tvDetailKeterangan.text = keterangan

        val ivDetailPhoto: ImageView = findViewById(R.id.iv_detail_photo)
        val tvDetailTitle: TextView = findViewById(R.id.tv_detail_title)
        val tvDetailDescription: TextView = findViewById(R.id.tv_detail_description)
        val tvDetailKeterangan: TextView = findViewById(R.id.tv_detail_keterangan)  // Tambahkan ini

        ivDetailPhoto.setImageResource(photo)
        tvDetailTitle.text = title
        tvDetailDescription.text = description
        tvDetailKeterangan.text = keterangan  // Tambahkan ini
    }
}
