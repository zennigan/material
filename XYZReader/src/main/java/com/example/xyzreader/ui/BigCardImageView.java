package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Zennigan on 2/17/2016.
 */
public class BigCardImageView extends ImageView {
    public BigCardImageView(Context context) {
        super(context);
    }

    public BigCardImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BigCardImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthSpec)*2/3;
        int threeTwoHeightSpec =
                MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec,threeTwoHeightSpec);
    }
}
