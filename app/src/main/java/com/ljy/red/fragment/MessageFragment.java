package com.ljy.red.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ljy.red.MeActivity;
import com.ljy.red.MessageInfoActivity;
import com.ljy.red.R;

/**
 * Created by 佳阳 on 2018/10/9.
 */

public class MessageFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.message_linear,container,false);
        init(view);
        return view;


    }
    public void init(View view){
        LinearLayout info= (LinearLayout) view.findViewById(R.id.message_info);
        info.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.message_info: //消息通知
                Intent intent = new Intent(getActivity(),MessageInfoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
