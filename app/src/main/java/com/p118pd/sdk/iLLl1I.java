package com.p118pd.sdk;

import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.iL丨Ll1I  reason: invalid class name */
public class iLLl1I extends AbstractC9712ll1iI {
    public PrivateKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f17821OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f17822OooO00o = new OperatorHelper(new ILLli());

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17823OooO00o;

    public iLLl1I(C6456l1ilL r2, PrivateKey privateKey) {
        super(r2);
        this.OooO00o = privateKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r2.length == 0) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    @Override // com.p118pd.sdk.AbstractC5773LlIII
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.LIiI11 OooO00o(com.p118pd.sdk.C6456l1ilL r6, byte[] r7) throws org.bouncycastle.operator.OperatorException {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.iLLl1I.OooO00o(com.pd.sdk.l1i丨lL丨丨, byte[]):com.pd.sdk.LIiI1丨1丨");
    }

    public iLLl1I OooO00o(LlLI1 llLI1, String str) {
        this.f17821OooO00o.put(llLI1, str);
        return this;
    }

    public iLLl1I OooO00o(String str) {
        this.f17822OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public iLLl1I OooO00o(Provider provider) {
        this.f17822OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    public iLLl1I OooO00o(boolean z) {
        this.f17823OooO00o = z;
        return this;
    }
}
