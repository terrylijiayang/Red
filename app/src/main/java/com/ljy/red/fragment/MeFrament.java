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
import android.widget.TextView;

import com.ljy.red.InstallActivity;
import com.ljy.red.MeActivity;
import com.ljy.red.R;

/**
 * Created by 佳阳 on 2018/10/9.
 */

public class MeFrament extends Fragment implements View.OnClickListener{

    private MeCollectionFragment meCollectionFragment= new MeCollectionFragment();
    private MeNotesFragement meNotesFragement= new MeNotesFragement();
    private TextView txtNote,txtCollection;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.person_center,container,false);
        init(view);
        return view;
    }
    //初始化
    public void init(View view){
         txtNote= (TextView) view.findViewById(R.id.notes);
         txtCollection= (TextView) view.findViewById(R.id.collection);
        Button btnEdit= (Button) view.findViewById(R.id.edit_info);
        Button btnInstall= (Button) view.findViewById(R.id.install);
        getChildFragmentManager().beginTransaction()
                .replace(R.id.center_content,meNotesFragement)
                .commit();
        txtNote.setOnClickListener(this);
        txtCollection.setOnClickListener(this);
        btnEdit.setOnClickListener(this);
        btnInstall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.edit_info: //个人资料
                Intent intent = new Intent(getActivity(),MeActivity.class);
                startActivity(intent);
                break;
            case R.id.install:
                Intent intent1 = new Intent(getActivity(),InstallActivity.class);
                startActivity(intent1);
                break;
            case R.id.collection:
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.center_content,meCollectionFragment)
                        .commit();
                txtCollection.setTextColor(Color.parseColor("#ff2843"));
                txtNote.setTextColor(Color.parseColor("#333333"));
                break;
            case R.id.notes:
                this.getChildFragmentManager()
                        .beginTransaction()
                        .replace(R.id.center_content,meNotesFragement)
                        .commit();
                txtCollection.setTextColor(Color.parseColor("#333333"));
                txtNote.setTextColor(Color.parseColor("#ff2843"));
                break;
        }
    }
}
