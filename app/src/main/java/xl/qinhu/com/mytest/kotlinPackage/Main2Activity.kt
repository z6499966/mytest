package xl.qinhu.com.mytest.kotlinPackage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import xl.qinhu.com.mytest.R


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.jumpBtn)
        button.setOnClickListener{v: View? -> jump() }

    }

    fun jump(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.activityanim,R.anim.activityanim)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.activityanim,R.anim.activityanim)
    }

}
