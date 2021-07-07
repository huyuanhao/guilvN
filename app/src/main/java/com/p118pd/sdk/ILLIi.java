package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.ILL丨Ii  reason: invalid class name */
public class ILLIi extends AbstractC8947ooOOOOo0 {
    public ILLIi(int i, iILLL1 r3) {
        super(true, i, OooO00o(r3));
    }

    public ILLIi(int i, AbstractC6854lLi1LL r3) throws IOException {
        this(true, i, r3);
    }

    public ILLIi(int i, byte[] bArr) {
        this(false, i, bArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ILLIi(boolean z, int i, AbstractC6854lLi1LL r4) throws IOException {
        super(z || r4.OooO0O0().OooO00o(), i, OooO00o(z, r4));
    }

    public ILLIi(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    public static byte[] OooO00o(iILLL1 r4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != r4.OooO00o(); i++) {
            try {
                byteArrayOutputStream.write(((AbstractC5738Lil) r4.OooO00o(i)).OooO00o(AbstractC5533IiL.OooO00o));
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed object: " + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] OooO00o(boolean z, AbstractC6854lLi1LL r4) throws IOException {
        byte[] OooO00o = r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
        if (z) {
            return OooO00o;
        }
        int OooO00o2 = AbstractC8947ooOOOOo0.OooO00o(OooO00o);
        int length = OooO00o.length - OooO00o2;
        byte[] bArr = new byte[length];
        System.arraycopy(OooO00o, OooO00o2, bArr, 0, length);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC8947ooOOOOo0
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(this.OooO0O0 ? 96 : 64, this.o00oO0O, this.OooO00o);
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (OooO00o()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(OooO0OO()));
        stringBuffer.append("]");
        if (this.OooO00o != null) {
            stringBuffer.append(" #");
            str = C6472l1l1l.OooO00o(this.OooO00o);
        } else {
            str = " #null";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
