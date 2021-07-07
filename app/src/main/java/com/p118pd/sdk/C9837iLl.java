package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.丨丨iL丨l  reason: invalid class name and case insensitive filesystem */
public class C9837iLl implements LLIiLl {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.4.2.1";
    public static final String OooO0O0 = "SHA1PRNG";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23431OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5768Ll1L f23432OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f23433OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23434OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23435OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f23436OooO0O0;
    public int OooO0OO;

    private void OooO00o(C93221 r2) {
        SecureRandom secureRandom = this.f23434OooO00o;
        if (secureRandom == null) {
            secureRandom = IIllii.OooO00o();
        }
        this.f23434OooO00o = secureRandom;
        this.f23433OooO00o = C5790LlLlI1.OooO00o(r2.OooO00o());
        this.f23431OooO00o = r2.OooO0O0();
        this.f23436OooO0O0 = r2.OooO00o();
        this.OooO0OO = r2.OooO0OO();
    }

    private void OooO00o(C9844iLi r2) {
        this.f23433OooO00o = C5790LlLlI1.OooO00o(r2.OooO00o());
        this.f23431OooO00o = r2.OooO0O0();
        this.OooO0OO = r2.OooO0OO();
    }

    public int OooO00o(C5768Ll1L r2) throws IllegalArgumentException {
        if (r2 instanceof C93221) {
            return ((C93221) r2).OooO0O0();
        }
        if (r2 instanceof C9844iLi) {
            return ((C9844iLi) r2).OooO0O0();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // com.p118pd.sdk.LLIiLl
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        this.f23435OooO00o = z;
        if (!z) {
            C9844iLi r22 = (C9844iLi) r2;
            this.f23432OooO00o = r22;
            OooO00o(r22);
        } else if (r2 instanceof liLL1l) {
            liLL1l r23 = (liLL1l) r2;
            this.f23434OooO00o = r23.m17752OooO00o();
            C93221 r1 = (C93221) r23.OooO00o();
            this.f23432OooO00o = r1;
            OooO00o(r1);
        } else {
            this.f23434OooO00o = IIllii.OooO00o();
            C93221 r24 = (C93221) r2;
            this.f23432OooO00o = r24;
            OooO00o(r24);
        }
    }

    @Override // com.p118pd.sdk.LLIiLl
    public byte[] OooO00o(byte[] bArr) {
        if (this.f23435OooO00o) {
            l11ILi l11ili = new l11ILi(this.f23436OooO0O0, this.f23434OooO00o);
            byte[] OooO00o2 = l11ili.m17552OooO00o();
            byte[] OooO00o3 = C5191I1ll.m15333OooO00o(OooO00o2, bArr);
            this.f23433OooO00o.update(OooO00o3, 0, OooO00o3.length);
            byte[] bArr2 = new byte[this.f23433OooO00o.OooO0O0()];
            this.f23433OooO00o.OooO00o(bArr2, 0);
            byte[] OooO00o4 = Ll1L1L.OooO00o((C93221) this.f23432OooO00o, l11ili, C9823LiIl.OooO00o(this.f23431OooO00o, this.OooO0OO, bArr2)).m17552OooO00o();
            lL1iii r2 = new lL1iii(new C6461l1liI());
            r2.OooO00o(OooO00o2);
            byte[] bArr3 = new byte[bArr.length];
            r2.OooO0O0(bArr3);
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = (byte) (bArr3[i] ^ bArr[i]);
            }
            return C5191I1ll.m15333OooO00o(OooO00o4, bArr3);
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    @Override // com.p118pd.sdk.LLIiLl
    public byte[] OooO0O0(byte[] bArr) throws InvalidCipherTextException {
        if (!this.f23435OooO00o) {
            int i = (this.f23431OooO00o + 7) >> 3;
            int length = bArr.length - i;
            byte[][] OooO00o2 = C5191I1ll.m15336OooO00o(bArr, i);
            byte[] bArr2 = OooO00o2[0];
            byte[] bArr3 = OooO00o2[1];
            l11ILi[] OooO00o3 = Ll1L1L.OooO00o((C9844iLi) this.f23432OooO00o, l11ILi.OooO00o(this.f23431OooO00o, bArr2));
            byte[] OooO00o4 = OooO00o3[0].m17552OooO00o();
            l11ILi l11ili = OooO00o3[1];
            lL1iii r3 = new lL1iii(new C6461l1liI());
            r3.OooO00o(OooO00o4);
            byte[] bArr4 = new byte[length];
            r3.OooO0O0(bArr4);
            for (int i2 = 0; i2 < length; i2++) {
                bArr4[i2] = (byte) (bArr4[i2] ^ bArr3[i2]);
            }
            byte[] OooO00o5 = C5191I1ll.m15333OooO00o(OooO00o4, bArr4);
            byte[] bArr5 = new byte[this.f23433OooO00o.OooO0O0()];
            this.f23433OooO00o.update(OooO00o5, 0, OooO00o5.length);
            this.f23433OooO00o.OooO00o(bArr5, 0);
            if (C9823LiIl.OooO00o(this.f23431OooO00o, this.OooO0OO, bArr5).equals(l11ili)) {
                return bArr4;
            }
            throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}
