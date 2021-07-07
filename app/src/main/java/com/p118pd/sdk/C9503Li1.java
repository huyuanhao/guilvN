package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.丨Li1  reason: invalid class name and case insensitive filesystem */
public class C9503Li1 implements AbstractC93171I1 {
    public static final Hashtable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6436l11LI f23078OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f23079OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Ii1IliL f23080OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23081OooO00o;

    static {
        Hashtable hashtable = new Hashtable();
        OooO00o = hashtable;
        hashtable.put("RIPEMD128", AbstractC9468L1lL.OooO0OO);
        OooO00o.put("RIPEMD160", AbstractC9468L1lL.OooO0O0);
        OooO00o.put("RIPEMD256", AbstractC9468L1lL.OooO0Oo);
        OooO00o.put(LL1i.OooO0O0, AbstractC5855LLl.o00O0000);
        OooO00o.put(LL1i.OooO0OO, AbstractC5905LllI.OooO0o);
        OooO00o.put(LL1i.OooO0Oo, AbstractC5905LllI.OooO0OO);
        OooO00o.put(LL1i.f16409OooO0o0, AbstractC5905LllI.OooO0Oo);
        OooO00o.put(LL1i.f16408OooO0o, AbstractC5905LllI.OooO0o0);
        OooO00o.put("SHA-512/224", AbstractC5905LllI.OooO0oO);
        OooO00o.put("SHA-512/256", AbstractC5905LllI.OooO0oo);
        OooO00o.put("SHA3-224", AbstractC5905LllI.OooO);
        OooO00o.put(C6229iiIL.OooO0OO, AbstractC5905LllI.OooOO0);
        OooO00o.put("SHA3-384", AbstractC5905LllI.OooOO0O);
        OooO00o.put("SHA3-512", AbstractC5905LllI.OooOO0o);
        OooO00o.put("MD2", AbstractC5711LiLli.OooooOO);
        OooO00o.put("MD4", AbstractC5711LiLli.OooooOo);
        OooO00o.put("MD5", AbstractC5711LiLli.Oooooo0);
    }

    public C9503Li1(AbstractC6436l11LI r3) {
        this(r3, (LlLI1) OooO00o.get(r3.OooO00o()));
    }

    public C9503Li1(AbstractC6436l11LI r3, LlLI1 llLI1) {
        this.f23080OooO00o = new iLlilLI(new C6114iIiI());
        this.f23078OooO00o = r3;
        this.f23079OooO00o = new C6456l1ilL(llLI1, C6452l1Lll.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    private byte[] OooO00o(byte[] bArr) throws IOException {
        return new C6052i1l(this.f23079OooO00o, bArr).OooO00o(AbstractC5533IiL.OooO00o);
    }

    public String OooO00o() {
        return this.f23078OooO00o.OooO00o() + "withRSA";
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        this.f23081OooO00o = z;
        C6213iL11I r0 = r4 instanceof liLL1l ? (C6213iL11I) ((liLL1l) r4).OooO00o() : (C6213iL11I) r4;
        if (z && !r0.OooO00o()) {
            throw new IllegalArgumentException("signing requires private key");
        } else if (z || !r0.OooO00o()) {
            reset();
            this.f23080OooO00o.OooO00o(z, r4);
        } else {
            throw new IllegalArgumentException("verification requires public key");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21568OooO00o(byte[] bArr) {
        if (!this.f23081OooO00o) {
            int OooO0O0 = this.f23078OooO00o.OooO0O0();
            byte[] bArr2 = new byte[OooO0O0];
            this.f23078OooO00o.OooO00o(bArr2, 0);
            try {
                byte[] OooO00o2 = this.f23080OooO00o.OooO00o(bArr, 0, bArr.length);
                byte[] OooO00o3 = OooO00o(bArr2);
                if (OooO00o2.length == OooO00o3.length) {
                    return C9586iIILl.OooO0O0(OooO00o2, OooO00o3);
                }
                if (OooO00o2.length == OooO00o3.length - 2) {
                    int length = (OooO00o2.length - OooO0O0) - 2;
                    int length2 = (OooO00o3.length - OooO0O0) - 2;
                    OooO00o3[1] = (byte) (OooO00o3[1] - 2);
                    OooO00o3[3] = (byte) (OooO00o3[3] - 2);
                    int i = 0;
                    for (int i2 = 0; i2 < OooO0O0; i2++) {
                        i |= OooO00o2[length + i2] ^ OooO00o3[length2 + i2];
                    }
                    for (int i3 = 0; i3 < length; i3++) {
                        i |= OooO00o2[i3] ^ OooO00o3[i3];
                    }
                    return i == 0;
                }
                C9586iIILl.OooO0O0(OooO00o3, OooO00o3);
                return false;
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("RSADigestSigner not initialised for verification");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException, DataLengthException {
        if (this.f23081OooO00o) {
            byte[] bArr = new byte[this.f23078OooO00o.OooO0O0()];
            this.f23078OooO00o.OooO00o(bArr, 0);
            try {
                byte[] OooO00o2 = OooO00o(bArr);
                return this.f23080OooO00o.OooO00o(OooO00o2, 0, OooO00o2.length);
            } catch (IOException e) {
                throw new CryptoException("unable to encode signature: " + e.getMessage(), e);
            }
        } else {
            throw new IllegalStateException("RSADigestSigner not initialised for signature generation.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.f23078OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.f23078OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.f23078OooO00o.update(bArr, i, i2);
    }
}
