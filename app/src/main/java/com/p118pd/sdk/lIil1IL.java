package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.lIil1I丨L  reason: invalid class name */
public class lIil1IL {
    public static List OooO00o = Collections.unmodifiableList(new ArrayList());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set f18396OooO00o = Collections.unmodifiableSet(new HashSet());

    public static C5190I1lIiL OooO00o(C6782lli11 lli11, C6456l1ilL r2, byte[] bArr) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(lli11);
        r0.OooO00o(r2);
        r0.OooO00o(new iIilII1(bArr));
        return C5190I1lIiL.OooO00o(new C5707LiL1(r0));
    }

    public static LilIiIl OooO00o(C5314ILlLL iLlLL, C6456l1ilL r2, byte[] bArr) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(iLlLL);
        r0.OooO00o(r2);
        r0.OooO00o(new iIilII1(bArr));
        return LilIiIl.OooO00o(new C5707LiL1(r0));
    }

    public static iIilII1 OooO00o(boolean[] zArr) {
        byte[] bArr = new byte[((zArr.length + 7) / 8)];
        for (int i = 0; i != zArr.length; i++) {
            int i2 = i / 8;
            bArr[i2] = (byte) (bArr[i2] | (zArr[i] ? 1 << (7 - (i % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new iIilII1(bArr) : new iIilII1(bArr, 8 - length);
    }

    public static AbstractC6122iIlLiL OooO00o(byte[] bArr) throws IOException {
        AbstractC6122iIlLiL OooO00o2 = AbstractC6122iIlLiL.OooO00o(bArr);
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        throw new IOException("no content found");
    }

    public static C9370Ii OooO00o(C5872LilIi r1, C6456l1ilL r2, byte[] bArr) {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(r1);
        r0.OooO00o(r2);
        r0.OooO00o(new iIilII1(bArr));
        return C9370Ii.OooO00o(new C5707LiL1(r0));
    }

    public static Date OooO00o(C9623il r3) {
        try {
            return r3.OooO00o();
        } catch (ParseException e) {
            throw new IllegalStateException("unable to recover date: " + e.getMessage());
        }
    }

    public static List OooO00o(iI11IL r0) {
        return r0 == null ? OooO00o : Collections.unmodifiableList(Arrays.asList(r0.m17474OooO0O0()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set m17645OooO00o(iI11IL r1) {
        return r1 == null ? f18396OooO00o : Collections.unmodifiableSet(new HashSet(Arrays.asList(r1.m17473OooO00o())));
    }

    public static X509AttributeCertificateHolder OooO00o(Lii1ii1 r2, C5872LilIi r3) {
        try {
            return new X509AttributeCertificateHolder(OooO00o(r3, r2.OooO00o(), OooO00o(r2, (AbstractC6854lLi1LL) r3)));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot produce attribute certificate signature");
        }
    }

    public static X509CRLHolder OooO00o(Lii1ii1 r2, C6782lli11 lli11) {
        try {
            return new X509CRLHolder(OooO00o(lli11, r2.OooO00o(), OooO00o(r2, (AbstractC6854lLi1LL) lli11)));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot produce certificate signature");
        }
    }

    public static X509CertificateHolder OooO00o(Lii1ii1 r2, C5314ILlLL iLlLL) {
        try {
            return new X509CertificateHolder(OooO00o(iLlLL, r2.OooO00o(), OooO00o(r2, (AbstractC6854lLi1LL) iLlLL)));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot produce certificate signature");
        }
    }

    public static void OooO00o(L11l1i r0, LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r3) throws CertIOException {
        try {
            r0.OooO00o(llLI1, z, r3);
        } catch (IOException e) {
            throw new CertIOException("cannot encode extension: " + e.getMessage(), e);
        }
    }

    public static boolean OooO00o(C6456l1ilL r3, C6456l1ilL r4) {
        if (!r3.OooO00o().equals(r4.OooO00o())) {
            return false;
        }
        return r3.m17587OooO0O0() == null ? r4.m17587OooO0O0() == null || r4.m17587OooO0O0().equals(C6452l1Lll.OooO00o) : r4.m17587OooO0O0() == null ? r3.m17587OooO0O0() == null || r3.m17587OooO0O0().equals(C6452l1Lll.OooO00o) : r3.m17587OooO0O0().equals(r4.m17587OooO0O0());
    }

    public static byte[] OooO00o(Lii1ii1 r2, AbstractC6854lLi1LL r3) throws IOException {
        OutputStream OooO00o2 = r2.m16310OooO00o();
        new C6119iIl1il(OooO00o2).OooO00o(r3);
        OooO00o2.close();
        return r2.getSignature();
    }

    public static boolean[] OooO00o(iIilII1 iiilii1) {
        if (iiilii1 == null) {
            return null;
        }
        byte[] OooO00o2 = iiilii1.m15475OooO00o();
        int length = (OooO00o2.length * 8) - iiilii1.OooO0OO();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (OooO00o2[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public static Set OooO0O0(iI11IL r1) {
        return r1 == null ? f18396OooO00o : Collections.unmodifiableSet(new HashSet(Arrays.asList(r1.OooO0OO())));
    }
}
