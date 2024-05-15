package com.zmhk.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var A1: Button
    private lateinit var A2: Button
    private lateinit var A3: Button

    private lateinit var B1: Button
    private lateinit var B2: Button
    private lateinit var B3: Button

    private lateinit var C1: Button
    private lateinit var C2: Button
    private lateinit var C3: Button

    private lateinit var tvTurn: TextView
    private lateinit var restart: ImageButton
    private lateinit var game: ConstraintLayout

    private var currentTurn: Int = 0
    private var play: Boolean = true




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        listeners()
        ui()
    }

    private fun initComponents(){
        A1 = findViewById(R.id.A1)
        A2 = findViewById(R.id.A2)
        A3 = findViewById(R.id.A3)
        B1 = findViewById(R.id.B1)
        B2 = findViewById(R.id.B2)
        B3 = findViewById(R.id.B3)
        C1 = findViewById(R.id.C1)
        C2 = findViewById(R.id.C2)
        C3 = findViewById(R.id.C3)

        tvTurn = findViewById(R.id.tvTurn)
        restart = findViewById(R.id.restart)
        game = findViewById(R.id.game)
    }

    private fun listeners(){

     A1.setOnClickListener {
         if (A1.text == "" && play) {
             if (currentTurn%2 == 0) {
                 A1.text = "X"
                 currentTurn++
             }else{A1.text = "O"
                 currentTurn++
                 ui()
             }
         }
     }

      A2.setOnClickListener {
          if (A2.text == "" && play) {
              if (currentTurn%2 == 0) {
                  A2.text = "X"
                  currentTurn++
              }else{A2.text = "O"
                  currentTurn++
                  ui()
              }
          }
      }

        A3.setOnClickListener {
            if (A3.text == "" && play) {
                if (currentTurn%2 == 0) {
                    A3.text = "X"
                    currentTurn++
                }else{A3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        B1.setOnClickListener {
            if (B1.text == "" && play) {
                if (currentTurn%2 == 0) {
                    B1.text = "X"
                    currentTurn++
                }else{B1.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        B2.setOnClickListener {
            if (B2.text == "" && play) {
                if (currentTurn%2 == 0) {
                    B2.text = "X"
                    currentTurn++
                }else{B2.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        B3.setOnClickListener {
            if (B3.text == "" && play) {
                if (currentTurn%2 == 0) {
                    B3.text = "X"
                    currentTurn++
                }else{B3.text = "O"
                    currentTurn++
                    ui()
                }
            }
        }

        C1.setOnClickListener {
            if (C1.text == "" && play) {
                if (currentTurn%2 == 0) {
                    C1.text = "X"
                    currentTurn++
                }else{C1.text = "O"
                        currentTurn++
                    ui()
                }
            }
        }

        C2.setOnClickListener {
            if (C2.text == "" && play) {
                if (currentTurn%2 == 0) {
                    C2.text = "X"
                    currentTurn++
                }else{C2.text = "O"
                    currentTurn++
                ui()
                }
            }
        }

        C3.setOnClickListener {
            if (C3.text == "" && play) {
                if (currentTurn%2 == 0) {
                    C3.text = "X"
                    currentTurn++
                }else{C3.text = "O"
                        currentTurn++
                    ui()
                }
            }
        }

        restart.setOnClickListener {
            A1.text = ""
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            A2.text = ""
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            A3.text = ""
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            B1.text = ""
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            B2.text = ""
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            B3.text = ""
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            C1.text = ""
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            C2.text = ""
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            C3.text = ""
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn))
            window.statusBarColor = getColor(R.color.bg)
            currentTurn = 0
            play = true
            ui()
        }


    }

    private fun ui(){
        if(currentTurn%2 == 0){
            tvTurn.text = "X"
        }else{tvTurn.text = "O"}

        if((A1.text == A2.text && A2.text == A3.text) && A1.text != ""){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }
        if((B1.text == B2.text && B2.text == B3.text) && B1.text != ""){
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((C1.text == C2.text && C2.text == C3.text) && C1.text != ""){
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((A1.text == B1.text && B1.text == C1.text) && A1.text != ""){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((A2.text == B2.text && B2.text == C2.text) && A2.text != ""){
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((A3.text == B3.text && B3.text == C3.text) && A3.text != ""){
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((A1.text == B2.text && B2.text == C3.text) && A1.text != ""){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if((A3.text == B2.text && B2.text == C1.text) && A3.text != ""){
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_btn2))
            play = false
        }

        if(currentTurn == 9 && play){
            A1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            A2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            A3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            B1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            B2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            B3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            C1.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            C2.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
            C3.setBackgroundColor(ContextCompat.getColor(this, R.color.draw_btn))
        }



    }

}