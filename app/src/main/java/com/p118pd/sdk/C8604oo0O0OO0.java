package com.p118pd.sdk;

import android.content.Context;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.pd.sdk.oo0O0OO0  reason: case insensitive filesystem */
public class C8604oo0O0OO0 {

    /* renamed from: com.pd.sdk.oo0O0OO0$OooO00o */
    public static class OooO00o implements MediaScannerConnection.OnScanCompletedListener {
        public void onScanCompleted(String str, Uri uri) {
            Log.i("TAG", "Finished scanning " + str);
        }
    }

    /* renamed from: com.pd.sdk.oo0O0OO0$OooO0O0 */
    public static class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Throwable f21717OooO00o;

        public OooO0O0(int i, @Nullable Throwable th) {
            this.OooO00o = i;
            this.f21717OooO00o = th;
        }
    }

    /* renamed from: com.pd.sdk.oo0O0OO0$OooO0OO */
    public static class OooO0OO {
        public final C8598oo0O00oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Throwable f21718OooO00o;

        public OooO0OO(@NonNull C8598oo0O00oo oo0o00oo, @Nullable Throwable th) {
            this.OooO00o = oo0o00oo;
            this.f21718OooO00o = th;
        }
    }

    @Nullable
    public static File OooO00o(@NonNull Context context, @NonNull ReadableMap readableMap, @NonNull boolean z) {
        File file;
        String str = "image-" + UUID.randomUUID().toString() + ".jpg";
        if (C8603oo0O0OO.OooO0O0(readableMap, "storageOptions") && C8603oo0O0OO.OooO00o(readableMap.getMap("storageOptions"), "path")) {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), readableMap.getMap("storageOptions").getString("path"));
        } else if (!z) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        } else {
            file = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        }
        File file2 = new File(file, str);
        try {
            file.mkdirs();
            file2.createNewFile();
            return file2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010a, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010e, code lost:
        throw r0;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C8598oo0O00oo OooO00o(@androidx.annotation.NonNull android.content.Context r15, @androidx.annotation.NonNull com.facebook.react.bridge.ReadableMap r16, @androidx.annotation.NonNull com.p118pd.sdk.C8598oo0O00oo r17, int r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8604oo0O0OO0.OooO00o(android.content.Context, com.facebook.react.bridge.ReadableMap, com.pd.sdk.oo0O00oo, int, int, int):com.pd.sdk.oo0O00oo");
    }

    public static void OooO00o(int i, @NonNull C8598oo0O00oo oo0o00oo) {
        if (i == 13001) {
            File file = oo0o00oo.f21711OooO00o;
            if (file != null && file.exists()) {
                oo0o00oo.f21711OooO00o.delete();
            }
            File file2 = oo0o00oo.f21713OooO0O0;
            if (file2 != null && file2.exists()) {
                oo0o00oo.f21713OooO0O0.delete();
            }
        }
    }

    public static void OooO00o(@Nullable Context context, @NonNull String str) {
        if (context != null) {
            MediaScannerConnection.scanFile(context, new String[]{str}, null, new OooO00o());
        }
    }

    public static OooO0O0 OooO00o(@NonNull C8597oo0O00oO oo0o00oo, @NonNull C8598oo0O00oo oo0o00oo2) {
        int i = 0;
        try {
            ExifInterface exifInterface = new ExifInterface(oo0o00oo2.f21711OooO00o.getAbsolutePath());
            float[] fArr = new float[2];
            exifInterface.getLatLong(fArr);
            float f = fArr[0];
            boolean z = true;
            float f2 = fArr[1];
            if (!(f == 0.0f && f2 == 0.0f)) {
                oo0o00oo.OooO00o("latitude", (double) f);
                oo0o00oo.OooO00o("longitude", (double) f2);
            }
            String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.f14191OooOoO);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(ISO8601Utils.UTC_ID));
            try {
                oo0o00oo.OooO00o("timestamp", simpleDateFormat2.format(simpleDateFormat.parse(attribute)) + "Z");
            } catch (Exception unused) {
            }
            int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, 1);
            if (attributeInt != 3) {
                if (attributeInt == 6) {
                    i = 90;
                } else if (attributeInt == 8) {
                    i = 270;
                }
                z = false;
            } else {
                i = 180;
            }
            oo0o00oo.OooO00o("originalRotation", i);
            oo0o00oo.OooO00o("isVertical", z);
            return new OooO0O0(i, null);
        } catch (IOException e) {
            e.printStackTrace();
            return new OooO0O0(0, e);
        }
    }

    @Nullable
    public static OooO0OO OooO00o(@NonNull C8598oo0O00oo oo0o00oo) {
        C8598oo0O00oo oo0o00oo2;
        File file = oo0o00oo.f21713OooO0O0;
        if (file == null) {
            file = oo0o00oo.f21711OooO00o;
        }
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath(), file.getName());
        try {
            OooO00o(file, file2);
            if (oo0o00oo.f21713OooO0O0 != null) {
                oo0o00oo2 = oo0o00oo.OooO0O0(file2);
            } else {
                oo0o00oo2 = oo0o00oo.OooO00o(file2);
            }
            return new OooO0OO(oo0o00oo2, null);
        } catch (IOException e) {
            e.printStackTrace();
            return new OooO0OO(oo0o00oo, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[SYNTHETIC, Splitter:B:18:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[Catch:{ IOException -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(@androidx.annotation.NonNull java.io.File r8, @androidx.annotation.NonNull java.io.File r9) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0037 }
            r1.<init>(r8)     // Catch:{ all -> 0x0037 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x0037 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0033 }
            r2.<init>(r9)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch:{ all -> 0x0033 }
            r3 = 0
            long r5 = r1.size()     // Catch:{ all -> 0x0033 }
            r2 = r1
            r7 = r0
            r2.transferTo(r3, r5, r7)     // Catch:{ all -> 0x0033 }
            r8.delete()     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0029
            r1.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x0029
        L_0x0027:
            r8 = move-exception
            goto L_0x002f
        L_0x0029:
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x0032
        L_0x002f:
            r8.printStackTrace()
        L_0x0032:
            return
        L_0x0033:
            r8 = move-exception
            r9 = r0
            r0 = r1
            goto L_0x0039
        L_0x0037:
            r8 = move-exception
            r9 = r0
        L_0x0039:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0041
        L_0x003f:
            r9 = move-exception
            goto L_0x0047
        L_0x0041:
            if (r9 == 0) goto L_0x004a
            r9.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x004a
        L_0x0047:
            r9.printStackTrace()
        L_0x004a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8604oo0O0OO0.OooO00o(java.io.File, java.io.File):void");
    }
}
