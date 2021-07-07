package com.p118pd.sdk;

import com.facebook.react.modules.netinfo.NetInfoModule;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.I丨LlI丨1  reason: invalid class name and case insensitive filesystem */
public class C5522ILlI1 extends CipherSpi {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f16021OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f16022OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6588lLLii f16023OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6680liLl1i f16024OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f16025OooO00o = new ByteArrayOutputStream();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f16026OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16027OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16028OooO00o = false;
    public int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6213iL11I f16029OooO0O0 = null;

    /* renamed from: com.pd.sdk.I丨LlI丨1$OooO00o */
    public class OooO00o implements AbstractC9704liIi {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC9704liIi
        public byte[] OooO00o(C6213iL11I r5) {
            int bitLength = (((C5627LIiI) r5).OooO00o().OooO0OO().bitLength() + 7) / 8;
            byte[] bArr = new byte[bitLength];
            byte[] OooO00o2 = IIiL.OooO00o(((LiIiLii) r5).OooO00o());
            if (OooO00o2.length <= bitLength) {
                System.arraycopy(OooO00o2, 0, bArr, bitLength - OooO00o2.length, OooO00o2.length);
                return bArr;
            }
            throw new IllegalArgumentException("Senders's public key longer than expected.");
        }
    }

    /* renamed from: com.pd.sdk.I丨LlI丨1$OooO0O0 */
    public static class OooO0O0 extends C5522ILlI1 {
        public OooO0O0() {
            super(new C6588lLLii(new C5629LIiLlLil(), new iIl1lIl(C5427IlI1.OooO0O0()), new C6383iLl1(C5427IlI1.OooO0O0())));
        }
    }

    /* renamed from: com.pd.sdk.I丨LlI丨1$OooO0OO */
    public static class OooO0OO extends C5522ILlI1 {
        public OooO0OO() {
            super(new C6588lLLii(new C5629LIiLlLil(), new iIl1lIl(C5427IlI1.OooO0O0()), new C6383iLl1(C5427IlI1.OooO0O0()), new C6600lLi(new C6927lll1(new C5586L1i()))), 16);
        }
    }

    /* renamed from: com.pd.sdk.I丨LlI丨1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5523OooO0Oo extends C5522ILlI1 {
        public C5523OooO0Oo() {
            super(new C6588lLLii(new C5629LIiLlLil(), new iIl1lIl(C5427IlI1.OooO0O0()), new C6383iLl1(C5427IlI1.OooO0O0()), new C6600lLi(new C6927lll1(new C1LliI()))), 8);
        }
    }

    public C5522ILlI1(C6588lLLii lllii) {
        this.f16023OooO00o = lllii;
        this.OooO00o = 0;
    }

    public C5522ILlI1(C6588lLLii lllii, int i) {
        this.f16023OooO00o = lllii;
        this.OooO00o = i;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (i2 != 0) {
            this.f16025OooO00o.write(bArr, i, i2);
        }
        byte[] byteArray = this.f16025OooO00o.toByteArray();
        this.f16025OooO00o.reset();
        AbstractC6370iIIIl r7 = new C9693lL(this.f16024OooO00o.m17756OooO00o(), this.f16024OooO00o.m17757OooO0O0(), this.f16024OooO00o.OooO0O0(), this.f16024OooO00o.OooO00o());
        if (this.f16024OooO00o.OooO0OO() != null) {
            r7 = new C6274iilL1L(r7, this.f16024OooO00o.OooO0OO());
        }
        C6017i1Il OooO00o2 = ((C5627LIiI) this.f16021OooO00o).OooO00o();
        C6213iL11I r0 = this.f16029OooO0O0;
        if (r0 != null) {
            try {
                if (this.OooO0O0 != 1) {
                    if (this.OooO0O0 != 3) {
                        this.f16023OooO00o.OooO00o(false, this.f16021OooO00o, r0, r7);
                        return this.f16023OooO00o.OooO00o(byteArray, 0, byteArray.length);
                    }
                }
                this.f16023OooO00o.OooO00o(true, this.f16029OooO0O0, this.f16021OooO00o, r7);
                return this.f16023OooO00o.OooO00o(byteArray, 0, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        } else {
            int i3 = this.OooO0O0;
            if (i3 == 1 || i3 == 3) {
                LILI1II lili1ii = new LILI1II();
                lili1ii.OooO00o(new C6528lI1IL(this.f16027OooO00o, OooO00o2));
                try {
                    this.f16023OooO00o.OooO00o(this.f16021OooO00o, r7, new C5849LILiL(lili1ii, new OooO00o()));
                    return this.f16023OooO00o.OooO00o(byteArray, 0, byteArray.length);
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            } else if (i3 == 2 || i3 == 4) {
                try {
                    this.f16023OooO00o.OooO00o(this.f16021OooO00o, r7, new C5332ILiI(((C5627LIiI) this.f16021OooO00o).OooO00o()));
                    return this.f16023OooO00o.OooO00o(byteArray, 0, byteArray.length);
                } catch (InvalidCipherTextException e3) {
                    throw new BadBlockException("unable to process block", e3);
                }
            } else {
                throw new IllegalStateException("IESCipher not initialised");
            }
        }
    }

    public int engineGetBlockSize() {
        if (this.f16023OooO00o.OooO00o() != null) {
            return this.f16023OooO00o.OooO00o().OooO00o();
        }
        return 0;
    }

    public byte[] engineGetIV() {
        C6680liLl1i lill1i = this.f16024OooO00o;
        if (lill1i != null) {
            return lill1i.OooO0OO();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    public int engineGetOutputSize(int i) {
        int size;
        C6744ll1L r1;
        if (this.f16021OooO00o != null) {
            int OooO00o2 = this.f16023OooO00o.m17686OooO00o().OooO00o();
            int bitLength = this.f16029OooO0O0 == null ? (((((C5627LIiI) this.f16021OooO00o).OooO00o().OooO0OO().bitLength() + 7) * 2) / 8) + 1 : 0;
            if (this.f16023OooO00o.OooO00o() != null) {
                int i2 = this.OooO0O0;
                if (i2 == 1 || i2 == 3) {
                    r1 = this.f16023OooO00o.OooO00o();
                } else if (i2 == 2 || i2 == 4) {
                    r1 = this.f16023OooO00o.OooO00o();
                    i = (i - OooO00o2) - bitLength;
                } else {
                    throw new IllegalStateException("cipher not initialised");
                }
                i = r1.OooO00o(i);
            }
            int i3 = this.OooO0O0;
            if (i3 == 1 || i3 == 3) {
                size = this.f16025OooO00o.size() + OooO00o2 + bitLength;
            } else if (i3 == 2 || i3 == 4) {
                size = (this.f16025OooO00o.size() - OooO00o2) - bitLength;
            } else {
                throw new IllegalStateException("IESCipher not initialised");
            }
            return size + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.f16026OooO00o == null && this.f16024OooO00o != null) {
            try {
                AlgorithmParameters OooO00o2 = this.f16022OooO00o.m17217OooO00o("IES");
                this.f16026OooO00o = OooO00o2;
                OooO00o2.init(this.f16024OooO00o);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f16026OooO00o;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(C6680liLl1i.class);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.f16026OooO00o = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        C6680liLl1i lill1i;
        C6213iL11I r4;
        PrivateKey privateKey;
        if (algorithmParameterSpec == null) {
            byte[] bArr = null;
            int i2 = this.OooO00o;
            if (i2 != 0 && i == 1) {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            lill1i = IlLL1.OooO00o(this.f16023OooO00o.OooO00o(), bArr);
        } else if (algorithmParameterSpec instanceof C6680liLl1i) {
            lill1i = (C6680liLl1i) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        this.f16024OooO00o = lill1i;
        byte[] OooO0OO2 = this.f16024OooO00o.OooO0OO();
        int i3 = this.OooO00o;
        if (i3 == 0 || (OooO0OO2 != null && OooO0OO2.length == i3)) {
            if (i == 1 || i == 3) {
                if (key instanceof DHPublicKey) {
                    r4 = C9608iLL.OooO00o((PublicKey) key);
                } else if (key instanceof IESKey) {
                    IESKey iESKey = (IESKey) key;
                    this.f16021OooO00o = C9608iLL.OooO00o(iESKey.getPublic());
                    this.f16029OooO0O0 = C9608iLL.OooO00o(iESKey.getPrivate());
                    this.f16027OooO00o = secureRandom;
                    this.OooO0O0 = i;
                    this.f16025OooO00o.reset();
                    return;
                } else {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
            } else if (i == 2 || i == 4) {
                if (key instanceof DHPrivateKey) {
                    privateKey = (PrivateKey) key;
                } else if (key instanceof IESKey) {
                    IESKey iESKey2 = (IESKey) key;
                    this.f16029OooO0O0 = C9608iLL.OooO00o(iESKey2.getPublic());
                    privateKey = iESKey2.getPrivate();
                } else {
                    throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
                }
                r4 = C9608iLL.OooO00o(privateKey);
            } else {
                throw new InvalidKeyException("must be passed EC key");
            }
            this.f16021OooO00o = r4;
            this.f16027OooO00o = secureRandom;
            this.OooO0O0 = i;
            this.f16025OooO00o.reset();
            return;
        }
        throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.OooO00o + " bytes long");
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        boolean z;
        String OooO0O02 = Strings.OooO0O0(str);
        if (OooO0O02.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            z = false;
        } else if (OooO0O02.equals("DHAES")) {
            z = true;
        } else {
            throw new IllegalArgumentException("can't support mode " + str);
        }
        this.f16028OooO00o = z;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String OooO0O02 = Strings.OooO0O0(str);
        if (!OooO0O02.equals("NOPADDING") && !OooO0O02.equals("PKCS5PADDING") && !OooO0O02.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f16025OooO00o.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f16025OooO00o.write(bArr, i, i2);
        return null;
    }
}
