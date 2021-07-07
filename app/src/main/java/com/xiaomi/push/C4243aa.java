package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.io.File;

/* renamed from: com.xiaomi.push.aa */
public class C4243aa {
    /* renamed from: a */
    public static long m11621a() {
        File externalStorageDirectory;
        if (!m11623b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m11622a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m11623b() {
        try {
            return true ^ Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m11624c() {
        return m11621a() <= 102400;
    }

    /* renamed from: d */
    public static boolean m11625d() {
        return !m11623b() && !m11624c() && !m11622a();
    }
}
