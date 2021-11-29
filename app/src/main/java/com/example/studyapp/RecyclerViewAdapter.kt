package com.example.studyapp

import android.app.AlertDialog
import android.app.AlertDialog.Builder
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_cell.view.*

class RecyclerViewAdapter(private val Contents: ArrayList<Content>,val context :Context) :
    RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleCard: TextView = itemView.findViewById(R.id.tvTopic)
        val descriptionCard: TextView = itemView.findViewById(R.id.tvDescription)
        val view = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_cell, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val content = Contents[position]
        holder.titleCard.text = content.topic
        holder.titleCard.setOnClickListener { showAlert(content.lesson) }
        holder.descriptionCard.text = content.description
        holder.descriptionCard.setOnClickListener { showAlert(content.lesson) }
        holder.view.setOnClickListener {
            showAlert(content.lesson)
        }
    }

    override fun getItemCount(): Int {
        return Contents.size
    }

    fun showAlert(text: String) {
        val dialogBuilder = AlertDialog.Builder(context)
        dialogBuilder.setMessage(text)
            .setCancelable(false)
            .setPositiveButton("Ok", DialogInterface.OnClickListener {
                    dia, id -> dia.cancel()
            })


        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("Lesson")
        // show alert dialog
        alert.show()
    }
}

