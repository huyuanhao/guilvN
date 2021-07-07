package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨l丨L1  reason: invalid class name and case insensitive filesystem */
public class C9731lL1 {
    public Hashtable OooO00o;

    public C9731lL1(I11L i11l) {
        this.OooO00o = new Hashtable();
        for (int i = 0; i != i11l.size(); i++) {
            C9476LIL1li OooO00o2 = C9476LIL1li.OooO00o(i11l.OooO00o(i));
            OooO00o(OooO00o2.m21530OooO00o(), OooO00o2);
        }
    }

    public C9731lL1(iILLL1 r4) {
        this.OooO00o = new Hashtable();
        for (int i = 0; i != r4.OooO00o(); i++) {
            C9476LIL1li OooO00o2 = C9476LIL1li.OooO00o(r4.OooO00o(i));
            OooO00o(OooO00o2.m21530OooO00o(), OooO00o2);
        }
    }

    public C9731lL1(l1iII r1) {
        this(I11L.OooO00o((Object) r1.OooO0O0()));
    }

    public C9731lL1(C9476LIL1li r2) {
        this.OooO00o = new Hashtable();
        OooO00o(r2.m21530OooO00o(), r2);
    }

    public C9731lL1(Hashtable hashtable) {
        this.OooO00o = new Hashtable();
        this.OooO00o = OooO00o(hashtable);
    }

    private Hashtable OooO00o(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private void OooO00o(LlLI1 llLI1, C9476LIL1li r4) {
        Vector vector;
        Object obj = this.OooO00o.get(llLI1);
        if (obj == null) {
            this.OooO00o.put(llLI1, r4);
            return;
        }
        if (obj instanceof C9476LIL1li) {
            vector = new Vector();
            vector.addElement(obj);
        } else {
            vector = (Vector) obj;
        }
        vector.addElement(r4);
        this.OooO00o.put(llLI1, vector);
    }

    public int OooO00o() {
        Enumeration elements = this.OooO00o.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            i = nextElement instanceof Vector ? i + ((Vector) nextElement).size() : i + 1;
        }
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iILLL1 m21785OooO00o() {
        iILLL1 r0 = new iILLL1();
        Enumeration elements = this.OooO00o.elements();
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            if (nextElement instanceof Vector) {
                Enumeration elements2 = ((Vector) nextElement).elements();
                while (elements2.hasMoreElements()) {
                    r0.OooO00o(C9476LIL1li.OooO00o(elements2.nextElement()));
                }
            } else {
                r0.OooO00o(C9476LIL1li.OooO00o(nextElement));
            }
        }
        return r0;
    }

    public iILLL1 OooO00o(LlLI1 llLI1) {
        iILLL1 r0 = new iILLL1();
        Object obj = this.OooO00o.get(llLI1);
        if (obj instanceof Vector) {
            Enumeration elements = ((Vector) obj).elements();
            while (elements.hasMoreElements()) {
                r0.OooO00o((C9476LIL1li) elements.nextElement());
            }
        } else if (obj != null) {
            r0.OooO00o((C9476LIL1li) obj);
        }
        return r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1iII m21786OooO00o() {
        return new l1iII(m21785OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9476LIL1li m21787OooO00o(LlLI1 llLI1) {
        Object obj = this.OooO00o.get(llLI1);
        return obj instanceof Vector ? (C9476LIL1li) ((Vector) obj).elementAt(0) : (C9476LIL1li) obj;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m21788OooO00o(LlLI1 llLI1) {
        C9731lL1 r0 = new C9731lL1(this.OooO00o);
        r0.OooO00o.remove(llLI1);
        return r0;
    }

    public C9731lL1 OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL r5) {
        C9731lL1 r0 = new C9731lL1(this.OooO00o);
        r0.OooO00o(llLI1, new C9476LIL1li(llLI1, new i1I1I1l(r5)));
        return r0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Hashtable m21789OooO00o() {
        return OooO00o(this.OooO00o);
    }
}
