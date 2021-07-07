package com.p118pd.sdk;

import java.security.Provider;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PasswordException;

/* renamed from: com.pd.sdk.丨l丨丨LLL  reason: invalid class name and case insensitive filesystem */
public class C9736lLLL {
    public ii1I11l OooO00o = new ILLli();

    /* renamed from: com.pd.sdk.丨l丨丨LLL$OooO00o */
    public class OooO00o implements iI1iiLll {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f23367OooO00o;

        /* renamed from: com.pd.sdk.丨l丨丨LLL$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4981OooO00o implements AbstractC6693liiii {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ String f23368OooO00o;

            public C4981OooO00o(String str) {
                this.f23368OooO00o = str;
            }

            @Override // com.p118pd.sdk.AbstractC6693liiii
            public byte[] OooO00o(byte[] bArr, byte[] bArr2) throws PEMException {
                OooO00o oooO00o = OooO00o.this;
                if (oooO00o.f23367OooO00o != null) {
                    return C6437l11.OooO00o(false, C9736lLLL.this.OooO00o, bArr, OooO00o.this.f23367OooO00o, this.f23368OooO00o, bArr2);
                }
                throw new PasswordException("Password is null, but a password is required");
            }
        }

        public OooO00o(char[] cArr) {
            this.f23367OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.iI1iiLll
        public AbstractC6693liiii OooO00o(String str) {
            return new C4981OooO00o(str);
        }
    }

    public iI1iiLll OooO00o(char[] cArr) {
        return new OooO00o(cArr);
    }

    public C9736lLLL OooO00o(String str) {
        this.OooO00o = new C9588iIi(str);
        return this;
    }

    public C9736lLLL OooO00o(Provider provider) {
        this.OooO00o = new LLIlii(provider);
        return this;
    }
}
