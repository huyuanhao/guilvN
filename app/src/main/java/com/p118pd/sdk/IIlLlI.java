package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.IIlLlI */
public class IIlLlI implements AbstractC6380iLi {
    public final SecureRandom OooO00o = new SecureRandom();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f15513OooO00o;

    /* renamed from: com.pd.sdk.IIlLlI$OooO00o */
    public class OooO00o implements AbstractC5552Iil {
        public final /* synthetic */ int OooO00o;

        public OooO00o(int i) {
            this.OooO00o = i;
        }

        @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15410OooO00o() {
            return IIlLlI.this.f15513OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m15411OooO00o() {
            byte[] bArr = new byte[((this.OooO00o + 7) / 8)];
            IIlLlI.this.OooO00o.nextBytes(bArr);
            return bArr;
        }
    }

    public IIlLlI(boolean z) {
        this.f15513OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC6380iLi
    public AbstractC5552Iil OooO00o(int i) {
        return new OooO00o(i);
    }
}
