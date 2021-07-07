package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.huawei.hms.activity.AbstractC1109a;
import com.huawei.hms.p036b.AbstractC1130f;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.p037c.C1141j;
import com.huawei.hms.support.log.C1202a;
import com.netease.nis.captcha.Captcha;
import com.p118pd.sdk.C7265o0O000oo;

public class BindingFailedResolution implements ServiceConnection, AbstractC1109a {

    /* renamed from: a */
    public Activity f1098a;

    /* renamed from: b */
    public boolean f1099b = true;

    /* renamed from: c */
    public C1110a f1100c;

    /* renamed from: d */
    public Handler f1101d = null;

    /* renamed from: e */
    public Handler f1102e = null;

    /* renamed from: com.huawei.hms.api.BindingFailedResolution$a */
    public static class C1110a extends AbstractC1130f {
        public C1110a() {
        }

        @Override // com.huawei.hms.p036b.AbstractC1124a
        /* renamed from: a */
        public String mo15330a(Context context) {
            return AbstractC1139h.m1082a("hms_bindfaildlg_message", C1141j.m1091a(context, (String) null), C1141j.m1091a(context, HuaweiApiAvailability.SERVICES_PACKAGE));
        }

        @Override // com.huawei.hms.p036b.AbstractC1124a
        /* renamed from: b */
        public String mo15331b(Context context) {
            return AbstractC1139h.m1086d("hms_confirm");
        }

        public /* synthetic */ C1110a(C1114a aVar) {
            this();
        }
    }

    /* renamed from: b */
    private void m1002b() {
        if (m1003c()) {
            m1004d();
            return;
        }
        C1202a.m1320d("BindingFailedResolution", "In connect, bind core try fail");
        m1001a(false);
    }

    /* renamed from: c */
    private boolean m1003c() {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        Intent intent = new Intent(HuaweiApiAvailability.SERVICES_ACTION);
        intent.setPackage(HuaweiApiAvailability.SERVICES_PACKAGE);
        return activity.bindService(intent, this, 1);
    }

    /* renamed from: d */
    private void m1004d() {
        Handler handler = this.f1101d;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f1101d = new Handler(Looper.getMainLooper(), new C1115b(this));
        }
        this.f1101d.sendEmptyMessageDelayed(2, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
    }

    /* renamed from: e */
    private void m1005e() {
        Handler handler = this.f1101d;
        if (handler != null) {
            handler.removeMessages(2);
            this.f1101d = null;
        }
    }

    /* renamed from: f */
    private void m1006f() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            C1110a aVar = this.f1100c;
            if (aVar == null) {
                this.f1100c = new C1110a(null);
            } else {
                aVar.mo15404b();
            }
            C1202a.m1320d("BindingFailedResolution", "showPromptdlg to resolve conn error");
            this.f1100c.mo15403a(activity, new C1116c(this));
        }
    }

    public Activity getActivity() {
        return this.f1098a;
    }

    public int getRequestCode() {
        return Captcha.WEB_VIEW_HTTP_ERROR;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onBridgeActivityCreate(Activity activity) {
        this.f1098a = activity;
        C1117d.f1147a.mo15392a(activity);
        m996a();
        m998a(activity);
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onBridgeActivityDestroy() {
        m1005e();
        C1117d.f1147a.mo15393b(this.f1098a);
        this.f1098a = null;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        C1202a.m1318b("BindingFailedResolution", "onBridgeActivityResult");
        Handler handler = this.f1102e;
        if (handler != null) {
            handler.removeMessages(3);
            this.f1102e = null;
        }
        m1002b();
        return true;
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onBridgeConfigurationChanged() {
        if (this.f1100c != null) {
            C1202a.m1318b("BindingFailedResolution", "re show prompt dialog");
            m1006f();
        }
    }

    @Override // com.huawei.hms.activity.AbstractC1109a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        C1202a.m1318b("BindingFailedResolution", "On key up when resolve conn error");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m1005e();
        m1001a(true);
        Activity activity = getActivity();
        if (activity != null) {
            C1141j.m1093a(activity, this);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onStartResult(boolean z) {
        if (getActivity() != null) {
            if (z) {
                m997a(0);
            } else {
                m1006f();
            }
        }
    }

    /* renamed from: a */
    private void m996a() {
        Handler handler = this.f1102e;
        if (handler != null) {
            handler.removeMessages(3);
        } else {
            this.f1102e = new Handler(Looper.getMainLooper(), new C1114a(this));
        }
        this.f1102e.sendEmptyMessageDelayed(3, C7265o0O000oo.OooO0o.OooO00o);
    }

    /* renamed from: a */
    private void m998a(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(HuaweiApiAvailability.SERVICES_PACKAGE, HuaweiApiAvailability.ACTIVITY_NAME);
        C1202a.m1318b("BindingFailedResolution", "onBridgeActivityCreate：try to start HMS");
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (Throwable th) {
            C1202a.m1320d("BindingFailedResolution", "ActivityNotFoundException：" + th.getMessage());
            Handler handler = this.f1102e;
            if (handler != null) {
                handler.removeMessages(3);
                this.f1102e = null;
            }
            m1002b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1001a(boolean z) {
        if (this.f1099b) {
            this.f1099b = false;
            onStartResult(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m997a(int i) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            C1202a.m1318b("BindingFailedResolution", "finishBridgeActivity：" + i);
            Intent intent = new Intent();
            intent.putExtra("intent.extra.RESULT", i);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }
}
