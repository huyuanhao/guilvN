package com.p118pd.sdk;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.丨Iil1il1  reason: invalid class name */
public class Iil1il1 implements AlgorithmParameterSpec {
    public final PrivateKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PublicKey f22933OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f22934OooO00o;
    public final PublicKey OooO0O0;

    public Iil1il1(KeyPair keyPair, PublicKey publicKey) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, null);
    }

    public Iil1il1(KeyPair keyPair, PublicKey publicKey, byte[] bArr) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, bArr);
    }

    public Iil1il1(PrivateKey privateKey, PublicKey publicKey) {
        this(null, privateKey, publicKey, null);
    }

    public Iil1il1(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) {
        this(null, privateKey, publicKey, bArr);
    }

    public Iil1il1(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2) {
        this(publicKey, privateKey, publicKey2, null);
    }

    public Iil1il1(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2, byte[] bArr) {
        if (privateKey == null) {
            throw new IllegalArgumentException("ephemeral private key cannot be null");
        } else if (publicKey2 != null) {
            this.f22933OooO00o = publicKey;
            this.OooO00o = privateKey;
            this.OooO0O0 = publicKey2;
            this.f22934OooO00o = C9586iIILl.m21630OooO00o(bArr);
        } else {
            throw new IllegalArgumentException("other party ephemeral key cannot be null");
        }
    }

    public PrivateKey OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PublicKey m21449OooO00o() {
        return this.f22933OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21450OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f22934OooO00o);
    }

    public PublicKey OooO0O0() {
        return this.OooO0O0;
    }
}
