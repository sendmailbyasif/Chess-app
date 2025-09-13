package com.example.chesscoach

import android.os.CountDownTimer
import android.widget.TextView

class TimerManager(private val whiteTimer: TextView, private val blackTimer: TextView) {
    private var whiteTimeMillis: Long = 300000
    private var blackTimeMillis: Long = 300000

    private var whiteTimerObj: CountDownTimer? = null
    private var blackTimerObj: CountDownTimer? = null

    fun startWhiteTurn() {
        whiteTimerObj?.cancel()
        whiteTimerObj = object : CountDownTimer(whiteTimeMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                whiteTimeMillis = millisUntilFinished
                whiteTimer.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                whiteTimer.text = "0"
            }
        }.start()
    }

    fun startBlackTurn() {
        blackTimerObj?.cancel()
        blackTimerObj = object : CountDownTimer(blackTimeMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                blackTimeMillis = millisUntilFinished
                blackTimer.text = (millisUntilFinished / 1000).toString()
            }

            override fun onFinish() {
                blackTimer.text = "0"
            }
        }.start()
    }
}
