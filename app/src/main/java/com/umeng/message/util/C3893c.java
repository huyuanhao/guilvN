package com.umeng.message.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.netease.nimlib.util.NetworkUtil;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.proguard.C3819h;
import java.net.URLEncoder;

/* renamed from: com.umeng.message.util.c */
public class C3893c {

    /* renamed from: a */
    public static final int f10598a = 1;

    /* renamed from: b */
    public static final int f10599b = 2;

    /* renamed from: c */
    public static final int f10600c = 3;

    /* renamed from: i */
    public static final String f10601i = "com.umeng.message.util.c";

    /* renamed from: d */
    public final int f10602d = 1;

    /* renamed from: e */
    public String f10603e;

    /* renamed from: f */
    public String f10604f = "10.0.0.172";

    /* renamed from: g */
    public int f10605g = 80;

    /* renamed from: h */
    public Context f10606h;

    public C3893c(Context context) {
        this.f10606h = context;
        this.f10603e = m10700a(context);
    }

    /* renamed from: a */
    private boolean m10701a() {
        String extraInfo;
        if (this.f10606h.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f10606h.getPackageName()) != 0) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f10606h.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1 || (extraInfo = activeNetworkInfo.getExtraInfo()) == null || (!extraInfo.equals(NetworkUtil.f15258OooO0o) && !extraInfo.equals(NetworkUtil.f15247OooO) && !extraInfo.equals(NetworkUtil.f15262OooO0oO))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo40153a(byte[] r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.util.C3893c.mo40153a(byte[], java.lang.String):byte[]");
    }

    /* renamed from: a */
    private String m10700a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(MsgConstant.SDK_VERSION);
        stringBuffer.append(C8932ooOOO0o.OooO0OO);
        stringBuffer.append(MsgConstant.SDK_VERSION);
        stringBuffer.append(" ");
        try {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(UmengMessageDeviceConfig.getApplicationLable(context));
            stringBuffer2.append(C8932ooOOO0o.OooO0OO);
            stringBuffer2.append(UmengMessageDeviceConfig.getAppVersionName(context));
            stringBuffer2.append(" ");
            stringBuffer2.append(Build.MODEL);
            stringBuffer2.append(C8932ooOOO0o.OooO0OO);
            stringBuffer2.append(Build.VERSION.RELEASE);
            stringBuffer2.append(" ");
            stringBuffer2.append(C3819h.m10542a(PushAgent.getInstance(context).getMessageAppkey()));
            stringBuffer.append(URLEncoder.encode(stringBuffer2.toString(), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
