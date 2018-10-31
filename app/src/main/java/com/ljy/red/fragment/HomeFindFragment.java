package com.ljy.red.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ljy.red.HomeArticalActivity;
import com.ljy.red.MeActivity;
import com.ljy.red.R;

/**
 * Created by 佳阳 on 2018/10/29.
 */

public class HomeFindFragment extends Fragment {

    private LinearLayout artical1;

    public static Fragment newInstance() {
        HomeFindFragment fragment = new HomeFindFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home_find,container,false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        artical1= (LinearLayout) view.findViewById(R.id.home_find_mess1);
        artical1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),HomeArticalActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
