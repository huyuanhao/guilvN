package org.bouncycastle.jcajce.provider.asymmetric.p291ec;

import com.p118pd.sdk.AbstractC5549Ii1;
import com.p118pd.sdk.AbstractC5649LIlI;
import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6427ii;
import com.p118pd.sdk.C5344Ii1I;
import com.p118pd.sdk.C5427IlI1;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C5822L1;
import com.p118pd.sdk.C6118iIl1i;
import com.p118pd.sdk.C6350illI1i;
import com.p118pd.sdk.C6512lIilLl;
import com.p118pd.sdk.C6849lLLIllI;
import com.p118pd.sdk.C9347II;
import com.p118pd.sdk.C9352IIiLIIL;
import com.p118pd.sdk.C9507LiLl1i;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.C9706liLi;
import com.p118pd.sdk.I1L;
import com.p118pd.sdk.ILIIIlI;
import com.p118pd.sdk.Ii1IiL;
import com.p118pd.sdk.Iil1il1;
import com.p118pd.sdk.IilLi1;
import com.p118pd.sdk.IlllII1;
import com.p118pd.sdk.LL1ii1l;
import com.p118pd.sdk.iIl1lIl;
import com.p118pd.sdk.l1iIiiL;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;
import org.bouncycastle.jce.interfaces.MQVPublicKey;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi */
public class KeyAgreementSpi extends AbstractC5549Ii1 {
    public static final C6849lLLIllI OooO00o = new C6849lLLIllI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5600L1iLL f23912OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Iil1il1 f23913OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IilLi1 f23914OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f23915OooO00o;
    public String OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23916OooO0O0;

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO */
    public static class OooO extends KeyAgreementSpi {
        public OooO() {
            super("ECCDHUwithSHA1CKDF", new C6118iIl1i(), new I1L(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO00o */
    public static class OooO00o extends KeyAgreementSpi {
        public OooO00o() {
            super("ECCDHwithSHA1KDF", new C9352IIiLIIL(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0O0 */
    public static class OooO0O0 extends KeyAgreementSpi {
        public OooO0O0() {
            super("ECCDHwithSHA224KDF", new C9352IIiLIIL(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0OO */
    public static class OooO0OO extends KeyAgreementSpi {
        public OooO0OO() {
            super("ECCDHwithSHA256KDF", new C9352IIiLIIL(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0Oo  reason: case insensitive filesystem */
    public static class C9913OooO0Oo extends KeyAgreementSpi {
        public C9913OooO0Oo() {
            super("ECCDHwithSHA384KDF", new C9352IIiLIIL(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0o */
    public static class OooO0o extends KeyAgreementSpi {
        public OooO0o() {
            super("ECDH", new C5822L1(), (AbstractC6427ii) null);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0o0  reason: case insensitive filesystem */
    public static class C9914OooO0o0 extends KeyAgreementSpi {
        public C9914OooO0o0() {
            super("ECCDHwithSHA512KDF", new C9352IIiLIIL(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0oO  reason: case insensitive filesystem */
    public static class C9915OooO0oO extends KeyAgreementSpi {
        public C9915OooO0oO() {
            super("ECDHC", new C9352IIiLIIL(), (AbstractC6427ii) null);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooO0oo  reason: case insensitive filesystem */
    public static class C9916OooO0oo extends KeyAgreementSpi {
        public C9916OooO0oo() {
            super("ECCDHU", new C6118iIl1i(), (AbstractC6427ii) null);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOO0 */
    public static class OooOO0 extends KeyAgreementSpi {
        public OooOO0() {
            super("ECCDHUwithSHA1KDF", new C6118iIl1i(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOO0O */
    public static class OooOO0O extends KeyAgreementSpi {
        public OooOO0O() {
            super("ECCDHUwithSHA224CKDF", new C6118iIl1i(), new I1L(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOO0o  reason: case insensitive filesystem */
    public static class C9917OooOO0o extends KeyAgreementSpi {
        public C9917OooOO0o() {
            super("ECCDHUwithSHA224KDF", new C6118iIl1i(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOO */
    public static class OooOOO extends KeyAgreementSpi {
        public OooOOO() {
            super("ECCDHUwithSHA256KDF", new C6118iIl1i(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOO0 */
    public static class OooOOO0 extends KeyAgreementSpi {
        public OooOOO0() {
            super("ECCDHUwithSHA256CKDF", new C6118iIl1i(), new I1L(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOOO */
    public static class OooOOOO extends KeyAgreementSpi {
        public OooOOOO() {
            super("ECCDHUwithSHA384CKDF", new C6118iIl1i(), new I1L(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOOo  reason: case insensitive filesystem */
    public static class C9918OooOOOo extends KeyAgreementSpi {
        public C9918OooOOOo() {
            super("ECCDHUwithSHA384KDF", new C6118iIl1i(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOo  reason: case insensitive filesystem */
    public static class C9919OooOOo extends KeyAgreementSpi {
        public C9919OooOOo() {
            super("ECCDHUwithSHA512KDF", new C6118iIl1i(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOo0  reason: case insensitive filesystem */
    public static class C9920OooOOo0 extends KeyAgreementSpi {
        public C9920OooOOo0() {
            super("ECCDHUwithSHA512CKDF", new C6118iIl1i(), new I1L(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOOoo  reason: case insensitive filesystem */
    public static class C9921OooOOoo extends KeyAgreementSpi {
        public C9921OooOOoo() {
            super("ECDHwithSHA1CKDF", new C9352IIiLIIL(), new I1L(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOo */
    public static class OooOo extends KeyAgreementSpi {
        public OooOo() {
            super("ECDHwithSHA256KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOo0  reason: case insensitive filesystem */
    public static class C9922OooOo0 extends KeyAgreementSpi {
        public C9922OooOo0() {
            super("ECDHwithSHA1KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOo00 */
    public static class OooOo00 extends KeyAgreementSpi {
        public OooOo00() {
            super("ECDHwithSHA1KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOo0O  reason: case insensitive filesystem */
    public static class C9923OooOo0O extends KeyAgreementSpi {
        public C9923OooOo0O() {
            super("ECDHwithSHA224KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOo0o  reason: case insensitive filesystem */
    public static class C9924OooOo0o extends KeyAgreementSpi {
        public C9924OooOo0o() {
            super("ECDHwithSHA256CKDF", new C9352IIiLIIL(), new I1L(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOoO  reason: case insensitive filesystem */
    public static class C9925OooOoO extends KeyAgreementSpi {
        public C9925OooOoO() {
            super("ECDHwithSHA384KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOoO0  reason: case insensitive filesystem */
    public static class C9926OooOoO0 extends KeyAgreementSpi {
        public C9926OooOoO0() {
            super("ECDHwithSHA384CKDF", new C9352IIiLIIL(), new I1L(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOoOO  reason: case insensitive filesystem */
    public static class C9927OooOoOO extends KeyAgreementSpi {
        public C9927OooOoOO() {
            super("ECDHwithSHA512CKDF", new C9352IIiLIIL(), new I1L(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOoo  reason: case insensitive filesystem */
    public static class C9928OooOoo extends KeyAgreementSpi {
        public C9928OooOoo() {
            super("ECKAEGwithRIPEMD160KDF", new C5822L1(), new iIl1lIl(new C9706liLi()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOoo0  reason: case insensitive filesystem */
    public static class C9929OooOoo0 extends KeyAgreementSpi {
        public C9929OooOoo0() {
            super("ECDHwithSHA512KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOooO  reason: case insensitive filesystem */
    public static class C9930OooOooO extends KeyAgreementSpi {
        public C9930OooOooO() {
            super("ECKAEGwithSHA1KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OooOooo  reason: case insensitive filesystem */
    public static class C9931OooOooo extends KeyAgreementSpi {
        public C9931OooOooo() {
            super("ECKAEGwithSHA224KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo  reason: case insensitive filesystem */
    public static class C9932Oooo extends KeyAgreementSpi {
        public C9932Oooo() {
            super("ECMQVwithSHA256CKDF", new C9347II(), new I1L(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0 */
    public static class Oooo0 extends KeyAgreementSpi {
        public Oooo0() {
            super("ECMQV", new C9347II(), (AbstractC6427ii) null);
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo000 */
    public static class Oooo000 extends KeyAgreementSpi {
        public Oooo000() {
            super("ECKAEGwithSHA256KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo00O  reason: case insensitive filesystem */
    public static class C9933Oooo00O extends KeyAgreementSpi {
        public C9933Oooo00O() {
            super("ECKAEGwithSHA384KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo00o  reason: case insensitive filesystem */
    public static class C9934Oooo00o extends KeyAgreementSpi {
        public C9934Oooo00o() {
            super("ECKAEGwithSHA512KDF", new C5822L1(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0O0  reason: case insensitive filesystem */
    public static class C9935Oooo0O0 extends KeyAgreementSpi {
        public C9935Oooo0O0() {
            super("ECMQVwithSHA1CKDF", new C9347II(), new I1L(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0OO  reason: case insensitive filesystem */
    public static class C9936Oooo0OO extends KeyAgreementSpi {
        public C9936Oooo0OO() {
            super("ECMQVwithSHA1KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0o  reason: case insensitive filesystem */
    public static class C9937Oooo0o extends KeyAgreementSpi {
        public C9937Oooo0o() {
            super("ECMQVwithSHA224CKDF", new C9347II(), new I1L(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0o0  reason: case insensitive filesystem */
    public static class C9938Oooo0o0 extends KeyAgreementSpi {
        public C9938Oooo0o0() {
            super("ECMQVwithSHA1KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0oO  reason: case insensitive filesystem */
    public static class C9939Oooo0oO extends KeyAgreementSpi {
        public C9939Oooo0oO() {
            super("ECMQVwithSHA224KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$Oooo0oo  reason: case insensitive filesystem */
    public static class C9940Oooo0oo extends KeyAgreementSpi {
        public C9940Oooo0oo() {
            super("ECMQVwithSHA224KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooO  reason: case insensitive filesystem */
    public static class C9941OoooO extends KeyAgreementSpi {
        public C9941OoooO() {
            super("ECMQVwithSHA384KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooO0  reason: case insensitive filesystem */
    public static class C9942OoooO0 extends KeyAgreementSpi {
        public C9942OoooO0() {
            super("ECMQVwithSHA256KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooO00  reason: case insensitive filesystem */
    public static class C9943OoooO00 extends KeyAgreementSpi {
        public C9943OoooO00() {
            super("ECMQVwithSHA256KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooO0O  reason: case insensitive filesystem */
    public static class C9944OoooO0O extends KeyAgreementSpi {
        public C9944OoooO0O() {
            super("ECMQVwithSHA384CKDF", new C9347II(), new I1L(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooOO0  reason: case insensitive filesystem */
    public static class C9945OoooOO0 extends KeyAgreementSpi {
        public C9945OoooOO0() {
            super("ECMQVwithSHA384KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooOOO  reason: case insensitive filesystem */
    public static class C9946OoooOOO extends KeyAgreementSpi {
        public C9946OoooOOO() {
            super("ECMQVwithSHA512KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$OoooOOo  reason: case insensitive filesystem */
    public static class C9947OoooOOo extends KeyAgreementSpi {
        public C9947OoooOOo() {
            super("ECMQVwithSHA512KDF", new C9347II(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$o000oOoO */
    public static class o000oOoO extends KeyAgreementSpi {
        public o000oOoO() {
            super("ECMQVwithSHA512CKDF", new C9347II(), new I1L(C5427IlI1.OooOO0()));
        }
    }

    public KeyAgreementSpi(String str, AbstractC5649LIlI r2, AbstractC6427ii r3) {
        super(str, r3);
        this.OooO0O0 = str;
        this.f23915OooO00o = r2;
    }

    public KeyAgreementSpi(String str, C6118iIl1i iil1i, AbstractC6427ii r3) {
        super(str, r3);
        this.OooO0O0 = str;
        this.f23915OooO00o = iil1i;
    }

    public static String OooO00o(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void OooO00o(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6512lIilLl r7;
        C6512lIilLl r0;
        Object obj = this.f23915OooO00o;
        byte[] bArr = null;
        r4 = null;
        LL1ii1l r4 = null;
        LL1ii1l r42 = null;
        if (obj instanceof C9347II) {
            this.f23914OooO00o = null;
            boolean z = key instanceof MQVPrivateKey;
            if (z || (algorithmParameterSpec instanceof IilLi1)) {
                if (z) {
                    MQVPrivateKey mQVPrivateKey = (MQVPrivateKey) key;
                    r7 = (C6512lIilLl) IlllII1.OooO00o(mQVPrivateKey.getStaticPrivateKey());
                    r0 = (C6512lIilLl) IlllII1.OooO00o(mQVPrivateKey.getEphemeralPrivateKey());
                    if (mQVPrivateKey.getEphemeralPublicKey() != null) {
                        r4 = (LL1ii1l) ILIIIlI.OooO00o(mQVPrivateKey.getEphemeralPublicKey());
                    }
                } else {
                    IilLi1 r72 = (IilLi1) algorithmParameterSpec;
                    C6512lIilLl r6 = (C6512lIilLl) IlllII1.OooO00o((PrivateKey) key);
                    r0 = (C6512lIilLl) IlllII1.OooO00o(r72.OooO00o());
                    if (r72.m21452OooO00o() != null) {
                        r4 = (LL1ii1l) ILIIIlI.OooO00o(r72.m21452OooO00o());
                    }
                    this.f23914OooO00o = r72;
                    ((AbstractC5549Ii1) this).f16063OooO00o = r72.m21453OooO00o();
                    r7 = r6;
                }
                C9507LiLl1i r62 = new C9507LiLl1i(r7, r0, r4);
                this.f23912OooO00o = r7.OooO00o();
                ((C9347II) this.f23915OooO00o).m21389OooO00o((AbstractC6370iIIIl) r62);
                return;
            }
            throw new InvalidAlgorithmParameterException(this.OooO0O0 + " key agreement requires " + OooO00o(IilLi1.class) + " for initialisation");
        } else if (algorithmParameterSpec instanceof Iil1il1) {
            if (obj instanceof C6118iIl1i) {
                Iil1il1 r73 = (Iil1il1) algorithmParameterSpec;
                C6512lIilLl r63 = (C6512lIilLl) IlllII1.OooO00o((PrivateKey) key);
                C6512lIilLl r02 = (C6512lIilLl) IlllII1.OooO00o(r73.OooO00o());
                if (r73.m21449OooO00o() != null) {
                    r42 = (LL1ii1l) ILIIIlI.OooO00o(r73.m21449OooO00o());
                }
                this.f23913OooO00o = r73;
                ((AbstractC5549Ii1) this).f16063OooO00o = r73.m21450OooO00o();
                l1iIiiL l1iiiil = new l1iIiiL(r63, r02, r42);
                this.f23912OooO00o = r63.OooO00o();
                ((C6118iIl1i) this.f23915OooO00o).OooO00o((AbstractC6370iIIIl) l1iiiil);
                return;
            }
            throw new InvalidAlgorithmParameterException(this.OooO0O0 + " key agreement cannot be used with " + OooO00o(Iil1il1.class));
        } else if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException(this.OooO0O0 + " key agreement requires " + OooO00o(ECPrivateKey.class) + " for initialisation");
        } else if (((AbstractC5549Ii1) this).f16061OooO00o != null || !(algorithmParameterSpec instanceof C6350illI1i)) {
            C6512lIilLl r64 = (C6512lIilLl) IlllII1.OooO00o((PrivateKey) key);
            this.f23912OooO00o = r64.OooO00o();
            if (algorithmParameterSpec instanceof C6350illI1i) {
                bArr = ((C6350illI1i) algorithmParameterSpec).OooO00o();
            }
            ((AbstractC5549Ii1) this).f16063OooO00o = bArr;
            ((AbstractC5649LIlI) this.f23915OooO00o).m16162OooO00o((AbstractC6370iIIIl) r64);
        } else {
            throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5549Ii1
    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23916OooO0O0);
    }

    public byte[] OooO00o(BigInteger bigInteger) {
        C6849lLLIllI r0 = OooO00o;
        return r0.OooO00o(bigInteger, r0.OooO00o(this.f23912OooO00o.OooO00o()));
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        AbstractC6370iIIIl r0;
        if (this.f23912OooO00o == null) {
            throw new IllegalStateException(this.OooO0O0 + " not initialised.");
        } else if (z) {
            Object obj = this.f23915OooO00o;
            if (obj instanceof C9347II) {
                if (!(key instanceof MQVPublicKey)) {
                    r0 = new C5344Ii1I((LL1ii1l) ILIIIlI.OooO00o((PublicKey) key), (LL1ii1l) ILIIIlI.OooO00o(this.f23914OooO00o.OooO0O0()));
                } else {
                    MQVPublicKey mQVPublicKey = (MQVPublicKey) key;
                    r0 = new C5344Ii1I((LL1ii1l) ILIIIlI.OooO00o(mQVPublicKey.getStaticKey()), (LL1ii1l) ILIIIlI.OooO00o(mQVPublicKey.getEphemeralKey()));
                }
            } else if (obj instanceof C6118iIl1i) {
                r0 = new Ii1IiL((LL1ii1l) ILIIIlI.OooO00o((PublicKey) key), (LL1ii1l) ILIIIlI.OooO00o(this.f23913OooO00o.OooO0O0()));
            } else if (key instanceof PublicKey) {
                r0 = ILIIIlI.OooO00o((PublicKey) key);
            } else {
                throw new InvalidKeyException(this.OooO0O0 + " key agreement requires " + OooO00o(ECPublicKey.class) + " for doPhase");
            }
            try {
                if (this.f23915OooO00o instanceof AbstractC5649LIlI) {
                    this.f23916OooO0O0 = OooO00o(((AbstractC5649LIlI) this.f23915OooO00o).OooO00o(r0));
                    return null;
                }
                this.f23916OooO0O0 = ((C6118iIl1i) this.f23915OooO00o).m17012OooO00o(r0);
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException("calculation failed: " + e.getMessage()) {
                    /* class org.bouncycastle.jcajce.provider.asymmetric.p291ec.KeyAgreementSpi.C48361 */

                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            throw new IllegalStateException(this.OooO0O0 + " can only be between two parties.");
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            OooO00o(key, null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof IilLi1) || (algorithmParameterSpec instanceof C6350illI1i) || (algorithmParameterSpec instanceof Iil1il1)) {
            OooO00o(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
