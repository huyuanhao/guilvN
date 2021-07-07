package com.p118pd.sdk;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.丨IilLi1  reason: invalid class name */
public class IilLi1 implements AlgorithmParameterSpec {
    public final PrivateKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PublicKey f22935OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f22936OooO00o;
    public final PublicKey OooO0O0;

    public IilLi1(KeyPair keyPair, PublicKey publicKey) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, null);
    }

    public IilLi1(KeyPair keyPair, PublicKey publicKey, byte[] bArr) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, bArr);
    }

    public IilLi1(PrivateKey privateKey, PublicKey publicKey) {
        this(null, privateKey, publicKey, null);
    }

    public IilLi1(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) {
        this(null, privateKey, publicKey, bArr);
    }

    public IilLi1(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2) {
        this(publicKey, privateKey, publicKey2, null);
    }

    public IilLi1(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2, byte[] bArr) {
        this.f22935OooO00o = publicKey;
        this.OooO00o = privateKey;
        this.OooO0O0 = publicKey2;
        this.f22936OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public PrivateKey OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PublicKey m21452OooO00o() {
        return this.f22935OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21453OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f22936OooO00o);
    }

    public PublicKey OooO0O0() {
        return this.OooO0O0;
    }
}
