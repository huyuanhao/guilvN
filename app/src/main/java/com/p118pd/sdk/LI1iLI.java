package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.LI1iLI */
public class LI1iLI implements LLIiLl {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.4.1";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f16259OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5240IIiI f16260OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16261OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16262OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    @Override // com.p118pd.sdk.LLIiLl
    private l11ILi OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[(this.OooO0Oo + ((this.OooO0O0 & 7) != 0 ? 1 : 0))];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = 1;
        return l11ILi.OooO00o(this.OooO0O0, bArr2);
    }

    private void OooO00o(LIi1L1 r2) {
        this.f16259OooO00o = r2.OooO0O0();
        int OooO00o2 = r2.OooO00o();
        this.OooO0O0 = OooO00o2;
        this.OooO0Oo = OooO00o2 >> 3;
        this.OooO0o0 = this.f16259OooO00o >> 3;
    }

    private void OooO00o(i1iILI i1iili) {
        SecureRandom secureRandom = this.f16261OooO00o;
        if (secureRandom == null) {
            secureRandom = IIllii.OooO00o();
        }
        this.f16261OooO00o = secureRandom;
        this.f16259OooO00o = i1iili.OooO0O0();
        this.OooO0O0 = i1iili.OooO00o();
        this.OooO0OO = i1iili.OooO0OO();
        this.OooO0o0 = this.f16259OooO00o >> 3;
        this.OooO0Oo = this.OooO0O0 >> 3;
    }

    private byte[] OooO00o(l11ILi l11ili) throws InvalidCipherTextException {
        byte[] OooO00o2 = l11ili.m17552OooO00o();
        int length = OooO00o2.length - 1;
        while (length >= 0 && OooO00o2[length] == 0) {
            length--;
        }
        if (length < 0 || OooO00o2[length] != 1) {
            throw new InvalidCipherTextException("Bad Padding: invalid ciphertext");
        }
        byte[] bArr = new byte[length];
        System.arraycopy(OooO00o2, 0, bArr, 0, length);
        return bArr;
    }

    public int OooO00o(C5240IIiI r2) {
        if (r2 instanceof i1iILI) {
            return ((i1iILI) r2).OooO0O0();
        }
        if (r2 instanceof LIi1L1) {
            return ((LIi1L1) r2).OooO0O0();
        }
        throw new IllegalArgumentException("unsupported type");
    }

    @Override // com.p118pd.sdk.LLIiLl
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        this.f16262OooO00o = z;
        if (!z) {
            LIi1L1 r22 = (LIi1L1) r2;
            this.f16260OooO00o = r22;
            OooO00o(r22);
        } else if (r2 instanceof liLL1l) {
            liLL1l r23 = (liLL1l) r2;
            this.f16261OooO00o = r23.m17752OooO00o();
            i1iILI i1iili = (i1iILI) r23.OooO00o();
            this.f16260OooO00o = i1iili;
            OooO00o(i1iili);
        } else {
            this.f16261OooO00o = IIllii.OooO00o();
            i1iILI i1iili2 = (i1iILI) r2;
            this.f16260OooO00o = i1iili2;
            OooO00o(i1iili2);
        }
    }

    @Override // com.p118pd.sdk.LLIiLl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16015OooO00o(byte[] bArr) {
        if (this.f16262OooO00o) {
            l11ILi OooO00o2 = OooO00o(bArr);
            return ((l11ILi) ((i1iILI) this.f16260OooO00o).m16886OooO00o().OooO00o(OooO00o2).OooO00o(new l11ILi(this.f16259OooO00o, this.OooO0OO, this.f16261OooO00o))).m17552OooO00o();
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }

    @Override // com.p118pd.sdk.LLIiLl
    public byte[] OooO0O0(byte[] bArr) throws InvalidCipherTextException {
        if (!this.f16262OooO00o) {
            l11ILi OooO00o2 = l11ILi.OooO00o(this.f16259OooO00o, bArr);
            LIi1L1 r0 = (LIi1L1) this.f16260OooO00o;
            Ll111 OooO00o3 = r0.m16070OooO00o();
            C5585L1L OooO00o4 = r0.m16069OooO00o();
            llILLI1 OooO0O02 = r0.m16075OooO0O0();
            C6051i1lli OooO00o5 = r0.m16071OooO00o();
            C6051i1lli OooO0O03 = r0.m16074OooO0O0();
            llILLI1 OooO00o6 = r0.m16072OooO00o();
            C5585L1L[] OooO00o7 = r0.m16073OooO00o();
            C6051i1lli OooO00o8 = OooO00o5.OooO00o(OooO0O03);
            l11ILi l11ili = (l11ILi) OooO00o2.OooO00o(OooO00o8.OooO00o());
            l11ILi OooO00o9 = C5786LlL.OooO00o((l11ILi) OooO00o6.OooO0O0(l11ili), OooO00o3, OooO00o4, OooO00o7);
            l11ILi l11ili2 = (l11ILi) OooO00o9.OooO00o(OooO00o8);
            return OooO00o((l11ILi) OooO0O02.OooO00o(((l11ILi) ((l11ILi) l11ili.OooO00o(OooO00o9)).OooO00o(OooO00o5)).OooO0O0(this.OooO0O0)));
        }
        throw new IllegalStateException("cipher initialised for decryption");
    }
}
