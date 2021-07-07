package com.p118pd.sdk;

import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PasswordException;

/* renamed from: com.pd.sdk.iLli  reason: case insensitive filesystem */
public class C6193iLli implements iI1iiLll {
    public final char[] OooO00o;

    /* renamed from: com.pd.sdk.iLli$OooO00o */
    public class OooO00o implements AbstractC6693liiii {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f17785OooO00o;

        public OooO00o(String str) {
            this.f17785OooO00o = str;
        }

        @Override // com.p118pd.sdk.AbstractC6693liiii
        public byte[] OooO00o(byte[] bArr, byte[] bArr2) throws PEMException {
            if (C6193iLli.this.OooO00o != null) {
                return C5806Ll1lI.OooO00o(false, bArr, C6193iLli.this.OooO00o, this.f17785OooO00o, bArr2);
            }
            throw new PasswordException("Password is null, but a password is required");
        }
    }

    public C6193iLli(char[] cArr) {
        this.OooO00o = cArr;
    }

    @Override // com.p118pd.sdk.iI1iiLll
    public AbstractC6693liiii OooO00o(String str) {
        return new OooO00o(str);
    }
}
