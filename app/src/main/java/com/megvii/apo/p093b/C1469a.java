package com.megvii.apo.p093b;

import android.content.Context;
import com.megvii.apo.util.C1495e;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONObject;

/* renamed from: com.megvii.apo.b.a */
public final class C1469a {

    /* renamed from: a */
    public byte[] f1952a = new byte[8192];

    /* renamed from: b */
    public Context f1953b;

    /* renamed from: c */
    public HttpURLConnection f1954c;

    /* renamed from: d */
    public String f1955d;

    /* renamed from: e */
    public String f1956e;

    /* renamed from: f */
    public int f1957f = 120000;

    /* renamed from: g */
    public int f1958g = 120000;

    public C1469a(Context context) {
        this.f1953b = context.getApplicationContext();
    }

    /* renamed from: a */
    private byte[] m2183a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(this.f1952a);
            if (read != -1) {
                byteArrayOutputStream.write(this.f1952a, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    /* renamed from: a */
    public static boolean m2182a(String str) {
        try {
            if (new JSONObject(str).getString("code").equals("200")) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[Catch:{ all -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6 A[Catch:{ all -> 0x0145 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c A[SYNTHETIC, Splitter:B:54:0x012c] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133 A[Catch:{ all -> 0x013b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149 A[SYNTHETIC, Splitter:B:67:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0150 A[Catch:{ all -> 0x0158 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo16950a(java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.p093b.C1469a.mo16950a(java.lang.String, java.lang.String, java.util.Map, java.lang.String):java.lang.String");
    }
}
