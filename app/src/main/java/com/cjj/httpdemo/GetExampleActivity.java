package com.cjj.httpdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjj.http.Http;
import com.cjj.listener.CallbackListener;

/**
 * Created by Administrator on 2015/8/25.
 */
public class GetExampleActivity extends AppCompatActivity {
    private TextView tv_get_string,tv_get_object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        tv_get_string = (TextView) this.findViewById(R.id.tv_result);
        tv_get_object = (TextView) this.findViewById(R.id.tv_object);
        initData();
    }


    private void initData() {
        /**
         * get 中的两个参数 一个url,一个回调监听 监听中可以重写
         *     onSuccess(String result)【回调成功】， onError(Exception e)【回调失败】 onStringResult(String result)【打印string】
         */
        Http.get("https://www.baidu.com/", new CallbackListener<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("cjj", "onSuccess---" + result);
                tv_get_string.setText("getString------->" + result);
            }

        });

        Http.get("http://apis.baidu.com/apistore/weatherservice/weather", new CallbackListener<Weather>() {
            @Override
            public void onSuccess(Weather result) {
                super.onSuccess(result);
                Log.i("cjj", "onSuccess---" + result);
                tv_get_object.setText("getObject------->"+result.errMsg +"------"+result.errNum);
            }

            @Override
            public void onError(Exception e) {
                super.onError(e);
                tv_get_object.setText("error:" + e);
            }

            @Override
            public void onStringResult(String result) {
                super.onStringResult(result);
                /**
                 * 一般用于打印String,调试。。。
                 * 如上我们已经知道返回Weather，如果不知道对象是什么，可以先打印出String,就知道对象是怎样的。。。
                 */
            }
        });


    }
}
