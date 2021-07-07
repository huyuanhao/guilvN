package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.util.DerUtil;

/* renamed from: com.pd.sdk.LlII  reason: case insensitive filesystem */
public class C5771LlII {
    public final C5707LiL1 OooO00o;

    /* renamed from: com.pd.sdk.LlII$OooO0O0 */
    public static final class OooO0O0 {
        public AbstractC5903LlLLL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6456l1ilL f16687OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6804llL1ii f16688OooO00o;
        public AbstractC5903LlLLL OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final AbstractC6804llL1ii f16689OooO0O0;

        public OooO0O0(C6456l1ilL r1, byte[] bArr, byte[] bArr2) {
            this.f16687OooO00o = r1;
            this.f16688OooO00o = DerUtil.OooO00o(bArr);
            this.f16689OooO0O0 = DerUtil.OooO00o(bArr2);
        }

        public OooO0O0 OooO00o(byte[] bArr) {
            this.OooO0O0 = new ILI1Ll(false, 1, DerUtil.OooO00o(bArr));
            return this;
        }

        public C5771LlII OooO00o() {
            iILLL1 r0 = new iILLL1();
            r0.OooO00o(this.f16687OooO00o);
            r0.OooO00o(this.f16688OooO00o);
            r0.OooO00o(this.f16689OooO0O0);
            AbstractC5903LlLLL r1 = this.OooO00o;
            if (r1 != null) {
                r0.OooO00o(r1);
            }
            AbstractC5903LlLLL r12 = this.OooO0O0;
            if (r12 != null) {
                r0.OooO00o(r12);
            }
            return new C5771LlII(new C5707LiL1(r0));
        }

        public OooO0O0 OooO0O0(byte[] bArr) {
            this.OooO00o = new ILI1Ll(false, 0, DerUtil.OooO00o(bArr));
            return this;
        }
    }

    public C5771LlII(C5707LiL1 liL1) {
        this.OooO00o = liL1;
    }

    public byte[] OooO00o() throws IOException {
        return this.OooO00o.getEncoded();
    }
}
