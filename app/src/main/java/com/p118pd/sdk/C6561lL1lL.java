package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.lL1lL丨  reason: invalid class name and case insensitive filesystem */
public class C6561lL1lL {

    /* renamed from: com.pd.sdk.lL1lL丨$OooO00o */
    public static class OooO00o implements iLLLlIi {
        public AbstractC5361Iii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f18458OooO00o;

        public OooO00o(C6456l1ilL r1, AbstractC5361Iii iii) {
            this.f18458OooO00o = r1;
            this.OooO00o = iii;
        }

        @Override // com.p118pd.sdk.iLLLlIi
        public InputStream OooO00o() throws IOException, CMSException {
            return this.OooO00o.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.lL1lL丨$OooO0O0 */
    public static class OooO0O0 implements iLLLlIi {
        public AbstractC5361Iii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public I111LIL f18459OooO00o;

        /* renamed from: com.pd.sdk.lL1lL丨$OooO0O0$OooO00o */
        public class OooO00o extends FilterInputStream {
            public OooO00o(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                int read = ((FilterInputStream) this).in.read();
                if (read >= 0) {
                    OooO0O0.this.f18459OooO00o.m21370OooO00o().write(read);
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int read = ((FilterInputStream) this).in.read(bArr, i, i2);
                if (read >= 0) {
                    OooO0O0.this.f18459OooO00o.m21370OooO00o().write(bArr, i, read);
                }
                return read;
            }
        }

        public OooO0O0(I111LIL r1, AbstractC5361Iii iii) {
            this.f18459OooO00o = r1;
            this.OooO00o = iii;
        }

        @Override // com.p118pd.sdk.iLLLlIi
        public InputStream OooO00o() throws IOException, CMSException {
            return new OooO00o(this.OooO00o.OooO00o());
        }

        @Override // com.p118pd.sdk.iLLLlIi
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17662OooO00o() {
            return this.f18459OooO00o.m21371OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.lL1lL丨$OooO0OO */
    public static class OooO0OO implements iLLLlIi {
        public AbstractC5361Iii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f18460OooO00o;

        public OooO0OO(C6456l1ilL r1, AbstractC5361Iii iii) {
            this.f18460OooO00o = r1;
            this.OooO00o = iii;
        }

        @Override // com.p118pd.sdk.iLLLlIi
        public InputStream OooO00o() throws IOException, CMSException {
            return this.OooO00o.OooO00o();
        }
    }

    public static IiLl11i OooO00o(I11L i11l, C6456l1ilL r2, iLLLlIi illllii) {
        return OooO00o(i11l, r2, illllii, null);
    }

    public static IiLl11i OooO00o(I11L i11l, C6456l1ilL r4, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != i11l.size(); i++) {
            OooO00o(arrayList, C1lIii.OooO00o(i11l.OooO00o(i)), r4, illllii, lii11lli);
        }
        return new IiLl11i(arrayList);
    }

    public static void OooO00o(List list, C1lIii r2, C6456l1ilL r3, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        AbstractC6832lIi iIl;
        AbstractC6854lLi1LL OooO0O02 = r2.m21883OooO0O0();
        if (OooO0O02 instanceof C1l1) {
            iIl = new C6431iL((C1l1) OooO0O02, r3, illllii, lii11lli);
        } else if (OooO0O02 instanceof C6265iiilI) {
            iIl = new liil1l((C6265iiilI) OooO0O02, r3, illllii, lii11lli);
        } else if (OooO0O02 instanceof C9451L1) {
            L11l11.OooO00o(list, (C9451L1) OooO0O02, r3, illllii, lii11lli);
            return;
        } else if (OooO0O02 instanceof C6404il) {
            iIl = new C5233IIl((C6404il) OooO0O02, r3, illllii, lii11lli);
        } else {
            return;
        }
        list.add(iIl);
    }
}
