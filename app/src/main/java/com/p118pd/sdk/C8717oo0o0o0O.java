package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.jinhui365.template.TemplateApplication;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.pd.sdk.oo0o0o0O  reason: case insensitive filesystem */
public class C8717oo0o0o0O {
    public static C8717oo0o0o0O OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21891OooO00o = "user.txt";
    public static final String OooO0O0 = "user.data";
    public static String OooO0OO = "USER_ENCRYPT_SETTING";
    public static String OooO0Oo = "IS_USER_INFO_ENCRYPT";
    public static String OooO0o0 = "ENCRYPT_SEED_PATH";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21892OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9038ooOoO0oO f21893OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f21894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ExecutorService f21895OooO00o;

    /* renamed from: com.pd.sdk.oo0o0o0O$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(String str) {
            this.o0ooOOo = str;
        }

        public void run() {
            C8717oo0o0o0O.this.OooO00o((C8717oo0o0o0O) C8717oo0o0o0O.OooO0O0);
            C8717oo0o0o0O.this.f21893OooO00o.OooO00o((Serializable) this.o0ooOOo, C8717oo0o0o0O.this.m20337OooO00o());
            C8717oo0o0o0O.this.OooO00o((C8717oo0o0o0O) true);
        }
    }

    public C8717oo0o0o0O() {
        OooO0Oo();
        SharedPreferences sharedPreferences = TemplateApplication.OooO00o().getSharedPreferences(OooO0OO, 0);
        String string = sharedPreferences.getString(OooO0o0, "");
        if ("".equals(string)) {
            string = new C9051ooOoOOoO().OooO00o(8, "ilus");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(OooO0o0, string);
            edit.commit();
        }
        OooO0O0(string);
    }

    private void OooO0Oo() {
        if (this.f21895OooO00o == null) {
            this.f21895OooO00o = Executors.newSingleThreadExecutor();
        }
    }

    public void OooO0O0(String str) {
        try {
            this.f21893OooO00o = new C9038ooOoO0oO(str);
        } catch (Exception e) {
            C8717oo0o0o0O.class.toString();
            e.getMessage();
        }
    }

    public void OooO0OO() {
        String str;
        String str2;
        String str3;
        Map<String, Object> OooO0o = C8706oo0o0OO0.OooO00o().OooO0o();
        StringBuilder sb = new StringBuilder();
        sb.append(OooO0o.get("logUidField"));
        String str4 = "";
        sb.append(str4);
        String sb2 = sb.toString();
        String str5 = OooO0o.get("logRelatedUidField") + str4;
        String str6 = OooO0o.get("logMobileField") + str4;
        Map<String, String> map = this.f21894OooO00o;
        if (map != null) {
            if (map.get(sb2) == null) {
                str3 = str4;
            } else {
                str3 = map.get(sb2) + str4;
            }
            if (map.get(str5) == null) {
                str = str4;
            } else {
                str = map.get(str5) + str4;
            }
            if (map.get(str6) != null) {
                str4 = map.get(str6) + str4;
            }
            str2 = str4;
            str4 = str3;
        } else {
            str2 = str4;
            str = str2;
        }
        LogCollectorManager.sharedInstance().setUid(str4).setRelatedUid(str).setMobile(str2);
        if (C9054ooOoOo0.OooO0Oo(str4)) {
            C8715oo0o0o00.OooO00o(TemplateApplication.OooO00o()).OooO00o(str4, "uid");
        } else {
            C8715oo0o0o00.OooO00o(TemplateApplication.OooO00o()).OooO0O0(str4, "uid");
        }
    }

    public void OooO0O0() {
        if (this.f21894OooO00o == null) {
            Object obj = null;
            if (m20338OooO00o()) {
                try {
                    obj = this.f21893OooO00o.OooO00o(m20337OooO00o());
                } catch (Exception e) {
                    C8717oo0o0o0O.class.toString();
                    e.getMessage();
                }
            } else {
                obj = m20340OooO00o();
                if (obj instanceof String) {
                    this.f21893OooO00o.OooO00o((Serializable) obj, m20337OooO00o());
                    OooO00o(true);
                }
            }
            if (obj != null && (obj instanceof String)) {
                this.f21894OooO00o = C9041ooOoOO0.OooO00o((String) obj, String.class, String.class);
            }
            OooO0OO();
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "获取原生本地存储用户信息");
            hashMap.put("userVO", C9041ooOoOO0.OooO00o(hashMap));
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m20339OooO00o() {
        return this.f21892OooO00o;
    }

    public void OooO00o(Context context) {
        this.f21892OooO00o = context;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: OooO00o  reason: collision with other method in class */
    private String m20337OooO00o() {
        return this.f21892OooO00o.getFilesDir().getPath().toString() + C8932ooOOO0o.OooO0OO + OooO0O0;
    }

    public static C8717oo0o0o0O OooO00o() {
        if (OooO00o == null) {
            synchronized (C8717oo0o0o0O.class) {
                if (OooO00o == null) {
                    OooO00o = new C8717oo0o0o0O();
                }
            }
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20342OooO00o(String str) {
        this.f21895OooO00o.submit(new OooO00o(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20341OooO00o() {
        this.f21894OooO00o = null;
        SharedPreferences.Editor edit = TemplateApplication.OooO00o().getSharedPreferences(OooO0OO, 0).edit();
        edit.clear();
        edit.commit();
        File OooO00o2 = OooO00o(OooO0O0);
        if (OooO00o2 != null && OooO00o2.exists()) {
            OooO00o2.delete();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private File OooO00o(String str) {
        Context context = this.f21892OooO00o;
        File file = null;
        if (context == null) {
            return null;
        }
        try {
            file = context.getFileStreamPath(str);
            if (!file.exists()) {
                file.createNewFile();
                Runtime.getRuntime().exec("chmod 766 " + file.getAbsolutePath());
            }
        } catch (Exception e) {
            C8717oo0o0o0O.class.toString();
            e.getMessage();
        }
        return file;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20338OooO00o() {
        return TemplateApplication.OooO00o().getSharedPreferences(OooO0OO, 0).getBoolean(OooO0Oo, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(boolean z) {
        SharedPreferences.Editor edit = TemplateApplication.OooO00o().getSharedPreferences(OooO0OO, 0).edit();
        edit.putBoolean(OooO0Oo, z);
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d A[SYNTHETIC, Splitter:B:34:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006a A[SYNTHETIC, Splitter:B:39:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007d A[SYNTHETIC, Splitter:B:48:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[SYNTHETIC, Splitter:B:53:0x008a] */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m20340OooO00o() {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8717oo0o0o0O.m20340OooO00o():java.lang.Object");
    }
}
