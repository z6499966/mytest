package xl.qinhu.com.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

import com.upyun.upplayer.widget.UpVideoView;

import xl.qinhu.com.mytest.util.Dp2Px;

public class Main5Activity extends AppCompatActivity {

    private static final String TAG = "Main5Activity";
    String path = "rtmp://live.hkstv.hk.lxdns.com/live/hks";
    private UpVideoView upVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        /*upVideoView = (UpVideoView) findViewById(R.id.uvv_vido);
        //设置播放地址
        upVideoView.setVideoPath(path);

        //开始播放
        upVideoView.start();*/
        //以1280*720为基准：
        //获取手机屏幕的宽和高
        int widthPixels = getResources().getDisplayMetrics().widthPixels;
        int heightPixels = getResources().getDisplayMetrics().heightPixels;
        //density
        float density = getResources().getDisplayMetrics().density;
        //dpi
        int densityDpi = getResources().getDisplayMetrics().densityDpi;
        //1dp = 多少px
        int px = Dp2Px.dp2px(this, 1);
        //1px  = 多少dp
        int dp = Dp2Px.px2dp(this, 1);

        Log.e(TAG, "widthPixels = " + widthPixels);
        Log.e(TAG, "heightPixels = " + heightPixels);
        Log.e(TAG, "density = " + density);
        Log.e(TAG, "densityDpi = " + densityDpi);
        Log.e(TAG, "px = " + px);
        Log.e(TAG, "dp = " + dp);
       /* DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
// 屏幕宽度（像素）
        int width = metric.widthPixels;
// 屏幕高度（像素）
        int height = metric.heightPixels;
// 屏幕密度（1.0 / 1.5 / 2.0）
        float density = metric.density;
// 屏幕密度DPI（160 / 240 / 320）
        int densityDpi = metric.densityDpi;
        String info = "机顶盒型号: " + android.os.Build.MODEL + ",\nSDK版本:"
                + android.os.Build.VERSION.SDK + ",\n系统版本:"
                + android.os.Build.VERSION.RELEASE + "\n屏幕宽度（像素）: " + width + "\n屏幕高度（像素）: " + height + "\n屏幕密度:  " + density + "\n屏幕密度DPI: " + densityDpi;
        Log.d("System INFO", info);*/
    }

    /*@Override
    protected void onResume() {
        super.onResume();

        // 重新开始播放器
        upVideoView.resume();
        upVideoView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        upVideoView.pause();
    }

    public void toggle(View view) {

        if (upVideoView.isPlaying()) {

            //暂停播放
            upVideoView.pause();

        } else {

            //开始播放
            upVideoView.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        upVideoView.release(true);
    }*/

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            View view = findViewById(android.R.id.content);
            Log.e(TAG, "width = " + view.getWidth());
            Log.e(TAG, "height = " + view.getHeight());
        }
    }
}
