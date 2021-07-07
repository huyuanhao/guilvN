package com.p118pd.sdk;

import com.p118pd.sdk.ILLl;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.L1l丨lli  reason: invalid class name and case insensitive filesystem */
public class C5594L1llli implements ILLl {
    public int OooO = 1;
    public C6274iilL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6744ll1L f16226OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f16227OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Class[] f16228OooO00o = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    public int OooO0oo = 2;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o = 0;

    /* renamed from: com.pd.sdk.L1l丨lli$OooO00o */
    public static class OooO00o extends C5594L1llli {
        public OooO00o() {
            super(new C6927lll1(new C6293il1I()), 0, 0, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.L1l丨lli$OooO0O0 */
    public static class OooO0O0 extends C5594L1llli {
        public OooO0O0() {
            super(new C6927lll1(new C6293il1I()), 0, 1, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.L1l丨lli$OooO0OO */
    public static class OooO0OO extends C5594L1llli {
        public OooO0OO() {
            super(new C6927lll1(new C1LliI()), 2, 1, 128, 64);
        }
    }

    /* renamed from: com.pd.sdk.L1l丨lli$OooO0Oo  reason: case insensitive filesystem */
    public static class C5595OooO0Oo extends C5594L1llli {
        public C5595OooO0Oo() {
            super(new C6927lll1(new C1LliI()), 2, 1, 192, 64);
        }
    }

    /* renamed from: com.pd.sdk.L1l丨lli$OooO0o */
    public static class OooO0o extends C5594L1llli {
        public OooO0o() {
            super(new C6927lll1(new iI1iII()), 3, 1, 256, 128);
        }
    }

    /* renamed from: com.pd.sdk.L1l丨lli$OooO0o0  reason: case insensitive filesystem */
    public static class C5596OooO0o0 extends C5594L1llli {
        public C5596OooO0o0() {
            super(new C6927lll1(new C1LliI()), 3, 1, 192, 64);
        }
    }

    public C5594L1llli(li1l11I1 li1l11i1) {
        this.f16226OooO00o = new C6600lLi(li1l11i1);
    }

    public C5594L1llli(li1l11I1 li1l11i1, int i, int i2, int i3, int i4) {
        this.f16226OooO00o = new C6600lLi(li1l11i1);
        this.OooO0oo = i;
        this.OooO = i2;
        this.OooOO0 = i3;
        this.OooOO0O = i4;
    }

    public int OooO00o() {
        return this.f16226OooO00o.OooO00o();
    }

    public int OooO00o(int i) {
        return this.f16226OooO00o.OooO00o(i);
    }

    public int OooO00o(Key key) {
        return key.getEncoded().length;
    }

    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int OooO00o2 = i2 != 0 ? this.f16226OooO00o.OooO00o(bArr, i, i2, bArr2, i3) : 0;
        try {
            return OooO00o2 + this.f16226OooO00o.OooO00o(bArr2, i3 + OooO00o2);
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m15993OooO00o() {
        if (this.f16227OooO00o == null && this.OooO00o != null) {
            String OooO00o2 = this.f16226OooO00o.m17842OooO00o().m17732OooO00o();
            if (OooO00o2.indexOf(47) >= 0) {
                OooO00o2 = OooO00o2.substring(0, OooO00o2.indexOf(47));
            }
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance(OooO00o2, BouncyCastleProvider.PROVIDER_NAME);
                this.f16227OooO00o = instance;
                instance.init(this.OooO00o.m17301OooO00o());
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f16227OooO00o;
    }

    public Key OooO00o(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            byte[] OooO00o2 = OooO00o(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(OooO00o2, str);
            }
            try {
                KeyFactory instance = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i == 1) {
                    return instance.generatePublic(new X509EncodedKeySpec(OooO00o2));
                }
                if (i == 2) {
                    return instance.generatePrivate(new PKCS8EncodedKeySpec(OooO00o2));
                }
                throw new InvalidKeyException("Unknown key type " + i);
            } catch (NoSuchProviderException e) {
                throw new InvalidKeyException("Unknown key type " + e.getMessage());
            } catch (NoSuchAlgorithmException e2) {
                throw new InvalidKeyException("Unknown key type " + e2.getMessage());
            } catch (InvalidKeySpecException e3) {
                throw new InvalidKeyException("Unknown key type " + e3.getMessage());
            }
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    public void OooO00o(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.f16228OooO00o;
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
        this.f16227OooO00o = algorithmParameters;
        OooO00o(i, key, algorithmParameterSpec, secureRandom);
    }

    public void OooO00o(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            OooO00o(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void OooO00o(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        C6642li1LI r10;
        C6274iilL1L r102;
        C6274iilL1L r0;
        C6642li1LI r11;
        if (key instanceof BCPBEKey) {
            AbstractC6370iIIIl OooO00o2 = ILLl.OooO00o.OooO00o((BCPBEKey) key, algorithmParameterSpec, this.OooO0oo, this.OooO, this.f16226OooO00o.m17842OooO00o().m17732OooO00o(), this.OooOO0, this.OooOO0O);
            r10 = OooO00o2;
            if (this.OooOO0O != 0) {
                this.OooO00o = (C6274iilL1L) OooO00o2;
                r10 = OooO00o2;
            }
        } else {
            if (algorithmParameterSpec == null) {
                r11 = new C6642li1LI(key.getEncoded());
            } else {
                if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                    if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                        C6148iL11L il11l = new C6148iL11L(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                        r0 = il11l;
                        if (rC2ParameterSpec.getIV() != null) {
                            r0 = il11l;
                            if (this.OooOO0o != 0) {
                                r102 = new C6274iilL1L(il11l, rC2ParameterSpec.getIV());
                            }
                        }
                    } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                        RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                        C5663LLiL1l lLiL1l = new C5663LLiL1l(key.getEncoded(), rC5ParameterSpec.getRounds());
                        if (rC5ParameterSpec.getWordSize() == 32) {
                            r0 = lLiL1l;
                            if (rC5ParameterSpec.getIV() != null) {
                                r0 = lLiL1l;
                                if (this.OooOO0o != 0) {
                                    r102 = new C6274iilL1L(lLiL1l, rC5ParameterSpec.getIV());
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("unknown parameter type.");
                    }
                    this.OooO00o = r102;
                    r10 = r102;
                } else if (this.OooOO0o != 0) {
                    C6274iilL1L r02 = new C6274iilL1L(new C6642li1LI(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.OooO00o = r02;
                    r0 = r02;
                } else {
                    r11 = new C6642li1LI(key.getEncoded());
                }
                r10 = r0;
            }
            r10 = r11;
        }
        C6274iilL1L r103 = r10;
        if (this.OooOO0o != 0) {
            boolean z = r10 instanceof C6274iilL1L;
            r103 = r10;
            if (!z) {
                if (secureRandom == null) {
                    secureRandom = IIllii.OooO00o();
                }
                if (i == 1 || i == 3) {
                    byte[] bArr = new byte[this.OooOO0o];
                    secureRandom.nextBytes(bArr);
                    C6274iilL1L r12 = new C6274iilL1L(r10, bArr);
                    this.OooO00o = r12;
                    r103 = r12;
                } else {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        System.out.println("eeek!");
                        return;
                    }
                }
            }
            this.f16226OooO00o.OooO00o(false, (AbstractC6370iIIIl) r103);
            return;
        }
        this.f16226OooO00o.OooO00o(true, (AbstractC6370iIIIl) r103);
    }

    public void OooO00o(String str) {
        C6600lLi r4;
        C6600lLi r0;
        String OooO0O02 = Strings.OooO0O0(str);
        if (OooO0O02.equals("ECB")) {
            this.OooOO0o = 0;
            r4 = new C6600lLi(this.f16226OooO00o.m17842OooO00o());
        } else if (OooO0O02.equals("CBC")) {
            this.OooOO0o = this.f16226OooO00o.m17842OooO00o().OooO00o();
            r4 = new C6600lLi(new C6927lll1(this.f16226OooO00o.m17842OooO00o()));
        } else {
            if (OooO0O02.startsWith("OFB")) {
                this.OooOO0o = this.f16226OooO00o.m17842OooO00o().OooO00o();
                if (OooO0O02.length() != 3) {
                    r0 = new C6600lLi(new IlLilI(this.f16226OooO00o.m17842OooO00o(), Integer.parseInt(OooO0O02.substring(3))));
                } else {
                    r4 = new C6600lLi(new IlLilI(this.f16226OooO00o.m17842OooO00o(), this.f16226OooO00o.OooO00o() * 8));
                }
            } else if (OooO0O02.startsWith("CFB")) {
                this.OooOO0o = this.f16226OooO00o.m17842OooO00o().OooO00o();
                if (OooO0O02.length() != 3) {
                    r0 = new C6600lLi(new C9750I(this.f16226OooO00o.m17842OooO00o(), Integer.parseInt(OooO0O02.substring(3))));
                } else {
                    r4 = new C6600lLi(new C9750I(this.f16226OooO00o.m17842OooO00o(), this.f16226OooO00o.OooO00o() * 8));
                }
            } else {
                throw new IllegalArgumentException("can't support mode " + str);
            }
            this.f16226OooO00o = r0;
            return;
        }
        this.f16226OooO00o = r4;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15994OooO00o() {
        C6274iilL1L r0 = this.OooO00o;
        if (r0 != null) {
            return r0.m17301OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15995OooO00o(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return OooO00o(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }

    public byte[] OooO00o(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[OooO00o(i2)];
        int OooO00o2 = i2 != 0 ? this.f16226OooO00o.OooO00o(bArr, i, i2, bArr2, 0) : 0;
        try {
            int OooO00o3 = OooO00o2 + this.f16226OooO00o.OooO00o(bArr2, OooO00o2);
            byte[] bArr3 = new byte[OooO00o3];
            System.arraycopy(bArr2, 0, bArr3, 0, OooO00o3);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    public int OooO0O0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.f16226OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
    }

    public void OooO0O0(String str) throws NoSuchPaddingException {
        C6744ll1L r4;
        String OooO0O02 = Strings.OooO0O0(str);
        if (OooO0O02.equals("NOPADDING")) {
            r4 = new C6744ll1L(this.f16226OooO00o.m17842OooO00o());
        } else if (OooO0O02.equals("PKCS5PADDING") || OooO0O02.equals("PKCS7PADDING") || OooO0O02.equals("ISO10126PADDING")) {
            r4 = new C6600lLi(this.f16226OooO00o.m17842OooO00o());
        } else if (OooO0O02.equals("WITHCTS")) {
            r4 = new C6810llllil(this.f16226OooO00o.m17842OooO00o());
        } else {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        }
        this.f16226OooO00o = r4;
    }

    public byte[] OooO0O0(byte[] bArr, int i, int i2) {
        int OooO0O02 = this.f16226OooO00o.OooO0O0(i2);
        if (OooO0O02 > 0) {
            byte[] bArr2 = new byte[OooO0O02];
            this.f16226OooO00o.OooO00o(bArr, i, i2, bArr2, 0);
            return bArr2;
        }
        this.f16226OooO00o.OooO00o(bArr, i, i2, null, 0);
        return null;
    }
}
