package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var Text: TextView
    private lateinit var Button: Button
    private lateinit var Layout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text = findViewById(R.id.titleTextView)
        Button = findViewById(R.id.removeButton)
        Layout = findViewById(R.id.rootLayout)

        Button.setOnClickListener {
            Layout.removeView(Text)
            Button.isEnabled = false
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val removedViews = Layout.childCount == 1
        outState.putBoolean("key", removedViews)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val removedViews = savedInstanceState.getBoolean("key")
        if (removedViews) {
            Layout.removeView(Text)
            Button.isEnabled = false
        }
    }
}