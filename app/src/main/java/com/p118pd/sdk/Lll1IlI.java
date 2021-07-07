package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6840lI;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.Lll1IlI */
public abstract class Lll1IlI extends CipherSpi implements AbstractC6840lI {
    public OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f16734OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9875iiI f16735OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f16736OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16737OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Class[] f16738OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;
    public int o0OOO0o;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.Lll1IlI$OooO00o */
    public static final class OooO00o extends ByteArrayOutputStream {
        public void OooO00o() {
            C9586iIILl.OooO00o(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] OooO0O0() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public Lll1IlI() {
        this.f16738OooO00o = new Class[]{C5621LILiI.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.o00oO0O = 2;
        this.o0ooOO0 = 1;
        this.f16736OooO00o = null;
        this.f16735OooO00o = null;
        this.OooO00o = null;
        this.f16734OooO00o = new C6640li1lI();
    }

    public Lll1IlI(AbstractC9875iiI r2) {
        this(r2, 0);
    }

    public Lll1IlI(AbstractC9875iiI r6, int i) {
        this.f16738OooO00o = new Class[]{C5621LILiI.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.o00oO0O = 2;
        this.o0ooOO0 = 1;
        this.f16736OooO00o = null;
        this.f16735OooO00o = null;
        this.OooO00o = null;
        this.f16734OooO00o = new C6640li1lI();
        this.f16735OooO00o = r6;
        this.o0OOO0o = i;
    }

    public final AlgorithmParameters OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.f16734OooO00o.m17217OooO00o(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        byte[] bArr3;
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            oooO00o.write(bArr, i, i2);
            try {
                if (this.OooO0O0) {
                    bArr3 = this.f16735OooO00o.OooO00o(this.OooO00o.OooO0O0(), 0, this.OooO00o.size());
                } else {
                    try {
                        bArr3 = this.f16735OooO00o.OooO0O0(this.OooO00o.OooO0O0(), 0, this.OooO00o.size());
                    } catch (InvalidCipherTextException e) {
                        throw new BadPaddingException(e.getMessage());
                    }
                }
                if (bArr3.length + i3 <= bArr2.length) {
                    System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
                    return bArr3.length;
                }
                throw new ShortBufferException("output buffer too short for input.");
            } finally {
                this.OooO00o.OooO00o();
            }
        } else {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] OooO0O02;
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            oooO00o.write(bArr, i, i2);
            try {
                if (this.OooO0O0) {
                    OooO0O02 = this.f16735OooO00o.OooO00o(this.OooO00o.OooO0O0(), 0, this.OooO00o.size());
                } else {
                    try {
                        OooO0O02 = this.f16735OooO00o.OooO0O0(this.OooO00o.OooO0O0(), 0, this.OooO00o.size());
                    } catch (InvalidCipherTextException e) {
                        throw new BadPaddingException(e.getMessage());
                    }
                }
                return OooO0O02;
            } finally {
                this.OooO00o.OooO00o();
            }
        } else {
            throw new IllegalStateException("not supported in a wrapping mode");
        }
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return C9586iIILl.m21630OooO00o(this.f16737OooO00o);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.f16738OooO00o;
                if (i2 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                    break;
                } catch (Exception unused) {
                    i2++;
                }
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.f16736OooO00o = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6274iilL1L r4;
        int i2;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                r4 = AbstractC6840lI.OooO00o.OooO00o(bCPBEKey, algorithmParameterSpec, this.f16735OooO00o.OooO00o());
            } else if (bCPBEKey.getParam() != null) {
                r4 = bCPBEKey.getParam();
            } else {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
        } else {
            r4 = new C6642li1LI(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            r4 = new C6274iilL1L(r4, ((IvParameterSpec) algorithmParameterSpec).getIV());
        }
        if (algorithmParameterSpec instanceof C5621LILiI) {
            C5621LILiI lILiI = (C5621LILiI) algorithmParameterSpec;
            byte[] OooO00o2 = lILiI.OooO00o();
            if (OooO00o2 != null) {
                r4 = new C9374IiI(r4, OooO00o2);
            }
            r4 = new C6403ii(r4, lILiI.OooO0O0());
        }
        if ((r4 instanceof C6642li1LI) && (i2 = this.o0OOO0o) != 0) {
            byte[] bArr = new byte[i2];
            this.f16737OooO00o = bArr;
            secureRandom.nextBytes(bArr);
            r4 = new C6274iilL1L(r4, this.f16737OooO00o);
        }
        if (secureRandom != null) {
            r4 = new liLL1l(r4, secureRandom);
        }
        if (i != 1) {
            if (i == 2) {
                this.f16735OooO00o.OooO00o(false, r4);
                this.OooO00o = new OooO00o();
            } else if (i == 3) {
                this.f16735OooO00o.OooO00o(true, r4);
                this.OooO00o = null;
            } else if (i == 4) {
                this.f16735OooO00o.OooO00o(false, r4);
                this.OooO00o = null;
            } else {
                throw new InvalidParameterException("Unknown mode parameter passed to init.");
            }
            this.OooO0O0 = false;
            return;
        }
        this.f16735OooO00o.OooO00o(true, r4);
        this.OooO00o = new OooO00o();
        this.OooO0O0 = true;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            byte[] engineDoFinal = this.f16735OooO00o == null ? engineDoFinal(bArr, 0, bArr.length) : this.f16735OooO00o.OooO0O0(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (!str.equals("") || i != 2) {
                try {
                    KeyFactory OooO00o2 = this.f16734OooO00o.m17218OooO00o(str);
                    if (i == 1) {
                        return OooO00o2.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                    }
                    if (i == 2) {
                        return OooO00o2.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                    }
                    throw new InvalidKeyException("Unknown key type " + i);
                } catch (NoSuchProviderException e) {
                    throw new InvalidKeyException("Unknown key type " + e.getMessage());
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException("Unknown key type " + e2.getMessage());
                }
            } else {
                try {
                    C5464IlilIi OooO00o3 = C5464IlilIi.OooO00o(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(OooO00o3);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + OooO00o3.m15707OooO0O0().OooO00o() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
        } catch (InvalidCipherTextException e3) {
            throw new InvalidKeyException(e3.getMessage());
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            oooO00o.write(bArr, i, i2);
            return 0;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            oooO00o.write(bArr, i, i2);
            return null;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return this.f16735OooO00o == null ? engineDoFinal(encoded, 0, encoded.length) : this.f16735OooO00o.OooO00o(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
