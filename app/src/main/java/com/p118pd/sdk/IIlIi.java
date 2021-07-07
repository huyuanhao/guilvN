package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.KeyStore;

/* renamed from: com.pd.sdk.I丨Il丨Ii  reason: invalid class name */
public class IIlIi implements KeyStore.LoadStoreParameter {
    public final OutputStream OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final KeyStore.ProtectionParameter f16011OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f16012OooO00o;

    public IIlIi(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(outputStream, protectionParameter, false);
    }

    public IIlIi(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z) {
        this.OooO00o = outputStream;
        this.f16011OooO00o = protectionParameter;
        this.f16012OooO00o = z;
    }

    public IIlIi(OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public IIlIi(OutputStream outputStream, char[] cArr, boolean z) {
        this(outputStream, new KeyStore.PasswordProtection(cArr), z);
    }

    public OutputStream OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15790OooO00o() {
        return this.f16012OooO00o;
    }

    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f16011OooO00o;
    }
}
