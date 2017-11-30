package com.ansel.news;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ansel.news.widget.BottomNavigationViewEx;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bnvx)
    BottomNavigationViewEx bnvEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
        initListener();
    }

    private void initView() {
        bnvEx.enableAnimation(false);
        bnvEx.enableShiftingMode(false);
        bnvEx.enableItemShiftingMode(false);
    }

    private void initListener() {
    }

    @Override
    public void onClick(View v) {
//
    }
}
