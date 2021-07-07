package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6840lI;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.LiiL丨  reason: invalid class name and case insensitive filesystem */
public class C5718LiiL extends Lll1IlI implements AbstractC6840lI {
    public I1LLllll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6274iilL1L f16618OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PBEParameterSpec f16619OooO00o;
    public Class[] OooO0O0;
    public int o0OO00O;
    public int o0Oo0oo;
    public String o0ooOOo;
    public int oo0o0Oo;

    public C5718LiiL(I1LLllll i1LLllll, int i) {
        this(i1LLllll, i, -1, -1);
    }

    public C5718LiiL(I1LLllll i1LLllll, int i, int i2, int i3) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.oo0o0Oo = 0;
        this.f16619OooO00o = null;
        this.o0ooOOo = null;
        this.OooO00o = i1LLllll;
        this.oo0o0Oo = i;
        this.o0Oo0oo = i2;
        this.o0OO00O = i3;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 <= bArr2.length) {
            if (i2 != 0) {
                this.OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
            }
            this.OooO00o.reset();
            return i2;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            byte[] engineUpdate = engineUpdate(bArr, i, i2);
            this.OooO00o.reset();
            return engineUpdate;
        }
        this.OooO00o.reset();
        return new byte[0];
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public byte[] engineGetIV() {
        C6274iilL1L r0 = this.f16618OooO00o;
        if (r0 != null) {
            return r0.m17301OooO00o();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public int engineGetOutputSize(int i) {
        return i;
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public AlgorithmParameters engineGetParameters() {
        if (((Lll1IlI) this).f16736OooO00o != null || this.f16619OooO00o == null) {
            return ((Lll1IlI) this).f16736OooO00o;
        }
        try {
            AlgorithmParameters OooO00o2 = OooO00o(this.o0ooOOo);
            OooO00o2.init(this.f16619OooO00o);
            return OooO00o2;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.OooO0O0;
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
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        ((Lll1IlI) this).f16736OooO00o = algorithmParameters;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6274iilL1L r11;
        AbstractC6370iIIIl r12;
        this.f16619OooO00o = null;
        this.o0ooOOo = null;
        ((Lll1IlI) this).f16736OooO00o = null;
        if (key instanceof SecretKey) {
            if (key instanceof PKCS12Key) {
                PKCS12Key pKCS12Key = (PKCS12Key) key;
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.f16619OooO00o = pBEParameterSpec;
                if ((pKCS12Key instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                    PKCS12KeyWithParameters pKCS12KeyWithParameters = (PKCS12KeyWithParameters) pKCS12Key;
                    this.f16619OooO00o = new PBEParameterSpec(pKCS12KeyWithParameters.getSalt(), pKCS12KeyWithParameters.getIterationCount());
                }
                r11 = AbstractC6840lI.OooO00o.OooO00o(pKCS12Key.getEncoded(), 2, this.o0OO00O, this.o0Oo0oo, this.oo0o0Oo * 8, this.f16619OooO00o, this.OooO00o.OooO00o());
            } else {
                if (key instanceof BCPBEKey) {
                    BCPBEKey bCPBEKey = (BCPBEKey) key;
                    this.o0ooOOo = bCPBEKey.getOID() != null ? bCPBEKey.getOID().m16387OooO0O0() : bCPBEKey.getAlgorithm();
                    if (bCPBEKey.getParam() != null) {
                        r12 = bCPBEKey.getParam();
                        this.f16619OooO00o = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                    } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        AbstractC6370iIIIl OooO00o2 = AbstractC6840lI.OooO00o.OooO00o(bCPBEKey, algorithmParameterSpec, this.OooO00o.OooO00o());
                        this.f16619OooO00o = (PBEParameterSpec) algorithmParameterSpec;
                        r12 = OooO00o2;
                    } else {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    if (bCPBEKey.getIvSize() != 0) {
                        this.f16618OooO00o = (C6274iilL1L) r12;
                    }
                } else if (algorithmParameterSpec == null) {
                    if (this.o0OO00O <= 0) {
                        r12 = new C6642li1LI(key.getEncoded());
                    } else {
                        throw new InvalidKeyException("Algorithm requires a PBE key");
                    }
                } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                    C6274iilL1L r0 = new C6274iilL1L(new C6642li1LI(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.f16618OooO00o = r0;
                    r11 = r0;
                } else {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
                r11 = r12;
            }
            if (this.oo0o0Oo != 0 && !(r11 instanceof C6274iilL1L)) {
                if (secureRandom == null) {
                    secureRandom = IIllii.OooO00o();
                }
                if (i == 1 || i == 3) {
                    byte[] bArr = new byte[this.oo0o0Oo];
                    secureRandom.nextBytes(bArr);
                    C6274iilL1L r13 = new C6274iilL1L(r11, bArr);
                    this.f16618OooO00o = r13;
                    r11 = r13;
                } else {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            try {
                                throw new InvalidParameterException("unknown opmode " + i + " passed");
                            } catch (Exception e) {
                                throw new InvalidKeyException(e.getMessage());
                            }
                        }
                    }
                }
                this.OooO00o.OooO00o(false, r11);
                return;
            }
            this.OooO00o.OooO00o(true, r11);
            return;
        }
        throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB")) {
            throw new NoSuchAlgorithmException("can't support mode " + str);
        }
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        }
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (i3 + i2 <= bArr2.length) {
            try {
                this.OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
                return i2;
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.getMessage());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.OooO00o.OooO00o(bArr, i, i2, bArr2, 0);
        return bArr2;
    }
}
