package com.taufiqraw.monitori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * Tanggal Pengerjaan : 29-04-2023
 * NIM      : 10120789
 * Nama     : Taufiq Ridho Adi Waskita
 * Kelas    : If-9
 * **/
class IdentityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identity)
        var btnSelanjutnya = findViewById<Button>(R.id.btnSelanjutnya)
        btnSelanjutnya.setOnClickListener {
            var nama = findViewById<EditText>(R.id.etName);
            var umur = findViewById<EditText>(R.id.etAge);
            if(nama.text.isEmpty() || umur.text.isEmpty()){
                Toast.makeText(this@IdentityActivity, "Masukkan data anda", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Intent(this, DoneActivity::class.java).also {
                it.putExtra("nama", nama.text.toString())
                it.putExtra("umur", umur.text.toString())
                startActivity(it)
            }
        }
    }
}