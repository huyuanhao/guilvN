package com.p118pd.sdk;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.i丨Lll1丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6384iLll1 extends AlgorithmParameterGeneratorSpi {
    public int OooO00o = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f18183OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18184OooO00o;

    public final AlgorithmParameters OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.f18183OooO00o.m17217OooO00o(str);
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.f18184OooO00o = secureRandom;
    }
}
