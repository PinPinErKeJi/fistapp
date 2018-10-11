package com.ymt.fistandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class sexActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sex_activity);
        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.textView);
        //新建一个SimpleAdapter适配器
    //    SimpleAdapter simpleAdapter=new SimpleAdapter(this,getData() ,R.layout.item_layout,from,to);

        //定义列表项信息内容

    }
    //定义列表项信息内容
    public List<Map<String,?>>getData(){
        return null;
    }
}
