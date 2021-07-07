package com.p118pd.sdk;

import java.io.OutputStream;
import org.bouncycastle.eac.EACException;

/* renamed from: com.pd.sdk.lIlILi1 */
public class lIlILi1 {
    public static final byte[] OooO00o = {0};

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5238IIL f18398OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLlI11 f18399OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLil1iI f18400OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9710lilli f18401OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9758ILI f18402OooO00o;
    public LLil1iI OooO0O0;

    public lIlILi1(C5238IIL r1, AbstractC9710lilli r2, C9758ILI r3, LLLlI11 r4, LLil1iI r5, LLil1iI r6) {
        this.f18398OooO00o = r1;
        this.f18401OooO00o = r2;
        this.f18402OooO00o = r3;
        this.f18399OooO00o = r4;
        this.f18400OooO00o = r5;
        this.OooO0O0 = r6;
    }

    private I1I1LL1 OooO00o() {
        return new I1I1LL1(new ILLIi(41, OooO00o), this.f18398OooO00o, this.f18401OooO00o, this.f18402OooO00o, this.f18399OooO00o, this.f18400OooO00o, this.OooO0O0);
    }

    public IIil1I OooO00o(AbstractC9839iiil r4) throws EACException {
        try {
            I1I1LL1 OooO00o2 = OooO00o();
            OutputStream OooO00o3 = r4.m21921OooO00o();
            OooO00o3.write(OooO00o2.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o3.close();
            return new IIil1I(new C1703I(OooO00o2, r4.getSignature()));
        } catch (Exception e) {
            throw new EACException("unable to process signature: " + e.getMessage(), e);
        }
    }
}
