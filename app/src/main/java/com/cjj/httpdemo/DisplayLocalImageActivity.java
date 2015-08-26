package com.cjj.httpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cjj.http.Http;

/**
 * Created by Administrator on 2015/8/26.
 */
public class DisplayLocalImageActivity extends AppCompatActivity {
    private ImageView iv;
    private ImageView iv_static;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_img);
        iv = (ImageView) this.findViewById(R.id.iv);
        iv_static = (ImageView) this.findViewById(R.id.iv_static);
        Http.displayLocalImage(this,iv_static,R.drawable.b);
        Http.displayLocalImage(DisplayLocalImageActivity.this, iv, R.drawable.a);
    }
}
