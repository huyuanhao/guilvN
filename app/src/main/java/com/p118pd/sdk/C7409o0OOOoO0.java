package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.baidu.idl.face.platform.utils.BitmapUtils;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0OOOoO0  reason: case insensitive filesystem */
public class C7409o0OOOoO0 {
    public static final String OooO00o = "documents";

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0057 A[SYNTHETIC, Splitter:B:37:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005f A[Catch:{ IOException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(android.content.Context r3, android.net.Uri r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7409o0OOOoO0.OooO00o(android.content.Context, android.net.Uri, java.lang.String):void");
    }

    public static String OooO0O0(Context context, Uri uri) {
        String OooO0OO = OooO0OO(context, uri);
        return OooO0OO != null ? OooO0OO : uri.toString();
    }

    @TargetApi(19)
    public static String OooO0OO(Context context, Uri uri) {
        String OooO00o2;
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (OooO0OO(uri)) {
                    return uri.getLastPathSegment();
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
            String documentId = DocumentsContract.getDocumentId(uri);
            if (documentId != null && documentId.startsWith("raw:")) {
                return documentId.substring(4);
            }
            String[] strArr = {"content://downloads/public_downloads", "content://downloads/my_downloads"};
            for (int i = 0; i < 2; i++) {
                try {
                    String OooO00o3 = OooO00o(context, ContentUris.withAppendedId(Uri.parse(strArr[i]), Long.valueOf(documentId).longValue()), null, null);
                    if (OooO00o3 != null) {
                        return OooO00o3;
                    }
                } catch (Exception unused) {
                }
            }
            File OooO00o4 = OooO00o(OooO00o(context, uri), OooO00o(context));
            if (OooO00o4 == null) {
                return null;
            }
            String absolutePath = OooO00o4.getAbsolutePath();
            OooO00o(context, uri, absolutePath);
            return absolutePath;
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
        } else if (!"content".equalsIgnoreCase(uri.getScheme())) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (!(openInputStream == null || (OooO00o2 = OooO00o(context.getContentResolver(), uri)) == null)) {
                    File file = new File(context.getCacheDir(), OooO00o2);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (openInputStream.read(bArr) > 0) {
                        fileOutputStream.write(bArr);
                    }
                    fileOutputStream.close();
                    openInputStream.close();
                    return file.getAbsolutePath();
                }
            } catch (Exception e) {
                C7406o0OOOo0O.m18948OooO00o(e.toString());
                return null;
            }
        } else if (OooO0OO(uri)) {
            return uri.getLastPathSegment();
        } else {
            return OooO00o(context, uri, null, null);
        }
        return null;
    }

    public static boolean OooO0Oo(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean OooO0O0(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static File OooO00o(Context context) {
        File file = new File(context.getCacheDir(), OooO00o);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File OooO00o(String str, File file) {
        String str2;
        if (str == null) {
            return null;
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            int lastIndexOf = str.lastIndexOf(46);
            int i = 0;
            if (lastIndexOf > 0) {
                String substring = str.substring(0, lastIndexOf);
                str2 = str.substring(lastIndexOf);
                str = substring;
            } else {
                str2 = "";
            }
            while (file2.exists()) {
                i++;
                file2 = new File(file, str + '(' + i + ')' + str2);
            }
        }
        try {
            if (!file2.createNewFile()) {
                return null;
            }
            return file2;
        } catch (IOException unused) {
            return null;
        }
    }

    public static String OooO00o(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        query.moveToFirst();
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex < 0) {
            return null;
        }
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r8 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            if (r8 == 0) goto L_0x0029
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0027 }
            if (r9 == 0) goto L_0x0029
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0027 }
            r7 = r9
            goto L_0x0029
        L_0x0027:
            r9 = move-exception
            goto L_0x0033
        L_0x0029:
            if (r8 == 0) goto L_0x0039
        L_0x002b:
            r8.close()
            goto L_0x0039
        L_0x002f:
            r9 = move-exception
            goto L_0x003c
        L_0x0031:
            r9 = move-exception
            r8 = r7
        L_0x0033:
            r9.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x0039
            goto L_0x002b
        L_0x0039:
            return r7
        L_0x003a:
            r9 = move-exception
            r7 = r8
        L_0x003c:
            if (r7 == 0) goto L_0x0041
            r7.close()
        L_0x0041:
            goto L_0x0043
        L_0x0042:
            throw r9
        L_0x0043:
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7409o0OOOoO0.OooO00o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String OooO00o(Context context, Uri uri) {
        if (context.getContentResolver().getType(uri) != null || context == null) {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("_display_name");
            query.moveToFirst();
            String string = query.getString(columnIndex);
            query.close();
            return string;
        }
        String OooO0O0 = OooO0O0(context, uri);
        if (OooO0O0 == null) {
            return OooO00o(uri.toString());
        }
        return new File(OooO0O0).getName();
    }

    public static String OooO00o(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(47) + 1);
    }

    public static boolean OooO00o(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean OooO0OO(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18949OooO00o(String str) {
        return str.endsWith("png") || str.endsWith(BitmapUtils.IMAGE_KEY_SUFFIX) || str.endsWith("bmp");
    }
}
