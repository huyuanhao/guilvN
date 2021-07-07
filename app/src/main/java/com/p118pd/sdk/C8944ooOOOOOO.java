package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.util.fileUtil.DiskFileUtil;
import com.p118pd.sdk.C8941ooOOOOO0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooOOOOOO  reason: case insensitive filesystem */
public class C8944ooOOOOOO {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22203OooO00o = "DiskLruCacheHelper";
    public static final int OooO0O0 = 10485760;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8941ooOOOOO0 f22204OooO00o;

    public C8944ooOOOOOO(Context context, String str) {
        this.f22204OooO00o = OooO00o(context, str, 10485760);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r1 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004d, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0061, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0065, code lost:
        r6.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0059 A[SYNTHETIC, Splitter:B:42:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0061 A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8944ooOOOOOO.OooO00o(java.lang.String, java.lang.String):void");
    }

    public void OooO0O0() throws Exception {
        this.f22204OooO00o.m20602OooO00o();
    }

    public void OooO0OO() {
        try {
            this.f22204OooO00o.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public C8944ooOOOOOO(Context context, String str, int i) {
        this.f22204OooO00o = OooO00o(context, str, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20612OooO00o(String str) {
        InputStream OooO00o2 = m20611OooO00o(str);
        String str2 = null;
        if (OooO00o2 == null) {
            return null;
        }
        try {
            str2 = C8951ooOOOo0.OooO00o((Reader) new InputStreamReader(OooO00o2, C8951ooOOOo0.OooO0O0));
            if (OooO00o2 != null) {
                try {
                    OooO00o2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (OooO00o2 != null) {
                OooO00o2.close();
            }
        } catch (Throwable th) {
            if (OooO00o2 != null) {
                try {
                    OooO00o2.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
        return str2;
    }

    public void OooO00o(String str, JSONObject jSONObject) {
        OooO00o(str, jSONObject.toString());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public JSONObject m20614OooO00o(String str) {
        String OooO00o2 = m20612OooO00o(str);
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return new JSONObject(OooO00o2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void OooO00o(String str, JSONArray jSONArray) {
        OooO00o(str, jSONArray.toString());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public JSONArray m20613OooO00o(String str) {
        try {
            return new JSONArray(m20612OooO00o(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0044, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
        r5.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[ExcHandler: all (th java.lang.Throwable), PHI: r0 
      PHI: (r0v4 java.io.OutputStream) = (r0v9 java.io.OutputStream), (r0v11 java.io.OutputStream), (r0v0 java.io.OutputStream), (r0v7 java.io.OutputStream) binds: [B:1:0x0001, B:2:?, B:6:0x0009, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0001] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0040 A[SYNTHETIC, Splitter:B:29:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(java.lang.String r4, byte[] r5) {
        /*
            r3 = this;
            r0 = 0
            com.pd.sdk.ooOOOOO0$OooO0OO r4 = r3.OooO00o(r4)     // Catch:{ Exception -> 0x0023, all -> 0x0021 }
            if (r4 != 0) goto L_0x0008
            return
        L_0x0008:
            r1 = 0
            java.io.OutputStream r0 = r4.m20606OooO00o(r1)     // Catch:{ Exception -> 0x001c, all -> 0x0021 }
            r0.write(r5)     // Catch:{ Exception -> 0x001c, all -> 0x0021 }
            r0.flush()     // Catch:{ Exception -> 0x001c, all -> 0x0021 }
            r4.OooO0OO()     // Catch:{ Exception -> 0x001c, all -> 0x0021 }
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ Exception -> 0x0036 }
            goto L_0x003a
        L_0x001c:
            r5 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            goto L_0x003e
        L_0x0023:
            r5 = move-exception
            r4 = r0
        L_0x0025:
            r5.printStackTrace()     // Catch:{ all -> 0x003b }
            r0.OooO00o()     // Catch:{ Exception -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0030:
            if (r4 == 0) goto L_0x003a
            r4.close()
            goto L_0x003a
        L_0x0036:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003a:
            return
        L_0x003b:
            r5 = move-exception
            r0 = r4
            r4 = r5
        L_0x003e:
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0048:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8944ooOOOOOO.OooO00o(java.lang.String, byte[]):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m20618OooO00o(String str) {
        InputStream OooO00o2 = m20611OooO00o(str);
        byte[] bArr = null;
        if (OooO00o2 == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = OooO00o2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            bArr = byteArrayOutputStream.toByteArray();
            if (OooO00o2 != null) {
                try {
                    OooO00o2.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (OooO00o2 != null) {
                OooO00o2.close();
            }
        } catch (Throwable th) {
            if (OooO00o2 != null) {
                try {
                    OooO00o2.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20617OooO00o(String str) {
        try {
            return this.f22204OooO00o.m20603OooO00o(C9045ooOoOO0o.OooO0O0(str));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20615OooO00o() throws Exception {
        this.f22204OooO00o.close();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20616OooO00o() {
        return this.f22204OooO00o.isClosed();
    }

    public long OooO00o() {
        return this.f22204OooO00o.m20605OooO0o0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public File m20610OooO00o() {
        C8941ooOOOOO0 ooooooo0 = this.f22204OooO00o;
        if (ooooooo0 == null) {
            return null;
        }
        return ooooooo0.m20601OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m20611OooO00o(String str) {
        C8941ooOOOOO0 ooooooo0 = this.f22204OooO00o;
        if (ooooooo0 == null) {
            return null;
        }
        try {
            C8941ooOOOOO0.C8943OooO0o0 OooO00o2 = ooooooo0.m20600OooO00o(C9045ooOoOO0o.OooO0O0(str));
            if (OooO00o2 == null) {
                return null;
            }
            return OooO00o2.m20609OooO00o(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public C8941ooOOOOO0.OooO0OO OooO00o(String str) {
        C8941ooOOOOO0 ooooooo0 = this.f22204OooO00o;
        if (ooooooo0 == null) {
            return null;
        }
        try {
            C8941ooOOOOO0.OooO0OO OooO00o2 = ooooooo0.m20599OooO00o(C9045ooOoOO0o.OooO0O0(str));
            if (OooO00o2 == null) {
                String str2 = "the entry spcified key:" + str + " is editing by other . ";
            }
            return OooO00o2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private C8941ooOOOOO0 OooO00o(Context context, String str, int i) {
        try {
            File OooO00o2 = DiskFileUtil.OooO00o(context, str);
            if (!OooO00o2.exists()) {
                OooO00o2.mkdirs();
            }
            return C8941ooOOOOO0.OooO00o(OooO00o2, C8742oo0oOo00.OooO0O0(context), 1, (long) i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
