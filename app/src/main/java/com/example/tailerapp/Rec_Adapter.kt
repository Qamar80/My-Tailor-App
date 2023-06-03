package com.example.tailerapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Rec_Adapter(private val txtlist:ArrayList<rec_data_class>):RecyclerView.Adapter<Rec_Adapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView=LayoutInflater.from(parent.context).inflate(R.layout.rec_item,parent,false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

  val currentItem=txtlist[position]
        holder.txtab.text=currentItem.txt
        holder.editText.setText(currentItem.edit)


    }

    override fun getItemCount(): Int {
  return txtlist.size
    }


    class  MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
      var txtab: TextView = itemView.findViewById(R.id.item_txt)
        var editText = itemView.findViewById<EditText>(R.id.length)
    }

}