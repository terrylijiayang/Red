package com.ljy.red;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ljy.red.fragment.WelClassificationFragment;
import com.ljy.red.fragment.WelHomeFragment;
import com.ljy.red.fragment.WelSalesFragment;
import com.ljy.red.fragment.WelSeedingFragment;

public class WelfareMainActivity extends AppCompatActivity implements View.OnClickListener {

    protected LinearLayout menu_home;
    protected LinearLayout menu_seeding;
    protected LinearLayout menu_sales;
    protected LinearLayout menu_classification;
    protected WelHomeFragment homeFragment = new WelHomeFragment();
    protected WelSeedingFragment seedingFragment = new WelSeedingFragment();
    protected WelSalesFragment salesFragment = new WelSalesFragment();
    protected WelClassificationFragment classificationFragment =new WelClassificationFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare_main);
        init();
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content,homeFragment)
                .add(R.id.container_content,seedingFragment)
                .hide(seedingFragment)
                .add(R.id.container_content,salesFragment)
                .hide(salesFragment)
                .add(R.id.container_content,classificationFragment)
                .hide(classificationFragment)
                .commit();
    }
    public void init(){
        menu_home =(LinearLayout) this.findViewById(R.id.menu_home);
        menu_seeding =(LinearLayout) this.findViewById(R.id.menu_seeding);
        menu_sales =(LinearLayout) this.findViewById(R.id.menu_sales);
        menu_classification =(LinearLayout) this.findViewById(R.id.menu_classification);

        menu_home.setOnClickListener(this);
        menu_seeding.setOnClickListener(this);
        menu_sales.setOnClickListener(this);
        menu_classification.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_home:   //首页
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(homeFragment)
                        .hide(seedingFragment)
                        .hide(salesFragment)
                        .hide(classificationFragment)
                        .commit();
                break;
            case R.id.menu_seeding:   //种草
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(seedingFragment)
                        .hide(homeFragment)
                        .hide(salesFragment)
                        .hide(classificationFragment)
                        .commit();
                break;
            case R.id.menu_sales:   //特惠
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(salesFragment)
                        .hide(seedingFragment)
                        .hide(homeFragment)
                        .hide(classificationFragment)
                        .commit();
                break;
            case R.id.menu_classification:   //分类
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(seedingFragment)
                        .hide(salesFragment)
                        .hide(homeFragment)
                        .show(classificationFragment)
                        .commit();
                break;
        }
    }
}
