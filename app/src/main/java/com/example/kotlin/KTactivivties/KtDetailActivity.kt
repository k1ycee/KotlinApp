package com.example.kotlin.KTactivivties

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import kotlinx.android.synthetic.main.kt_detail_activity.view.*
import kotlinx.android.synthetic.main.kt_detail_activity.*

class KtDetailActivity : AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kt_detail_activity)


        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item!!.itemId == android.R.id.home){
            finish()
        }
        return true
    }
}