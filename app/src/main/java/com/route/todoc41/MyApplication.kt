package com.route.todoc41

import android.app.Application
import com.route.todoc41.database.MyDatabase

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        MyDatabase.init(this)
        var x ="860884072354000"
        var x2="860884072369016"
        var sn="A7UHVB4807000735"
    }
}