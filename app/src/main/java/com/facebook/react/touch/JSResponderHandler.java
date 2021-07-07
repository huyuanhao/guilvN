package com.facebook.react.touch;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import javax.annotation.Nullable;

public class JSResponderHandler implements OnInterceptTouchEventListener {
    public static final int JS_RESPONDER_UNSET = -1;
    public volatile int mCurrentJSResponder = -1;
    @Nullable
    public ViewParent mViewParentBlockingNativeResponder;

    private void maybeUnblockNativeResponder() {
        ViewParent viewParent = this.mViewParentBlockingNativeResponder;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.mViewParentBlockingNativeResponder = null;
        }
    }

    public void clearJSResponder() {
        this.mCurrentJSResponder = -1;
        maybeUnblockNativeResponder();
    }

    @Override // com.facebook.react.touch.OnInterceptTouchEventListener
    public boolean onInterceptTouchEvent(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.mCurrentJSResponder;
        if (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) {
            return false;
        }
        return true;
    }

    public void setJSResponder(int i, @Nullable ViewParent viewParent) {
        this.mCurrentJSResponder = i;
        maybeUnblockNativeResponder();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.mViewParentBlockingNativeResponder = viewParent;
        }
    }
}
