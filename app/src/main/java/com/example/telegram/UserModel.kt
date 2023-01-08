package com.example.telegram

class UserModel {
    lateinit var name: String
    lateinit var msg : String
    lateinit var day : String
    var imgs : Int=0

    constructor(name:String,msg:String,day:String,imgs:Int){
        this.name = name
        this.msg = msg
        this.day = day
        this.imgs = imgs
    }
}