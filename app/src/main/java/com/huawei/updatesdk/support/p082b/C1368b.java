package com.huawei.updatesdk.support.p082b;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.support.p082b.C1366a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.huawei.updatesdk.support.b.b */
public class C1368b {

    /* renamed from: a */
    public static String[] f1661a;

    /* renamed from: a */
    public static long m2034a(String str) {
        long blockSize;
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = (long) statFs.getBlockSize();
                availableBlocks = (long) statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        } catch (IllegalArgumentException e) {
            C1278a.m1581a("StorageManage", "path error", e);
            return 0;
        }
    }

    /* renamed from: a */
    public static C1366a m2035a() {
        Context b = C1294a.m1650a().mo15900b();
        C1366a b2 = (Build.VERSION.SDK_INT >= 24 || C1282a.m1604g() == 0) ? m2038b(b) : m2036a(b);
        if (TextUtils.isEmpty(b2.mo16194a())) {
            return null;
        }
        String str = b2.mo16194a() + File.separator;
        b2.mo16197a(str);
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 24 && !file.setExecutable(true, false)) {
            C1278a.m1584d("StorageManage", "can not set Executeable to AppCache");
        }
        return b2;
    }

    /* renamed from: a */
    public static C1366a m2036a(Context context) {
        String d = m2042d(context);
        File file = new File(d + File.separator + context.getPackageName() + File.separator + "files");
        if (!file.exists() && !file.mkdirs()) {
            C1278a.m1584d("StorageManage", "failed to create file.");
        }
        C1366a aVar = new C1366a();
        String absolutePath = file.getAbsolutePath();
        aVar.mo16199b(m2034a(absolutePath));
        aVar.mo16195a(m2037b(absolutePath));
        aVar.mo16197a(absolutePath);
        aVar.mo16196a(C1366a.EnumC1367a.INNER_SDCARD);
        return aVar;
    }

    /* renamed from: b */
    public static long m2037b(String str) {
        long blockSize;
        long blockCount;
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            blockCount = statFs.getBlockCountLong();
        } else {
            blockSize = (long) statFs.getBlockSize();
            blockCount = (long) statFs.getBlockCount();
        }
        return blockSize * blockCount;
    }

    /* renamed from: b */
    public static C1366a m2038b(Context context) {
        File filesDir = context.getFilesDir();
        C1366a aVar = new C1366a();
        if (filesDir != null) {
            String absolutePath = filesDir.getAbsolutePath();
            aVar.mo16199b(m2034a(absolutePath));
            aVar.mo16195a(m2037b(absolutePath));
            aVar.mo16197a(absolutePath);
        }
        aVar.mo16196a(C1366a.EnumC1367a.SYSTEM_STORAGE);
        return aVar;
    }

    /* renamed from: b */
    public static String[] m2039b() {
        if (f1661a == null) {
            f1661a = m2041c(C1294a.m1650a().mo15900b());
        }
        return (String[]) f1661a.clone();
    }

    /* renamed from: c */
    public static Method m2040c() {
        Method method = null;
        try {
            method = StorageVolume.class.getMethod("isRemovable", new Class[0]);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            C1278a.m1581a("StorageManage", "can not find method:isRemovable", e);
            return method;
        }
    }

    /* renamed from: c */
    public static String[] m2041c(Context context) {
        String d = m2042d(context);
        return new String[]{d + File.separator + "Android" + File.separator + "data" + File.separator + context.getPackageName() + File.separator + "files"};
    }

    /* renamed from: d */
    public static String m2042d(Context context) {
        boolean z;
        String str;
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        StorageVolume[] storageVolumeArr = new StorageVolume[0];
        try {
            Method method = StorageManager.class.getMethod("getVolumeList", new Class[0]);
            method.setAccessible(true);
            storageVolumeArr = (StorageVolume[]) method.invoke(storageManager, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C1278a.m1581a("StorageManage", "can not find method:getVolumeList", e);
        }
        if (storageVolumeArr == null || storageVolumeArr.length <= 0) {
            return null;
        }
        Method c = m2040c();
        Method d = m2043d();
        for (StorageVolume storageVolume : storageVolumeArr) {
            if (c != null) {
                try {
                    z = ((Boolean) c.invoke(storageVolume, new Object[0])).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    C1278a.m1581a("StorageManage", "can not invoke method:getVolumeList", e2);
                }
                str = (String) d.invoke(storageVolume, new Object[0]);
                if (z && !str.contains("usb")) {
                    return str;
                }
            }
            z = false;
            try {
                str = (String) d.invoke(storageVolume, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                C1278a.m1581a("StorageManage", "can not invoke method:getPath", e3);
                str = "";
            }
            if (z) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Method m2043d() {
        Method method = null;
        try {
            method = StorageVolume.class.getMethod("getPath", new Class[0]);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            C1278a.m1581a("StorageManage", "can not find method:getPath", e);
            return method;
        }
    }
}
