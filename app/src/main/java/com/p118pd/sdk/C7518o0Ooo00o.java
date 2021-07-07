package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0Ooo00o  reason: case insensitive filesystem */
public class C7518o0Ooo00o {
    public static final String OooO = "client_key";
    public static Context OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C7518o0Ooo00o f20363OooO00o = null;
    public static final String OooO0o = "tidinfo";
    public static final String OooO0o0 = "alipay_tid_storage";
    public static final String OooO0oO = "upgraded_from_db";
    public static final String OooO0oo = "tid";
    public static final String OooOO0 = "timestamp";
    public static final String OooOO0O = "vimei";
    public static final String OooOO0o = "vimsi";

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f20364OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20365OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20366OooO00o = false;
    public String OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r5 != null) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0O0() {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7518o0Ooo00o.OooO0O0():void");
    }

    private String OooO0o() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    private void OooO0o0() {
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m19168OooO0OO() {
        C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.getVirtualImei " + this.OooO0OO);
        return this.OooO0OO;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m19169OooO0Oo() {
        C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.getVirtualImsi " + this.OooO0Oo);
        return this.OooO0Oo;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public String m19170OooO0o0() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public static synchronized C7518o0Ooo00o OooO00o(Context context) {
        C7518o0Ooo00o o0ooo00o;
        synchronized (C7518o0Ooo00o.class) {
            if (f20363OooO00o == null) {
                C7620o0oOOOoo.OooO0O0("TidStorage", "getInstance");
                f20363OooO00o = new C7518o0Ooo00o();
            }
            if (OooO00o == null) {
                f20363OooO00o.m19161OooO00o(context);
            }
            o0ooo00o = f20363OooO00o;
        }
        return o0ooo00o;
    }

    /* renamed from: com.pd.sdk.o0Ooo00o$OooO00o */
    public static class OooO00o {
        public static String OooO00o() {
            return "!@#23457";
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public static boolean m19172OooO00o(String str, String str2) {
            if (C7518o0Ooo00o.OooO00o == null) {
                return false;
            }
            return C7518o0Ooo00o.OooO00o.getSharedPreferences(str, 0).contains(str2);
        }

        public static boolean OooO0O0(String str, String str2) {
            if (C7518o0Ooo00o.OooO00o == null) {
                return false;
            }
            return C7518o0Ooo00o.OooO00o.getSharedPreferences(str, 0).contains(str2);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public static void m19171OooO00o(String str, String str2) {
            if (C7518o0Ooo00o.OooO00o != null) {
                C7518o0Ooo00o.OooO00o.getSharedPreferences(str, 0).edit().remove(str2).apply();
            }
        }

        public static String OooO0O0() {
            String str;
            try {
                str = C7518o0Ooo00o.OooO00o.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C7620o0oOOOoo.m19257OooO00o(th);
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = "unknow";
            }
            return (str + "00000000").substring(0, 8);
        }

        public static String OooO00o(String str, String str2) {
            return OooO00o(str, str2, true);
        }

        public static String OooO00o(String str, String str2, boolean z) {
            String str3;
            if (C7518o0Ooo00o.OooO00o == null) {
                return null;
            }
            String string = C7518o0Ooo00o.OooO00o.getSharedPreferences(str, 0).getString(str2, null);
            if (TextUtils.isEmpty(string) || !z) {
                str3 = string;
            } else {
                String OooO0O0 = OooO0O0();
                str3 = C7488o0OoOO.OooO0O0(string, OooO0O0);
                if (TextUtils.isEmpty(str3)) {
                    str3 = C7488o0OoOO.OooO0O0(string, OooO00o());
                    if (!TextUtils.isEmpty(str3)) {
                        OooO00o(str, str2, str3, true);
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    String.format("LocalPreference::getLocalPreferences failed %s，%s", string, OooO0O0);
                    C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.save LocalPreference::getLocalPreferences failed");
                }
            }
            C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.save LocalPreference::getLocalPreferences value " + string);
            return str3;
        }

        public static void OooO00o(String str, String str2, String str3) {
            OooO00o(str, str2, str3, true);
        }

        public static void OooO00o(String str, String str2, String str3, boolean z) {
            if (C7518o0Ooo00o.OooO00o != null) {
                SharedPreferences sharedPreferences = C7518o0Ooo00o.OooO00o.getSharedPreferences(str, 0);
                if (z) {
                    String OooO0O0 = OooO0O0();
                    String OooO00o = C7488o0OoOO.OooO00o(str3, OooO0O0);
                    if (TextUtils.isEmpty(OooO00o)) {
                        String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, OooO0O0);
                    }
                    str3 = OooO00o;
                }
                sharedPreferences.edit().putString(str2, str3).apply();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0OO() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7518o0Ooo00o.OooO0OO():void");
    }

    private void OooO0Oo() {
        this.f20365OooO00o = "";
        this.OooO0O0 = m19170OooO0o0();
        this.f20364OooO00o = System.currentTimeMillis();
        this.OooO0OO = OooO0o();
        this.OooO0Oo = OooO0o();
        OooO00o.m19171OooO00o(OooO0o0, OooO0o);
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    private void m19162OooO0o() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f20365OooO00o);
            jSONObject.put(OooO, this.OooO0O0);
            jSONObject.put("timestamp", this.f20364OooO00o);
            jSONObject.put(OooOO0O, this.OooO0OO);
            jSONObject.put(OooOO0o, this.OooO0Oo);
            OooO00o.OooO00o(OooO0o0, OooO0o, jSONObject.toString(), true);
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m19161OooO00o(Context context) {
        if (context != null) {
            C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.initialize context != null");
            OooO00o = context.getApplicationContext();
        }
        if (!this.f20366OooO00o) {
            this.f20366OooO00o = true;
            OooO0O0();
            OooO0OO();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19163OooO00o() {
        C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.getTid " + this.f20365OooO00o);
        return this.f20365OooO00o;
    }

    private boolean OooO00o(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19165OooO00o() {
        return TextUtils.isEmpty(this.f20365OooO00o) || TextUtils.isEmpty(this.OooO0O0) || TextUtils.isEmpty(this.OooO0OO) || TextUtils.isEmpty(this.OooO0Oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19164OooO00o() {
        String format = String.format("TidStorage::delete > %s，%s，%s，%s，%s", this.f20365OooO00o, this.OooO0O0, Long.valueOf(this.f20364OooO00o), this.OooO0OO, this.OooO0Oo);
        C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.delete " + format);
        OooO0Oo();
    }

    public Long OooO00o() {
        return Long.valueOf(this.f20364OooO00o);
    }

    public void OooO00o(String str, String str2) {
        C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.save " + ("tid=" + str + ",clientKey=" + str2));
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f20365OooO00o = str;
            this.OooO0O0 = str2;
            this.f20364OooO00o = System.currentTimeMillis();
            m19162OooO0o();
            OooO0o0();
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m19166OooO0O0() {
        C7620o0oOOOoo.OooO0O0("TidStorage", "TidStorage.getClientKey " + this.OooO0O0);
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19167OooO0O0() {
        return m19165OooO00o();
    }

    private void OooO00o(String str, String str2, String str3, String str4, Long l) {
        if (!OooO00o(str, str2, str3, str4)) {
            this.f20365OooO00o = str;
            this.OooO0O0 = str2;
            this.OooO0OO = str3;
            this.OooO0Oo = str4;
            if (l == null) {
                this.f20364OooO00o = System.currentTimeMillis();
            } else {
                this.f20364OooO00o = l.longValue();
            }
            m19162OooO0o();
        }
    }
}
