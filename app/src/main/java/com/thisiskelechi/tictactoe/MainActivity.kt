package com.thisiskelechi.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeMove(view: View) {
        val selectedButton = view as Button
        var selectedCell = 0
        when(selectedButton.id) {
            R.id.btn1 -> selectedCell = 1
            R.id.btn2 -> selectedCell = 2
            R.id.btn3 -> selectedCell = 3
            R.id.btn4 -> selectedCell = 4
            R.id.btn5 -> selectedCell = 5
            R.id.btn6 -> selectedCell = 6
            R.id.btn7 -> selectedCell = 7
            R.id.btn8 -> selectedCell = 8
            R.id.btn9 -> selectedCell = 9
        }
        Toast.makeText(this, "Id: $selectedCell", Toast.LENGTH_SHORT).show()
    }
}
