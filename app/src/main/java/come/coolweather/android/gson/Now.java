package come.coolweather.android.gson;

import android.support.v4.media.session.MediaSessionCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018\2\5 0005.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
