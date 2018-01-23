package com.study.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import com.study.R;

/**
 * Created by wenzhihao on 2017/8/18.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //按钮指定点击
    public void onClick(View view){
        int id = view.getId() ;
        if (id == R.id.old_version){
            Log.d("MainActivity","测试按钮点击");
        }
        startActivity(new Intent(this,SimpleActivity.class));
    }

    public void onClickScrollAc(View view){
        startActivity(new Intent(this,ScrollViewActivity.class));
    }

    public void onClickListview(View view){
        startActivity(new Intent(this,ListViewActivity.class));
    }
}
