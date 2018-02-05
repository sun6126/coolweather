package come.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017\12\6 0006.
 */
/*
* 由于okhttp出色的封装，这里和服务器进行交互的代码变得非常简单。
* 现在向服务器发起一条HTTP请求只需要调用sendOKHttpRequest（）方法
* 传入请求地址，并注册一个回调来处理服务器响应就可以了*/
public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
