package com.github.njhu.njcloudreader.Banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.github.njhu.njcloudreader.Base.BaseFrameLayout;

import me.jingbin.sbanner.SBannerView;

public class HomeBanner extends BaseFrameLayout {

    private  SBannerView sBannerView;

    public HomeBanner(Context context) {
        this(context, null);
    }
    public HomeBanner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public HomeBanner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setsBannerView(SBannerView sBannerView) {
        this.sBannerView = sBannerView;
    }

    public SBannerView getsBannerView() {
        return sBannerView;
    }
}
