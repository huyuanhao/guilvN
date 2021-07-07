package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.丨IIlI丨  reason: invalid class name and case insensitive filesystem */
public class C9354IIlI implements C11iil {
    public static final int OooO0Oo = 1;
    public static final int OooO0o0 = 2;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLi1iII f22885OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f22886OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f22887OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public LLLi1iII f22888OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f22889OooO0O0;
    public int OooO0OO;

    public C9354IIlI(iL1liI il1lii, LLLi1iII lLLi1iII, LLLi1iII lLLi1iII2, int i, int i2) throws IOException {
        this(il1lii, lLLi1iII, lLLi1iII2, i, i2, 1);
    }

    public C9354IIlI(iL1liI il1lii, LLLi1iII lLLi1iII, LLLi1iII lLLi1iII2, int i, int i2, int i3) throws IOException {
        int i4;
        if (L1LL1Ii.OooO0OO(il1lii)) {
            this.OooO0OO = i3;
            if (i3 == 1) {
                i4 = 4;
                this.OooO0O0 = 8;
            } else if (i3 == 2) {
                i4 = 12;
                this.OooO0O0 = 0;
            } else {
                throw new TlsFatalAlert(80);
            }
            this.f22886OooO00o = il1lii;
            this.OooO00o = i2;
            int i5 = (i * 2) + (i4 * 2);
            byte[] OooO00o2 = L1LL1Ii.OooO00o(il1lii, i5);
            C6642li1LI r13 = new C6642li1LI(OooO00o2, 0, i);
            int i6 = i + 0;
            C6642li1LI r15 = new C6642li1LI(OooO00o2, i6, i);
            int i7 = i6 + i;
            int i8 = i7 + i4;
            byte[] OooO00o3 = C9586iIILl.m21632OooO00o(OooO00o2, i7, i8);
            int i9 = i8 + i4;
            byte[] OooO00o4 = C9586iIILl.m21632OooO00o(OooO00o2, i8, i9);
            if (i9 == i5) {
                if (il1lii.m17079OooO00o()) {
                    this.f22885OooO00o = lLLi1iII2;
                    this.f22888OooO0O0 = lLLi1iII;
                    this.f22887OooO00o = OooO00o4;
                    this.f22889OooO0O0 = OooO00o3;
                    r15 = r13;
                    r13 = r15;
                } else {
                    this.f22885OooO00o = lLLi1iII;
                    this.f22888OooO0O0 = lLLi1iII2;
                    this.f22887OooO00o = OooO00o3;
                    this.f22889OooO0O0 = OooO00o4;
                }
                byte[] bArr = new byte[(i4 + this.OooO0O0)];
                int i10 = i2 * 8;
                this.f22885OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C5553Iili(r13, i10, bArr));
                this.f22888OooO0O0.OooO00o(false, (AbstractC6370iIIIl) new C5553Iili(r15, i10, bArr));
                return;
            }
            throw new TlsFatalAlert(80);
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.C11iil
    public int OooO00o(int i) {
        return (i - this.OooO00o) - this.OooO0O0;
    }

    public byte[] OooO00o(long j, short s, int i) throws IOException {
        byte[] bArr = new byte[13];
        L1LL1Ii.OooO0OO(j, bArr, 0);
        L1LL1Ii.OooO00o(s, bArr, 8);
        L1LL1Ii.OooO00o(this.f22886OooO00o.OooO0O0(), bArr, 9);
        L1LL1Ii.OooO00o(i, bArr, 11);
        return bArr;
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        if (OooO00o(i2) >= 0) {
            byte[] bArr2 = this.f22889OooO0O0;
            int length = bArr2.length + this.OooO0O0;
            byte[] bArr3 = new byte[length];
            int i3 = this.OooO0OO;
            if (i3 == 1) {
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                int i4 = this.OooO0O0;
                System.arraycopy(bArr, i, bArr3, length - i4, i4);
            } else if (i3 == 2) {
                L1LL1Ii.OooO0OO(j, bArr3, length - 8);
                int i5 = 0;
                while (true) {
                    byte[] bArr4 = this.f22889OooO0O0;
                    if (i5 >= bArr4.length) {
                        break;
                    }
                    bArr3[i5] = (byte) (bArr4[i5] ^ bArr3[i5]);
                    i5++;
                }
            } else {
                throw new TlsFatalAlert(80);
            }
            int i6 = this.OooO0O0;
            int i7 = i + i6;
            int i8 = i2 - i6;
            int OooO00o2 = this.f22888OooO0O0.OooO00o(i8);
            byte[] bArr5 = new byte[OooO00o2];
            try {
                this.f22888OooO0O0.OooO00o(false, (AbstractC6370iIIIl) new C5553Iili(null, this.OooO00o * 8, bArr3, OooO00o(j, s, OooO00o2)));
                int OooO00o3 = this.f22888OooO0O0.OooO00o(bArr, i7, i8, bArr5, 0) + 0;
                if (OooO00o3 + this.f22888OooO0O0.OooO00o(bArr5, OooO00o3) == OooO00o2) {
                    return bArr5;
                }
                throw new TlsFatalAlert(80);
            } catch (Exception e) {
                throw new TlsFatalAlert(20, e);
            }
        } else {
            throw new TlsFatalAlert(50);
        }
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO0O0(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f22887OooO00o;
        int length = bArr2.length + this.OooO0O0;
        byte[] bArr3 = new byte[length];
        int i3 = this.OooO0OO;
        if (i3 == 1) {
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            L1LL1Ii.OooO0OO(j, bArr3, this.f22887OooO00o.length);
        } else if (i3 == 2) {
            L1LL1Ii.OooO0OO(j, bArr3, length - 8);
            int i4 = 0;
            while (true) {
                byte[] bArr4 = this.f22887OooO00o;
                if (i4 >= bArr4.length) {
                    break;
                }
                bArr3[i4] = (byte) (bArr4[i4] ^ bArr3[i4]);
                i4++;
            }
        } else {
            throw new TlsFatalAlert(80);
        }
        int OooO00o2 = this.f22885OooO00o.OooO00o(i2);
        int i5 = this.OooO0O0;
        int i6 = i5 + OooO00o2;
        byte[] bArr5 = new byte[i6];
        if (i5 != 0) {
            System.arraycopy(bArr3, length - i5, bArr5, 0, i5);
        }
        int i7 = this.OooO0O0;
        try {
            this.f22885OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C5553Iili(null, this.OooO00o * 8, bArr3, OooO00o(j, s, i2)));
            int OooO00o3 = i7 + this.f22885OooO00o.OooO00o(bArr, i, i2, bArr5, i7);
            if (OooO00o3 + this.f22885OooO00o.OooO00o(bArr5, OooO00o3) == i6) {
                return bArr5;
            }
            throw new TlsFatalAlert(80);
        } catch (Exception e) {
            throw new TlsFatalAlert(80, e);
        }
    }
}
