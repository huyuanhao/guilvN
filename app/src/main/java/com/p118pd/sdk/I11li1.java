package com.p118pd.sdk;

import com.p118pd.sdk.C9586iIILl;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.pd.sdk.I11li1 */
public abstract class I11li1 extends AbstractC6122iIlLiL implements AbstractC9757IL1i1<AbstractC6854lLi1LL> {
    public Vector OooO00o;

    /* renamed from: com.pd.sdk.I11li1$OooO00o */
    public class OooO00o implements AbstractC9685lL {
        public final /* synthetic */ I11li1 OooO00o;
        public final int o00oO0O = I11li1.this.size();
        public int o0ooOO0;

        public OooO00o(I11li1 i11li1) {
            this.OooO00o = i11li1;
        }

        @Override // com.p118pd.sdk.AbstractC9685lL, com.p118pd.sdk.AbstractC6181iLiLI
        public AbstractC6122iIlLiL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9685lL, com.p118pd.sdk.AbstractC6181iLiLI
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC6854lLi1LL m15239OooO00o() throws IOException {
            int i = this.o0ooOO0;
            if (i == this.o00oO0O) {
                return null;
            }
            I11li1 i11li1 = I11li1.this;
            this.o0ooOO0 = i + 1;
            AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(i);
            return OooO00o2 instanceof I11li1 ? ((I11li1) OooO00o2).OooO00o() : OooO00o2 instanceof I11L ? ((I11L) OooO00o2).OooO00o() : OooO00o2;
        }

        @Override // com.p118pd.sdk.AbstractC6854lLi1LL
        public AbstractC6122iIlLiL OooO0O0() {
            return this.OooO00o;
        }
    }

    public I11li1() {
        this.OooO00o = new Vector();
    }

    public I11li1(iILLL1 r4) {
        this.OooO00o = new Vector();
        for (int i = 0; i != r4.OooO00o(); i++) {
            this.OooO00o.addElement(r4.OooO00o(i));
        }
    }

    public I11li1(AbstractC6854lLi1LL r2) {
        Vector vector = new Vector();
        this.OooO00o = vector;
        vector.addElement(r2);
    }

    public I11li1(AbstractC6854lLi1LL[] r4) {
        this.OooO00o = new Vector();
        for (int i = 0; i != r4.length; i++) {
            this.OooO00o.addElement(r4[i]);
        }
    }

    public static I11li1 OooO00o(AbstractC5903LlLLL r2, boolean z) {
        if (!z) {
            AbstractC6122iIlLiL OooO0o = r2.OooO0o();
            if (r2.OooO0O0()) {
                return r2 instanceof C6881lliiI1 ? new C6351ill(OooO0o) : new C6120iIlL1(OooO0o);
            }
            if (OooO0o instanceof I11li1) {
                return (I11li1) OooO0o;
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + r2.getClass().getName());
        } else if (r2.OooO0O0()) {
            return OooO00o((Object) r2.OooO0o().m17017OooO0O0());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public static I11li1 OooO00o(Object obj) {
        if (obj == null || (obj instanceof I11li1)) {
            return (I11li1) obj;
        }
        if (obj instanceof AbstractC9685lL) {
            return OooO00o((Object) ((AbstractC9685lL) obj).OooO0O0());
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o((Object) AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        } else {
            if (obj instanceof AbstractC6854lLi1LL) {
                AbstractC6122iIlLiL OooO0O0 = ((AbstractC6854lLi1LL) obj).OooO0O0();
                if (OooO0O0 instanceof I11li1) {
                    return (I11li1) OooO0O0;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
    }

    private AbstractC6854lLi1LL OooO00o(Enumeration enumeration) {
        return (AbstractC6854lLi1LL) enumeration.nextElement();
    }

    public AbstractC6854lLi1LL OooO00o(int i) {
        return (AbstractC6854lLi1LL) this.OooO00o.elementAt(i);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC9685lL OooO00o() {
        return new OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Enumeration m15236OooO00o() {
        return this.OooO00o.elements();
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15237OooO00o() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof I11li1)) {
            return false;
        }
        I11li1 i11li1 = (I11li1) iillil;
        if (size() != i11li1.size()) {
            return false;
        }
        Enumeration OooO00o2 = m15236OooO00o();
        Enumeration OooO00o3 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL OooO00o4 = OooO00o(OooO00o2);
            AbstractC6854lLi1LL OooO00o5 = OooO00o(OooO00o3);
            AbstractC6122iIlLiL OooO0O0 = OooO00o4.OooO0O0();
            AbstractC6122iIlLiL OooO0O02 = OooO00o5.OooO0O0();
            if (OooO0O0 != OooO0O02 && !OooO0O0.equals(OooO0O02)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL[] m15238OooO00o() {
        AbstractC6854lLi1LL[] r0 = new AbstractC6854lLi1LL[size()];
        for (int i = 0; i != size(); i++) {
            r0[i] = OooO00o(i);
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0Oo() {
        C5707LiL1 liL1 = new C5707LiL1();
        liL1.OooO00o = this.OooO00o;
        return liL1;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0o0() {
        C6120iIlL1 iill1 = new C6120iIlL1();
        iill1.OooO00o = this.OooO00o;
        return iill1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        Enumeration OooO00o2 = m15236OooO00o();
        int size = size();
        while (OooO00o2.hasMoreElements()) {
            size = (size * 17) ^ OooO00o(OooO00o2).hashCode();
        }
        return size;
    }

    @Override // com.p118pd.sdk.AbstractC9757IL1i1, java.lang.Iterable
    public Iterator<AbstractC6854lLi1LL> iterator() {
        return new C9586iIILl.OooO00o(m15238OooO00o());
    }

    public int size() {
        return this.OooO00o.size();
    }

    public String toString() {
        return this.OooO00o.toString();
    }
}
