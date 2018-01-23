package com.study.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.study.R;

/**
 * Created by wenzhihao on 2017/8/18.
 */

public class ScrollViewActivity extends Activity {
    private TextView textView;
    private ScrollView scrollView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);
        textView=(TextView)findViewById(R.id.textView);
        scrollView=(ScrollView)findViewById(R.id.scrollView);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append("呵呵 * " + i + "\n");
        }
        textView.setText(sb.toString());
    }

    public void onClickUp(View view){
        scrollView.fullScroll(ScrollView.FOCUS_UP);
    }
    public void onClickDown(View view){
        scrollView.fullScroll(ScrollView.FOCUS_DOWN);
    }
}
