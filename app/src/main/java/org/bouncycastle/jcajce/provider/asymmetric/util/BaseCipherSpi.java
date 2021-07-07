package org.bouncycastle.jcajce.provider.asymmetric.util;

import com.p118pd.sdk.AbstractC9875iiI;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6640li1lI;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.ii1I11l;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public abstract class BaseCipherSpi extends CipherSpi {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f23938OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9875iiI f23939OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f23940OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23941OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Class[] f23942OooO00o = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};

    public static final class OooO00o extends ByteArrayOutputStream {
        public void OooO00o() {
            C9586iIILl.OooO00o(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] OooO0O0() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public final AlgorithmParameters OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.f23938OooO00o.m17217OooO00o(str);
    }

    public int engineGetBlockSize() {
        return 0;
    }

    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i) {
        return -1;
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
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
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            byte[] engineDoFinal = this.f23939OooO00o == null ? engineDoFinal(bArr, 0, bArr.length) : this.f23939OooO00o.OooO0O0(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (!str.equals("") || i != 2) {
                try {
                    KeyFactory OooO00o2 = this.f23938OooO00o.m17218OooO00o(str);
                    if (i == 1) {
                        return OooO00o2.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                    }
                    if (i == 2) {
                        return OooO00o2.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                    }
                    throw new InvalidKeyException("Unknown key type " + i);
                } catch (NoSuchAlgorithmException e) {
                    throw new InvalidKeyException("Unknown key type " + e.getMessage());
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException("Unknown key type " + e2.getMessage());
                } catch (NoSuchProviderException e3) {
                    throw new InvalidKeyException("Unknown key type " + e3.getMessage());
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
        } catch (InvalidCipherTextException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (BadPaddingException e5) {
            throw new InvalidKeyException("unable to unwrap") {
                /* class org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi.C48391 */

                public synchronized Throwable getCause() {
                    return e5;
                }
            };
        } catch (IllegalBlockSizeException e6) {
            throw new InvalidKeyException(e6.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return this.f23939OooO00o == null ? engineDoFinal(encoded, 0, encoded.length) : this.f23939OooO00o.OooO00o(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
