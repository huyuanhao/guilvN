package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.i丨11L  reason: invalid class name and case insensitive filesystem */
public class C6355i11L extends AbstractC6313ilL1 {

    /* renamed from: com.pd.sdk.i丨11L$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f18123OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f18124OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Mac f18125OooO00o;

        public OooO00o(C6456l1ilL r2, Key key, Mac mac) {
            this.f18123OooO00o = r2;
            this.f18124OooO00o = key;
            this.f18125OooO00o = mac;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f18123OooO00o, this.f18124OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m17421OooO00o() {
            return this.f18123OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17422OooO00o() {
            return new C9615iiL(this.f18125OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17423OooO00o() {
            return this.f18125OooO00o.doFinal();
        }
    }

    public C6355i11L(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // com.p118pd.sdk.AbstractC6479lI1L, com.p118pd.sdk.AbstractC6313ilL1
    public LL1L OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) throws CMSException {
        Key OooO00o2 = OooO00o(r3, r4, bArr);
        return new LL1L(new OooO00o(r4, OooO00o2, this.OooO0O0.m16126OooO00o(OooO00o2, r4)));
    }
}
