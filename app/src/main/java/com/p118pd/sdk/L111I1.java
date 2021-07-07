package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.L111I1 */
public class L111I1 implements AbstractC5563Il {
    public final LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6854lLi1LL f16113OooO00o;

    public L111I1(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.OooO00o = llLI1;
        this.f16113OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    public LlLI1 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m15876OooO00o() {
        return this.f16113OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5808Ll1I
    public void write(OutputStream outputStream) throws IOException, CMSException {
        AbstractC6854lLi1LL r0 = this.f16113OooO00o;
        if (r0 instanceof I11li1) {
            Iterator<AbstractC6854lLi1LL> it = I11li1.OooO00o(r0).iterator();
            while (it.hasNext()) {
                outputStream.write(it.next().OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
            }
            return;
        }
        byte[] OooO00o2 = r0.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
        int i = 1;
        while ((OooO00o2[i] & 255) > 127) {
            i++;
        }
        int i2 = i + 1;
        outputStream.write(OooO00o2, i2, OooO00o2.length - i2);
    }
}
