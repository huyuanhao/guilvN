package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.OOoOO0 */
public final class OOoOO0 {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OOOO000 f16990OooO00o = new OOOO000();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC8210oOOoO0o0 f16991OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC8930ooOOO0OO f16992OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16993OooO00o;
    public boolean OooO0O0;

    /* renamed from: com.pd.sdk.OOoOO0$OooO00o */
    public final class OooO00o implements AbstractC8210oOOoO0o0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9193oooOoo f16994OooO00o = new C9193oooOoo();

        public OooO00o() {
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (OOoOO0.this.f16990OooO00o) {
                if (!OOoOO0.this.f16993OooO00o) {
                    if (OOoOO0.this.OooO0O0) {
                        if (OOoOO0.this.f16990OooO00o.OooO0o0() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    OOoOO0.this.f16993OooO00o = true;
                    OOoOO0.this.f16990OooO00o.notifyAll();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
            synchronized (OOoOO0.this.f16990OooO00o) {
                if (OOoOO0.this.f16993OooO00o) {
                    throw new IllegalStateException("closed");
                } else if (OOoOO0.this.OooO0O0) {
                    if (OOoOO0.this.f16990OooO00o.OooO0o0() > 0) {
                        throw new IOException("source is closed");
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return this.f16994OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            synchronized (OOoOO0.this.f16990OooO00o) {
                if (!OOoOO0.this.f16993OooO00o) {
                    while (j > 0) {
                        if (!OOoOO0.this.OooO0O0) {
                            long OooO0o0 = OOoOO0.this.OooO00o - OOoOO0.this.f16990OooO00o.OooO0o0();
                            if (OooO0o0 == 0) {
                                this.f16994OooO00o.waitUntilNotified(OOoOO0.this.f16990OooO00o);
                            } else {
                                long min = Math.min(OooO0o0, j);
                                OOoOO0.this.f16990OooO00o.write(oooo000, min);
                                j -= min;
                                OOoOO0.this.f16990OooO00o.notifyAll();
                            }
                        } else {
                            throw new IOException("source is closed");
                        }
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.OOoOO0$OooO0O0 */
    public final class OooO0O0 implements AbstractC8930ooOOO0OO {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9193oooOoo f16995OooO00o = new C9193oooOoo();

        public OooO0O0() {
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (OOoOO0.this.f16990OooO00o) {
                OOoOO0.this.OooO0O0 = true;
                OOoOO0.this.f16990OooO00o.notifyAll();
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            synchronized (OOoOO0.this.f16990OooO00o) {
                if (!OOoOO0.this.OooO0O0) {
                    while (OOoOO0.this.f16990OooO00o.OooO0o0() == 0) {
                        if (OOoOO0.this.f16993OooO00o) {
                            return -1;
                        }
                        this.f16995OooO00o.waitUntilNotified(OOoOO0.this.f16990OooO00o);
                    }
                    long read = OOoOO0.this.f16990OooO00o.read(oooo000, j);
                    OOoOO0.this.f16990OooO00o.notifyAll();
                    return read;
                }
                throw new IllegalStateException("closed");
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return this.f16995OooO00o;
        }
    }

    public OOoOO0(long j) {
        if (j >= 1) {
            this.OooO00o = j;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final AbstractC8930ooOOO0OO m16623OooO00o() {
        return this.f16992OooO00o;
    }

    public final AbstractC8210oOOoO0o0 OooO00o() {
        return this.f16991OooO00o;
    }
}
