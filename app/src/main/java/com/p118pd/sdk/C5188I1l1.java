package com.p118pd.sdk;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.pd.sdk.I1l丨1  reason: invalid class name and case insensitive filesystem */
public class C5188I1l1 {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File m15319OooO00o(File file) throws IOException {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    public static String OooO00o(File file, String str) throws IOException {
        m15319OooO00o(file);
        String uuid = UUID.randomUUID().toString();
        return file + File.separator + uuid + str;
    }

    public static Uri OooO00o(File file) {
        return Uri.fromFile(file);
    }
}
