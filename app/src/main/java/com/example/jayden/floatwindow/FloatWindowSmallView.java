package com.example.jayden.floatwindow;

import android.content.Context;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by jayden on 8/10/15.
 */
public class FloatWindowSmallView extends LinearLayout {
    /**
     * width of this view
     */
    private static int width;

    /**
     * height of this view
     */
    private static int height;

    /**
     * height of status bar
     */
    private static int statusbarHeight;

    /**
     * windowmanager for update position of this view
     */
    private WindowManager windowManager;

    /**
     * layout
     */
    private LinearLayout smallViewLayout;

    private ImageView rocketImage;

    private WindowManager.LayoutParams layoutParams;

    /**
     * current x position of finger
     */
    private float xInScreen;

    /**
     * current y position of finger
     */
    private float yInScreen;

    /**
     * down x position of finger
     */
    private float xDownInScreen;

    /**
     * down y position of finger
     */
    private float yDownInScreen;

    private float xInView;

    private float yInView;

    private int rocketWidth;

    private int rocketHeight;

    private boolean isPressed;

    public FloatWindowSmallView(Context context) {
        super(context);
        windowManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        inflate(context, R.layout.float_window_small, this);
        smallViewLayout = (LinearLayout) findViewById(R.id.small_window_layout);

    }
}
