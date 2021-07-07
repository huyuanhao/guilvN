package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* renamed from: com.pd.sdk.iiIi丨i丨L  reason: invalid class name and case insensitive filesystem */
public class C6233iiIiiL extends I1II11i {

    /* renamed from: com.pd.sdk.iiIi丨i丨L$OooO00o */
    public static class OooO00o implements I111LIL {
        public ByteArrayOutputStream OooO00o = new ByteArrayOutputStream();

        /* renamed from: OooO00o  reason: collision with other field name */
        public MessageDigest f17853OooO00o;

        public OooO00o(MessageDigest messageDigest) {
            this.f17853OooO00o = messageDigest;
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        public C6456l1ilL OooO00o() {
            return new C6456l1ilL(AbstractC9733l.OooO);
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17241OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17242OooO00o() {
            byte[] digest = this.f17853OooO00o.digest(this.OooO00o.toByteArray());
            this.OooO00o.reset();
            return digest;
        }
    }

    public C6233iiIiiL() throws NoSuchAlgorithmException {
        super(new OooO00o(MessageDigest.getInstance("SHA1")));
    }

    public C6233iiIiiL(I111LIL r1) {
        super(r1);
    }

    public static AbstractC6122iIlLiL OooO00o(byte[] bArr) throws IOException {
        return AbstractC6122iIlLiL.OooO00o(AbstractC6804llL1ii.OooO00o((Object) bArr).m17938OooO00o());
    }

    public static Collection OooO00o(X509Certificate x509Certificate) throws CertificateParsingException {
        return m17238OooO00o(x509Certificate.getExtensionValue(C5237III.o00Ooo0O.m16387OooO0O0()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Collection m17238OooO00o(byte[] bArr) throws CertificateParsingException {
        Object OooO0O0;
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration OooO00o2 = I11li1.OooO00o((Object) OooO00o(bArr)).m15236OooO00o();
            while (OooO00o2.hasMoreElements()) {
                ILI OooO00o3 = ILI.OooO00o(OooO00o2.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(I11I.OooO00o(OooO00o3.OooO00o()));
                switch (OooO00o3.OooO00o()) {
                    case 0:
                    case 3:
                    case 5:
                        OooO0O0 = OooO00o3.m15483OooO0O0().OooO0O0();
                        break;
                    case 1:
                    case 2:
                    case 6:
                        OooO0O0 = ((AbstractC98681) OooO00o3.m15483OooO0O0()).OooO00o();
                        break;
                    case 4:
                        OooO0O0 = l1LILI1.OooO00o(OooO00o3.m15483OooO0O0()).toString();
                        break;
                    case 7:
                        arrayList2.add(AbstractC6804llL1ii.OooO00o(OooO00o3.m15483OooO0O0()).m17938OooO00o());
                        continue;
                        arrayList.add(arrayList2);
                    case 8:
                        OooO0O0 = LlLI1.OooO00o(OooO00o3.m15483OooO0O0()).m16387OooO0O0();
                        break;
                    default:
                        throw new IOException("Bad tag number: " + OooO00o3.OooO00o());
                }
                arrayList2.add(OooO0O0);
                arrayList.add(arrayList2);
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    public static Collection OooO0O0(X509Certificate x509Certificate) throws CertificateParsingException {
        return m17238OooO00o(x509Certificate.getExtensionValue(C5237III.o00Ooo0.m16387OooO0O0()));
    }

    public ilililIi OooO00o(PublicKey publicKey) {
        return super.m15256OooO00o(C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public ilililIi OooO00o(PublicKey publicKey, C5845LIillll r2, BigInteger bigInteger) {
        return super.OooO00o(C6888ll.OooO00o(publicKey.getEncoded()), r2, bigInteger);
    }

    public ilililIi OooO00o(PublicKey publicKey, X500Principal x500Principal, BigInteger bigInteger) {
        return super.OooO00o(C6888ll.OooO00o(publicKey.getEncoded()), new C5845LIillll(new ILI(l1LILI1.OooO00o(x500Principal.getEncoded()))), bigInteger);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ilililIi m17239OooO00o(X509Certificate x509Certificate) throws CertificateEncodingException {
        return super.m15257OooO00o((X509CertificateHolder) new JcaX509CertificateHolder(x509Certificate));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6584lLLL m17240OooO00o(PublicKey publicKey) {
        return super.m15258OooO00o(C6888ll.OooO00o(publicKey.getEncoded()));
    }

    public C6584lLLL OooO0O0(PublicKey publicKey) {
        return super.OooO0O0(C6888ll.OooO00o(publicKey.getEncoded()));
    }
}
