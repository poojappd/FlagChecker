package com.example.flagchecker

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonOnclick(view: View) {
        Intent(this, TestActivity::class.java).apply{
            Log.e(TAG, "New task flags - ${Intent.FLAG_ACTIVITY_NEW_TASK}")

            Log.e(TAG, "No flags - $flags")
            addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            Log.e(TAG, "single top - $flags")
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            Log.e(TAG, " after new_task - $flags")
            startActivity(this)
        }
    }
}