package com.ljy.red;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ljy.red.fragment.MeFrament;

/**
 * Created by 佳阳 on 2018/10/28.
 */

public class InstallActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.install);
        ImageView iv_back = (ImageView) findViewById(R.id.back);
        iv_back.setOnClickListener(listener_back);
    }
    ImageView.OnClickListener listener_back = new ImageView.OnClickListener(){
        public void onClick(View v) {
            /*Intent intent = new Intent(InstallActivity.this, MeFrament.class);
            startActivity(intent);*/
            InstallActivity.this.finish();
        }
    };
}
