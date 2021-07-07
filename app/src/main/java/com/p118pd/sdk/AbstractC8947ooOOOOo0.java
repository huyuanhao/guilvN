package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3571am;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.ooOOOOo0  reason: case insensitive filesystem */
public abstract class AbstractC8947ooOOOOo0 extends AbstractC6122iIlLiL {
    public final byte[] OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    public AbstractC8947ooOOOOo0(boolean z, int i, byte[] bArr) {
        this.OooO0O0 = z;
        this.o00oO0O = i;
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static int OooO00o(byte[] bArr) {
        int i = bArr[1] & 255;
        if (i == 128 || i <= 127) {
            return 2;
        }
        int i2 = i & 127;
        if (i2 <= 4) {
            return i2 + 2;
        }
        throw new IllegalStateException("DER length more than 4 bytes: " + i2);
    }

    public static AbstractC8947ooOOOOo0 OooO00o(Object obj) {
        if (obj == null || (obj instanceof AbstractC8947ooOOOOo0)) {
            return (AbstractC8947ooOOOOo0) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return OooO00o((Object) AbstractC6122iIlLiL.OooO00o((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to construct object from byte[]: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
    }

    private byte[] OooO00o(int i, byte[] bArr) throws IOException {
        int i2;
        if ((bArr[0] & C3571am.f9204j) == 31) {
            i2 = 2;
            int i3 = bArr[1] & 255;
            if ((i3 & 127) != 0) {
                while (i3 >= 0 && (i3 & 128) != 0) {
                    i3 = bArr[i2] & 255;
                    i2++;
                }
            } else {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
        } else {
            i2 = 1;
        }
        int length = (bArr.length - i2) + 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i2, bArr2, 1, length - 1);
        bArr2[0] = (byte) i;
        return bArr2;
    }

    public AbstractC6122iIlLiL OooO00o(int i) throws IOException {
        if (i < 31) {
            byte[] encoded = getEncoded();
            byte[] OooO00o2 = OooO00o(i, encoded);
            if ((encoded[0] & 32) != 0) {
                OooO00o2[0] = (byte) (OooO00o2[0] | 32);
            }
            return AbstractC6122iIlLiL.OooO00o(OooO00o2);
        }
        throw new IOException("unsupported tag number");
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(this.OooO0O0 ? 96 : 64, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof AbstractC8947ooOOOOo0)) {
            return false;
        }
        AbstractC8947ooOOOOo0 ooooooo0 = (AbstractC8947ooOOOOo0) iillil;
        return this.OooO0O0 == ooooooo0.OooO0O0 && this.o00oO0O == ooooooo0.o00oO0O && C9586iIILl.m21627OooO00o(this.OooO00o, ooooooo0.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m20621OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        return L1li1.OooO0O0(this.o00oO0O) + L1li1.OooO00o(this.OooO00o.length) + this.OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o00oO0O;
    }

    public AbstractC6122iIlLiL OooO0o() throws IOException {
        return AbstractC6122iIlLiL.OooO00o(m20621OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        boolean z = this.OooO0O0;
        return ((z ? 1 : 0) ^ this.o00oO0O) ^ C9586iIILl.OooO00o(this.OooO00o);
    }
}
