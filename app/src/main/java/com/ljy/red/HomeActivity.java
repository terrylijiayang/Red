package com.ljy.red;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.ljy.red.fragment.MainFragment;
import com.ljy.red.fragment.MeFrament;
import com.ljy.red.fragment.MessageFragment;
import com.ljy.red.fragment.ShopFragment;

/**
 * Created by 佳阳 on 2018/10/9.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    protected LinearLayout menu_main;//首页
    protected LinearLayout menu_shop;//商城
    protected LinearLayout menu_message;//消息
    protected LinearLayout menu_me;//我的
    protected MainFragment mainFragment = new MainFragment();
    protected ShopFragment shopFragment = new ShopFragment();
    protected MessageFragment messageFragment = new MessageFragment();
    protected MeFrament meFrament = new MeFrament();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_content,mainFragment)
               /* .add(R.id.container_content,mainFragment)
                .add(R.id.container_content,shopFragment)
                .hide(shopFragment)
                .add(R.id.container_content,messageFragment)
                .hide(messageFragment)
                .add(R.id.container_content,meFrament)
                .hide(meFrament)*/
                .commit();
    }

    public  void init(){
        menu_main= (LinearLayout) this.findViewById(R.id.menu_main);
        menu_shop= (LinearLayout) this.findViewById(R.id.menu_shop);
        menu_message= (LinearLayout) this.findViewById(R.id.menu_message);
        menu_me= (LinearLayout) this.findViewById(R.id.menu_me);

        menu_main.setOnClickListener(this);
        menu_shop.setOnClickListener(this);
        menu_message.setOnClickListener(this);
        menu_me.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_main: //首页
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,mainFragment)
                        .commit();
                break;
            case R.id.menu_shop: //商城
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,shopFragment)
                        .commit();
                break;
            case R.id.menu_message: //消息
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,messageFragment)
                        .commit();
                break;
            case R.id.menu_me: //我的
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,meFrament)
                        .commit();
                break;
        }
    }
}
