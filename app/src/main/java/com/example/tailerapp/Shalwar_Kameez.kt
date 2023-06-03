package com.example.tailerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Shalwar_Kameez : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList:ArrayList<rec_data_class>
    lateinit var imageId:Array<Int>
    lateinit var heading1:Array<String>
    lateinit var heading2:Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shalwar_kameez)

        heading2= arrayOf(
    "Length","Rrm","Shoulder","Collar","Chest","Lap","Pant","Pancha"
        )
        heading1= arrayOf(
          "","","","","","","",""
        )
        newRecyclerView=findViewById(R.id.recylerview)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<rec_data_class>()
        getUserData()
    }

    private fun getUserData(){
        for (i in heading1.indices){
            val news =rec_data_class(heading2[i],heading1[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter=Rec_Adapter(newArrayList)
    }
}