package com.qiyukf.unicorn.mediaselect.internal.p241d;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.d.b */
public final class C2755b {
    @TargetApi(19)
    /* renamed from: a */
    public static String m6382a(Context context, Uri uri) {
        Uri uri2 = null;
        if (Build.VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return m6383a(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(Constants.COLON_SEPARATOR);
            if ("primary".equalsIgnoreCase(split[0])) {
                return Environment.getExternalStorageDirectory() + C8932ooOOO0o.OooO0OO + split[1];
            }
        } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            return m6383a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
        } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(Constants.COLON_SEPARATOR);
            String str = split2[0];
            if (SocializeProtocolConstants.IMAGE.equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return m6383a(context, uri2, "_id=?", new String[]{split2[1]});
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6383a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.mediaselect.internal.p241d.C2755b.m6383a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
