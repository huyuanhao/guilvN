package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.mobilesecuritysdk.face.SecurityClientMobile;
import com.umeng.message.proguard.C3848l;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0OoO  reason: case insensitive filesystem */
public class C7476o0OoO {
    public static C7476o0OoO OooO00o = null;
    public static final String OooO0Oo = "virtualImeiAndImsi";
    public static final String OooO0o = "virtual_imsi";
    public static final String OooO0o0 = "virtual_imei";

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20298OooO00o;
    public String OooO0O0 = "sdk-and-lite";
    public String OooO0OO;

    public C7476o0OoO() {
        String OooO00o2 = C7528o0OooOoo.OooO00o();
        if (!C7528o0OooOoo.m19191OooO00o()) {
            this.OooO0O0 += '_' + OooO00o2;
        }
    }

    private String OooO0O0(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    private String OooO0Oo() {
        return "1";
    }

    private String OooO0Oo(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getBSSID() : "00";
    }

    private String OooO0o() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    private String OooO0o0() {
        return "-1;-1";
    }

    public String OooO0OO() {
        String str;
        Context OooO00o2 = C7515o0Ooo00.OooO00o().m19156OooO00o();
        SharedPreferences sharedPreferences = OooO00o2.getSharedPreferences(OooO0Oo, 0);
        String string = sharedPreferences.getString(OooO0o, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(C7518o0Ooo00o.OooO00o(OooO00o2).m19163OooO00o())) {
            String OooO00o3 = C7515o0Ooo00.OooO00o().m19158OooO00o();
            if (TextUtils.isEmpty(OooO00o3)) {
                str = OooO0o();
            } else {
                str = OooO00o3.substring(3, 18);
            }
        } else {
            str = C7520o0Ooo0O0.m19173OooO00o(OooO00o2).OooO00o();
        }
        sharedPreferences.edit().putString(OooO0o, str).commit();
        return str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19106OooO00o() {
        return this.OooO0OO;
    }

    public static synchronized C7476o0OoO OooO00o() {
        C7476o0OoO o0ooo;
        synchronized (C7476o0OoO.class) {
            if (OooO00o == null) {
                OooO00o = new C7476o0OoO();
            }
            o0ooo = OooO00o;
        }
        return o0ooo;
    }

    public String OooO0O0() {
        String str;
        Context OooO00o2 = C7515o0Ooo00.OooO00o().m19156OooO00o();
        SharedPreferences sharedPreferences = OooO00o2.getSharedPreferences(OooO0Oo, 0);
        String string = sharedPreferences.getString(OooO0o0, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(C7518o0Ooo00o.OooO00o(OooO00o2).m19163OooO00o())) {
            str = OooO0o();
        } else {
            str = C7520o0Ooo0O0.m19173OooO00o(OooO00o2).OooO0O0();
        }
        sharedPreferences.edit().putString(OooO0o0, str).commit();
        return str;
    }

    public synchronized void OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            PreferenceManager.getDefaultSharedPreferences(C7515o0Ooo00.OooO00o().m19156OooO00o()).edit().putString(C7483o0OoO0Oo.OooO, str).commit();
            C7722o0ooOOO0.OooO0OO = str;
        }
    }

    private String OooO0O0(Context context, HashMap<String, String> hashMap) {
        try {
            return (String) Executors.newFixedThreadPool(2).submit(new CallableC7489o0OoOO00(this, context, hashMap)).get(3000, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOOOO, C7482o0OoO0OO.OooOo00, th);
            return "";
        }
    }

    private String OooO0OO(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getSSID() : "-1";
    }

    public String OooO00o(C7518o0Ooo00o o0ooo00o) {
        Context OooO00o2 = C7515o0Ooo00.OooO00o().m19156OooO00o();
        C7520o0Ooo0O0 OooO00o3 = C7520o0Ooo0O0.m19173OooO00o(OooO00o2);
        if (TextUtils.isEmpty(this.f20298OooO00o)) {
            String OooO0O02 = C7531o0Oooo0o.OooO0O0();
            String OooO0OO2 = C7531o0Oooo0o.OooO0OO();
            String OooO0O03 = C7531o0Oooo0o.OooO0O0(OooO00o2);
            String OooO0Oo2 = C7531o0Oooo0o.OooO0Oo(OooO00o2);
            String OooO0OO3 = C7531o0Oooo0o.OooO0OO(OooO00o2);
            String OooO0O04 = OooO0O0(OooO00o2);
            this.f20298OooO00o = "Msp/15.6.8" + " (" + OooO0O02 + C7522o0Ooo0o.OooO0O0 + OooO0OO2 + C7522o0Ooo0o.OooO0O0 + OooO0O03 + C7522o0Ooo0o.OooO0O0 + OooO0Oo2 + C7522o0Ooo0o.OooO0O0 + OooO0OO3 + C7522o0Ooo0o.OooO0O0 + OooO0O04;
        }
        String b = C7520o0Ooo0O0.OooO00o(OooO00o2).mo4245b();
        String OooO0o02 = C7531o0Oooo0o.OooO0o0(OooO00o2);
        String OooO0Oo3 = OooO0Oo();
        String OooO00o4 = OooO00o3.OooO00o();
        String OooO0O05 = OooO00o3.OooO0O0();
        String OooO0OO4 = OooO0OO();
        String OooO0O06 = OooO0O0();
        if (o0ooo00o != null) {
            this.OooO0OO = o0ooo00o.m19166OooO0O0();
        }
        String replace = Build.MANUFACTURER.replace(C7522o0Ooo0o.OooO0O0, " ");
        String replace2 = Build.MODEL.replace(C7522o0Ooo0o.OooO0O0, " ");
        boolean OooO00o5 = C7515o0Ooo00.m19155OooO00o();
        String OooO0Oo4 = OooO00o3.OooO0Oo();
        String OooO0OO5 = OooO0OO(OooO00o2);
        String OooO0Oo5 = OooO0Oo(OooO00o2);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20298OooO00o);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(b);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0o02);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0Oo3);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO00o4);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0O05);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(this.OooO0OO);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(replace);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(replace2);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO00o5);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0Oo4);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0o0());
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(this.OooO0O0);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0OO4);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0O06);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0OO5);
        sb.append(C7522o0Ooo0o.OooO0O0);
        sb.append(OooO0Oo5);
        if (o0ooo00o != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("tid", C7518o0Ooo00o.OooO00o(OooO00o2).m19163OooO00o());
            hashMap.put("utdid", C7515o0Ooo00.OooO00o().m19158OooO00o());
            String OooO0O07 = OooO0O0(OooO00o2, hashMap);
            if (!TextUtils.isEmpty(OooO0O07)) {
                sb.append(C7522o0Ooo0o.OooO0O0);
                sb.append(OooO0O07);
            }
        }
        sb.append(C3848l.f10402t);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public String OooO00o(Context context, HashMap<String, String> hashMap) {
        String str;
        try {
            str = SecurityClientMobile.GetApdid(context, hashMap);
        } catch (Throwable th) {
            C7620o0oOOOoo.m19257OooO00o(th);
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOOOO, C7482o0OoO0OO.OooOOo, th);
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            C7477o0OoO0.OooO00o(C7482o0OoO0OO.OooOOOO, C7482o0OoO0OO.OooOOoo, "apdid == null");
        }
        C7620o0oOOOoo.OooO0Oo(C7494o0OoOOOo.OooO00o, "apdid:" + str);
        return str;
    }

    public String OooO00o(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append(C3848l.f10401s);
            sb.append(packageName);
            sb.append(C7522o0Ooo0o.OooO0O0);
            sb.append(packageInfo.versionCode);
            sb.append(C3848l.f10402t);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
