package com.p118pd.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C7531o0Oooo0o;
import java.util.List;

/* renamed from: com.pd.sdk.o0OoooO0  reason: case insensitive filesystem */
public class C7533o0OoooO0 {
    public static final String OooO0O0 = "failed";
    public static final String OooO0OO = "scheme_failed";
    public Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ServiceConnection f20393OooO00o = new ServiceConnectionC7619o0oOOO0o(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public IAlixPay f20394OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IRemoteServiceCallback f20395OooO00o = new BinderC7523o0Ooo0o0(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f20396OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f20397OooO00o = IAlixPay.class;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20398OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20399OooO00o;

    /* renamed from: com.pd.sdk.o0OoooO0$OooO00o */
    public interface OooO00o {
        /* renamed from: a */
        void mo27271a();

        /* renamed from: b */
        void mo27272b();
    }

    public C7533o0OoooO0(Activity activity, OooO00o oooO00o) {
        this.OooO00o = activity;
        this.f20396OooO00o = oooO00o;
    }

    public String OooO00o(String str) {
        String str2 = "";
        int i = 0;
        try {
            List<C7486o0OoO0oO.OooO00o> OooO00o2 = C7486o0OoO0oO.OooO00o().m19113OooO00o();
            if (!C7486o0OoO0oO.OooO00o().f20323OooO0OO || OooO00o2 == null) {
                OooO00o2 = C7528o0OooOoo.f20379OooO00o;
            }
            C7531o0Oooo0o.OooO00o OooO00o3 = C7531o0Oooo0o.OooO00o((Context) this.OooO00o, OooO00o2);
            if (OooO00o3 == null || OooO00o3.OooO00o() || OooO00o3.OooO0O0() || C7531o0Oooo0o.OooO00o(OooO00o3.f20383OooO00o)) {
                return OooO0O0;
            }
            if (OooO00o3.f20383OooO00o == null || C7531o0Oooo0o.f20382OooO0O0.equals(OooO00o3.f20383OooO00o.packageName)) {
                str2 = C7531o0Oooo0o.OooO00o();
            } else {
                str2 = OooO00o3.f20383OooO00o.packageName;
            }
            if (OooO00o3.f20383OooO00o != null) {
                i = OooO00o3.f20383OooO00o.versionCode;
            }
            OooO00o(OooO00o3);
            return OooO00o(str, str2, i);
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.Oooo, th);
        }
    }

    private void OooO00o(C7531o0Oooo0o.OooO00o oooO00o) throws InterruptedException {
        PackageInfo packageInfo;
        if (oooO00o != null && (packageInfo = oooO00o.f20383OooO00o) != null) {
            String str = packageInfo.packageName;
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
            try {
                this.OooO00o.startActivity(intent);
            } catch (Throwable th) {
                C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, C7482o0OoO0OO.OoooO, th);
            }
            Thread.sleep(200);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cc, code lost:
        com.p118pd.sdk.C7477o0OoO0.OooO00o(com.p118pd.sdk.C7482o0OoO0OO.OooOO0o, "BSPEx", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d2, code lost:
        com.p118pd.sdk.C7477o0OoO0.OooO00o(com.p118pd.sdk.C7482o0OoO0OO.OooOO0o, "BSPWaiting", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return com.p118pd.sdk.C7479o0OoO000.OooO00o(com.alipay.sdk.app.EnumC0405k.PAY_WAITTING.mo4240a(), com.alipay.sdk.app.EnumC0405k.PAY_WAITTING.mo4243b(), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return com.p118pd.sdk.C7533o0OoooO0.OooO0OO;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105 A[ExcHandler: all (r0v27 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:18:0x0071] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String OooO00o(java.lang.String r17, java.lang.String r18, int r19) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7533o0OoooO0.OooO00o(java.lang.String, java.lang.String, int):java.lang.String");
    }

    public static boolean OooO00o(String str, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, "BSPDetectFail", "");
            return false;
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOO0o, "BSPDetectFail", th);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        if (r9 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r9.setRequestedOrientation(0);
        r7.f20399OooO00o = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        if (r9 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String OooO00o(java.lang.String r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7533o0OoooO0.OooO00o(java.lang.String, java.lang.String):java.lang.String");
    }

    public void OooO00o() {
        this.OooO00o = null;
    }
}
