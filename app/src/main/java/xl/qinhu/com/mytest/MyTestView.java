package xl.qinhu.com.mytest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/**
 * Created by xl100 on 2018/5/15.
 */

public class MyTestView extends View {

    private VelocityTracker obtain;
    private Context context;

    public MyTestView(Context context) {
        this(context,null);
    }

    public MyTestView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyTestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        /*if (obtain == null)
            obtain = VelocityTracker.obtain();
        obtain.addMovement(event);
        obtain.computeCurrentVelocity(1000);
        float xVelocity = obtain.getXVelocity();
        float yVelocity = obtain.getYVelocity();
        Log.e("view", "xVelocity =" + xVelocity);
        Log.e("view", "yVelocity =" + yVelocity);*/
        GestureDetector mGestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {

            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {

            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                return false;
            }
        });
        mGestureDetector.setIsLongpressEnabled(false);
        return mGestureDetector.onTouchEvent(event);

    }
}
