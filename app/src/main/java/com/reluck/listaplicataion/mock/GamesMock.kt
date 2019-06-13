package com.reluck.listaplicataion.mock

import com.reluck.listaplicataion.R
import com.reluck.listaplicataion.classes.Game

class GamesMock {

    companion object  mock {
        val game1 = Game(
            "God of War",
            "Aventura",
            R.drawable.img_godofwar,
            "God of War is a mythology-based action-adventure video game franchise. Created by David Jaffe at Sony's Santa Monica Studio, the series debuted in 2005 on the PlayStation 2 video game console, and has become a flagship title for the PlayStation brand, consisting of eight games across multiple platforms",
            "David Jaffe, Todd Papy, Cory Barlog, Mark Simon, Jo Wright, Tobin Russell, Scott Rogers",
            "Javaground, Ready at Dawn, Daybreak Game Company, SIE Santa Monica Studio",
            "Action-adventure game, Hack and slash",
            "Capcom, Sony Pictures, Sony Interactive Entertainment, Sony Interactive Entertainment Europe"
        )

        var games = listOf<Game>(game1, game1, game1, game1, game1, game1, game1)
    }
}

