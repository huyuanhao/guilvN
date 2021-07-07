package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.LIlLi */
public class LIlLi extends AbstractC6122iIlLiL implements AbstractC98681 {
    public static final char[] OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16353OooO00o;

    public LIlLi(byte[] bArr) {
        this.f16353OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static LIlLi OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof LIlLi)) ? OooO00o((Object) OooO0o) : new LIlLi(((AbstractC6804llL1ii) OooO0o).m17938OooO00o());
    }

    public static LIlLi OooO00o(Object obj) {
        if (obj == null || (obj instanceof LIlLi)) {
            return (LIlLi) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (LIlLi) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    public String OooO00o() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C6103iIi1(byteArrayOutputStream).OooO00o((AbstractC6854lLi1LL) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(OooO00o[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(OooO00o[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding UniversalString");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(28, m16128OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16127OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof LIlLi)) {
            return false;
        }
        return C9586iIILl.m21627OooO00o(this.f16353OooO00o, ((LIlLi) iillil).f16353OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16128OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f16353OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return L1li1.OooO00o(this.f16353OooO00o.length) + 1 + this.f16353OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return C9586iIILl.OooO00o(this.f16353OooO00o);
    }

    public String toString() {
        return OooO00o();
    }
}
