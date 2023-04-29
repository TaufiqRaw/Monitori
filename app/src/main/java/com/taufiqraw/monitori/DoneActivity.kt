package com.taufiqraw.monitori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * Tanggal Pengerjaan : 29-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/
class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        findViewById<Button>(R.id.btnOke).also {
            it.setOnClickListener {
                this.finishAffinity()
            }
        }
        this.bindExtras()
    }

    private fun bindExtras(){
        var nama = intent.extras?.getString("nama")
        var umur = intent.extras?.getString("umur")
        var tvDone = findViewById<TextView>(R.id.tvDone)
        tvDone.setText("Beres! Sekarang "+ nama + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu " + nama + " ngatur waktu :D")
    }
}