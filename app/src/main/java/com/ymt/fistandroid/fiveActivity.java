package com.ymt.fistandroid;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fiveActivity extends AppCompatActivity {
    private ListView listView;
    private String[]  date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_activity);
        date=getResources().getStringArray(R.array.privince);
        listView= findViewById(R.id.listView);
        //arrayAdapter的使用
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,date);
        //第一个this表示当前环境控制
        //第二个参数：自己放置的一个布局，里面有textView，这个参数表明我们数组中每一条数据的布局是什么
        //第三个参数要显示的数据
        //为ListView设置适配器
        listView.setAdapter(arrayAdapter);
    }
    public void showProvince(View v){
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,date);
        //第一个this表示当前环境控制
        //第二个参数：自己放置的一个布局，里面有textView，这个参数表明我们数组中每一条数据的布局是什么
        //第三个参数要显示的数据
        //为ListView设置适配器
        listView.setAdapter(arrayAdapter);
    }
}
