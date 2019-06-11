package com.reluck.listaplicataion.mock

import com.reluck.listaplicataion.R
import com.reluck.listaplicataion.classes.Game

class GamesMock {

    val game1 = Game(
        "God of War",
        "Aventura",
        R.drawable.img_godofwar
    )


    companion object  mock {
        val game1 = Game(
            "God of War",
            "Aventura",
            R.drawable.img_godofwar
        )

        var games = listOf<Game>(game1, game1, game1, game1, game1, game1, game1)
    }
}

