package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3524b;
import com.umeng.commonsdk.statistics.common.ULog;

/* renamed from: com.umeng.commonsdk.internal.utils.b */
public class C3532b {

    /* renamed from: b */
    public static final String f9074b = "BaseStationUtils";

    /* renamed from: c */
    public static boolean f9075c;

    /* renamed from: d */
    public static Context f9076d;

    /* renamed from: a */
    public PhoneStateListener f9077a;

    /* renamed from: e */
    public TelephonyManager f9078e;

    /* renamed from: com.umeng.commonsdk.internal.utils.b$a */
    public static class C3534a {

        /* renamed from: a */
        public static final C3532b f9080a = new C3532b(C3532b.f9076d);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private String m9143e() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) f9076d.getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            String simOperator = telephonyManager.getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return null;
            }
            if (!simOperator.equals("46000")) {
                if (!simOperator.equals("46002")) {
                    if (simOperator.equals("46001")) {
                        return "中国联通";
                    }
                    if (simOperator.equals("46003")) {
                        return "中国电信";
                    }
                    return null;
                }
            }
            return "中国移动";
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public synchronized void mo38853c() {
        ULog.m9826e(f9074b, "base station unRegisterListener");
        try {
            if (this.f9078e != null) {
                this.f9078e.listen(this.f9077a, 0);
            }
            f9075c = false;
        } catch (Throwable unused) {
        }
    }

    public C3532b(Context context) {
        this.f9077a = new PhoneStateListener() {
            /* class com.umeng.commonsdk.internal.utils.C3532b.C35331 */

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                String str;
                super.onSignalStrengthsChanged(signalStrength);
                ULog.m9826e(C3532b.f9074b, "base station onSignalStrengthsChanged");
                try {
                    C3532b.this.f9078e = (TelephonyManager) C3532b.f9076d.getSystemService("phone");
                    String[] split = signalStrength.toString().split(" ");
                    String str2 = null;
                    if (C3532b.this.f9078e != null && C3532b.this.f9078e.getNetworkType() == 13) {
                        str = "" + Integer.parseInt(split[9]);
                    } else if (C3532b.this.f9078e == null || !(C3532b.this.f9078e.getNetworkType() == 8 || C3532b.this.f9078e.getNetworkType() == 10 || C3532b.this.f9078e.getNetworkType() == 9 || C3532b.this.f9078e.getNetworkType() == 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((signalStrength.getGsmSignalStrength() * 2) - 113);
                        sb.append("");
                        str = sb.toString();
                    } else {
                        String e = C3532b.this.m9143e();
                        if (!TextUtils.isEmpty(e) && e.equals("中国移动")) {
                            str2 = "0";
                        } else if (!TextUtils.isEmpty(e) && e.equals("中国联通")) {
                            str2 = signalStrength.getCdmaDbm() + "";
                        } else if (!TextUtils.isEmpty(e) && e.equals("中国电信")) {
                            str2 = signalStrength.getEvdoDbm() + "";
                        }
                        str = str2;
                    }
                    ULog.m9826e(C3532b.f9074b, "stationStrength is " + str);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            UMWorkDispatch.sendEvent(C3532b.f9076d, 32772, C3524b.m9071a(C3532b.f9076d).mo38849a(), str);
                        } catch (Throwable unused) {
                        }
                    }
                    C3532b.this.mo38853c();
                } catch (Exception unused2) {
                }
            }
        };
        if (context != null) {
            try {
                this.f9078e = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo38852b() {
        ULog.m9826e(f9074b, "base station registerListener");
        try {
            if (this.f9078e != null) {
                this.f9078e.listen(this.f9077a, 256);
            }
            f9075c = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C3532b m9140a(Context context) {
        if (f9076d == null && context != null) {
            f9076d = context.getApplicationContext();
        }
        return C3534a.f9080a;
    }

    /* renamed from: a */
    public synchronized boolean mo38851a() {
        return f9075c;
    }
}
