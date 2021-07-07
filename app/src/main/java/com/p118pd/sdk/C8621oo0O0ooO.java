package com.p118pd.sdk;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.ThemedReactContext;

/* renamed from: com.pd.sdk.oo0O0ooO  reason: case insensitive filesystem */
public class C8621oo0O0ooO extends FrameLayout implements LifecycleEventListener {
    public ThemedReactContext OooO00o;

    public C8621oo0O0ooO(@NonNull ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.OooO00o = themedReactContext;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        themedReactContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
