
HTTP
=============================================================
 ![](http://www.apkbus.com/data/attachment/forum/201508/26/162351nes8eqe83hhhbple.jpg)
 
 this is a frame for web,You can easily by using the method of inside access to  the network,
 it is Fast and efficient,also save time.the frame based on the okhttp link 
 {https://github.com/square/okhttp} and glide link {https://github.com/bumptech/glide}
 
 How do I use HTTP ?
======================================================================
 
(1) How to use GET obtain String or Object
-------------------------------------------------------------
 ```java
 /**
 * get 中的两个参数 一个url,一个回调监听 监听中可以重写
 * onSuccess(String result)【回调成功】， onError(Exception e)【回调失败】 
 *onStringResult(Stringresult)【打印string】
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
        
     /**
     * get 请求
     * @param url
     * @param listener
     */
    public static void get(String url,CallbackListener<?> listener)
    {
        getInstance().baseGet(url, listener);
    }
 ```
 
(2)How to use POST obtain String or Object
--------------------------------------------------------------------------------------------------
```java
 Map<String, String> map = new HashMap<>();
 map.put("key", "7c0fca271915eee1061ab9410352fc26");
 map.put("postcode", "215001");
 Http.post("http://v.juhe.cn/postcode/query", map, new CallbackListener<String>() {
      //这里直接返回String,也可以返回对象，用法和get的一样，就是post有个参数而已
        @Override
            public void onSuccess(String result) {
                Log.i("cjj", "onSuccess---" + result);
                tv_get_string.setText("getString------->" + result);
            }
 });
 
    /**
     * post 请求
     * @param url
     * @param params
     * @param listener
     */
    public static void post(String url,Map<String,String>params,CallbackListener<?> listener)
    {
        getInstance().basePost(url, params, listener);
    }
 ```
 
 （3）How to download from the Internet
-------------------------------
```java
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
                
     /**
     * 下载
     * @param url 下载的url
     * @param savePath 保存的路径
     * @param listener 回调
     */
    public static void download(String url,String savePath,CallbackListener<?> listener)
    {
        getInstance().baseDownload(url, savePath, listener);
    }
 ```
 (4) How to display images for the web
----------------------------------------------------------
```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_img);
        iv = (ImageView) this.findViewById(R.id.iv);
        iv_static = (ImageView) this.findViewById(R.id.iv_static);
        Http.displayImage(this,iv_static,
        "http://img4.duitang.com/uploads/blog/201406/04/20140604162508_dtMtN.thumb.700_0.jpeg");
        
        Http.displayImage(DisplayNetImageActivity.this,iv,
       "http://img4q.duitang.com/uploads/item/201207/20/20120720203027_cJHZT.gif");
    }
 ```
screenshot
-------------------------------------------------------------------
![](http://img4.duitang.com/uploads/blog/201406/04/20140604162508_dtMtN.thumb.700_0.jpeg)
![](http://img4q.duitang.com/uploads/item/201207/20/20120720203027_cJHZT.gif)

(5)How to show local pictures
-----------------------------------------------
```java
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_img);
        iv = (ImageView) this.findViewById(R.id.iv);
        iv_static = (ImageView) this.findViewById(R.id.iv_static);
        Http.displayLocalImage(this,iv_static,R.drawable.b);
        Http.displayLocalImage(DisplayLocalImageActivity.this, iv, R.drawable.a);
    }
 ```
 screenshot
-------------------------------------------------------------------
![](http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E9%B8%A3%E4%BA%BAgif&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3674377005,3369026100&os=3072376110,3228547626&pn=9&rn=1&di=81814681190&ln=436&fr=ala&fmq=1440584733508_R&ic=undefined&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&gsm=0&objurl=http%3A%2F%2Fimg4q.duitang.com%2Fuploads%2Fitem%2F201207%2F20%2F20120720204610_BnAkT.gif)
 

 

 
