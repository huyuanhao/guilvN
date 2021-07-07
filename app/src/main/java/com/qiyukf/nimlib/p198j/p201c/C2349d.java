package com.qiyukf.nimlib.p198j.p201c;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.qiyukf.nimlib.j.c.d */
public final class C2349d {
    /* renamed from: a */
    public static String m5123a(String str, EnumC2347c cVar) {
        String a = C2345a.m5107a().mo35090a(str, cVar);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        File parentFile = new File(a).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return a;
    }

    /* renamed from: a */
    public static void m5124a(Context context) {
        C2345a.m5107a().mo35091a(context);
    }

    /* renamed from: a */
    public static void m5125a(File file) {
        m5126a(file, false);
    }

    /* renamed from: a */
    public static void m5126a(File file, boolean z) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    m5126a(file2, false);
                }
            }
            if (file.isFile() || !z) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static boolean m5127a() {
        C2345a.m5107a();
        return C2345a.m5109b();
    }

    /* renamed from: a */
    public static boolean m5128a(EnumC2347c cVar) {
        C2345a.m5107a();
        return C2345a.m5109b() && C2345a.m5107a().mo35093c() >= cVar.mo35095b();
    }

    /* renamed from: b */
    public static String m5129b(Context context) {
        String absolutePath;
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 29) {
            absolutePath = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) == null ? "" : context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            sb = new StringBuilder();
        } else {
            absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            sb = new StringBuilder();
        }
        sb.append(absolutePath);
        sb.append("/qiyu/");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m5130b(EnumC2347c cVar) {
        return C2345a.m5107a().mo35089a(cVar);
    }

    /* renamed from: b */
    public static String m5131b(String str, EnumC2347c cVar) {
        return C2345a.m5107a().mo35092b(str, cVar);
    }

    /* renamed from: c */
    public static String m5132c(Context context) {
        String absolutePath;
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 29) {
            absolutePath = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES) == null ? "" : context.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
            sb = new StringBuilder();
        } else {
            absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            sb = new StringBuilder();
        }
        sb.append(absolutePath);
        sb.append("/qiyu/");
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m5133c(EnumC2347c cVar) {
        m5126a(new File(C2345a.m5107a().mo35089a(cVar)), true);
        return true;
    }
}
