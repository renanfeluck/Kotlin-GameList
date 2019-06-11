package com.reluck.listaplicataion.pages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.reluck.listaplicataion.mock.GamesMock


class GameDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.reluck.listaplicataion.R.layout.activity_game_detail)

        var intent = intent
        val position = intent.getIntExtra("position", 999)

        println("position in the GameDetail ${GamesMock.games[position].nomeJogo}")
    }
}
