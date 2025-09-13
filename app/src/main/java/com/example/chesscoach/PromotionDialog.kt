package com.example.chesscoach

import android.app.AlertDialog
import android.content.Context

class PromotionDialog(private val context: Context, private val callback: (String) -> Unit) {
    fun show() {
        val options = arrayOf("Queen", "Rook", "Bishop", "Knight")
        AlertDialog.Builder(context)
            .setTitle("Promote Pawn To:")
            .setItems(options) { _, which ->
                callback(options[which])
            }
            .show()
    }
}
