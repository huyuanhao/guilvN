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
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.LiiiL1 */
public class LiiiL1 extends CipherSpi {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f16620OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f16621OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6588lLLii f16622OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6680liLl1i f16623OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f16624OooO00o = new ByteArrayOutputStream();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f16625OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16626OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16627OooO00o = false;
    public int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6213iL11I f16628OooO0O0 = null;

    /* renamed from: com.pd.sdk.LiiiL1$OooO00o */
    public class OooO00o implements AbstractC9704liIi {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ boolean f16629OooO00o;

        public OooO00o(boolean z) {
            this.f16629OooO00o = z;
        }

        @Override // com.p118pd.sdk.AbstractC9704liIi
        public byte[] OooO00o(C6213iL11I r2) {
            return ((LL1ii1l) r2).OooO00o().m21808OooO00o(this.f16629OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.LiiiL1$OooO0O0 */
    public static class OooO0O0 extends LiiiL1 {
        public OooO0O0() {
            super(new C6588lLLii(new C5822L1(), new iIl1lIl(C5427IlI1.OooO0O0()), new C6383iLl1(C5427IlI1.OooO0O0())));
        }
    }

    /* renamed from: com.pd.sdk.LiiiL1$OooO0OO */
    public static class OooO0OO extends C5719OooO0Oo {
        public OooO0OO() {
            super(new C6927lll1(new C5586L1i()), 16);
        }
    }

    /* renamed from: com.pd.sdk.LiiiL1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5719OooO0Oo extends LiiiL1 {
        public C5719OooO0Oo(li1l11I1 li1l11i1, int i) {
            super(new C6588lLLii(new C5822L1(), new iIl1lIl(C5427IlI1.OooO0O0()), new C6383iLl1(C5427IlI1.OooO0O0()), new C6600lLi(li1l11i1)), i);
        }
    }

    /* renamed from: com.pd.sdk.LiiiL1$OooO0o0  reason: case insensitive filesystem */
    public static class C5720OooO0o0 extends C5719OooO0Oo {
        public C5720OooO0o0() {
            super(new C6927lll1(new C1LliI()), 8);
        }
    }

    public LiiiL1(C6588lLLii lllii) {
        this.f16622OooO00o = lllii;
        this.OooO00o = 0;
    }

    public LiiiL1(C6588lLLii lllii, int i) {
        this.f16622OooO00o = lllii;
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
            this.f16624OooO00o.write(bArr, i, i2);
        }
        byte[] byteArray = this.f16624OooO00o.toByteArray();
        this.f16624OooO00o.reset();
        AbstractC6370iIIIl r7 = new C9693lL(this.f16623OooO00o.m17756OooO00o(), this.f16623OooO00o.m17757OooO0O0(), this.f16623OooO00o.OooO0O0(), this.f16623OooO00o.OooO00o());
        if (this.f16623OooO00o.OooO0OO() != null) {
            r7 = new C6274iilL1L(r7, this.f16623OooO00o.OooO0OO());
        }
        C5600L1iLL OooO00o2 = ((C5611LI1) this.f16620OooO00o).OooO00o();
        C6213iL11I r0 = this.f16628OooO0O0;
        if (r0 != null) {
            try {
                if (this.OooO0O0 != 1) {
                    if (this.OooO0O0 != 3) {
                        this.f16622OooO00o.OooO00o(false, this.f16620OooO00o, r0, r7);
                        return this.f16622OooO00o.OooO00o(byteArray, 0, byteArray.length);
                    }
                }
                this.f16622OooO00o.OooO00o(true, this.f16628OooO0O0, this.f16620OooO00o, r7);
                return this.f16622OooO00o.OooO00o(byteArray, 0, byteArray.length);
            } catch (Exception e) {
                throw new BadBlockException("unable to process block", e);
            }
        } else {
            int i3 = this.OooO0O0;
            if (i3 == 1 || i3 == 3) {
                LI111l r02 = new LI111l();
                r02.OooO00o(new iL1ilL1(OooO00o2, this.f16626OooO00o));
                try {
                    this.f16622OooO00o.OooO00o(this.f16620OooO00o, r7, new C5849LILiL(r02, new OooO00o(this.f16623OooO00o.m17755OooO00o())));
                    return this.f16622OooO00o.OooO00o(byteArray, 0, byteArray.length);
                } catch (Exception e2) {
                    throw new BadBlockException("unable to process block", e2);
                }
            } else if (i3 == 2 || i3 == 4) {
                try {
                    this.f16622OooO00o.OooO00o(this.f16620OooO00o, r7, new C6359i1LL(OooO00o2));
                    return this.f16622OooO00o.OooO00o(byteArray, 0, byteArray.length);
                } catch (InvalidCipherTextException e3) {
                    throw new BadBlockException("unable to process block", e3);
                }
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
        }
    }

    public int engineGetBlockSize() {
        if (this.f16622OooO00o.OooO00o() != null) {
            return this.f16622OooO00o.OooO00o().OooO00o();
        }
        return 0;
    }

    public byte[] engineGetIV() {
        C6680liLl1i lill1i = this.f16623OooO00o;
        if (lill1i != null) {
            return lill1i.OooO0OO();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof AbstractC6484lII) {
            return ((AbstractC6484lII) key).getParameters().OooO00o().OooO0O0();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    public int engineGetOutputSize(int i) {
        int size;
        C6744ll1L r4;
        if (this.f16620OooO00o != null) {
            int OooO00o2 = this.f16622OooO00o.m17686OooO00o().OooO00o();
            int OooO0O02 = this.f16628OooO0O0 == null ? ((((C5611LI1) this.f16620OooO00o).OooO00o().OooO00o().OooO0O0() + 7) / 8) * 2 : 0;
            if (this.f16622OooO00o.OooO00o() != null) {
                int i2 = this.OooO0O0;
                if (i2 == 1 || i2 == 3) {
                    r4 = this.f16622OooO00o.OooO00o();
                } else if (i2 == 2 || i2 == 4) {
                    r4 = this.f16622OooO00o.OooO00o();
                    i = (i - OooO00o2) - OooO0O02;
                } else {
                    throw new IllegalStateException("cipher not initialised");
                }
                i = r4.OooO00o(i);
            }
            int i3 = this.OooO0O0;
            if (i3 == 1 || i3 == 3) {
                size = this.f16624OooO00o.size() + OooO00o2 + 1 + OooO0O02;
            } else if (i3 == 2 || i3 == 4) {
                size = (this.f16624OooO00o.size() - OooO00o2) - OooO0O02;
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
            return size + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.f16625OooO00o == null && this.f16623OooO00o != null) {
            try {
                AlgorithmParameters OooO00o2 = this.f16621OooO00o.m17217OooO00o("IES");
                this.f16625OooO00o = OooO00o2;
                OooO00o2.init(this.f16623OooO00o);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f16625OooO00o;
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
        this.f16625OooO00o = algorithmParameters;
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
        byte[] bArr = null;
        this.f16628OooO0O0 = null;
        if (algorithmParameterSpec == null) {
            int i2 = this.OooO00o;
            if (i2 != 0 && i == 1) {
                bArr = new byte[i2];
                secureRandom.nextBytes(bArr);
            }
            lill1i = IlLL1.OooO00o(this.f16622OooO00o.OooO00o(), bArr);
        } else if (algorithmParameterSpec instanceof C6680liLl1i) {
            lill1i = (C6680liLl1i) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        this.f16623OooO00o = lill1i;
        byte[] OooO0OO2 = this.f16623OooO00o.OooO0OO();
        int i3 = this.OooO00o;
        if (i3 == 0 || (OooO0OO2 != null && OooO0OO2.length == i3)) {
            if (i == 1 || i == 3) {
                if (key instanceof PublicKey) {
                    r4 = ILIIIlI.OooO00o((PublicKey) key);
                } else if (key instanceof IESKey) {
                    IESKey iESKey = (IESKey) key;
                    this.f16620OooO00o = ILIIIlI.OooO00o(iESKey.getPublic());
                    this.f16628OooO0O0 = IlllII1.OooO00o(iESKey.getPrivate());
                    this.f16626OooO00o = secureRandom;
                    this.OooO0O0 = i;
                    this.f16624OooO00o.reset();
                    return;
                } else {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
            } else if (i == 2 || i == 4) {
                if (key instanceof PrivateKey) {
                    privateKey = (PrivateKey) key;
                } else if (key instanceof IESKey) {
                    IESKey iESKey2 = (IESKey) key;
                    this.f16628OooO0O0 = ILIIIlI.OooO00o(iESKey2.getPublic());
                    privateKey = iESKey2.getPrivate();
                } else {
                    throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
                }
                r4 = IlllII1.OooO00o(privateKey);
            } else {
                throw new InvalidKeyException("must be passed EC key");
            }
            this.f16620OooO00o = r4;
            this.f16626OooO00o = secureRandom;
            this.OooO0O0 = i;
            this.f16624OooO00o.reset();
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
        this.f16627OooO00o = z;
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
        this.f16624OooO00o.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.f16624OooO00o.write(bArr, i, i2);
        return null;
    }
}
