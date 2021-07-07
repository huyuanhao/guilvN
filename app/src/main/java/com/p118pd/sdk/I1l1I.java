package com.p118pd.sdk;

import com.p118pd.sdk.C5771LlII;
import com.p118pd.sdk.C9703liILI;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.I丨丨1l丨1I  reason: invalid class name */
public class I1l1I extends AbstractC9712ll1iI {
    public PrivateKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f16098OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f16099OooO00o = new OperatorHelper(new ILLli());

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16100OooO00o;
    public byte[] OooO0O0;

    public I1l1I(C6456l1ilL r2, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        super(r2);
        this.OooO00o = privateKey;
        this.f16100OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
    }

    public I1l1I OooO00o(String str) {
        this.f16099OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public I1l1I OooO00o(Provider provider) {
        this.f16099OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5773LlIII
    public LIiI11 OooO00o(C6456l1ilL r9, byte[] bArr) throws OperatorException {
        C1693lI OooO00o2 = C1693lI.OooO00o(OooO00o().m17587OooO0O0());
        Cipher OooO00o3 = this.f16099OooO00o.OooO00o(OooO00o().OooO00o(), this.f16098OooO00o);
        String OooO0O02 = this.f16099OooO00o.OooO0O0(OooO00o2.OooO00o().OooO00o());
        ILIIiI OooO00o4 = ILIIiI.OooO00o(OooO00o2.m17610OooO0O0().m17587OooO0O0());
        try {
            OooO00o3.init(4, this.OooO00o, new C9703liILI.OooO0O0(OooO0O02, OooO00o4.m15486OooO00o().intValue() * 8, new C5771LlII.OooO0O0(OooO00o2.OooO00o(), this.f16100OooO00o, this.OooO0O0).OooO00o().OooO00o()).OooO00o(OooO00o4.OooO00o()).OooO00o());
            return new C92991ILi(r9, OooO00o3.unwrap(bArr, this.f16099OooO00o.m22976OooO00o(r9.OooO00o()), 3));
        } catch (Exception e) {
            throw new OperatorException("Unable to unwrap contents key: " + e.getMessage(), e);
        }
    }
}
