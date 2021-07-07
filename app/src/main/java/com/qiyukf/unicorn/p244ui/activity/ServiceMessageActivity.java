package com.qiyukf.unicorn.p244ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.lifecycle.SessionLifeCycleListener;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.ServiceMessageActivity */
public class ServiceMessageActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public ServiceMessageFragment f5905b;

    /* renamed from: c */
    public Boolean f5906c = false;

    /* renamed from: d */
    public ImageView f5907d;

    /* renamed from: e */
    public TextView f5908e;

    /* renamed from: f */
    public SessionLifeCycleListener f5909f = new SessionLifeCycleListener() {
        /* class com.qiyukf.unicorn.p244ui.activity.ServiceMessageActivity.C28092 */

        @Override // com.qiyukf.unicorn.api.lifecycle.SessionLifeCycleListener
        public final void onLeaveSession() {
            C2706g.m6258a(ServiceMessageActivity.this);
            ServiceMessageActivity.this.finish();
        }
    };

    static {
        C.i(50331757);
    }

    /* renamed from: f */
    private String m6502f() {
        try {
            PackageManager packageManager = getApplicationContext().getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(getPackageName(), 128)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return getString(C2364R.string.ysf_service_title_default);
        }
    }

    public static native void start(Context context, String str, ConsultSource consultSource);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    public native void onRestoreInstanceState(Bundle bundle);
}
