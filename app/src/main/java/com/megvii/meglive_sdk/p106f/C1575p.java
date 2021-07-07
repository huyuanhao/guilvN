package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.os.Environment;
import android.text.format.Formatter;
import com.p118pd.sdk.C8794ooO00000;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.megvii.meglive_sdk.f.p */
public final class C1575p {

    /* renamed from: a */
    public static Context f2613a;

    /* renamed from: b */
    public static C1575p f2614b;

    /* renamed from: c */
    public static File f2615c;

    /* renamed from: d */
    public static SimpleDateFormat f2616d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: e */
    public static String f2617e;

    /* renamed from: f */
    public static boolean f2618f = false;

    /* renamed from: a */
    public static void m2664a(Context context) {
        File file;
        if (f2618f) {
            if (f2613a == null || f2614b == null || (file = f2615c) == null || !file.exists()) {
                f2613a = context;
                f2614b = new C1575p();
                f2615c = m2663a();
                new StringBuilder("LogFilePath is: ").append(f2615c.getPath());
                long a = m2662a(f2615c);
                new StringBuilder("Log max size is: ").append(Formatter.formatFileSize(context, 10485760));
                new StringBuilder("log now size is: ").append(Formatter.formatFileSize(context, a));
                if (10485760 < a) {
                    File file2 = new File(f2615c.getParent() + "/lastLog.txt");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    f2615c.renameTo(file2);
                    try {
                        f2615c.createNewFile();
                    } catch (Exception e) {
                        new StringBuilder("Create log file failure !!! ").append(e.toString());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static String m2666b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(f2614b.getClass().getName())) {
                f2617e = stackTraceElement.getFileName();
                return "[" + f2616d.format(new Date()) + " ThreadId:" + Thread.currentThread().getId() + " " + stackTraceElement.getClassName() + " " + stackTraceElement.getMethodName() + " Line:" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2665a(Object obj) {
        File file;
        if (f2618f && f2613a != null && f2614b != null && (file = f2615c) != null && file.exists()) {
            String str = m2666b() + " - " + obj.toString();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f2615c, true));
                bufferedWriter.write(str);
                bufferedWriter.write("\r\n");
                bufferedWriter.flush();
            } catch (Exception e) {
                new StringBuilder("Write failure !!! ").append(e.toString());
            }
        }
    }

    /* renamed from: a */
    public static long m2662a(File file) {
        if (file.exists()) {
            try {
                return (long) new FileInputStream(file).available();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static File m2663a() {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(f2613a.getExternalFilesDir(C8794ooO00000.OooO0O0).getPath() + C8932ooOOO0o.OooO0OO);
        } else {
            file = new File(f2613a.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/logs.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (Exception e) {
                new StringBuilder("Create log file failure !!! ").append(e.toString());
            }
        }
        return file2;
    }
}
