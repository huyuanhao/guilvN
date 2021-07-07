package com.p118pd.sdk;

import android.util.Log;
import com.p118pd.sdk.AbstractC7734o0ooo00O;
import com.p118pd.sdk.C7626o0oOOooO;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.o0ooo0o0  reason: case insensitive filesystem */
public class C7739o0ooo0o0 implements AbstractC7734o0ooo00O {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C7739o0ooo0o0 f20739OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20740OooO00o = "DiskLruCacheWrapper";
    public static final int OooO0O0 = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f20741OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7626o0oOOooO f20742OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7732o0ooo0 f20743OooO00o = new C7732o0ooo0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7747o0oooOO0 f20744OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final File f20745OooO00o;

    @Deprecated
    public C7739o0ooo0o0(File file, long j) {
        this.f20745OooO00o = file;
        this.f20741OooO00o = j;
        this.f20744OooO00o = new C7747o0oooOO0();
    }

    public static AbstractC7734o0ooo00O OooO00o(File file, long j) {
        return new C7739o0ooo0o0(file, j);
    }

    @Deprecated
    public static synchronized AbstractC7734o0ooo00O OooO0O0(File file, long j) {
        C7739o0ooo0o0 o0ooo0o0;
        synchronized (C7739o0ooo0o0.class) {
            if (f20739OooO00o == null) {
                f20739OooO00o = new C7739o0ooo0o0(file, j);
            }
            o0ooo0o0 = f20739OooO00o;
        }
        return o0ooo0o0;
    }

    @Override // com.p118pd.sdk.AbstractC7734o0ooo00O
    public synchronized void clear() {
        try {
            OooO00o().m19262OooO00o();
        } catch (IOException unused) {
            Log.isLoggable(f20740OooO00o, 5);
        } catch (Throwable th) {
            m19389OooO00o();
            throw th;
        }
        m19389OooO00o();
    }

    private synchronized C7626o0oOOooO OooO00o() throws IOException {
        if (this.f20742OooO00o == null) {
            this.f20742OooO00o = C7626o0oOOooO.OooO00o(this.f20745OooO00o, 1, 1, this.f20741OooO00o);
        }
        return this.f20742OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7734o0ooo00O, com.p118pd.sdk.AbstractC7734o0ooo00O
    public File OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        String OooO00o2 = this.f20744OooO00o.OooO00o(o0ooooo);
        if (Log.isLoggable(f20740OooO00o, 2)) {
            String str = "Get: Obtained: " + OooO00o2 + " for for Key: " + o0ooooo;
        }
        try {
            C7626o0oOOooO.C7628OooO0o0 OooO00o3 = OooO00o().m19260OooO00o(OooO00o2);
            if (OooO00o3 != null) {
                return OooO00o3.m19269OooO00o(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable(f20740OooO00o, 5);
            return null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7734o0ooo00O
    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, AbstractC7734o0ooo00O.OooO0O0 oooO0O0) {
        String OooO00o2 = this.f20744OooO00o.OooO00o(o0ooooo);
        this.f20743OooO00o.OooO00o(OooO00o2);
        try {
            if (Log.isLoggable(f20740OooO00o, 2)) {
                String str = "Put: Obtained: " + OooO00o2 + " for for Key: " + o0ooooo;
            }
            try {
                C7626o0oOOooO OooO00o3 = OooO00o();
                if (OooO00o3.m19260OooO00o(OooO00o2) == null) {
                    C7626o0oOOooO.OooO0OO OooO00o4 = OooO00o3.m19259OooO00o(OooO00o2);
                    if (OooO00o4 != null) {
                        try {
                            if (oooO0O0.OooO00o(OooO00o4.m19266OooO00o(0))) {
                                OooO00o4.OooO0OO();
                            }
                            this.f20743OooO00o.OooO0O0(OooO00o2);
                        } finally {
                            OooO00o4.OooO0O0();
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + OooO00o2);
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable(f20740OooO00o, 5);
            }
        } finally {
            this.f20743OooO00o.OooO0O0(OooO00o2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7734o0ooo00O, com.p118pd.sdk.AbstractC7734o0ooo00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19390OooO00o(AbstractC7644o0oOoOO o0ooooo) {
        try {
            OooO00o().m19263OooO00o(this.f20744OooO00o.OooO00o(o0ooooo));
        } catch (IOException unused) {
            Log.isLoggable(f20740OooO00o, 5);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private synchronized void m19389OooO00o() {
        this.f20742OooO00o = null;
    }
}
