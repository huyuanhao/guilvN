package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Mac;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.丨1I11L1  reason: invalid class name */
public class C1I11L1 extends i11LlL {

    /* renamed from: com.pd.sdk.丨1I11L1$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f22750OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Mac f22751OooO00o;

        public OooO00o(C6456l1ilL r2, Key key, Mac mac) {
            this.OooO00o = r2;
            this.f22750OooO00o = key;
            this.f22751OooO00o = mac;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new C92991ILi(this.OooO00o, this.f22750OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m21260OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m21261OooO00o() {
            return new C9615iiL(this.f22751OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m21262OooO00o() {
            return this.f22751OooO00o.doFinal();
        }
    }

    public C1I11L1(PrivateKey privateKey) {
        super(privateKey);
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi, com.p118pd.sdk.i11LlL
    public LL1L OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) throws CMSException {
        Key OooO00o2 = OooO00o(r3, r4, bArr);
        return new LL1L(new OooO00o(r4, OooO00o2, ((i11LlL) this).OooO0O0.m16126OooO00o(OooO00o2, r4)));
    }
}
