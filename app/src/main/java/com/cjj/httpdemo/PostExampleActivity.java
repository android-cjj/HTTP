package com.cjj.httpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.cjj.http.Http;
import com.cjj.listener.CallbackListener;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/26.
 */
public class PostExampleActivity extends AppCompatActivity {
    private TextView tv_get_string,tv_get_object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        tv_get_string = (TextView) this.findViewById(R.id.tv_result);
        tv_get_object = (TextView) this.findViewById(R.id.tv_object);

        Map<String, String> map = new HashMap<>();
        map.put("key", "7c0fca271915eee1061ab9410352fc26");
        map.put("postcode", "215001");
        Http.post("http://v.juhe.cn/postcode/query", map, new CallbackListener<String>() { //这里直接返回String,也可以返回对象，用法和get的一样，就是post有个参数而已
            @Override
            public void onSuccess(String result) {
                Log.i("cjj", "onSuccess---" + result);
                tv_get_string.setText("getString------->" + result);
            }
        });

    }
}
