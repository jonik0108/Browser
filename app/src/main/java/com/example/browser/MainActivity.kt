package com.example.browser

import android.app.ProgressDialog
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient



class MainActivity : AppCompatActivity() {
   lateinit var webView: WebView
   lateinit var progresDialog:ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView=findViewById(R.id.webView)
        webView.loadUrl("https://hemis.fbtuit.uz/ru/teacher/attendance-journal?education_year=2021&semester=15&group=7&subject=39&training_type=11")
        webView.webViewClient= object : WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)


            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }

    }
}