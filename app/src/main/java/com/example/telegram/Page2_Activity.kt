package com.example.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram.databinding.ActivityPage2Binding
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
import com.example.telegram.R.drawable.*

class Page2_Activity : AppCompatActivity(){

    var list = ArrayList<UserModel>()
    var profileList = arrayOf(proffpic, profile1, prof1, prof2, profile2, proffpic3, proffpic2, profile3,
                      prof3, prof4, prof5, prof6 )
    var nameList = arrayOf("Me","Sachi", "Ravi","Priya","Fenil","Shreya","Krishna","Aashi","Ayaan","Kevin","Janvi","Monali")
    var msgList = arrayOf("I'm busy!","\uD83D\uDCF2\uD83D\uDE33Good morning","how are you?","lets meet soon\uD83D\uDCAB","\uD83D\uDCF2\uD83D\uDE33hii","send me files","heyy\uD83D\uDCAB","send photos","call me asap","talk to you tomorrow\uD83D\uDCAB","good night","heyy\uD83D\uDCAB")
    var dayList = arrayOf("Today","Sun","Sat","Fri","Thur","Mon","22/12/22","20/12/22","15/12/22","7/12/22","30/11/22","23/11/22")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        for (i in 0..profileList.size-1){
            var data = UserModel(nameList.get(i),msgList.get(i),dayList.get(i),profileList.get(i))
            list.add(data)
        }
        binding.recycleview.layoutManager = LinearLayoutManager(this)
        binding.recycleview.adapter = UserListAdapter(list)

        binding.navimage.setOnClickListener{
              binding.drawer.openDrawer(Gravity.LEFT)
        }
        binding.navview.setNavigationItemSelectedListener(object : OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId){
                    R.id.call->{
                        Toast.makeText(applicationContext,"Call", Toast.LENGTH_SHORT).show()
                    }
                    R.id.contact->{
                        Toast.makeText(applicationContext,"Contact", Toast.LENGTH_SHORT).show()
                    }
                    R.id.group->{
                        Toast.makeText(applicationContext,"New Group", Toast.LENGTH_SHORT).show()
                    }
                    R.id.savemsg->{
                        Toast.makeText(applicationContext,"Saved Messages", Toast.LENGTH_SHORT).show()
                    }
                    R.id.nearby->{
                        Toast.makeText(applicationContext,"People Nearby", Toast.LENGTH_SHORT).show()
                    }
                    R.id.setting->{
                        Toast.makeText(applicationContext,"Settings", Toast.LENGTH_SHORT).show()
                    }
                    R.id.invitefrnd->{
                        Toast.makeText(applicationContext,"Invite Friends", Toast.LENGTH_SHORT).show()
                    }
                    R.id.feature->{
                        Toast.makeText(applicationContext,"Telegram Features", Toast.LENGTH_SHORT).show()
                    }
                }
                binding.drawer.closeDrawer(Gravity.LEFT)
                return false
            }

        })
    }
}