package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.Key;
import javax.crypto.Mac;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.I丨iL丨丨  reason: invalid class name and case insensitive filesystem */
public class C5536IiL extends AbstractC6280ii {

    /* renamed from: com.pd.sdk.I丨iL丨丨$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f16048OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f16049OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Mac f16050OooO00o;

        public OooO00o(C6456l1ilL r2, Key key, Mac mac) {
            this.f16048OooO00o = r2;
            this.f16049OooO00o = key;
            this.f16050OooO00o = mac;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f16048OooO00o, this.f16049OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m15811OooO00o() {
            return this.f16048OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m15812OooO00o() {
            return new C9615iiL(this.f16050OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m15813OooO00o() {
            return this.f16050OooO00o.doFinal();
        }
    }

    public C5536IiL(char[] cArr) {
        super(cArr);
    }

    @Override // com.p118pd.sdk.AbstractC6280ii, com.p118pd.sdk.AbstractC9523Ll1LI
    public LL1L OooO00o(C6456l1ilL r2, C6456l1ilL r3, byte[] bArr, byte[] bArr2) throws CMSException {
        Key OooO00o2 = OooO00o(r2, r3, bArr, bArr2);
        return new LL1L(new OooO00o(r3, OooO00o2, ((AbstractC6280ii) this).OooO00o.m16126OooO00o(OooO00o2, r3)));
    }
}
