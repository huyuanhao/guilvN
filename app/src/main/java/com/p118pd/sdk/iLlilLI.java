package com.p118pd.sdk;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* renamed from: com.pd.sdk.iLlilL丨I  reason: invalid class name */
public class iLlilLI implements Ii1IliL {
    public static final String OooO00o = "org.bouncycastle.pkcs1.strict";
    public static final int OooO0O0 = 10;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f17786OooO0O0 = "org.bouncycastle.pkcs1.not_strict";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f17787OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f17788OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17789OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17790OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17791OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17792OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f17793OooO0O0;
    public boolean OooO0OO;

    /* renamed from: com.pd.sdk.iLlilL丨I$OooO00o */
    public class OooO00o implements PrivilegedAction {
        public OooO00o() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(iLlilLI.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.iLlilL丨I$OooO0O0 */
    public class OooO0O0 implements PrivilegedAction {
        public OooO0O0() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(iLlilLI.f17786OooO0O0);
        }
    }

    public iLlilLI(Ii1IliL r2) {
        this.f17788OooO00o = r2;
        this.OooO0OO = OooO00o();
    }

    public iLlilLI(Ii1IliL r2, int i) {
        this.f17788OooO00o = r2;
        this.OooO0OO = OooO00o();
        this.f17787OooO00o = i;
    }

    public iLlilLI(Ii1IliL r2, byte[] bArr) {
        this.f17788OooO00o = r2;
        this.OooO0OO = OooO00o();
        this.f17791OooO00o = bArr;
        this.f17787OooO00o = bArr.length;
    }

    private int OooO00o(byte b, byte[] bArr) throws InvalidCipherTextException {
        boolean z = false;
        int i = -1;
        for (int i2 = 1; i2 != bArr.length; i2++) {
            byte b2 = bArr[i2];
            if ((b2 == 0) && (i < 0)) {
                i = i2;
            }
            z |= (b2 != -1) & (b == 1) & (i < 0);
        }
        if (z) {
            return -1;
        }
        return i;
    }

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = 0 | (bArr[0] ^ 2);
        int i3 = i + 1;
        int length = bArr.length - i3;
        for (int i4 = 1; i4 < length; i4++) {
            byte b = bArr[i4];
            int i5 = b | (b >> 1);
            int i6 = i5 | (i5 >> 2);
            i2 |= ((i6 | (i6 >> 4)) & 1) - 1;
        }
        int i7 = bArr[bArr.length - i3] | i2;
        int i8 = i7 | (i7 >> 1);
        int i9 = i8 | (i8 >> 2);
        return (((i9 | (i9 >> 4)) & 1) - 1) ^ -1;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    private boolean OooO00o() {
        String str = (String) AccessController.doPrivileged(new OooO00o());
        String str2 = (String) AccessController.doPrivileged(new OooO0O0());
        return str2 != null ? !str2.equals("true") : str == null || str.equals("true");
    }

    private byte[] OooO0O0(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f17787OooO00o != -1) {
            return OooO0OO(bArr, i, i2);
        }
        byte[] OooO00o2 = this.f17788OooO00o.OooO00o(bArr, i, i2);
        boolean z = true;
        boolean z2 = this.OooO0OO & (OooO00o2.length != this.f17788OooO00o.OooO0O0());
        if (OooO00o2.length < OooO0O0()) {
            OooO00o2 = this.f17793OooO0O0;
        }
        byte b = OooO00o2[0];
        boolean z3 = !this.f17792OooO0O0 ? b != 1 : b != 2;
        int OooO00o3 = OooO00o(b, OooO00o2) + 1;
        if (OooO00o3 >= 10) {
            z = false;
        }
        if (z3 || z) {
            C9586iIILl.OooO00o(OooO00o2, (byte) 0);
            throw new InvalidCipherTextException("block incorrect");
        } else if (!z2) {
            int length = OooO00o2.length - OooO00o3;
            byte[] bArr2 = new byte[length];
            System.arraycopy(OooO00o2, OooO00o3, bArr2, 0, length);
            return bArr2;
        } else {
            C9586iIILl.OooO00o(OooO00o2, (byte) 0);
            throw new InvalidCipherTextException("block incorrect size");
        }
    }

    private byte[] OooO0OO(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.f17792OooO0O0) {
            byte[] OooO00o2 = this.f17788OooO00o.OooO00o(bArr, i, i2);
            byte[] bArr2 = this.f17791OooO00o;
            if (bArr2 == null) {
                bArr2 = new byte[this.f17787OooO00o];
                this.f17789OooO00o.nextBytes(bArr2);
            }
            if (this.OooO0OO && (OooO00o2.length != this.f17788OooO00o.OooO0O0())) {
                OooO00o2 = this.f17793OooO0O0;
            }
            int OooO00o3 = OooO00o(OooO00o2, this.f17787OooO00o);
            byte[] bArr3 = new byte[this.f17787OooO00o];
            int i3 = 0;
            while (true) {
                int i4 = this.f17787OooO00o;
                if (i3 < i4) {
                    bArr3[i3] = (byte) ((OooO00o2[(OooO00o2.length - i4) + i3] & (OooO00o3 ^ -1)) | (bArr2[i3] & OooO00o3));
                    i3++;
                } else {
                    C9586iIILl.OooO00o(OooO00o2, (byte) 0);
                    return bArr3;
                }
            }
        } else {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
    }

    private byte[] OooO0Oo(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (i2 <= m17165OooO00o()) {
            int OooO00o2 = this.f17788OooO00o.OooO00o();
            byte[] bArr2 = new byte[OooO00o2];
            if (this.f17792OooO0O0) {
                bArr2[0] = 1;
                for (int i3 = 1; i3 != (OooO00o2 - i2) - 1; i3++) {
                    bArr2[i3] = -1;
                }
            } else {
                this.f17789OooO00o.nextBytes(bArr2);
                bArr2[0] = 2;
                for (int i4 = 1; i4 != (OooO00o2 - i2) - 1; i4++) {
                    while (bArr2[i4] == 0) {
                        bArr2[i4] = (byte) this.f17789OooO00o.nextInt();
                    }
                }
            }
            int i5 = OooO00o2 - i2;
            bArr2[i5 - 1] = 0;
            System.arraycopy(bArr, i, bArr2, i5, i2);
            return this.f17788OooO00o.OooO00o(bArr2, 0, OooO00o2);
        }
        throw new IllegalArgumentException("input data too large");
    }

    @Override // com.p118pd.sdk.Ii1IliL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17165OooO00o() {
        int OooO00o2 = this.f17788OooO00o.OooO00o();
        return this.f17790OooO00o ? OooO00o2 - 10 : OooO00o2;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ii1IliL m17166OooO00o() {
        return this.f17788OooO00o;
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        C6213iL11I r0;
        if (r4 instanceof liLL1l) {
            liLL1l r02 = (liLL1l) r4;
            this.f17789OooO00o = r02.m17752OooO00o();
            r0 = (C6213iL11I) r02.OooO00o();
        } else {
            r0 = (C6213iL11I) r4;
            if (!r0.OooO00o() && z) {
                this.f17789OooO00o = IIllii.OooO00o();
            }
        }
        this.f17788OooO00o.OooO00o(z, r4);
        this.f17792OooO0O0 = r0.OooO00o();
        this.f17790OooO00o = z;
        this.f17793OooO0O0 = new byte[this.f17788OooO00o.OooO0O0()];
        if (this.f17787OooO00o > 0 && this.f17791OooO00o == null && this.f17789OooO00o == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return this.f17790OooO00o ? OooO0Oo(bArr, i, i2) : OooO0O0(bArr, i, i2);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        int OooO0O02 = this.f17788OooO00o.OooO0O0();
        return this.f17790OooO00o ? OooO0O02 : OooO0O02 - 10;
    }
}
