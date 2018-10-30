package com.ljy.red;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ljy.red.fragment.MeFrament;

public class MeActivity extends AppCompatActivity {
    int num;
    private TextView et_nickname;
    private ImageView gender_btn;
    private TextView gender_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_info);
        //获取到Intent对象
        Intent intent = getIntent();
        //取出key对应的value值
        et_nickname = (TextView) findViewById(R.id.nickname);
        String nickname = intent.getStringExtra("nickname");
        et_nickname.setText(nickname);

        ImageView iv_back = (ImageView) findViewById(R.id.back);
        ImageView iv__details_name = (ImageView) findViewById(R.id.details_name);
        iv_back.setOnClickListener(listener_back);
        iv__details_name.setOnClickListener(listener_details_name);

        gender_btn = (ImageView) findViewById(R.id.details_gender);
        gender_text = (TextView) findViewById(R.id.gender);
        gender_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                gender_dialog();
            }
        });
    }

    protected void gender_dialog() {
        //生成对话框
        new AlertDialog.Builder(this)
                .setTitle("请选择性别")    //设置标题
                .setSingleChoiceItems(new String[]{"男", "女"}, 0,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int checkId) {
                                if(checkId == 0){
                                    num=0;
                                }
                                else if(checkId == 1)
                                    num=1;
                            }
                        })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(num==1){
                            gender_text.setText("女");
                        }
                        else{
                            gender_text.setText("男");
                        }
                    }
                })

                .show();
    }

    ImageView.OnClickListener listener_back = new ImageView.OnClickListener(){
        public void onClick(View v) {
      //      Intent intent = new Intent(MeActivity.this,MeFrament.class);
        //    startActivity(intent);
//            MeActivity.this.finish();
        }
    };

    ImageView.OnClickListener listener_details_name = new ImageView.OnClickListener(){
        public  void onClick(View v) {
            Intent intent = new Intent(MeActivity.this,EditNickNameActivity.class);
            startActivity(intent);
            MeActivity.this.finish();
        }
    };
}
