package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.lLLii  reason: case insensitive filesystem */
public class C6588lLLii {
    public AbstractC5649LIlI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5849LILiL f18515OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6370iIIIl f18516OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6420iI f18517OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6427ii f18518OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6744ll1L f18519OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6769llL1L f18520OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC93131l f18521OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18522OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18523OooO00o;
    public AbstractC6370iIIIl OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18524OooO0O0;
    public byte[] OooO0OO;

    public C6588lLLii(AbstractC5649LIlI r1, AbstractC6427ii r2, AbstractC6769llL1L lll1l) {
        this.OooO00o = r1;
        this.f18518OooO00o = r2;
        this.f18520OooO00o = lll1l;
        this.f18523OooO00o = new byte[lll1l.OooO00o()];
        this.f18519OooO00o = null;
    }

    public C6588lLLii(AbstractC5649LIlI r1, AbstractC6427ii r2, AbstractC6769llL1L lll1l, C6744ll1L r4) {
        this.OooO00o = r1;
        this.f18518OooO00o = r2;
        this.f18520OooO00o = lll1l;
        this.f18523OooO00o = new byte[lll1l.OooO00o()];
        this.f18519OooO00o = r4;
    }

    private void OooO00o(AbstractC6370iIIIl r2) {
        if (r2 instanceof C6274iilL1L) {
            C6274iilL1L r22 = (C6274iilL1L) r2;
            this.OooO0OO = r22.m17301OooO00o();
            r2 = r22.OooO00o();
        } else {
            this.OooO0OO = null;
        }
        this.f18517OooO00o = (C6420iI) r2;
    }

    private byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int i3;
        if (i2 >= this.f18524OooO0O0.length + this.f18520OooO00o.OooO00o()) {
            if (this.f18519OooO00o == null) {
                int length = (i2 - this.f18524OooO0O0.length) - this.f18520OooO00o.OooO00o();
                byte[] bArr4 = new byte[length];
                int OooO00o2 = this.f18517OooO00o.OooO00o() / 8;
                bArr2 = new byte[OooO00o2];
                int i4 = length + OooO00o2;
                byte[] bArr5 = new byte[i4];
                this.f18518OooO00o.OooO00o(bArr5, 0, i4);
                if (this.f18524OooO0O0.length != 0) {
                    System.arraycopy(bArr5, 0, bArr2, 0, OooO00o2);
                    System.arraycopy(bArr5, OooO00o2, bArr4, 0, length);
                } else {
                    System.arraycopy(bArr5, 0, bArr4, 0, length);
                    System.arraycopy(bArr5, length, bArr2, 0, OooO00o2);
                }
                bArr3 = new byte[length];
                for (int i5 = 0; i5 != length; i5++) {
                    bArr3[i5] = (byte) (bArr[(this.f18524OooO0O0.length + i) + i5] ^ bArr4[i5]);
                }
                i3 = 0;
            } else {
                int OooO0O02 = ((C9693lL) this.f18517OooO00o).OooO0O0() / 8;
                byte[] bArr6 = new byte[OooO0O02];
                int OooO00o3 = this.f18517OooO00o.OooO00o() / 8;
                bArr2 = new byte[OooO00o3];
                int i6 = OooO0O02 + OooO00o3;
                byte[] bArr7 = new byte[i6];
                this.f18518OooO00o.OooO00o(bArr7, 0, i6);
                System.arraycopy(bArr7, 0, bArr6, 0, OooO0O02);
                System.arraycopy(bArr7, OooO0O02, bArr2, 0, OooO00o3);
                AbstractC6370iIIIl r0 = new C6642li1LI(bArr6);
                byte[] bArr8 = this.OooO0OO;
                if (bArr8 != null) {
                    r0 = new C6274iilL1L(r0, bArr8);
                }
                this.f18519OooO00o.OooO00o(false, r0);
                bArr3 = new byte[this.f18519OooO00o.OooO00o((i2 - this.f18524OooO0O0.length) - this.f18520OooO00o.OooO00o())];
                C6744ll1L r5 = this.f18519OooO00o;
                byte[] bArr9 = this.f18524OooO0O0;
                i3 = r5.OooO00o(bArr, i + bArr9.length, (i2 - bArr9.length) - this.f18520OooO00o.OooO00o(), bArr3, 0);
            }
            byte[] OooO0O03 = this.f18517OooO00o.OooO0O0();
            byte[] bArr10 = null;
            if (this.f18524OooO0O0.length != 0) {
                bArr10 = OooO00o(OooO0O03);
            }
            int i7 = i + i2;
            byte[] OooO00o4 = C9586iIILl.m21632OooO00o(bArr, i7 - this.f18520OooO00o.OooO00o(), i7);
            int length2 = OooO00o4.length;
            byte[] bArr11 = new byte[length2];
            this.f18520OooO00o.OooO00o(new C6642li1LI(bArr2));
            AbstractC6769llL1L lll1l = this.f18520OooO00o;
            byte[] bArr12 = this.f18524OooO0O0;
            lll1l.update(bArr, i + bArr12.length, (i2 - bArr12.length) - length2);
            if (OooO0O03 != null) {
                this.f18520OooO00o.update(OooO0O03, 0, OooO0O03.length);
            }
            if (this.f18524OooO0O0.length != 0) {
                this.f18520OooO00o.update(bArr10, 0, bArr10.length);
            }
            this.f18520OooO00o.OooO00o(bArr11, 0);
            if (C9586iIILl.OooO0O0(OooO00o4, bArr11)) {
                C6744ll1L r12 = this.f18519OooO00o;
                return r12 == null ? bArr3 : C9586iIILl.m21632OooO00o(bArr3, 0, i3 + r12.OooO00o(bArr3, i3));
            }
            throw new InvalidCipherTextException("invalid MAC");
        }
        throw new InvalidCipherTextException("Length of input must be greater than the MAC and V combined");
    }

    private byte[] OooO0OO(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        AbstractC6370iIIIl r5;
        C6744ll1L r0;
        if (this.f18519OooO00o == null) {
            byte[] bArr4 = new byte[i2];
            int OooO00o2 = this.f18517OooO00o.OooO00o() / 8;
            bArr2 = new byte[OooO00o2];
            int i3 = i2 + OooO00o2;
            byte[] bArr5 = new byte[i3];
            this.f18518OooO00o.OooO00o(bArr5, 0, i3);
            if (this.f18524OooO0O0.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, OooO00o2);
                System.arraycopy(bArr5, OooO00o2, bArr4, 0, i2);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i2);
                System.arraycopy(bArr5, i2, bArr2, 0, OooO00o2);
            }
            bArr3 = new byte[i2];
            for (int i4 = 0; i4 != i2; i4++) {
                bArr3[i4] = (byte) (bArr[i + i4] ^ bArr4[i4]);
            }
        } else {
            int OooO0O02 = ((C9693lL) this.f18517OooO00o).OooO0O0() / 8;
            byte[] bArr6 = new byte[OooO0O02];
            int OooO00o3 = this.f18517OooO00o.OooO00o() / 8;
            byte[] bArr7 = new byte[OooO00o3];
            int i5 = OooO0O02 + OooO00o3;
            byte[] bArr8 = new byte[i5];
            this.f18518OooO00o.OooO00o(bArr8, 0, i5);
            System.arraycopy(bArr8, 0, bArr6, 0, OooO0O02);
            System.arraycopy(bArr8, OooO0O02, bArr7, 0, OooO00o3);
            if (this.OooO0OO != null) {
                r0 = this.f18519OooO00o;
                r5 = new C6274iilL1L(new C6642li1LI(bArr6), this.OooO0OO);
            } else {
                r0 = this.f18519OooO00o;
                r5 = new C6642li1LI(bArr6);
            }
            r0.OooO00o(true, r5);
            bArr3 = new byte[this.f18519OooO00o.OooO00o(i2)];
            int OooO00o4 = this.f18519OooO00o.OooO00o(bArr, i, i2, bArr3, 0);
            i2 = OooO00o4 + this.f18519OooO00o.OooO00o(bArr3, OooO00o4);
            bArr2 = bArr7;
        }
        byte[] OooO0O03 = this.f18517OooO00o.OooO0O0();
        byte[] bArr9 = null;
        if (this.f18524OooO0O0.length != 0) {
            bArr9 = OooO00o(OooO0O03);
        }
        int OooO00o5 = this.f18520OooO00o.OooO00o();
        byte[] bArr10 = new byte[OooO00o5];
        this.f18520OooO00o.OooO00o(new C6642li1LI(bArr2));
        this.f18520OooO00o.update(bArr3, 0, bArr3.length);
        if (OooO0O03 != null) {
            this.f18520OooO00o.update(OooO0O03, 0, OooO0O03.length);
        }
        if (this.f18524OooO0O0.length != 0) {
            this.f18520OooO00o.update(bArr9, 0, bArr9.length);
        }
        this.f18520OooO00o.OooO00o(bArr10, 0);
        byte[] bArr11 = this.f18524OooO0O0;
        byte[] bArr12 = new byte[(bArr11.length + i2 + OooO00o5)];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr3, 0, bArr12, this.f18524OooO0O0.length, i2);
        System.arraycopy(bArr10, 0, bArr12, this.f18524OooO0O0.length + i2, OooO00o5);
        return bArr12;
    }

    public C6744ll1L OooO00o() {
        return this.f18519OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6769llL1L m17686OooO00o() {
        return this.f18520OooO00o;
    }

    public void OooO00o(C6213iL11I r2, AbstractC6370iIIIl r3, C5849LILiL r4) {
        this.f18522OooO00o = true;
        this.OooO0O0 = r2;
        this.f18515OooO00o = r4;
        OooO00o(r3);
    }

    public void OooO00o(C6213iL11I r2, AbstractC6370iIIIl r3, AbstractC93131l r4) {
        this.f18522OooO00o = false;
        this.f18516OooO00o = r2;
        this.f18521OooO00o = r4;
        OooO00o(r3);
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r2, AbstractC6370iIIIl r3, AbstractC6370iIIIl r4) {
        this.f18522OooO00o = z;
        this.f18516OooO00o = r2;
        this.OooO0O0 = r3;
        this.f18524OooO0O0 = new byte[0];
        OooO00o(r4);
    }

    public byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        if (bArr != null) {
            AbstractC6464l1l.OooO00o(((long) bArr.length) * 8, bArr2, 0);
        }
        return bArr2;
    }

    public byte[] OooO00o(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f18522OooO00o) {
            C5849LILiL r0 = this.f18515OooO00o;
            if (r0 != null) {
                L1iIIL OooO00o2 = r0.OooO00o();
                this.f18516OooO00o = OooO00o2.OooO00o().OooO00o();
                this.f18524OooO0O0 = OooO00o2.m15976OooO00o();
            }
        } else if (this.f18521OooO00o != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            try {
                this.OooO0O0 = this.f18521OooO00o.OooO00o(byteArrayInputStream);
                this.f18524OooO0O0 = C9586iIILl.m21632OooO00o(bArr, i, (i2 - byteArrayInputStream.available()) + i);
            } catch (IOException e) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e2.getMessage(), e2);
            }
        }
        this.OooO00o.m16162OooO00o(this.f18516OooO00o);
        byte[] OooO00o3 = IIiL.OooO00o(this.OooO00o.OooO00o(), this.OooO00o.OooO00o(this.OooO0O0));
        byte[] bArr2 = this.f18524OooO0O0;
        if (bArr2.length != 0) {
            byte[] OooO0O02 = C9586iIILl.m21645OooO0O0(bArr2, OooO00o3);
            C9586iIILl.OooO00o(OooO00o3, (byte) 0);
            OooO00o3 = OooO0O02;
        }
        try {
            this.f18518OooO00o.OooO00o(new C9564i1I1(OooO00o3, this.f18517OooO00o.m17534OooO00o()));
            return this.f18522OooO00o ? OooO0OO(bArr, i, i2) : OooO0O0(bArr, i, i2);
        } finally {
            C9586iIILl.OooO00o(OooO00o3, (byte) 0);
        }
    }
}
