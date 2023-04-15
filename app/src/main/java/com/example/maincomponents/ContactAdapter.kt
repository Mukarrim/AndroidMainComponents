package com.example.maincomponents

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ContactAdapter(context: Context, contacts: List<MainActivity.Contact>) :
    ArrayAdapter<MainActivity.Contact>(context, 0, contacts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View{
        var view = convertView
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_contacts, parent, false)
        }

        val contact = getItem(position)

        val contactName = view?.findViewById<TextView>(R.id.itemName)
        contactName?.text = contact?.name
        val contactPhone = view?.findViewById<TextView>(R.id.itemPhone)
        contactPhone?.text = contact?.phoneNumber

        return view!!
    }
}