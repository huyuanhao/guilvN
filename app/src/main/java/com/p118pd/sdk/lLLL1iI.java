package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l丨LLL1iI  reason: invalid class name */
public class lLLL1iI extends C1L1l {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11L f18913OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18914OooO00o;

    /* renamed from: com.pd.sdk.l丨LLL1iI$OooO00o */
    public class OooO00o extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C4984 f18915OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OutputStream f18916OooO00o;
        public C4984 OooO0O0;
        public C4984 OooO0OO;

        public OooO00o(OutputStream outputStream, C4984 r3, C4984 r4, C4984 r5) {
            this.f18916OooO00o = outputStream;
            this.f18915OooO00o = r3;
            this.OooO0O0 = r4;
            this.OooO0OO = r5;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f18916OooO00o.close();
            this.OooO0OO.OooO0O0();
            AbstractC9852lIli r0 = ((C1L1l) lLLL1iI.this).f22780OooO00o;
            if (r0 != null) {
                this.OooO0O0.OooO00o(new ILI1Ll(false, 1, new C5781LlIl(r0.OooO00o(new HashMap()).m21785OooO00o())));
            }
            this.OooO0O0.OooO0O0();
            this.f18915OooO00o.OooO0O0();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f18916OooO00o.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18916OooO00o.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f18916OooO00o.write(bArr, i, i2);
        }
    }

    private C6513lIiI OooO00o() {
        return (((C1L1l) this).f22779OooO00o == null && this.f18913OooO00o == null) ? new C6513lIiI(0) : new C6513lIiI(2);
    }

    private OutputStream OooO0O0(LlLI1 llLI1, OutputStream outputStream, AbstractC5650LIL r7) throws IOException, CMSException {
        iILLL1 r0 = new iILLL1();
        LIiI11 OooO00o2 = r7.OooO00o();
        for (AbstractC5760Lil r3 : this.f22782OooO0O0) {
            r0.OooO00o(r3.OooO00o(OooO00o2));
        }
        return OooO00o(llLI1, outputStream, r0, r7);
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, AbstractC5650LIL r3) throws CMSException, IOException {
        return OooO0O0(llLI1, outputStream, r3);
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, iILLL1 r9, AbstractC5650LIL r10) throws IOException {
        C4984 r3 = new C4984(outputStream);
        r3.OooO00o(AbstractC6252iiLl.OooO0OO);
        C4984 r4 = new C4984(r3.OooO00o(), 0, true);
        r4.OooO00o(OooO00o());
        if (((C1L1l) this).f22779OooO00o != null) {
            r4.OooO00o(new ILI1Ll(false, 0, ((C1L1l) this).f22779OooO00o));
        }
        if (this.f18914OooO00o) {
            r4.OooO00o().write(new C5781LlIl(r9).getEncoded());
        } else {
            r4.OooO00o().write(new i1I1I1l(r9).getEncoded());
        }
        C4984 r5 = new C4984(r4.OooO00o());
        r5.OooO00o(llLI1);
        r5.OooO00o().write(r10.m16163OooO00o().getEncoded());
        return new OooO00o(r10.OooO00o(C5799LllI.OooO00o(r5.OooO00o(), 0, false, this.OooO00o)), r3, r4, r5);
    }

    public OutputStream OooO00o(OutputStream outputStream, AbstractC5650LIL r4) throws CMSException, IOException {
        return OooO0O0(new LlLI1(AbstractC6252iiLl.OooO00o.m16387OooO0O0()), outputStream, r4);
    }

    public OutputStream OooO00o(OutputStream outputStream, iILLL1 r9, AbstractC5650LIL r10) throws CMSException {
        try {
            C4984 r3 = new C4984(outputStream);
            r3.OooO00o(AbstractC6252iiLl.OooO0OO);
            C4984 r4 = new C4984(r3.OooO00o(), 0, true);
            I11L r8 = this.f18914OooO00o ? new C5781LlIl(r9) : new i1I1I1l(r9);
            r4.OooO00o(new C6513lIiI((long) Ii1I1LlI.OooO00o(((C1L1l) this).f22779OooO00o, r8, this.f18913OooO00o)));
            if (((C1L1l) this).f22779OooO00o != null) {
                r4.OooO00o(new ILI1Ll(false, 0, ((C1L1l) this).f22779OooO00o));
            }
            r4.OooO00o().write(r8.getEncoded());
            C4984 r5 = new C4984(r4.OooO00o());
            r5.OooO00o(AbstractC6252iiLl.OooO00o);
            r5.OooO00o().write(r10.m16163OooO00o().getEncoded());
            return new OooO00o(r10.OooO00o(C5799LllI.OooO00o(r5.OooO00o(), 0, false, this.OooO00o)), r3, r4, r5);
        } catch (IOException e) {
            throw new CMSException("exception decoding algorithm parameters.", e);
        }
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
    }

    public void OooO00o(boolean z) {
        this.f18914OooO00o = z;
    }
}
