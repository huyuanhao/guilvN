package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.Li */
public class C1682Li extends AbstractC5738Lil {
    public static final C1682Li OooO00o = new C1682Li(new C6513lIiI(0));

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map f16546OooO00o;
    public static final C1682Li OooO0O0 = new C1682Li(new C6513lIiI(2));
    public static final C1682Li OooO0OO = new C1682Li(new C6513lIiI(3));
    public static final C1682Li OooO0Oo = new C1682Li(new C6513lIiI(4));
    public static final C1682Li OooO0o = new C1682Li(new C6513lIiI(6));
    public static final C1682Li OooO0o0 = new C1682Li(new C6513lIiI(5));
    public static final C1682Li OooO0oO = new C1682Li(new C6513lIiI(7));

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6513lIiI f16547OooO00o;

    static {
        HashMap hashMap = new HashMap();
        f16546OooO00o = hashMap;
        C1682Li li = OooO00o;
        hashMap.put(li.f16547OooO00o, li);
        Map map = f16546OooO00o;
        C1682Li li2 = OooO0O0;
        map.put(li2.f16547OooO00o, li2);
        Map map2 = f16546OooO00o;
        C1682Li li3 = OooO0OO;
        map2.put(li3.f16547OooO00o, li3);
        Map map3 = f16546OooO00o;
        C1682Li li4 = OooO0Oo;
        map3.put(li4.f16547OooO00o, li4);
        Map map4 = f16546OooO00o;
        C1682Li li5 = OooO0o0;
        map4.put(li5.f16547OooO00o, li5);
        Map map5 = f16546OooO00o;
        C1682Li li6 = OooO0o;
        map5.put(li6.f16547OooO00o, li6);
        Map map6 = f16546OooO00o;
        C1682Li li7 = OooO0oO;
        map6.put(li7.f16547OooO00o, li7);
    }

    public C1682Li(C6513lIiI r1) {
        this.f16547OooO00o = r1;
    }

    public static C1682Li OooO00o(Object obj) {
        if (obj instanceof C1682Li) {
            return (C1682Li) obj;
        }
        if (obj == null) {
            return null;
        }
        C1682Li li = (C1682Li) f16546OooO00o.get(C6513lIiI.OooO00o(obj));
        if (li != null) {
            return li;
        }
        throw new IllegalArgumentException("unknown object in getInstance(): " + obj.getClass().getName());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.f16547OooO00o;
    }
}
