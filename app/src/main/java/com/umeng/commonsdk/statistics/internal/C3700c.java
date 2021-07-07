package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.netease.nimlib.util.NetworkUtil;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C3657b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.internal.c */
public class C3700c {

    /* renamed from: e */
    public static boolean f9690e;

    /* renamed from: a */
    public String f9691a = "10.0.0.172";

    /* renamed from: b */
    public int f9692b = 80;

    /* renamed from: c */
    public Context f9693c;

    /* renamed from: d */
    public AbstractC3699b f9694d;

    public C3700c(Context context) {
        this.f9693c = context;
    }

    /* renamed from: b */
    private void m9968b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9693c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9693c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        String imprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f9693c, "oversea_domain_p", "");
        String imprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f9693c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(imprintProperty3);
        }
        if (!TextUtils.isEmpty(imprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(imprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(C3657b.f9560b)) {
            return;
        }
        if (C3657b.f9560b.startsWith("460") || C3657b.f9560b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    /* renamed from: c */
    private boolean m9969c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f9693c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f9693c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9693c.getSystemService("connectivity");
            if (!DeviceConfig.checkPermission(this.f9693c, "android.permission.ACCESS_NETWORK_STATE") || connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 1 || (extraInfo = activeNetworkInfo.getExtraInfo()) == null || (!extraInfo.equals(NetworkUtil.f15258OooO0o) && !extraInfo.equals(NetworkUtil.f15247OooO) && !extraInfo.equals(NetworkUtil.f15262OooO0oO))) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9693c, th);
        }
    }

    /* renamed from: a */
    public void mo39280a(AbstractC3699b bVar) {
        this.f9694d = bVar;
    }

    /* renamed from: a */
    private void m9967a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.f9693c, "domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9693c, "domain_s", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(imprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    /* renamed from: a */
    public byte[] mo39282a(byte[] bArr, boolean z) {
        if (SdkVersion.SDK_TYPE == 0) {
            m9967a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            m9968b();
        }
        int i = 0;
        byte[] bArr2 = null;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i >= strArr.length) {
                break;
            }
            bArr2 = mo39283b(bArr, strArr[i]);
            if (bArr2 != null) {
                AbstractC3699b bVar = this.f9694d;
                if (bVar != null) {
                    bVar.onRequestSucceed(z);
                }
            } else {
                AbstractC3699b bVar2 = this.f9694d;
                if (bVar2 != null) {
                    bVar2.onRequestFailed();
                }
                i++;
            }
        }
        return bArr2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:82:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r5v2, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01bd A[SYNTHETIC, Splitter:B:101:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c9 A[SYNTHETIC, Splitter:B:106:0x01c9] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017d A[SYNTHETIC, Splitter:B:69:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0189 A[SYNTHETIC, Splitter:B:74:0x0189] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019d A[SYNTHETIC, Splitter:B:86:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9 A[SYNTHETIC, Splitter:B:91:0x01a9] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo39283b(byte[] r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.internal.C3700c.mo39283b(byte[], java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0126 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo39281a(byte[] r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.internal.C3700c.mo39281a(byte[], java.lang.String):byte[]");
    }
}
