package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.p292io.pem.PemGenerationException;

/* renamed from: com.pd.sdk.lilli丨I  reason: invalid class name and case insensitive filesystem */
public class C6706lilliI implements LliILl1 {
    public static final byte[] OooO00o = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final LlLI1[] f18645OooO00o = {AbstractC5420Il1iIL.o00OOooo, AbstractC9733l.OooOO0};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC93101ii f18646OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f18647OooO00o;

    public C6706lilliI(Object obj) {
        this.f18647OooO00o = obj;
        this.f18646OooO00o = null;
    }

    public C6706lilliI(Object obj, AbstractC93101ii r2) {
        this.f18647OooO00o = obj;
        this.f18646OooO00o = r2;
    }

    private C11L1L OooO00o(Object obj) throws IOException {
        byte[] bArr;
        String str;
        if (obj instanceof C11L1L) {
            return (C11L1L) obj;
        }
        if (obj instanceof LliILl1) {
            return ((LliILl1) obj).OooO00o();
        }
        if (obj instanceof X509CertificateHolder) {
            bArr = ((X509CertificateHolder) obj).getEncoded();
            str = "CERTIFICATE";
        } else if (obj instanceof X509CRLHolder) {
            bArr = ((X509CRLHolder) obj).getEncoded();
            str = "X509 CRL";
        } else if (obj instanceof IL1I) {
            bArr = ((IL1I) obj).m15470OooO00o();
            str = "TRUSTED CERTIFICATE";
        } else if (obj instanceof C5464IlilIi) {
            C5464IlilIi r8 = (C5464IlilIi) obj;
            LlLI1 OooO00o2 = r8.m15707OooO0O0().OooO00o();
            if (OooO00o2.equals(AbstractC5711LiLli.OooOoO0)) {
                bArr = r8.m15708OooO0O0().OooO0O0().getEncoded();
                str = "RSA PRIVATE KEY";
            } else if (OooO00o2.equals(f18645OooO00o[0]) || OooO00o2.equals(f18645OooO00o[1])) {
                C6847lLI OooO00o3 = C6847lLI.OooO00o(r8.m15707OooO0O0().m17587OooO0O0());
                iILLL1 r1 = new iILLL1();
                r1.OooO00o(new C6513lIiI(0));
                r1.OooO00o(new C6513lIiI(OooO00o3.m17999OooO0O0()));
                r1.OooO00o(new C6513lIiI(OooO00o3.OooO0OO()));
                r1.OooO00o(new C6513lIiI(OooO00o3.OooO00o()));
                BigInteger OooO0O0 = C6513lIiI.OooO00o(r8.m15708OooO0O0()).m17647OooO0O0();
                r1.OooO00o(new C6513lIiI(OooO00o3.OooO00o().modPow(OooO0O0, OooO00o3.m17999OooO0O0())));
                r1.OooO00o(new C6513lIiI(OooO0O0));
                bArr = new C5707LiL1(r1).getEncoded();
                str = "DSA PRIVATE KEY";
            } else if (OooO00o2.equals(AbstractC5420Il1iIL.o00O0o0o)) {
                bArr = r8.m15708OooO0O0().OooO0O0().getEncoded();
                str = "EC PRIVATE KEY";
            } else {
                throw new IOException("Cannot identify private key");
            }
        } else if (obj instanceof C6888ll) {
            bArr = ((C6888ll) obj).getEncoded();
            str = "PUBLIC KEY";
        } else if (obj instanceof X509AttributeCertificateHolder) {
            bArr = ((X509AttributeCertificateHolder) obj).getEncoded();
            str = "ATTRIBUTE CERTIFICATE";
        } else if (obj instanceof l1ili1) {
            bArr = ((l1ili1) obj).m17585OooO00o();
            str = "CERTIFICATE REQUEST";
        } else if (obj instanceof C5245IIi) {
            bArr = ((C5245IIi) obj).m15463OooO00o();
            str = "ENCRYPTED PRIVATE KEY";
        } else if (obj instanceof C5753LiI1) {
            bArr = ((C5753LiI1) obj).getEncoded();
            str = "PKCS7";
        } else {
            throw new PemGenerationException("unknown object passed - can't encode.");
        }
        AbstractC93101ii r12 = this.f18646OooO00o;
        if (r12 == null) {
            return new C11L1L(str, bArr);
        }
        String OooO0O02 = Strings.OooO0O0(r12.getAlgorithm());
        if (OooO0O02.equals("DESEDE")) {
            OooO0O02 = "DES-EDE3-CBC";
        }
        byte[] OooO00o4 = this.f18646OooO00o.OooO00o();
        byte[] OooO00o5 = this.f18646OooO00o.OooO00o(bArr);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new i11I1("Proc-Type", "4,ENCRYPTED"));
        arrayList.add(new i11I1("DEK-Info", OooO0O02 + Constants.ACCEPT_TIME_SEPARATOR_SP + OooO00o(OooO00o4)));
        return new C11L1L(str, arrayList, OooO00o5);
    }

    private String OooO00o(byte[] bArr) throws IOException {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            byte[] bArr2 = OooO00o;
            cArr[i3] = (char) bArr2[i2 >>> 4];
            cArr[i3 + 1] = (char) bArr2[i2 & 15];
        }
        return new String(cArr);
    }

    @Override // com.p118pd.sdk.LliILl1
    public C11L1L OooO00o() throws PemGenerationException {
        try {
            return OooO00o(this.f18647OooO00o);
        } catch (IOException e) {
            throw new PemGenerationException("encoding exception: " + e.getMessage(), e);
        }
    }
}
