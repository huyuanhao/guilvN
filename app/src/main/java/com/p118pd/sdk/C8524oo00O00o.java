package com.p118pd.sdk;

import android.content.Context;
import java.io.File;

/* renamed from: com.pd.sdk.oo00O00o  reason: case insensitive filesystem */
public class C8524oo00O00o {
    public static final Object OooO00o = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0066 A[SYNTHETIC, Splitter:B:39:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007d A[SYNTHETIC, Splitter:B:50:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008e A[SYNTHETIC, Splitter:B:59:0x008e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(android.content.Context r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8524oo00O00o.OooO00o(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20196OooO00o(Context context, String str) {
        synchronized (OooO00o) {
            context.deleteFile(OooO0O0(context, str));
        }
    }

    public static void OooO00o(File file) {
        C8590oo0O000o.OooO00o(file);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20197OooO00o(Context context, String str) {
        File file = new File(context.getFilesDir(), OooO0O0(context, str));
        if (!file.exists()) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "cached file not found");
            return false;
        }
        long length = file.length();
        if (length <= 5242880) {
            return true;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "v1 cached file size overlarge - file len: %d limitedSize: %d", Long.valueOf(length), 5242880L);
        return false;
    }

    public static String OooO0O0(Context context, String str) {
        String packageName = context.getPackageName();
        return "hianalytics_" + str + "_" + packageName;
    }
}
