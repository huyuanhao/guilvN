package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;

/* renamed from: com.pd.sdk.oo000oo  reason: case insensitive filesystem */
public final class C8518oo000oo {
    public static C8518oo000oo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21648OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21649OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public C8518oo000oo(Context context) {
        this.f21648OooO00o = context;
        this.OooO0OO = context.getFilesDir().getPath();
    }

    public static C8518oo000oo OooO00o(Context context) {
        C8518oo000oo oo000oo;
        synchronized (C8518oo000oo.class) {
            if (OooO00o == null) {
                OooO00o = new C8518oo000oo(context);
            }
            oo000oo = OooO00o;
        }
        return oo000oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private String m20186OooO00o(Context context) {
        String str = (String) AbstractC8521oo00O00.OooO00o(AbstractC8521oo00O00.OooO00o(context, "analytics_key"), "analytics_key", (Object) "");
        if (TextUtils.isEmpty(str)) {
            SharedPreferences OooO00o2 = AbstractC8521oo00O00.OooO00o(context, "Privacy_MY");
            String str2 = (String) AbstractC8521oo00O00.OooO00o(OooO00o2, "PrivacyData", (Object) "");
            if (TextUtils.isEmpty(str2)) {
                String OooO00o3 = AbstractC8522oo00O000.OooO00o();
                OooO00o(OooO00o2, OooO00o3);
                return OooO00o3;
            }
            Pair<byte[], String> OooO00o4 = AbstractC8486oo00.OooO00o(str2);
            return AbstractC8486oo00.OooO0O0(OooO0OO(), (byte[]) OooO00o4.first, (String) OooO00o4.second);
        }
        Pair<byte[], String> OooO00o5 = AbstractC8486oo00.OooO00o(str);
        String OooO0O02 = AbstractC8486oo00.OooO0O0(OooO0OO(), (byte[]) OooO00o5.first, (String) OooO00o5.second);
        if (!TextUtils.isEmpty(OooO0O02)) {
            return OooO0O02;
        }
        String OooO00o6 = AbstractC8522oo00O000.OooO00o();
        OooO00o(AbstractC8521oo00O00.OooO00o(context, "Privacy_MY"), OooO00o6);
        return OooO00o6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[SYNTHETIC, Splitter:B:33:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064 A[SYNTHETIC, Splitter:B:41:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006e A[SYNTHETIC, Splitter:B:47:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String OooO00o(java.io.File r12) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8518oo000oo.OooO00o(java.io.File):java.lang.String");
    }

    private String OooO00o(File file, String str) {
        if (!file.exists()) {
            return "";
        }
        return OooO00o(new File(file.getPath(), "hianalytics_" + str));
    }

    private String OooO00o(String str, String str2) {
        File file;
        String OooO00o2 = OooO00o(new File(OooO0o0() + File.separator + str), str);
        if (TextUtils.isEmpty(OooO00o2)) {
            OooO00o2 = OooO00o(new File(OooO0o0() + File.separator + "hianalytics" + File.separator + str2), str2);
            if (TextUtils.isEmpty(OooO00o2)) {
                OooO00o2 = AbstractC8522oo00O000.OooO0O0();
                File file2 = new File(OooO0o0() + File.separator + "hianalytics" + File.separator + str2);
                if (!file2.exists() && file2.mkdirs()) {
                    AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "The secret key file creates the OK!");
                }
                file = new File(OooO0o0() + File.separator + "hianalytics" + File.separator + str2, "hianalytics_" + str2);
            }
            return OooO00o2;
        }
        File file3 = new File(OooO0o0() + File.separator + str);
        C8524oo00O00o.OooO00o(file3);
        if (file3.isDirectory() && file3.delete()) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "The secret key file is Directory del! change new file");
        }
        File file4 = new File(OooO0o0() + File.separator + "hianalytics" + File.separator + str2);
        if (!file4.exists() && file4.mkdirs()) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "The secret key file creates the OK!");
        }
        file = new File(OooO0o0() + File.separator + "hianalytics" + File.separator + str2, "hianalytics_" + str2);
        m20187OooO00o(file, OooO00o2);
        return OooO00o2;
    }

    private void OooO00o() {
        m20187OooO00o(new File(OooO0o0() + File.separator + "hianalytics" + File.separator + "aprpap", "hianalytics_aprpap"), AbstractC8522oo00O000.OooO0O0());
        m20187OooO00o(new File(OooO0o0() + File.separator + "hianalytics" + File.separator + "febdoc", "hianalytics_febdoc"), AbstractC8522oo00O000.OooO0O0());
        m20187OooO00o(new File(OooO0o0() + File.separator + "hianalytics" + File.separator + "marfil", "hianalytics_marfil"), AbstractC8522oo00O000.OooO0O0());
        m20187OooO00o(new File(OooO0o0() + File.separator + "hianalytics" + File.separator + "maywnj", "hianalytics_maywnj"), AbstractC8522oo00O000.OooO0O0());
    }

    private void OooO00o(SharedPreferences sharedPreferences, String str) {
        byte[] OooO00o2 = AbstractC8486oo00.OooO00o();
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC8521oo00O00.m20194OooO00o(sharedPreferences, "PrivacyData", (Object) AbstractC8486oo00.OooO00o(OooO00o2, AbstractC8486oo00.OooO00o(OooO0OO(), OooO00o2, str)));
        AbstractC8521oo00O00.m20194OooO00o(sharedPreferences, "flashKeyTime", (Object) Long.valueOf(currentTimeMillis));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[Catch:{ all -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC, Splitter:B:28:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20187OooO00o(java.io.File r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "OutputStream not closed"
            java.lang.String r1 = "HiAnalytics/event/aes128key"
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002b, IOException -> 0x0023 }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x002b, IOException -> 0x0023 }
            java.lang.String r5 = "UTF-8"
            byte[] r5 = r6.getBytes(r5)     // Catch:{ FileNotFoundException -> 0x001f, IOException -> 0x001d, all -> 0x001a }
            r3.write(r5)     // Catch:{ FileNotFoundException -> 0x001f, IOException -> 0x001d, all -> 0x001a }
            r3.flush()     // Catch:{ FileNotFoundException -> 0x001f, IOException -> 0x001d, all -> 0x001a }
            r3.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0039
        L_0x001a:
            r5 = move-exception
            r2 = r3
            goto L_0x003a
        L_0x001d:
            r2 = r3
            goto L_0x0023
        L_0x001f:
            r2 = r3
            goto L_0x002b
        L_0x0021:
            r5 = move-exception
            goto L_0x003a
        L_0x0023:
            java.lang.String r5 = "saveInfoToFile(): io exc from write info to file!"
            com.p118pd.sdk.AbstractC8536oo00OO0O.OooO0OO(r1, r5)     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x002b:
            java.lang.String r5 = "saveInfoToFile(): No files need to be read"
            com.p118pd.sdk.AbstractC8536oo00OO0O.OooO0OO(r1, r5)     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x0039
        L_0x0032:
            r2.close()
            goto L_0x0039
        L_0x0036:
            com.p118pd.sdk.AbstractC8536oo00OO0O.OooO0OO(r1, r0)
        L_0x0039:
            return
        L_0x003a:
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            com.p118pd.sdk.AbstractC8536oo00OO0O.OooO0OO(r1, r0)
        L_0x0043:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8518oo000oo.m20187OooO00o(java.io.File, java.lang.String):void");
    }

    public static String OooO0O0() {
        String OooO00o2 = AbstractC8526oo00O0O0.OooO00o();
        String OooO00o3 = C8490oo00000o.OooO00o();
        String OooO0OO2 = AbstractC8522oo00O000.OooO0OO();
        return AbstractC8526oo00O0O0.OooO00o(OooO00o2 + OooO00o3 + OooO0OO2, 4);
    }

    private String OooO0OO() {
        if (TextUtils.isEmpty(this.f21649OooO00o)) {
            this.f21649OooO00o = OooO0Oo();
        }
        return this.f21649OooO00o;
    }

    private String OooO0Oo() {
        return AbstractC8526oo00O0O0.OooO00o(OooO0O0(), OooO00o("secondAssembly", "aprpap"), OooO00o("thirdAssembly", "febdoc"), OooO00o("fourthAssembly", "marfil"), OooO00o("fiveAssembly", "maywnj"));
    }

    private String OooO0o0() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20188OooO00o() {
        if (TextUtils.isEmpty(this.OooO0O0)) {
            this.OooO0O0 = m20186OooO00o(this.f21648OooO00o);
        }
        return this.OooO0O0;
    }

    public void OooO00o(String str, int i) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str) && i == 1) {
            long longValue = ((Long) AbstractC8521oo00O00.OooO00o(AbstractC8521oo00O00.OooO00o(this.f21648OooO00o, "analytics_key"), "flashKeyTime", (Object) -1L)).longValue();
            if (longValue == -1) {
                sharedPreferences = AbstractC8521oo00O00.OooO00o(this.f21648OooO00o, "Privacy_MY");
                longValue = ((Long) AbstractC8521oo00O00.OooO00o(sharedPreferences, "flashKeyTime", (Object) -1L)).longValue();
            } else {
                AbstractC8521oo00O00.OooO00o(this.f21648OooO00o, "../shared_prefs/", "analytics_key");
                sharedPreferences = AbstractC8521oo00O00.OooO00o(this.f21648OooO00o, "Privacy_MY");
                OooO00o(sharedPreferences, str);
                this.OooO0O0 = str;
            }
            if (System.currentTimeMillis() - longValue > 43200000) {
                this.OooO0O0 = str;
                long longValue2 = ((Long) AbstractC8521oo00O00.OooO00o(sharedPreferences, "assemblyFlash", (Object) -1L)).longValue();
                if (longValue2 == -1) {
                    AbstractC8521oo00O00.m20194OooO00o(sharedPreferences, "assemblyFlash", (Object) Long.valueOf(System.currentTimeMillis()));
                } else if (System.currentTimeMillis() - longValue2 > 31536000000L) {
                    OooO00o();
                    AbstractC8521oo00O00.m20194OooO00o(sharedPreferences, "assemblyFlash", (Object) Long.valueOf(System.currentTimeMillis()));
                    this.f21649OooO00o = OooO0Oo();
                }
                OooO00o(sharedPreferences, str);
            }
        }
    }
}
