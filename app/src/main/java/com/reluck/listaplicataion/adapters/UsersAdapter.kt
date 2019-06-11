package com.reluck.listaplicataion.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.reluck.listaplicataion.R
import com.reluck.listaplicataion.classes.Game
import com.reluck.listaplicataion.pages.GameDetail

class UsersAdapter(val users: List<Game>): RecyclerView.Adapter<UsersAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        return ViewHolder(view, parent.context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.gameName.text = users[position].nomeJogo
        holder.gameCategory.text = users[position].categoria
        holder.imageGame.setImageResource(users[position].imgJogo)

        holder.itemView.setOnClickListener{
            println("position $position")
            val intent = Intent(holder.itemView.context, GameDetail::class.java)
            intent.putExtra("position", position)
            holder.itemView.context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int = users.size

    class ViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val gameName: TextView = itemView.findViewById(R.id.firstName)
        val gameCategory: TextView = itemView.findViewById(R.id.textCategoria)
        val imageGame: ImageView = itemView.findViewById(R.id.imgGame)



        override fun onClick(v: View?) {
            println("Click")
            val intent = Intent(itemView.context, GameDetail::class.java)
            itemView.context.startActivity(intent)
        }


    }
}