package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.C3516a;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.umeng.commonsdk.internal.utils.i */
public class C3545i {

    /* renamed from: a */
    public static final String f9120a = "/.um/.umm.dat";

    /* renamed from: b */
    public static final String f9121b = "/.uxx/.cca.dat";

    /* renamed from: c */
    public static final String f9122c = "/.cc/.adfwe.dat";

    /* renamed from: d */
    public static final String f9123d = "/.a.dat";

    /* renamed from: e */
    public static final String f9124e = "umdat";

    /* renamed from: a */
    public static void m9175a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String g = m9185g(context);
            if (TextUtils.isEmpty(g) || !str.equals(g)) {
                m9178b(context, str);
            }
        }
    }

    /* renamed from: b */
    public static String m9177b(Context context) {
        return m9186h(context);
    }

    /* renamed from: c */
    public static String m9179c(Context context) {
        return m9180c(context, f9120a);
    }

    /* renamed from: d */
    public static String m9181d(Context context) {
        return m9180c(context, f9121b);
    }

    /* renamed from: e */
    public static String m9183e(Context context) {
        return m9180c(context, f9122c);
    }

    /* renamed from: f */
    public static String m9184f(Context context) {
        return m9180c(context, f9123d);
    }

    /* renamed from: g */
    public static String m9185g(Context context) {
        return m9187i(context);
    }

    /* renamed from: h */
    public static String m9186h(Context context) {
        return C3516a.m9023a(context, C3617o.f9376e, (String) null);
    }

    /* renamed from: i */
    public static String m9187i(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9124e, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("u", null);
        }
        return null;
    }

    /* renamed from: b */
    public static void m9178b(Context context, String str) {
        m9176a(context, str, f9120a);
        m9176a(context, str, f9121b);
        m9176a(context, str, f9122c);
        m9176a(context, str, f9123d);
        m9182d(context, str);
    }

    /* renamed from: c */
    public static String m9180c(Context context, String str) {
        String externalStorageState;
        try {
            if (!DeviceConfig.checkPermission(context, "android.permission.READ_EXTERNAL_STORAGE") || (externalStorageState = Environment.getExternalStorageState()) == null || !externalStorageState.equalsIgnoreCase("mounted")) {
                return null;
            }
            if (!new File(Environment.getExternalStorageDirectory() + str).exists()) {
                return null;
            }
            FileChannel channel = new RandomAccessFile(Environment.getExternalStorageDirectory() + str, "rw").getChannel();
            FileLock tryLock = channel.tryLock();
            StringBuilder sb = new StringBuilder();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            allocate.clear();
            while (channel.read(allocate) != -1) {
                byte[] bArr = new byte[allocate.position()];
                for (int i = 0; i < allocate.position(); i++) {
                    bArr[i] = allocate.get(i);
                }
                sb.append(new String(bArr));
                allocate.clear();
            }
            if (channel != null) {
                tryLock.release();
            }
            channel.close();
            return sb.toString();
        } catch (Exception e) {
            ULog.m9823e("getFileUmtt:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static void m9182d(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9124e, 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("u", null);
            if (string == null || !string.equals(str)) {
                sharedPreferences.edit().putString("u", str).commit();
            }
        }
    }

    /* renamed from: a */
    public static String m9174a(Context context) {
        String b = m9177b(context);
        if (b == null || b.equals("")) {
            b = m9185g(context);
        }
        if (b == null || b.equals("")) {
            b = m9179c(context);
        }
        if (b == null || b.equals("")) {
            b = m9181d(context);
        }
        if (b == null || b.equals("")) {
            b = m9183e(context);
        }
        return (b == null || b.equals("")) ? m9184f(context) : b;
    }

    /* renamed from: a */
    public static void m9176a(Context context, String str, String str2) {
        if (DeviceConfig.checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            try {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equalsIgnoreCase("mounted")) {
                    String c = m9180c(context, str2);
                    if (c == null || !c.equals(str)) {
                        File file = new File(Environment.getExternalStorageDirectory() + str2);
                        if (file.getParentFile() != null && !file.getParentFile().exists()) {
                            file.getParentFile().mkdir();
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(Environment.getExternalStorageDirectory() + str2, "rw");
                        randomAccessFile.setLength((long) str.getBytes().length);
                        FileChannel channel = randomAccessFile.getChannel();
                        FileLock tryLock = channel.tryLock();
                        ByteBuffer allocate = ByteBuffer.allocate(1024);
                        allocate.clear();
                        allocate.put(str.getBytes());
                        allocate.flip();
                        while (allocate.hasRemaining()) {
                            channel.write(allocate);
                        }
                        channel.force(true);
                        if (tryLock != null) {
                            tryLock.release();
                        }
                        channel.close();
                    }
                }
            } catch (Exception e) {
                ULog.m9823e("saveFileUmtt:" + e.getMessage());
            }
        }
    }
}
