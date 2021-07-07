package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.pd.sdk.oo0oooo  reason: case insensitive filesystem */
public abstract class AbstractC8784oo0oooo {
    public static final boolean OooO00o = true;
    public static final int OooO0Oo = 1024;
    public static final int OooO0o = 8388608;
    public static final int OooO0o0 = 1048576;
    public static final int OooO0oO = 4194304;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21982OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8786OooO0o0 f21983OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21984OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Executor f21985OooO00o = Executors.newSingleThreadExecutor();
    public int OooO0O0;
    public int OooO0OO = 3;

    /* renamed from: com.pd.sdk.oo0oooo$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ boolean OooO0O0;

        public OooO00o(boolean z) {
            this.OooO0O0 = z;
        }

        public void run() {
            AbstractC8784oo0oooo.this.OooO00o(this.OooO0O0);
        }
    }

    /* renamed from: com.pd.sdk.oo0oooo$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            AbstractC8784oo0oooo.this.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.oo0oooo$OooO0OO */
    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        public void run() {
            AbstractC8784oo0oooo.this.OooO0OO();
        }
    }

    /* renamed from: com.pd.sdk.oo0oooo$OooO0Oo  reason: case insensitive filesystem */
    public class RunnableC8785OooO0Oo implements Runnable {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable f21987OooO00o;
        public final /* synthetic */ long OooO0O0;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public RunnableC8785OooO0Oo(long j, int i, String str, long j2, String str2, Throwable th) {
            this.OooO00o = j;
            this.o00oO0O = i;
            this.o0ooOOo = str;
            this.OooO0O0 = j2;
            this.o0ooOoO = str2;
            this.f21987OooO00o = th;
        }

        public void run() {
            String OooO00o2 = C8788oo0ooooO.OooO00o(this.OooO00o);
            int i = this.o00oO0O;
            String str = this.o0ooOOo;
            Log.println(i, str, this.OooO0O0 + C8932ooOOO0o.OooO0OO + this.o0ooOoO + '\n' + Log.getStackTraceString(this.f21987OooO00o));
            if (!TextUtils.isEmpty(AbstractC8784oo0oooo.this.f21984OooO00o) && !TextUtils.isEmpty(this.o0ooOoO) && AbstractC8784oo0oooo.this.OooO0OO <= this.o00oO0O) {
                if (AbstractC8784oo0oooo.this.f21983OooO00o == null || AbstractC8784oo0oooo.this.f21983OooO00o.OooO00o()) {
                    AbstractC8784oo0oooo.this.OooO00o(C8788oo0ooooO.OooO00o(this.o0ooOOo, OooO00o2, this.o0ooOoO, this.f21987OooO00o));
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0oooo$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC8786OooO0o0 {
        boolean OooO00o();
    }

    public abstract void OooO00o();

    public abstract void OooO00o(String str);

    public abstract void OooO00o(boolean z);

    public void OooO0O0() {
        if (!TextUtils.isEmpty(this.f21984OooO00o)) {
            OooO00o(new OooO0O0());
        }
    }

    public abstract void OooO0OO();

    public void OooO0OO(String str, String str2) {
        OooO0OO(str, str2, null);
    }

    public void OooO0Oo() {
        if (!TextUtils.isEmpty(this.f21984OooO00o)) {
            OooO00o(new OooO0OO());
        }
    }

    public void OooO0o0(String str, String str2) {
        OooO0o0(str, str2, null);
    }

    public void OooO0OO(String str, String str2, Throwable th) {
        OooO00o(4, str, str2, th);
    }

    public void OooO0o0(String str, String str2, Throwable th) {
        OooO00o(5, str, str2, th);
    }

    public void OooO00o(int i) {
        this.OooO0OO = i;
    }

    public void OooO00o(String str, String str2, int i, int i2, int i3, boolean z, AbstractC8786OooO0o0 oooO0o0) {
        this.f21984OooO00o = C8793ooO0000.OooO00o(str, str2);
        this.OooO0OO = i;
        this.f21983OooO00o = oooO0o0;
        this.f21982OooO00o = i2;
        this.OooO0O0 = i3;
        if (i2 <= 0) {
            this.f21982OooO00o = 8388608;
        }
        if (this.OooO0O0 <= 0) {
            this.OooO0O0 = 4194304;
        }
        OooO00o(new OooO00o(z));
    }

    public void OooO0O0(String str, String str2) {
        OooO0O0(str, str2, null);
    }

    public void OooO0Oo(String str, String str2) {
        OooO0Oo(str, str2, null);
    }

    public void OooO0O0(String str, String str2, Throwable th) {
        OooO00o(6, str, str2, th);
    }

    public void OooO0Oo(String str, String str2, Throwable th) {
        OooO00o(2, str, str2, th);
    }

    private void OooO00o(int i, String str, String str2, Throwable th) {
        OooO00o(new RunnableC8785OooO0Oo(System.currentTimeMillis(), i, str, Thread.currentThread().getId(), str2, th));
    }

    private void OooO00o(Runnable runnable) {
        this.f21985OooO00o.execute(runnable);
    }

    public void OooO00o(String str, String str2) {
        OooO00o(str, str2, (Throwable) null);
    }

    public void OooO00o(String str, String str2, Throwable th) {
        OooO00o(3, str, str2, th);
    }

    private void OooO00o(int i, String str, String str2) {
        OooO00o(i, str, str2, null);
    }
}
