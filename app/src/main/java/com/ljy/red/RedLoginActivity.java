package com.ljy.red;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class RedLoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private TextView textView;
    private Spinner spinner;
    private List<String> list;
    private ArrayAdapter<String> adapter;
    Connection con = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_login);

        //登录按钮
        Button red_login_btn= (Button) this.findViewById(R.id.red_login_btn);
        red_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RedLoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        spinner = (Spinner) findViewById(R.id.spinner1);
        //设置数据源
        list = new ArrayList<String>();
        list.add("023");
        list.add("086");
        list.add("045");
        //新建ArrayAdapter（数组适配器）
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        //adpater设置下拉样式
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner加载适配器
        spinner.setAdapter(adapter);
        //spinner设置监听器
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String num = adapter.getItem(position);
//        String num1 = list.get(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
