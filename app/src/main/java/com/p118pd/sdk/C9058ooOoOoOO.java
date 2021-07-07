package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.ooOoOoOO  reason: case insensitive filesystem */
public class C9058ooOoOoOO {
    public static final String OooO = "novatedownfile";
    public static final int OooO00o = 100;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static FileFilter f22363OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22364OooO00o = "FileUtils";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Comparator<File> f22365OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Pattern f22366OooO00o = Pattern.compile("attachment;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$", 2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f22367OooO00o = false;
    public static FileFilter OooO0O0 = new OooO0OO();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f22368OooO0O0 = "document";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Pattern f22369OooO0O0 = Pattern.compile("inline;\\s*filename\\s*=\\s*(\"?)([^\"]*)\\1\\s*$", 2);
    public static final String OooO0OO = "tree";
    public static final String OooO0Oo = "audio/*";
    public static final String OooO0o = "image/*";
    public static final String OooO0o0 = "text/*";
    public static final String OooO0oO = "video/*";
    public static final String OooO0oo = "application/*";
    public static final String OooOO0 = ".";

    /* renamed from: com.pd.sdk.ooOoOoOO$OooO00o */
    public static class OooO00o implements Comparator<File> {
        /* renamed from: OooO00o */
        public int compare(File file, File file2) {
            return file.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
        }
    }

    /* renamed from: com.pd.sdk.ooOoOoOO$OooO0O0 */
    public static class OooO0O0 implements FileFilter {
        public boolean accept(File file) {
            return file.isFile() && !file.getName().startsWith(C9058ooOoOoOO.OooOO0);
        }
    }

    /* renamed from: com.pd.sdk.ooOoOoOO$OooO0OO */
    public static class OooO0OO implements FileFilter {
        public boolean accept(File file) {
            return file.isDirectory() && !file.getName().startsWith(C9058ooOoOoOO.OooOO0);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20722OooO00o() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return Environment.getExternalStorageDirectory().toString();
        }
        return null;
    }

    public static boolean OooO00o(byte[] bArr) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0O0(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r7 = "_data"
            r3[r0] = r7
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0034 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r8 == 0) goto L_0x002e
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x002b }
            if (r9 == 0) goto L_0x002e
            int r9 = r8.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x002b }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x002b }
            if (r8 == 0) goto L_0x002a
            r8.close()
        L_0x002a:
            return r9
        L_0x002b:
            r9 = move-exception
            r0 = r8
            goto L_0x0035
        L_0x002e:
            if (r8 == 0) goto L_0x0033
            r8.close()
        L_0x0033:
            return r0
        L_0x0034:
            r9 = move-exception
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9058ooOoOoOO.OooO0O0(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String OooO0OO(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(OooOO0);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf) : "";
    }

    public static boolean OooO0Oo(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean OooO0o0(Uri uri) {
        return SocializeConstants.KEY_PLATFORM.equalsIgnoreCase(uri.getAuthority());
    }

    public static String OooO0Oo(String str) {
        int lastIndexOf;
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String decode = Uri.decode(str);
        if (TextUtils.isEmpty(decode)) {
            return null;
        }
        int lastIndexOf2 = decode.lastIndexOf(OooOO0);
        String substring = (lastIndexOf2 == -1 || decode.length() - lastIndexOf2 >= 5) ? null : decode.substring(lastIndexOf2);
        int indexOf = decode.indexOf(C8932ooOOO0o.f22176OooO00o);
        if (indexOf > 0) {
            decode = decode.substring(0, indexOf);
        }
        int indexOf2 = decode.indexOf("#");
        if (indexOf2 > 0) {
            decode = decode.substring(0, indexOf2);
        }
        if (!decode.endsWith(C8932ooOOO0o.OooO0OO) && (lastIndexOf = decode.lastIndexOf(C8932ooOOO0o.OooO0OO) + 1) > 0) {
            str2 = decode.substring(lastIndexOf);
        }
        if (TextUtils.isEmpty(substring) || TextUtils.isEmpty(str2) || str2.contains(OooOO0)) {
            return str2;
        }
        return str2 + substring;
    }

    public static String OooO0o0(String str) {
        try {
            Matcher matcher = f22366OooO00o.matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
            Matcher matcher2 = f22369OooO0O0.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(2);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String OooO00o(Context context) {
        if (m20722OooO00o() == null) {
            return context.getCacheDir().getAbsolutePath();
        }
        File file = new File(m20722OooO00o() + File.separator + context.getPackageName());
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }

    public static boolean OooO0OO(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean OooO0O0(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    @TargetApi(19)
    public static String OooO0O0(Context context, Uri uri) {
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
        } else if (m20726OooO00o(uri)) {
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

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String OooO00o(Context context, String str) {
        Throwable th;
        Exception e;
        BufferedReader bufferedReader = null;
        try {
            InputStream open = context.getResources().getAssets().open(str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(open));
            try {
                char[] cArr = new char[1024];
                StringBuffer stringBuffer = new StringBuffer(open.available());
                while (true) {
                    int read = bufferedReader2.read(cArr);
                    if (read != -1) {
                        stringBuffer.append(String.valueOf(cArr, 0, read));
                    } else {
                        String stringBuffer2 = stringBuffer.toString();
                        OooO00o(bufferedReader2);
                        return stringBuffer2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = bufferedReader2;
                try {
                    e.printStackTrace();
                    OooO00o(bufferedReader);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    OooO00o(bufferedReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                OooO00o(bufferedReader);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            OooO00o(bufferedReader);
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20725OooO00o(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void OooO00o(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            m20725OooO00o(arrayList.get(i));
        }
    }

    public static File OooO00o(Uri uri) {
        return new File(uri.getPath());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20727OooO00o(String str) {
        return str != null && !str.startsWith("http://") && !str.startsWith("https://");
    }

    public static Uri OooO00o(File file) {
        if (file != null) {
            return Uri.fromFile(file);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File m20721OooO00o(File file) {
        if (file == null) {
            return null;
        }
        if (file.isDirectory()) {
            return file;
        }
        String name = file.getName();
        String absolutePath = file.getAbsolutePath();
        String substring = absolutePath.substring(0, absolutePath.length() - name.length());
        if (substring.endsWith(C8932ooOOO0o.OooO0OO)) {
            substring = substring.substring(0, substring.length() - 1);
        }
        return new File(substring);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20724OooO00o(File file) {
        String OooO0OO2 = OooO0OO(file.getName());
        return OooO0OO2.length() > 0 ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(OooO0OO2.substring(1)) : "application/octet-stream";
    }

    public static String OooO0O0(String str) {
        return System.currentTimeMillis() + str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20723OooO00o(Context context, Uri uri) {
        return m20724OooO00o(new File(OooO0O0(context, uri)));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20726OooO00o(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
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
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9058ooOoOoOO.OooO00o(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File m20720OooO00o(Context context, Uri uri) {
        String OooO0O02;
        if (uri == null || (OooO0O02 = OooO0O0(context, uri)) == null || !m20727OooO00o(OooO0O02)) {
            return null;
        }
        return new File(OooO0O02);
    }

    public static String OooO00o(int i) {
        float f;
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        String str = " KB";
        if (i > 1024) {
            f = (float) (i / 1024);
            if (f > 1024.0f) {
                f /= 1024.0f;
                if (f > 1024.0f) {
                    f /= 1024.0f;
                    str = " GB";
                } else {
                    str = " MB";
                }
            }
        } else {
            f = 0.0f;
        }
        return String.valueOf(decimalFormat.format((double) f) + str);
    }

    public static Bitmap OooO00o(Context context, File file) {
        return OooO00o(context, OooO00o(file), m20724OooO00o(file));
    }

    public static Bitmap OooO00o(Context context, Uri uri) {
        return OooO00o(context, uri, m20723OooO00o(context, uri));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r9 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r9 != null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap OooO00o(android.content.Context r8, android.net.Uri r9, java.lang.String r10) {
        /*
            boolean r0 = OooO0o0(r9)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r9 == 0) goto L_0x0057
            android.content.ContentResolver r8 = r8.getContentResolver()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0053, all -> 0x004c }
            boolean r0 = r9.moveToFirst()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r0 == 0) goto L_0x0041
            r0 = 0
            int r0 = r9.getInt(r0)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r2 = "video"
            boolean r2 = r10.contains(r2)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r3 = 1
            if (r2 == 0) goto L_0x0033
            long r4 = (long) r0     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            android.graphics.Bitmap r8 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r8, r4, r3, r1)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
        L_0x0031:
            r1 = r8
            goto L_0x0041
        L_0x0033:
            java.lang.String r2 = "image/*"
            boolean r10 = r10.contains(r2)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r10 == 0) goto L_0x0041
            long r4 = (long) r0     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            android.graphics.Bitmap r8 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r8, r4, r3, r1)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            goto L_0x0031
        L_0x0041:
            if (r9 == 0) goto L_0x0057
        L_0x0043:
            r9.close()
            goto L_0x0057
        L_0x0047:
            r8 = move-exception
            r1 = r9
            goto L_0x004d
        L_0x004a:
            goto L_0x0054
        L_0x004c:
            r8 = move-exception
        L_0x004d:
            if (r1 == 0) goto L_0x0052
            r1.close()
        L_0x0052:
            throw r8
        L_0x0053:
            r9 = r1
        L_0x0054:
            if (r9 == 0) goto L_0x0057
            goto L_0x0043
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9058ooOoOoOO.OooO00o(android.content.Context, android.net.Uri, java.lang.String):android.graphics.Bitmap");
    }

    public static Intent OooO00o() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        return intent;
    }

    public static String OooO00o(String str) {
        String OooO0o02 = OooO0o0(str);
        if (TextUtils.isEmpty(OooO0o02)) {
            return OooO0o02;
        }
        try {
            byte[] bytes = OooO0o02.getBytes("utf-8");
            if (OooO00o(bytes, bytes.length)) {
                return new String(bytes, "utf-8");
            }
            if (OooO00o(bytes)) {
                return new String(bytes, "GBK");
            }
            return new String(bytes, "gb2312");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static boolean OooO00o(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= length || i3 >= i) {
                return true;
            }
            int i5 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -64 || b > -3) {
                    return false;
                }
                if (b > -4) {
                    i4 = 5;
                } else if (b > -8) {
                    i4 = 4;
                } else if (b > -16) {
                    i4 = 3;
                } else if (b > -32) {
                    i4 = 2;
                }
                if (i5 + i4 > length) {
                    return false;
                }
                int i6 = 0;
                while (i6 < i4) {
                    if (bArr[i5] >= -64) {
                        return false;
                    }
                    i6++;
                    i5++;
                }
            }
            i2 = i5;
            i3++;
        }
        return false;
    }

    public static String OooO00o(String str, String str2) {
        String OooO00o2 = OooO00o(str);
        if (TextUtils.isEmpty(OooO00o2)) {
            OooO00o2 = OooO0Oo(str2);
        }
        return TextUtils.isEmpty(OooO00o2) ? OooO : OooO00o2;
    }
}
