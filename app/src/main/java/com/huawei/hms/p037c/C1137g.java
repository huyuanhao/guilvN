package com.huawei.hms.p037c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.c.g */
public class C1137g {

    /* renamed from: a */
    public final PackageManager f1172a;

    /* renamed from: com.huawei.hms.c.g$a */
    public enum EnumC1138a {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    public C1137g(Context context) {
        this.f1172a = context.getPackageManager();
    }

    /* renamed from: d */
    private byte[] m1075d(String str) {
        try {
            PackageInfo packageInfo = this.f1172a.getPackageInfo(str, 64);
            if (!(packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            C1202a.m1320d("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e.getMessage());
        }
        C1202a.m1320d("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    /* renamed from: a */
    public EnumC1138a mo15416a(String str) {
        try {
            if (this.f1172a.getApplicationInfo(str, 0).enabled) {
                return EnumC1138a.ENABLED;
            }
            return EnumC1138a.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return EnumC1138a.NOT_INSTALLED;
        }
    }

    /* renamed from: b */
    public int mo15418b(String str) {
        try {
            PackageInfo packageInfo = this.f1172a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    /* renamed from: c */
    public String mo15419c(String str) {
        byte[] d = m1075d(str);
        if (d == null || d.length == 0) {
            return null;
        }
        return C1134d.m1068b(AbstractC1140i.m1088a(d), true);
    }

    /* renamed from: a */
    public boolean mo15417a(String str, String str2) {
        try {
            PackageInfo packageInfo = this.f1172a.getPackageInfo(str, 8);
            if (!(packageInfo == null || packageInfo.providers == null)) {
                for (ProviderInfo providerInfo : packageInfo.providers) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
