package com.github.njhu.njcloudreader.Banner;

import android.content.Context;
import android.nfc.Tag;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.github.njhu.njcloudreader.Base.BaseFrameLayout;
import com.github.njhu.njcloudreader.Bean.Banner;
import com.github.njhu.njcloudreader.Bean.BannerData;
import com.github.njhu.njcloudreader.Tool.ServiceCreator;

import java.lang.reflect.Array;
import java.util.List;

import kotlin.reflect.KFunction;
import me.jingbin.sbanner.SBannerView;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeBanner extends BaseFrameLayout {
    private static final String TAG = "HomeBanner";
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
        loadBanner();
    }

    public SBannerView getsBannerView() {
        return sBannerView;
    }

    private void loadBanner(){



        (ServiceCreator.INSTANCE).createAppWanService().getBannerList().enqueue(new Callback<BannerData>() {
            @Override
            public void onResponse(Call<BannerData> call, Response<BannerData> response) {
                BannerData data = response.body();
                List<Banner> banners = data.getData();
                for (int i = 0; i < banners.size(); i++) {
                    Banner banner = banners.get(i);
                    Log.d(TAG, banner.getTitle());
                }
            }

            @Override
            public void onFailure(Call<BannerData> call, Throwable t) {

            }
        });
    }


}
