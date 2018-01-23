package com.study.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import com.study.R;

/**
 * Created by wenzhihao on 2017/8/18.
 */

public class SimpleActivity extends Activity {
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        textView=(TextView)findViewById(R.id.textView);
        textView.setText("欢迎来到新的SimpleActivity");
    }
}
