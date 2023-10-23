package com.example.mad_practical7_21012011082

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController = MediaController(this)
        val uri : Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.openai)
        val myvedioview=findViewById<VideoView>(R.id.videoView)
        myvedioview.setMediaController(mediaController)
        mediaController.setAnchorView(myvedioview)
        myvedioview.setVideoURI(uri)
        myvedioview.requestFocus()
        myvedioview.start()
        val button=findViewById<FloatingActionButton>(R.id.floatingActionButton4)
        button.setOnClickListener {
            Intent(this,YouTubeActivity::class.java).apply { startActivity(this) }
        }
    }
}