package xl.qinhu.com.mytest.Application

import android.app.Application
import android.support.multidex.MultiDex


/**
 * Created by xl100 on 2018/5/7.
 */

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
    }
}
