package com.example.maincomponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contacts: List<MainActivity.Contact>):
RecyclerView.Adapter<ContactsAdapter.ViewHolder>(){
    class ViewHolder(private var view: View):RecyclerView.ViewHolder(view)  {


        fun handleData(item: MainActivity.Contact?) {
            view.findViewById<TextView>(R.id.contact_fname).text = item?.name
            view.findViewById<TextView>(R.id.contact_mobNumber).text = item?.phoneNumber
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactsAdapter.ViewHolder(view)
    }
    override fun getItemCount(): Int = contacts?.size ?: 0



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.handleData(contacts?.get(position))
    }

}
