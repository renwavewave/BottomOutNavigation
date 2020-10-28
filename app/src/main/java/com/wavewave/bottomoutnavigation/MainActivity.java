package com.wavewave.bottomoutnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wavewave.mylibrary.BottomOutNavigation;

public class MainActivity extends AppCompatActivity {
    private BottomOutNavigation bottomOutNavigation;
    private ImageView iv_1;
    private ImageView iv_2;
    private ImageView iv_3;
    private ImageView tempImageView;
    /**
     * 默认 图片 负距离
     */
    private int marginTop = -40;
    /**
     * 默认 图片 最小负距离
     */
    private int marginTopMin = 0;
    /**
     * 默认 选中图片 大小
     */
    private int maxIV = 40;
    /**
     * 未选中图片大小
     */
    private int minIV = (int) (maxIV / 1.8);

    /**
     * 根据屏幕的分辨率从 dp 的单位 转成为 px(像素)
     */
    public int dip2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bottomOutNavigation = findViewById(R.id.myLineView);
        iv_1 = findViewById(R.id.iv_1);
        iv_2 = findViewById(R.id.iv_2);
        iv_3 = findViewById(R.id.iv_3);
        bottomOutNavigation.setCount(1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv_1.getLayoutParams();
        layoutParams.width = dip2px(maxIV);
        layoutParams.height = dip2px(maxIV);
        layoutParams.setMargins(0, dip2px(marginTop), 0, 0);
        iv_1.setLayoutParams(layoutParams);
        tempImageView = iv_1;


        LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) iv_2.getLayoutParams();
        layoutParams1.width = dip2px(minIV);
        layoutParams1.height = dip2px(minIV);
        layoutParams1.setMargins(0, dip2px(marginTopMin), 0, 0);
        iv_2.setLayoutParams(layoutParams1);

        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) iv_3.getLayoutParams();
        layoutParams3.width = dip2px(minIV);
        layoutParams3.height = dip2px(minIV);
        layoutParams3.setMargins(0, dip2px(marginTopMin), 0, 0);
        iv_3.setLayoutParams(layoutParams3);

        findViewById(R.id.ll_bottom_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempImageView != iv_1) {
                    LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) tempImageView.getLayoutParams();
                    layoutParams1.width = dip2px(minIV);
                    layoutParams1.height = dip2px(minIV);
                    layoutParams1.setMargins(0, dip2px(marginTopMin), 0, 0);
                    tempImageView.setLayoutParams(layoutParams1);

                    bottomOutNavigation.setCount(1);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv_1.getLayoutParams();
                    layoutParams.width = dip2px(maxIV);
                    layoutParams.height = dip2px(maxIV);
                    layoutParams.setMargins(0, dip2px(marginTop), 0, 0);
                    iv_1.setLayoutParams(layoutParams);
                    tempImageView = iv_1;

                    iv_1.setImageResource(R.mipmap.icon_recommend_select);
                    iv_2.setImageResource(R.mipmap.icon_follow);
                    iv_3.setImageResource(R.mipmap.icon_my);
                }
            }
        });
        findViewById(R.id.ll_bottom_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempImageView != iv_2) {
                    LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) tempImageView.getLayoutParams();
                    layoutParams1.width = dip2px(minIV);
                    layoutParams1.height = dip2px(minIV);
                    layoutParams1.setMargins(0, dip2px(marginTopMin), 0, 0);
                    tempImageView.setLayoutParams(layoutParams1);

                    bottomOutNavigation.setCount(2);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv_2.getLayoutParams();
                    layoutParams.width = dip2px(maxIV);
                    layoutParams.height = dip2px(maxIV);
                    layoutParams.setMargins(0, dip2px(marginTop), 0, 0);
                    iv_2.setLayoutParams(layoutParams);
                    tempImageView = iv_2;


                    iv_1.setImageResource(R.mipmap.icon_recommend);
                    iv_2.setImageResource(R.mipmap.icon_follow_select);
                    iv_3.setImageResource(R.mipmap.icon_my);
                }
            }
        });
        findViewById(R.id.ll_bottom_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tempImageView != iv_3) {
                    LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams) tempImageView.getLayoutParams();
                    layoutParams1.width = dip2px(minIV);
                    layoutParams1.height = dip2px(minIV);
                    layoutParams1.setMargins(0, dip2px(marginTopMin), 0, 0);
                    tempImageView.setLayoutParams(layoutParams1);

                    bottomOutNavigation.setCount(3);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv_3.getLayoutParams();
                    layoutParams.width = dip2px(maxIV);
                    layoutParams.height = dip2px(maxIV);
                    layoutParams.setMargins(0, dip2px(marginTop), 0, 0);
                    iv_3.setLayoutParams(layoutParams);
                    tempImageView = iv_3;

                    iv_1.setImageResource(R.mipmap.icon_recommend);
                    iv_2.setImageResource(R.mipmap.icon_follow);
                    iv_3.setImageResource(R.mipmap.icon_my);
                }
            }
        });
    }
}