package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.devsupport.DoubleTapReloadRecognizer;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionListener;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.oo0Oo0O0  reason: case insensitive filesystem */
public class C8658oo0Oo0O0 {
    @Nullable
    public final Activity OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final FragmentActivity f21808OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReactInstanceManager f21809OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReactRootView f21810OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public Callback f21811OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public DoubleTapReloadRecognizer f21812OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public PermissionListener f21813OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f21814OooO00o;

    /* renamed from: com.pd.sdk.oo0Oo0O0$OooO00o */
    public class OooO00o implements Callback {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ int[] f21816OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String[] f21817OooO00o;

        public OooO00o(int i, String[] strArr, int[] iArr) {
            this.OooO00o = i;
            this.f21817OooO00o = strArr;
            this.f21816OooO00o = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (C8658oo0Oo0O0.this.f21813OooO00o != null && C8658oo0Oo0O0.this.f21813OooO00o.onRequestPermissionsResult(this.OooO00o, this.f21817OooO00o, this.f21816OooO00o)) {
                C8658oo0Oo0O0.this.f21813OooO00o = null;
            }
        }
    }

    public C8658oo0Oo0O0(Activity activity, @Nullable String str) {
        this.OooO00o = activity;
        this.f21814OooO00o = str;
        this.f21808OooO00o = null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m20284OooO00o() {
        return null;
    }

    public void OooO0O0() {
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m20290OooO0O0() {
        if (!m20289OooO00o()) {
            return false;
        }
        m20285OooO00o().onBackPressed();
        return true;
    }

    public void OooO0OO() {
        if (m20289OooO00o()) {
            m20285OooO00o().onHostPause(OooO00o());
        }
    }

    public void OooO0Oo() {
        if (m20289OooO00o()) {
            m20285OooO00o().onHostResume(OooO00o(), (DefaultHardwareBackBtnHandler) OooO00o());
        }
        Callback callback = this.f21811OooO00o;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f21811OooO00o = null;
        }
    }

    public void OooO0o0() {
        ReactRootView reactRootView = this.f21810OooO00o;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
            this.f21810OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ReactRootView m20286OooO00o() {
        return new C9080ooOooO0O(m20283OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8656oo0Oo00O m20287OooO00o() {
        return C8654oo0Oo00.OooO00o().f21798OooO00o;
    }

    public C8658oo0Oo0O0(FragmentActivity fragmentActivity, @Nullable String str) {
        this.f21808OooO00o = fragmentActivity;
        this.f21814OooO00o = str;
        this.OooO00o = null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ReactInstanceManager m20285OooO00o() {
        return this.f21809OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20289OooO00o() {
        return this.f21809OooO00o != null;
    }

    public void OooO00o(Bundle bundle) {
        String str = this.f21814OooO00o;
        if (str != null) {
            OooO00o(str);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "MyReactActivity;onCreate");
            hashMap.put("exception", "MyReactActivity;onCreate;mMainComponentName=null");
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap);
        }
        this.f21812OooO00o = new DoubleTapReloadRecognizer();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:2|3|4|5) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8658oo0Oo0O0.OooO00o(java.lang.String):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20288OooO00o() {
        OooO0o0();
        if (m20289OooO00o()) {
            m20285OooO00o().onHostDestroy(OooO00o());
        }
    }

    public void OooO00o(int i, int i2, Intent intent) {
        if (m20289OooO00o()) {
            m20285OooO00o().onActivityResult(OooO00o(), i, i2, intent);
        }
    }

    public boolean OooO00o(int i, KeyEvent keyEvent) {
        if (!m20289OooO00o() || !m20287OooO00o().getUseDeveloperSupport()) {
            return false;
        }
        if (i == 82) {
            m20285OooO00o().showDevOptionsDialog();
            return true;
        } else if (!((DoubleTapReloadRecognizer) Assertions.assertNotNull(this.f21812OooO00o)).didDoubleTapR(i, OooO00o().getCurrentFocus())) {
            return false;
        } else {
            m20285OooO00o().getDevSupportManager().handleReloadJS();
            return true;
        }
    }

    public boolean OooO00o(Intent intent) {
        if (!m20289OooO00o()) {
            return false;
        }
        m20285OooO00o().onNewIntent(intent);
        return true;
    }

    @TargetApi(23)
    public void OooO00o(String[] strArr, int i, PermissionListener permissionListener) {
        this.f21813OooO00o = permissionListener;
        OooO00o().requestPermissions(strArr, i);
    }

    public void OooO00o(int i, String[] strArr, int[] iArr) {
        this.f21811OooO00o = new OooO00o(i, strArr, iArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Context m20283OooO00o() {
        Activity activity = this.OooO00o;
        if (activity != null) {
            return activity;
        }
        return (Context) Assertions.assertNotNull(this.f21808OooO00o);
    }

    private Activity OooO00o() {
        return (Activity) m20283OooO00o();
    }
}
