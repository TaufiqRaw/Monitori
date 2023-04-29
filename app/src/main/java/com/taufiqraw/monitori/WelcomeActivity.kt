package com.taufiqraw.monitori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Tanggal Pengerjaan : 29-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/
class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        findViewById<Button>(R.id.btnMulai).also {
            it.setOnClickListener {
                Intent(this, CodeActivity::class.java).also {
                    startActivity(it);
                }
            }
        }
    }
}