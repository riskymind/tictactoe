package com.thisiskelechi.tictactoe

import android.graphics.Color
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
        playGame(selectedCell, selectedButton)
    }

    val player1 = ArrayList<Int>()
    val player2 = ArrayList<Int>()
    var activePlayer = 1
    fun playGame(cellId:Int, selectedButton:Button) {
        if (activePlayer == 1) {
            selectedButton.text = "X"
            player1.add(cellId)
            selectedButton.setBackgroundColor(Color.GREEN)
            activePlayer = 2
        }else {
            selectedButton.text = "O"
            selectedButton.setBackgroundColor(Color.BLUE)
            player2.add(cellId)
            activePlayer = 1
        }
        selectedButton.isEnabled = false
        checkWinner()
    }

    fun checkWinner() {
        var winner = -1

        //rows
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }

        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }

        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }

        //colunms
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }

        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player1.contains(8)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }

        //diagonal
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }

        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "PLayer 1 Wins", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Player 2 Won", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
