package com.p118pd.sdk;

import com.p118pd.sdk.C6140iIil;
import java.io.OutputStream;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iIILIL丨丨  reason: invalid class name */
public class iIILIL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Illiiil f17480OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f17481OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5873LiliL1 f17482OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6140iIil.OooO0O0 f17483OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f17484OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17485OooO00o;
    public LlLI1 OooO0O0;

    /* renamed from: com.pd.sdk.iIILIL丨丨$OooO00o */
    public class OooO00o implements AbstractC5650LIL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f17486OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Cipher f17487OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f17488OooO00o;

        public OooO00o(C6456l1ilL r2, Cipher cipher, char[] cArr) {
            this.f17486OooO00o = r2;
            this.f17487OooO00o = cipher;
            this.f17488OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        public LIiI11 OooO00o() {
            return iIILIL.this.OooO00o(this.f17486OooO00o.OooO00o()) ? new LIiI11(this.f17486OooO00o, iIILIL.OooO00o(this.f17488OooO00o)) : new LIiI11(this.f17486OooO00o, iIILIL.OooO0O0(this.f17488OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m16941OooO00o() {
            return this.f17486OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL
        public OutputStream OooO00o(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, this.f17487OooO00o);
        }
    }

    public iIILIL(LlLI1 llLI1) {
        this.f17484OooO00o = new ILLli();
        this.f17480OooO00o = C9702liIIL.OooO00o;
        this.OooO00o = 1024;
        this.f17483OooO00o = new C6140iIil.OooO0O0();
        this.f17482OooO00o = null;
        if (OooO00o(llLI1)) {
            this.f17481OooO00o = llLI1;
        } else {
            this.f17481OooO00o = AbstractC5711LiLli.OoooOOo;
        }
        this.OooO0O0 = llLI1;
    }

    public iIILIL(AbstractC5873LiliL1 r2, LlLI1 llLI1) {
        this.f17484OooO00o = new ILLli();
        this.f17480OooO00o = C9702liIIL.OooO00o;
        this.OooO00o = 1024;
        this.f17483OooO00o = new C6140iIil.OooO0O0();
        this.f17481OooO00o = AbstractC5711LiLli.OoooOOo;
        this.f17482OooO00o = r2;
        this.OooO0O0 = llLI1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean OooO00o(LlLI1 llLI1) {
        return llLI1.OooO00o(AbstractC5711LiLli.o000o0O) || llLI1.OooO00o(AbstractC5701Li1l.OooO) || llLI1.OooO00o(AbstractC5701Li1l.OooOO0O);
    }

    public static byte[] OooO00o(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((cArr.length + 1) * 2)];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) (cArr[i] >>> '\b');
            bArr[i2 + 1] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] OooO0O0(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5650LIL m16940OooO00o(char[] cArr) throws OperatorCreationException {
        Cipher cipher;
        C6456l1ilL r1;
        if (this.f17485OooO00o == null) {
            this.f17485OooO00o = new SecureRandom();
        }
        try {
            if (OooO00o(this.f17481OooO00o)) {
                byte[] bArr = new byte[20];
                this.f17485OooO00o.nextBytes(bArr);
                cipher = this.f17484OooO00o.m17224OooO00o(this.f17481OooO00o.m16387OooO0O0());
                cipher.init(1, new PKCS12KeyWithParameters(cArr, bArr, this.OooO00o));
                r1 = new C6456l1ilL(this.f17481OooO00o, new C6263iiiL(bArr, this.OooO00o));
            } else if (this.f17481OooO00o.equals(AbstractC5711LiLli.OoooOOo)) {
                AbstractC5873LiliL1 OooO00o2 = this.f17482OooO00o == null ? this.f17483OooO00o.OooO00o() : this.f17482OooO00o;
                if (AbstractC5702Li111.Oooo0o0.equals(OooO00o2.OooO00o())) {
                    C6030i1i11 i1i11 = (C6030i1i11) OooO00o2;
                    byte[] bArr2 = new byte[i1i11.OooO0Oo()];
                    this.f17485OooO00o.nextBytes(bArr2);
                    C5789LlLL llLL = new C5789LlLL(bArr2, i1i11.OooO0O0(), i1i11.OooO00o(), i1i11.OooO0OO());
                    SecretKey generateSecret = this.f17484OooO00o.m17228OooO00o("SCRYPT").generateSecret(new lLlllI(cArr, bArr2, i1i11.OooO0O0(), i1i11.OooO00o(), i1i11.OooO0OO(), this.f17480OooO00o.OooO00o(new C6456l1ilL(this.OooO0O0))));
                    Cipher OooO00o3 = this.f17484OooO00o.m17224OooO00o(this.OooO0O0.m16387OooO0O0());
                    OooO00o3.init(1, generateSecret, this.f17485OooO00o);
                    r1 = new C6456l1ilL(this.f17481OooO00o, new C9545LI(new Il1iLLi(AbstractC5702Li111.Oooo0o0, llLL), new C6579lLL(this.OooO0O0, AbstractC6122iIlLiL.OooO00o(OooO00o3.getParameters().getEncoded()))));
                    cipher = OooO00o3;
                } else {
                    C6140iIil r0 = (C6140iIil) OooO00o2;
                    byte[] bArr3 = new byte[r0.OooO0O0()];
                    this.f17485OooO00o.nextBytes(bArr3);
                    SecretKey generateSecret2 = this.f17484OooO00o.m17228OooO00o(C5453IlLiI.OooO00o(r0.m17042OooO00o().OooO00o())).generateSecret(new PBEKeySpec(cArr, bArr3, r0.OooO00o(), this.f17480OooO00o.OooO00o(new C6456l1ilL(this.OooO0O0))));
                    Cipher OooO00o4 = this.f17484OooO00o.m17224OooO00o(this.OooO0O0.m16387OooO0O0());
                    OooO00o4.init(1, generateSecret2, this.f17485OooO00o);
                    r1 = new C6456l1ilL(this.f17481OooO00o, new C9545LI(new Il1iLLi(AbstractC5711LiLli.OoooOo0, new C5772LlIII(bArr3, r0.OooO00o(), r0.m17042OooO00o())), new C6579lLL(this.OooO0O0, AbstractC6122iIlLiL.OooO00o(OooO00o4.getParameters().getEncoded()))));
                    cipher = OooO00o4;
                }
            } else {
                throw new OperatorCreationException("unrecognised algorithm");
            }
            return new OooO00o(r1, cipher, cArr);
        } catch (Exception e) {
            throw new OperatorCreationException("unable to create OutputEncryptor: " + e.getMessage(), e);
        }
    }

    public iIILIL OooO00o(int i) {
        if (this.f17482OooO00o == null) {
            this.OooO00o = i;
            this.f17483OooO00o.OooO00o(i);
            return this;
        }
        throw new IllegalStateException("set iteration count using PBKDFDef");
    }

    public iIILIL OooO00o(Illiiil r1) {
        this.f17480OooO00o = r1;
        return this;
    }

    public iIILIL OooO00o(C6456l1ilL r2) {
        if (this.f17482OooO00o == null) {
            this.f17483OooO00o.OooO00o(r2);
            return this;
        }
        throw new IllegalStateException("set PRF count using PBKDFDef");
    }

    public iIILIL OooO00o(String str) {
        this.f17484OooO00o = new C9588iIi(str);
        return this;
    }

    public iIILIL OooO00o(Provider provider) {
        this.f17484OooO00o = new LLIlii(provider);
        return this;
    }

    public iIILIL OooO00o(SecureRandom secureRandom) {
        this.f17485OooO00o = secureRandom;
        return this;
    }
}
