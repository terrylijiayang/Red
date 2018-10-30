package com.ljy.red;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EditNickNameActivity extends AppCompatActivity {

    private EditText nickname;
    private TextView finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_nick_name);
        nickname =(EditText) findViewById(R.id.edit_nickname);
        finish = (TextView) findViewById(R.id.finish);
        ImageView iv_back = (ImageView) findViewById(R.id.back);

        iv_back.setOnClickListener(listener_back);

        //点击完成开始进行数据传递
        finish.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                passDate();
            }
        });
    }
    //传递数据
    public void passDate(){
        //创建Intent对象
        Intent intent = new Intent(EditNickNameActivity.this,MeActivity.class);
        //将数据存入Intent对象
        intent.putExtra("nickname",nickname.getText().toString().trim());
        startActivity(intent);
    }

    ImageView.OnClickListener listener_back = new ImageView.OnClickListener(){
        public void onClick(View v) {
          /*  Intent intent = new Intent(EditNickNameActivity.this, MeActivity.class);
            startActivity(intent);
            EditNickNameActivity.this.finish();*/
           /* Intent intent = new Intent(getActivity(), mresActivity.class);
            startActivity(intent);*/

        }
    };
}
