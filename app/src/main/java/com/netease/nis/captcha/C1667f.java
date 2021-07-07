package com.netease.nis.captcha;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.netease.nis.captcha.f */
public class C1667f {

    /* renamed from: a */
    public static Handler f3056a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static ExecutorService f3057b = Executors.newSingleThreadExecutor();

    /* renamed from: com.netease.nis.captcha.f$OooO00o */
    public static class OooO00o implements Runnable {
        public final /* synthetic */ AbstractC1668a OooO00o;
        public final /* synthetic */ String o0ooOOo;

        /* renamed from: com.netease.nis.captcha.f$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4909OooO00o implements AbstractC1668a {

            /* renamed from: com.netease.nis.captcha.f$OooO00o$OooO00o$OooO00o  reason: collision with other inner class name */
            public class RunnableC4910OooO00o implements Runnable {
                public final /* synthetic */ String o0ooOOo;

                public RunnableC4910OooO00o(String str) {
                    this.o0ooOOo = str;
                }

                public void run() {
                    OooO00o.this.OooO00o.mo17692a(this.o0ooOOo);
                }
            }

            /* renamed from: com.netease.nis.captcha.f$OooO00o$OooO00o$OooO0O0 */
            public class OooO0O0 implements Runnable {
                public final /* synthetic */ int o00oO0O;
                public final /* synthetic */ String o0ooOOo;

                public OooO0O0(int i, String str) {
                    this.o00oO0O = i;
                    this.o0ooOOo = str;
                }

                public void run() {
                    OooO00o.this.OooO00o.mo17691a(this.o00oO0O, this.o0ooOOo);
                }
            }

            public C4909OooO00o() {
            }

            @Override // com.netease.nis.captcha.C1667f.AbstractC1668a
            /* renamed from: a */
            public void mo17691a(int i, String str) {
                C1667f.f3056a.post(new OooO0O0(i, str));
            }

            @Override // com.netease.nis.captcha.C1667f.AbstractC1668a
            /* renamed from: a */
            public void mo17692a(String str) {
                C1667f.f3056a.post(new RunnableC4910OooO00o(str));
            }
        }

        public OooO00o(String str, AbstractC1668a aVar) {
            this.o0ooOOo = str;
            this.OooO00o = aVar;
        }

        public void run() {
            C1667f.m2947b(this.o0ooOOo, false, true, null, null, new C4909OooO00o());
        }
    }

    /* renamed from: com.netease.nis.captcha.f$a */
    public interface AbstractC1668a {
        /* renamed from: a */
        void mo17691a(int i, String str);

        /* renamed from: a */
        void mo17692a(String str);
    }

    /* renamed from: a */
    public static void m2945a(String str, AbstractC1668a aVar) {
        C1664d.m2931a("%s", "get request url:" + str);
        f3057b.execute(new OooO00o(str, aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132 A[SYNTHETIC, Splitter:B:73:0x0132] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2947b(java.lang.String r8, boolean r9, boolean r10, java.lang.String r11, android.net.Network r12, com.netease.nis.captcha.C1667f.AbstractC1668a r13) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netease.nis.captcha.C1667f.m2947b(java.lang.String, boolean, boolean, java.lang.String, android.net.Network, com.netease.nis.captcha.f$a):void");
    }
}
