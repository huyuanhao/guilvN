package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.netease.nimlib.util.NetworkUtil;
import com.netease.nimlib.util.storage.NimStorageType;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0ooo  reason: case insensitive filesystem */
public class C8774oo0ooo {
    public static final long OooO00o = 1048576;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21951OooO00o = "LogHelper";
    public static final long OooO0O0 = 512000;

    public static List<String> OooO00o(String str) {
        String OooO00o2 = C8884ooO0oo0O.OooO00o("rts_net.log", NimStorageType.TYPE_LOG);
        String OooO00o3 = C8884ooO0oo0O.OooO00o("nrtc_engine.log", NimStorageType.TYPE_LOG);
        String OooO00o4 = C8884ooO0oo0O.OooO00o("nrtc_net.log", NimStorageType.TYPE_LOG);
        String OooO00o5 = C8884ooO0oo0O.OooO00o("nrtc_detect.log", NimStorageType.TYPE_LOG);
        ArrayList arrayList = new ArrayList(6);
        if (str != null && new File(str).exists()) {
            arrayList.add(str);
        }
        if (OooO00o2 != null) {
            File file = new File(OooO00o2);
            if (file.exists() && file.length() <= C5555IiIL.OooO0OO) {
                arrayList.add(OooO00o2);
            }
        }
        if (OooO00o4 != null && new File(OooO00o4).exists()) {
            arrayList.add(OooO00o4);
        }
        if (OooO00o3 != null && new File(OooO00o3).exists()) {
            arrayList.add(OooO00o3);
        }
        if (OooO00o5 != null && new File(OooO00o5).exists()) {
            arrayList.add(OooO00o5);
        }
        return arrayList;
    }

    public static String OooO0O0(boolean z) {
        String OooO0OO = OooO0OO();
        if (!z) {
            return OooO0OO;
        }
        if (TextUtils.isEmpty(OooO0OO)) {
            AbstractC8796ooO0000o.OooO0OO("LogHelper", "get sdk mlog path error");
            return null;
        }
        return OooO00o(OooO0OO, C8884ooO0oo0O.OooO0O0("nim_sdk_" + System.currentTimeMillis() + ".mlog", NimStorageType.TYPE_LOG));
    }

    public static String OooO0OO(boolean z) {
        String OooO0O02 = OooO0O0(z);
        if (TextUtils.isEmpty(OooO0O02)) {
            OooO0O02 = OooO00o(z);
        }
        String OooO00o2 = OooO00o(OooO00o(OooO0O02));
        if (z && !TextUtils.isEmpty(OooO0O02)) {
            new File(OooO0O02).delete();
        }
        return OooO00o2;
    }

    public static String OooO0O0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("   time: ", C8879ooO0oOoO.m20524OooO00o());
        linkedHashMap.put(" device: ", Build.MANUFACTURER + " " + Build.MODEL);
        linkedHashMap.put("android: ", Build.VERSION.RELEASE);
        linkedHashMap.put(" system: ", Build.DISPLAY);
        linkedHashMap.put("    ram: ", String.valueOf(OooO00o()));
        linkedHashMap.put("   disk: ", m20411OooO00o());
        linkedHashMap.put("network: ", NetworkUtil.OooO0o0(C8769oo0ooOOO.OooO00o()));
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

    public static String OooO0OO() {
        if (C8783oo0oooOO.OooO0OO()) {
            String OooO00o2 = C8884ooO0oo0O.OooO00o("nim_sdk_ui.mlog", NimStorageType.TYPE_LOG);
            String OooO00o3 = C8884ooO0oo0O.OooO00o("nim_sdk_push.mlog", NimStorageType.TYPE_LOG);
            String OooO0O02 = C8884ooO0oo0O.OooO0O0("nim_sdk.mlog", NimStorageType.TYPE_LOG);
            if (!TextUtils.isEmpty(OooO00o2) && !TextUtils.isEmpty(OooO0O02)) {
                if (TextUtils.isEmpty(OooO00o3)) {
                    return OooO00o2;
                }
                C8792ooO000.OooO00o(OooO00o2, OooO00o3, OooO0O02);
                return OooO0O02;
            }
        }
        return null;
    }

    public static String OooO00o(List<String> list) {
        String OooO0O02 = C8884ooO0oo0O.OooO0O0(C8878ooO0oOo0.OooO00o(), NimStorageType.TYPE_LOG);
        try {
            C8883ooO0oo00.OooO00o(list, OooO0O02);
        } catch (Exception unused) {
            AbstractC8796ooO0000o.OooO0OO("LogHelper", "zip or upload error");
        }
        return OooO0O02;
    }

    public static String OooO00o(boolean z) {
        String OooO00o2 = C8884ooO0oo0O.OooO00o(C8783oo0oooOO.OooO0O0, NimStorageType.TYPE_LOG);
        if (!z) {
            return OooO00o2;
        }
        if (TextUtils.isEmpty(OooO00o2)) {
            AbstractC8796ooO0000o.OooO0OO("LogHelper", "get sdk log path error");
            return null;
        }
        return OooO00o(OooO00o2, C8884ooO0oo0O.OooO0O0("nim_sdk_" + System.currentTimeMillis() + ".log", NimStorageType.TYPE_LOG));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063 A[SYNTHETIC, Splitter:B:37:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC, Splitter:B:48:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0083 A[SYNTHETIC, Splitter:B:53:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8774oo0ooo.OooO00o(java.lang.String, java.lang.String):java.lang.String");
    }

    public static long OooO00o() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) C8769oo0ooOOO.OooO00o().getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20411OooO00o() {
        long[] OooO00o2 = m20412OooO00o();
        long j = OooO00o2[0];
        long j2 = OooO00o2[1];
        if (j <= 0) {
            return "--";
        }
        float f = (float) ((j2 * 100) / j);
        return String.format(Locale.US, "%.01f%% [%s]", Float.valueOf(f), OooO00o(j));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m20412OooO00o() {
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
        return jArr;
    }

    public static String OooO00o(long j) {
        if (j >= 1073741824) {
            return String.format(Locale.US, "%.02f GB", Float.valueOf((float) (j / 1073741824)));
        } else if (j >= 1048576) {
            return String.format(Locale.US, "%.02f MB", Float.valueOf((float) (j / 1048576)));
        } else {
            return String.format(Locale.US, "%.02f KB", Float.valueOf((float) (j / 1024)));
        }
    }
}
