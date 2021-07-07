package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMException;

/* renamed from: com.pd.sdk.lIIill丨  reason: invalid class name and case insensitive filesystem */
public class C6488lIIill extends C9428Ill1L {
    public final Map OooO00o;

    /* renamed from: com.pd.sdk.lIIill丨$OooO */
    public class OooO implements LliLIiI {
        public OooO() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return C5464IlilIi.OooO00o(r4.m21233OooO00o());
            } catch (Exception e) {
                throw new PEMException("problem parsing PRIVATE KEY: " + e.toString(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0O0 */
    public class OooO0O0 implements AbstractC5645LI1LiI {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.AbstractC5645LI1LiI
        public C6626lL11 OooO00o(byte[] bArr) throws IOException {
            try {
                I11li1 OooO00o2 = I11li1.OooO00o((Object) bArr);
                if (OooO00o2.size() == 6) {
                    C6513lIiI OooO00o3 = C6513lIiI.OooO00o(OooO00o2.OooO00o(1));
                    C6513lIiI OooO00o4 = C6513lIiI.OooO00o(OooO00o2.OooO00o(2));
                    C6513lIiI OooO00o5 = C6513lIiI.OooO00o(OooO00o2.OooO00o(3));
                    return new C6626lL11(new C6888ll(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(OooO00o3.m17647OooO0O0(), OooO00o4.m17647OooO0O0(), OooO00o5.m17647OooO0O0())), C6513lIiI.OooO00o(OooO00o2.OooO00o(4))), new C5464IlilIi(new C6456l1ilL(AbstractC5420Il1iIL.o00OOooo, new C6847lLI(OooO00o3.m17647OooO0O0(), OooO00o4.m17647OooO0O0(), OooO00o5.m17647OooO0O0())), C6513lIiI.OooO00o(OooO00o2.OooO00o(5))));
                }
                throw new PEMException("malformed sequence in DSA private key");
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem creating DSA private key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0OO */
    public class OooO0OO implements LliLIiI {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                AbstractC6122iIlLiL OooO00o2 = AbstractC6122iIlLiL.OooO00o(r4.m21233OooO00o());
                if (OooO00o2 instanceof LlLI1) {
                    return AbstractC6122iIlLiL.OooO00o(r4.m21233OooO00o());
                }
                if (OooO00o2 instanceof I11li1) {
                    return C9387Iill.OooO00o(OooO00o2);
                }
                return null;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("exception extracting EC named curve: " + e2.toString());
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0Oo  reason: case insensitive filesystem */
    public class C6489OooO0Oo implements AbstractC5645LI1LiI {
        public C6489OooO0Oo() {
        }

        @Override // com.p118pd.sdk.AbstractC5645LI1LiI
        public C6626lL11 OooO00o(byte[] bArr) throws IOException {
            try {
                C6392ii1LI1 OooO00o2 = C6392ii1LI1.OooO00o(I11li1.OooO00o((Object) bArr));
                C6456l1ilL r0 = new C6456l1ilL(AbstractC5420Il1iIL.o00O0o0o, OooO00o2.OooO0Oo());
                C5464IlilIi r1 = new C5464IlilIi(r0, OooO00o2);
                return OooO00o2.OooO00o() != null ? new C6626lL11(new C6888ll(r0, OooO00o2.OooO00o().m15475OooO00o()), r1) : new C6626lL11(null, r1);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem creating EC private key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0o */
    public class OooO0o implements LliLIiI {
        public final AbstractC5645LI1LiI OooO00o;

        public OooO0o(AbstractC5645LI1LiI r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r7) throws IOException {
            boolean z = false;
            String str = null;
            for (i11I1 r3 : r7.m21232OooO00o()) {
                if (r3.OooO00o().equals("Proc-Type") && r3.OooO0O0().equals("4,ENCRYPTED")) {
                    z = true;
                } else if (r3.OooO00o().equals("DEK-Info")) {
                    str = r3.OooO0O0();
                }
            }
            byte[] OooO00o2 = r7.m21233OooO00o();
            if (!z) {
                return this.OooO00o.OooO00o(OooO00o2);
            }
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
                return new C5409Iiil(stringTokenizer.nextToken(), C6472l1l1l.OooO00o(stringTokenizer.nextToken()), OooO00o2, this.OooO00o);
            } catch (IOException e) {
                if (z) {
                    throw new PEMException("exception decoding - please check password and data.", e);
                }
                throw new PEMException(e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                if (z) {
                    throw new PEMException("exception decoding - please check password and data.", e2);
                }
                throw new PEMException(e2.getMessage(), e2);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0o0  reason: case insensitive filesystem */
    public class C6490OooO0o0 implements LliLIiI {
        public C6490OooO0o0() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return new C5245IIi(C6845lLIL.OooO00o(r4.m21233OooO00o()));
            } catch (Exception e) {
                throw new PEMException("problem parsing ENCRYPTED PRIVATE KEY: " + e.toString(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0oO  reason: case insensitive filesystem */
    public class C6491OooO0oO implements LliLIiI {
        public C6491OooO0oO() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return new l1ili1(r4.m21233OooO00o());
            } catch (Exception e) {
                throw new PEMException("problem parsing certrequest: " + e.toString(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooO0oo  reason: case insensitive filesystem */
    public class C6492OooO0oo implements LliLIiI {
        public C6492OooO0oo() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return C5753LiI1.OooO00o(new C5805Ll1(r4.m21233OooO00o()).OooO00o());
            } catch (Exception e) {
                throw new PEMException("problem parsing PKCS7 object: " + e.toString(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOO0 */
    public class OooOO0 implements LliLIiI {
        public OooOO0() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r1) throws IOException {
            return C6888ll.OooO00o(r1.m21233OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOO0O */
    public class OooOO0O implements AbstractC5645LI1LiI {
        public OooOO0O() {
        }

        @Override // com.p118pd.sdk.AbstractC5645LI1LiI
        public C6626lL11 OooO00o(byte[] bArr) throws IOException {
            try {
                I11li1 OooO00o2 = I11li1.OooO00o((Object) bArr);
                if (OooO00o2.size() == 9) {
                    C6563lL1Ll OooO00o3 = C6563lL1Ll.OooO00o(OooO00o2);
                    C5724Liil liil = new C5724Liil(OooO00o3.OooO0Oo(), OooO00o3.OooO0oo());
                    C6456l1ilL r1 = new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o);
                    return new C6626lL11(new C6888ll(r1, liil), new C5464IlilIi(r1, OooO00o3));
                }
                throw new PEMException("malformed sequence in RSA private key");
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem creating RSA private key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOO0o  reason: case insensitive filesystem */
    public class C6493OooOO0o implements LliLIiI {
        public C6493OooOO0o() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r5) throws IOException {
            try {
                return new C6888ll(new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o), C5724Liil.OooO00o(r5.m21233OooO00o()));
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new PEMException("problem extracting key: " + e2.toString(), e2);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOOO */
    public class OooOOO implements LliLIiI {
        public OooOOO() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return new X509CRLHolder(r4.m21233OooO00o());
            } catch (Exception e) {
                throw new PEMException("problem parsing cert: " + e.toString(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOOO0 */
    public class OooOOO0 implements LliLIiI {
        public OooOOO0() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r2) throws IOException {
            return new X509AttributeCertificateHolder(r2.m21233OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOOOO */
    public class OooOOOO implements LliLIiI {
        public OooOOOO() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return new X509CertificateHolder(r4.m21233OooO00o());
            } catch (Exception e) {
                throw new PEMException("problem parsing cert: " + e.toString(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.lIIill丨$OooOOOo  reason: case insensitive filesystem */
    public class C6494OooOOOo implements LliLIiI {
        public C6494OooOOOo() {
        }

        @Override // com.p118pd.sdk.LliLIiI
        public Object OooO00o(C11L1L r4) throws IOException {
            try {
                return new IL1I(r4.m21233OooO00o());
            } catch (Exception e) {
                throw new PEMException("problem parsing cert: " + e.toString(), e);
            }
        }
    }

    public C6488lIIill(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.OooO00o = hashMap;
        hashMap.put("CERTIFICATE REQUEST", new C6491OooO0oO());
        this.OooO00o.put("NEW CERTIFICATE REQUEST", new C6491OooO0oO());
        this.OooO00o.put("CERTIFICATE", new OooOOOO());
        this.OooO00o.put("TRUSTED CERTIFICATE", new C6494OooOOOo());
        this.OooO00o.put("X509 CERTIFICATE", new OooOOOO());
        this.OooO00o.put("X509 CRL", new OooOOO());
        this.OooO00o.put("PKCS7", new C6492OooO0oo());
        this.OooO00o.put("CMS", new C6492OooO0oo());
        this.OooO00o.put("ATTRIBUTE CERTIFICATE", new OooOOO0());
        this.OooO00o.put("EC PARAMETERS", new OooO0OO());
        this.OooO00o.put("PUBLIC KEY", new OooOO0());
        this.OooO00o.put("RSA PUBLIC KEY", new C6493OooOO0o());
        this.OooO00o.put("RSA PRIVATE KEY", new OooO0o(new OooOO0O()));
        this.OooO00o.put("DSA PRIVATE KEY", new OooO0o(new OooO0O0()));
        this.OooO00o.put("EC PRIVATE KEY", new OooO0o(new C6489OooO0Oo()));
        this.OooO00o.put("ENCRYPTED PRIVATE KEY", new C6490OooO0o0());
        this.OooO00o.put("PRIVATE KEY", new OooO());
    }

    public Object readObject() throws IOException {
        C11L1L OooO00o2 = OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        String OooO00o3 = OooO00o2.m21231OooO00o();
        if (this.OooO00o.containsKey(OooO00o3)) {
            return ((LliLIiI) this.OooO00o.get(OooO00o3)).OooO00o(OooO00o2);
        }
        throw new IOException("unrecognised object: " + OooO00o3);
    }
}
