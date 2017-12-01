package com.ansel.news;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // @formatter:off


    @BindView(R.id.ll_bottom_navigation) LinearLayout llBottomNavigation;
    @BindView(R.id.ll_index) LinearLayout llIndex;
    @BindView(R.id.iv_index) ImageView ivIndex;
    @BindView(R.id.tv_index) TextView tvIndex;
    @BindView(R.id.ll_video) LinearLayout llVideo;
    @BindView(R.id.iv_video) ImageView ivVideo;
    @BindView(R.id.tv_video) TextView tvVideo;
    @BindView(R.id.ll_focus) LinearLayout llFocus;
    @BindView(R.id.iv_focus) ImageView ivFocus;
    @BindView(R.id.tv_focus) TextView tvFocus;
    @BindView(R.id.ll_account) LinearLayout llAccount;
    @BindView(R.id.iv_account) ImageView ivAccount;
    @BindView(R.id.tv_account) TextView tvAccount;

    private int currentIndex = 0;
    private int preIndex;


    // @formatter:on
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        showFragment();
        initListener();

    }

    private void initView() {
        //初始化显示底部导航栏
        switch (currentIndex) {
            case 0:
                ivIndex.setBackgroundResource(R.mipmap.icon_index_checked);
                tvIndex.setTextColor(getResources().getColor(R.color.text_color_checked));
                break;
            case 1:
                ivVideo.setBackgroundResource(R.mipmap.icon_video_checked);
                tvVideo.setTextColor(getResources().getColor(R.color.text_color_checked));
                break;
            case 2:
                ivFocus.setBackgroundResource(R.mipmap.icon_focus_checked);
                tvFocus.setTextColor(getResources().getColor(R.color.text_color_checked));
                break;
            case 3:
                ivAccount.setBackgroundResource(R.mipmap.icon_account_checked);
                tvAccount.setTextColor(getResources().getColor(R.color.text_color_checked));
                break;
        }



    }

    private void initListener() {
        llIndex.setOnClickListener(this);
        llVideo.setOnClickListener(this);
        llFocus.setOnClickListener(this);
        llAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        preIndex = currentIndex;
        switch (v.getId()) {
            case R.id.ll_index:
                if (currentIndex == 0) {
                    //已经在该tab，暂时不动，
                } else {
                    currentIndex = 0;
                    refreshBottomItem(preIndex, currentIndex);
                }
                break;
            case R.id.ll_video:
                if (currentIndex == 1) {
                    //已经在该tab，暂时不动，
                } else {
                    currentIndex = 1;
                    refreshBottomItem(preIndex, currentIndex);
                }
                break;
            case R.id.ll_focus:
                if (currentIndex == 2) {
                    //已经在该tab，暂时不动，
                } else {
                    currentIndex = 2;
                    refreshBottomItem(preIndex, currentIndex);
                }
                break;
            case R.id.ll_account:
                if (currentIndex == 3) {
                    //已经在该tab，暂时不动，
                } else {
                    currentIndex = 3;
                    refreshBottomItem(preIndex, currentIndex);
                }
                break;
            default:
                break;
        }
    }

    /**
     * 刷新底部导航栏显示
     * @param preIndex
     * @param currentIndex
     */
    private void refreshBottomItem(int preIndex, int currentIndex) {

        if (currentIndex == 0) {
            ivIndex.setBackgroundResource(R.mipmap.icon_index_checked);
            tvIndex.setTextColor(getResources().getColor(R.color.text_color_checked));
        } else if (currentIndex == 1) {
            ivVideo.setBackgroundResource(R.mipmap.icon_video_checked);
            tvVideo.setTextColor(getResources().getColor(R.color.text_color_checked));
        }else if (currentIndex == 2) {
            ivFocus.setBackgroundResource(R.mipmap.icon_focus_checked);
            tvFocus.setTextColor(getResources().getColor(R.color.text_color_checked));
        }else if (currentIndex == 3) {
            ivAccount.setBackgroundResource(R.mipmap.icon_account_checked);
            tvAccount.setTextColor(getResources().getColor(R.color.text_color_checked));
        }

        if (preIndex == 0) {
            ivIndex.setBackgroundResource(R.mipmap.icon_index_unchecked);
            tvIndex.setTextColor(getResources().getColor(R.color.text_color_unchecked));
        } else if (preIndex == 1) {
            ivVideo.setBackgroundResource(R.mipmap.icon_video_unchecked);
            tvVideo.setTextColor(getResources().getColor(R.color.text_color_unchecked));
        }else if (preIndex == 2) {
            ivFocus.setBackgroundResource(R.mipmap.icon_focus_unchecked);
            tvFocus.setTextColor(getResources().getColor(R.color.text_color_unchecked));
        }else if (preIndex == 3) {
            ivAccount.setBackgroundResource(R.mipmap.icon_account_unchecked);
            tvAccount.setTextColor(getResources().getColor(R.color.text_color_unchecked));
        }
    }

    /**
     * 初始化 Fragment 显示
     */
    private void showFragment() {

    }
}
