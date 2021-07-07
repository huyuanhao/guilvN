package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.NativeGestureUtil;

public class ReactDrawerLayout extends DrawerLayout {
    public static final int DEFAULT_DRAWER_WIDTH = -1;
    public int mDrawerPosition = 8388611;
    public int mDrawerWidth = -1;

    public ReactDrawerLayout(ReactContext reactContext) {
        super(reactContext);
    }

    public void closeDrawer() {
        closeDrawer(this.mDrawerPosition);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void openDrawer() {
        openDrawer(this.mDrawerPosition);
    }

    public void setDrawerPosition(int i) {
        this.mDrawerPosition = i;
        setDrawerProperties();
    }

    public void setDrawerProperties() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            DrawerLayout.C5042OooO0o0 oooO0o0 = (DrawerLayout.C5042OooO0o0) childAt.getLayoutParams();
            oooO0o0.f14093OooO00o = this.mDrawerPosition;
            ((ViewGroup.MarginLayoutParams) oooO0o0).width = this.mDrawerWidth;
            childAt.setLayoutParams(oooO0o0);
            childAt.setClickable(true);
        }
    }

    public void setDrawerWidth(int i) {
        this.mDrawerWidth = i;
        setDrawerProperties();
    }
}
