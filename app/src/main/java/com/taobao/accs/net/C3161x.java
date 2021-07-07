package com.taobao.accs.net;

import com.taobao.accs.utl.UtilityImpl;
import org.android.spdy.AccsSSLCallback;

/* renamed from: com.taobao.accs.net.x */
public class C3161x implements AccsSSLCallback {

    /* renamed from: a */
    public final /* synthetic */ C3156t f7114a;

    public C3161x(C3156t tVar) {
        this.f7114a = tVar;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i, byte[] bArr) {
        C3156t tVar = this.f7114a;
        return UtilityImpl.m7620a(tVar.f7012d, tVar.f7021m, tVar.f7010b, bArr);
    }
}
