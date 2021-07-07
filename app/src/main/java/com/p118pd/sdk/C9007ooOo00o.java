package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: com.pd.sdk.ooOo00o  reason: case insensitive filesystem */
public final class C9007ooOo00o implements AbstractC8210oOOoO0o0 {
    public final oOOO0000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Deflater f22310OooO00o;
    public boolean OooO0O0;

    public C9007ooOo00o(AbstractC8210oOOoO0o0 ooooo0o0, Deflater deflater) {
        this(C9143oooO0oOo.OooO00o(ooooo0o0), deflater);
    }

    @IgnoreJRERequirement
    private void OooO00o(boolean z) throws IOException {
        C8927ooOOO00o OooO00o2;
        int i;
        OOOO000 OooO00o3 = this.OooO00o.OooO00o();
        while (true) {
            OooO00o2 = OooO00o3.m16590OooO00o(1);
            if (z) {
                Deflater deflater = this.f22310OooO00o;
                byte[] bArr = OooO00o2.f22170OooO00o;
                int i2 = OooO00o2.OooO0O0;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f22310OooO00o;
                byte[] bArr2 = OooO00o2.f22170OooO00o;
                int i3 = OooO00o2.OooO0O0;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                OooO00o2.OooO0O0 += i;
                OooO00o3.f16981OooO00o += (long) i;
                this.OooO00o.OooO0O0();
            } else if (this.f22310OooO00o.needsInput()) {
                break;
            }
        }
        if (OooO00o2.OooO00o == OooO00o2.OooO0O0) {
            OooO00o3.f16982OooO00o = OooO00o2.OooO00o();
            OOOOO0O.OooO00o(OooO00o2);
        }
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.OooO0O0) {
            Throwable th = null;
            try {
                OooO00o();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f22310OooO00o.end();
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
        OooO00o(true);
        this.OooO00o.flush();
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public C9193oooOoo timeout() {
        return this.OooO00o.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.OooO00o + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public void write(OOOO000 oooo000, long j) throws IOException {
        C8976ooOOoO00.OooO00o(oooo000.f16981OooO00o, 0, j);
        while (j > 0) {
            C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
            int min = (int) Math.min(j, (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o));
            this.f22310OooO00o.setInput(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
            OooO00o(false);
            long j2 = (long) min;
            oooo000.f16981OooO00o -= j2;
            int i = ooooo00o.OooO00o + min;
            ooooo00o.OooO00o = i;
            if (i == ooooo00o.OooO0O0) {
                oooo000.f16982OooO00o = ooooo00o.OooO00o();
                OOOOO0O.OooO00o(ooooo00o);
            }
            j -= j2;
        }
    }

    public C9007ooOo00o(oOOO0000 oooo0000, Deflater deflater) {
        if (oooo0000 == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.OooO00o = oooo0000;
            this.f22310OooO00o = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public void OooO00o() throws IOException {
        this.f22310OooO00o.finish();
        OooO00o(false);
    }
}
