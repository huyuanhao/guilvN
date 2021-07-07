package com.p118pd.sdk;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: com.pd.sdk.OOOO0O0 */
public final class OOOO0O0 implements AbstractC8210oOOoO0o0 {
    public final oOOO0000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9007ooOo00o f16986OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CRC32 f16987OooO00o = new CRC32();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Deflater f16988OooO00o;
    public boolean OooO0O0;

    public OOOO0O0(AbstractC8210oOOoO0o0 ooooo0o0) {
        if (ooooo0o0 != null) {
            this.f16988OooO00o = new Deflater(-1, true);
            oOOO0000 OooO00o2 = C9143oooO0oOo.OooO00o(ooooo0o0);
            this.OooO00o = OooO00o2;
            this.f16986OooO00o = new C9007ooOo00o(OooO00o2, this.f16988OooO00o);
            OooO0O0();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    private void OooO0O0() {
        OOOO000 OooO00o2 = this.OooO00o.OooO00o();
        OooO00o2.OooO0Oo(8075);
        OooO00o2.OooO0o0(8);
        OooO00o2.OooO0o0(0);
        OooO00o2.OooO0o(0);
        OooO00o2.OooO0o0(0);
        OooO00o2.OooO0o0(0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Deflater m16622OooO00o() {
        return this.f16988OooO00o;
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.OooO0O0) {
            Throwable th = null;
            try {
                this.f16986OooO00o.OooO00o();
                OooO00o();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f16988OooO00o.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.OooO00o.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.OooO0O0 = true;
            if (th != null) {
                C8976ooOOoO00.OooO00o(th);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
    public void flush() throws IOException {
        this.f16986OooO00o.flush();
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public C9193oooOoo timeout() {
        return this.OooO00o.timeout();
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public void write(OOOO000 oooo000, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j != 0) {
            OooO0O0(oooo000, j);
            this.f16986OooO00o.write(oooo000, j);
        }
    }

    private void OooO00o() throws IOException {
        this.OooO00o.OooO0OO((int) this.f16987OooO00o.getValue());
        this.OooO00o.OooO0OO((int) this.f16988OooO00o.getBytesRead());
    }

    private void OooO0O0(OOOO000 oooo000, long j) {
        C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o));
            this.f16987OooO00o.update(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
            j -= (long) min;
            ooooo00o = ooooo00o.f22168OooO00o;
        }
    }
}
