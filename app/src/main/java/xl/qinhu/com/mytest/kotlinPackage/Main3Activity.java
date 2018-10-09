package xl.qinhu.com.mytest.kotlinPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import xl.qinhu.com.mytest.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    /*@Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean consume = false;
        if (onInterceptTouchEvent(event)) {
            consume = onTouchEvent(event);
        } else {
            consume = child.dispatchTouchEvent(event);
        }
        return consume;
    }*/
}
