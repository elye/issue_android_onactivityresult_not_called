package com.elyeproj.onactivityresulttest

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val ACTIVITY_KEY = 1000
        const val RESULT_KEY = "SecondActivityResult"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn_end_activity.setOnClickListener { endActivity() }
    }

    private fun endActivity() {
        val returnIntent = Intent()
        returnIntent.putExtra(RESULT_KEY, "My Result")
        setResult(Activity.RESULT_OK, returnIntent)
        finish()
    }
}
