package com.cjj.httpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.cjj.http.Http;

/**
 * Created by Administrator on 2015/8/26.
 */
public class DisplayNetImageActivity extends AppCompatActivity {
    private ImageView iv;
    private ImageView iv_static;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_img);
        iv = (ImageView) this.findViewById(R.id.iv);
        iv_static = (ImageView) this.findViewById(R.id.iv_static);
        Http.displayImage(this,iv_static,"http://img4.duitang.com/uploads/blog/201406/04/20140604162508_dtMtN.thumb.700_0.jpeg");
        Http.displayImage(DisplayNetImageActivity.this,iv,"http://img4q.duitang.com/uploads/item/201207/20/20120720203027_cJHZT.gif");
    }
}
