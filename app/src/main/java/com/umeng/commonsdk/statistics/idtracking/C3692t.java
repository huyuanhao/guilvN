package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3745b;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.t */
public class C3692t extends AbstractC3672a {

    /* renamed from: a */
    public static final String f9678a = "uuid";

    /* renamed from: e */
    public static final String f9679e = "yosuid";

    /* renamed from: f */
    public static final String f9680f = "23346339";

    /* renamed from: b */
    public Context f9681b = null;

    /* renamed from: c */
    public String f9682c = null;

    /* renamed from: d */
    public String f9683d = null;

    public C3692t(Context context) {
        super(f9678a);
        this.f9681b = context;
        this.f9682c = null;
        this.f9683d = null;
    }

    /* renamed from: a */
    public static String m9955a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        if (r1 != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ed, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x011e, code lost:
        if (r1 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0120, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de A[SYNTHETIC, Splitter:B:45:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5 A[SYNTHETIC, Splitter:B:49:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ed A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ff A[SYNTHETIC, Splitter:B:65:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0106 A[SYNTHETIC, Splitter:B:69:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d A[SYNTHETIC, Splitter:B:73:0x010d] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011b A[SYNTHETIC, Splitter:B:82:0x011b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m9956b(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.C3692t.m9956b(java.lang.String):java.lang.String");
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3672a
    /* renamed from: f */
    public String mo39245f() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        try {
            if (!FieldManager.allow(C3745b.f9869z) || TextUtils.isEmpty(m9955a("ro.yunos.version", "")) || this.f9681b == null || (sharedPreferences = PreferenceWrapper.getDefault(this.f9681b)) == null) {
                return null;
            }
            String string = sharedPreferences.getString(f9679e, "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String b = m9956b(f9680f);
            this.f9683d = b;
            if (!(TextUtils.isEmpty(b) || this.f9681b == null || sharedPreferences == null || (edit = sharedPreferences.edit()) == null)) {
                edit.putString(f9679e, this.f9683d).commit();
            }
            return this.f9683d;
        } catch (Exception unused) {
            return null;
        }
    }
}
