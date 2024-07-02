package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Text: TextView
    private lateinit var Layout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text = findViewById(R.id.titleTextView)
        val Button = findViewById<Button>(R.id.removeButton)
        Layout = findViewById(R.id.rootLayout)

        Button.setOnClickListener {
            Layout.removeView(Text)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val removedTextView = Layout.childCount == 1
        outState.putBoolean("key", removedTextView)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val removedTextView = savedInstanceState.getBoolean("key")
        if (removedTextView) Layout.removeView(Text)
    }
}