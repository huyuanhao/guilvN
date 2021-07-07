package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.X931SecureRandom;

/* renamed from: com.pd.sdk.lLI丨Lil  reason: invalid class name */
public class lLILil implements AbstractC6380iLi {
    public final SecureRandom OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f18497OooO00o;

    /* renamed from: com.pd.sdk.lLI丨Lil$OooO00o */
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
        public boolean m17681OooO00o() {
            return lLILil.this.f18497OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil, com.p118pd.sdk.AbstractC5552Iil
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17682OooO00o() {
            if (!(lLILil.this.OooO00o instanceof SP800SecureRandom) && !(lLILil.this.OooO00o instanceof X931SecureRandom)) {
                return lLILil.this.OooO00o.generateSeed((this.OooO00o + 7) / 8);
            }
            byte[] bArr = new byte[((this.OooO00o + 7) / 8)];
            lLILil.this.OooO00o.nextBytes(bArr);
            return bArr;
        }
    }

    public lLILil(SecureRandom secureRandom, boolean z) {
        this.OooO00o = secureRandom;
        this.f18497OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC6380iLi
    public AbstractC5552Iil OooO00o(int i) {
        return new OooO00o(i);
    }
}
