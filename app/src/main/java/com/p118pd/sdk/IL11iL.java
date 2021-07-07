package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPIOException;
import org.bouncycastle.tsp.TSPValidationException;

/* renamed from: com.pd.sdk.I丨L11丨iL  reason: invalid class name */
public class IL11iL {
    public static List OooO00o = Collections.unmodifiableList(new ArrayList());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map f16018OooO00o = new HashMap();
    public static final Map OooO0O0 = new HashMap();

    static {
        f16018OooO00o.put(AbstractC5711LiLli.Oooooo0.m16387OooO0O0(), I11I.OooO00o(16));
        f16018OooO00o.put(AbstractC9733l.OooO.m16387OooO0O0(), I11I.OooO00o(20));
        f16018OooO00o.put(AbstractC5905LllI.OooO0o.m16387OooO0O0(), I11I.OooO00o(28));
        f16018OooO00o.put(AbstractC5905LllI.OooO0OO.m16387OooO0O0(), I11I.OooO00o(32));
        f16018OooO00o.put(AbstractC5905LllI.OooO0Oo.m16387OooO0O0(), I11I.OooO00o(48));
        f16018OooO00o.put(AbstractC5905LllI.OooO0o0.m16387OooO0O0(), I11I.OooO00o(64));
        f16018OooO00o.put(AbstractC9468L1lL.OooO0OO.m16387OooO0O0(), I11I.OooO00o(16));
        f16018OooO00o.put(AbstractC9468L1lL.OooO0O0.m16387OooO0O0(), I11I.OooO00o(20));
        f16018OooO00o.put(AbstractC9468L1lL.OooO0Oo.m16387OooO0O0(), I11I.OooO00o(32));
        f16018OooO00o.put(AbstractC5331ILi.OooO0O0.m16387OooO0O0(), I11I.OooO00o(32));
        f16018OooO00o.put(LLiII.OooO0OO.m16387OooO0O0(), I11I.OooO00o(32));
        f16018OooO00o.put(LLiII.OooO0Oo.m16387OooO0O0(), I11I.OooO00o(64));
        f16018OooO00o.put(AbstractC6041i1l.Ooooo00.m16387OooO0O0(), I11I.OooO00o(32));
        OooO0O0.put(AbstractC5711LiLli.Oooooo0.m16387OooO0O0(), "MD5");
        OooO0O0.put(AbstractC9733l.OooO.m16387OooO0O0(), "SHA1");
        OooO0O0.put(AbstractC5905LllI.OooO0o.m16387OooO0O0(), "SHA224");
        OooO0O0.put(AbstractC5905LllI.OooO0OO.m16387OooO0O0(), "SHA256");
        OooO0O0.put(AbstractC5905LllI.OooO0Oo.m16387OooO0O0(), "SHA384");
        OooO0O0.put(AbstractC5905LllI.OooO0o0.m16387OooO0O0(), "SHA512");
        OooO0O0.put(AbstractC5711LiLli.OooOoo.m16387OooO0O0(), "SHA1");
        OooO0O0.put(AbstractC5711LiLli.Oooo0o0.m16387OooO0O0(), "SHA224");
        OooO0O0.put(AbstractC5711LiLli.Oooo0.m16387OooO0O0(), "SHA256");
        OooO0O0.put(AbstractC5711LiLli.Oooo0O0.m16387OooO0O0(), "SHA384");
        OooO0O0.put(AbstractC5711LiLli.Oooo0OO.m16387OooO0O0(), "SHA512");
        OooO0O0.put(AbstractC9468L1lL.OooO0OO.m16387OooO0O0(), "RIPEMD128");
        OooO0O0.put(AbstractC9468L1lL.OooO0O0.m16387OooO0O0(), "RIPEMD160");
        OooO0O0.put(AbstractC9468L1lL.OooO0Oo.m16387OooO0O0(), "RIPEMD256");
        OooO0O0.put(AbstractC5331ILi.OooO0O0.m16387OooO0O0(), "GOST3411");
        OooO0O0.put(LLiII.OooO0OO.m16387OooO0O0(), "GOST3411-2012-256");
        OooO0O0.put(LLiII.OooO0Oo.m16387OooO0O0(), "GOST3411-2012-512");
        OooO0O0.put(AbstractC6041i1l.Ooooo00.m16387OooO0O0(), "SM3");
    }

    public static int OooO00o(String str) throws TSPException {
        Integer num = (Integer) f16018OooO00o.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new TSPException("digest algorithm cannot be found.");
    }

    public static Collection OooO00o(C5510IIl r11, AbstractC6290ii r12) throws TSPValidationException {
        ArrayList arrayList = new ArrayList();
        C9731lL1 OooO0O02 = r11.OooO0O0();
        if (OooO0O02 != null) {
            iILLL1 OooO00o2 = OooO0O02.OooO00o(AbstractC5711LiLli.o000O0O);
            for (int i = 0; i < OooO00o2.OooO00o(); i++) {
                I11L OooO00o3 = ((C9476LIL1li) OooO00o2.OooO00o(i)).OooO00o();
                for (int i2 = 0; i2 < OooO00o3.size(); i2++) {
                    try {
                        C9448Il r7 = new C9448Il(C5753LiI1.OooO00o(OooO00o3.OooO00o(i2)));
                        IilIL OooO00o4 = r7.OooO00o();
                        I111LIL OooO00o5 = r12.OooO00o(OooO00o4.m15618OooO00o());
                        OutputStream OooO00o6 = OooO00o5.m21370OooO00o();
                        OooO00o6.write(r11.OooO0o0());
                        OooO00o6.close();
                        if (C9586iIILl.OooO0O0(OooO00o5.m21371OooO00o(), OooO00o4.m15626OooO0O0())) {
                            arrayList.add(r7);
                        } else {
                            throw new TSPValidationException("Incorrect digest in message imprint");
                        }
                    } catch (OperatorCreationException unused) {
                        throw new TSPValidationException("Unknown hash algorithm specified in timestamp");
                    } catch (Exception unused2) {
                        throw new TSPValidationException("Timestamp could not be parsed");
                    }
                }
            }
        }
        return arrayList;
    }

    public static List OooO00o(iI11IL r0) {
        return r0 == null ? OooO00o : Collections.unmodifiableList(Arrays.asList(r0.m17474OooO0O0()));
    }

    public static void OooO00o(L11l1i r0, LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r3) throws TSPIOException {
        try {
            r0.OooO00o(llLI1, z, r3);
        } catch (IOException e) {
            throw new TSPIOException("cannot encode extension: " + e.getMessage(), e);
        }
    }

    public static void OooO00o(X509CertificateHolder x509CertificateHolder) throws TSPValidationException {
        if (x509CertificateHolder.toASN1Structure().OooO0O0() == 3) {
            C5237III extension = x509CertificateHolder.getExtension(C5237III.o00o00O0);
            if (extension == null) {
                throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension.");
            } else if (extension.m15434OooO00o()) {
                C5651LILli OooO00o2 = C5651LILli.OooO00o(extension.m15435OooO0O0());
                if (!OooO00o2.OooO00o(C5869LiLL.OooO) || OooO00o2.size() != 1) {
                    throw new TSPValidationException("ExtendedKeyUsage not solely time stamping.");
                }
            } else {
                throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension marked as critical.");
            }
        } else {
            throw new IllegalArgumentException("Certificate must have an ExtendedKeyUsage extension.");
        }
    }
}
