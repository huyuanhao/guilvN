package com.facebook.react.views.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import java.util.ArrayList;
import java.util.List;

public class ReactViewPager extends ViewPager {
    public final EventDispatcher mEventDispatcher;
    public boolean mIsCurrentItemFromJs;
    public boolean mScrollEnabled = true;
    public final Runnable measureAndLayout = new Runnable() {
        /* class com.facebook.react.views.viewpager.ReactViewPager.RunnableC08941 */

        public void run() {
            ReactViewPager reactViewPager = ReactViewPager.this;
            reactViewPager.measure(View.MeasureSpec.makeMeasureSpec(reactViewPager.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactViewPager.this.getHeight(), 1073741824));
            ReactViewPager reactViewPager2 = ReactViewPager.this;
            reactViewPager2.layout(reactViewPager2.getLeft(), ReactViewPager.this.getTop(), ReactViewPager.this.getRight(), ReactViewPager.this.getBottom());
        }
    };

    public class Adapter extends AbstractC7314o0O0Oo0O {
        public boolean mIsViewPagerInIntentionallyInconsistentState;
        public final List<View> mViews;

        public Adapter() {
            this.mViews = new ArrayList();
            this.mIsViewPagerInIntentionallyInconsistentState = false;
        }

        public void addView(View view, int i) {
            this.mViews.add(i, view);
            notifyDataSetChanged();
            ReactViewPager.this.setOffscreenPageLimit(this.mViews.size());
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public int getCount() {
            return this.mViews.size();
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public int getItemPosition(Object obj) {
            if (this.mIsViewPagerInIntentionallyInconsistentState || !this.mViews.contains(obj)) {
                return -2;
            }
            return this.mViews.indexOf(obj);
        }

        public View getViewAt(int i) {
            return this.mViews.get(i);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = this.mViews.get(i);
            viewGroup.addView(view, 0, ReactViewPager.this.generateDefaultLayoutParams());
            return view;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public void removeAllViewsFromAdapter(ViewPager viewPager) {
            this.mViews.clear();
            viewPager.removeAllViews();
            this.mIsViewPagerInIntentionallyInconsistentState = true;
        }

        public void removeViewAt(int i) {
            this.mViews.remove(i);
            notifyDataSetChanged();
            ReactViewPager.this.setOffscreenPageLimit(this.mViews.size());
        }

        public void setViews(List<View> list) {
            this.mViews.clear();
            this.mViews.addAll(list);
            notifyDataSetChanged();
            this.mIsViewPagerInIntentionallyInconsistentState = false;
        }
    }

    public class PageChangeListener implements ViewPager.OooO {
        public PageChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrollStateChanged(int i) {
            String str;
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else if (i == 2) {
                str = "settling";
            } else {
                throw new IllegalStateException("Unsupported pageScrollState");
            }
            ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageScrollStateChangedEvent(ReactViewPager.this.getId(), str));
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrolled(int i, float f, int i2) {
            ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageScrollEvent(ReactViewPager.this.getId(), i, f));
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageSelected(int i) {
            if (!ReactViewPager.this.mIsCurrentItemFromJs) {
                ReactViewPager.this.mEventDispatcher.dispatchEvent(new PageSelectedEvent(ReactViewPager.this.getId(), i));
            }
        }
    }

    public ReactViewPager(ReactContext reactContext) {
        super(reactContext);
        this.mEventDispatcher = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.mIsCurrentItemFromJs = false;
        setOnPageChangeListener(new PageChangeListener());
        setAdapter(new Adapter());
    }

    public void addViewToAdapter(View view, int i) {
        getAdapter().addView(view, i);
    }

    public int getViewCountInAdapter() {
        return getAdapter().getCount();
    }

    public View getViewFromAdapter(int i) {
        return getAdapter().getViewAt(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.measureAndLayout);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            FLog.m914w(ReactConstants.TAG, "Error intercepting touch event.", e);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            FLog.m914w(ReactConstants.TAG, "Error handling touch event.", e);
            return false;
        }
    }

    public void removeAllViewsFromAdapter() {
        getAdapter().removeAllViewsFromAdapter(this);
    }

    public void removeViewFromAdapter(int i) {
        getAdapter().removeViewAt(i);
    }

    public void setCurrentItemFromJs(int i, boolean z) {
        this.mIsCurrentItemFromJs = true;
        setCurrentItem(i, z);
        this.mIsCurrentItemFromJs = false;
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    public void setViews(List<View> list) {
        getAdapter().setViews(list);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Adapter getAdapter() {
        return (Adapter) super.getAdapter();
    }
}
