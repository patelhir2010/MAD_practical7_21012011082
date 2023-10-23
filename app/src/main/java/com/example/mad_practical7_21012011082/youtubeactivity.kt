package com.example.mad_practical7_21012011082

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtubeactivity)
        val youtubeId ="fJn9B64Znrk"
        val youtubeWebView = findViewById<WebView>(R.id.webview)
        val webSettings : WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/watch?v=fJn9B64Znrk&t=12s/$youtubeId")
    }
}