package com.android.wangmf;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by wangyunfa on 16/11/30.
 */

public class ImageAdapter extends BasePagerAdapter {
    private List<Integer> data;

    public ImageAdapter(List<View> list, Context context, List<Integer> data) {
        super(list, context);
        this.data = data;
    }

    @Override
    protected void getFooterViewItem(View view) {

    }

    @Override
    protected void getItem(View view, int position) {
        ImageView iv = (ImageView) view.findViewById(R.id.iv);
        iv.setImageResource(data.get(position));
    }
}
