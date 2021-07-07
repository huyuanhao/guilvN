package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.netease.nimlib.util.NetworkUtil;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.C3657b;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.stateless.e */
public class C3652e {

    /* renamed from: a */
    public String f9548a = "10.0.0.172";

    /* renamed from: b */
    public int f9549b = 80;

    /* renamed from: c */
    public Context f9550c;

    public C3652e(Context context) {
        this.f9550c = context;
    }

    /* renamed from: a */
    private void m9758a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9550c, "sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            C3640a.f9478g = DataHelper.assembleStatelessURL(imprintProperty);
        }
    }

    /* renamed from: b */
    private void m9759b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9550c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9550c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            C3640a.f9477f = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            C3640a.f9479h = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        C3640a.f9478g = C3640a.f9479h;
        if (TextUtils.isEmpty(C3657b.f9560b)) {
            return;
        }
        if (C3657b.f9560b.startsWith("460") || C3657b.f9560b.startsWith("461")) {
            C3640a.f9478g = C3640a.f9477f;
        }
    }

    /* renamed from: c */
    private boolean m9760c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.f9550c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f9550c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9550c.getSystemService("connectivity");
            if (!DeviceConfig.checkPermission(this.f9550c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 1 || (extraInfo = activeNetworkInfo.getExtraInfo()) == null || (!extraInfo.equals(NetworkUtil.f15258OooO0o) && !extraInfo.equals(NetworkUtil.f15247OooO) && !extraInfo.equals(NetworkUtil.f15262OooO0oO))) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9550c, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0108 A[SYNTHETIC, Splitter:B:37:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d A[SYNTHETIC, Splitter:B:46:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39171a(byte[] r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3652e.mo39171a(byte[], java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (r10 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        if (r10 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8 A[SYNTHETIC, Splitter:B:28:0x00b8] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39172b(byte[] r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3652e.mo39172b(byte[], java.lang.String):boolean");
    }
}
