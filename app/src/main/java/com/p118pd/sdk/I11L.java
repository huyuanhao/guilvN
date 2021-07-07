package com.p118pd.sdk;

import com.p118pd.sdk.C9586iIILl;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.pd.sdk.I11L */
public abstract class I11L extends AbstractC6122iIlLiL implements AbstractC9757IL1i1<AbstractC6854lLi1LL> {
    public Vector OooO00o;
    public boolean OooO0O0;

    /* renamed from: com.pd.sdk.I11L$OooO00o */
    public class OooO00o implements AbstractC6796llliI {
        public final /* synthetic */ I11L OooO00o;
        public final int o00oO0O = I11L.this.size();
        public int o0ooOO0;

        public OooO00o(I11L i11l) {
            this.OooO00o = i11l;
        }

        @Override // com.p118pd.sdk.AbstractC6796llliI, com.p118pd.sdk.AbstractC6181iLiLI
        public AbstractC6122iIlLiL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6796llliI, com.p118pd.sdk.AbstractC6181iLiLI
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC6854lLi1LL m15219OooO00o() throws IOException {
            int i = this.o0ooOO0;
            if (i == this.o00oO0O) {
                return null;
            }
            I11L i11l = I11L.this;
            this.o0ooOO0 = i + 1;
            AbstractC6854lLi1LL OooO00o2 = i11l.OooO00o(i);
            return OooO00o2 instanceof I11li1 ? ((I11li1) OooO00o2).OooO00o() : OooO00o2 instanceof I11L ? ((I11L) OooO00o2).OooO00o() : OooO00o2;
        }

        @Override // com.p118pd.sdk.AbstractC6854lLi1LL
        public AbstractC6122iIlLiL OooO0O0() {
            return this.OooO00o;
        }
    }

    public I11L() {
        this.OooO00o = new Vector();
        this.OooO0O0 = false;
    }

    public I11L(iILLL1 r4, boolean z) {
        this.OooO00o = new Vector();
        this.OooO0O0 = false;
        for (int i = 0; i != r4.OooO00o(); i++) {
            this.OooO00o.addElement(r4.OooO00o(i));
        }
        if (z) {
            m15216OooO00o();
        }
    }

    public I11L(AbstractC6854lLi1LL r3) {
        Vector vector = new Vector();
        this.OooO00o = vector;
        this.OooO0O0 = false;
        vector.addElement(r3);
    }

    public I11L(AbstractC6854lLi1LL[] r4, boolean z) {
        this.OooO00o = new Vector();
        this.OooO0O0 = false;
        for (int i = 0; i != r4.length; i++) {
            this.OooO00o.addElement(r4[i]);
        }
        if (z) {
            m15216OooO00o();
        }
    }

    public static I11L OooO00o(AbstractC5903LlLLL r2, boolean z) {
        if (!z) {
            AbstractC6122iIlLiL OooO0o = r2.OooO0o();
            if (r2.OooO0O0()) {
                return r2 instanceof C6881lliiI1 ? new C5781LlIl(OooO0o) : new C9361ILI(OooO0o);
            }
            if (OooO0o instanceof I11L) {
                return (I11L) OooO0o;
            }
            if (OooO0o instanceof I11li1) {
                I11li1 i11li1 = (I11li1) OooO0o;
                return r2 instanceof C6881lliiI1 ? new C5781LlIl(i11li1.m15238OooO00o()) : new C9361ILI(i11li1.m15238OooO00o());
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + r2.getClass().getName());
        } else if (r2.OooO0O0()) {
            return (I11L) r2.OooO0o();
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public static I11L OooO00o(Object obj) {
        if (obj == null || (obj instanceof I11L)) {
            return (I11L) obj;
        }
        if (obj instanceof AbstractC6796llliI) {
            return OooO00o((Object) ((AbstractC6796llliI) obj).OooO0O0());
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o((Object) AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        } else {
            if (obj instanceof AbstractC6854lLi1LL) {
                AbstractC6122iIlLiL OooO0O02 = ((AbstractC6854lLi1LL) obj).OooO0O0();
                if (OooO0O02 instanceof I11L) {
                    return (I11L) OooO0O02;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
    }

    private AbstractC6854lLi1LL OooO00o(Enumeration enumeration) {
        AbstractC6854lLi1LL r1 = (AbstractC6854lLi1LL) enumeration.nextElement();
        return r1 == null ? C6452l1Lll.OooO00o : r1;
    }

    private boolean OooO00o(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != min; i++) {
            if (bArr[i] != bArr2[i]) {
                return (bArr[i] & 255) < (bArr2[i] & 255);
            }
        }
        return min == bArr.length;
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r2) {
        try {
            return r2.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6796llliI OooO00o() {
        return new OooO00o(this);
    }

    public AbstractC6854lLi1LL OooO00o(int i) {
        return (AbstractC6854lLi1LL) this.OooO00o.elementAt(i);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Enumeration m15215OooO00o() {
        return this.OooO00o.elements();
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15216OooO00o() {
        if (!this.OooO0O0) {
            this.OooO0O0 = true;
            if (this.OooO00o.size() > 1) {
                int size = this.OooO00o.size() - 1;
                boolean z = true;
                while (z) {
                    int i = 0;
                    byte[] OooO00o2 = OooO00o((AbstractC6854lLi1LL) this.OooO00o.elementAt(0));
                    z = false;
                    int i2 = 0;
                    while (i2 != size) {
                        int i3 = i2 + 1;
                        byte[] OooO00o3 = OooO00o((AbstractC6854lLi1LL) this.OooO00o.elementAt(i3));
                        if (OooO00o(OooO00o2, OooO00o3)) {
                            OooO00o2 = OooO00o3;
                        } else {
                            Object elementAt = this.OooO00o.elementAt(i2);
                            Vector vector = this.OooO00o;
                            vector.setElementAt(vector.elementAt(i3), i2);
                            this.OooO00o.setElementAt(elementAt, i3);
                            i = i2;
                            z = true;
                        }
                        i2 = i3;
                    }
                    size = i;
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15217OooO00o() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof I11L)) {
            return false;
        }
        I11L i11l = (I11L) iillil;
        if (size() != i11l.size()) {
            return false;
        }
        Enumeration OooO00o2 = m15215OooO00o();
        Enumeration OooO00o3 = i11l.m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL OooO00o4 = OooO00o(OooO00o2);
            AbstractC6854lLi1LL OooO00o5 = OooO00o(OooO00o3);
            AbstractC6122iIlLiL OooO0O02 = OooO00o4.OooO0O0();
            AbstractC6122iIlLiL OooO0O03 = OooO00o5.OooO0O0();
            if (OooO0O02 != OooO0O03 && !OooO0O02.equals(OooO0O03)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL[] m15218OooO00o() {
        AbstractC6854lLi1LL[] r0 = new AbstractC6854lLi1LL[size()];
        for (int i = 0; i != size(); i++) {
            r0[i] = OooO00o(i);
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0Oo() {
        if (this.OooO0O0) {
            i1I1I1l r0 = new i1I1I1l();
            r0.OooO00o = this.OooO00o;
            return r0;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.OooO00o.size(); i++) {
            vector.addElement(this.OooO00o.elementAt(i));
        }
        i1I1I1l r1 = new i1I1I1l();
        r1.OooO00o = vector;
        r1.m15216OooO00o();
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0o0() {
        C9361ILI r0 = new C9361ILI();
        r0.OooO00o = this.OooO00o;
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        Enumeration OooO00o2 = m15215OooO00o();
        int size = size();
        while (OooO00o2.hasMoreElements()) {
            size = (size * 17) ^ OooO00o(OooO00o2).hashCode();
        }
        return size;
    }

    @Override // com.p118pd.sdk.AbstractC9757IL1i1, java.lang.Iterable
    public Iterator<AbstractC6854lLi1LL> iterator() {
        return new C9586iIILl.OooO00o(m15218OooO00o());
    }

    public int size() {
        return this.OooO00o.size();
    }

    public String toString() {
        return this.OooO00o.toString();
    }
}
