package com.sqisland.android.espresso.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  private lateinit var greetButton: View
  private lateinit var greetingView: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    greetingView = findViewById(R.id.greeting)
    greetButton = findViewById(R.id.greet_button)
  }

  fun greet(v: View) {
    greetingView.setText(R.string.hello)
    greetButton.isEnabled = false
  }
}