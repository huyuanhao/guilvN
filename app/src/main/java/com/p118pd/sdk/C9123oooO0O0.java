package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.pd.sdk.oooO0O0  reason: case insensitive filesystem */
public class C9123oooO0O0 {
    public static final String OooO00o = ".JPEG";
    public static final String OooO0O0 = "ImageSelector";
    public static final String OooO0OO = "/ImageSelector/CameraImage/";
    public static final String OooO0Oo = "/ImageSelector/CropImage/";

    public static File OooO00o(Context context) {
        return OooO00o(context, OooO0OO);
    }

    public static File OooO0O0(Context context) {
        return OooO00o(context, OooO0Oo);
    }

    public static String OooO0OO(Context context, Uri uri) {
        return OooO00o(context, uri, null, null);
    }

    public static File OooO00o(Context context, String str) {
        File externalStorageDirectory = Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : context.getCacheDir();
        File file = new File(externalStorageDirectory.getAbsolutePath() + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, ("ImageSelector_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date()) + "") + OooO00o);
    }

    @SuppressLint({"NewApi"})
    public static String OooO0O0(Context context, Uri uri) {
        String OooO00o2;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (OooO0O0(uri)) {
                OooO00o2 = OooO00o(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(Constants.COLON_SEPARATOR)[1]});
            } else if (!OooO00o(uri)) {
                return null;
            } else {
                OooO00o2 = OooO00o(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            }
            return OooO00o2;
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return OooO00o(context, uri, null, null);
        } else {
            if ("file".equals(uri.getScheme())) {
                return uri.getPath();
            }
            return null;
        }
    }

    public static String OooO00o(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return OooO0O0(context, uri);
        }
        return OooO0OO(context, uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "_data"
            r7 = 0
            r0[r7] = r1
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x002c }
            r6 = 0
            r2 = r10
            r3 = r0
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x002c }
            if (r9 == 0) goto L_0x0032
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x002a }
            if (r10 == 0) goto L_0x0032
            r10 = r0[r7]     // Catch:{ Exception -> 0x002a }
            int r10 = r9.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x002a }
            java.lang.String r9 = r9.getString(r10)     // Catch:{ Exception -> 0x002a }
            r8 = r9
            goto L_0x0032
        L_0x002a:
            goto L_0x002d
        L_0x002c:
            r9 = r8
        L_0x002d:
            if (r9 == 0) goto L_0x0032
            r9.close()
        L_0x0032:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9123oooO0O0.OooO00o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean OooO0O0(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean OooO00o(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }
}
