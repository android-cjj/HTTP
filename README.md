
HTTP
=============================================================
 ![](http://www.apkbus.com/data/attachment/forum/201508/26/162351nes8eqe83hhhbple.jpg)
 
 this is a frame for web,You can easily by using the method of inside access to  the network,
 it is Fast and efficient,also save time.the frame based on the okhttp link 
 {https://github.com/square/okhttp} and glide link {https://github.com/bumptech/glide}
 
 How do I use HTTP ?
 =============================================================================
 
 How to use GET obtain String or Object
-------------------------------------------------------------
 ```java
        /**
         * get 中的两个参数 一个url,一个回调监听 监听中可以重写
         * onSuccess(String result)【回调成功】， onError(Exception e)【回调失败】 onStringResult(Stringresult)【打印string】
         */
        Http.get("https://www.baidu.com/", new CallbackListener<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("cjj", "onSuccess---" + result);
                tv_get_string.setText("getString------->" + result);
            }
        });
 ```       
 

 
