package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSStreamException;

/* renamed from: com.pd.sdk.llL丨IL  reason: invalid class name and case insensitive filesystem */
public class C6778llLIL extends Il1IL1 {
    public int OooO00o;

    /* renamed from: com.pd.sdk.llL丨IL$OooO00o */
    public class OooO00o extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C4984 f18801OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OutputStream f18802OooO00o;
        public C4984 OooO0O0;
        public C4984 OooO0OO;
        public LlLI1 o00OoOOo;

        public OooO00o(OutputStream outputStream, LlLI1 llLI1, C4984 r4, C4984 r5, C4984 r6) {
            this.f18802OooO00o = outputStream;
            this.o00OoOOo = llLI1;
            this.f18801OooO00o = r4;
            this.OooO0O0 = r5;
            this.OooO0OO = r6;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f18802OooO00o.close();
            this.OooO0OO.OooO0O0();
            ((Il1IL1) C6778llLIL.this).f15786OooO00o.clear();
            if (((Il1IL1) C6778llLIL.this).f15785OooO00o.size() != 0) {
                this.OooO0O0.OooO00o().write(new C6881lliiI1(false, 0, C5799LllI.OooO00o(((Il1IL1) C6778llLIL.this).f15785OooO00o)).getEncoded());
            }
            if (C6778llLIL.this.f15787OooO0O0.size() != 0) {
                this.OooO0O0.OooO00o().write(new C6881lliiI1(false, 1, C5799LllI.OooO00o(C6778llLIL.this.f15787OooO0O0)).getEncoded());
            }
            iILLL1 r0 = new iILLL1();
            for (C6248iiLLi iilli : C6778llLIL.this.f15789OooO0Oo) {
                try {
                    r0.OooO00o(iilli.OooO00o(this.o00OoOOo));
                    ((Il1IL1) C6778llLIL.this).f15786OooO00o.put(iilli.m17258OooO00o().OooO00o().m16387OooO0O0(), iilli.m17264OooO00o());
                } catch (CMSException e) {
                    throw new CMSStreamException("exception generating signers: " + e.getMessage(), e);
                }
            }
            for (C5510IIl r2 : C6778llLIL.this.f15788OooO0OO) {
                r0.OooO00o(r2.m15766OooO00o());
            }
            this.OooO0O0.OooO00o().write(new i1I1I1l(r0).getEncoded());
            this.OooO0O0.OooO0O0();
            this.f18801OooO00o.OooO0O0();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f18802OooO00o.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18802OooO00o.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f18802OooO00o.write(bArr, i, i2);
        }
    }

    private C6513lIiI OooO00o(LlLI1 llLI1) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = ((Il1IL1) this).f15785OooO00o;
        boolean z4 = false;
        if (list != null) {
            z3 = false;
            z2 = false;
            z = false;
            for (Object obj : list) {
                if (obj instanceof AbstractC5903LlLLL) {
                    AbstractC5903LlLLL r6 = (AbstractC5903LlLLL) obj;
                    if (r6.OooO00o() == 1) {
                        z2 = true;
                    } else if (r6.OooO00o() == 2) {
                        z = true;
                    } else if (r6.OooO00o() == 3) {
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        if (z3) {
            return new C6513lIiI(5);
        }
        List<Object> list2 = this.f15787OooO0O0;
        if (list2 != null) {
            for (Object obj2 : list2) {
                if (obj2 instanceof AbstractC5903LlLLL) {
                    z4 = true;
                }
            }
        }
        return z4 ? new C6513lIiI(5) : z ? new C6513lIiI(4) : z2 ? new C6513lIiI(3) : OooO00o(this.f15788OooO0OO, this.f15789OooO0Oo) ? new C6513lIiI(3) : !AbstractC6252iiLl.OooO00o.equals(llLI1) ? new C6513lIiI(3) : new C6513lIiI(1);
    }

    private boolean OooO00o(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C6710li1.OooO00o(((C5510IIl) it.next()).m15766OooO00o()).m17804OooO00o().m17647OooO0O0().intValue() == 3) {
                return true;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((C6248iiLLi) it2.next()).OooO00o() == 3) {
                return true;
            }
        }
        return false;
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, boolean z) throws IOException {
        return OooO00o(llLI1, outputStream, z, null);
    }

    public OutputStream OooO00o(LlLI1 llLI1, OutputStream outputStream, boolean z, OutputStream outputStream2) throws IOException {
        C4984 r4 = new C4984(outputStream);
        r4.OooO00o(AbstractC6252iiLl.OooO0O0);
        C4984 r5 = new C4984(r4.OooO00o(), 0, true);
        r5.OooO00o(OooO00o(llLI1));
        iILLL1 r9 = new iILLL1();
        for (C5510IIl r3 : this.f15788OooO0OO) {
            r9.OooO00o(C6079iI11II.OooO00o.OooO00o(r3.m15765OooO00o()));
        }
        for (C6248iiLLi iilli : this.f15789OooO0Oo) {
            r9.OooO00o(iilli.m17258OooO00o());
        }
        r5.OooO00o().write(new i1I1I1l(r9).getEncoded());
        C4984 r6 = new C4984(r5.OooO00o());
        r6.OooO00o(llLI1);
        return new OooO00o(C5799LllI.OooO00o(this.f15789OooO0Oo, C5799LllI.OooO00o(outputStream2, z ? C5799LllI.OooO00o(r6.OooO00o(), 0, true, this.OooO00o) : null)), llLI1, r4, r5, r6);
    }

    public OutputStream OooO00o(OutputStream outputStream) throws IOException {
        return OooO00o(outputStream, false);
    }

    public OutputStream OooO00o(OutputStream outputStream, boolean z) throws IOException {
        return OooO00o(AbstractC6252iiLl.OooO00o, outputStream, z);
    }

    public OutputStream OooO00o(OutputStream outputStream, boolean z, OutputStream outputStream2) throws IOException {
        return OooO00o(AbstractC6252iiLl.OooO00o, outputStream, z, outputStream2);
    }

    public void OooO00o(int i) {
        this.OooO00o = i;
    }
}
