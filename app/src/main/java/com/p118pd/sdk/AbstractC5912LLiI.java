package com.p118pd.sdk;

import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.L丨丨L丨iI  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5912LLiI extends AbstractC9712ll1iI {
    public C6213iL11I OooO00o;

    public AbstractC5912LLiI(C6456l1ilL r1, C6213iL11I r2) {
        super(r1);
        this.OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC5773LlIII
    public LIiI11 OooO00o(C6456l1ilL r4, byte[] bArr) throws OperatorException {
        Ii1IliL OooO00o2 = OooO00o(OooO00o().OooO00o());
        OooO00o2.OooO00o(false, this.OooO00o);
        try {
            byte[] OooO00o3 = OooO00o2.OooO00o(bArr, 0, bArr.length);
            return r4.OooO00o().equals(AbstractC5711LiLli.OoooOoo) ? new LIiI11(r4, OooO00o3) : new LIiI11(r4, OooO00o3);
        } catch (InvalidCipherTextException e) {
            throw new OperatorException("unable to recover secret key: " + e.getMessage(), e);
        }
    }

    public abstract Ii1IliL OooO00o(LlLI1 llLI1);
}
