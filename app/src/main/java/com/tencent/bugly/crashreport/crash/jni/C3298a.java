package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.crashreport.crash.C3285b;
import com.tencent.bugly.crashreport.crash.C3287c;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3322ao;
import com.tencent.bugly.proguard.C3325ap;
import java.util.Map;

/* renamed from: com.tencent.bugly.crashreport.crash.jni.a */
public class C3298a implements NativeExceptionHandler {

    /* renamed from: a */
    public final Context f7932a;

    /* renamed from: b */
    public final C3285b f7933b;

    /* renamed from: c */
    public final C3269a f7934c;

    /* renamed from: d */
    public final C3272a f7935d;

    public C3298a(Context context, C3269a aVar, C3285b bVar, C3272a aVar2) {
        this.f7932a = context;
        this.f7933b = bVar;
        this.f7934c = aVar;
        this.f7935d = aVar2;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, int i3, String str5, int i4, int i5, int i6, String str6, String str7) {
        C3321an.m8349a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i, i2, j, j2, str, str2, str3, str4, i3, str5, i4, i5, i6, str6, str7, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleNativeException2(int r28, int r29, long r30, long r32, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, int r38, java.lang.String r39, int r40, int r41, int r42, java.lang.String r43, java.lang.String r44, java.lang.String[] r45) {
        /*
        // Method dump skipped, instructions count: 682
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.jni.C3298a.handleNativeException2(int, int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public CrashDetailBean packageCrashDatas(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z, boolean z2) {
        int i;
        String str12;
        int indexOf;
        boolean l = C3287c.m8145a().mo38268l();
        if (l) {
            C3321an.m8357e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f7774b = 1;
        crashDetailBean.f7777e = this.f7934c.mo38165h();
        C3269a aVar = this.f7934c;
        crashDetailBean.f7778f = aVar.f7692p;
        crashDetailBean.f7779g = aVar.mo38180w();
        crashDetailBean.f7785m = this.f7934c.mo38163g();
        crashDetailBean.f7786n = str3;
        String str13 = "";
        crashDetailBean.f7787o = l ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : str13;
        crashDetailBean.f7788p = str4;
        if (str5 != null) {
            str13 = str5;
        }
        crashDetailBean.f7789q = str13;
        crashDetailBean.f7790r = j;
        crashDetailBean.f7793u = C3325ap.m8415b(str13.getBytes());
        crashDetailBean.f7750A = str;
        crashDetailBean.f7751B = str2;
        crashDetailBean.f7758I = this.f7934c.mo38182y();
        crashDetailBean.f7780h = this.f7934c.mo38179v();
        crashDetailBean.f7781i = this.f7934c.mo38134J();
        crashDetailBean.f7794v = str8;
        NativeCrashHandler instance = NativeCrashHandler.getInstance();
        String dumpFilePath = instance != null ? instance.getDumpFilePath() : null;
        String a = C3299b.m8215a(dumpFilePath, str8);
        if (!C3325ap.m8404a(a)) {
            crashDetailBean.f7771V = a;
        }
        crashDetailBean.f7772W = C3299b.m8220c(dumpFilePath);
        crashDetailBean.f7795w = C3299b.m8214a(str9, C3287c.f7846e, C3287c.f7849h, C3287c.f7854m);
        crashDetailBean.f7796x = C3299b.m8214a(str10, C3287c.f7846e, null, true);
        crashDetailBean.f7760K = str7;
        crashDetailBean.f7761L = str6;
        crashDetailBean.f7762M = str11;
        crashDetailBean.f7755F = this.f7934c.mo38173p();
        crashDetailBean.f7756G = this.f7934c.mo38172o();
        crashDetailBean.f7757H = this.f7934c.mo38174q();
        if (z) {
            crashDetailBean.f7752C = C3270b.m8045i();
            crashDetailBean.f7753D = C3270b.m8041g();
            crashDetailBean.f7754E = C3270b.m8049k();
            if (crashDetailBean.f7795w == null) {
                crashDetailBean.f7795w = C3325ap.m8388a(this.f7932a, C3287c.f7846e, C3287c.f7849h);
            }
            crashDetailBean.f7797y = C3322ao.m8366a();
            C3269a aVar2 = this.f7934c;
            crashDetailBean.f7763N = aVar2.f7646a;
            crashDetailBean.f7764O = aVar2.mo38149a();
            crashDetailBean.f7766Q = this.f7934c.mo38132H();
            crashDetailBean.f7767R = this.f7934c.mo38133I();
            crashDetailBean.f7768S = this.f7934c.mo38126B();
            crashDetailBean.f7769T = this.f7934c.mo38131G();
            crashDetailBean.f7798z = C3325ap.m8396a(C3287c.f7847f, false);
            int indexOf2 = crashDetailBean.f7789q.indexOf("java:\n");
            if (indexOf2 > 0 && (i = indexOf2 + 6) < crashDetailBean.f7789q.length()) {
                String str14 = crashDetailBean.f7789q;
                String substring = str14.substring(i, str14.length() - 1);
                if (substring.length() > 0 && crashDetailBean.f7798z.containsKey(crashDetailBean.f7751B) && (indexOf = (str12 = crashDetailBean.f7798z.get(crashDetailBean.f7751B)).indexOf(substring)) > 0) {
                    String substring2 = str12.substring(indexOf);
                    crashDetailBean.f7798z.put(crashDetailBean.f7751B, substring2);
                    crashDetailBean.f7789q = crashDetailBean.f7789q.substring(0, i);
                    crashDetailBean.f7789q += substring2;
                }
            }
            if (str == null) {
                crashDetailBean.f7750A = this.f7934c.f7681e;
            }
            this.f7933b.mo38248c(crashDetailBean);
        } else {
            crashDetailBean.f7752C = -1;
            crashDetailBean.f7753D = -1;
            crashDetailBean.f7754E = -1;
            if (crashDetailBean.f7795w == null) {
                crashDetailBean.f7795w = "this crash is occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.f7763N = -1;
            crashDetailBean.f7766Q = -1;
            crashDetailBean.f7767R = -1;
            crashDetailBean.f7768S = map;
            crashDetailBean.f7769T = this.f7934c.mo38131G();
            crashDetailBean.f7798z = null;
            if (str == null) {
                crashDetailBean.f7750A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f7797y = bArr;
            }
        }
        return crashDetailBean;
    }
}
