package com.shapeecloudjsc.testservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlay.setOnClickListener {
            playSong()
        }
        btnPause.setOnClickListener {
            stopSong()
        }
    }

    private fun playSong() {
        val intent = Intent(this, PlaySongService::class.java)
        startService(intent)

    }
    private fun stopSong() {
        val intent = Intent(this, PlaySongService::class.java)
        stopService(intent)
    }
}