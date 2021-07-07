package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;

/* renamed from: com.pd.sdk.oo0O0OOO  reason: case insensitive filesystem */
public class C8605oo0O0OOO {
    @Nullable
    public static Uri OooO00o(@NonNull Context context, @NonNull File file) {
        if (Build.VERSION.SDK_INT < 21) {
            return Uri.fromFile(file);
        }
        try {
            return FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".ImagePickerFileProvider", file);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    @SuppressLint({"NewApi"})
    public static String OooO0O0(@NonNull Context context, @NonNull Uri uri) {
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (OooO0OO(uri)) {
                    return uri.getLastPathSegment();
                }
                if (m20244OooO00o(context, uri)) {
                    return OooO00o(context, uri);
                }
                return OooO00o(context, uri, null, null);
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if (OooO0O0(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(Constants.COLON_SEPARATOR);
            if ("primary".equalsIgnoreCase(split[0])) {
                return Environment.getExternalStorageDirectory() + C8932ooOOO0o.OooO0OO + split[1];
            }
        } else if (OooO00o(uri)) {
            return OooO00o(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
        } else if (OooO0Oo(uri)) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(Constants.COLON_SEPARATOR);
            String str = split2[0];
            if (SocializeProtocolConstants.IMAGE.equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return OooO00o(context, uri2, "_id=?", new String[]{split2[1]});
        }
        return null;
    }

    public static boolean OooO0OO(@NonNull Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean OooO0Oo(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0034 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r8 == 0) goto L_0x002e
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x002b }
            if (r9 == 0) goto L_0x002e
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002b }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x002b }
            if (r8 == 0) goto L_0x002a
            r8.close()
        L_0x002a:
            return r9
        L_0x002b:
            r9 = move-exception
            r7 = r8
            goto L_0x0035
        L_0x002e:
            if (r8 == 0) goto L_0x0033
            r8.close()
        L_0x0033:
            return r7
        L_0x0034:
            r9 = move-exception
        L_0x0035:
            if (r7 == 0) goto L_0x003a
            r7.close()
        L_0x003a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8605oo0O0OOO.OooO00o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean OooO00o(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20244OooO00o(@NonNull Context context, @NonNull Uri uri) {
        return (context.getPackageName() + ".ImagePickerFileProvider").equals(uri.getAuthority());
    }

    @Nullable
    public static String OooO00o(@NonNull Context context, @NonNull Uri uri) {
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), uri.getLastPathSegment());
        if (file.exists()) {
            return file.toString();
        }
        return null;
    }

    public static boolean OooO0O0(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
}
