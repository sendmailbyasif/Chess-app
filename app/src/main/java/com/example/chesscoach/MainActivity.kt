package com.example.chesscoach

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chesscoach.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var gameEngine: GameEngine
    private lateinit var timerManager: TimerManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gameEngine = GameEngine(this, binding.chessBoardView)
        timerManager = TimerManager(binding.whiteTimer, binding.blackTimer)

        binding.newGameBtn.setOnClickListener { gameEngine.resetGame() }
        binding.resignBtn.setOnClickListener { gameEngine.resign() }
        binding.drawBtn.setOnClickListener { gameEngine.offerDraw() }
    }
}
