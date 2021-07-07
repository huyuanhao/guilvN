package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Mac;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.Il丨丨丨丨  reason: invalid class name and case insensitive filesystem */
public class C5491Il extends AbstractC6573lLII {

    /* renamed from: com.pd.sdk.Il丨丨丨丨$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f15928OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f15929OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Mac f15930OooO00o;

        public OooO00o(C6456l1ilL r2, Key key, Mac mac) {
            this.f15928OooO00o = r2;
            this.f15929OooO00o = key;
            this.f15930OooO00o = mac;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f15928OooO00o, this.f15929OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m15721OooO00o() {
            return this.f15928OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m15722OooO00o() {
            return new C9615iiL(this.f15930OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m15723OooO00o() {
            return this.f15930OooO00o.doFinal();
        }
    }

    public C5491Il(PrivateKey privateKey, C9610iLl1 r2) throws IOException {
        super(privateKey, AbstractC6573lLII.OooO00o(r2));
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi, com.p118pd.sdk.AbstractC6573lLII
    public LL1L OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) throws CMSException {
        Key OooO00o2 = OooO00o(r3, r4, bArr);
        return new LL1L(new OooO00o(r4, OooO00o2, ((AbstractC6573lLII) this).f18478OooO0O0.m16126OooO00o(OooO00o2, r4)));
    }
}
