package xl.qinhu.com.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.owen.tvrecyclerview.widget.SimpleOnItemListener;
import com.owen.tvrecyclerview.widget.TvRecyclerView;

import java.util.ArrayList;
import java.util.List;

import xl.qinhu.com.mytest.focus.FocusBorder;
import xl.qinhu.com.mytest.focus.GridAdapter;
import xl.qinhu.com.mytest.focus.ItemDatas;

public class Main4Activity extends AppCompatActivity {

    private static final String TAG = "Main4Activity";
    protected FocusBorder mFocusBorder;
    private TvRecyclerView mRecyclerView;
    GridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFocusBorder = new FocusBorder.Builder().asDrawable().borderResId(R.mipmap.title_onfocus).build(this);
        /*mFocusBorder = new FocusBorder.Builder()
                .asColor()
                .borderColor(getResources().getColor(R.color.colorAccent))
                .borderWidth(TypedValue.COMPLEX_UNIT_DIP, 2)
                .shadowColor(getResources().getColor(R.color.colorAccent))
                .shadowWidth(TypedValue.COMPLEX_UNIT_DIP, 18)
                .build(this);*/
        setContentView(R.layout.activity_main4);
        mRecyclerView = findViewById(R.id.list);
        setListener();
        mRecyclerView.setSpacingWithMargins(10, 10);

        mAdapter = new GridAdapter(this);
        mAdapter.setDatas(ItemDatas.getDatas(60));

    }

    private void setListener() {

        mRecyclerView.setOnItemListener(new SimpleOnItemListener() {

            @Override
            public void onItemSelected(TvRecyclerView parent, View itemView, int position) {
                onMoveFocusBorder(itemView, 1.1f, 0);
            }

            @Override
            public void onItemClick(TvRecyclerView parent, View itemView, int position) {
                //showToast("onItemClick::" + position);
            }
        });

        mRecyclerView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(mRecyclerView.hasFocus() && !hasFocus)
                    return;
                mFocusBorder.setVisible(hasFocus);
                Log.e(TAG, "onItemSelected: hasFocus = "+hasFocus);
            }
        });
    }

    protected void onMoveFocusBorder(View focusedView, float scale) {
        if (null != mFocusBorder) {
            mFocusBorder.onFocus(focusedView, FocusBorder.OptionsFactory.get(scale, scale));
        }
    }

    protected void onMoveFocusBorder(View focusedView, float scale, float roundRadius) {
        if (null != mFocusBorder) {
            mFocusBorder.onFocus(focusedView, FocusBorder.OptionsFactory.get(scale, scale, roundRadius));
        }
    }

}
