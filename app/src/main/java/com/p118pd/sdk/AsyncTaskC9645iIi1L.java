package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.丨i丨Ii1L  reason: invalid class name and case insensitive filesystem */
public class AsyncTaskC9645iIi1L extends AsyncTask<Void, Void, WritableMap> {
    public static final String OooO00o = "E_TAKING_PICTURE_FAILED";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23233OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f23234OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Promise f23235OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableMap f23236OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9471LI f23237OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f23238OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23239OooO00o;

    /* renamed from: com.pd.sdk.丨i丨Ii1L$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.AsyncTaskC9645iIi1L.OooO00o.OooO00o = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.AsyncTaskC9645iIi1L.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AsyncTaskC9645iIi1L.OooO00o.<clinit>():void");
        }
    }

    public AsyncTaskC9645iIi1L(byte[] bArr, Promise promise, ReadableMap readableMap, File file, int i, AbstractC9471LI r6) {
        this.f23235OooO00o = promise;
        this.f23236OooO00o = readableMap;
        this.f23239OooO00o = bArr;
        this.f23238OooO00o = file;
        this.f23233OooO00o = i;
        this.f23237OooO00o = r6;
    }

    private int OooO00o() {
        return (int) (this.f23236OooO00o.getDouble("quality") * 100.0d);
    }

    private int OooO00o(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    private Bitmap OooO0O0(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21702OooO00o() throws IOException {
        if (this.f23234OooO00o == null) {
            byte[] bArr = this.f23239OooO00o;
            this.f23234OooO00o = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        if (this.f23234OooO00o == null) {
            throw new IOException("Failed to decode Image Bitmap");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x024e A[SYNTHETIC, Splitter:B:108:0x024e] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0270 A[SYNTHETIC, Splitter:B:120:0x0270] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bd  */
    /* renamed from: OooO00o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.WritableMap doInBackground(java.lang.Void... r17) {
        /*
        // Method dump skipped, instructions count: 634
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AsyncTaskC9645iIi1L.doInBackground(java.lang.Void[]):com.facebook.react.bridge.WritableMap");
    }

    private Bitmap OooO00o(Bitmap bitmap, int i) {
        return Bitmap.createScaledBitmap(bitmap, i, (int) (((float) bitmap.getHeight()) * (((float) i) / ((float) bitmap.getWidth()))), true);
    }

    private Bitmap OooO00o(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private String m21701OooO00o() throws IOException {
        if (this.f23236OooO00o.hasKey("path")) {
            return this.f23236OooO00o.getString("path");
        }
        return C5188I1l1.OooO00o(this.f23238OooO00o, ".jpg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0031 A[SYNTHETIC, Splitter:B:28:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String OooO00o(java.io.ByteArrayOutputStream r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.m21701OooO00o()     // Catch:{ IOException -> 0x001d, all -> 0x001b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0018, all -> 0x001b }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0018, all -> 0x001b }
            r4.writeTo(r2)     // Catch:{ IOException -> 0x0016 }
            r2.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0029
        L_0x0011:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0029
        L_0x0016:
            r4 = move-exception
            goto L_0x0020
        L_0x0018:
            r4 = move-exception
            r2 = r0
            goto L_0x0020
        L_0x001b:
            r4 = move-exception
            goto L_0x002f
        L_0x001d:
            r4 = move-exception
            r1 = r0
            r2 = r1
        L_0x0020:
            r0 = r4
            r0.printStackTrace()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0029
            r2.close()
        L_0x0029:
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            throw r0
        L_0x002d:
            r4 = move-exception
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0039:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AsyncTaskC9645iIi1L.OooO00o(java.io.ByteArrayOutputStream):java.lang.String");
    }

    /* renamed from: OooO00o */
    public void onPostExecute(WritableMap writableMap) {
        super.onPostExecute(writableMap);
        if (writableMap == null) {
            return;
        }
        if (!this.f23236OooO00o.hasKey("fastMode") || !this.f23236OooO00o.getBoolean("fastMode")) {
            this.f23235OooO00o.resolve(writableMap);
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f23236OooO00o.getInt("id"));
        createMap.putMap("data", writableMap);
        this.f23237OooO00o.OooO00o(createMap);
    }
}
