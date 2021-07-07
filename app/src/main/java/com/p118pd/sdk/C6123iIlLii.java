package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey;

/* renamed from: com.pd.sdk.iIlLii  reason: case insensitive filesystem */
public class C6123iIlLii extends SignatureSpi implements AbstractC5711LiLli, AbstractC5855LLl {
    public IililIi OooO00o = new LlL11();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f17590OooO00o;

    public byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr2[i2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[i2 + 1] = (byte) (bArr[i] & 15);
        }
        return bArr2;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    @Override // java.security.SignatureSpi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInitSign(java.security.PrivateKey r5) throws java.security.InvalidKeyException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey
            if (r0 == 0) goto L_0x0018
            com.pd.sdk.iL丨丨11I丨 r5 = com.p118pd.sdk.IlllII1.OooO00o(r5)
            com.pd.sdk.l丨LIlii r0 = new com.pd.sdk.l丨LIlii
            byte[] r1 = com.p118pd.sdk.C5636LIl.OooO0O0()
            byte[] r1 = r4.OooO00o(r1)
            r0.<init>(r1)
        L_0x0015:
            r4.f17590OooO00o = r0
            goto L_0x002f
        L_0x0018:
            boolean r0 = r5 instanceof com.p118pd.sdk.AbstractC6484lII
            if (r0 == 0) goto L_0x002e
            com.pd.sdk.iL丨丨11I丨 r5 = com.p118pd.sdk.IlllII1.OooO00o(r5)
            com.pd.sdk.l丨LIlii r0 = new com.pd.sdk.l丨LIlii
            byte[] r1 = com.p118pd.sdk.C5636LIl.OooO0O0()
            byte[] r1 = r4.OooO00o(r1)
            r0.<init>(r1)
            goto L_0x0015
        L_0x002e:
            r5 = 0
        L_0x002f:
            java.security.SecureRandom r0 = r4.appRandom
            r1 = 1
            if (r0 == 0) goto L_0x003f
            com.pd.sdk.IililIi r2 = r4.OooO00o
            com.pd.sdk.liLL丨1l r3 = new com.pd.sdk.liLL丨1l
            r3.<init>(r5, r0)
            r2.OooO00o(r1, r3)
            goto L_0x0044
        L_0x003f:
            com.pd.sdk.IililIi r0 = r4.OooO00o
            r0.OooO00o(r1, r5)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6123iIlLii.engineInitSign(java.security.PrivateKey):void");
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        AbstractC6370iIIIl r0;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            r0 = bCDSTU4145PublicKey.engineGetKeyParameters();
            this.f17590OooO00o = new C6846lLIlii(OooO00o(bCDSTU4145PublicKey.getSbox()));
        } else {
            r0 = IlllII1.OooO00o(publicKey);
            this.f17590OooO00o = new C6846lLIlii(OooO00o(C5636LIl.OooO0O0()));
        }
        this.OooO00o.OooO00o(false, r0);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.f17590OooO00o.OooO0O0()];
        this.f17590OooO00o.OooO00o(bArr, 0);
        try {
            BigInteger[] OooO00o2 = this.OooO00o.OooO00o(bArr);
            byte[] byteArray = OooO00o2[0].toByteArray();
            byte[] byteArray2 = OooO00o2[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new C6487lIIiIlL(bArr2).getEncoded();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f17590OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f17590OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f17590OooO00o.OooO0O0()];
        this.f17590OooO00o.OooO00o(bArr2, 0);
        try {
            byte[] OooO00o2 = ((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(bArr)).m17938OooO00o();
            byte[] bArr3 = new byte[(OooO00o2.length / 2)];
            byte[] bArr4 = new byte[(OooO00o2.length / 2)];
            System.arraycopy(OooO00o2, 0, bArr4, 0, OooO00o2.length / 2);
            System.arraycopy(OooO00o2, OooO00o2.length / 2, bArr3, 0, OooO00o2.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.OooO00o.OooO00o(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }
}
