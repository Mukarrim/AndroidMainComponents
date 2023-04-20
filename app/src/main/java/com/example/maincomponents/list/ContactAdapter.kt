package com.example.maincomponents.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.maincomponents.R

import com.example.maincomponents.data.ContactData
import org.w3c.dom.Text

class ContactAdapter(private val context: Context,
                     private val contactList:List<ContactData>
                     ):BaseAdapter(){
    override fun getCount(): Int {
        return contactList.size
    }

    override fun getItem(pos: Int): Any {
        return contactList[pos]
    }

    override fun getItemId(pos: Int): Long {
        return pos.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val convertView = LayoutInflater.from(context).inflate(R.layout.item_contacts,p2, false)
        tvSno=convertView.findViewById(R.id.tv_index)
        tvName=convertView.findViewById(R.id.tv_name)
        tvPhNum=convertView.findViewById(R.id.tv_number)

        val contactItem=contactList[p0]


        tvName.text=if(contactItem.name.isEmpty()){ "No Name Found" } else{ contactList[p0].name }
        tvPhNum.text=if(contactItem.phoneNumber.isEmpty()){ "No Num Found" } else{ contactList[p0].phoneNumber }


        //tvPhNum.text=(contactItem.phoneNumber.isEmpty())?"No Num Found"
        tvSno.text=(p0+1).toString()

        return convertView


    }

   private lateinit var tvSno:TextView
   private lateinit var tvName:TextView
    private lateinit var tvPhNum:TextView


}