package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var enteredname : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        enteredname = findViewById(R.id.nameEditText)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = enteredname.text.toString()
            var Valid = true

            if(name.isEmpty()){
                enteredname.setError("Name cannot be empty")
                Valid = false
            }else {
                enteredname.setError(null)
            }

            if (Valid){
                displayTextView.text = "Welcome, ${name}"
            } else {
                displayTextView.text = "Please fix the current Errors."
            }
        }


    }
}