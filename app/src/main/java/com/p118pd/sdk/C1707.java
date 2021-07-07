package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨丨 */
public class C1707 extends C5837L1l {
    public static final int o0ooOOo = 1000;
    public Vector OooO00o;

    public C1707(AbstractC6122iIlLiL iillil) {
        super(OooO00o(iillil));
    }

    public C1707(AbstractC6854lLi1LL r1) {
        this(r1.OooO0O0());
    }

    public C1707(Vector vector) {
        super(OooO00o(vector));
        this.OooO00o = vector;
    }

    public C1707(byte[] bArr) {
        super(bArr);
    }

    public static C5837L1l OooO00o(I11li1 i11li1) {
        Vector vector = new Vector();
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            vector.addElement(OooO00o2.nextElement());
        }
        return new C1707(vector);
    }

    public static byte[] OooO00o(AbstractC6122iIlLiL iillil) {
        try {
            return iillil.getEncoded();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to encode object");
        }
    }

    public static byte[] OooO00o(Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != vector.size(); i++) {
            try {
                byteArrayOutputStream.write(((C6487lIIiIlL) vector.elementAt(i)).m17938OooO00o());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(vector.elementAt(i).getClass().getName() + " found in input should only contain DEROctetString");
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    private Vector OooO0O0() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = ((AbstractC6804llL1ii) this).OooO00o;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(((AbstractC6804llL1ii) this).OooO00o, i, bArr2, 0, length);
            vector.addElement(new C6487lIIiIlL(bArr2));
            i = i2;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    public Enumeration OooO00o() {
        Vector vector = this.OooO00o;
        return vector == null ? OooO0O0().elements() : vector.elements();
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.C5837L1l, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21824OooO00o() {
        return ((AbstractC6804llL1ii) this).OooO00o;
    }
}
