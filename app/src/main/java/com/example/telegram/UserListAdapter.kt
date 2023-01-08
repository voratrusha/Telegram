package com.example.telegram

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class UserListAdapter(list: ArrayList<UserModel>) : RecyclerView.Adapter<UserListAdapter.UserListHolder>() {

    lateinit var context:Context
    var list = list


    class UserListHolder(itemView: View) : ViewHolder(itemView){
        var msgid = itemView.findViewById<TextView>(R.id.msg)
        var nameid = itemView.findViewById<TextView>(R.id.name)
        var dayid = itemView.findViewById<TextView>(R.id.day)
        var imgid = itemView.findViewById<CircleImageView>(R.id.profileimage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListHolder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return UserListHolder(view)
    }

    override fun onBindViewHolder(holder: UserListHolder, position: Int) {
        holder.nameid.text = list.get(position).name
        holder.dayid.text = list.get(position).day
        holder.msgid.text = list.get(position).msg
        Glide.with(context).load(list.get(position).imgs).into(holder.imgid)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}