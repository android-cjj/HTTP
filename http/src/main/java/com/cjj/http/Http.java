package com.cjj.http;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.cjj.listener.CallbackListener;

import java.util.Map;

/**
 /**
 * Http
 * @author cjj
 * @category A frame for web
 * @version 1.0
 * @date 2015/8/26
 * @content
 *  this is a frame for web,You can easily by using the method of inside access to
 *  the network,it is Fast and efficient,also save time.
 *  the frame based on the okhttp link{https://github.com/square/okhttp} and glide
 *  link{https://github.com/bumptech/glide}
 */
public class Http extends BaseHttp{
    /**
     * get 请求
     * @param url
     * @param listener
     */
    public static void get(String url,CallbackListener<?> listener)
    {
        getInstance().baseGet(url, listener);
    }

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

    /**
     * 无参post 请求
     * @param url
     * @param listener
     */
    public static void postNotParams(String url,CallbackListener<?> listener)
    {
        getInstance().basePost(url, null, listener);
    }

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

    /**
     * 展示网络图片
     */
    public static  void displayImage(Context context,ImageView imageView,String url)
    {
        displayImage(context, imageView, url, 0, 0);
    }
    public static  void displayImage(Context context,ImageView imageView,String url,int placeholderId)
    {
        displayImage(context, imageView, url, placeholderId, 0);
    }
    public static  void displayImage(Context context,ImageView imageView,String url,int placeholderId,int errorId)
    {
        getInstance().baseDisplayImage(context, imageView, url, placeholderId, errorId);
    }
    public static  void displayImage(Context context,ImageView imageView,String url,Drawable placeholderId)
    {
        displayImage(context, imageView, url, placeholderId, null);
    }
    public static  void displayImage(Context context,ImageView imageView,String url,Drawable placeholderId,Drawable errorId)
    {
        getInstance().baseDisplayImage(context, imageView, url, placeholderId, errorId);
    }
    public static  void displayImage(Fragment context,ImageView imageView,String url)
    {
        displayImage(context, imageView, url, 0, 0);
    }
    public static  void displayImage(Fragment context,ImageView imageView,String url,int placeholderId)
    {
        displayImage(context, imageView, url, placeholderId, 0);
    }
    public static  void displayImage(Fragment context,ImageView imageView,String url,int placeholderId,int errorId)
    {
        getInstance().baseDisplayImage(context, imageView, url, placeholderId, errorId);
    }
    public static  void displayImage(Fragment context,ImageView imageView,String url,Drawable placeholderId)
    {
        displayImage(context, imageView, url, placeholderId, null);
    }
    public static  void displayImage(Fragment context,ImageView imageView,String url,Drawable placeholderId,Drawable errorId)
    {
        getInstance().baseDisplayImage(context, imageView, url, placeholderId, errorId);
    }
    public static  void displayImage(Activity context,ImageView imageView,String url)
    {
        displayImage(context, imageView, url, 0, 0);
    }
    public static  void displayImage(Activity context,ImageView imageView,String url,int placeholderId)
    {
        displayImage(context, imageView, url, placeholderId, 0);
    }
    public static  void displayImage(Activity context,ImageView imageView,String url,int placeholderId,int errorId)
    {
        getInstance().baseDisplayImage(context, imageView, url, placeholderId, errorId);
    }
    public static  void displayImage(Activity context,ImageView imageView,String url,Drawable placeholderId)
    {
        displayImage(context, imageView, url, placeholderId, null);
    }
    public static  void displayImage(Activity context,ImageView imageView,String url,Drawable placeholderId,Drawable errorId)
    {
        getInstance().baseDisplayImage(context, imageView, url, placeholderId, errorId);
    }

    public static  void displayLocalImage(Context context,ImageView imageView,int resourceId)
    {
        displayLocalImage(context, imageView, resourceId, 0, 0);
    }
    public static  void displayLocalImage(Context context,ImageView imageView,int resourceId,int placehodlerId)
    {
        displayLocalImage(context, imageView, resourceId, placehodlerId, 0);
    }
    public static  void displayLocalImage(Context context,ImageView imageView,int resourceId,int placehodlerId,int errorId)
    {
        getInstance().baseDisplayLocalImage(context, imageView, resourceId, placehodlerId, errorId);
    }

    /**
     * 展示本地图片
     */
    public static  void displayLocalImage(Fragment context,ImageView imageView,int resourceId)
    {
        displayLocalImage(context, imageView, resourceId, 0, 0);
    }
    public static  void displayLocalImage(Fragment context,ImageView imageView,int resourceId,int placehodlerId)
    {
        displayLocalImage(context, imageView, resourceId, placehodlerId, 0);
    }
    public static  void displayLocalImage(Fragment context,ImageView imageView,int resourceId,int placehodlerId,int errorId)
    {
        getInstance().baseDisplayLocalImage(context, imageView, resourceId, placehodlerId, errorId);
    }
    public static  void displayLocalImage(Activity context,ImageView imageView,int resourceId)
    {
        displayLocalImage(context, imageView, resourceId, 0, 0);
    }
    public static  void displayLocalImage(Activity context,ImageView imageView,int resourceId,int placehodlerId)
    {
        displayLocalImage(context, imageView, resourceId, placehodlerId, 0);
    }
    public static  void displayLocalImage(Activity context,ImageView imageView,int resourceId,int placehodlerId,int errorId)
    {
        getInstance().baseDisplayLocalImage(context, imageView,resourceId, placehodlerId, errorId);
    }
    public static  void displayLocalImage(Fragment context,ImageView imageView,Drawable resourceId)
    {
        displayLocalImage(context, imageView, resourceId, null, null);
    }
    public static  void displayLocalImage(Fragment context,ImageView imageView,Drawable resourceId,Drawable placehodlerId)
    {
        displayLocalImage(context, imageView, resourceId, placehodlerId, null);
    }
    public static  void displayLocalImage(Fragment context,ImageView imageView,Drawable resourceId,Drawable placehodlerId,Drawable errorId)
    {
        getInstance().baseDisplayLocalImage(context, imageView,resourceId, placehodlerId, errorId);
    }
    public static  void displayLocalImage(Activity context,ImageView imageView,Drawable resourceId)
    {
        displayLocalImage(context, imageView, resourceId, null, null);
    }
    public static  void displayLocalImage(Activity context,ImageView imageView,Drawable resourceId,Drawable placehodlerId)
    {
        displayLocalImage(context, imageView, resourceId, placehodlerId, null);
    }
    public static  void displayLocalImage(Activity context,ImageView imageView,Drawable resourceId,Drawable placehodlerId,Drawable errorId)
    {
        getInstance().baseDisplayLocalImage(context, imageView,resourceId, placehodlerId, errorId);
    }

}
