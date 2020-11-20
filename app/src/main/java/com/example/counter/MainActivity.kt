package com.example.counter

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvidersOf()

        displayTeamAThreePoints()
        displayTeamATwoPoints()
        displayTeamAFreeThrow()
        displayTeamBThreePoints()
        displayTeamBTwoPoints()
        displayTeamBFreeThrow()
        resetButton()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<View>(R.id.teamA_score) as TextView
        //        scoreView.setText(score);
        scoreView.text = score.toString()
    }

    fun displayTeamAThreePoints() {
        val teamAThreePoints = findViewById<View>(R.id.teamA_three_points) as Button
        teamAThreePoints.setOnClickListener {
            scoreTeamA = scoreTeamA + 3
            displayForTeamA(scoreTeamA)
        }
    }

    fun displayTeamATwoPoints() {
        val teamATwoPoints = findViewById<View>(R.id.teamA_two_points) as Button
        teamATwoPoints.setOnClickListener {
            scoreTeamA = scoreTeamA + 2
            displayForTeamA(scoreTeamA)
        }
    }

    fun displayTeamAFreeThrow() {
        val teamAFreeThrow = findViewById<View>(R.id.teamA_free_throw) as Button
        teamAFreeThrow.setOnClickListener {
            scoreTeamA = scoreTeamA + 1
            displayForTeamA(scoreTeamA)
        }
    }

    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.teamB_score) as TextView
        scoreView.text = score.toString()
    }

    fun displayTeamBThreePoints() {
        val teamBThreePoints = findViewById<View>(R.id.teamB_three_points) as Button
        teamBThreePoints.setOnClickListener {
            scoreTeamB = scoreTeamB + 3
            displayForTeamB(scoreTeamB)
        }
    }

    fun displayTeamBTwoPoints() {
        val teamBTwoPoints = findViewById<View>(R.id.teamB_two_points) as Button
        teamBTwoPoints.setOnClickListener {
            scoreTeamB = scoreTeamB + 2
            displayForTeamB(scoreTeamB)
        }
    }

    fun displayTeamBFreeThrow() {
        val teamBFreeThrow = findViewById<View>(R.id.teamB_free_throw) as Button
        teamBFreeThrow.setOnClickListener {
            scoreTeamB = scoreTeamB + 1
            displayForTeamB(scoreTeamB)
        }
    }

    fun resetButton() {
        val resetButton = findViewById<View>(R.id.reset) as Button
        resetButton.setOnClickListener {
            scoreTeamA = 0
            scoreTeamB = 0
            displayForTeamA(scoreTeamA)
            displayForTeamB(scoreTeamB)
        }
    }
}