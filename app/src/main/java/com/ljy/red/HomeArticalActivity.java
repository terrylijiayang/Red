package com.ljy.red;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ljy.red.Adapter.ArticalHeaderAdAdapter;
import com.ljy.red.Until.DataUtil;

public class HomeArticalActivity extends AppCompatActivity {

    protected  int [] icons={R.drawable.back1,R.drawable.back2,R.drawable.back3,R.drawable.back4};
    protected ViewPager mVPagerHeaderAd;//广告头

    private ImageView back_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_artical);
        //文章返回
        back_img= (ImageView) findViewById(R.id.artical_back);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeArticalActivity.this.finish();
            }
        });
        //轮播
        mVPagerHeaderAd= (ViewPager) findViewById(R.id.vpager_main_header_ad);

        ArticalHeaderAdAdapter adapter=new ArticalHeaderAdAdapter(HomeArticalActivity.this, DataUtil.getHeaderAddInfo(HomeArticalActivity.this,icons));
        mVPagerHeaderAd.setAdapter(adapter);
    }
}
