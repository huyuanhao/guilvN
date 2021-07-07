package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/* renamed from: com.pd.sdk.Ll丨iL丨  reason: invalid class name and case insensitive filesystem */
public class C5813LliL implements AbstractC9852lIli {
    public final Hashtable OooO00o;

    public C5813LliL() {
        this.OooO00o = new Hashtable();
    }

    public C5813LliL(C9731lL1 r1) {
        this.OooO00o = r1 != null ? r1.m21789OooO00o() : new Hashtable();
    }

    @Override // com.p118pd.sdk.AbstractC9852lIli
    public C9731lL1 OooO00o(Map map) {
        return new C9731lL1(m16411OooO00o(map));
    }

    @Override // com.p118pd.sdk.AbstractC9852lIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Hashtable m16411OooO00o(Map map) {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.OooO00o.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable.put(nextElement, this.OooO00o.get(nextElement));
        }
        if (!hashtable.containsKey(AbstractC6651liIi.OooO00o)) {
            C9476LIL1li r2 = new C9476LIL1li(AbstractC6651liIi.OooO00o, new i1I1I1l(LlLI1.OooO00o(map.get(AbstractC9852lIli.OooO00o))));
            hashtable.put(r2.m21530OooO00o(), r2);
        }
        if (!hashtable.containsKey(AbstractC6651liIi.OooO0O0)) {
            C9476LIL1li r22 = new C9476LIL1li(AbstractC6651liIi.OooO0O0, new i1I1I1l(new C6487lIIiIlL((byte[]) map.get(AbstractC9852lIli.OooO0O0))));
            hashtable.put(r22.m21530OooO00o(), r22);
        }
        if (!hashtable.contains(AbstractC6651liIi.OooO0o)) {
            C9476LIL1li r1 = new C9476LIL1li(AbstractC6651liIi.OooO0o, new i1I1I1l(new C9515LillIL((C6456l1ilL) map.get(AbstractC9852lIli.OooO0Oo), 2, (C6456l1ilL) map.get(AbstractC9852lIli.OooO0o0))));
            hashtable.put(r1.m21530OooO00o(), r1);
        }
        return hashtable;
    }
}
