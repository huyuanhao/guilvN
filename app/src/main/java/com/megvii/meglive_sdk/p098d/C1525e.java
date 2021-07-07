package com.megvii.meglive_sdk.p098d;

import android.content.Context;
import android.text.TextUtils;
import com.megvii.meglive_sdk.listener.DetectCallback;
import com.megvii.meglive_sdk.listener.PreCallback;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1583x;
import com.megvii.meglive_sdk.p106f.C1585z;
import com.megvii.meglive_sdk.p106f.EnumC1568j;

/* renamed from: com.megvii.meglive_sdk.d.e */
public class C1525e {

    /* renamed from: j */
    public static volatile boolean f2158j;

    /* renamed from: k */
    public static volatile boolean f2159k;

    /* renamed from: a */
    public Context f2160a;

    /* renamed from: b */
    public String f2161b;

    /* renamed from: c */
    public long f2162c;

    /* renamed from: d */
    public String f2163d;

    /* renamed from: e */
    public int f2164e;

    /* renamed from: f */
    public DetectCallback f2165f;

    /* renamed from: g */
    public String f2166g;

    /* renamed from: h */
    public String f2167h;

    /* renamed from: i */
    public PreCallback f2168i;

    /* renamed from: com.megvii.meglive_sdk.d.e$OooO00o */
    public static final class OooO00o {
        public static final C1525e OooO00o = new C1525e((byte) 0);
    }

    public /* synthetic */ C1525e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C1525e m2307a() {
        return OooO00o.OooO00o;
    }

    /* renamed from: b */
    public static String m2309b() {
        return "MegLiveStill 3.3.1A";
    }

    /* renamed from: b */
    public static void m2310b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            C1585z.m2694a(context, "megvii_liveness_manifest_package", str);
        }
    }

    /* renamed from: c */
    public static String m2311c() {
        return "42c0340ca614f43d0b66ec5e8f540a95f9475277,42,20190905195706";
    }

    /* renamed from: d */
    public final boolean mo17005d() {
        synchronized (C1525e.class) {
            if (f2158j) {
                mo17004a(EnumC1568j.REQUEST_FREQUENTLY, (String) null);
                return true;
            }
            f2158j = true;
            return false;
        }
    }

    public C1525e() {
        this.f2164e = 0;
        this.f2166g = "";
        this.f2167h = "";
    }

    /* renamed from: a */
    public static boolean m2308a(Context context, String str) {
        return context == null || str == null || str.equals("");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        com.megvii.meglive_sdk.p106f.C1585z.m2694a(r17.f2160a, "megvii_liveness_host", r21);
        r3 = com.megvii.meglive_sdk.manager.C1589a.m2698a(r17.f2160a);
        r7 = r17.f2166g;
        r3.f2655d = com.megvii.meglive_sdk.p106f.C1553a.m2618a();
        r3.f2653b = new com.megvii.meglive_sdk.p098d.C1521a();
        r3.f2654c = new com.megvii.meglive_sdk.p098d.C1522b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        if (com.megvii.meglive_sdk.p097c.C1518a.m2292a(r3.f2652a) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        com.megvii.meglive_sdk.manager.C1589a.m2701a(com.megvii.meglive_sdk.p106f.EnumC1568j.f2591t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        com.megvii.action.fmp.liveness.lib.p090b.C1458b.m2159a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (com.megvii.action.fmp.liveness.lib.p089a.C1454b.m2157a() != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        com.megvii.meglive_sdk.manager.C1589a.m2701a(com.megvii.meglive_sdk.p106f.EnumC1568j.f2577f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        if (com.megvii.meglive_sdk.p106f.C1563e.m2627a(r3.f2652a) <= 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        r0 = java.util.UUID.randomUUID().toString();
        com.megvii.action.fmp.liveness.lib.p090b.C1458b.m2159a();
        r0 = com.megvii.action.fmp.liveness.lib.jni.MegAuth.nativeGetContext(r0, "MegLiveStill 3.0.0A");
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2.put("biz_token", r19);
        r2.put("auth_msg", r0);
        r2.put("version", "MegLiveStill 3.3.1A");
        r2.put("bundle_id", r3.f2652a.getPackageName());
        r2.put("key", r3.f2655d);
        r2.put("is_update_license", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        com.megvii.meglive_sdk.p106f.C1571m.m2656b(com.umeng.commonsdk.proguard.C3617o.f9329P, "delta = " + r2.toString());
        r0 = com.megvii.action.fmp.liveness.lib.p090b.C1459c.m2160a(r2);
        r11 = com.megvii.meglive_sdk.p097c.C1519b.m2293a();
        r12 = r3.f2652a;
        r16 = new com.megvii.meglive_sdk.manager.C1589a.C15901(r3, r4, r19, r21, r7);
        com.megvii.meglive_sdk.p106f.C1571m.m2655a("grantAccess", "bizToken = ".concat(java.lang.String.valueOf(r19)));
        com.megvii.meglive_sdk.p106f.C1571m.m2655a("grantAccess", "data = ".concat(java.lang.String.valueOf(r0)));
        com.megvii.meglive_sdk.p106f.C1571m.m2655a("grantAccess", "URL = " + com.megvii.meglive_sdk.p106f.C1556ac.m2621a(r21));
        r14 = new java.util.HashMap();
        r14.put("biz_token", r19);
        r14.put("data", r0);
        r15 = new java.util.HashMap();
        r15.put("User-Agent", new com.megvii.meglive_sdk.p106f.C1579t(r12).mo17197c());
        r11.mo16991a(r12, com.megvii.meglive_sdk.p106f.C1556ac.m2621a(r21), r14, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018d, code lost:
        r0.printStackTrace();
        r3.mo17220a(r4, r19, r21, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0193, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[Catch:{ all -> 0x0197 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17002a(android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.megvii.meglive_sdk.listener.PreCallback r22) {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.p098d.C1525e.mo17002a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.megvii.meglive_sdk.listener.PreCallback):void");
    }

    /* renamed from: a */
    public final void mo17003a(EnumC1568j jVar) {
        PreCallback preCallback = this.f2168i;
        if (preCallback != null) {
            preCallback.onPreFinish(this.f2161b, jVar.f2599E, jVar.f2600F);
        }
        if (jVar != EnumC1568j.REQUEST_FREQUENTLY) {
            f2159k = false;
        }
        if (jVar != EnumC1568j.REQUEST_FREQUENTLY) {
            this.f2168i = null;
        }
    }

    /* renamed from: a */
    public final void mo17001a(int i, String str, String str2) {
        DetectCallback detectCallback = this.f2165f;
        if (detectCallback != null) {
            detectCallback.onDetectFinish(this.f2161b, i, str, "".equals(str2) ? null : str2);
            this.f2165f = null;
        }
        if (i != EnumC1568j.REQUEST_FREQUENTLY.f2599E) {
            f2158j = false;
            f2159k = false;
            this.f2163d = "";
            this.f2166g = "";
            this.f2167h = "";
            StringBuilder sb = new StringBuilder("failedType=");
            sb.append(str);
            sb.append(",delta is ");
            sb.append((str2 == null || "".equals(str2)) ? "null" : "not null");
            C1571m.m2655a("onDetectFinish", sb.toString());
            this.f2161b = "";
            C1583x.m2691b();
            C1585z.m2694a(this.f2160a, "megvii_liveness_bizToken", "");
        }
    }

    /* renamed from: a */
    public final void mo17004a(EnumC1568j jVar, String str) {
        mo17001a(jVar.f2599E, jVar.f2600F, str);
    }
}
