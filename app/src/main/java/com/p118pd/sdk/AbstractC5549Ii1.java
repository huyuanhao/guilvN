package com.p118pd.sdk;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.I丨i丨1  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5549Ii1 extends KeyAgreementSpi {
    public static final Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, LlLI1> f16059OooO00o = new HashMap();
    public static final Hashtable OooO0O0 = new Hashtable();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Map<String, Integer> f16060OooO0O0 = new HashMap();
    public static final Map<String, String> OooO0OO = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6427ii f16061OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f16062OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16063OooO00o;

    static {
        Integer OooO00o2 = I11I.OooO00o(64);
        Integer OooO00o3 = I11I.OooO00o(128);
        Integer OooO00o4 = I11I.OooO00o(192);
        Integer OooO00o5 = I11I.OooO00o(256);
        f16060OooO0O0.put("DES", OooO00o2);
        f16060OooO0O0.put("DESEDE", OooO00o4);
        f16060OooO0O0.put("BLOWFISH", OooO00o3);
        f16060OooO0O0.put("AES", OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOo00.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.OooOoo0.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo0O0.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOo0.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.OooOoo.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo0OO.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOo0o.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.OooOooo.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo0o.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOo0O.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.OooOooO.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo0o0.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOo.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo000.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo0oO.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOoO.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo00o.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5905LllI.OooOoO0.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo00O.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5905LllI.Oooo0oo.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(lILIiLL.OooO0Oo.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(lILIiLL.OooO0o0.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(lILIiLL.OooO0o.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(ll1IL1.OooO0Oo.m16387OooO0O0(), OooO00o3);
        f16060OooO0O0.put(AbstractC5711LiLli.o000oo00.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), OooO00o4);
        f16060OooO0O0.put(AbstractC9733l.OooO0o0.m16387OooO0O0(), OooO00o2);
        f16060OooO0O0.put(AbstractC5331ILi.OooO0o.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5331ILi.OooO0Oo.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5331ILi.OooO0o0.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5711LiLli.Oooooo.m16387OooO0O0(), I11I.OooO00o(160));
        f16060OooO0O0.put(AbstractC5711LiLli.Ooooooo.m16387OooO0O0(), OooO00o5);
        f16060OooO0O0.put(AbstractC5711LiLli.o0OoOo0.m16387OooO0O0(), I11I.OooO00o(384));
        f16060OooO0O0.put(AbstractC5711LiLli.ooOO.m16387OooO0O0(), I11I.OooO00o(512));
        f16059OooO00o.put("DESEDE", AbstractC5711LiLli.OoooOoo);
        f16059OooO00o.put("AES", AbstractC5905LllI.Oooo0OO);
        f16059OooO00o.put("CAMELLIA", lILIiLL.OooO0OO);
        f16059OooO00o.put("SEED", ll1IL1.OooO00o);
        f16059OooO00o.put("DES", AbstractC9733l.OooO0o0);
        OooO0OO.put(AbstractC5702Li111.OooOo0.m16387OooO0O0(), "CAST5");
        OooO0OO.put(AbstractC5702Li111.OooOo0O.m16387OooO0O0(), "IDEA");
        OooO0OO.put(AbstractC5702Li111.OooOoO0.m16387OooO0O0(), "Blowfish");
        OooO0OO.put(AbstractC5702Li111.OooOoO.m16387OooO0O0(), "Blowfish");
        OooO0OO.put(AbstractC5702Li111.OooOoOO.m16387OooO0O0(), "Blowfish");
        OooO0OO.put(AbstractC5702Li111.OooOoo0.m16387OooO0O0(), "Blowfish");
        OooO0OO.put(AbstractC9733l.OooO0Oo.m16387OooO0O0(), "DES");
        OooO0OO.put(AbstractC9733l.OooO0o0.m16387OooO0O0(), "DES");
        OooO0OO.put(AbstractC9733l.OooO0oO.m16387OooO0O0(), "DES");
        OooO0OO.put(AbstractC9733l.OooO0o.m16387OooO0O0(), "DES");
        OooO0OO.put(AbstractC9733l.OooO0oo.m16387OooO0O0(), "DESede");
        OooO0OO.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), "DESede");
        OooO0OO.put(AbstractC5711LiLli.o000oo00.m16387OooO0O0(), "DESede");
        OooO0OO.put(AbstractC5711LiLli.o000oo0.m16387OooO0O0(), "RC2");
        OooO0OO.put(AbstractC5711LiLli.Oooooo.m16387OooO0O0(), "HmacSHA1");
        OooO0OO.put(AbstractC5711LiLli.OoooooO.m16387OooO0O0(), "HmacSHA224");
        OooO0OO.put(AbstractC5711LiLli.Ooooooo.m16387OooO0O0(), "HmacSHA256");
        OooO0OO.put(AbstractC5711LiLli.o0OoOo0.m16387OooO0O0(), "HmacSHA384");
        OooO0OO.put(AbstractC5711LiLli.ooOO.m16387OooO0O0(), "HmacSHA512");
        OooO0OO.put(lILIiLL.OooO00o.m16387OooO0O0(), "Camellia");
        OooO0OO.put(lILIiLL.OooO0O0.m16387OooO0O0(), "Camellia");
        OooO0OO.put(lILIiLL.OooO0OO.m16387OooO0O0(), "Camellia");
        OooO0OO.put(lILIiLL.OooO0Oo.m16387OooO0O0(), "Camellia");
        OooO0OO.put(lILIiLL.OooO0o0.m16387OooO0O0(), "Camellia");
        OooO0OO.put(lILIiLL.OooO0o.m16387OooO0O0(), "Camellia");
        OooO0OO.put(ll1IL1.OooO0Oo.m16387OooO0O0(), "SEED");
        OooO0OO.put(ll1IL1.OooO00o.m16387OooO0O0(), "SEED");
        OooO0OO.put(ll1IL1.OooO0O0.m16387OooO0O0(), "SEED");
        OooO0OO.put(AbstractC5331ILi.OooO0o.m16387OooO0O0(), "GOST28147");
        OooO0OO.put(AbstractC5905LllI.OooOo.m16387OooO0O0(), "AES");
        OooO0OO.put(AbstractC5905LllI.OooOoO.m16387OooO0O0(), "AES");
        OooO0OO.put(AbstractC5905LllI.OooOoO.m16387OooO0O0(), "AES");
        OooO00o.put("DESEDE", AbstractC5711LiLli.OoooOoo);
        OooO00o.put("AES", AbstractC5905LllI.Oooo0OO);
        OooO00o.put("DES", AbstractC9733l.OooO0o0);
        OooO0O0.put("DES", "DES");
        OooO0O0.put("DESEDE", "DES");
        OooO0O0.put(AbstractC9733l.OooO0o0.m16387OooO0O0(), "DES");
        OooO0O0.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), "DES");
        OooO0O0.put(AbstractC5711LiLli.o000oo00.m16387OooO0O0(), "DES");
    }

    public AbstractC5549Ii1(String str, AbstractC6427ii r2) {
        this.f16062OooO00o = str;
        this.f16061OooO00o = r2;
    }

    public static int OooO00o(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String OooO0O02 = Strings.OooO0O0(str);
        if (!f16060OooO0O0.containsKey(OooO0O02)) {
            return -1;
        }
        return f16060OooO0O0.get(OooO0O02).intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15827OooO00o(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(AbstractC5905LllI.OooOOoo.m16387OooO0O0())) {
            return "AES";
        }
        if (str.startsWith(iI1ILI.OooO.m16387OooO0O0())) {
            return "Serpent";
        }
        String str2 = OooO0OO.get(Strings.OooO0O0(str));
        return str2 != null ? str2 : str;
    }

    public static byte[] OooO00o(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    private byte[] OooO00o(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        AbstractC93201li r7;
        AbstractC6427ii r0 = this.f16061OooO00o;
        if (r0 != null) {
            if (i >= 0) {
                int i2 = i / 8;
                byte[] bArr2 = new byte[i2];
                if (!(r0 instanceof C5386Iil11)) {
                    r7 = new C9564i1I1(bArr, this.f16063OooO00o);
                } else if (str != null) {
                    try {
                        r7 = new C5525ILli1(new LlLI1(str), i, bArr, this.f16063OooO00o);
                    } catch (IllegalArgumentException unused) {
                        throw new NoSuchAlgorithmException("no OID for algorithm: " + str);
                    }
                } else {
                    throw new NoSuchAlgorithmException("algorithm OID is null");
                }
                this.f16061OooO00o.OooO00o(r7);
                this.f16061OooO00o.OooO00o(bArr2, 0, i2);
                C9586iIILl.m21625OooO00o(bArr);
                return bArr2;
            }
            throw new NoSuchAlgorithmException("unknown algorithm encountered: " + str);
        } else if (i <= 0) {
            return bArr;
        } else {
            int i3 = i / 8;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 0, bArr3, 0, i3);
            C9586iIILl.m21625OooO00o(bArr);
            return bArr3;
        }
    }

    public abstract byte[] OooO00o();

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        throw new ShortBufferException(this.f16062OooO00o + " key agreement: need " + engineGenerateSecret.length + " bytes");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        String OooO0O02 = Strings.OooO0O0(str);
        String OooO0O03 = OooO00o.containsKey(OooO0O02) ? ((LlLI1) OooO00o.get(OooO0O02)).m16387OooO0O0() : str;
        byte[] OooO00o2 = OooO00o(OooO00o(), OooO0O03, OooO00o(OooO0O03));
        String OooO00o3 = m15827OooO00o(str);
        if (OooO0O0.containsKey(OooO00o3)) {
            C9841ill1Ii.OooO00o(OooO00o2);
        }
        return new SecretKeySpec(OooO00o2, OooO00o3);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.f16061OooO00o == null) {
            return OooO00o();
        }
        try {
            return OooO00o(OooO00o(), null, OooO00o().length * 8);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
