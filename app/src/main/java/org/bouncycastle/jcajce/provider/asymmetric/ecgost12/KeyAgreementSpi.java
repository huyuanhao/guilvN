package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.p118pd.sdk.AbstractC5549Ii1;
import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6427ii;
import com.p118pd.sdk.C5179I1iLL;
import com.p118pd.sdk.C5600L1iLL;
import com.p118pd.sdk.C6213iL11I;
import com.p118pd.sdk.C6350illI1i;
import com.p118pd.sdk.C6403ii;
import com.p118pd.sdk.C6512lIilLl;
import com.p118pd.sdk.C6760llIiL;
import com.p118pd.sdk.C6849lLLIllI;
import com.p118pd.sdk.ILilILi;
import com.p118pd.sdk.IlllII1;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;

public class KeyAgreementSpi extends AbstractC5549Ii1 {
    public static final C6849lLLIllI OooO00o = new C6849lLLIllI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5179I1iLL f23932OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5600L1iLL f23933OooO00o;
    public String OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23934OooO0O0;

    public static class OooO00o extends KeyAgreementSpi {
        public OooO00o() {
            super("ECGOST3410-2012-256", new C5179I1iLL(new C6760llIiL()), null);
        }
    }

    public static class OooO0O0 extends KeyAgreementSpi {
        public OooO0O0() {
            super("ECGOST3410-2012-512", new C5179I1iLL(new ILilILi()), null);
        }
    }

    public KeyAgreementSpi(String str, C5179I1iLL r2, AbstractC6427ii r3) {
        super(str, r3);
        this.OooO0O0 = str;
        this.f23932OooO00o = r2;
    }

    public static C6213iL11I OooO00o(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECGOST3410_2012PublicKey ? ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters() : IlllII1.OooO00o(publicKey);
    }

    public static String OooO00o(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void OooO00o(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        if (key instanceof PrivateKey) {
            C6512lIilLl r3 = (C6512lIilLl) IlllII1.OooO00o((PrivateKey) key);
            this.f23933OooO00o = r3.OooO00o();
            byte[] OooO00o2 = algorithmParameterSpec instanceof C6350illI1i ? ((C6350illI1i) algorithmParameterSpec).OooO00o() : null;
            ((AbstractC5549Ii1) this).f16063OooO00o = OooO00o2;
            this.f23932OooO00o.OooO00o((AbstractC6370iIIIl) new C6403ii(r3, OooO00o2));
            return;
        }
        throw new InvalidKeyException(this.OooO0O0 + " key agreement requires " + OooO00o(ECPrivateKey.class) + " for initialisation");
    }

    @Override // com.p118pd.sdk.AbstractC5549Ii1
    public byte[] OooO00o() {
        return this.f23934OooO0O0;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.f23933OooO00o == null) {
            throw new IllegalStateException(this.OooO0O0 + " not initialised.");
        } else if (!z) {
            throw new IllegalStateException(this.OooO0O0 + " can only be between two parties.");
        } else if (key instanceof PublicKey) {
            try {
                this.f23934OooO0O0 = this.f23932OooO00o.m15295OooO00o((AbstractC6370iIIIl) OooO00o((PublicKey) key));
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException("calculation failed: " + e.getMessage()) {
                    /* class org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.C48381 */

                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            throw new InvalidKeyException(this.OooO0O0 + " key agreement requires " + OooO00o(ECPublicKey.class) + " for doPhase");
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        OooO00o(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof C6350illI1i)) {
            OooO00o(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
