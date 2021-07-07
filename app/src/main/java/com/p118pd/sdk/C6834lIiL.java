package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.l丨IiL  reason: invalid class name and case insensitive filesystem */
public class C6834lIiL extends ilLiI1Ii {
    public C6642li1LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9875iiI f18891OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18892OooO00o;

    public C6834lIiL(C6456l1ilL r1, AbstractC9875iiI r2, C6642li1LI r3) {
        super(r1);
        this.f18891OooO00o = r2;
        this.OooO00o = r3;
    }

    public C6834lIiL OooO00o(SecureRandom secureRandom) {
        this.f18892OooO00o = secureRandom;
        return this;
    }

    @Override // com.p118pd.sdk.lI111ll
    public byte[] OooO00o(LIiI11 r6) throws OperatorException {
        byte[] OooO00o2 = C6210iLiI.OooO00o(r6);
        SecureRandom secureRandom = this.f18892OooO00o;
        if (secureRandom == null) {
            this.f18891OooO00o.OooO00o(true, this.OooO00o);
        } else {
            this.f18891OooO00o.OooO00o(true, new liLL1l(this.OooO00o, secureRandom));
        }
        return this.f18891OooO00o.OooO00o(OooO00o2, 0, OooO00o2.length);
    }
}
