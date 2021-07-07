package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.L丨1l  reason: invalid class name and case insensitive filesystem */
public class C5837L1l extends AbstractC6804llL1ii {
    public static final int o0ooOO0 = 1000;
    public final AbstractC6804llL1ii[] OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.L丨1l$OooO00o */
    public class OooO00o implements Enumeration {
        public int OooO00o = 0;

        public OooO00o() {
        }

        public boolean hasMoreElements() {
            return this.OooO00o < C5837L1l.this.OooO00o.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            AbstractC6804llL1ii[] r0 = C5837L1l.this.OooO00o;
            int i = this.OooO00o;
            this.OooO00o = i + 1;
            return r0[i];
        }
    }

    public C5837L1l(byte[] bArr) {
        this(bArr, 1000);
    }

    public C5837L1l(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    public C5837L1l(byte[] bArr, AbstractC6804llL1ii[] r2, int i) {
        super(bArr);
        this.OooO00o = r2;
        this.o00oO0O = i;
    }

    public C5837L1l(AbstractC6804llL1ii[] r2) {
        this(r2, 1000);
    }

    public C5837L1l(AbstractC6804llL1ii[] r2, int i) {
        this(OooO00o(r2), r2, i);
    }

    public static C5837L1l OooO00o(I11li1 i11li1) {
        AbstractC6804llL1ii[] r0 = new AbstractC6804llL1ii[i11li1.size()];
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            r0[i] = (AbstractC6804llL1ii) OooO00o2.nextElement();
            i++;
        }
        return new C5837L1l(r0);
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    private Vector OooO00o() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = super.OooO00o;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = this.o00oO0O;
            int length = (i + i2 > bArr.length ? bArr.length : i + i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(super.OooO00o, i, bArr2, 0, length);
            vector.addElement(new C6487lIIiIlL(bArr2));
            i += this.o00oO0O;
        }
    }

    public static byte[] OooO00o(AbstractC6804llL1ii[] r3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != r3.length; i++) {
            try {
                byteArrayOutputStream.write(((C6487lIIiIlL) r3[i]).m17938OooO00o());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(r3[i].getClass().getName() + " found in input should only contain DEROctetString");
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Enumeration m16422OooO00o() {
        return this.OooO00o == null ? OooO00o().elements() : new OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(36);
        iii1.OooO00o(128);
        Enumeration OooO00o2 = m16422OooO00o();
        while (OooO00o2.hasMoreElements()) {
            iii1.OooO00o((AbstractC6854lLi1LL) OooO00o2.nextElement());
        }
        iii1.OooO00o(0);
        iii1.OooO00o(0);
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16423OooO00o() {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16424OooO00o() {
        return super.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        Enumeration OooO00o2 = m16422OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            i += ((AbstractC6854lLi1LL) OooO00o2.nextElement()).OooO0O0().OooO0O0();
        }
        return i + 2 + 2;
    }
}
