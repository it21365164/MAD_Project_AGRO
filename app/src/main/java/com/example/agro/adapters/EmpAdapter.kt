package com.example.databaseconnectivityusingfirebase.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agro.R
import com.example.agro.models.EmployeeModel


class EmpAdapter (private val empList:ArrayList<EmployeeModel>):
    RecyclerView.Adapter<EmpAdapter.ViewHolder>(){

    /////retrive to editor mode
    private lateinit var mListner : onItemClickLisner

    interface onItemClickLisner{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListner(clickListner : onItemClickLisner) {
        mListner = clickListner
    }

///////sent and get data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_emp_list_iteam,parent,false)
        return ViewHolder(itemView,mListner)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentEmp = empList[position]
        holder.tvEmpName.text = currentEmp.name
    }

    override fun getItemCount(): Int {
       return empList.size
    }


    class ViewHolder(itemView:View,clickLisner: onItemClickLisner) : RecyclerView.ViewHolder(itemView) {
        val tvEmpName :TextView = itemView.findViewById(R.id.tvEmpName)

          init {
              itemView.setOnClickListener{
                  clickLisner.onItemClick(adapterPosition)
              }
          }


    }




}