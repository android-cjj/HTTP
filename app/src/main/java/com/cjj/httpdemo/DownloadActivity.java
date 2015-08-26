package com.cjj.httpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.cjj.http.Http;
import com.cjj.listener.CallbackListener;

/**
 * Created by Administrator on 2015/8/26.
 */
public class DownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        download();
    }

    private void download() {
        String sdpath = Environment.getExternalStorageDirectory()+"/downloadcjj/";
        Http.download("http://zhstatic.zhihu.com/pkg/store/daily/zhihu-daily-zhihu-2.5.2(382).apk",
                sdpath, new CallbackListener<String>() {
                    @Override
                    public void onDownloadFinish(String path) {  //下载完成 返回下载文件的绝对路径
                        super.onDownloadFinish(path);
                        Log.i("cjj", "onDown---" + path); //非线程ui
                    }

                    @Override
                    public void onDownloadProgress(int progress) { //下载进度回调
                        super.onDownloadProgress(progress);
                        Log.i("cjj", "onDownprogress---" + progress);//非线程ui
                    }
                });
    }
}
