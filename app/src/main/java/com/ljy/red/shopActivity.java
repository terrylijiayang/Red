package com.ljy.red;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

import com.ljy.red.fragment.recFragment;

class ShopActivity extends FragmentActivity implements View.OnClickListener {
    private Button rec;
    private Button beauty;
    private Button care;
    private Button preson;
    private Button bady;
    private Button more;
    private Button mrec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopindex);
        //创建监听器
        setMain();

        preson = (Button) findViewById(R.id.person);
        beauty = (Button) findViewById(R.id.beauty);
        care = (Button) findViewById(R.id.care);
        bady = (Button) findViewById(R.id.bady);
        rec = (Button) findViewById(R.id.rec);
        more= (Button) findViewById(R.id.more);
      /*  mrec= (Button) findViewById(R.id.mrec);*/
        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                getSupportFragmentManager().beginTransaction().replace(R.id.main_body,new recFragment()).commit();
                rec.setTextColor(Color.parseColor("#666666"));
                preson.setTextColor(Color.parseColor("#DCDCDC"));
                care.setTextColor(Color.parseColor("#DCDCDC"));
                bady.setTextColor(Color.parseColor("#DCDCDC"));
                more.setTextColor(Color.parseColor("#DCDCDC"));
                beauty.setTextColor(Color.parseColor("#DCDCDC"));
            }
        });



    }



    /*去除搜索框的下划线*/
    private void removeUnderLine() {
        SearchView searchView = (SearchView) findViewById(R.id.sv_cus);
        View viewById = searchView.findViewById(android.support.v7.appcompat.R.id.search_plate);
        if (viewById != null) {
            viewById.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    private void setMain() {
        this.getSupportFragmentManager().beginTransaction().add(R.id.main_body,new recFragment()).commit();
    }


    @Override
    public void onClick(View view) {

    }
}
