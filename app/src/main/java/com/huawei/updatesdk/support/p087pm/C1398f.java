package com.huawei.updatesdk.support.p087pm;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.huawei.updatesdk.support.pm.f */
public class C1398f {

    /* renamed from: a */
    public static int f1723a = -1;

    /* renamed from: a */
    public static boolean m2128a(File file, File file2) {
        boolean z = false;
        if (!file.renameTo(file2)) {
            if (!m2130b(file, file2)) {
                C1278a.m1584d("PkgManageUtils", "can not copy the file to new Path");
                return false;
            }
            z = true;
        }
        if (z && !file.delete()) {
            C1278a.m1584d("PkgManageUtils", "can not delete old file");
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m2129a(InputStream inputStream, File file) {
        try {
            if (file.exists() && !file.delete()) {
                C1278a.m1582b("PkgManageUtils", "destFile delete error.");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                }
                try {
                    return true;
                } catch (IOException e2) {
                    return true;
                }
            } finally {
                try {
                    fileOutputStream.flush();
                } catch (IOException e3) {
                    C1278a.m1581a("PkgManageUtils", "", e3);
                }
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException e4) {
                    C1278a.m1581a("PkgManageUtils", "", e4);
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e22) {
                    C1278a.m1581a("PkgManageUtils", "", e22);
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m2130b(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return m2129a(fileInputStream, file2);
            } finally {
                fileInputStream.close();
            }
        } catch (IOException unused) {
            C1278a.m1584d("PkgManageUtils", "copyFile IOException");
            return false;
        }
    }
}
