package com.facebook.react;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

public abstract class ReactActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler, PermissionAwareActivity {
    public final ReactActivityDelegate mDelegate = createReactActivityDelegate();

    static {
        C.i(6);
    }

    public native ReactActivityDelegate createReactActivityDelegate();

    @Nullable
    public String getMainComponentName() {
        return null;
    }

    public final native ReactInstanceManager getReactInstanceManager();

    public final native ReactNativeHost getReactNativeHost();

    @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
    public native void invokeDefaultOnBackPressed();

    public final native void loadApp(String str);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // androidx.appcompat.app.AppCompatActivity
    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public native boolean onKeyLongPress(int i, KeyEvent keyEvent);

    public native boolean onKeyUp(int i, KeyEvent keyEvent);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onNewIntent(Intent intent);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onPause();

    @Override // androidx.fragment.app.FragmentActivity, com.p118pd.sdk.C6981o000O00O.OooO0O0
    public native void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onResume();

    @Override // com.facebook.react.modules.core.PermissionAwareActivity
    public native void requestPermissions(String[] strArr, int i, PermissionListener permissionListener);
}
