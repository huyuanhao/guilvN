package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.l1IlI丨L  reason: invalid class name and case insensitive filesystem */
public class C6444l1IlIL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Ii1IliL f18256OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18257OooO00o;

    public C6444l1IlIL(Ii1IliL r1) {
        this.f18256OooO00o = r1;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ii1IliL m17560OooO00o() {
        return this.f18256OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17561OooO00o() {
        if (this.f18257OooO00o != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f18257OooO00o;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        }
        this.OooO00o = 0;
    }

    public void OooO00o(byte b) {
        int i = this.OooO00o;
        byte[] bArr = this.f18257OooO00o;
        if (i < bArr.length) {
            this.OooO00o = i + 1;
            bArr[i] = b;
            return;
        }
        throw new DataLengthException("attempt to process message too long for cipher");
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        m17561OooO00o();
        this.f18256OooO00o.OooO00o(z, r3);
        this.f18257OooO00o = new byte[(this.f18256OooO00o.OooO00o() + (z ? 1 : 0))];
        this.OooO00o = 0;
    }

    public void OooO00o(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i2 >= 0) {
                int i3 = this.OooO00o;
                int i4 = i3 + i2;
                byte[] bArr2 = this.f18257OooO00o;
                if (i4 <= bArr2.length) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.OooO00o += i2;
                    return;
                }
                throw new DataLengthException("attempt to process message too long for cipher");
            }
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17562OooO00o() throws InvalidCipherTextException {
        byte[] OooO00o2 = this.f18256OooO00o.OooO00o(this.f18257OooO00o, 0, this.OooO00o);
        m17561OooO00o();
        return OooO00o2;
    }

    public int OooO0O0() {
        return this.f18256OooO00o.OooO00o();
    }

    public int OooO0OO() {
        return this.f18256OooO00o.OooO0O0();
    }
}
