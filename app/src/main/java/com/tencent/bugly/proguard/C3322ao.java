package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.p118pd.sdk.C8932ooOOO0o;
import com.tencent.bugly.crashreport.common.info.C3269a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tencent.bugly.proguard.ao */
public class C3322ao {

    /* renamed from: a */
    public static boolean f8053a = true;

    /* renamed from: b */
    public static SimpleDateFormat f8054b = null;

    /* renamed from: c */
    public static int f8055c = 5120;

    /* renamed from: d */
    public static StringBuilder f8056d;

    /* renamed from: e */
    public static StringBuilder f8057e;

    /* renamed from: f */
    public static boolean f8058f;

    /* renamed from: g */
    public static C3324a f8059g;

    /* renamed from: h */
    public static String f8060h;

    /* renamed from: i */
    public static String f8061i;

    /* renamed from: j */
    public static Context f8062j;

    /* renamed from: k */
    public static String f8063k;

    /* renamed from: l */
    public static boolean f8064l;

    /* renamed from: m */
    public static boolean f8065m;

    /* renamed from: n */
    public static int f8066n;

    /* renamed from: o */
    public static final Object f8067o = new Object();

    /* renamed from: com.tencent.bugly.proguard.ao$a */
    public static class C3324a {

        /* renamed from: a */
        public boolean f8068a;

        /* renamed from: b */
        public File f8069b;

        /* renamed from: c */
        public String f8070c;

        /* renamed from: d */
        public long f8071d;

        /* renamed from: e */
        public long f8072e = 30720;

        public C3324a(String str) {
            if (str != null && !str.equals("")) {
                this.f8070c = str;
                this.f8068a = m8375a();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private boolean m8375a() {
            try {
                File file = new File(this.f8070c);
                this.f8069b = file;
                if (file.exists() && !this.f8069b.delete()) {
                    this.f8068a = false;
                    return false;
                } else if (this.f8069b.createNewFile()) {
                    return true;
                } else {
                    this.f8068a = false;
                    return false;
                }
            } catch (Throwable th) {
                C3321an.m8350a(th);
                this.f8068a = false;
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[SYNTHETIC, Splitter:B:19:0x0036] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo38404a(java.lang.String r10) {
            /*
                r9 = this;
                boolean r0 = r9.f8068a
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                r0 = 0
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x002e }
                java.io.File r3 = r9.f8069b     // Catch:{ all -> 0x002e }
                r4 = 1
                r2.<init>(r3, r4)     // Catch:{ all -> 0x002e }
                java.lang.String r0 = "UTF-8"
                byte[] r10 = r10.getBytes(r0)     // Catch:{ all -> 0x002b }
                r2.write(r10)     // Catch:{ all -> 0x002b }
                r2.flush()     // Catch:{ all -> 0x002b }
                r2.close()     // Catch:{ all -> 0x002b }
                long r5 = r9.f8071d     // Catch:{ all -> 0x002b }
                int r10 = r10.length     // Catch:{ all -> 0x002b }
                long r7 = (long) r10     // Catch:{ all -> 0x002b }
                long r5 = r5 + r7
                r9.f8071d = r5     // Catch:{ all -> 0x002b }
                r9.f8068a = r4     // Catch:{ all -> 0x002b }
                r2.close()     // Catch:{ IOException -> 0x002a }
            L_0x002a:
                return r4
            L_0x002b:
                r10 = move-exception
                r0 = r2
                goto L_0x002f
            L_0x002e:
                r10 = move-exception
            L_0x002f:
                com.tencent.bugly.proguard.C3321an.m8350a(r10)     // Catch:{ all -> 0x003a }
                r9.f8068a = r1     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0039
                r0.close()     // Catch:{ IOException -> 0x0039 }
            L_0x0039:
                return r1
            L_0x003a:
                r10 = move-exception
                if (r0 == 0) goto L_0x0040
                r0.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3322ao.C3324a.mo38404a(java.lang.String):boolean");
        }
    }

    static {
        try {
            f8054b = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public static String m8373f() {
        try {
            C3269a b = C3269a.m7966b();
            if (b == null || b.f7632M == null) {
                return null;
            }
            return b.f7632M.getLogFromNative();
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized void m8362a(Context context) {
        synchronized (C3322ao.class) {
            if (!f8064l && context != null && f8053a) {
                try {
                    f8057e = new StringBuilder(0);
                    f8056d = new StringBuilder(0);
                    f8062j = context;
                    C3269a a = C3269a.m7965a(context);
                    f8060h = a.f7681e;
                    a.getClass();
                    f8061i = "";
                    f8063k = f8062j.getFilesDir().getPath() + C8932ooOOO0o.OooO0OO + "buglylog_" + f8060h + "_" + f8061i + ".txt";
                    f8066n = Process.myPid();
                } catch (Throwable unused) {
                }
                f8064l = true;
            }
        }
    }

    /* renamed from: b */
    public static boolean m8368b(String str, String str2, String str3) {
        try {
            C3269a b = C3269a.m7966b();
            if (b == null || b.f7632M == null) {
                return false;
            }
            return b.f7632M.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (C3321an.m8350a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static void m8361a(int i) {
        synchronized (f8067o) {
            f8055c = i;
            if (i < 0) {
                f8055c = 0;
            } else if (i > 10240) {
                f8055c = 10240;
            }
        }
    }

    /* renamed from: a */
    public static void m8365a(boolean z) {
        C3321an.m8349a("[LogUtil] Whether can record user log into native: " + z, new Object[0]);
        f8065m = z;
    }

    /* renamed from: a */
    public static void m8364a(String str, String str2, Throwable th) {
        if (th != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            m8363a(str, str2, message + '\n' + C3325ap.m8414b(th));
        }
    }

    /* renamed from: a */
    public static synchronized void m8363a(String str, String str2, String str3) {
        synchronized (C3322ao.class) {
            if (f8064l) {
                if (f8053a) {
                    if (!f8065m || !m8368b(str, str2, str3)) {
                        String a = m8360a(str, str2, str3, (long) Process.myTid());
                        synchronized (f8067o) {
                            f8057e.append(a);
                            if (f8057e.length() > f8055c) {
                                if (!f8058f) {
                                    f8058f = true;
                                    C3319am.m8340a().mo38398a(new Runnable() {
                                        /* class com.tencent.bugly.proguard.C3322ao.RunnableC33231 */

                                        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                                        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0068 */
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public void run() {
                                            /*
                                            // Method dump skipped, instructions count: 109
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3322ao.RunnableC33231.run():void");
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m8360a(String str, String str2, String str3, long j) {
        String str4;
        f8056d.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f8054b;
        if (simpleDateFormat != null) {
            str4 = simpleDateFormat.format(date);
        } else {
            str4 = date.toString();
        }
        StringBuilder sb = f8056d;
        sb.append(str4);
        sb.append(" ");
        sb.append(f8066n);
        sb.append(" ");
        sb.append(j);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f8056d.toString();
    }

    /* renamed from: a */
    public static byte[] m8366a() {
        if (!f8053a) {
            return null;
        }
        if (f8065m) {
            C3321an.m8349a("[LogUtil] Get user log from native.", new Object[0]);
            String f = m8373f();
            if (f != null) {
                C3321an.m8349a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(f.length()));
                return C3325ap.m8408a((File) null, f, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f8067o) {
            if (f8059g != null && f8059g.f8068a && f8059g.f8069b != null && f8059g.f8069b.length() > 0) {
                sb.append(C3325ap.m8389a(f8059g.f8069b, 30720, true));
            }
            if (f8057e != null && f8057e.length() > 0) {
                sb.append(f8057e.toString());
            }
        }
        return C3325ap.m8408a((File) null, sb.toString(), "BuglyLog.txt");
    }
}
