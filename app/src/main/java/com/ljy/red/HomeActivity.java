package com.ljy.red;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ljy.red.fragment.MainFragment;
import com.ljy.red.fragment.MeFrament;
import com.ljy.red.fragment.MessageFragment;
import com.ljy.red.fragment.ShopFragment;

import org.w3c.dom.Text;

/**
 * Created by 佳阳 on 2018/10/9.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    protected LinearLayout menu_main;//首页
    private TextView txt_main;
    protected LinearLayout menu_shop;//商城
    private TextView txt_shop;
    protected LinearLayout menu_message;//消息
    private TextView txt_message;
    protected LinearLayout menu_me;//我的
    private TextView txt_me;
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
                .commit();
    }

    public  void init(){
        //页面切换设置
        menu_main= (LinearLayout) this.findViewById(R.id.menu_main);
        txt_main= (TextView) this.findViewById(R.id.menu_main_txt);

        menu_shop= (LinearLayout) this.findViewById(R.id.menu_shop);
        txt_shop= (TextView) this.findViewById(R.id.menu_shop_txt);

        menu_message= (LinearLayout) this.findViewById(R.id.menu_message);
        txt_message= (TextView) this.findViewById(R.id.menu_message_txt);

        menu_me= (LinearLayout) this.findViewById(R.id.menu_me);
        txt_me= (TextView) this.findViewById(R.id.menu_me_txt);

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
                txt_main.setTextColor(Color.parseColor("#333333"));
                txt_main.setTextSize(16);
                txt_shop.setTextColor(Color.parseColor("#666666"));
                txt_shop.setTextSize(14);
                txt_message.setTextColor(Color.parseColor("#666666"));
                txt_message.setTextSize(14);
                txt_me.setTextColor(Color.parseColor("#666666"));
                txt_me.setTextSize(14);
                break;
            case R.id.menu_shop: //商城
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,shopFragment)
                        .commit();
                txt_main.setTextColor(Color.parseColor("#666666"));
                txt_main.setTextSize(14);
                txt_shop.setTextColor(Color.parseColor("#333333"));
                txt_shop.setTextSize(16);
                txt_message.setTextColor(Color.parseColor("#666666"));
                txt_message.setTextSize(14);
                txt_me.setTextColor(Color.parseColor("#666666"));
                txt_me.setTextSize(14);
                break;
            case R.id.menu_message: //消息
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,messageFragment)
                        .commit();
                txt_main.setTextColor(Color.parseColor("#666666"));
                txt_main.setTextSize(14);
                txt_shop.setTextColor(Color.parseColor("#666666"));
                txt_shop.setTextSize(14);
                txt_message.setTextColor(Color.parseColor("#333333"));
                txt_message.setTextSize(16);
                txt_me.setTextColor(Color.parseColor("#666666"));
                txt_me.setTextSize(14);
                break;
            case R.id.menu_me: //我的
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container_content,meFrament)
                        .commit();
                txt_main.setTextColor(Color.parseColor("#666666"));
                txt_main.setTextSize(14);
                txt_shop.setTextColor(Color.parseColor("#666666"));
                txt_shop.setTextSize(14);
                txt_message.setTextColor(Color.parseColor("#666666"));
                txt_message.setTextSize(14);
                txt_me.setTextColor(Color.parseColor("#333333"));
                txt_me.setTextSize(16);
                break;
        }
    }
}
