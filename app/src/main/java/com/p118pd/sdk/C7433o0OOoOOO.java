package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.Calendar;

/* renamed from: com.pd.sdk.o0OOoOOO  reason: case insensitive filesystem */
public class C7433o0OOoOOO implements AbstractC7416o0OOo000, AbstractC7410o0OOOoOo {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public static final int o00oO0O = 0;
    public static final int o0OO00O = 6;
    public static final int o0OOO0o = 4;
    public static final int o0Oo0oo = 5;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public static final int oo0o0Oo = 7;
    public C7434o0OOoOo OooO00o;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f20249o0ooOOo;

    /* renamed from: com.pd.sdk.o0OOoOOO$OooO00o */
    public class OooO00o implements AbstractC7457o0Oo0O0O {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7434o0OOoOo f20250OooO00o;

        public OooO00o(C7434o0OOoOo o0ooooo) {
            this.f20250OooO00o = o0ooooo;
        }

        @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
        public C7710o0ooO0O0 OooO00o() {
            return this.f20250OooO00o.m19030OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
        public String OooO0O0() {
            return this.f20250OooO00o.OooO0O0(1).m19037OooO0O0();
        }

        @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
        public String getValue() {
            return this.f20250OooO00o.m19037OooO0O0();
        }

        public String toString() {
            return this.f20250OooO00o.m19037OooO0O0().toString();
        }
    }

    /* renamed from: com.pd.sdk.o0OOoOOO$OooO0O0 */
    public class OooO0O0 implements AbstractC7457o0Oo0O0O {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7434o0OOoOo f20251OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f20252OooO00o;

        public OooO0O0(Object obj, C7434o0OOoOo o0ooooo) {
            this.f20252OooO00o = obj;
            this.f20251OooO00o = o0ooooo;
        }

        @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
        public C7710o0ooO0O0 OooO00o() {
            return this.f20251OooO00o.m19030OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
        public String OooO0O0() {
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC7457o0Oo0O0O
        public String getValue() {
            Object obj = this.f20252OooO00o;
            if (obj != null) {
                return obj.toString();
            }
            return null;
        }

        public String toString() {
            return this.f20252OooO00o.toString();
        }
    }

    public C7433o0OOoOOO() {
        this.f20249o0ooOOo = null;
        this.OooO00o = new C7434o0OOoOo(null, null, null);
    }

    public C7433o0OOoOOO(C7434o0OOoOo o0ooooo) {
        this.f20249o0ooOOo = null;
        this.OooO00o = o0ooooo;
    }

    private Object OooO00o(int i, C7434o0OOoOo o0ooooo) throws XMPException {
        String OooO0O02 = o0ooooo.m19037OooO0O0();
        switch (i) {
            case 1:
                return new Boolean(C7420o0OOo0O0.m18984OooO00o(OooO0O02));
            case 2:
                return new Integer(C7420o0OOo0O0.m18981OooO00o(OooO0O02));
            case 3:
                return new Long(C7420o0OOo0O0.m18982OooO00o(OooO0O02));
            case 4:
                return new Double(C7420o0OOo0O0.OooO00o(OooO0O02));
            case 5:
                return C7420o0OOo0O0.m18983OooO00o(OooO0O02);
            case 6:
                return C7420o0OOo0O0.m18983OooO00o(OooO0O02).OooO00o();
            case 7:
                return C7420o0OOo0O0.m18985OooO00o(OooO0O02);
            default:
                if (OooO0O02 == null && !o0ooooo.m19030OooO00o().OooO0oo()) {
                    OooO0O02 = "";
                }
                return OooO0O02;
        }
    }

    private void OooO00o(C7434o0OOoOo o0ooooo, int i, String str, C7710o0ooO0O0 o0ooo0o0, boolean z) throws XMPException {
        C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo("[]", null);
        C7710o0ooO0O0 OooO00o2 = C7437o0OOoo0.OooO00o(o0ooo0o0, str);
        int OooO00o3 = o0ooooo.OooO00o();
        if (z) {
            OooO00o3++;
        }
        if (i == -1) {
            i = OooO00o3;
        }
        if (1 > i || i > OooO00o3) {
            throw new XMPException("Array index out of bounds", 104);
        }
        if (!z) {
            o0ooooo.OooO0o(i);
        }
        o0ooooo.OooO00o(i, o0ooooo2);
        OooO00o(o0ooooo2, (Object) str, OooO00o2, false);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    public int OooO00o(String str, String str2) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o2 == null) {
            return 0;
        }
        if (OooO00o2.m19030OooO00o().OooO0Oo()) {
            return OooO00o2.OooO00o();
        }
        throw new XMPException("The named property is not an array", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7412o0OOOoo0 m19007OooO00o(String str, String str2) throws XMPException {
        return (AbstractC7412o0OOOoo0) m19014OooO00o(str, str2, 5);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7414o0OOOooo OooO00o() throws XMPException {
        return OooO00o((String) null, (String) null, (C7452o0Oo00oO) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7414o0OOOooo OooO00o(C7452o0Oo00oO o0oo00oo) throws XMPException {
        return OooO00o((String) null, (String) null, o0oo00oo);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7414o0OOOooo OooO00o(String str, String str2, C7452o0Oo00oO o0oo00oo) throws XMPException {
        return new C7432o0OOoOO(this, str, str2, o0oo00oo);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7434o0OOoOo m19008OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC7457o0Oo0O0O m19009OooO00o(String str, String str2) throws XMPException {
        return OooO0O0(str, str2, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7457o0Oo0O0O OooO00o(String str, String str2, int i) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        return m19009OooO00o(str, C7417o0OOo00O.OooO00o(str2, i));
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7457o0Oo0O0O OooO00o(String str, String str2, String str3, String str4) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0OO(str2);
        return m19009OooO00o(str, str2 + C7417o0OOo00O.OooO0O0(str3, str4));
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Boolean m19010OooO00o(String str, String str2) throws XMPException {
        return (Boolean) m19014OooO00o(str, str2, 1);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Double m19011OooO00o(String str, String str2) throws XMPException {
        return (Double) m19014OooO00o(str, str2, 4);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Integer m19012OooO00o(String str, String str2) throws XMPException {
        return (Integer) m19014OooO00o(str, str2, 2);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Long m19013OooO00o(String str, String str2) throws XMPException {
        return (Long) m19014OooO00o(str, str2, 3);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m19014OooO00o(String str, String str2, int i) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0OO(str2);
        C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o2 == null) {
            return null;
        }
        if (i == 0 || !OooO00o2.m19030OooO00o().OooO0oo()) {
            return OooO00o(i, OooO00o2);
        }
        throw new XMPException("Property must be simple when a value type is requested", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19015OooO00o() {
        return m19008OooO00o().OooO00o(true);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19016OooO00o(String str, String str2) throws XMPException {
        return (String) m19014OooO00o(str, str2, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Calendar m19017OooO00o(String str, String str2) throws XMPException {
        return (Calendar) m19014OooO00o(str, str2, 6);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19018OooO00o() {
        this.OooO00o.OooO0o0();
    }

    public void OooO00o(C7434o0OOoOo o0ooooo, Object obj, C7710o0ooO0O0 o0ooo0o0, boolean z) throws XMPException {
        if (z) {
            o0ooooo.m19039OooO0O0();
        }
        o0ooooo.m19030OooO00o().OooO00o(o0ooo0o0);
        if (!o0ooooo.m19030OooO00o().OooO0oo()) {
            C7437o0OOoo0.OooO00o(o0ooooo, obj);
        } else if (obj == null || obj.toString().length() <= 0) {
            o0ooooo.m19042OooO0OO();
        } else {
            throw new XMPException("Composite nodes can't have values", 102);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(C7448o0Oo0 o0oo0) throws XMPException {
        if (o0oo0 == null) {
            o0oo0 = new C7448o0Oo0();
        }
        C7438o0OOoo0O.OooO00o(this, o0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str) {
        this.OooO00o.m19035OooO00o(str);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19019OooO00o(String str, String str2) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO0OO(str2);
            C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
            if (OooO00o2 != null) {
                C7437o0OOoo0.OooO00o(OooO00o2);
            }
        } catch (XMPException unused) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, double d) throws XMPException {
        OooO00o(str, str2, new Double(d), (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, double d, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, new Double(d), o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19020OooO00o(String str, String str2, int i) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO00o(str2);
            m19019OooO00o(str, C7417o0OOo00O.OooO00o(str2, i));
        } catch (XMPException unused) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, int i, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, new Integer(i), o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, int i, String str3) throws XMPException {
        OooO0O0(str, str2, i, str3, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, int i, String str3, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o2 != null) {
            OooO00o(OooO00o2, i, str3, o0ooo0o0, false);
            return;
        }
        throw new XMPException("Specified array does not exist", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, long j) throws XMPException {
        OooO00o(str, str2, new Long(j), (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, long j, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, new Long(j), o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, AbstractC7412o0OOOoo0 o0ooooo0) throws XMPException {
        OooO00o(str, str2, (Object) o0ooooo0, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, AbstractC7412o0OOOoo0 o0ooooo0, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, (Object) o0ooooo0, o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, C7710o0ooO0O0 o0ooo0o0, String str3, C7710o0ooO0O0 o0ooo0o02) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        if (o0ooo0o0 == null) {
            o0ooo0o0 = new C7710o0ooO0O0();
        }
        if (o0ooo0o0.OooO()) {
            C7710o0ooO0O0 OooO00o2 = C7437o0OOoo0.OooO00o(o0ooo0o0, (Object) null);
            C7445o0OOooo0 OooO00o3 = C7444o0OOooo.OooO00o(str, str2);
            C7434o0OOoOo OooO00o4 = C7437o0OOoo0.OooO00o(this.OooO00o, OooO00o3, false, (C7710o0ooO0O0) null);
            if (OooO00o4 != null) {
                if (!OooO00o4.m19030OooO00o().OooO0Oo()) {
                    throw new XMPException("The named property is not an array", 102);
                }
            } else if (OooO00o2.OooO0Oo()) {
                OooO00o4 = C7437o0OOoo0.OooO00o(this.OooO00o, OooO00o3, true, OooO00o2);
                if (OooO00o4 == null) {
                    throw new XMPException("Failure creating array node", 102);
                }
            } else {
                throw new XMPException("Explicit arrayOptions required to create new array", 103);
            }
            OooO00o(OooO00o4, -1, str3, o0ooo0o02, true);
            return;
        }
        throw new XMPException("Only array form flags allowed for arrayOptions", 103);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, Object obj) throws XMPException {
        OooO00o(str, str2, obj, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, Object obj, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0OO(str2);
        C7710o0ooO0O0 OooO00o2 = C7437o0OOoo0.OooO00o(o0ooo0o0, obj);
        C7434o0OOoOo OooO00o3 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), true, OooO00o2);
        if (OooO00o3 != null) {
            OooO00o(OooO00o3, obj, OooO00o2, false);
            return;
        }
        throw new XMPException("Specified property does not exist", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, String str3) throws XMPException {
        OooO00o(str, str2, (C7710o0ooO0O0) null, str3, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19021OooO00o(String str, String str2, String str3, String str4) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO0o(str2);
            m19019OooO00o(str, str2 + C7417o0OOo00O.OooO0OO(str3, str4));
        } catch (XMPException unused) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, String str3, String str4, String str5) throws XMPException {
        OooO0O0(str, str2, str3, str4, str5, null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, String str3, String str4, String str5, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0o(str2);
        OooO00o(str, str2 + C7417o0OOo00O.OooO0OO(str3, str4), str5, o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, Calendar calendar) throws XMPException {
        OooO00o(str, str2, (Object) calendar, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, Calendar calendar, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, (Object) calendar, o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, boolean z) throws XMPException {
        OooO00o(str, str2, z ? AbstractC7410o0OOOoOo.OooooOo : AbstractC7410o0OOOoOo.Oooooo0, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, boolean z, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, z ? AbstractC7410o0OOOoOo.OooooOo : AbstractC7410o0OOOoOo.Oooooo0, o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, byte[] bArr) throws XMPException {
        OooO00o(str, str2, (Object) bArr, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO00o(String str, String str2, byte[] bArr, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        OooO00o(str, str2, (Object) bArr, o0ooo0o0);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19022OooO00o(String str, String str2) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO0OO(str2);
            return C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, null) != null;
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19023OooO00o(String str, String str2, int i) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO00o(str2);
            return m19022OooO00o(str, C7417o0OOo00O.OooO00o(str2, i));
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19024OooO00o(String str, String str2, String str3, String str4) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO0OO(str2);
            String OooO0O02 = C7417o0OOo00O.OooO0O0(str3, str4);
            return m19022OooO00o(str, str2 + OooO0O02);
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19025OooO00o(String str, String str2) throws XMPException {
        return (byte[]) m19014OooO00o(str, str2, 7);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7457o0Oo0O0O OooO0O0(String str, String str2, int i) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0OO(str2);
        C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o2 == null) {
            return null;
        }
        if (i == 0 || !OooO00o2.m19030OooO00o().OooO0oo()) {
            return new OooO0O0(OooO00o(i, OooO00o2), OooO00o2);
        }
        throw new XMPException("Property must be simple when a value type is requested", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7457o0Oo0O0O OooO0O0(String str, String str2, String str3, String str4) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        C7426o0OOo0oo.OooO0o0(str4);
        String OooO00o2 = str3 != null ? C7431o0OOoO0o.OooO00o(str3) : null;
        String OooO00o3 = C7431o0OOoO0o.OooO00o(str4);
        C7434o0OOoOo OooO00o4 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o4 == null) {
            return null;
        }
        Object[] OooO00o5 = C7437o0OOoo0.m19049OooO00o(OooO00o4, OooO00o2, OooO00o3);
        int intValue = ((Integer) OooO00o5[0]).intValue();
        C7434o0OOoOo o0ooooo = (C7434o0OOoOo) OooO00o5[1];
        if (intValue != 0) {
            return new OooO00o(o0ooooo);
        }
        return null;
    }

    public void OooO0O0(String str) {
        this.f20249o0ooOOo = str;
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19026OooO0O0(String str, String str2, int i) throws XMPException {
        OooO00o(str, str2, new Integer(i), (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO0O0(String str, String str2, int i, String str3) throws XMPException {
        OooO00o(str, str2, i, str3, (C7710o0ooO0O0) null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO0O0(String str, String str2, int i, String str3, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO00o(str2);
        C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(this.OooO00o, C7444o0OOooo.OooO00o(str, str2), false, (C7710o0ooO0O0) null);
        if (OooO00o2 != null) {
            OooO00o(OooO00o2, i, str3, o0ooo0o0, true);
            return;
        }
        throw new XMPException("Specified array does not exist", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19027OooO0O0(String str, String str2, String str3, String str4) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO0OO(str2);
            m19019OooO00o(str, str2 + C7417o0OOo00O.OooO0O0(str3, str4));
        } catch (XMPException unused) {
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO0O0(String str, String str2, String str3, String str4, String str5) throws XMPException {
        OooO00o(str, str2, str3, str4, str5, null);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO0O0(String str, String str2, String str3, String str4, String str5, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0OO(str2);
        if (m19022OooO00o(str, str2)) {
            OooO00o(str, str2 + C7417o0OOo00O.OooO0O0(str3, str4), str5, o0ooo0o0);
            return;
        }
        throw new XMPException("Specified property does not exist!", 102);
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000, com.p118pd.sdk.AbstractC7416o0OOo000
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19028OooO0O0(String str, String str2, String str3, String str4) {
        try {
            C7426o0OOo0oo.OooO0Oo(str);
            C7426o0OOo0oo.OooO0o(str2);
            String OooO0OO = C7417o0OOo00O.OooO0OO(str3, str4);
            return m19022OooO00o(str, str2 + OooO0OO);
        } catch (XMPException unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public AbstractC7457o0Oo0O0O OooO0OO(String str, String str2, String str3, String str4) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0o(str2);
        return m19009OooO00o(str, str2 + C7417o0OOo00O.OooO0OO(str3, str4));
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public String OooO0OO() {
        return this.f20249o0ooOOo;
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public void OooO0OO(String str, String str2, String str3, String str4, String str5) throws XMPException {
        OooO0OO(str, str2, str3, str4, str5, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r2 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r8.OooO00o() <= 1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r8.OooO0Oo(r2);
        r8.OooO00o(1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r10 = com.p118pd.sdk.C7437o0OOoo0.m19049OooO00o(r8, r10, r11);
        r0 = ((java.lang.Integer) r10[0]).intValue();
        r10 = (com.p118pd.sdk.C7434o0OOoOo) r10[1];
        r3 = com.p118pd.sdk.AbstractC7410o0OOOoOo.OoooooO.equals(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r0 == 0) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r0 == 1) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        if (r0 == 2) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        if (r0 == 3) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r0 == 4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        if (r0 != 5) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cb, code lost:
        com.p118pd.sdk.C7437o0OOoo0.m19048OooO00o(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        if (r3 == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        throw new com.adobe.xmp.XMPException("Unexpected result from ChooseLocalizedText", 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        if (r2 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e2, code lost:
        if (r8.OooO00o() != 1) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e4, code lost:
        r2.m19040OooO0O0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        com.p118pd.sdk.C7437o0OOoo0.m19048OooO00o(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        com.p118pd.sdk.C7437o0OOoo0.m19048OooO00o(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ef, code lost:
        if (r3 == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r9 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
        if (r2 == r10) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        if (r2 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        if (r2.m19037OooO0O0().equals(r10.m19037OooO0O0()) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0107, code lost:
        r2.m19040OooO0O0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        r10.m19040OooO0O0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010e, code lost:
        if (r3 != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        if (r9 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0112, code lost:
        if (r2 == r10) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        if (r2 == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        if (r2.m19037OooO0O0().equals(r10.m19037OooO0O0()) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        r10 = r8.m19032OooO00o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        if (r10.hasNext() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        r11 = (com.p118pd.sdk.C7434o0OOoOo) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0135, code lost:
        if (r11 == r2) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        r0 = r11.m19037OooO0O0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013b, code lost:
        if (r2 == null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        r3 = r2.m19037OooO0O0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0142, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0147, code lost:
        if (r0.equals(r3) != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014a, code lost:
        r11.m19040OooO0O0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014e, code lost:
        if (r2 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0150, code lost:
        r2.m19040OooO0O0(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0154, code lost:
        com.p118pd.sdk.C7437o0OOoo0.m19048OooO00o(r8, com.p118pd.sdk.AbstractC7410o0OOOoOo.OoooooO, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0157, code lost:
        if (r3 != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0159, code lost:
        com.p118pd.sdk.C7437o0OOoo0.m19048OooO00o(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (r9 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0163, code lost:
        if (r8.OooO00o() != 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0165, code lost:
        com.p118pd.sdk.C7437o0OOoo0.m19048OooO00o(r8, com.p118pd.sdk.AbstractC7410o0OOOoOo.OoooooO, r12);
     */
    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0OO(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.p118pd.sdk.C7710o0ooO0O0 r13) throws com.adobe.xmp.XMPException {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7433o0OOoOOO.OooO0OO(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.pd.sdk.o0ooO0O0):void");
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000
    public String OooO0oO() {
        return this.OooO00o.m19031OooO00o() != null ? this.OooO00o.m19031OooO00o() : "";
    }

    @Override // com.p118pd.sdk.AbstractC7416o0OOo000, java.lang.Object
    public Object clone() {
        return new C7433o0OOoOOO((C7434o0OOoOo) this.OooO00o.clone());
    }
}
