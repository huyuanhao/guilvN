package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Mac;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iIl丨l  reason: invalid class name and case insensitive filesystem */
public class C6130iIll extends AbstractC5752LiI {

    /* renamed from: com.pd.sdk.iIl丨l$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f17610OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f17611OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Mac f17612OooO00o;

        public OooO00o(C6456l1ilL r2, Key key, Mac mac) {
            this.f17610OooO00o = r2;
            this.f17611OooO00o = key;
            this.f17612OooO00o = mac;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f17610OooO00o, this.f17611OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m17031OooO00o() {
            return this.f17610OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17032OooO00o() {
            return new C9615iiL(this.f17612OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17033OooO00o() {
            return this.f17612OooO00o.doFinal();
        }
    }

    public C6130iIll(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // com.p118pd.sdk.lILLi1iL, com.p118pd.sdk.AbstractC5752LiI
    public LL1L OooO00o(C6456l1ilL r1, C6456l1ilL r2, C6888ll r3, AbstractC6804llL1ii r4, byte[] bArr) throws CMSException {
        Key OooO00o2 = OooO00o(r1, r2, r3, r4, bArr);
        return new LL1L(new OooO00o(r2, OooO00o2, this.f16662OooO0O0.m16126OooO00o(OooO00o2, r2)));
    }
}
