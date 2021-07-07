package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureSpi;

/* renamed from: com.pd.sdk.IIi丨  reason: invalid class name and case insensitive filesystem */
public class C5208IIi extends l1iiL {

    /* renamed from: com.pd.sdk.IIi丨$OooO */
    public static class OooO extends C5208IIi {
        public OooO() {
            super(C5427IlI1.OooO0OO(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0O0 */
    public static class OooO0O0 implements AbstractC9514Lill {
        public OooO0O0() {
        }

        private byte[] OooO00o(BigInteger bigInteger) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray[0] != 0) {
                return byteArray;
            }
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }

        @Override // com.p118pd.sdk.AbstractC9514Lill
        public byte[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
            byte[] OooO00o = OooO00o(bigInteger);
            byte[] OooO00o2 = OooO00o(bigInteger2);
            byte[] bArr = new byte[((OooO00o.length > OooO00o2.length ? OooO00o.length : OooO00o2.length) * 2)];
            System.arraycopy(OooO00o, 0, bArr, (bArr.length / 2) - OooO00o.length, OooO00o.length);
            System.arraycopy(OooO00o2, 0, bArr, bArr.length - OooO00o2.length, OooO00o2.length);
            return bArr;
        }

        @Override // com.p118pd.sdk.AbstractC9514Lill
        public BigInteger[] OooO00o(byte[] bArr) throws IOException {
            int length = bArr.length / 2;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length / 2;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            System.arraycopy(bArr, length, bArr3, 0, length2);
            return new BigInteger[]{new BigInteger(1, bArr2), new BigInteger(1, bArr3)};
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0OO */
    public static class OooO0OO implements AbstractC9514Lill {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.AbstractC9514Lill
        public byte[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
            iILLL1 r0 = new iILLL1();
            r0.OooO00o(new C6513lIiI(bigInteger));
            r0.OooO00o(new C6513lIiI(bigInteger2));
            return new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC9514Lill
        public BigInteger[] OooO00o(byte[] bArr) throws IOException {
            I11li1 i11li1 = (I11li1) AbstractC6122iIlLiL.OooO00o(bArr);
            if (i11li1.size() != 2) {
                throw new IOException("malformed signature");
            } else if (C9586iIILl.m21627OooO00o(bArr, i11li1.OooO00o(AbstractC5533IiL.OooO00o))) {
                return new BigInteger[]{C6513lIiI.OooO00o(i11li1.OooO00o(0)).m17647OooO0O0(), C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0()};
            } else {
                throw new IOException("malformed signature");
            }
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5209OooO0Oo extends C5208IIi {
        public C5209OooO0Oo() {
            super(C5427IlI1.OooO0OO(), new LIlllI(), new OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0o */
    public static class OooO0o extends C5208IIi {
        public OooO0o() {
            super(C5427IlI1.OooO0o0(), new LIlllI(), new OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0o0  reason: case insensitive filesystem */
    public static class C5210OooO0o0 extends C5208IIi {
        public C5210OooO0o0() {
            super(C5427IlI1.OooO0Oo(), new LIlllI(), new OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0oO  reason: case insensitive filesystem */
    public static class C5211OooO0oO extends C5208IIi {
        public C5211OooO0oO() {
            super(C5427IlI1.OooOO0(), new LIlllI(), new OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooO0oo  reason: case insensitive filesystem */
    public static class C5212OooO0oo extends C5208IIi {
        public C5212OooO0oo() {
            super(C5427IlI1.OooO0O0(), new LIlllI(), new OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOO0 */
    public static class OooOO0 extends C5208IIi {
        public OooOO0() {
            super(C5427IlI1.OooO0Oo(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOO0O */
    public static class OooOO0O extends C5208IIi {
        public OooOO0O() {
            super(C5427IlI1.OooO0o0(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOO0o  reason: case insensitive filesystem */
    public static class C5213OooOO0o extends C5208IIi {
        public C5213OooOO0o() {
            super(C5427IlI1.OooOO0(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOO */
    public static class OooOOO extends C5208IIi {
        public OooOOO() {
            super(new C9706liLi(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOO0 */
    public static class OooOOO0 extends C5208IIi {
        public OooOOO0() {
            super(C5427IlI1.OooO0O0(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOOO */
    public static class OooOOOO extends C5208IIi {
        public OooOOOO() {
            super(C5427IlI1.OooO0o(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOOo  reason: case insensitive filesystem */
    public static class C5214OooOOOo extends C5208IIi {
        public C5214OooOOOo() {
            super(C5427IlI1.OooO0oO(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOo  reason: case insensitive filesystem */
    public static class C5215OooOOo extends C5208IIi {
        public C5215OooOOo() {
            super(C5427IlI1.OooO(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOo0  reason: case insensitive filesystem */
    public static class C5216OooOOo0 extends C5208IIi {
        public C5216OooOOo0() {
            super(C5427IlI1.OooO0oo(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOOoo  reason: case insensitive filesystem */
    public static class C5217OooOOoo extends C5208IIi {
        public C5217OooOOoo() {
            super(new Lill1(), new LIlllI(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOo */
    public static class OooOo extends C5208IIi {
        public OooOo() {
            super(C5427IlI1.OooO0O0(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0O0())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOo0  reason: case insensitive filesystem */
    public static class C5218OooOo0 extends C5208IIi {
        public C5218OooOo0() {
            super(C5427IlI1.OooO0Oo(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0Oo())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOo00 */
    public static class OooOo00 extends C5208IIi {
        public OooOo00() {
            super(C5427IlI1.OooO0OO(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0OO())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOo0O  reason: case insensitive filesystem */
    public static class C5219OooOo0O extends C5208IIi {
        public C5219OooOo0O() {
            super(C5427IlI1.OooO0o0(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0o0())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOo0o  reason: case insensitive filesystem */
    public static class C5220OooOo0o extends C5208IIi {
        public C5220OooOo0o() {
            super(C5427IlI1.OooOO0(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooOO0())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOoO  reason: case insensitive filesystem */
    public static class C5221OooOoO extends C5208IIi {
        public C5221OooOoO() {
            super(C5427IlI1.OooO0oO(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0oO())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOoO0  reason: case insensitive filesystem */
    public static class C5222OooOoO0 extends C5208IIi {
        public C5222OooOoO0() {
            super(C5427IlI1.OooO0o(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0o())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOoOO  reason: case insensitive filesystem */
    public static class C5223OooOoOO extends C5208IIi {
        public C5223OooOoOO() {
            super(C5427IlI1.OooO0oo(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO0oo())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOoo  reason: case insensitive filesystem */
    public static class C5224OooOoo extends C5208IIi {
        public C5224OooOoo() {
            super(C5427IlI1.OooO0OO(), new C9518Lii(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOoo0  reason: case insensitive filesystem */
    public static class C5225OooOoo0 extends C5208IIi {
        public C5225OooOoo0() {
            super(C5427IlI1.OooO(), new LIlllI(new C9373Ii1IL(C5427IlI1.OooO())), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOooO  reason: case insensitive filesystem */
    public static class C5226OooOooO extends C5208IIi {
        public C5226OooOooO() {
            super(C5427IlI1.OooO0Oo(), new C9518Lii(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$OooOooo  reason: case insensitive filesystem */
    public static class C5227OooOooo extends C5208IIi {
        public C5227OooOooo() {
            super(C5427IlI1.OooO0o0(), new C9518Lii(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$Oooo000 */
    public static class Oooo000 extends C5208IIi {
        public Oooo000() {
            super(C5427IlI1.OooOO0(), new C9518Lii(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$Oooo00O  reason: case insensitive filesystem */
    public static class C5228Oooo00O extends C5208IIi {
        public C5228Oooo00O() {
            super(C5427IlI1.OooO0O0(), new C9518Lii(), new OooO0OO());
        }
    }

    /* renamed from: com.pd.sdk.IIi丨$Oooo00o  reason: case insensitive filesystem */
    public static class C5229Oooo00o extends C5208IIi {
        public C5229Oooo00o() {
            super(new C9706liLi(), new LIlllI(), new OooO0O0());
        }
    }

    public C5208IIi(AbstractC6436l11LI r1, IililIi iililIi, AbstractC9514Lill r3) {
        super(r1, iililIi, r3);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        C6213iL11I OooO00o2 = IlllII1.OooO00o(privateKey);
        ((l1iiL) this).f18296OooO00o.reset();
        SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            ((l1iiL) this).OooO00o.OooO00o(true, new liLL1l(OooO00o2, secureRandom));
        } else {
            ((l1iiL) this).OooO00o.OooO00o(true, OooO00o2);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        C6213iL11I OooO00o2 = ILIIIlI.OooO00o(publicKey);
        ((l1iiL) this).f18296OooO00o.reset();
        ((l1iiL) this).OooO00o.OooO00o(false, OooO00o2);
    }
}
