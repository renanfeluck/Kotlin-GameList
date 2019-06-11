package com.reluck.listaplicataion.pages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.reluck.listaplicataion.R
import com.reluck.listaplicataion.adapters.UsersAdapter
import com.reluck.listaplicataion.mock.GamesMock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users: ArrayList<String> = ArrayList()


        var games = GamesMock.games

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UsersAdapter(games)
    }

}
