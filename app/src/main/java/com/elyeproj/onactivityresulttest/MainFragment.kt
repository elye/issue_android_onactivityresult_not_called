package com.elyeproj.onactivityresulttest


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_start_from_fragment.setOnClickListener { startSecondActivity() }
    }

    private fun startSecondActivity() {
        val intent = Intent(context, SecondActivity::class.java)
        startActivityForResult(intent, SecondActivity.ACTIVITY_KEY)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == SecondActivity.ACTIVITY_KEY && resultCode == Activity.RESULT_OK) {
            Toast.makeText(context, "Back to Fragment", Toast.LENGTH_SHORT).show()
        }
    }
}
