package com.example.modul5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val listMahasiswa: List<MahasiswaViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val MahasiswaViewModel = listMahasiswa[position]

        holder.ivFoto.setImageResource(MahasiswaViewModel.foto)
        holder.tvNama.text = MahasiswaViewModel.nama
        holder.tvNim.text = MahasiswaViewModel.nim
        holder.tvHobi.text = MahasiswaViewModel.hobi
    }

    override fun getItemCount(): Int = listMahasiswa.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivFoto : ImageView = itemView.findViewById(R.id.iv_foto)
        val tvNama : TextView = itemView.findViewById(R.id.tv_nama)
        val tvNim : TextView = itemView.findViewById(R.id.tv_nim)
        val tvHobi : TextView = itemView.findViewById(R.id.tv_hobi)
    }
}