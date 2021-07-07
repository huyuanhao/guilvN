package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.i1ILl丨  reason: invalid class name and case insensitive filesystem */
public class C6015i1ILl {
    public static Map OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f17350OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5340Ii1lI f17351OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f17352OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17353OooO00o;

    /* renamed from: com.pd.sdk.i1ILl丨$OooO00o */
    public class OooO00o implements AbstractC5650LIL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f17354OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6642li1LI f17355OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f17356OooO00o;

        public OooO00o(LlLI1 llLI1, int i, SecureRandom secureRandom) throws CMSException {
            secureRandom = secureRandom == null ? new SecureRandom() : secureRandom;
            this.f17355OooO00o = new C6642li1LI(C6015i1ILl.this.f17351OooO00o.OooO00o(llLI1, secureRandom).OooO00o());
            this.f17354OooO00o = C6015i1ILl.this.f17351OooO00o.OooO00o(llLI1, this.f17355OooO00o, secureRandom);
            C5340Ii1lI unused = C6015i1ILl.this.f17351OooO00o;
            this.f17356OooO00o = C5340Ii1lI.OooO00o(true, (AbstractC6370iIIIl) this.f17355OooO00o, this.f17354OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        public LIiI11 OooO00o() {
            return new LIiI11(this.f17354OooO00o, this.f17355OooO00o.OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m16861OooO00o() {
            return this.f17354OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL
        public OutputStream OooO00o(OutputStream outputStream) {
            return this.f17356OooO00o instanceof C6744ll1L ? new li1LI1l(outputStream, (C6744ll1L) this.f17356OooO00o) : new li1LI1l(outputStream, (I1LLllll) this.f17356OooO00o);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(L1lI1i.OooO0o, I11I.OooO00o(128));
        OooO00o.put(L1lI1i.OooO0oO, I11I.OooO00o(192));
        OooO00o.put(L1lI1i.OooO0oo, I11I.OooO00o(256));
        OooO00o.put(L1lI1i.OooOOo, I11I.OooO00o(128));
        OooO00o.put(L1lI1i.OooOOoo, I11I.OooO00o(192));
        OooO00o.put(L1lI1i.OooOo00, I11I.OooO00o(256));
    }

    public C6015i1ILl(LlLI1 llLI1) {
        this(llLI1, OooO00o(llLI1));
    }

    public C6015i1ILl(LlLI1 llLI1, int i) {
        this.f17351OooO00o = new C5340Ii1lI();
        this.f17352OooO00o = llLI1;
        this.f17350OooO00o = i;
    }

    public static int OooO00o(LlLI1 llLI1) {
        Integer num = (Integer) OooO00o.get(llLI1);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public AbstractC5650LIL OooO00o() throws CMSException {
        return new OooO00o(this.f17352OooO00o, this.f17350OooO00o, this.f17353OooO00o);
    }

    public C6015i1ILl OooO00o(SecureRandom secureRandom) {
        this.f17353OooO00o = secureRandom;
        return this;
    }
}
