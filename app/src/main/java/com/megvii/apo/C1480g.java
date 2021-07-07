package com.megvii.apo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.format.Formatter;
import com.megvii.apo.util.C1493c;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1500j;
import com.p118pd.sdk.C5982OoooOoO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

/* renamed from: com.megvii.apo.g */
public final class C1480g extends AbstractC1486m {
    public C1480g(Context context) {
        super(context);
    }

    /* renamed from: b */
    public static String m2208b() {
        String str = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(C1493c.m2253a("7SDLt6eE94k4I3MgHA7rsw==")), 8192);
            str = bufferedReader.readLine().split("\\s+")[1];
            bufferedReader.close();
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        int ceil = str != null ? (int) Math.ceil(Float.valueOf(Float.valueOf(str).floatValue() / 1048576.0f).doubleValue()) : 0;
        return ceil + "GB";
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        long j;
        long j2;
        long j3;
        long j4;
        if (C1500j.f2058m == 1) {
            try {
                map.put("101010010", m2208b());
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) this.f1983a.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
                map.put("101010011", Formatter.formatFileSize(this.f1983a, memoryInfo.availMem));
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                if (Build.VERSION.SDK_INT < 18) {
                    j = (long) statFs.getBlockSize();
                    j2 = (long) statFs.getBlockCount();
                } else {
                    j = statFs.getBlockSizeLong();
                    j2 = statFs.getBlockCountLong();
                }
                map.put("101010012", Formatter.formatFileSize(this.f1983a, j2 * j));
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                if (Build.VERSION.SDK_INT < 18) {
                    j3 = (long) statFs2.getBlockSize();
                    j4 = (long) statFs2.getAvailableBlocks();
                } else {
                    j3 = statFs2.getBlockSizeLong();
                    j4 = statFs2.getAvailableBlocksLong();
                }
                map.put("101010013", Formatter.formatFileSize(this.f1983a, j4 * j3));
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }
}
