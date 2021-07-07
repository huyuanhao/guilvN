package com.umeng.socialize.p275b.p277b;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.umeng.socialize.utils.SLog;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.umeng.socialize.b.b.a */
public class C3914a {

    /* renamed from: com.umeng.socialize.b.b.a$a */
    public static class C3916a implements Comparator<File> {
        public C3916a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            return file.lastModified() == file2.lastModified() ? 0 : -1;
        }
    }

    /* renamed from: a */
    public static void m10782a() {
        if (Environment.getExternalStorageDirectory() != null && !TextUtils.isEmpty(Environment.getExternalStorageDirectory().getPath())) {
            C3918c.f10698d = Environment.getExternalStorageDirectory().getPath() + File.separator + C3918c.f10699e + File.separator;
        } else {
            C3918c.f10698d = Environment.getDataDirectory().getPath() + File.separator + C3918c.f10699e + File.separator;
        }
        File file = new File(C3918c.f10698d);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            m10783a(C3918c.f10698d);
        } catch (Exception e) {
            SLog.error(e);
        }
    }

    /* renamed from: b */
    public static void m10784b() {
        m10782a();
    }

    /* renamed from: c */
    public static int m10785c() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        double availableBlocks = (double) statFs.getAvailableBlocks();
        double blockSize = (double) statFs.getBlockSize();
        Double.isNaN(availableBlocks);
        Double.isNaN(blockSize);
        return (int) ((availableBlocks * blockSize) / 1048576.0d);
    }

    /* renamed from: a */
    public static void m10783a(String str) {
        File[] listFiles = new File(str).listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            int i = 0;
            for (File file : listFiles) {
                i = (int) (((long) i) + file.length());
            }
            if (i > 0 || 40 > m10785c()) {
                Arrays.sort(listFiles, new C3916a());
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }
    }
}
