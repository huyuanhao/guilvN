package com.tencent.p269mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.tencent.mm.opensdk.utils.d */
public final class C3392d {

    /* renamed from: D */
    public static Context f8347D;

    /* renamed from: a */
    public static int m8659a(ContentResolver contentResolver, Uri uri) {
        Log.m8652i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.m8654w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return 0;
            }
            int available = openInputStream.available();
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused2) {
                }
            }
            return available;
        } catch (Exception e) {
            Log.m8654w("MicroMsg.SDK.Util", "getFileSize fail, " + e.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return 0;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m8660a(int i) {
        return i == 36 || i == 46;
    }

    /* renamed from: b */
    public static boolean m8661b(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: c */
    public static int m8662c(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int getFileSize(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (f8347D != null && str.startsWith("content")) {
            try {
                return m8659a(f8347D.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
