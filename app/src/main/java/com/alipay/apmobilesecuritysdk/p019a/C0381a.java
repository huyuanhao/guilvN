package com.alipay.apmobilesecuritysdk.p019a;

import android.content.Context;
import android.os.Environment;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.p020b.C0382a;
import com.alipay.apmobilesecuritysdk.p021c.C0383a;
import com.alipay.apmobilesecuritysdk.p022d.C0390e;
import com.alipay.apmobilesecuritysdk.p023e.C0391a;
import com.alipay.apmobilesecuritysdk.p023e.C0392b;
import com.alipay.apmobilesecuritysdk.p023e.C0393c;
import com.alipay.apmobilesecuritysdk.p023e.C0394d;
import com.alipay.apmobilesecuritysdk.p023e.C0397g;
import com.alipay.apmobilesecuritysdk.p023e.C0398h;
import com.alipay.apmobilesecuritysdk.p023e.C0399i;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7581o0o0O00o;
import com.p118pd.sdk.C7582o0o0O0O;
import com.p118pd.sdk.C7602o0o0Oo00;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.a.a */
public final class C0381a {

    /* renamed from: a */
    public Context f864a;

    /* renamed from: b */
    public C0382a f865b = C0382a.m738a();

    /* renamed from: c */
    public int f866c = 4;

    public C0381a(Context context) {
        this.f864a = context;
    }

    /* renamed from: a */
    public static String m731a(Context context) {
        String b = m735b(context);
        return C7559o0o00OOo.m19210OooO00o(b) ? C0398h.m800f(context) : b;
    }

    /* renamed from: a */
    public static String m732a(Context context, String str) {
        try {
            m736b();
            String a = C0399i.m804a(str);
            if (!C7559o0o00OOo.m19210OooO00o(a)) {
                return a;
            }
            String a2 = C0397g.m783a(context, str);
            C0399i.m808a(str, a2);
            return !C7559o0o00OOo.m19210OooO00o(a2) ? a2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m733a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        for (int i = 0; i < 3; i++) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse2);
                    instance.add(13, random);
                    Date time = instance.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private C7582o0o0O0O m734b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        C0392b b;
        C0392b c;
        String str4 = "";
        try {
            Context context = this.f864a;
            C7602o0o0Oo00 o0o0oo00 = new C7602o0o0Oo00();
            String OooO00o = C7559o0o00OOo.OooO00o(map, DispatchConstants.APP_NAME, str4);
            String OooO00o2 = C7559o0o00OOo.OooO00o(map, "sessionId", str4);
            String OooO00o3 = C7559o0o00OOo.OooO00o(map, "rpcVersion", str4);
            String a = m732a(context, OooO00o);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String d = C0398h.m796d(context);
            if (C7559o0o00OOo.m19212OooO0O0(OooO00o2)) {
                o0o0oo00.OooO0OO = OooO00o2;
            } else {
                o0o0oo00.OooO0OO = a;
            }
            o0o0oo00.OooO0Oo = securityToken;
            o0o0oo00.OooO0o0 = d;
            o0o0oo00.OooO00o = "android";
            C0393c c2 = C0394d.m771c(context);
            if (c2 != null) {
                str = c2.f874a;
                str2 = c2.f876c;
            } else {
                str2 = str4;
                str = str2;
            }
            if (C7559o0o00OOo.m19210OooO00o(str) && (c = C0391a.m764c(context)) != null) {
                str = c.f871a;
                str2 = c.f873c;
            }
            C0393c b2 = C0394d.m769b();
            if (b2 != null) {
                str4 = b2.f874a;
                str3 = b2.f876c;
            } else {
                str3 = str4;
            }
            if (C7559o0o00OOo.m19210OooO00o(str4) && (b = C0391a.m762b()) != null) {
                str4 = b.f871a;
                str3 = b.f873c;
            }
            o0o0oo00.OooO0oO = str;
            o0o0oo00.OooO0o = str4;
            o0o0oo00.OooO = OooO00o3;
            if (C7559o0o00OOo.m19210OooO00o(str)) {
                o0o0oo00.OooO0O0 = str4;
                o0o0oo00.OooO0oo = str3;
            } else {
                o0o0oo00.OooO0O0 = str;
                o0o0oo00.OooO0oo = str2;
            }
            o0o0oo00.f20431OooO00o = C0390e.m754a(context, map);
            return C7581o0o0O00o.m19222OooO00o(this.f864a, this.f865b.mo4187c()).OooO00o(o0o0oo00);
        } catch (Throwable th) {
            th.printStackTrace();
            C0383a.m744a(th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m735b(Context context) {
        try {
            String b = C0399i.m810b();
            if (!C7559o0o00OOo.m19210OooO00o(b)) {
                return b;
            }
            C0393c b2 = C0394d.m770b(context);
            if (b2 != null) {
                C0399i.m807a(b2);
                String str = b2.f874a;
                if (C7559o0o00OOo.m19212OooO0O0(str)) {
                    return str;
                }
            }
            C0392b b3 = C0391a.m763b(context);
            if (b3 == null) {
                return "";
            }
            C0399i.m806a(b3);
            String str2 = b3.f871a;
            return C7559o0o00OOo.m19212OooO0O0(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m736b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file = new File(externalStorageDirectory, ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d3 A[Catch:{ Exception -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ff A[Catch:{ Exception -> 0x023c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4184a(java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
        // Method dump skipped, instructions count: 579
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.p019a.C0381a.mo4184a(java.util.Map):int");
    }
}
