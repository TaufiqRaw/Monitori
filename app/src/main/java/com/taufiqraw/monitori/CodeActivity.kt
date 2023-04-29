package com.taufiqraw.monitori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Tanggal Pengerjaan : 28-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/

class CodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)
        findViewById<Button>(R.id.btnMasuk).also {
            it.setOnClickListener {
                Intent(this, IdentityActivity::class.java).also {
                    startActivity(it);
                }
            }
        }
    }
}