package com.p118pd.sdk;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/* renamed from: com.pd.sdk.丨i111  reason: invalid class name and case insensitive filesystem */
public class C9561i111 implements AbstractC9852lIli {
    public final Hashtable OooO00o;

    public C9561i111() {
        this.OooO00o = new Hashtable();
    }

    public C9561i111(C9731lL1 r1) {
        this.OooO00o = r1 != null ? r1.m21789OooO00o() : new Hashtable();
    }

    public static Hashtable OooO00o(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    @Override // com.p118pd.sdk.AbstractC9852lIli
    public C9731lL1 OooO00o(Map map) {
        return new C9731lL1(m21613OooO00o(map));
    }

    @Override // com.p118pd.sdk.AbstractC9852lIli
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Hashtable m21613OooO00o(Map map) {
        LlLI1 OooO00o2;
        Hashtable OooO00o3 = OooO00o(this.OooO00o);
        if (!OooO00o3.containsKey(AbstractC6651liIi.OooO00o) && (OooO00o2 = LlLI1.OooO00o(map.get(AbstractC9852lIli.OooO00o))) != null) {
            C9476LIL1li r2 = new C9476LIL1li(AbstractC6651liIi.OooO00o, new i1I1I1l(OooO00o2));
            OooO00o3.put(r2.m21530OooO00o(), r2);
        }
        if (!OooO00o3.containsKey(AbstractC6651liIi.OooO0OO)) {
            C9476LIL1li r22 = new C9476LIL1li(AbstractC6651liIi.OooO0OO, new i1I1I1l(new C6656liIlil(new Date())));
            OooO00o3.put(r22.m21530OooO00o(), r22);
        }
        if (!OooO00o3.containsKey(AbstractC6651liIi.OooO0O0)) {
            C9476LIL1li r23 = new C9476LIL1li(AbstractC6651liIi.OooO0O0, new i1I1I1l(new C6487lIIiIlL((byte[]) map.get(AbstractC9852lIli.OooO0O0))));
            OooO00o3.put(r23.m21530OooO00o(), r23);
        }
        if (!OooO00o3.contains(AbstractC6651liIi.OooO0o)) {
            C9476LIL1li r1 = new C9476LIL1li(AbstractC6651liIi.OooO0o, new i1I1I1l(new C9515LillIL((C6456l1ilL) map.get(AbstractC9852lIli.OooO0Oo), 1, (C6456l1ilL) map.get(AbstractC9852lIli.OooO0o))));
            OooO00o3.put(r1.m21530OooO00o(), r1);
        }
        return OooO00o3;
    }
}
