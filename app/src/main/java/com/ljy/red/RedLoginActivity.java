package com.ljy.red;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ljy.red.Server.WebService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class RedLoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private TextView textView;
    private Spinner spinner;
    private List<String> list;
    private ArrayAdapter<String> adapter;
    Connection con = null;

    private String info;
    private TextView infotv;
    private static Handler handler = new Handler();
    private EditText username;
    private EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_login);

        username= (EditText) findViewById(R.id.username);
        userpass= (EditText) findViewById(R.id.userpass);

        //登录按钮
        Button red_login_btn= (Button) this.findViewById(R.id.red_login_btn);
        red_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RedLoginActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
//                new Thread(new MyThread()).start();
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

    public class MyThread implements Runnable {
        @Override
        public void run() {
            info = WebService.executeHttpGet("LoginServlet",username.getText().toString(), userpass.getText().toString());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    System.out.println(info);
                    String[] arr=info.split("\n");
                    if(arr[1]=="登陆成功"){
                        Intent intent = new Intent(RedLoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }else if(arr[1]=="账号或密码不正确"){

                    }

//                    infotv.setText(info);
                }
            });
        }
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
