package com.reluck.listaplicataion.pages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.reluck.listaplicataion.mock.GamesMock
import kotlinx.android.synthetic.main.activity_game_detail.*


class GameDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.reluck.listaplicataion.R.layout.activity_game_detail)

        var intent = intent
        val position = intent.getIntExtra("position", 999)

        println("position in the GameDetail ${GamesMock.games[position].nomeJogo}")

        initiateValues(position)
    }

    private fun initiateValues(position: Int){
        imgGame.setImageResource(GamesMock.games[position].imgJogo)
        textTitle.text = GamesMock.games[position].nomeJogo
        textDescription.text = GamesMock.games[position].description
        textDesigners.text = Html.fromHtml("<b> Designers:  </b>" + GamesMock.games[position].designers, Html.FROM_HTML_MODE_LEGACY)
        textDevelopers.text = Html.fromHtml("<b> Developers:  </b>" + GamesMock.games[position].developers, Html.FROM_HTML_MODE_LEGACY)
        textGenres.text = Html.fromHtml("<b> Genres:  </b>" + GamesMock.games[position].genres, Html.FROM_HTML_MODE_LEGACY)
        textPublishers.text = Html.fromHtml("<b> Publishers:  </b>" + GamesMock.games[position].publishers, Html.FROM_HTML_MODE_LEGACY)
    }
}
