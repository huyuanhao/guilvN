package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.lili11 */
public class lili11 extends C5521ILiLi {

    /* renamed from: com.pd.sdk.lili11$OooO00o */
    public class OooO00o implements AbstractC6290ii {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ I111LIL f18644OooO00o;

        public OooO00o(I111LIL r2) {
            this.f18644OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC6290ii
        public I111LIL OooO00o(C6456l1ilL r1) throws OperatorCreationException {
            return this.f18644OooO00o;
        }
    }

    public C6074iI1 OooO00o(AbstractC5563Il r2, AbstractC6296il1il1 il1il1) throws CMSException {
        return OooO00o(r2, il1il1, null);
    }

    public C6074iI1 OooO00o(AbstractC5563Il r18, AbstractC6296il1il1 il1il1, I111LIL r20) throws CMSException {
        C9709lilI r0;
        iILLL1 r3 = new iILLL1();
        for (AbstractC5760Lil r5 : ((C1L1l) this).f22782OooO0O0) {
            r3.OooO00o(r5.OooO00o(il1il1.OooO00o()));
        }
        C5781LlIl r4 = null;
        if (r20 != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C5741LilILl r7 = new C5741LilILl(r20.m21370OooO00o(), byteArrayOutputStream);
                r18.write(r7);
                r7.close();
                C5837L1l r72 = new C5837L1l(byteArrayOutputStream.toByteArray());
                Map OooO00o2 = OooO00o(r18.OooO00o(), r20.OooO00o(), il1il1.m17321OooO00o(), r20.m21371OooO00o());
                if (((C5521ILiLi) this).OooO0O0 == null) {
                    ((C5521ILiLi) this).OooO0O0 = new C5813LliL();
                }
                i1I1I1l r14 = new i1I1I1l(((C5521ILiLi) this).OooO0O0.OooO00o(Collections.unmodifiableMap(OooO00o2)).m21785OooO00o());
                try {
                    OutputStream OooO00o3 = il1il1.m17322OooO00o();
                    OooO00o3.write(r14.OooO00o(AbstractC5533IiL.OooO00o));
                    OooO00o3.close();
                    C6487lIIiIlL r15 = new C6487lIIiIlL(il1il1.m17323OooO00o());
                    AbstractC9852lIli r52 = this.OooO0OO;
                    if (r52 != null) {
                        r4 = new C5781LlIl(r52.OooO00o(Collections.unmodifiableMap(OooO00o2)).m21785OooO00o());
                    }
                    r0 = new C9709lilI(((C1L1l) this).f22779OooO00o, new i1I1I1l(r3), il1il1.m17321OooO00o(), r20.OooO00o(), new C5753LiI1(AbstractC6252iiLl.OooO00o, r72), r14, r15, r4);
                } catch (IOException e) {
                    throw new CMSException("exception decoding algorithm parameters.", e);
                }
            } catch (IOException e2) {
                throw new CMSException("unable to perform digest calculation: " + e2.getMessage(), e2);
            }
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                C5741LilILl r73 = new C5741LilILl(byteArrayOutputStream2, il1il1.m17322OooO00o());
                r18.write(r73);
                r73.close();
                C5837L1l r02 = new C5837L1l(byteArrayOutputStream2.toByteArray());
                C6487lIIiIlL r142 = new C6487lIIiIlL(il1il1.m17323OooO00o());
                AbstractC9852lIli r53 = this.OooO0OO;
                if (r53 != null) {
                    r4 = new C5781LlIl(r53.OooO00o(new HashMap()).m21785OooO00o());
                }
                r0 = new C9709lilI(((C1L1l) this).f22779OooO00o, new i1I1I1l(r3), il1il1.m17321OooO00o(), null, new C5753LiI1(AbstractC6252iiLl.OooO00o, r02), null, r142, r4);
            } catch (IOException e3) {
                throw new CMSException("exception decoding algorithm parameters.", e3);
            }
        }
        return new C6074iI1(new C5753LiI1(AbstractC6252iiLl.OooO0oO, r0), new OooO00o(r20));
    }
}
