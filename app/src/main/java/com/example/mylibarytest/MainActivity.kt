package com.example.mylibarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ksy.mylibrary.ShowLibrary.Companion.lToast
import com.ksy.mylibrary.ShowLibrary.Companion.sToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sToast(this, "테스트 Toast")
        lToast(this, "테스트 Toast")
        Log.e("myLibrary", "myLibrary Test Access Succese!!")
    }
}