package com.p118pd.sdk;

import com.facebook.react.modules.netinfo.NetInfoModule;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.i1丨LLi1l  reason: invalid class name */
public class i1LLi1l extends BaseCipherSpi {
    public Ii1IliL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameterSpec f17462OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BaseCipherSpi.OooO00o f17463OooO00o = new BaseCipherSpi.OooO00o();
    public AlgorithmParameters OooO0O0;

    /* renamed from: com.pd.sdk.i1丨LLi1l$OooO00o */
    public static class OooO00o extends i1LLi1l {
        public OooO00o() {
            super(new C5703Li1ill());
        }
    }

    /* renamed from: com.pd.sdk.i1丨LLi1l$OooO0O0 */
    public static class OooO0O0 extends i1LLi1l {
        public OooO0O0() {
            super(new iLlilLI(new C5703Li1ill()));
        }
    }

    public i1LLi1l(Ii1IliL r2) {
        this.OooO00o = r2;
    }

    private void OooO00o(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        AbstractC6436l11LI OooO00o2 = C9487LL1i.m21539OooO00o(mGF1ParameterSpec.getDigestAlgorithm());
        if (OooO00o2 != null) {
            this.OooO00o = new L1i1LiI(new C5703Li1ill(), OooO00o2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.f17462OooO00o = oAEPParameterSpec;
            return;
        }
        throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
    }

    private byte[] OooO00o() throws BadPaddingException {
        try {
            byte[] OooO00o2 = this.OooO00o.OooO00o(this.f17463OooO00o.OooO0O0(), 0, this.f17463OooO00o.size());
            this.f17463OooO00o.OooO00o();
            return OooO00o2;
        } catch (InvalidCipherTextException e) {
            throw new BadBlockException("unable to decrypt block", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new BadBlockException("unable to decrypt block", e2);
        } catch (Throwable th) {
            this.f17463OooO00o.OooO00o();
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (bArr != null) {
                this.f17463OooO00o.write(bArr, i, i2);
            }
            if (this.OooO00o instanceof C5703Li1ill) {
                if (this.f17463OooO00o.size() > this.OooO00o.OooO00o() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
                }
            } else if (this.f17463OooO00o.size() > this.OooO00o.OooO00o()) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
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
            this.f17463OooO00o.write(bArr, i, i2);
        }
        if (this.OooO00o instanceof C5703Li1ill) {
            if (this.f17463OooO00o.size() > this.OooO00o.OooO00o() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.f17463OooO00o.size() > this.OooO00o.OooO00o()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return OooO00o();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetBlockSize() {
        return this.OooO00o.OooO00o();
    }

    @Override // javax.crypto.CipherSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetKeySize(Key key) {
        BigInteger p;
        if (key instanceof IIL1l1L) {
            p = ((IIL1l1L) key).getParameters().OooO0O0();
        } else if (key instanceof DHKey) {
            p = ((DHKey) key).getParams().getP();
        } else {
            throw new IllegalArgumentException("not an ElGamal key!");
        }
        return p.bitLength();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public int engineGetOutputSize(int i) {
        return this.OooO00o.OooO0O0();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.OooO0O0 == null && this.f17462OooO00o != null) {
            try {
                AlgorithmParameters OooO00o2 = OooO00o("OAEP");
                this.OooO0O0 = OooO00o2;
                OooO00o2.init(this.f17462OooO00o);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.OooO0O0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
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
        liLL1l r6;
        Ii1IliL r5;
        if (key instanceof DHPublicKey) {
            r6 = IiIlI1.OooO00o((PublicKey) key);
        } else if (key instanceof DHPrivateKey) {
            r6 = IiIlI1.OooO00o((PrivateKey) key);
        } else {
            throw new InvalidKeyException("unknown key type passed to ElGamal");
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.f17462OooO00o = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(AbstractC5711LiLli.Oooo000.m16387OooO0O0())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            } else if (oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                AbstractC6436l11LI OooO00o2 = C9487LL1i.m21539OooO00o(oAEPParameterSpec.getDigestAlgorithm());
                if (OooO00o2 != null) {
                    MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
                    AbstractC6436l11LI OooO00o3 = C9487LL1i.m21539OooO00o(mGF1ParameterSpec.getDigestAlgorithm());
                    if (OooO00o3 != null) {
                        this.OooO00o = new L1i1LiI(new C5703Li1ill(), OooO00o2, OooO00o3, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                    } else {
                        throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
                }
            } else {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
        } else if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        if (secureRandom != null) {
            r6 = new liLL1l(r6, secureRandom);
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException("unknown opmode " + i + " passed to ElGamal");
                    }
                }
            }
            r5 = this.OooO00o;
            z = false;
            r5.OooO00o(z, r6);
        }
        r5 = this.OooO00o;
        r5.OooO00o(z, r6);
    }

    @Override // javax.crypto.CipherSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String OooO0O02 = Strings.OooO0O0(str);
        if (!OooO0O02.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED) && !OooO0O02.equals("ECB")) {
            throw new NoSuchAlgorithmException("can't support mode " + str);
        }
    }

    @Override // javax.crypto.CipherSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        OAEPParameterSpec oAEPParameterSpec;
        Ii1IliL r5;
        String OooO0O02 = Strings.OooO0O0(str);
        if (OooO0O02.equals("NOPADDING")) {
            r5 = new C5703Li1ill();
        } else if (OooO0O02.equals("PKCS1PADDING")) {
            r5 = new iLlilLI(new C5703Li1ill());
        } else if (OooO0O02.equals("ISO9796-1PADDING")) {
            r5 = new C5693LL(new C5703Li1ill());
        } else {
            if (!OooO0O02.equals("OAEPPADDING")) {
                if (OooO0O02.equals("OAEPWITHMD5ANDMGF1PADDING")) {
                    oAEPParameterSpec = new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT);
                } else if (!OooO0O02.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
                    if (OooO0O02.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
                        oAEPParameterSpec = new OAEPParameterSpec(LL1i.OooO0OO, "MGF1", new MGF1ParameterSpec(LL1i.OooO0OO), PSource.PSpecified.DEFAULT);
                    } else if (OooO0O02.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
                        oAEPParameterSpec = new OAEPParameterSpec(LL1i.OooO0Oo, "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
                    } else if (OooO0O02.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
                        oAEPParameterSpec = new OAEPParameterSpec(LL1i.f16409OooO0o0, "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT);
                    } else if (OooO0O02.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
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
                        throw new NoSuchPaddingException(str + " unavailable with ElGamal.");
                    }
                }
                OooO00o(oAEPParameterSpec);
                return;
            }
            oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
            OooO00o(oAEPParameterSpec);
            return;
        }
        this.OooO00o = r5;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f17463OooO00o.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f17463OooO00o.write(bArr, i, i2);
        return null;
    }
}
