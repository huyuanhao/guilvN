package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.iiLiI丨L  reason: invalid class name and case insensitive filesystem */
public class C6250iiLiIL implements L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f17881OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L f17882OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17883OooO00o;

    public C6250iiLiIL(AbstractC6436l11LI r2) {
        this.f17882OooO00o = new iIl1lIl(r2);
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public int OooO00o(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (i + i2 <= bArr.length) {
            iILLL1 r0 = new iILLL1();
            r0.OooO00o(new C6456l1ilL(this.f17881OooO00o, C6452l1Lll.OooO00o));
            r0.OooO00o(new ILI1Ll(true, 2, new C6487lIIiIlL(AbstractC6464l1l.OooO00o(this.OooO00o))));
            try {
                this.f17882OooO00o.OooO00o(new C9564i1I1(this.f17883OooO00o, new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o)));
                return this.f17882OooO00o.OooO00o(bArr, i, i2);
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to initialise kdf: " + e.getMessage());
            }
        } else {
            throw new DataLengthException("output buffer too small");
        }
    }

    @Override // com.p118pd.sdk.L
    public AbstractC6436l11LI OooO00o() {
        return this.f17882OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6427ii
    public void OooO00o(AbstractC93201li r2) {
        C5525ILli1 r22 = (C5525ILli1) r2;
        this.f17881OooO00o = r22.m15798OooO00o();
        this.OooO00o = r22.OooO00o();
        this.f17883OooO00o = r22.OooO0O0();
    }
}
