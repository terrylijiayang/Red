package com.ljy.red;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.ljy.red.R.id.imageView;

public class WelfareHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare_home);
        LinearLayout linearLayout1= (LinearLayout) this.findViewById(R.id.home_face);
        LinearLayout linearLayout2= (LinearLayout) this.findViewById(R.id.home_make);
        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelfareHomeActivity.this, WelfareSalesActivity.class);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelfareHomeActivity.this, WelfareSeedingActivity.class);
                startActivity(intent);
            }
        });
    }
}
