package com.qiyukf.basesdk.p120b.p121a.p122a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.qiyukf.basesdk.p119a.C1709a;
import java.util.Date;

/* renamed from: com.qiyukf.basesdk.b.a.a.c */
public final class C1726c {

    /* renamed from: a */
    public boolean f3123a;

    /* renamed from: com.qiyukf.basesdk.b.a.a.c$a */
    public static class C1727a {

        /* renamed from: a */
        public String f3124a;

        /* renamed from: b */
        public String f3125b;

        /* renamed from: c */
        public AbstractC1718a f3126c;

        /* renamed from: d */
        public long f3127d;

        /* renamed from: e */
        public int f3128e;

        /* renamed from: com.qiyukf.basesdk.b.a.a.c$a$a */
        public static class C1728a {

            /* renamed from: a */
            public String f3129a;

            /* renamed from: b */
            public String f3130b;

            /* renamed from: c */
            public AbstractC1718a f3131c = null;

            /* renamed from: d */
            public long f3132d = -1;

            /* renamed from: e */
            public int f3133e = EnumC1729b.f3134a;

            public C1728a(String str, String str2) {
                this.f3129a = str;
                this.f3130b = str2;
            }

            /* renamed from: a */
            public final C1728a mo33889a(long j) {
                this.f3132d = j;
                return this;
            }

            /* renamed from: a */
            public final C1728a mo33890a(AbstractC1718a aVar) {
                this.f3131c = aVar;
                return this;
            }

            /* renamed from: a */
            public final C1727a mo33891a() {
                return new C1727a(this.f3129a, this.f3130b, this.f3131c, this.f3132d, this.f3133e, (byte) 0);
            }
        }

        /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: com.qiyukf.basesdk.b.a.a.c$a$b */
        public static final class EnumC1729b extends Enum<EnumC1729b> {

            /* renamed from: a */
            public static final int f3134a = 1;

            /* renamed from: b */
            public static final int f3135b = 2;

            /* renamed from: c */
            public static final int f3136c = 3;

            /* renamed from: d */
            public static final int f3137d = 4;

            /* renamed from: e */
            public static final /* synthetic */ int[] f3138e = {1, 2, 3, 4};
        }

        public C1727a(String str, String str2, AbstractC1718a aVar, long j, int i) {
            this.f3126c = null;
            this.f3127d = -1;
            this.f3128e = EnumC1729b.f3134a;
            this.f3124a = str;
            this.f3125b = str2;
            this.f3126c = aVar;
            this.f3127d = j;
            this.f3128e = i;
        }

        public /* synthetic */ C1727a(String str, String str2, AbstractC1718a aVar, long j, int i, byte b) {
            this(str, str2, aVar, j, i);
        }
    }

    /* renamed from: a */
    public static final C1726c m3080a() {
        return new C1726c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a5, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02aa, code lost:
        if (r26 == null) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b5, code lost:
        if (new java.io.File(r25).exists() == false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b7, code lost:
        r26.mo33879b(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bb, code lost:
        r26.mo33878a(r23, "file not exist");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c2, code lost:
        r1 = r0;
        r10 = r15;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ca, code lost:
        r0 = m3082c();
        com.qiyukf.basesdk.p119a.C1709a.m3018d(r4, "HTTPDownload STAT END " + r0);
        r0 = r0 - r12;
        r2 = new java.lang.StringBuilder("HTTPDownload STAT COST ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02fc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02fd, code lost:
        r18 = "HTTPDownload FAILED CLOSE EX ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0301, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0305, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0309, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030a, code lost:
        r18 = "HTTPDownload FAILED CLOSE EX ";
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0311, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0317, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0318, code lost:
        r4 = "RES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x031b, code lost:
        r1 = r0;
        r2 = "HTTPDownload FAILED CLOSE EX ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0322, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0325, code lost:
        r18 = "HTTPDownload FAILED CLOSE EX ";
        r4 = "RES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0328, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0377, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0378, code lost:
        r0.printStackTrace();
        com.qiyukf.basesdk.p119a.C1709a.m3011a(r4, r18 + r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03c4, code lost:
        r0.printStackTrace();
        com.qiyukf.basesdk.p119a.C1709a.m3011a(r4, r2 + r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0116, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0120, code lost:
        r4 = "RES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0124, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0125, code lost:
        r4 = "RES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012b, code lost:
        r18 = "HTTPDownload FAILED CLOSE EX ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023c, code lost:
        r1 = r0;
        r2 = "HTTPDownload FAILED CLOSE EX ";
        r10 = r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:32:0x00ad, B:40:0x00f0] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:32:0x00ad, B:52:0x0132] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:70:0x01a3, B:83:0x0230] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:70:0x01a3, B:93:0x024e] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0305 A[ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v11 java.lang.String) = (r4v14 java.lang.String), (r4v14 java.lang.String), (r4v18 java.lang.String), (r4v18 java.lang.String), (r4v21 java.lang.String), (r4v21 java.lang.String) binds: [B:52:0x0132, B:53:?, B:40:0x00f0, B:41:?, B:32:0x00ad, B:33:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:32:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0317 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0322 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:3:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0373 A[SYNTHETIC, Splitter:B:155:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03bf A[SYNTHETIC, Splitter:B:163:0x03bf] */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023b A[ExcHandler: all (r0v27 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:70:0x01a3] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3081a(java.lang.String r23, java.lang.String r24, java.lang.String r25, com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a r26, long r27) {
        /*
        // Method dump skipped, instructions count: 990
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p122a.C1726c.m3081a(java.lang.String, java.lang.String, java.lang.String, com.qiyukf.basesdk.b.a.a.a, long):boolean");
    }

    /* renamed from: c */
    public static final long m3082c() {
        return new Date().getTime();
    }

    /* renamed from: a */
    public final boolean mo33887a(C1727a aVar) {
        boolean z;
        String str = aVar.f3124a;
        String str2 = aVar.f3125b;
        AbstractC1718a aVar2 = aVar.f3126c;
        long j = aVar.f3127d;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (aVar2 != null) {
                aVar2.mo33878a(str, "url or file path is empty");
            }
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            } else if (m3081a(str, str, str2, aVar2, j)) {
                z = true;
                break;
            } else {
                SystemClock.sleep(WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                C1709a.m3011a("RES", "HTTPDownload USUAL RETRY " + i);
                i++;
            }
        }
        if (z) {
            return true;
        }
        if (aVar2 != null) {
            aVar2.mo33878a(str, "");
        }
        return false;
    }

    /* renamed from: b */
    public final void mo33888b() {
        this.f3123a = true;
    }
}
