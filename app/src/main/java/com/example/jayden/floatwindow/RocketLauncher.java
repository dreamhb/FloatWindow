package com.example.jayden.floatwindow;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by jayden on 8/10/15.
 */
public class RocketLauncher extends LinearLayout{

    /**
     * width
     */
    private int width;

    /**
     * height
     */
    private int height;

    /**
     * launcher background
     */
    private ImageView launcherImg;


    public RocketLauncher(Context context) {
        super(context);
        inflate(context, R.layout.launcher, this);
        launcherImg = (ImageView) findViewById(R.id.launcher_img);
        width = launcherImg.getLayoutParams().width;
        height = launcherImg.getLayoutParams().height;
    }

    /**
     * change launcherImg depend on status of launch
     * @param readyToLauncher
     */
    public void updateLauncherStatus(boolean readyToLauncher){
        if(readyToLauncher){
            launcherImg.setImageResource(R.mipmap.launcher_bg_fire);
        }else{
            launcherImg.setImageResource(R.mipmap.launcher_bg_hold);
        }
    }
}
