package com.example.modul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<MahasiswaViewModel>()

        for (i in 1..100) {
            data.add(MahasiswaViewModel(R.drawable.Pas_Foto_Raihan_Alif, "Raihan Alif Nurdianto", "205150207111042", "Bermain Game"))
        }

        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter

    }
}