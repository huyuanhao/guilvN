package com.megvii.meglive_sdk.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.megvii.meglive_sdk.volley.AbstractC1616b;
import com.megvii.meglive_sdk.volley.C1654u;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.c */
public final class C1641c implements AbstractC1616b {

    /* renamed from: a */
    public final Map<String, OooO00o> f2930a;

    /* renamed from: b */
    public long f2931b;

    /* renamed from: c */
    public final File f2932c;

    /* renamed from: d */
    public final int f2933d;

    public C1641c(File file) {
        this.f2930a = new LinkedHashMap(16, 0.75f, true);
        this.f2931b = 0;
        this.f2932c = file;
        this.f2933d = 5242880;
    }

    /* renamed from: b */
    private synchronized void m2841b(String str) {
        boolean delete = m2844d(str).delete();
        m2845e(str);
        if (!delete) {
            C1654u.m2873b("Could not delete cache entry for key=%s, filename=%s", str, m2843c(str));
        }
    }

    /* renamed from: c */
    public static String m2843c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: d */
    private File m2844d(String str) {
        return new File(this.f2932c, m2843c(str));
    }

    /* renamed from: e */
    private void m2845e(String str) {
        OooO00o remove = this.f2930a.remove(str);
        if (remove != null) {
            this.f2931b -= remove.OooO00o;
        }
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1616b
    /* renamed from: a */
    public final synchronized AbstractC1616b.C1617a mo17331a(String str) {
        OooO00o oooO00o = this.f2930a.get(str);
        if (oooO00o == null) {
            return null;
        }
        File d = m2844d(str);
        try {
            OooO0O0 oooO0O0 = new OooO0O0(new BufferedInputStream(m2832a(d)), d.length());
            try {
                OooO00o OooO00o2 = OooO00o.OooO00o(oooO0O0);
                if (!TextUtils.equals(str, OooO00o2.f15110OooO00o)) {
                    C1654u.m2873b("%s: key=%s, found=%s", d.getAbsolutePath(), str, OooO00o2.f15110OooO00o);
                    m2845e(str);
                    return null;
                }
                byte[] a = m2838a(oooO0O0, oooO0O0.OooO0Oo());
                AbstractC1616b.C1617a aVar = new AbstractC1616b.C1617a();
                aVar.f2854a = a;
                aVar.f2855b = oooO00o.f15112OooO0O0;
                aVar.f2856c = oooO00o.OooO0O0;
                aVar.f2857d = oooO00o.OooO0OO;
                aVar.f2858e = oooO00o.OooO0Oo;
                aVar.f2859f = oooO00o.OooO0o0;
                aVar.f2860g = oooO00o.f15111OooO00o;
                oooO0O0.close();
                return aVar;
            } finally {
                oooO0O0.close();
            }
        } catch (IOException e) {
            C1654u.m2873b("%s: %s", d.getAbsolutePath(), e.toString());
            m2841b(str);
            return null;
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.c$OooO0O0 */
    public static class OooO0O0 extends FilterInputStream {
        public final long OooO00o;
        public long OooO0O0;

        public OooO0O0(InputStream inputStream, long j) {
            super(inputStream);
            this.OooO00o = j;
        }

        public final long OooO0Oo() {
            return this.OooO00o - this.OooO0O0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            int read = super.read();
            if (read != -1) {
                this.OooO0O0++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.OooO0O0 += (long) read;
            }
            return read;
        }
    }

    /* renamed from: c */
    public static int m2842c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public C1641c(File file, byte b) {
        this(file);
    }

    /* renamed from: b */
    public static long m2839b(InputStream inputStream) {
        return ((((long) m2842c(inputStream)) & 255) << 0) | 0 | ((((long) m2842c(inputStream)) & 255) << 8) | ((((long) m2842c(inputStream)) & 255) << 16) | ((((long) m2842c(inputStream)) & 255) << 24) | ((((long) m2842c(inputStream)) & 255) << 32) | ((((long) m2842c(inputStream)) & 255) << 40) | ((((long) m2842c(inputStream)) & 255) << 48) | ((255 & ((long) m2842c(inputStream))) << 56);
    }

    /* renamed from: com.megvii.meglive_sdk.volley.toolbox.c$OooO00o */
    public static class OooO00o {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f15110OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<String, String> f15111OooO00o;
        public final long OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final String f15112OooO0O0;
        public final long OooO0OO;
        public final long OooO0Oo;
        public final long OooO0o0;

        public OooO00o(String str, String str2, long j, long j2, long j3, long j4, Map<String, String> map) {
            this.f15110OooO00o = str;
            this.f15112OooO0O0 = "".equals(str2) ? null : str2;
            this.OooO0O0 = j;
            this.OooO0OO = j2;
            this.OooO0Oo = j3;
            this.OooO0o0 = j4;
            this.f15111OooO00o = map;
        }

        public static OooO00o OooO00o(OooO0O0 oooO0O0) {
            if (C1641c.m2831a((InputStream) oooO0O0) == 538247942) {
                return new OooO00o(C1641c.m2833a(oooO0O0), C1641c.m2833a(oooO0O0), C1641c.m2839b((InputStream) oooO0O0), C1641c.m2839b((InputStream) oooO0O0), C1641c.m2839b((InputStream) oooO0O0), C1641c.m2839b((InputStream) oooO0O0), C1641c.m2840b(oooO0O0));
            }
            throw new IOException();
        }

        public OooO00o(String str, AbstractC1616b.C1617a aVar) {
            this(str, aVar.f2855b, aVar.f2856c, aVar.f2857d, aVar.f2858e, aVar.f2859f, aVar.f2860g);
            this.OooO00o = (long) aVar.f2854a.length;
        }

        public final boolean OooO00o(OutputStream outputStream) {
            try {
                C1641c.m2834a(outputStream, 538247942);
                C1641c.m2836a(outputStream, this.f15110OooO00o);
                C1641c.m2836a(outputStream, this.f15112OooO0O0 == null ? "" : this.f15112OooO0O0);
                C1641c.m2835a(outputStream, this.OooO0O0);
                C1641c.m2835a(outputStream, this.OooO0OO);
                C1641c.m2835a(outputStream, this.OooO0Oo);
                C1641c.m2835a(outputStream, this.OooO0o0);
                Map<String, String> map = this.f15111OooO00o;
                if (map != null) {
                    C1641c.m2834a(outputStream, map.size());
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C1641c.m2836a(outputStream, entry.getKey());
                        C1641c.m2836a(outputStream, entry.getValue());
                    }
                } else {
                    C1641c.m2834a(outputStream, 0);
                }
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C1654u.m2873b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: b */
    public static Map<String, String> m2840b(OooO0O0 oooO0O0) {
        int a = m2831a((InputStream) oooO0O0);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap<>(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(m2833a(oooO0O0).intern(), m2833a(oooO0O0).intern());
        }
        return emptyMap;
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1616b
    /* renamed from: a */
    public final synchronized void mo17332a() {
        if (!this.f2932c.exists()) {
            if (!this.f2932c.mkdirs()) {
                C1654u.m2874c("Unable to create cache dir %s", this.f2932c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f2932c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    OooO0O0 oooO0O0 = new OooO0O0(new BufferedInputStream(m2832a(file)), length);
                    try {
                        OooO00o OooO00o2 = OooO00o.OooO00o(oooO0O0);
                        OooO00o2.OooO00o = length;
                        m2837a(OooO00o2.f15110OooO00o, OooO00o2);
                    } finally {
                        oooO0O0.close();
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1616b
    /* renamed from: a */
    public final synchronized void mo17333a(String str, AbstractC1616b.C1617a aVar) {
        long j;
        Iterator<Map.Entry<String, OooO00o>> it;
        long length = (long) aVar.f2854a.length;
        if (this.f2931b + length >= ((long) this.f2933d)) {
            if (C1654u.f2957b) {
                C1654u.m2872a("Pruning old cache entries.", new Object[0]);
            }
            long j2 = this.f2931b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, OooO00o>> it2 = this.f2930a.entrySet().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    j = j2;
                    break;
                }
                OooO00o value = it2.next().getValue();
                if (m2844d(value.f15110OooO00o).delete()) {
                    j = j2;
                    it = it2;
                    this.f2931b -= value.OooO00o;
                } else {
                    j = j2;
                    it = it2;
                    C1654u.m2873b("Could not delete cache entry for key=%s, filename=%s", value.f15110OooO00o, m2843c(value.f15110OooO00o));
                }
                it.remove();
                i++;
                if (((float) (this.f2931b + length)) < ((float) this.f2933d) * 0.9f) {
                    break;
                }
                j2 = j;
                it2 = it;
            }
            if (C1654u.f2957b) {
                C1654u.m2872a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f2931b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        File d = m2844d(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
            OooO00o oooO00o = new OooO00o(str, aVar);
            if (oooO00o.OooO00o(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f2854a);
                bufferedOutputStream.close();
                m2837a(str, oooO00o);
            } else {
                bufferedOutputStream.close();
                C1654u.m2873b("Failed to write header for %s", d.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!d.delete()) {
                C1654u.m2873b("Could not clean up file %s", d.getAbsolutePath());
            }
        }
    }

    /* renamed from: a */
    private void m2837a(String str, OooO00o oooO00o) {
        if (!this.f2930a.containsKey(str)) {
            this.f2931b += oooO00o.OooO00o;
        } else {
            this.f2931b += oooO00o.OooO00o - this.f2930a.get(str).OooO00o;
        }
        this.f2930a.put(str, oooO00o);
    }

    /* renamed from: a */
    public static byte[] m2838a(OooO0O0 oooO0O0, long j) {
        long OooO0Oo = oooO0O0.OooO0Oo();
        if (j >= 0 && j <= OooO0Oo) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(oooO0O0).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + OooO0Oo);
    }

    /* renamed from: a */
    public static InputStream m2832a(File file) {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    public static void m2834a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    public static int m2831a(InputStream inputStream) {
        return (m2842c(inputStream) << 24) | (m2842c(inputStream) << 0) | 0 | (m2842c(inputStream) << 8) | (m2842c(inputStream) << 16);
    }

    /* renamed from: a */
    public static void m2835a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    public static void m2836a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m2835a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    public static String m2833a(OooO0O0 oooO0O0) {
        return new String(m2838a(oooO0O0, m2839b((InputStream) oooO0O0)), "UTF-8");
    }
}
