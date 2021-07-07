package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ec */
public class C4376ec extends AbstractC4379ef {

    /* renamed from: a */
    public String f11641a;

    public C4376ec(Context context, int i, String str) {
        super(context, i);
        this.f11641a = str;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    private String[] mo41384a() {
        if (TextUtils.isEmpty(this.f11641a)) {
            return null;
        }
        String b = C4282bc.m11793b(this.f11641a);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        if (b.contains(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            return b.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        return new String[]{b};
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int m12153a() {
        return 24;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12154a() {
        return EnumC4496hq.AppIsInstalled;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12155a() {
        String[] a = mo41384a();
        if (a == null || a.length <= 0) {
            return null;
        }
        PackageManager packageManager = ((AbstractC4379ef) this).f11645a.getPackageManager();
        StringBuilder sb = new StringBuilder();
        for (String str : a) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 16384);
                if (packageInfo != null) {
                    if (sb.length() > 0) {
                        sb.append(C7522o0Ooo0o.OooO0O0);
                    }
                    sb.append(packageInfo.applicationInfo.loadLabel(packageManager).toString());
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo.packageName);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo.versionName);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(packageInfo.versionCode);
                }
            } catch (Exception unused) {
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
