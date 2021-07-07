package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.丨i1LliL  reason: invalid class name and case insensitive filesystem */
public class C9572i1LliL extends l1ili1 {
    public static Hashtable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f23142OooO00o = new ILLli();

    static {
        Hashtable hashtable = new Hashtable();
        OooO00o = hashtable;
        hashtable.put(AbstractC5711LiLli.OooOoO0, C7491o0OoOOO.OooO00o);
        OooO00o.put(AbstractC5420Il1iIL.o00OOooo, "DSA");
    }

    public C9572i1LliL(l1ili1 r1) {
        super(r1.m17584OooO00o());
    }

    public C9572i1LliL(C9764Il1 r1) {
        super(r1);
    }

    public C9572i1LliL(byte[] bArr) throws IOException {
        super(bArr);
    }

    public C9572i1LliL OooO00o(String str) {
        this.f23142OooO00o = new C9588iIi(str);
        return this;
    }

    public C9572i1LliL OooO00o(Provider provider) {
        this.f23142OooO00o = new LLIlii(provider);
        return this;
    }

    @Override // com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1
    public PublicKey OooO00o() throws InvalidKeyException, NoSuchAlgorithmException {
        KeyFactory keyFactory;
        try {
            C6888ll OooO00o2 = m17583OooO00o();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(OooO00o2.getEncoded());
            try {
                keyFactory = this.f23142OooO00o.m17218OooO00o(OooO00o2.m18041OooO00o().OooO00o().m16387OooO0O0());
            } catch (NoSuchAlgorithmException e) {
                if (OooO00o.get(OooO00o2.m18041OooO00o().OooO00o()) != null) {
                    keyFactory = this.f23142OooO00o.m17218OooO00o((String) OooO00o.get(OooO00o2.m18041OooO00o().OooO00o()));
                } else {
                    throw e;
                }
            }
            return keyFactory.generatePublic(x509EncodedKeySpec);
        } catch (InvalidKeySpecException unused) {
            throw new InvalidKeyException("error decoding public key");
        } catch (IOException unused2) {
            throw new InvalidKeyException("error extracting key encoding");
        } catch (NoSuchProviderException e2) {
            throw new NoSuchAlgorithmException("cannot find provider: " + e2.getMessage());
        }
    }
}
