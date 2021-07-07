package com.p118pd.sdk;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨L丨LLi  reason: invalid class name and case insensitive filesystem */
public class C9548LLLi {

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO00o */
    public static class OooO00o extends II1ii1 {
        public static final String OooO00o = C9548LLLi.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("SecretKeyFactory.TLS10KDF", OooO00o + "$TLS10");
            r3.addAlgorithm("SecretKeyFactory.TLS11KDF", OooO00o + "$TLS11");
            r3.addAlgorithm("SecretKeyFactory.TLS12WITHSHA256KDF", OooO00o + "$TLS12withSHA256");
            r3.addAlgorithm("SecretKeyFactory.TLS12WITHSHA384KDF", OooO00o + "$TLS12withSHA384");
            r3.addAlgorithm("SecretKeyFactory.TLS12WITHSHA512KDF", OooO00o + "$TLS12withSHA512");
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0O0 */
    public static final class OooO0O0 extends C9552OooO0oo {
        public OooO0O0() {
            super("TLS10KDF");
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof C6690liiL) {
                return new SecretKeySpec(C9548LLLi.OooO00o((C6690liiL) keySpec), this.o0ooOOo);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0OO */
    public static final class OooO0OO extends C9552OooO0oo {
        public OooO0OO() {
            super("TLS11KDF");
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof C6690liiL) {
                return new SecretKeySpec(C9548LLLi.OooO00o((C6690liiL) keySpec), this.o0ooOOo);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0Oo  reason: case insensitive filesystem */
    public static class C9549OooO0Oo extends C9552OooO0oo {
        public final AbstractC6769llL1L OooO00o;

        public C9549OooO0Oo(String str, AbstractC6769llL1L lll1l) {
            super(str);
            this.OooO00o = lll1l;
        }

        private byte[] OooO00o(C6690liiL liil, AbstractC6769llL1L lll1l) {
            byte[] OooO0O0 = C9586iIILl.m21645OooO0O0(Strings.m22985OooO00o(liil.m17772OooO00o()), liil.OooO0O0());
            byte[] OooO00o2 = liil.m17773OooO00o();
            byte[] bArr = new byte[liil.OooO00o()];
            C9548LLLi.OooO0O0(lll1l, OooO00o2, OooO0O0, bArr);
            return bArr;
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof C6690liiL) {
                return new SecretKeySpec(OooO00o((C6690liiL) keySpec, this.OooO00o), this.o0ooOOo);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0o */
    public static final class OooO0o extends C9549OooO0Oo {
        public OooO0o() {
            super("TLS12withSHA384KDF", new C6383iLl1(new i1iLLll()));
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0o0  reason: case insensitive filesystem */
    public static final class C9550OooO0o0 extends C9549OooO0Oo {
        public C9550OooO0o0() {
            super("TLS12withSHA256KDF", new C6383iLl1(new I1li1Ll()));
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0oO  reason: case insensitive filesystem */
    public static final class C9551OooO0oO extends C9549OooO0Oo {
        public C9551OooO0oO() {
            super("TLS12withSHA512KDF", new C6383iLl1(new C5622LILlL()));
        }
    }

    /* renamed from: com.pd.sdk.丨L丨LLi$OooO0oo  reason: case insensitive filesystem */
    public static class C9552OooO0oo extends C6338illll {
        public C9552OooO0oo(String str) {
            super(str, null);
        }
    }

    public static byte[] OooO00o(C6690liiL liil) {
        C6383iLl1 r0 = new C6383iLl1(C5427IlI1.OooO00o());
        C6383iLl1 r1 = new C6383iLl1(C5427IlI1.OooO0O0());
        byte[] OooO0O02 = C9586iIILl.m21645OooO0O0(Strings.m22985OooO00o(liil.m17772OooO00o()), liil.OooO0O0());
        byte[] OooO00o2 = liil.m17773OooO00o();
        int length = (OooO00o2.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(OooO00o2, 0, bArr, 0, length);
        System.arraycopy(OooO00o2, OooO00o2.length - length, bArr2, 0, length);
        int OooO00o3 = liil.OooO00o();
        byte[] bArr3 = new byte[OooO00o3];
        byte[] bArr4 = new byte[OooO00o3];
        OooO0O0(r0, bArr, OooO0O02, bArr3);
        OooO0O0(r1, bArr2, OooO0O02, bArr4);
        for (int i = 0; i < OooO00o3; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr4[i]);
        }
        return bArr3;
    }

    public static void OooO0O0(AbstractC6769llL1L lll1l, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        lll1l.OooO00o(new C6642li1LI(bArr));
        int OooO00o2 = lll1l.OooO00o();
        int length = ((bArr3.length + OooO00o2) - 1) / OooO00o2;
        int OooO00o3 = lll1l.OooO00o();
        byte[] bArr4 = new byte[OooO00o3];
        byte[] bArr5 = new byte[lll1l.OooO00o()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            lll1l.update(bArr6, 0, bArr6.length);
            lll1l.OooO00o(bArr4, 0);
            lll1l.update(bArr4, 0, OooO00o3);
            lll1l.update(bArr2, 0, bArr2.length);
            lll1l.OooO00o(bArr5, 0);
            int i2 = OooO00o2 * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(OooO00o2, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }
}
