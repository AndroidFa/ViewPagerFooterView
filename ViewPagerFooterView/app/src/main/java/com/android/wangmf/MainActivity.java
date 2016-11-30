package com.android.wangmf;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ImageAdapter adapter;
    private List<Integer> list;
    private List<View> views;
    private View footerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        list = new ArrayList<>();
        views = new ArrayList<>();
        list.add(R.drawable.a1);
        list.add(R.drawable.a2);
        list.add(R.drawable.a3);
        list.add(R.drawable.a4);
        for (int i = 0; i < list.size(); i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.item, null, false);
            views.add(view);
        }
        footerView = LayoutInflater.from(this).inflate(R.layout.footer_view, null, false);
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ImageAdapter(views, this, list);
        viewPager.setAdapter(adapter);
        adapter.addFooterView(footerView);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == list.size()) {
                    startActivity(new Intent(MainActivity.this, ImageActivity.class));
                    viewPager.setCurrentItem(position - 1);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


}
