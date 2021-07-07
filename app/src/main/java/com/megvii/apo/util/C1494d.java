package com.megvii.apo.util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/* renamed from: com.megvii.apo.util.d */
public final class C1494d {
    /* renamed from: a */
    public static boolean m2255a() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: b */
    public static String m2256b() {
        try {
            if (!m2255a()) {
                return null;
            }
            File file = new File(C1500j.f2047b + "/daxb");
            if (!file.exists()) {
                C1495e.m2257a("文件不存在");
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return new String(bArr);
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m2254a(String str) {
        try {
            if (m2255a()) {
                File file = new File(C1500j.f2047b);
                File file2 = new File(file + "/daxb");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2));
                outputStreamWriter.write(str);
                outputStreamWriter.close();
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }
}
