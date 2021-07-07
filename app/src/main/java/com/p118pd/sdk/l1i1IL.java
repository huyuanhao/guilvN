package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.l1i1I丨L丨  reason: invalid class name */
public class l1i1IL {
    public OperatorHelper OooO00o = new OperatorHelper(new ILLli());

    /* renamed from: com.pd.sdk.l1i1I丨L丨$OooO00o */
    public class OooO00o implements AbstractC6290ii {

        /* renamed from: com.pd.sdk.l1i1I丨L丨$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4946OooO00o implements I111LIL {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OooO0O0 f18282OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C6456l1ilL f18283OooO00o;

            public C4946OooO00o(C6456l1ilL r2, OooO0O0 oooO0O0) {
                this.f18283OooO00o = r2;
                this.f18282OooO00o = oooO0O0;
            }

            @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
            public C6456l1ilL OooO00o() {
                return this.f18283OooO00o;
            }

            @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
            /* renamed from: OooO00o  reason: collision with other method in class */
            public OutputStream m17575OooO00o() {
                return this.f18282OooO00o;
            }

            @Override // com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL, com.p118pd.sdk.I111LIL
            /* renamed from: OooO00o  reason: collision with other method in class */
            public byte[] m17576OooO00o() {
                return this.f18282OooO00o.OooO0O0();
            }
        }

        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC6290ii
        public I111LIL OooO00o(C6456l1ilL r4) throws OperatorCreationException {
            try {
                return new C4946OooO00o(r4, new OooO0O0(l1i1IL.this.OooO00o.m22979OooO00o(r4)));
            } catch (GeneralSecurityException e) {
                throw new OperatorCreationException("exception on setup: " + e, e);
            }
        }
    }

    /* renamed from: com.pd.sdk.l1i1I丨L丨$OooO0O0 */
    public class OooO0O0 extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public MessageDigest f18284OooO00o;

        public OooO0O0(MessageDigest messageDigest) {
            this.f18284OooO00o = messageDigest;
        }

        public byte[] OooO0O0() {
            return this.f18284OooO00o.digest();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f18284OooO00o.update((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f18284OooO00o.update(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f18284OooO00o.update(bArr, i, i2);
        }
    }

    public AbstractC6290ii OooO00o() throws OperatorCreationException {
        return new OooO00o();
    }

    public l1i1IL OooO00o(String str) {
        this.OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public l1i1IL OooO00o(Provider provider) {
        this.OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }
}
