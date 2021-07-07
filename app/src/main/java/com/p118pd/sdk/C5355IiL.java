package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.KeyStore;

/* renamed from: com.pd.sdk.IiL  reason: case insensitive filesystem */
public class C5355IiL implements KeyStore.LoadStoreParameter {
    public OutputStream OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public KeyStore.ProtectionParameter f15700OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15701OooO00o;

    public OutputStream OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(OutputStream outputStream) {
        this.OooO00o = outputStream;
    }

    public void OooO00o(KeyStore.ProtectionParameter protectionParameter) {
        this.f15700OooO00o = protectionParameter;
    }

    public void OooO00o(boolean z) {
        this.f15701OooO00o = z;
    }

    public void OooO00o(char[] cArr) {
        this.f15700OooO00o = new KeyStore.PasswordProtection(cArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15576OooO00o() {
        return this.f15701OooO00o;
    }

    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f15700OooO00o;
    }
}
