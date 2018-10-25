package com.ljy.red.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.ljy.red.R;
import com.ljy.red.mresActivity;

/**
 * Created by 佳阳 on 2018/10/9.
 */

public class ShopFragment extends Fragment implements View.OnClickListener {
    private Button rec;
    private Button beauty;
    private Button care;
    private Button preson;
    private Button bady;
    private Button more;
    private Button mrec;
    recFragment fragment1Fragment= new recFragment();
    badyFragment fragment2Fragment= new badyFragment();
    beautyFragment fragment3Fragment= new beautyFragment();
    personFragment fragment4Fragment= new personFragment();
    careFragment fragment5Fragment= new careFragment();
    moreFragment fragment6Fragment= new moreFragment();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.shopindex,container,false);
        GroupChang(view);
        return view;
    }

    public void GroupChang(View view) {
        getChildFragmentManager().beginTransaction()
                .replace(R.id.main_body,fragment1Fragment)
                .commit();
         rec = (RadioButton) view.findViewById(R.id.rec);//推荐
        preson  = (RadioButton) view.findViewById(R.id.person);//个人护理
         beauty  = (RadioButton) view.findViewById(R.id.beauty);//美妆
         care  = (RadioButton) view.findViewById(R.id.care);//护肤
         bady  = (RadioButton) view.findViewById(R.id.bady);//母婴
         more  = (RadioButton) view.findViewById(R.id.more);//更多
        rec.setOnClickListener(this);
        preson.setOnClickListener(this);
        beauty.setOnClickListener(this);
        care.setOnClickListener(this);
        bady.setOnClickListener(this);
        more.setOnClickListener(this);


        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment1Fragment)
                        .commit();
                rec.setTextColor(Color.parseColor("#666666"));
                preson.setTextColor(Color.parseColor("#DCDCDC"));
                care.setTextColor(Color.parseColor("#DCDCDC"));
                bady.setTextColor(Color.parseColor("#DCDCDC"));
                more.setTextColor(Color.parseColor("#DCDCDC"));
                beauty.setTextColor(Color.parseColor("#DCDCDC"));

            }
        });
        preson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment4Fragment)
                        .commit();
                rec.setTextColor(Color.parseColor("#DCDCDC"));
                preson.setTextColor(Color.parseColor("#666666"));
                care.setTextColor(Color.parseColor("#DCDCDC"));
                bady.setTextColor(Color.parseColor("#DCDCDC"));
                more.setTextColor(Color.parseColor("#DCDCDC"));
                beauty.setTextColor(Color.parseColor("#DCDCDC"));
            }
        });
        bady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment2Fragment)
                        .commit();
                //在按钮响应函数中添加如下两句话就ok了
                rec.setTextColor(Color.parseColor("#DCDCDC"));
                preson.setTextColor(Color.parseColor("#DCDCDC"));
                care.setTextColor(Color.parseColor("#DCDCDC"));
                bady.setTextColor(Color.parseColor("#666666"));
                more.setTextColor(Color.parseColor("#DCDCDC"));
                beauty.setTextColor(Color.parseColor("#DCDCDC"));
            }
        });

        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment3Fragment)
                        .commit();
                rec.setTextColor(Color.parseColor("#DCDCDC"));
                preson.setTextColor(Color.parseColor("#DCDCDC"));
                care.setTextColor(Color.parseColor("#DCDCDC"));
                bady.setTextColor(Color.parseColor("#DCDCDC"));
                more.setTextColor(Color.parseColor("#DCDCDC"));
                beauty.setTextColor(Color.parseColor("#666666"));
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在按钮响应函数中添加如下两句话就ok了
                getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment5Fragment)
                        .commit();
                rec.setTextColor(Color.parseColor("#DCDCDC"));
                preson.setTextColor(Color.parseColor("#DCDCDC"));
                care.setTextColor(Color.parseColor("#666666"));
                bady.setTextColor(Color.parseColor("#DCDCDC"));
                more.setTextColor(Color.parseColor("#DCDCDC"));
                beauty.setTextColor(Color.parseColor("#DCDCDC"));
            }
        });


        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), mresActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
       /* switch (v.getId()){
            case R.id.rec: //推荐
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment1Fragment)
                        .commit();
                break;
            case R.id.person: //个人护理
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment4Fragment)
                        .commit();
                break;
            case R.id.beauty: //个人护理
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment3Fragment)
                        .commit();
                break;

            case R.id.care: //个人护理
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment5Fragment)
                        .commit();
                break;
            case R.id.bady: //个人护理
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_body,fragment2Fragment)
                        .commit();
                break;
        }*/
    }
}
