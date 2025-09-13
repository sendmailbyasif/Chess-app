package com.example.chesscoach

import android.content.Context
import android.widget.Toast

class GameEngine(private val context: Context, private val boardView: ChessBoardView) {

    fun resetGame() {
        Toast.makeText(context, "New Game Started", Toast.LENGTH_SHORT).show()
        // reset logic
    }

    fun resign() {
        Toast.makeText(context, "Player resigned", Toast.LENGTH_SHORT).show()
        // resign logic
    }

    fun offerDraw() {
        Toast.makeText(context, "Draw Offered", Toast.LENGTH_SHORT).show()
        // draw logic
    }
}
