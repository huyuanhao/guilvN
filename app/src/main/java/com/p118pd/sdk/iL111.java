package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.iL111丨  reason: invalid class name */
public class iL111 extends I1II11i {

    /* renamed from: com.pd.sdk.iL111丨$OooO0O0 */
    public static class OooO0O0 implements I111LIL {
        public ByteArrayOutputStream OooO00o;

        public OooO0O0() {
            this.OooO00o = new ByteArrayOutputStream();
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        public C6456l1ilL OooO00o() {
            return new C6456l1ilL(AbstractC9733l.OooO);
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17050OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17051OooO00o() {
            byte[] byteArray = this.OooO00o.toByteArray();
            this.OooO00o.reset();
            C6461l1liI l1lii = new C6461l1liI();
            l1lii.update(byteArray, 0, byteArray.length);
            byte[] bArr = new byte[l1lii.OooO0O0()];
            l1lii.OooO00o(bArr, 0);
            return bArr;
        }
    }

    public iL111() {
        super(new OooO0O0());
    }

    public iL111(I111LIL r1) {
        super(r1);
    }

    public ilililIi OooO00o(C6213iL11I r1) throws IOException {
        return super.m15256OooO00o(L11.OooO00o(r1));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6584lLLL m17049OooO00o(C6213iL11I r1) throws IOException {
        return super.m15258OooO00o(L11.OooO00o(r1));
    }
}
