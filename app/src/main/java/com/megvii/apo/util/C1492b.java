package com.megvii.apo.util;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;

/* renamed from: com.megvii.apo.util.b */
public final class C1492b {
    /* renamed from: a */
    public static String m2251a() {
        return UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    /* renamed from: a */
    public static String m2252a(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(context.getExternalFilesDir("xid"), "xid"));
            byte[] bArr = new byte[512];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            fileInputStream.close();
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return sb.toString();
    }
}
