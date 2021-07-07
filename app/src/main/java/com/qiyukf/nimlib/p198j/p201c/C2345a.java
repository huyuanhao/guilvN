package com.qiyukf.nimlib.p198j.p201c;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.IOException;

/* renamed from: com.qiyukf.nimlib.j.c.a */
public final class C2345a {

    /* renamed from: b */
    public static C2345a f4696b;

    /* renamed from: a */
    public String f4697a = null;

    /* renamed from: a */
    public static long m5106a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static synchronized C2345a m5107a() {
        C2345a aVar;
        synchronized (C2345a.class) {
            if (f4696b == null) {
                f4696b = new C2345a();
            }
            aVar = f4696b;
        }
        return aVar;
    }

    /* renamed from: a */
    private String m5108a(String str, EnumC2347c cVar, boolean z) {
        String str2 = mo35089a(cVar) + str;
        File file = new File(str2);
        return z ? (!file.exists() || file.isDirectory()) ? "" : str2 : str2;
    }

    /* renamed from: b */
    public static boolean m5109b() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: a */
    public final String mo35089a(EnumC2347c cVar) {
        return this.f4697a + cVar.mo35094a();
    }

    /* renamed from: a */
    public final String mo35090a(String str, EnumC2347c cVar) {
        return m5108a(str, cVar, false);
    }

    /* renamed from: a */
    public final void mo35091a(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            this.f4697a = C8932ooOOO0o.OooO0OO;
            return;
        }
        this.f4697a = externalFilesDir.getAbsolutePath().concat(C8932ooOOO0o.OooO0OO).concat("com.qiyukf.unicorn/");
        File file = new File(this.f4697a);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        EnumC2347c[] values = EnumC2347c.values();
        boolean z = true;
        for (EnumC2347c cVar : values) {
            File file2 = new File(this.f4697a + cVar.mo35094a());
            boolean exists = file2.exists();
            if (!exists) {
                exists = file2.mkdirs();
            }
            z &= exists;
        }
        if (z) {
            File file3 = new File(this.f4697a + "/.nomedia");
            try {
                if (!file3.exists()) {
                    file3.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final String mo35092b(String str, EnumC2347c cVar) {
        return TextUtils.isEmpty(str) ? "" : m5108a(str, cVar, true);
    }

    /* renamed from: c */
    public final long mo35093c() {
        return m5106a(this.f4697a);
    }
}
