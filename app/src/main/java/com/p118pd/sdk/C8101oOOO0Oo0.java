package com.p118pd.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: com.pd.sdk.oOOO0Oo0  reason: case insensitive filesystem */
public final class C8101oOOO0Oo0 implements AbstractC8930ooOOO0OO {
    public final oOOO000O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Inflater f21117OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;

    public C8101oOOO0Oo0(AbstractC8930ooOOO0OO ooooo0oo, Inflater inflater) {
        this(C9143oooO0oOo.OooO00o(ooooo0oo), inflater);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m19768OooO00o() throws IOException {
        if (!this.f21117OooO00o.needsInput()) {
            return false;
        }
        OooO00o();
        if (this.f21117OooO00o.getRemaining() != 0) {
            throw new IllegalStateException(C8932ooOOO0o.f22176OooO00o);
        } else if (this.OooO00o.m19766OooO0OO()) {
            return true;
        } else {
            C8927ooOOO00o ooooo00o = this.OooO00o.m19754OooO00o().f16982OooO00o;
            int i = ooooo00o.OooO0O0;
            int i2 = ooooo00o.OooO00o;
            int i3 = i - i2;
            this.o00oO0O = i3;
            this.f21117OooO00o.setInput(ooooo00o.f22170OooO00o, i2, i3);
            return false;
        }
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.OooO0O0) {
            this.f21117OooO00o.end();
            this.OooO0O0 = true;
            this.OooO00o.close();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public long read(OOOO000 oooo000, long j) throws IOException {
        C8927ooOOO00o OooO00o2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.OooO0O0) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean OooO00o3 = m19768OooO00o();
                try {
                    OooO00o2 = oooo000.m16590OooO00o(1);
                    int inflate = this.f21117OooO00o.inflate(OooO00o2.f22170OooO00o, OooO00o2.OooO0O0, (int) Math.min(j, (long) (8192 - OooO00o2.OooO0O0)));
                    if (inflate > 0) {
                        OooO00o2.OooO0O0 += inflate;
                        long j2 = (long) inflate;
                        oooo000.f16981OooO00o += j2;
                        return j2;
                    } else if (this.f21117OooO00o.finished()) {
                        break;
                    } else if (this.f21117OooO00o.needsDictionary()) {
                        break;
                    } else if (OooO00o3) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            OooO00o();
            if (OooO00o2.OooO00o != OooO00o2.OooO0O0) {
                return -1;
            }
            oooo000.f16982OooO00o = OooO00o2.OooO00o();
            OOOOO0O.OooO00o(OooO00o2);
            return -1;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public C9193oooOoo timeout() {
        return this.OooO00o.timeout();
    }

    public C8101oOOO0Oo0(oOOO000O oooo000o, Inflater inflater) {
        if (oooo000o == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.OooO00o = oooo000o;
            this.f21117OooO00o = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void OooO00o() throws IOException {
        int i = this.o00oO0O;
        if (i != 0) {
            int remaining = i - this.f21117OooO00o.getRemaining();
            this.o00oO0O -= remaining;
            this.OooO00o.m19759OooO00o((long) remaining);
        }
    }
}
