package com.ljy.red.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ImageView;

import com.ljy.red.GoodsDetailActivity;
import com.ljy.red.R;
import com.ljy.red.WelfareMainActivity;


public class recFragment extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.rec, null);

        ImageView imageView= (ImageView) view.findViewById(R.id.imageView11);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WelfareMainActivity.class);
                startActivity(intent);
            }
        });

        ImageView img1= (ImageView) view.findViewById(R.id.imageVie3);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GoodsDetailActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
