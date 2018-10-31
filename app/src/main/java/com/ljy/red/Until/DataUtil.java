package com.ljy.red.Until;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 佳阳 on 2018/10/31.
 */

public class DataUtil {
    /**
     *
     * @param context
     * @param icons
     * @return
     */
    public static List<ImageView> getHeaderAddInfo(Context context, int icons[]){
        List<ImageView> datas = new ArrayList<>();
        for (int i=0 ; i< icons.length; i++){
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            datas.add(icon);
        }
        return  datas;
    }
}
