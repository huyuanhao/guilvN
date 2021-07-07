package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.i丨I11IL  reason: invalid class name */
public class iI11IL extends AbstractC5738Lil {
    public Hashtable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f18143OooO00o;

    public iI11IL(I11li1 i11li1) {
        this.OooO00o = new Hashtable();
        this.f18143OooO00o = new Vector();
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            C5237III OooO00o3 = C5237III.OooO00o(OooO00o2.nextElement());
            if (!this.OooO00o.containsKey(OooO00o3.OooO00o())) {
                this.OooO00o.put(OooO00o3.OooO00o(), OooO00o3);
                this.f18143OooO00o.addElement(OooO00o3.OooO00o());
            } else {
                throw new IllegalArgumentException("repeated extension found: " + OooO00o3.OooO00o());
            }
        }
    }

    public iI11IL(C5237III r3) {
        this.OooO00o = new Hashtable();
        Vector vector = new Vector();
        this.f18143OooO00o = vector;
        vector.addElement(r3.OooO00o());
        this.OooO00o.put(r3.OooO00o(), r3);
    }

    public iI11IL(C5237III[] r5) {
        this.OooO00o = new Hashtable();
        this.f18143OooO00o = new Vector();
        for (int i = 0; i != r5.length; i++) {
            C5237III r1 = r5[i];
            this.f18143OooO00o.addElement(r1.OooO00o());
            this.OooO00o.put(r1.OooO00o(), r1);
        }
    }

    public static iI11IL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static iI11IL OooO00o(Object obj) {
        if (obj instanceof iI11IL) {
            return (iI11IL) obj;
        }
        if (obj != null) {
            return new iI11IL(I11li1.OooO00o(obj));
        }
        return null;
    }

    private LlLI1[] OooO00o(Vector vector) {
        int size = vector.size();
        LlLI1[] llLI1Arr = new LlLI1[size];
        for (int i = 0; i != size; i++) {
            llLI1Arr[i] = (LlLI1) vector.elementAt(i);
        }
        return llLI1Arr;
    }

    private LlLI1[] OooO00o(boolean z) {
        Vector vector = new Vector();
        for (int i = 0; i != this.f18143OooO00o.size(); i++) {
            Object elementAt = this.f18143OooO00o.elementAt(i);
            if (((C5237III) this.OooO00o.get(elementAt)).m15434OooO00o() == z) {
                vector.addElement(elementAt);
            }
        }
        return OooO00o(vector);
    }

    public C5237III OooO00o(LlLI1 llLI1) {
        return (C5237III) this.OooO00o.get(llLI1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17472OooO00o(LlLI1 llLI1) {
        C5237III OooO00o2 = OooO00o(llLI1);
        if (OooO00o2 != null) {
            return OooO00o2.m15435OooO0O0();
        }
        return null;
    }

    public Enumeration OooO00o() {
        return this.f18143OooO00o.elements();
    }

    public boolean OooO00o(iI11IL r6) {
        if (this.OooO00o.size() != r6.OooO00o.size()) {
            return false;
        }
        Enumeration keys = this.OooO00o.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            if (!this.OooO00o.get(nextElement).equals(r6.OooO00o.get(nextElement))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1[] m17473OooO00o() {
        return OooO00o(true);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        Enumeration elements = this.f18143OooO00o.elements();
        while (elements.hasMoreElements()) {
            r0.OooO00o((C5237III) this.OooO00o.get((LlLI1) elements.nextElement()));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public LlLI1[] m17474OooO0O0() {
        return OooO00o(this.f18143OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public LlLI1[] OooO0OO() {
        return OooO00o(false);
    }
}
