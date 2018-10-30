package com.ljy.red;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoodsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_detail);

        Button btnAddCart= (Button) this.findViewById(R.id.intoCart);
        Button btnSubmit= (Button) this.findViewById(R.id.buy);
       //加入购物车
        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoodsDetailActivity.this, IntroShopCartActivity.class);
                startActivity(intent);
            }
        });
        //立即购买
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoodsDetailActivity.this, PayActivity.class);
                startActivity(intent);
            }
        });
    }
}
