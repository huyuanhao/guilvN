package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.ill1i1I */
public class ill1i1I {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IiLl11i f18066OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f18067OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18068OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1ILLL1 f18069OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18070OooO00o;
    public I11L OooO0O0;

    /* renamed from: com.pd.sdk.ill1i1I$OooO00o */
    public class OooO00o implements iLLLlIi {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.iLLLlIi
        public InputStream OooO00o() throws IOException, CMSException {
            return null;
        }
    }

    public ill1i1I(C5753LiI1 r4) throws CMSException {
        this.f18067OooO00o = r4;
        C5461Ilii OooO00o2 = C5461Ilii.OooO00o(r4.m16341OooO0O0());
        this.f18069OooO00o = OooO00o2.m15694OooO00o();
        I11L OooO0O02 = OooO00o2.OooO0O0();
        this.f18068OooO00o = OooO00o2.m15691OooO00o().m16414OooO00o();
        this.f18066OooO00o = C6561lL1lL.OooO00o(OooO0O02, this.f18068OooO00o, new OooO00o());
        this.OooO00o = OooO00o2.OooO00o();
        this.f18070OooO00o = OooO00o2.m15693OooO00o().m17938OooO00o();
        this.OooO0O0 = OooO00o2.OooO0OO();
    }

    public ill1i1I(InputStream inputStream) throws CMSException {
        this(C5799LllI.OooO00o(inputStream));
    }

    public ill1i1I(byte[] bArr) throws CMSException {
        this(C5799LllI.OooO00o(bArr));
    }
}
