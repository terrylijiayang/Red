package com.ljy.red;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

import com.ljy.red.R;
import com.ljy.red.fragment.McareFragment;
import com.ljy.red.fragment.MresFragment;

public class mresActivity extends FragmentActivity implements View.OnClickListener{


    private Button more;
    private Button mrec;
    private Button mcare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);

        mrec = (Button) findViewById(R.id.mrec);
        mcare = (Button) findViewById(R.id.mcare);
        setMain();





        mcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                getSupportFragmentManager().beginTransaction().replace(R.id.rtbody,new McareFragment()).commit();
                mcare.setBackgroundColor(Color.rgb(239, 236, 236));
                mrec.setBackgroundColor(Color.WHITE);
            }
        });

        mrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                getSupportFragmentManager().beginTransaction().replace(R.id.rtbody,new MresFragment()).commit();
                mrec.setBackgroundColor(Color.rgb(239, 236, 236));
                mcare.setBackgroundColor(Color.WHITE);
            }
        });
    }
    @Override
    public void onClick(View view) {


    }

    private void setMain() {
        this.getSupportFragmentManager().beginTransaction().add(R.id.rtbody,new MresFragment()).commit();
    }


}
