package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iiIl  reason: case insensitive filesystem */
public class C6234iiIl implements LLLi1iII {
    public static final byte OooO00o = 0;
    public static final byte OooO0O0 = 1;
    public static final byte OooO0OO = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17854OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lIliL1l f17855OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6769llL1L f17856OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17857OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17858OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f17859OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17860OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17861OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int f17862OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f17863OooO0OO = new byte[this.f17854OooO00o];
    public byte[] OooO0Oo;
    public byte[] OooO0o0;

    public C6234iiIl(li1l11I1 li1l11i1) {
        this.f17854OooO00o = li1l11i1.OooO00o();
        lLlLIi r0 = new lLlLIi(li1l11i1);
        this.f17856OooO00o = r0;
        this.f17861OooO0O0 = new byte[r0.OooO00o()];
        this.f17858OooO00o = new byte[this.f17856OooO00o.OooO00o()];
        this.f17855OooO00o = new lIliL1l(li1l11i1);
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    private void OooO00o() {
        byte[] bArr = new byte[this.f17854OooO00o];
        int i = 0;
        this.f17856OooO00o.OooO00o(bArr, 0);
        while (true) {
            byte[] bArr2 = this.f17863OooO0OO;
            if (i < bArr2.length) {
                bArr2[i] = (byte) ((this.f17858OooO00o[i] ^ this.f17861OooO0O0[i]) ^ bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    private void OooO00o(boolean z) {
        this.f17855OooO00o.reset();
        this.f17856OooO00o.reset();
        this.f17862OooO0OO = 0;
        C9586iIILl.OooO00o(this.OooO0Oo, (byte) 0);
        if (z) {
            C9586iIILl.OooO00o(this.f17863OooO0OO, (byte) 0);
        }
        int i = this.f17854OooO00o;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        this.f17856OooO00o.update(bArr, 0, i);
        this.f17860OooO0O0 = false;
        byte[] bArr2 = this.OooO0o0;
        if (bArr2 != null) {
            OooO00o(bArr2, 0, bArr2.length);
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    private boolean OooO00o(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17859OooO0O0; i3++) {
            i2 |= this.f17863OooO0OO[i3] ^ bArr[i + i3];
        }
        return i2 == 0;
    }

    private int OooO0O0(byte b, byte[] bArr, int i) {
        int i2;
        byte[] bArr2 = this.OooO0Oo;
        int i3 = this.f17862OooO0OO;
        int i4 = i3 + 1;
        this.f17862OooO0OO = i4;
        bArr2[i3] = b;
        if (i4 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i5 = this.f17854OooO00o;
        if (length >= i + i5) {
            if (this.f17857OooO00o) {
                i2 = this.f17855OooO00o.OooO00o(bArr2, 0, bArr, i);
                this.f17856OooO00o.update(bArr, i, this.f17854OooO00o);
            } else {
                this.f17856OooO00o.update(bArr2, 0, i5);
                i2 = this.f17855OooO00o.OooO00o(this.OooO0Oo, 0, bArr, i);
            }
            this.f17862OooO0OO = 0;
            if (!this.f17857OooO00o) {
                byte[] bArr3 = this.OooO0Oo;
                System.arraycopy(bArr3, this.f17854OooO00o, bArr3, 0, this.f17859OooO0O0);
                this.f17862OooO0OO = this.f17859OooO0O0;
            }
            return i2;
        }
        throw new OutputLengthException("Output buffer is too short");
    }

    private void OooO0O0() {
        if (!this.f17860OooO0O0) {
            this.f17860OooO0O0 = true;
            this.f17856OooO00o.OooO00o(this.f17861OooO0O0, 0);
            int i = this.f17854OooO00o;
            byte[] bArr = new byte[i];
            bArr[i - 1] = 2;
            this.f17856OooO00o.update(bArr, 0, i);
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17243OooO00o() {
        return this.f17855OooO00o.m17649OooO00o();
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException {
        OooO0O0();
        return OooO0O0(b, bArr, i);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(int i) {
        int i2 = i + this.f17862OooO0OO;
        if (this.f17857OooO00o) {
            return i2 + this.f17859OooO0O0;
        }
        int i3 = this.f17859OooO0O0;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17244OooO00o(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        OooO0O0();
        int i2 = this.f17862OooO0OO;
        byte[] bArr2 = this.OooO0Oo;
        byte[] bArr3 = new byte[bArr2.length];
        this.f17862OooO0OO = 0;
        if (this.f17857OooO00o) {
            int i3 = i + i2;
            if (bArr.length >= this.f17859OooO0O0 + i3) {
                this.f17855OooO00o.OooO00o(bArr2, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2);
                this.f17856OooO00o.update(bArr3, 0, i2);
                OooO00o();
                System.arraycopy(this.f17863OooO0OO, 0, bArr, i3, this.f17859OooO0O0);
                OooO00o(false);
                return i2 + this.f17859OooO0O0;
            }
            throw new OutputLengthException("Output buffer too short");
        }
        int i4 = this.f17859OooO0O0;
        if (i2 < i4) {
            throw new InvalidCipherTextException("data too short");
        } else if (bArr.length >= (i + i2) - i4) {
            if (i2 > i4) {
                this.f17856OooO00o.update(bArr2, 0, i2 - i4);
                this.f17855OooO00o.OooO00o(this.OooO0Oo, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2 - this.f17859OooO0O0);
            }
            OooO00o();
            if (OooO00o(this.OooO0Oo, i2 - this.f17859OooO0O0)) {
                OooO00o(false);
                return i2 - this.f17859OooO0O0;
            }
            throw new InvalidCipherTextException("mac check in EAX failed");
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        OooO0O0();
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 != i2; i5++) {
                i4 += OooO0O0(bArr[i + i5], bArr2, i3 + i4);
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m17245OooO00o() {
        return this.f17855OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17246OooO00o() {
        return this.f17855OooO00o.OooO00o().m17732OooO00o() + "/EAX";
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte b) {
        if (!this.f17860OooO0O0) {
            this.f17856OooO00o.update(b);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(boolean z, AbstractC6370iIIIl r6) throws IllegalArgumentException {
        AbstractC6370iIIIl r62;
        byte[] bArr;
        this.f17857OooO00o = z;
        if (r6 instanceof C5553Iili) {
            C5553Iili r63 = (C5553Iili) r6;
            bArr = r63.OooO0O0();
            this.OooO0o0 = r63.m15833OooO00o();
            this.f17859OooO0O0 = r63.OooO00o() / 8;
            r62 = r63.m15832OooO00o();
        } else if (r6 instanceof C6274iilL1L) {
            C6274iilL1L r64 = (C6274iilL1L) r6;
            bArr = r64.m17301OooO00o();
            this.OooO0o0 = null;
            this.f17859OooO0O0 = this.f17856OooO00o.OooO00o() / 2;
            r62 = r64.OooO00o();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        this.OooO0Oo = new byte[(z ? this.f17854OooO00o : this.f17854OooO00o + this.f17859OooO0O0)];
        byte[] bArr2 = new byte[this.f17854OooO00o];
        this.f17856OooO00o.OooO00o(r62);
        int i = this.f17854OooO00o;
        bArr2[i - 1] = 0;
        this.f17856OooO00o.update(bArr2, 0, i);
        this.f17856OooO00o.update(bArr, 0, bArr.length);
        this.f17856OooO00o.OooO00o(this.f17858OooO00o, 0);
        this.f17855OooO00o.OooO00o(true, new C6274iilL1L(null, this.f17858OooO00o));
        reset();
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void OooO00o(byte[] bArr, int i, int i2) {
        if (!this.f17860OooO0O0) {
            this.f17856OooO00o.update(bArr, i, i2);
            return;
        }
        throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    @Override // com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII, com.p118pd.sdk.LLLi1iII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17247OooO00o() {
        int i = this.f17859OooO0O0;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f17863OooO0OO, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public int OooO0O0(int i) {
        int i2 = i + this.f17862OooO0OO;
        if (!this.f17857OooO00o) {
            int i3 = this.f17859OooO0O0;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.f17854OooO00o);
    }

    @Override // com.p118pd.sdk.LLLi1iII
    public void reset() {
        OooO00o(true);
    }
}
