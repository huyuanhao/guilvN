package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.丨L1丨1iL  reason: invalid class name and case insensitive filesystem */
public class C9469L11iL {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 1;
    public static final int OooO0o0 = 0;
    public static final int OooO0oO = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f23039OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final X509CertificateHolder f23040OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f23041OooO00o;

    public C9469L11iL(String str, byte[] bArr) throws IOException {
        this(str, C9586iIILl.m21632OooO00o(bArr, 0, 3), new X509CertificateHolder(C9586iIILl.m21632OooO00o(bArr, 3, bArr.length)));
    }

    public C9469L11iL(String str, byte[] bArr, X509CertificateHolder x509CertificateHolder) {
        this.f23041OooO00o = bArr;
        this.f23039OooO00o = str;
        this.f23040OooO00o = x509CertificateHolder;
    }

    public static boolean OooO00o(byte[] bArr) {
        return (bArr[0] >= 0 || bArr[0] <= 3) && bArr[1] == 0 && bArr[2] == 0;
    }

    public String OooO00o() {
        return this.f23039OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder m21520OooO00o() {
        return this.f23040OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21521OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23041OooO00o);
    }

    public byte[] OooO0O0() throws IOException {
        byte[] encoded = this.f23040OooO00o.getEncoded();
        byte[] bArr = this.f23041OooO00o;
        byte[] bArr2 = new byte[(bArr.length + encoded.length)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(encoded, 0, bArr2, this.f23041OooO00o.length, encoded.length);
        return bArr2;
    }
}
