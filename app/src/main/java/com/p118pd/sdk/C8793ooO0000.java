package com.p118pd.sdk;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.pd.sdk.ooO0000  reason: case insensitive filesystem */
public class C8793ooO0000 {
    public static final String OooO00o = "FileUtils";

    public static File OooO00o(String str) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                String str2 = "file's parent dir is null, path=" + file.getCanonicalPath();
                return null;
            }
            if (!parentFile.exists()) {
                if (parentFile.getParentFile().exists()) {
                    parentFile.mkdir();
                } else {
                    parentFile.mkdirs();
                }
            }
            if (file.exists() || file.createNewFile()) {
                return file;
            }
            String str3 = "can not create dest file, path=" + str;
            return null;
        } catch (Throwable unused) {
            String str4 = "create dest file error, path=" + str;
            return null;
        }
    }

    public static String OooO0O0(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(47)) <= -1 || lastIndexOf >= str.length() + -1) ? str : str.substring(lastIndexOf + 1);
    }

    public static String OooO0OO(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length()) ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20432OooO00o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str2, true));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean OooO00o(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str, true);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static synchronized void OooO00o(String str, int i, int i2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Exception e;
        Exception e2;
        Throwable th2;
        synchronized (C8793ooO0000.class) {
            File file = new File(str);
            if (file.length() >= ((long) i)) {
                if (file.length() > 2147483647L) {
                    file.delete();
                    return;
                }
                File file2 = new File(str + "_tmp");
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e3) {
                        e2 = e3;
                        fileOutputStream = null;
                        e = e2;
                        try {
                            e.printStackTrace();
                            OooO00o(fileInputStream);
                            OooO00o(fileOutputStream);
                            file2.renameTo(file);
                        } catch (Throwable th3) {
                            th = th3;
                            OooO00o(fileInputStream);
                            OooO00o(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        fileOutputStream = null;
                        th = th2;
                        OooO00o(fileInputStream);
                        OooO00o(fileOutputStream);
                        throw th;
                    }
                    try {
                        long j = (long) i2;
                        fileInputStream.getChannel().position(file.length() - j);
                        fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0, j);
                        OooO00o(fileInputStream);
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        OooO00o(fileInputStream);
                        OooO00o(fileOutputStream);
                        file2.renameTo(file);
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    fileInputStream = null;
                    fileOutputStream = null;
                    e = e2;
                    e.printStackTrace();
                    OooO00o(fileInputStream);
                    OooO00o(fileOutputStream);
                    file2.renameTo(file);
                } catch (Throwable th5) {
                    th2 = th5;
                    fileInputStream = null;
                    fileOutputStream = null;
                    th = th2;
                    OooO00o(fileInputStream);
                    OooO00o(fileOutputStream);
                    throw th;
                }
                OooO00o(fileOutputStream);
                if (file2.exists() && file.delete()) {
                    file2.renameTo(file);
                }
            }
        }
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String OooO00o(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile().exists()) {
                file.mkdir();
            } else {
                file.mkdirs();
            }
        }
        return str + File.separator + str2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20431OooO00o(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf <= -1 || lastIndexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20430OooO00o(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) <= -1 || lastIndexOf >= str.length() + -1) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String OooO00o(Context context) {
        String path = Environment.getExternalStorageDirectory().getPath();
        return path + File.separator + context.getPackageName();
    }
}
