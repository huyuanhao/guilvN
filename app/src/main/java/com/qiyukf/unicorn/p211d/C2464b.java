package com.qiyukf.unicorn.p211d;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.p118pd.sdk.C5982OoooOoO;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.nimlib.C2180b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.qiyukf.unicorn.d.b */
public final class C2464b {
    /* renamed from: a */
    public static String m5397a() {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("   time: ", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
        linkedHashMap.put(" device: ", Build.MANUFACTURER + " " + Build.MODEL);
        linkedHashMap.put("android: ", Build.VERSION.RELEASE);
        linkedHashMap.put(" system: ", Build.DISPLAY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) C2180b.m4471a().getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
        linkedHashMap.put("    ram: ", String.valueOf(memoryInfo.availMem));
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                long blockSizeLong = statFs.getBlockSizeLong();
                long blockCountLong = statFs.getBlockCountLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong();
                jArr[0] = blockCountLong * blockSizeLong;
                jArr[1] = blockSizeLong * availableBlocksLong;
            } else {
                long blockSize = (long) statFs.getBlockSize();
                jArr[0] = ((long) statFs.getBlockCount()) * blockSize;
                jArr[1] = blockSize * ((long) statFs.getAvailableBlocks());
            }
        }
        long j = jArr[0];
        long j2 = jArr[1];
        if (j <= 0) {
            str = "--";
        } else {
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf((float) ((j2 * 100) / j));
            if (j >= 1073741824) {
                float f = (float) (j / 1073741824);
                str2 = String.format(Locale.US, "%.02f GB", Float.valueOf(f));
            } else if (j >= 1048576) {
                float f2 = (float) (j / 1048576);
                str2 = String.format(Locale.US, "%.02f MB", Float.valueOf(f2));
            } else {
                float f3 = (float) (j / 1024);
                str2 = String.format(Locale.US, "%.02f KB", Float.valueOf(f3));
            }
            objArr[1] = str2;
            str = String.format(locale, "%.01f%% [%s]", objArr);
        }
        linkedHashMap.put("   disk: ", str);
        linkedHashMap.put("network: ", C1861b.m3535h(C2180b.m4471a()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry != null) {
                sb.append((String) entry.getKey());
                sb.append((String) entry.getValue());
                sb.append(System.getProperty("line.separator"));
            }
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("========================");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }
}
