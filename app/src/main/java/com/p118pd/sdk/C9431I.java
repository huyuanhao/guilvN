package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨I丨  reason: invalid class name and case insensitive filesystem */
public class C9431I extends AbstractC5738Lil {
    public static final LlLI1 o00OoOOo = new LlLI1("2.5.29.9");
    public static final LlLI1 o00OoOo = new LlLI1("2.5.29.15");
    public static final LlLI1 o00OoOo0 = new LlLI1("2.5.29.14");
    public static final LlLI1 o00OoOoo = new LlLI1("2.5.29.16");
    public static final LlLI1 o00Ooo0 = new LlLI1("2.5.29.18");
    public static final LlLI1 o00Ooo00 = new LlLI1("2.5.29.17");
    public static final LlLI1 o00Ooo0O = new LlLI1("2.5.29.19");
    public static final LlLI1 o00Ooo0o = new LlLI1("2.5.29.20");
    public static final LlLI1 o00OooO = new LlLI1("2.5.29.23");
    public static final LlLI1 o00OooO0 = new LlLI1("2.5.29.21");
    public static final LlLI1 o00OooOO = new LlLI1("2.5.29.24");
    public static final LlLI1 o00OooOo = new LlLI1("2.5.29.27");
    public static final LlLI1 o00OoooO = new LlLI1("2.5.29.29");
    public static final LlLI1 o00Ooooo = new LlLI1("2.5.29.30");
    public static final LlLI1 o00o0 = new LlLI1("1.3.6.1.5.5.7.1.3");
    public static final LlLI1 o00o00 = new LlLI1("2.5.29.37");
    public static final LlLI1 o00o000 = new LlLI1("2.5.29.32");
    public static final LlLI1 o00o0000 = new LlLI1("2.5.29.31");
    public static final LlLI1 o00o000O = new LlLI1("2.5.29.33");
    public static final LlLI1 o00o000o = new LlLI1("2.5.29.35");
    public static final LlLI1 o00o00O0 = new LlLI1("2.5.29.46");
    public static final LlLI1 o00o00Oo = new LlLI1("2.5.29.54");
    public static final LlLI1 o00o00o = new LlLI1("1.3.6.1.5.5.7.1.11");
    public static final LlLI1 o00o00o0 = new LlLI1("1.3.6.1.5.5.7.1.1");
    public static final LlLI1 o00o00oO = new LlLI1("1.3.6.1.5.5.7.1.12");
    public static final LlLI1 o00o00oo = new LlLI1("1.3.6.1.5.5.7.1.2");
    public static final LlLI1 o00o0O0 = new LlLI1("2.5.29.56");
    public static final LlLI1 o00o0O00 = new LlLI1("1.3.6.1.5.5.7.1.4");
    public static final LlLI1 o00o0O0O = new LlLI1("2.5.29.55");
    public static final LlLI1 o0O00o0 = new LlLI1("2.5.29.28");
    public static final LlLI1 oo00oO = new LlLI1("2.5.29.36");
    public Hashtable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f22969OooO00o;

    public C9431I(I11li1 i11li1) {
        this.OooO00o = new Hashtable();
        this.f22969OooO00o = new Vector();
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            I11li1 OooO00o3 = I11li1.OooO00o(OooO00o2.nextElement());
            if (OooO00o3.size() == 3) {
                this.OooO00o.put(OooO00o3.OooO00o(0), new C5551IiL(C5514IL.OooO00o(OooO00o3.OooO00o(1)), AbstractC6804llL1ii.OooO00o(OooO00o3.OooO00o(2))));
            } else if (OooO00o3.size() == 2) {
                this.OooO00o.put(OooO00o3.OooO00o(0), new C5551IiL(false, AbstractC6804llL1ii.OooO00o(OooO00o3.OooO00o(1))));
            } else {
                throw new IllegalArgumentException("Bad sequence size: " + OooO00o3.size());
            }
            this.f22969OooO00o.addElement(OooO00o3.OooO00o(0));
        }
    }

    public C9431I(Hashtable hashtable) {
        this((Vector) null, hashtable);
    }

    public C9431I(Vector vector, Hashtable hashtable) {
        this.OooO00o = new Hashtable();
        this.f22969OooO00o = new Vector();
        Enumeration keys = vector == null ? hashtable.keys() : vector.elements();
        while (keys.hasMoreElements()) {
            this.f22969OooO00o.addElement(LlLI1.OooO00o(keys.nextElement()));
        }
        Enumeration elements = this.f22969OooO00o.elements();
        while (elements.hasMoreElements()) {
            LlLI1 OooO00o2 = LlLI1.OooO00o(elements.nextElement());
            this.OooO00o.put(OooO00o2, (C5551IiL) hashtable.get(OooO00o2));
        }
    }

    public C9431I(Vector vector, Vector vector2) {
        this.OooO00o = new Hashtable();
        this.f22969OooO00o = new Vector();
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.f22969OooO00o.addElement(elements.nextElement());
        }
        int i = 0;
        Enumeration elements2 = this.f22969OooO00o.elements();
        while (elements2.hasMoreElements()) {
            this.OooO00o.put((LlLI1) elements2.nextElement(), (C5551IiL) vector2.elementAt(i));
            i++;
        }
    }

    public static C9431I OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9431I OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9431I)) {
            return (C9431I) obj;
        }
        if (obj instanceof I11li1) {
            return new C9431I((I11li1) obj);
        }
        if (obj instanceof iI11IL) {
            return new C9431I((I11li1) ((iI11IL) obj).OooO0O0());
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return OooO00o(((AbstractC5903LlLLL) obj).OooO0o());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
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
        for (int i = 0; i != this.f22969OooO00o.size(); i++) {
            Object elementAt = this.f22969OooO00o.elementAt(i);
            if (((C5551IiL) this.OooO00o.get(elementAt)).m15829OooO00o() == z) {
                vector.addElement(elementAt);
            }
        }
        return OooO00o(vector);
    }

    public C5551IiL OooO00o(LlLI1 llLI1) {
        return (C5551IiL) this.OooO00o.get(llLI1);
    }

    public Enumeration OooO00o() {
        return this.f22969OooO00o.elements();
    }

    public boolean OooO00o(C9431I r6) {
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
    public LlLI1[] m21470OooO00o() {
        return OooO00o(true);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        Enumeration elements = this.f22969OooO00o.elements();
        while (elements.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) elements.nextElement();
            C5551IiL r3 = (C5551IiL) this.OooO00o.get(llLI1);
            iILLL1 r4 = new iILLL1();
            r4.OooO00o(llLI1);
            if (r3.m15829OooO00o()) {
                r4.OooO00o(C5514IL.OooO0O0);
            }
            r4.OooO00o(r3.OooO00o());
            r0.OooO00o(new C5707LiL1(r4));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public LlLI1[] m21471OooO0O0() {
        return OooO00o(this.f22969OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public LlLI1[] OooO0OO() {
        return OooO00o(false);
    }
}
