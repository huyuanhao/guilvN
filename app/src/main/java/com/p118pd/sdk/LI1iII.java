package com.p118pd.sdk;

import com.p118pd.sdk.C5771LlII;
import java.io.IOException;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.LI1iII */
public class LI1iII {
    public final C5771LlII.OooO0O0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f16257OooO00o;

    /* renamed from: com.pd.sdk.LI1iII$OooO00o */
    public static class OooO00o extends LI1iII {
        public i1LLl1L OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public i1lLLi f16258OooO00o = new i1lLLi();

        public OooO00o(C6456l1ilL r1, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
            super(r1, bArr, bArr2, secureRandom);
            iL111lI r12 = new iL111lI();
            r12.OooO00o(new C6470l1i(secureRandom, 2048));
            i1LLl1L OooO00o2 = r12.OooO00o();
            this.OooO00o = OooO00o2;
            this.f16258OooO00o.OooO00o((AbstractC6370iIIIl) OooO00o2.OooO00o());
        }

        public LI1iII OooO00o(byte[] bArr) {
            ((LI1iII) this).OooO00o.OooO0O0(bArr);
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C5771LlII m16013OooO00o(byte[] bArr) {
            ((LI1iII) this).OooO00o.OooO00o(this.f16258OooO00o.m21618OooO00o((AbstractC6370iIIIl) LI1iII.OooO0O0(bArr)));
            return ((LI1iII) this).OooO00o.OooO00o();
        }

        public byte[] OooO00o() {
            return LI1iII.OooO0O0((IL1IILIl) this.OooO00o.OooO0O0());
        }
    }

    /* renamed from: com.pd.sdk.LI1iII$OooO0O0 */
    public static class OooO0O0 extends LI1iII {
        public OooO0O0(C6456l1ilL r1, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
            super(r1, bArr, bArr2, secureRandom);
        }

        public LI1iII OooO00o(byte[] bArr) {
            ((LI1iII) this).OooO00o.OooO0O0(bArr);
            return this;
        }

        public C5771LlII OooO00o() {
            return ((LI1iII) this).OooO00o.OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m16014OooO00o(byte[] bArr) {
            C6595lLiLl OooO00o = new IliILllI(((LI1iII) this).f16257OooO00o).OooO00o(LI1iII.OooO0O0(bArr));
            ((LI1iII) this).OooO00o.OooO00o(OooO00o.m17690OooO00o());
            return LI1iII.OooO0O0((IL1IILIl) OooO00o.OooO00o());
        }
    }

    public LI1iII(C6456l1ilL r2, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        this.OooO00o = new C5771LlII.OooO0O0(r2, bArr, bArr2);
        this.f16257OooO00o = secureRandom;
    }

    public static IL1IILIl OooO0O0(byte[] bArr) {
        return new IL1IILIl(C6888ll.OooO00o(bArr).OooO00o().OooO0O0());
    }

    public static byte[] OooO0O0(IL1IILIl iL1IILIl) {
        try {
            return new C6888ll(new C6456l1ilL(L1iiiiI.OooOo0O), iL1IILIl.OooO0O0()).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }
}
