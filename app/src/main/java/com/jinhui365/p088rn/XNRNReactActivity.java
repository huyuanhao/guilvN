package com.jinhui365.p088rn;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.p118pd.sdk.C8658oo0Oo0O0;
import s.h.e.l.l.C;

/* renamed from: com.jinhui365.rn.XNRNReactActivity */
public class XNRNReactActivity extends FragmentActivity implements DefaultHardwareBackBtnHandler, PermissionAwareActivity {
    public final C8658oo0Oo0O0 OooO00o = OooO00o();

    static {
        C.i(17);
    }

    public native C8658oo0Oo0O0 OooO00o();

    public native C8658oo0Oo0O0 OooO0O0();

    public native void finish();

    @Nullable
    public String getMainComponentName() {
        return null;
    }

    @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
    public native void invokeDefaultOnBackPressed();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onDestroy();

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
