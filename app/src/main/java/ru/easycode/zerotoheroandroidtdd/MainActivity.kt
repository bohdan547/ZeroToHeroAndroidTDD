package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var Text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text = findViewById<TextView>(R.id.titleTextView)
        val Button = findViewById<Button>(R.id.changeButton)

        Button.setOnClickListener {
            Text.text = "I am an Android Developer!"
        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putString("key", Text.text.toString())
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        Text.text = savedInstanceState.getString("key")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }


}