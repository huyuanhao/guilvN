package com.p118pd.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: com.pd.sdk.oOOO0O00 */
public final class oOOO0O00 implements AbstractC8930ooOOO0OO {
    public static final byte OooO00o = 1;
    public static final byte OooO0O0 = 2;
    public static final byte OooO0OO = 3;
    public static final byte OooO0Oo = 4;
    public static final byte OooO0o = 1;
    public static final byte OooO0o0 = 0;
    public static final byte OooO0oO = 2;
    public static final byte OooO0oo = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final oOOO000O f21105OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C8101oOOO0Oo0 f21106OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CRC32 f21107OooO00o = new CRC32();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Inflater f21108OooO00o;
    public int o00oO0O = 0;

    public oOOO0O00(AbstractC8930ooOOO0OO ooooo0oo) {
        if (ooooo0oo != null) {
            this.f21108OooO00o = new Inflater(true);
            oOOO000O OooO00o2 = C9143oooO0oOo.OooO00o(ooooo0oo);
            this.f21105OooO00o = OooO00o2;
            this.f21106OooO00o = new C8101oOOO0Oo0(OooO00o2, this.f21108OooO00o);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void OooO00o() throws IOException {
        this.f21105OooO00o.m19764OooO0O0(10L);
        byte OooO00o2 = this.f21105OooO00o.m19754OooO00o().OooO00o(3L);
        boolean z = ((OooO00o2 >> 1) & 1) == 1;
        if (z) {
            OooO00o(this.f21105OooO00o.m19754OooO00o(), 0, 10);
        }
        OooO00o("ID1ID2", 8075, this.f21105OooO00o.readShort());
        this.f21105OooO00o.m19759OooO00o(8L);
        if (((OooO00o2 >> 2) & 1) == 1) {
            this.f21105OooO00o.m19764OooO0O0(2L);
            if (z) {
                OooO00o(this.f21105OooO00o.m19754OooO00o(), 0, 2);
            }
            long OooO00o3 = (long) this.f21105OooO00o.m19754OooO00o().m16599OooO00o();
            this.f21105OooO00o.m19764OooO0O0(OooO00o3);
            if (z) {
                OooO00o(this.f21105OooO00o.m19754OooO00o(), 0, OooO00o3);
            }
            this.f21105OooO00o.m19759OooO00o(OooO00o3);
        }
        if (((OooO00o2 >> 3) & 1) == 1) {
            long OooO00o4 = this.f21105OooO00o.OooO00o((byte) 0);
            if (OooO00o4 != -1) {
                if (z) {
                    OooO00o(this.f21105OooO00o.m19754OooO00o(), 0, OooO00o4 + 1);
                }
                this.f21105OooO00o.m19759OooO00o(OooO00o4 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((OooO00o2 >> 4) & 1) == 1) {
            long OooO00o5 = this.f21105OooO00o.OooO00o((byte) 0);
            if (OooO00o5 != -1) {
                if (z) {
                    OooO00o(this.f21105OooO00o.m19754OooO00o(), 0, OooO00o5 + 1);
                }
                this.f21105OooO00o.m19759OooO00o(OooO00o5 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            OooO00o("FHCRC", this.f21105OooO00o.m19758OooO00o(), (short) ((int) this.f21107OooO00o.getValue()));
            this.f21107OooO00o.reset();
        }
    }

    private void OooO0O0() throws IOException {
        OooO00o("CRC", this.f21105OooO00o.OooO00o(), (int) this.f21107OooO00o.getValue());
        OooO00o("ISIZE", this.f21105OooO00o.OooO00o(), (int) this.f21108OooO00o.getBytesWritten());
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21106OooO00o.close();
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public long read(OOOO000 oooo000, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.o00oO0O == 0) {
                OooO00o();
                this.o00oO0O = 1;
            }
            if (this.o00oO0O == 1) {
                long j2 = oooo000.f16981OooO00o;
                long read = this.f21106OooO00o.read(oooo000, j);
                if (read != -1) {
                    OooO00o(oooo000, j2, read);
                    return read;
                }
                this.o00oO0O = 2;
            }
            if (this.o00oO0O == 2) {
                OooO0O0();
                this.o00oO0O = 3;
                if (!this.f21105OooO00o.m19766OooO0OO()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public C9193oooOoo timeout() {
        return this.f21105OooO00o.timeout();
    }

    private void OooO00o(OOOO000 oooo000, long j, long j2) {
        C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
        while (true) {
            int i = ooooo00o.OooO0O0;
            int i2 = ooooo00o.OooO00o;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            ooooo00o = ooooo00o.f22168OooO00o;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) ooooo00o.OooO00o) + j);
            int min = (int) Math.min((long) (ooooo00o.OooO0O0 - i3), j2);
            this.f21107OooO00o.update(ooooo00o.f22170OooO00o, i3, min);
            j2 -= (long) min;
            ooooo00o = ooooo00o.f22168OooO00o;
            j = 0;
        }
    }

    private void OooO00o(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
