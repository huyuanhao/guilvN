package com.p118pd.sdk;

import com.facebook.react.modules.netinfo.NetInfoModule;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.lilLIL  reason: case insensitive filesystem */
public class C6699lilLIL extends BaseCipherSpi {
    public Ii1IliL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameterSpec f18638OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BaseCipherSpi.OooO00o f18639OooO00o = new BaseCipherSpi.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18640OooO00o = false;
    public final ii1I11l OooO0O0 = new C6640li1lI();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AlgorithmParameters f18641OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18642OooO0O0 = false;

    /* renamed from: com.pd.sdk.lilLIL$OooO00o */
    public static class OooO00o extends C6699lilLIL {
        public OooO00o() {
            super(new C5693LL(new C6114iIiI()));
        }
    }

    /* renamed from: com.pd.sdk.lilLIL$OooO0O0 */
    public static class OooO0O0 extends C6699lilLIL {
        public OooO0O0() {
            super(new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.lilLIL$OooO0OO */
    public static class OooO0OO extends C6699lilLIL {
        public OooO0OO() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    /* renamed from: com.pd.sdk.lilLIL$OooO0Oo  reason: case insensitive filesystem */
    public static class C6700OooO0Oo extends C6699lilLIL {
        public C6700OooO0Oo() {
            super(new iLlilLI(new C6114iIiI()));
        }
    }

    /* renamed from: com.pd.sdk.lilLIL$OooO0o */
    public static class OooO0o extends C6699lilLIL {
        public OooO0o() {
            super(true, false, new iLlilLI(new C6114iIiI()));
        }
    }

    /* renamed from: com.pd.sdk.lilLIL$OooO0o0  reason: case insensitive filesystem */
    public static class C6701OooO0o0 extends C6699lilLIL {
        public C6701OooO0o0() {
            super(false, true, new iLlilLI(new C6114iIiI()));
        }
    }

    public C6699lilLIL(Ii1IliL r2) {
        this.OooO00o = r2;
    }

    public C6699lilLIL(OAEPParameterSpec oAEPParameterSpec) {
        try {
            OooO00o(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public C6699lilLIL(boolean z, boolean z2, Ii1IliL r4) {
        this.f18640OooO00o = z;
        this.f18642OooO0O0 = z2;
        this.OooO00o = r4;
    }

    private void OooO00o(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        AbstractC6436l11LI OooO00o2 = C9487LL1i.m21539OooO00o(mGF1ParameterSpec.getDigestAlgorithm());
        if (OooO00o2 != null) {
            this.OooO00o = new L1i1LiI(new C6114iIiI(), OooO00o2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.f18638OooO00o = oAEPParameterSpec;
            return;
        }
        throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
    }

    private byte[] OooO00o() throws BadPaddingException {
        try {
            byte[] OooO00o2 = this.OooO00o.OooO00o(this.f18639OooO00o.OooO0O0(), 0, this.f18639OooO00o.size());
            this.f18639OooO00o.OooO00o();
            return OooO00o2;
        } catch (InvalidCipherTextException e) {
            throw new BadBlockException("unable to decrypt block", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new BadBlockException("unable to decrypt block", e2);
        } catch (Throwable th) {
            this.f18639OooO00o.OooO00o();
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (bArr != null) {
                this.f18639OooO00o.write(bArr, i, i2);
            }
            if (this.OooO00o instanceof C6114iIiI) {
                if (this.f18639OooO00o.size() > this.OooO00o.OooO00o() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
                }
            } else if (this.f18639OooO00o.size() > this.OooO00o.OooO00o()) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            byte[] OooO00o2 = OooO00o();
            for (int i4 = 0; i4 != OooO00o2.length; i4++) {
                bArr2[i3 + i4] = OooO00o2[i4];
            }
            return OooO00o2.length;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            this.f18639OooO00o.write(bArr, i, i2);
        }
        if (this.OooO00o instanceof C6114iIiI) {
            if (this.f18639OooO00o.size() > this.OooO00o.OooO00o() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.f18639OooO00o.size() > this.OooO00o.OooO00o()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return OooO00o();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetBlockSize() {
        try {
            return this.OooO00o.OooO00o();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // javax.crypto.CipherSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetKeySize(Key key) {
        BigInteger modulus;
        if (key instanceof RSAPrivateKey) {
            modulus = ((RSAPrivateKey) key).getModulus();
        } else if (key instanceof RSAPublicKey) {
            modulus = ((RSAPublicKey) key).getModulus();
        } else {
            throw new IllegalArgumentException("not an RSA key!");
        }
        return modulus.bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetOutputSize(int i) {
        try {
            return this.OooO00o.OooO0O0();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f18641OooO0O0 == null && this.f18638OooO00o != null) {
            try {
                AlgorithmParameters OooO00o2 = this.OooO0O0.m17217OooO00o("OAEP");
                this.f18641OooO0O0 = OooO00o2;
                OooO00o2.init(this.f18638OooO00o);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f18641OooO0O0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString(), e);
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.f18641OooO0O0 = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        liLL1l r7;
        liLL1l r8;
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof OAEPParameterSpec)) {
            if (key instanceof RSAPublicKey) {
                if (!this.f18642OooO0O0 || i != 1) {
                    r7 = C6703lill.OooO00o((RSAPublicKey) key);
                } else {
                    throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
                }
            } else if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            } else if (!this.f18640OooO00o || i != 1) {
                r7 = C6703lill.OooO00o((RSAPrivateKey) key);
            } else {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            if (algorithmParameterSpec != null) {
                OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
                this.f18638OooO00o = algorithmParameterSpec;
                if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(AbstractC5711LiLli.Oooo000.m16387OooO0O0())) {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                } else if (oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                    AbstractC6436l11LI OooO00o2 = C9487LL1i.m21539OooO00o(oAEPParameterSpec.getDigestAlgorithm());
                    if (OooO00o2 != null) {
                        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
                        AbstractC6436l11LI OooO00o3 = C9487LL1i.m21539OooO00o(mGF1ParameterSpec.getDigestAlgorithm());
                        if (OooO00o3 != null) {
                            this.OooO00o = new L1i1LiI(new C6114iIiI(), OooO00o2, OooO00o3, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                        } else {
                            throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("unkown MGF parameters");
                }
            }
            if (!(this.OooO00o instanceof C6114iIiI)) {
                if (secureRandom == null) {
                    r8 = new liLL1l(r7, IIllii.OooO00o());
                }
                r7 = r8;
            }
            this.f18639OooO00o.reset();
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new InvalidParameterException("unknown opmode " + i + " passed to RSA");
                        }
                    }
                }
                this.OooO00o.OooO00o(false, r7);
                return;
            }
            this.OooO00o.OooO00o(true, r7);
            return;
        }
        throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
    }

    @Override // javax.crypto.CipherSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String OooO0O02 = Strings.OooO0O0(str);
        if (!OooO0O02.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED) && !OooO0O02.equals("ECB")) {
            if (OooO0O02.equals("1")) {
                this.f18642OooO0O0 = true;
                this.f18640OooO00o = false;
            } else if (OooO0O02.equals("2")) {
                this.f18642OooO0O0 = false;
                this.f18640OooO00o = true;
            } else {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
        }
    }

    @Override // javax.crypto.CipherSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        OAEPParameterSpec oAEPParameterSpec;
        Ii1IliL r5;
        String OooO0O02 = Strings.OooO0O0(str);
        if (OooO0O02.equals("NOPADDING")) {
            r5 = new C6114iIiI();
        } else if (OooO0O02.equals("PKCS1PADDING")) {
            r5 = new iLlilLI(new C6114iIiI());
        } else if (OooO0O02.equals("ISO9796-1PADDING")) {
            r5 = new C5693LL(new C6114iIiI());
        } else {
            if (OooO0O02.equals("OAEPWITHMD5ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPPADDING") || OooO0O02.equals("OAEPWITHSHA1ANDMGF1PADDING") || OooO0O02.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
                oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
            } else if (OooO0O02.equals("OAEPWITHSHA224ANDMGF1PADDING") || OooO0O02.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec(LL1i.OooO0OO, "MGF1", new MGF1ParameterSpec(LL1i.OooO0OO), PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA256ANDMGF1PADDING") || OooO0O02.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec(LL1i.OooO0Oo, "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA384ANDMGF1PADDING") || OooO0O02.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec(LL1i.f16409OooO0o0, "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA512ANDMGF1PADDING") || OooO0O02.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec(LL1i.f16408OooO0o, "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec(C6229iiIL.OooO0OO, "MGF1", new MGF1ParameterSpec(C6229iiIL.OooO0OO), PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT);
            } else if (OooO0O02.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                oAEPParameterSpec = new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT);
            } else {
                throw new NoSuchPaddingException(str + " unavailable with RSA.");
            }
            OooO00o(oAEPParameterSpec);
            return;
        }
        this.OooO00o = r5;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f18639OooO00o.write(bArr, i, i2);
        if (this.OooO00o instanceof C6114iIiI) {
            if (this.f18639OooO00o.size() <= this.OooO00o.OooO00o() + 1) {
                return 0;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        } else if (this.f18639OooO00o.size() <= this.OooO00o.OooO00o()) {
            return 0;
        } else {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f18639OooO00o.write(bArr, i, i2);
        if (this.OooO00o instanceof C6114iIiI) {
            if (this.f18639OooO00o.size() <= this.OooO00o.OooO00o() + 1) {
                return null;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        } else if (this.f18639OooO00o.size() <= this.OooO00o.OooO00o()) {
            return null;
        } else {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
    }
}
