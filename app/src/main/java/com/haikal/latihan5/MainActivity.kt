package com.haikal.latihan5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnKonversiSuhu : Button
    private lateinit var btnHitungBelanja : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnKonversiSuhu = findViewById(R.id.btnKonversiSuhu)
        btnHitungBelanja = findViewById(R.id.btnHitungBelanja)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnKonversiSuhu.setOnClickListener() {
            val intent = Intent(this@MainActivity, KonversiSuhuActivity::class.java)
            startActivity(intent)
        }

        btnHitungBelanja.setOnClickListener() {
            val intent2 = Intent(this@MainActivity, DiskonBelanjaActivity::class.java)
            startActivity(intent2)
        }

    }
}