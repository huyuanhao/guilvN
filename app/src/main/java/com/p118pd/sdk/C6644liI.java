package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.liI  reason: case insensitive filesystem */
public class C6644liI extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18594OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PublicKey f18595OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18596OooO00o;
    public C6456l1ilL OooO0O0;
    public String o0ooOOo;

    public C6644liI(I11li1 i11li1) {
        try {
            if (i11li1.size() == 3) {
                this.f18594OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
                this.f18596OooO00o = ((iIilII1) i11li1.OooO00o(2)).OooO0O0();
                I11li1 i11li12 = (I11li1) i11li1.OooO00o(0);
                if (i11li12.size() == 2) {
                    this.o0ooOOo = ((L1iI1) i11li12.OooO00o(1)).OooO00o();
                    this.OooO00o = new iIilII1(i11li12);
                    C6888ll OooO00o2 = C6888ll.OooO00o(i11li12.OooO00o(0));
                    X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new iIilII1(OooO00o2).m15475OooO00o());
                    C6456l1ilL OooO00o3 = OooO00o2.m18041OooO00o();
                    this.OooO0O0 = OooO00o3;
                    this.f18595OooO00o = KeyFactory.getInstance(OooO00o3.OooO00o().m16387OooO0O0(), BouncyCastleProvider.PROVIDER_NAME).generatePublic(x509EncodedKeySpec);
                    return;
                }
                throw new IllegalArgumentException("invalid PKAC (len): " + i11li12.size());
            }
            throw new IllegalArgumentException("invalid SPKAC (size):" + i11li1.size());
        } catch (Exception e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    public C6644liI(String str, C6456l1ilL r3, PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        this.o0ooOOo = str;
        this.f18594OooO00o = r3;
        this.f18595OooO00o = publicKey;
        iILLL1 r32 = new iILLL1();
        r32.OooO00o(OooO0Oo());
        r32.OooO00o(new L1iI1(str));
        try {
            this.OooO00o = new iIilII1(new C5707LiL1(r32));
        } catch (IOException e) {
            throw new InvalidKeySpecException("exception encoding key: " + e.toString());
        }
    }

    public C6644liI(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static I11li1 OooO00o(byte[] bArr) throws IOException {
        return I11li1.OooO00o((Object) new C5805Ll1(new ByteArrayInputStream(bArr)).OooO00o());
    }

    private AbstractC6122iIlLiL OooO0Oo() throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.f18595OooO00o.getEncoded());
            byteArrayOutputStream.close();
            return new C5805Ll1(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).OooO00o();
        } catch (IOException e) {
            throw new InvalidKeySpecException(e.getMessage());
        }
    }

    public C6456l1ilL OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PublicKey m17737OooO00o() {
        return this.f18595OooO00o;
    }

    public void OooO00o(C6456l1ilL r1) {
        this.OooO0O0 = r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public void OooO00o(String str) {
        this.o0ooOOo = str;
    }

    public void OooO00o(PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException, InvalidKeySpecException {
        OooO00o(privateKey, (SecureRandom) null);
    }

    public void OooO00o(PrivateKey privateKey, SecureRandom secureRandom) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException, InvalidKeySpecException {
        Signature instance = Signature.getInstance(this.f18594OooO00o.OooO00o().m16387OooO0O0(), BouncyCastleProvider.PROVIDER_NAME);
        if (secureRandom != null) {
            instance.initSign(privateKey, secureRandom);
        } else {
            instance.initSign(privateKey);
        }
        iILLL1 r3 = new iILLL1();
        r3.OooO00o(OooO0Oo());
        r3.OooO00o(new L1iI1(this.o0ooOOo));
        try {
            instance.update(new C5707LiL1(r3).OooO00o(AbstractC5533IiL.OooO00o));
            this.f18596OooO00o = instance.sign();
        } catch (IOException e) {
            throw new SignatureException(e.getMessage());
        }
    }

    public void OooO00o(PublicKey publicKey) {
        this.f18595OooO00o = publicKey;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17738OooO00o(String str) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        if (!str.equals(this.o0ooOOo)) {
            return false;
        }
        Signature instance = Signature.getInstance(this.f18594OooO00o.OooO00o().m16387OooO0O0(), BouncyCastleProvider.PROVIDER_NAME);
        instance.initVerify(this.f18595OooO00o);
        instance.update(this.OooO00o.m15475OooO00o());
        return instance.verify(this.f18596OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        iILLL1 r1 = new iILLL1();
        try {
            r1.OooO00o(OooO0Oo());
        } catch (Exception unused) {
        }
        r1.OooO00o(new L1iI1(this.o0ooOOo));
        r0.OooO00o(new C5707LiL1(r1));
        r0.OooO00o(this.f18594OooO00o);
        r0.OooO00o(new iIilII1(this.f18596OooO00o));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17739OooO0O0() {
        return this.f18594OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m17740OooO0O0() {
        return this.o0ooOOo;
    }

    public void OooO0O0(C6456l1ilL r1) {
        this.f18594OooO00o = r1;
    }
}
