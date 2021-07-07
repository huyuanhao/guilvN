package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i1lI  reason: case insensitive filesystem */
public class C6044i1lI implements AbstractC9833iILl {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iLII1ii f17426OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f17427OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17428OooO00o;

    public C6044i1lI() {
        this(true);
    }

    public C6044i1lI(boolean z) {
        this.f17428OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        C6044i1lI i1li = new C6044i1lI(this.f17428OooO00o);
        i1li.f17426OooO00o = this.f17426OooO00o;
        i1li.OooO00o = this.OooO00o;
        return i1li;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.p118pd.sdk.AbstractC9833iILl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(com.p118pd.sdk.C5692LLlIl r2, org.bouncycastle.cert.X509CertificateHolder r3) throws org.bouncycastle.cert.path.CertPathValidationException {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6044i1lI.OooO00o(com.pd.sdk.LL丨l丨Il丨, org.bouncycastle.cert.X509CertificateHolder):void");
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r2) {
        C6044i1lI i1li = (C6044i1lI) r2;
        this.f17428OooO00o = i1li.f17428OooO00o;
        this.f17426OooO00o = i1li.f17426OooO00o;
        this.OooO00o = i1li.OooO00o;
    }
}
