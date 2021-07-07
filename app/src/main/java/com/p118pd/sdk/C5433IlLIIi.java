package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.p290dh.BCDHPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.p290dh.BCDHPublicKey;

/* renamed from: com.pd.sdk.IlLIIi  reason: case insensitive filesystem */
public class C5433IlLIIi extends AbstractC5549Ii1 {
    public static final BigInteger OooO0Oo = BigInteger.valueOf(1);
    public static final BigInteger OooO0o0 = BigInteger.valueOf(2);
    public final C5343Ii1ll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5649LIlI f15835OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Iil1il1 f15836OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IilLi1 f15837OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15838OooO00o;
    public BigInteger OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15839OooO0O0;
    public BigInteger OooO0OO;

    /* renamed from: com.pd.sdk.IlLIIi$OooO */
    public static class OooO extends C5433IlLIIi {
        public OooO() {
            super("DHUwithSHA512CKDF", new C5343Ii1ll(), new I1L(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO00o */
    public static class OooO00o extends C5433IlLIIi {
        public OooO00o() {
            super("DHUwithSHA1CKDF", new C5343Ii1ll(), new I1L(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0O0 */
    public static class OooO0O0 extends C5433IlLIIi {
        public OooO0O0() {
            super("DHUwithSHA1KDF", new C5343Ii1ll(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0OO */
    public static class OooO0OO extends C5433IlLIIi {
        public OooO0OO() {
            super("DHUwithSHA224CKDF", new C5343Ii1ll(), new I1L(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0Oo  reason: case insensitive filesystem */
    public static class C5434OooO0Oo extends C5433IlLIIi {
        public C5434OooO0Oo() {
            super("DHUwithSHA224KDF", new C5343Ii1ll(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0o */
    public static class OooO0o extends C5433IlLIIi {
        public OooO0o() {
            super("DHUwithSHA256KDF", new C5343Ii1ll(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0o0  reason: case insensitive filesystem */
    public static class C5435OooO0o0 extends C5433IlLIIi {
        public C5435OooO0o0() {
            super("DHUwithSHA256CKDF", new C5343Ii1ll(), new I1L(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0oO  reason: case insensitive filesystem */
    public static class C5436OooO0oO extends C5433IlLIIi {
        public C5436OooO0oO() {
            super("DHUwithSHA384CKDF", new C5343Ii1ll(), new I1L(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooO0oo  reason: case insensitive filesystem */
    public static class C5437OooO0oo extends C5433IlLIIi {
        public C5437OooO0oo() {
            super("DHUwithSHA384KDF", new C5343Ii1ll(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOO0 */
    public static class OooOO0 extends C5433IlLIIi {
        public OooOO0() {
            super("DHUwithSHA512KDF", new C5343Ii1ll(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOO0O */
    public static class OooOO0O extends C5433IlLIIi {
        public OooOO0O() {
            super("DHwithRFC2631KDF", new C5386Iil11(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOO0o  reason: case insensitive filesystem */
    public static class C5438OooOO0o extends C5433IlLIIi {
        public C5438OooOO0o() {
            super("DHwithSHA1CKDF", new I1L(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOO */
    public static class OooOOO extends C5433IlLIIi {
        public OooOOO() {
            super("DHwithSHA224CKDF", new I1L(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOO0 */
    public static class OooOOO0 extends C5433IlLIIi {
        public OooOOO0() {
            super("DHwithSHA1CKDF", new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOOO */
    public static class OooOOOO extends C5433IlLIIi {
        public OooOOOO() {
            super("DHwithSHA224CKDF", new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOOo  reason: case insensitive filesystem */
    public static class C5439OooOOOo extends C5433IlLIIi {
        public C5439OooOOOo() {
            super("DHwithSHA256CKDF", new I1L(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOo  reason: case insensitive filesystem */
    public static class C5440OooOOo extends C5433IlLIIi {
        public C5440OooOOo() {
            super("DHwithSHA384CKDF", new I1L(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOo0  reason: case insensitive filesystem */
    public static class C5441OooOOo0 extends C5433IlLIIi {
        public C5441OooOOo0() {
            super("DHwithSHA256CKDF", new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOOoo  reason: case insensitive filesystem */
    public static class C5442OooOOoo extends C5433IlLIIi {
        public C5442OooOOoo() {
            super("DHwithSHA384KDF", new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOo */
    public static class OooOo extends C5433IlLIIi {
        public OooOo() {
            super("MQVwithSHA224CKDF", new LLLL(), new I1L(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOo0  reason: case insensitive filesystem */
    public static class C5443OooOo0 extends C5433IlLIIi {
        public C5443OooOo0() {
            super("DHwithSHA512KDF", new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOo00 */
    public static class OooOo00 extends C5433IlLIIi {
        public OooOo00() {
            super("DHwithSHA512CKDF", new I1L(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOo0O  reason: case insensitive filesystem */
    public static class C5444OooOo0O extends C5433IlLIIi {
        public C5444OooOo0O() {
            super("MQVwithSHA1CKDF", new LLLL(), new I1L(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOo0o  reason: case insensitive filesystem */
    public static class C5445OooOo0o extends C5433IlLIIi {
        public C5445OooOo0o() {
            super("MQVwithSHA1KDF", new LLLL(), new iIl1lIl(C5427IlI1.OooO0O0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOoO  reason: case insensitive filesystem */
    public static class C5446OooOoO extends C5433IlLIIi {
        public C5446OooOoO() {
            super("MQVwithSHA256CKDF", new LLLL(), new I1L(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOoO0  reason: case insensitive filesystem */
    public static class C5447OooOoO0 extends C5433IlLIIi {
        public C5447OooOoO0() {
            super("MQVwithSHA224KDF", new LLLL(), new iIl1lIl(C5427IlI1.OooO0OO()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOoOO  reason: case insensitive filesystem */
    public static class C5448OooOoOO extends C5433IlLIIi {
        public C5448OooOoOO() {
            super("MQVwithSHA256KDF", new LLLL(), new iIl1lIl(C5427IlI1.OooO0Oo()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOoo  reason: case insensitive filesystem */
    public static class C5449OooOoo extends C5433IlLIIi {
        public C5449OooOoo() {
            super("MQVwithSHA384KDF", new LLLL(), new iIl1lIl(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOoo0  reason: case insensitive filesystem */
    public static class C5450OooOoo0 extends C5433IlLIIi {
        public C5450OooOoo0() {
            super("MQVwithSHA384CKDF", new LLLL(), new I1L(C5427IlI1.OooO0o0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOooO  reason: case insensitive filesystem */
    public static class C5451OooOooO extends C5433IlLIIi {
        public C5451OooOooO() {
            super("MQVwithSHA512CKDF", new LLLL(), new I1L(C5427IlI1.OooOO0()));
        }
    }

    /* renamed from: com.pd.sdk.IlLIIi$OooOooo  reason: case insensitive filesystem */
    public static class C5452OooOooo extends C5433IlLIIi {
        public C5452OooOooo() {
            super("MQVwithSHA512KDF", new LLLL(), new iIl1lIl(C5427IlI1.OooOO0()));
        }
    }

    public C5433IlLIIi() {
        this("Diffie-Hellman", null);
    }

    public C5433IlLIIi(String str, C5343Ii1ll r2, AbstractC6427ii r3) {
        super(str, r3);
        this.OooO00o = r2;
        this.f15835OooO00o = null;
    }

    public C5433IlLIIi(String str, AbstractC5649LIlI r2, AbstractC6427ii r3) {
        super(str, r3);
        this.OooO00o = null;
        this.f15835OooO00o = r2;
    }

    public C5433IlLIIi(String str, AbstractC6427ii r2) {
        super(str, r2);
        this.OooO00o = null;
        this.f15835OooO00o = null;
    }

    private LiIiLii OooO00o(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("public key not a DHPublicKey");
        } else if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params = dHPublicKey.getParams();
            return params instanceof C5194I1 ? new LiIiLii(dHPublicKey.getY(), ((C5194I1) params).m15342OooO00o()) : new LiIiLii(dHPublicKey.getY(), new C6017i1Il(params.getP(), params.getG(), null, params.getL()));
        }
    }

    private C6389ii OooO00o(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("private key not a DHPrivateKey");
        } else if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).engineGetKeyParameters();
        } else {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            return new C6389ii(dHPrivateKey.getX(), new C6017i1Il(params.getP(), params.getG(), null, params.getL()));
        }
    }

    @Override // com.p118pd.sdk.AbstractC5549Ii1
    public byte[] OooO00o() {
        return this.f15839OooO0O0;
    }

    public byte[] OooO00o(BigInteger bigInteger) {
        int bitLength = (this.OooO0O0.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.f15838OooO00o == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        } else if (key instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            if (!dHPublicKey.getParams().getG().equals(this.OooO0OO) || !dHPublicKey.getParams().getP().equals(this.OooO0O0)) {
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            }
            BigInteger y = dHPublicKey.getY();
            if (y == null || y.compareTo(OooO0o0) < 0 || y.compareTo(this.OooO0O0.subtract(OooO0Oo)) >= 0) {
                throw new InvalidKeyException("Invalid DH PublicKey");
            } else if (this.OooO00o != null) {
                if (z) {
                    this.f15839OooO0O0 = this.OooO00o.m15560OooO00o((AbstractC6370iIIIl) new C6255iiL1(OooO00o((PublicKey) key), OooO00o(this.f15836OooO00o.OooO0O0())));
                    return null;
                }
                throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
            } else if (this.f15835OooO00o == null) {
                BigInteger modPow = y.modPow(this.f15838OooO00o, this.OooO0O0);
                if (modPow.compareTo(OooO0Oo) != 0) {
                    this.f15839OooO0O0 = OooO00o(modPow);
                    if (z) {
                        return null;
                    }
                    return new BCDHPublicKey(modPow, dHPublicKey.getParams());
                }
                throw new InvalidKeyException("Shared key can't be 1");
            } else if (z) {
                this.f15839OooO0O0 = OooO00o(this.f15835OooO00o.OooO00o((AbstractC6370iIIIl) new C6110iIiLii(OooO00o((PublicKey) key), OooO00o(this.f15837OooO00o.OooO0O0()))));
                return null;
            } else {
                throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
            }
        } else {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
    }

    @Override // javax.crypto.KeyAgreementSpi, com.p118pd.sdk.AbstractC5549Ii1
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        if (this.f15838OooO00o != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi, com.p118pd.sdk.AbstractC5549Ii1
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        if (this.f15838OooO00o != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(AbstractC5549Ii1.OooO00o(this.f15839OooO0O0), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi, com.p118pd.sdk.AbstractC5549Ii1
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.f15838OooO00o != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.OooO0O0 = dHPrivateKey.getParams().getP();
            this.OooO0OO = dHPrivateKey.getParams().getG();
            BigInteger x = dHPrivateKey.getX();
            this.f15838OooO00o = x;
            this.f15839OooO0O0 = OooO00o(x);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        i11Liiil i11liiil;
        AbstractC5649LIlI r5;
        C5362Iii1Ii r6;
        C5343Ii1ll r52;
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            if (algorithmParameterSpec == null) {
                this.OooO0O0 = dHPrivateKey.getParams().getP();
                this.OooO0OO = dHPrivateKey.getParams().getG();
            } else if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                this.OooO0O0 = dHParameterSpec.getP();
                this.OooO0OO = dHParameterSpec.getG();
                this.f15836OooO00o = null;
                ((AbstractC5549Ii1) this).f16063OooO00o = null;
            } else if (algorithmParameterSpec instanceof Iil1il1) {
                if (this.OooO00o != null) {
                    this.OooO0O0 = dHPrivateKey.getParams().getP();
                    this.OooO0OO = dHPrivateKey.getParams().getG();
                    Iil1il1 r53 = (Iil1il1) algorithmParameterSpec;
                    this.f15836OooO00o = r53;
                    ((AbstractC5549Ii1) this).f16063OooO00o = r53.m21450OooO00o();
                    if (this.f15836OooO00o.m21449OooO00o() != null) {
                        r52 = this.OooO00o;
                        r6 = new C5362Iii1Ii(OooO00o(dHPrivateKey), OooO00o(this.f15836OooO00o.OooO00o()), OooO00o(this.f15836OooO00o.m21449OooO00o()));
                    } else {
                        r52 = this.OooO00o;
                        r6 = new C5362Iii1Ii(OooO00o(dHPrivateKey), OooO00o(this.f15836OooO00o.OooO00o()));
                    }
                    r52.OooO00o((AbstractC6370iIIIl) r6);
                } else {
                    throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
                }
            } else if (algorithmParameterSpec instanceof IilLi1) {
                if (this.f15835OooO00o != null) {
                    this.OooO0O0 = dHPrivateKey.getParams().getP();
                    this.OooO0OO = dHPrivateKey.getParams().getG();
                    IilLi1 r54 = (IilLi1) algorithmParameterSpec;
                    this.f15837OooO00o = r54;
                    ((AbstractC5549Ii1) this).f16063OooO00o = r54.m21453OooO00o();
                    if (this.f15837OooO00o.m21452OooO00o() != null) {
                        r5 = this.f15835OooO00o;
                        i11liiil = new i11Liiil(OooO00o(dHPrivateKey), OooO00o(this.f15837OooO00o.OooO00o()), OooO00o(this.f15837OooO00o.m21452OooO00o()));
                    } else {
                        r5 = this.f15835OooO00o;
                        i11liiil = new i11Liiil(OooO00o(dHPrivateKey), OooO00o(this.f15837OooO00o.OooO00o()));
                    }
                    r5.m16162OooO00o((AbstractC6370iIIIl) i11liiil);
                } else {
                    throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
                }
            } else if (!(algorithmParameterSpec instanceof C6350illI1i)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            } else if (((AbstractC5549Ii1) this).f16061OooO00o != null) {
                this.OooO0O0 = dHPrivateKey.getParams().getP();
                this.OooO0OO = dHPrivateKey.getParams().getG();
                this.f15836OooO00o = null;
                ((AbstractC5549Ii1) this).f16063OooO00o = ((C6350illI1i) algorithmParameterSpec).OooO00o();
            } else {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            BigInteger x = dHPrivateKey.getX();
            this.f15838OooO00o = x;
            this.f15839OooO0O0 = OooO00o(x);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }
}
