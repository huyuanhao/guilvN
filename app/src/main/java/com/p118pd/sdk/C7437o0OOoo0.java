package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* renamed from: com.pd.sdk.o0OOoo0  reason: case insensitive filesystem */
public class C7437o0OOoo0 implements AbstractC7410o0OOOoOo {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public static final int o00oO0O = 0;
    public static final int o0OOO0o = 4;
    public static final int o0Oo0oo = 5;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;

    public static int OooO00o(C7434o0OOoOo o0ooooo, String str) throws XMPException {
        if (o0ooooo.m19030OooO00o().OooO0Oo()) {
            for (int i = 1; i <= o0ooooo.OooO00o(); i++) {
                C7434o0OOoOo OooO00o = o0ooooo.OooO00o(i);
                if (OooO00o.OooO0oO() && AbstractC7410o0OOOoOo.Ooooooo.equals(OooO00o.OooO0O0(1).m19031OooO00o()) && str.equals(OooO00o.OooO0O0(1).m19037OooO0O0())) {
                    return i;
                }
            }
            return -1;
        }
        throw new XMPException("Language item must be used on array", 102);
    }

    public static int OooO00o(C7434o0OOoOo o0ooooo, String str, String str2) throws XMPException {
        int i = -1;
        for (int i2 = 1; i2 <= o0ooooo.OooO00o() && i < 0; i2++) {
            C7434o0OOoOo OooO00o = o0ooooo.OooO00o(i2);
            if (OooO00o.m19030OooO00o().OooOOO0()) {
                int i3 = 1;
                while (true) {
                    if (i3 > OooO00o.OooO00o()) {
                        break;
                    }
                    C7434o0OOoOo OooO00o2 = OooO00o.OooO00o(i3);
                    if (str.equals(OooO00o2.m19031OooO00o()) && str2.equals(OooO00o2.m19037OooO0O0())) {
                        i = i2;
                        break;
                    }
                    i3++;
                }
            } else {
                throw new XMPException("Field selector must be used on array of struct", 102);
            }
        }
        return i;
    }

    public static int OooO00o(C7434o0OOoOo o0ooooo, String str, String str2, int i) throws XMPException {
        if (AbstractC7410o0OOOoOo.Ooooooo.equals(str)) {
            int OooO00o = OooO00o(o0ooooo, C7431o0OOoO0o.OooO00o(str2));
            if (OooO00o >= 0 || (i & 4096) <= 0) {
                return OooO00o;
            }
            C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo("[]", null);
            o0ooooo2.OooO0O0(new C7434o0OOoOo(AbstractC7410o0OOOoOo.Ooooooo, AbstractC7410o0OOOoOo.OoooooO, null));
            o0ooooo.OooO00o(1, o0ooooo2);
            return 1;
        }
        for (int i2 = 1; i2 < o0ooooo.OooO00o(); i2++) {
            Iterator OooO0O02 = o0ooooo.OooO00o(i2).m19038OooO0O0();
            while (OooO0O02.hasNext()) {
                C7434o0OOoOo o0ooooo3 = (C7434o0OOoOo) OooO0O02.next();
                if (str.equals(o0ooooo3.m19031OooO00o()) && str2.equals(o0ooooo3.m19037OooO0O0())) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static int OooO00o(C7434o0OOoOo o0ooooo, String str, boolean z) throws XMPException {
        try {
            int parseInt = Integer.parseInt(str.substring(1, str.length() - 1));
            if (parseInt >= 1) {
                if (z && parseInt == o0ooooo.OooO00o() + 1) {
                    C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo("[]", null);
                    o0ooooo2.OooO0Oo(true);
                    o0ooooo.OooO00o(o0ooooo2);
                }
                return parseInt;
            }
            throw new XMPException("Array index must be larger than zero", 102);
        } catch (NumberFormatException unused) {
            throw new XMPException("Array index not digits.", 102);
        }
    }

    public static C7434o0OOoOo OooO00o(C7434o0OOoOo o0ooooo, C7445o0OOooo0 o0ooooo0, boolean z, C7710o0ooO0O0 o0ooo0o0) throws XMPException {
        C7434o0OOoOo o0ooooo2;
        if (o0ooooo0 == null || o0ooooo0.OooO00o() == 0) {
            throw new XMPException("Empty XMPPath", 102);
        }
        C7434o0OOoOo OooO0OO = OooO0OO(o0ooooo, o0ooooo0.OooO00o(0).m19070OooO00o(), z);
        if (OooO0OO == null) {
            return null;
        }
        if (OooO0OO.OooO()) {
            OooO0OO.OooO0Oo(false);
            o0ooooo2 = OooO0OO;
        } else {
            o0ooooo2 = null;
        }
        for (int i = 1; i < o0ooooo0.OooO00o(); i++) {
            try {
                OooO0OO = OooO00o(OooO0OO, o0ooooo0.OooO00o(i), z);
                if (OooO0OO == null) {
                    if (z) {
                        OooO00o(o0ooooo2);
                    }
                    return null;
                }
                if (OooO0OO.OooO()) {
                    OooO0OO.OooO0Oo(false);
                    if (i == 1 && o0ooooo0.OooO00o(i).m19071OooO00o() && o0ooooo0.OooO00o(i).OooO00o() != 0) {
                        OooO0OO.m19030OooO00o().OooO00o(o0ooooo0.OooO00o(i).OooO00o(), true);
                    } else if (i < o0ooooo0.OooO00o() - 1 && o0ooooo0.OooO00o(i).OooO0O0() == 1 && !OooO0OO.m19030OooO00o().OooO0oo()) {
                        OooO0OO.m19030OooO00o().OooOO0(true);
                    }
                    if (o0ooooo2 == null) {
                        o0ooooo2 = OooO0OO;
                    }
                }
            } catch (XMPException e) {
                if (o0ooooo2 != null) {
                    OooO00o(o0ooooo2);
                }
                throw e;
            }
        }
        if (o0ooooo2 != null) {
            OooO0OO.m19030OooO00o().OooO00o(o0ooo0o0);
            OooO0OO.OooO00o(OooO0OO.m19030OooO00o());
        }
        return OooO0OO;
    }

    public static C7434o0OOoOo OooO00o(C7434o0OOoOo o0ooooo, C7451o0Oo00o0 o0oo00o0, boolean z) throws XMPException {
        int i;
        int OooO0O02 = o0oo00o0.OooO0O0();
        if (OooO0O02 == 1) {
            return m19047OooO00o(o0ooooo, o0oo00o0.m19070OooO00o(), z);
        }
        if (OooO0O02 == 2) {
            return OooO0O0(o0ooooo, o0oo00o0.m19070OooO00o().substring(1), z);
        }
        if (o0ooooo.m19030OooO00o().OooO0Oo()) {
            if (OooO0O02 == 3) {
                i = OooO00o(o0ooooo, o0oo00o0.m19070OooO00o(), z);
            } else if (OooO0O02 == 4) {
                i = o0ooooo.OooO00o();
            } else if (OooO0O02 == 6) {
                String[] OooO00o = C7431o0OOoO0o.m18999OooO00o(o0oo00o0.m19070OooO00o());
                i = OooO00o(o0ooooo, OooO00o[0], OooO00o[1]);
            } else if (OooO0O02 == 5) {
                String[] OooO00o2 = C7431o0OOoO0o.m18999OooO00o(o0oo00o0.m19070OooO00o());
                i = OooO00o(o0ooooo, OooO00o2[0], OooO00o2[1], o0oo00o0.OooO00o());
            } else {
                throw new XMPException("Unknown array indexing step in FollowXPathStep", 9);
            }
            if (1 > i || i > o0ooooo.OooO00o()) {
                return null;
            }
            return o0ooooo.OooO00o(i);
        }
        throw new XMPException("Indexing applied to non-array", 102);
    }

    public static C7434o0OOoOo OooO00o(C7434o0OOoOo o0ooooo, String str, String str2, boolean z) throws XMPException {
        C7434o0OOoOo OooO00o = o0ooooo.OooO00o(str);
        if (OooO00o == null && z) {
            OooO00o = new C7434o0OOoOo(str, new C7710o0ooO0O0().OooO(true));
            OooO00o.OooO0Oo(true);
            String OooO00o2 = C7415o0OOo00.m18952OooO00o().m18977OooO00o(str);
            if (OooO00o2 == null) {
                if (str2 == null || str2.length() == 0) {
                    throw new XMPException("Unregistered schema namespace URI", 101);
                }
                OooO00o2 = C7415o0OOo00.m18952OooO00o().m18978OooO00o(str, str2);
            }
            OooO00o.m19040OooO0O0(OooO00o2);
            o0ooooo.OooO00o(OooO00o);
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7434o0OOoOo m19047OooO00o(C7434o0OOoOo o0ooooo, String str, boolean z) throws XMPException {
        if (!o0ooooo.m19030OooO00o().OooOO0O() && !o0ooooo.m19030OooO00o().OooOOO0()) {
            if (!o0ooooo.OooO()) {
                throw new XMPException("Named children only allowed for schemas and structs", 102);
            } else if (o0ooooo.m19030OooO00o().OooO0Oo()) {
                throw new XMPException("Named children not allowed for arrays", 102);
            } else if (z) {
                o0ooooo.m19030OooO00o().OooOO0(true);
            }
        }
        C7434o0OOoOo OooO00o = o0ooooo.OooO00o(str);
        if (OooO00o != null || !z) {
            return OooO00o;
        }
        C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo(str, new C7710o0ooO0O0());
        o0ooooo2.OooO0Oo(true);
        o0ooooo.OooO00o(o0ooooo2);
        return o0ooooo2;
    }

    public static C7710o0ooO0O0 OooO00o(C7710o0ooO0O0 o0ooo0o0, Object obj) throws XMPException {
        if (o0ooo0o0 == null) {
            o0ooo0o0 = new C7710o0ooO0O0();
        }
        if (o0ooo0o0.OooO0o0()) {
            o0ooo0o0.OooO0OO(true);
        }
        if (o0ooo0o0.OooO0o()) {
            o0ooo0o0.OooO0Oo(true);
        }
        if (o0ooo0o0.OooO0oO()) {
            o0ooo0o0.OooO00o(true);
        }
        if (!o0ooo0o0.OooO0oo() || obj == null || obj.toString().length() <= 0) {
            o0ooo0o0.m19349OooO00o(o0ooo0o0.m19073OooO00o());
            return o0ooo0o0;
        }
        throw new XMPException("Structs and arrays can't have values", 103);
    }

    public static String OooO00o(Object obj) {
        String str;
        AbstractC7412o0OOOoo0 OooO00o;
        if (obj == null) {
            str = null;
        } else if (obj instanceof Boolean) {
            str = C7420o0OOo0O0.OooO00o(((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            str = C7420o0OOo0O0.OooO00o(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            str = C7420o0OOo0O0.OooO00o(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            str = C7420o0OOo0O0.OooO00o(((Double) obj).doubleValue());
        } else {
            if (obj instanceof AbstractC7412o0OOOoo0) {
                OooO00o = (AbstractC7412o0OOOoo0) obj;
            } else if (obj instanceof GregorianCalendar) {
                OooO00o = C7411o0OOOoo.OooO00o((GregorianCalendar) obj);
            } else {
                str = obj instanceof byte[] ? C7420o0OOo0O0.OooO00o((byte[]) obj) : obj.toString();
            }
            str = C7420o0OOo0O0.OooO00o(OooO00o);
        }
        if (str != null) {
            return C7431o0OOoO0o.OooO0O0(str);
        }
        return null;
    }

    public static void OooO00o(C7434o0OOoOo o0ooooo) {
        C7434o0OOoOo OooO00o = o0ooooo.m19029OooO00o();
        if (o0ooooo.m19030OooO00o().OooOO0()) {
            OooO00o.OooO0o0(o0ooooo);
        } else {
            OooO00o.OooO0Oo(o0ooooo);
        }
        if (!OooO00o.OooO0o() && OooO00o.m19030OooO00o().OooOO0O()) {
            OooO00o.m19029OooO00o().OooO0Oo(OooO00o);
        }
    }

    public static void OooO00o(C7434o0OOoOo o0ooooo, Object obj) {
        String OooO00o = OooO00o(obj);
        if (o0ooooo.m19030OooO00o().OooOO0() && AbstractC7410o0OOOoOo.Ooooooo.equals(o0ooooo.m19031OooO00o())) {
            OooO00o = C7431o0OOoO0o.OooO00o(OooO00o);
        }
        o0ooooo.m19040OooO0O0(OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19048OooO00o(C7434o0OOoOo o0ooooo, String str, String str2) throws XMPException {
        C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo("[]", str2, null);
        C7434o0OOoOo o0ooooo3 = new C7434o0OOoOo(AbstractC7410o0OOOoOo.Ooooooo, str, null);
        o0ooooo2.OooO0O0(o0ooooo3);
        if (!AbstractC7410o0OOOoOo.OoooooO.equals(o0ooooo3.m19037OooO0O0())) {
            o0ooooo.OooO00o(o0ooooo2);
        } else {
            o0ooooo.OooO00o(1, o0ooooo2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Object[] m19049OooO00o(C7434o0OOoOo o0ooooo, String str, String str2) throws XMPException {
        if (o0ooooo.m19030OooO00o().OooO0o0()) {
            C7434o0OOoOo o0ooooo2 = null;
            if (!o0ooooo.OooO0o()) {
                return new Object[]{new Integer(0), null};
            }
            Iterator OooO00o = o0ooooo.m19032OooO00o();
            C7434o0OOoOo o0ooooo3 = null;
            int i = 0;
            while (OooO00o.hasNext()) {
                C7434o0OOoOo o0ooooo4 = (C7434o0OOoOo) OooO00o.next();
                if (o0ooooo4.m19030OooO00o().OooO0oo()) {
                    throw new XMPException("Alt-text array item is not simple", 102);
                } else if (!o0ooooo4.OooO0oO() || !AbstractC7410o0OOOoOo.Ooooooo.equals(o0ooooo4.OooO0O0(1).m19031OooO00o())) {
                    throw new XMPException("Alt-text array item has no language qualifier", 102);
                } else {
                    String OooO0O02 = o0ooooo4.OooO0O0(1).m19037OooO0O0();
                    if (str2.equals(OooO0O02)) {
                        return new Object[]{new Integer(1), o0ooooo4};
                    } else if (str != null && OooO0O02.startsWith(str)) {
                        if (o0ooooo2 == null) {
                            o0ooooo2 = o0ooooo4;
                        }
                        i++;
                    } else if (AbstractC7410o0OOOoOo.OoooooO.equals(OooO0O02)) {
                        o0ooooo3 = o0ooooo4;
                    }
                }
            }
            if (i == 1) {
                return new Object[]{new Integer(2), o0ooooo2};
            } else if (i > 1) {
                return new Object[]{new Integer(3), o0ooooo2};
            } else if (o0ooooo3 != null) {
                return new Object[]{new Integer(4), o0ooooo3};
            } else {
                return new Object[]{new Integer(5), o0ooooo.OooO00o(1)};
            }
        } else {
            throw new XMPException("Localized text array is not alt-text", 102);
        }
    }

    public static C7434o0OOoOo OooO0O0(C7434o0OOoOo o0ooooo, String str, boolean z) throws XMPException {
        C7434o0OOoOo OooO0O02 = o0ooooo.OooO0O0(str);
        if (OooO0O02 != null || !z) {
            return OooO0O02;
        }
        C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo(str, null);
        o0ooooo2.OooO0Oo(true);
        o0ooooo.OooO0O0(o0ooooo2);
        return o0ooooo2;
    }

    public static void OooO0O0(C7434o0OOoOo o0ooooo) {
        if (o0ooooo.m19030OooO00o().OooO0o() && o0ooooo.OooO0o()) {
            boolean z = false;
            Iterator OooO00o = o0ooooo.m19032OooO00o();
            while (true) {
                if (OooO00o.hasNext()) {
                    if (((C7434o0OOoOo) OooO00o.next()).m19030OooO00o().OooO00o()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                o0ooooo.m19030OooO00o().OooO0O0(true);
                OooO0OO(o0ooooo);
            }
        }
    }

    public static C7434o0OOoOo OooO0OO(C7434o0OOoOo o0ooooo, String str, boolean z) throws XMPException {
        return OooO00o(o0ooooo, str, (String) null, z);
    }

    public static void OooO0OO(C7434o0OOoOo o0ooooo) {
        if (o0ooooo.m19030OooO00o().OooO0o0()) {
            for (int i = 2; i <= o0ooooo.OooO00o(); i++) {
                C7434o0OOoOo OooO00o = o0ooooo.OooO00o(i);
                if (OooO00o.OooO0oO() && AbstractC7410o0OOOoOo.OoooooO.equals(OooO00o.OooO0O0(1).m19037OooO0O0())) {
                    try {
                        o0ooooo.OooO0o(i);
                        o0ooooo.OooO00o(1, OooO00o);
                    } catch (XMPException unused) {
                    }
                    if (i == 2) {
                        o0ooooo.OooO00o(2).m19040OooO0O0(OooO00o.m19037OooO0O0());
                        return;
                    }
                    return;
                }
            }
        }
    }
}
