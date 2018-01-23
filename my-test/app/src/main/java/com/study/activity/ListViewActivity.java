package com.study.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.study.R;

import java.util.LinkedList;

/**
 * Created by wenzhihao on 2017/8/18.
 */

public class ListViewActivity extends Activity {
    private ListView listView;
    private ListView listView1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=(ListView)findViewById(R.id.listView);
        listView1=(ListView)findViewById(R.id.listView1);

        listView.setAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_listview_item, new String[]{"你好","美女"}));

        LinkedList<Girl> mData=new LinkedList<>();
        mData.add(new Girl("美女","ic_launcher"));
        listView1.setAdapter(new GirlAdapter(mData,ListViewActivity.this));

    }

    class Girl{
        String name;
        String img;
        public Girl(String n,String i){
            name=n;
            img=i;
        }
    }

    class GirlAdapter extends BaseAdapter {

        private LinkedList<Girl> mData;
        private Context mContext;

        public GirlAdapter(LinkedList<Girl> mData, Context mContext) {
            this.mData = mData;
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.activity_listview_item1,parent,false);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            textView.setText(mData.get(position).name);
            imageView.setImageResource(getResources().getIdentifier(mData.get(position).img, "mipmap", mContext.getPackageName()));
            return convertView;
        }
    }
}
