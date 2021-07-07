package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.KeyStore;

/* renamed from: com.pd.sdk.IilIllIl */
public class IilIllIl implements KeyStore.LoadStoreParameter {
    public final AbstractC5873LiliL1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OutputStream f15740OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final KeyStore.ProtectionParameter f15741OooO00o;

    public IilIllIl(OutputStream outputStream, AbstractC5873LiliL1 r2, KeyStore.ProtectionParameter protectionParameter) {
        this.f15740OooO00o = outputStream;
        this.OooO00o = r2;
        this.f15741OooO00o = protectionParameter;
    }

    public IilIllIl(OutputStream outputStream, AbstractC5873LiliL1 r3, char[] cArr) {
        this(outputStream, r3, new KeyStore.PasswordProtection(cArr));
    }

    public AbstractC5873LiliL1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m15627OooO00o() {
        return this.f15740OooO00o;
    }

    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f15741OooO00o;
    }
}
