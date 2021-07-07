package com.umeng.socialize.shareboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.umeng.socialize.shareboard.widgets.SocializeViewPager;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.List;

public class UMActionFrame extends LinearLayout {
    public ShareBoardConfig mConfig;
    public PopupWindow.OnDismissListener mDismissListener;

    public UMActionFrame(Context context) {
        super(context);
    }

    private View createShareTitle() {
        TextView textView = new TextView(getContext());
        textView.setText(this.mConfig.mTitleText);
        textView.setTextColor(this.mConfig.mTitleTextColor);
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dip2px(20.0f);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private View createShareboardLayout(List<SnsPlatform> list) {
        int i;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(this.mConfig.mShareboardBgColor);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ShareBoardConfig shareBoardConfig = this.mConfig;
        if (shareBoardConfig.mShareboardPosition == ShareBoardConfig.SHAREBOARD_POSITION_CENTER && (i = shareBoardConfig.mTopMargin) != 0) {
            layoutParams.topMargin = i;
        }
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        if (this.mConfig.mTitleVisibility) {
            linearLayout.addView(createShareTitle());
        }
        int calculateMenuHeightInDp = this.mConfig.calculateMenuHeightInDp(list.size());
        ViewPager createViewPagerInstance = createViewPagerInstance();
        final IndicatorView indicatorView = null;
        if (createViewPagerInstance != null) {
            SocializeMenuPagerAdapter socializeMenuPagerAdapter = new SocializeMenuPagerAdapter(getContext(), this.mConfig);
            socializeMenuPagerAdapter.setData(list);
            settingMenuLayout(createViewPagerInstance, calculateMenuHeightInDp);
            linearLayout.addView(createViewPagerInstance);
            createViewPagerInstance.setAdapter(socializeMenuPagerAdapter);
            if (this.mConfig.mIndicatorVisibility) {
                indicatorView = createIndicatorView();
            }
            if (indicatorView != null) {
                indicatorView.setPageCount(socializeMenuPagerAdapter.getCount());
                linearLayout.addView(indicatorView);
            }
            ViewPager.OooO r8 = new ViewPager.OooO() {
                /* class com.umeng.socialize.shareboard.UMActionFrame.C39952 */

                @Override // androidx.viewpager.widget.ViewPager.OooO
                public void onPageScrollStateChanged(int i) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OooO
                public void onPageScrolled(int i, float f, int i2) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OooO
                public void onPageSelected(int i) {
                    IndicatorView indicatorView = indicatorView;
                    if (indicatorView != null) {
                        indicatorView.setSelectedPosition(i);
                    }
                }
            };
            if (verifyMethodExists()) {
                createViewPagerInstance.addOnPageChangeListener(r8);
            } else {
                createViewPagerInstance.setOnPageChangeListener(r8);
            }
        } else {
            SocializeViewPager createSocializeViewPagerInstance = createSocializeViewPagerInstance();
            if (createSocializeViewPagerInstance == null) {
                return null;
            }
            SocializeMenuAdapter socializeMenuAdapter = new SocializeMenuAdapter(getContext(), this.mConfig);
            socializeMenuAdapter.setData(list);
            settingMenuLayout(createSocializeViewPagerInstance, calculateMenuHeightInDp);
            linearLayout.addView(createSocializeViewPagerInstance);
            createSocializeViewPagerInstance.setAdapter(socializeMenuAdapter);
            if (this.mConfig.mIndicatorVisibility) {
                indicatorView = createIndicatorView();
            }
            if (indicatorView != null) {
                indicatorView.setPageCount(socializeMenuAdapter.getCount());
                linearLayout.addView(indicatorView);
            }
            createSocializeViewPagerInstance.addOnPageChangeListener(new SocializeViewPager.OnPageChangeListener() {
                /* class com.umeng.socialize.shareboard.UMActionFrame.C39963 */

                @Override // com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                }

                @Override // com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                }

                @Override // com.umeng.socialize.shareboard.widgets.SocializeViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    IndicatorView indicatorView = indicatorView;
                    if (indicatorView != null) {
                        indicatorView.setSelectedPosition(i);
                    }
                }
            });
        }
        if (this.mConfig.mCancelBtnVisibility) {
            linearLayout.addView(createCancelBtn());
        }
        return linearLayout;
    }

    private SocializeViewPager createSocializeViewPagerInstance() {
        try {
            return (SocializeViewPager) Class.forName("com.umeng.socialize.shareboard.widgets.SocializeViewPager").getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e) {
            SLog.error(UmengText.SHAREBOARD.NULLJAR, e);
            return null;
        }
    }

    private ViewPager createViewPagerInstance() {
        try {
            return (ViewPager) Class.forName("androidx.viewpager.widget.ViewPager").getConstructor(Context.class).newInstance(getContext());
        } catch (Exception e) {
            SLog.error(e);
            return null;
        }
    }

    private int dip2px(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private StateListDrawable getBtnBg() {
        ColorDrawable colorDrawable = new ColorDrawable(this.mConfig.mCancelBtnBgColor);
        ColorDrawable colorDrawable2 = new ColorDrawable(this.mConfig.mCancelBtnBgPressedColor);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, colorDrawable2);
        stateListDrawable.addState(new int[0], colorDrawable);
        return stateListDrawable;
    }

    private void init(List<SnsPlatform> list) {
        setBackgroundColor(Color.argb(50, 0, 0, 0));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(100);
        setAnimation(alphaAnimation);
        setOrientation(1);
        int i = this.mConfig.mShareboardPosition;
        if (i == ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM) {
            setGravity(80);
        } else if (i == ShareBoardConfig.SHAREBOARD_POSITION_CENTER) {
            setGravity(17);
            int dip2px = dip2px(36.0f);
            setPadding(dip2px, 0, dip2px, 0);
        }
        setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.socialize.shareboard.UMActionFrame.View$OnClickListenerC39941 */

            public void onClick(View view) {
                if (UMActionFrame.this.mDismissListener != null) {
                    UMActionFrame.this.mDismissListener.onDismiss();
                }
            }
        });
        View createShareboardLayout = createShareboardLayout(list);
        if (createShareboardLayout != null) {
            createShareboardLayout.setClickable(true);
            addView(createShareboardLayout);
        }
    }

    private void settingMenuLayout(View view, int i) {
        int dip2px = dip2px(20.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dip2px((float) i));
        layoutParams.topMargin = dip2px;
        int dip2px2 = dip2px(10.0f);
        layoutParams.rightMargin = dip2px2;
        layoutParams.leftMargin = dip2px2;
        view.setLayoutParams(layoutParams);
        view.setPadding(0, 0, 0, dip2px);
    }

    private boolean verifyMethodExists() {
        try {
            return Class.forName("androidx.viewpager.widget.ViewPager").getMethod("addOnPageChangeListener", new Class[]{ViewPager.OooO.class}) != null;
        } catch (Exception e) {
            SLog.error(e);
        }
    }

    public View createCancelBtn() {
        TextView textView = new TextView(getContext());
        textView.setText(this.mConfig.mCancelBtnText);
        textView.setTextColor(this.mConfig.mCancelBtnColor);
        textView.setClickable(true);
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        ShareBoardConfig shareBoardConfig = this.mConfig;
        if (shareBoardConfig.mCancelBtnBgPressedColor == 0) {
            textView.setBackgroundColor(shareBoardConfig.mCancelBtnBgColor);
        } else if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(getBtnBg());
        } else {
            textView.setBackgroundDrawable(getBtnBg());
        }
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.umeng.socialize.shareboard.UMActionFrame.View$OnClickListenerC39974 */

            public void onClick(View view) {
                if (UMActionFrame.this.mDismissListener != null) {
                    UMActionFrame.this.mDismissListener.onDismiss();
                }
            }
        });
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, dip2px(50.0f)));
        return textView;
    }

    public IndicatorView createIndicatorView() {
        int dip2px = dip2px(20.0f);
        IndicatorView indicatorView = new IndicatorView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = dip2px;
        indicatorView.setLayoutParams(layoutParams);
        ShareBoardConfig shareBoardConfig = this.mConfig;
        indicatorView.setIndicatorColor(shareBoardConfig.mIndicatorNormalColor, shareBoardConfig.mIndicatorSelectedColor);
        indicatorView.setIndicator(3, 5);
        return indicatorView;
    }

    public void setDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mDismissListener = onDismissListener;
    }

    public void setSnsPlatformData(List<SnsPlatform> list) {
        setSnsPlatformData(list, new ShareBoardConfig());
    }

    public UMActionFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public UMActionFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSnsPlatformData(List<SnsPlatform> list, ShareBoardConfig shareBoardConfig) {
        if (shareBoardConfig == null) {
            this.mConfig = new ShareBoardConfig();
        } else {
            this.mConfig = shareBoardConfig;
        }
        init(list);
    }

    @TargetApi(21)
    public UMActionFrame(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
