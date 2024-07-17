package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private val count = Count.Base(2)
    private lateinit var Text: TextView
    private lateinit var Button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text = findViewById(R.id.countTextView)
        Button = findViewById(R.id.incrementButton)

        Button.setOnClickListener {
            val result = count.increment(Text.text.toString())
            Text.text = result
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("key", Text.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Text.text = savedInstanceState.getString("key")
    }

}

