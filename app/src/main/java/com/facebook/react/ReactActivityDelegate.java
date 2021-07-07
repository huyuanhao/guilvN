package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.PermissionListener;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

public class ReactActivityDelegate {
    @Nullable
    public final Activity mActivity;
    @Nullable
    public DoubleTapReloadRecognizer mDoubleTapReloadRecognizer;
    @Nullable
    public final String mMainComponentName;
    @Nullable
    public PermissionListener mPermissionListener;
    @Nullable
    public Callback mPermissionsCallback;
    @Nullable
    public ReactRootView mReactRootView;

    static {
        C.i(7);
    }

    @Deprecated
    public ReactActivityDelegate(Activity activity, @Nullable String str) {
        this.mActivity = activity;
        this.mMainComponentName = str;
    }

    public native ReactRootView createRootView();

    public native Context getContext();

    @Nullable
    public Bundle getLaunchOptions() {
        return null;
    }

    public native Activity getPlainActivity();

    public native ReactInstanceManager getReactInstanceManager();

    public native ReactNativeHost getReactNativeHost();

    public native void loadApp(String str);

    public native void onActivityResult(int i, int i2, Intent intent);

    public native boolean onBackPressed();

    public native void onCreate(Bundle bundle);

    public native void onDestroy();

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public native boolean onKeyLongPress(int i, KeyEvent keyEvent);

    public native boolean onKeyUp(int i, KeyEvent keyEvent);

    public native boolean onNewIntent(Intent intent);

    public native void onPause();

    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    public native void onResume();

    @TargetApi(23)
    public void requestPermissions(String[] strArr, int i, PermissionListener permissionListener) {
        this.mPermissionListener = permissionListener;
        getPlainActivity().requestPermissions(strArr, i);
    }

    public ReactActivityDelegate(ReactActivity reactActivity, @Nullable String str) {
        this.mActivity = reactActivity;
        this.mMainComponentName = str;
    }
}
