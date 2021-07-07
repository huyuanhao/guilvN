package com.megvii.apo.p093b;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import p283fi.iki.elonen.NanoHTTPD;

/* renamed from: com.megvii.apo.b.b */
public final class C1470b {

    /* renamed from: b */
    public static final char[] f1959b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: a */
    public ByteArrayOutputStream f1960a;

    /* renamed from: c */
    public final String f1961c;

    /* renamed from: d */
    public final String f1962d;

    /* renamed from: e */
    public final String f1963e;

    /* renamed from: f */
    public final String f1964f;

    /* renamed from: g */
    public final String f1965g;

    /* renamed from: h */
    public final byte[] f1966h;

    /* renamed from: i */
    public final byte[] f1967i;

    /* renamed from: j */
    public String f1968j;

    public C1470b() {
        this.f1961c = "\r\n";
        this.f1962d = "Content-Type: ";
        this.f1963e = "Content-Disposition: ";
        this.f1964f = NanoHTTPD.MIME_PLAINTEXT;
        this.f1965g = "application/octet-stream";
        this.f1966h = "Content-Transfer-Encoding: binary\r\n\r\n".getBytes();
        this.f1967i = "Content-Transfer-Encoding: 8bit\r\n\r\n".getBytes();
        this.f1968j = null;
        this.f1960a = new ByteArrayOutputStream();
        this.f1968j = m2187c();
    }

    /* renamed from: b */
    public static byte[] m2186b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=\"" + str + "\"");
        if (str2 != null && !"".equals(str2)) {
            sb.append("; filename=\"" + str2 + "\"");
        }
        sb.append("\r\n");
        return sb.toString().getBytes();
    }

    /* renamed from: c */
    public static String m2187c() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            char[] cArr = f1959b;
            stringBuffer.append(cArr[random.nextInt(cArr.length)]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    private void m2188d() {
        ByteArrayOutputStream byteArrayOutputStream = this.f1960a;
        byteArrayOutputStream.write(("--" + this.f1968j + "\r\n").getBytes());
    }

    /* renamed from: a */
    public final void mo16953a(String str, String str2) {
        byte[] bytes = str2.getBytes();
        byte[] bArr = this.f1967i;
        try {
            m2188d();
            ByteArrayOutputStream byteArrayOutputStream = this.f1960a;
            byteArrayOutputStream.write(("Content-Type: " + NanoHTTPD.MIME_PLAINTEXT + "\r\n").getBytes());
            this.f1960a.write(m2186b(str, ""));
            this.f1960a.write(bArr);
            this.f1960a.write(bytes);
            this.f1960a.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final byte[] mo16954b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.f1960a.toByteArray());
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public final void mo16952a(String str, File file) {
        Throwable th;
        IOException e;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                m2188d();
                this.f1960a.write(m2186b(str, file.getName()));
                this.f1960a.write("Content-Type: text/plain\r\n".getBytes());
                this.f1960a.write("\r\n".getBytes());
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read != -1) {
                        this.f1960a.write(bArr, 0, read);
                    } else {
                        this.f1960a.write("\r\n".getBytes());
                        this.f1960a.write(("--" + this.f1968j + "--\r\n").getBytes());
                        this.f1960a.flush();
                        m2185a(fileInputStream2);
                        return;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    m2185a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    m2185a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                m2185a(fileInputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            m2185a(fileInputStream);
        }
    }

    /* renamed from: a */
    public static void m2185a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo16951a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "multipart/form-data;charset=utf-8;boundary=" + this.f1968j);
        return hashMap;
    }
}
