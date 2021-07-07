package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OOoo0O  reason: case insensitive filesystem */
public class C7438o0OOoo0O {
    public static Map OooO00o;

    static {
        OooO00o();
    }

    public static AbstractC7416o0OOo000 OooO00o(C7433o0OOoOOO o0oooooo, C7448o0Oo0 o0oo0) throws XMPException {
        C7434o0OOoOo OooO00o2 = o0oooooo.m19008OooO00o();
        OooO00o(o0oooooo);
        OooO00o(OooO00o2, o0oo0);
        OooO0o0(OooO00o2);
        OooO00o(OooO00o2);
        return o0oooooo;
    }

    public static void OooO00o() {
        OooO00o = new HashMap();
        C7710o0ooO0O0 o0ooo0o0 = new C7710o0ooO0O0();
        o0ooo0o0.OooO00o(true);
        OooO00o.put("dc:contributor", o0ooo0o0);
        OooO00o.put("dc:language", o0ooo0o0);
        OooO00o.put("dc:publisher", o0ooo0o0);
        OooO00o.put("dc:relation", o0ooo0o0);
        OooO00o.put("dc:subject", o0ooo0o0);
        OooO00o.put("dc:type", o0ooo0o0);
        C7710o0ooO0O0 o0ooo0o02 = new C7710o0ooO0O0();
        o0ooo0o02.OooO00o(true);
        o0ooo0o02.OooO0Oo(true);
        OooO00o.put("dc:creator", o0ooo0o02);
        OooO00o.put("dc:date", o0ooo0o02);
        C7710o0ooO0O0 o0ooo0o03 = new C7710o0ooO0O0();
        o0ooo0o03.OooO00o(true);
        o0ooo0o03.OooO0Oo(true);
        o0ooo0o03.OooO0OO(true);
        o0ooo0o03.OooO0O0(true);
        OooO00o.put("dc:description", o0ooo0o03);
        OooO00o.put("dc:rights", o0ooo0o03);
        OooO00o.put("dc:title", o0ooo0o03);
    }

    public static void OooO00o(AbstractC7416o0OOo000 o0ooo000, C7434o0OOoOo o0ooooo) {
        String str;
        try {
            C7434o0OOoOo OooO0OO = C7437o0OOoo0.OooO0OO(((C7433o0OOoOOO) o0ooo000).m19008OooO00o(), "http://purl.org/dc/elements/1.1/", true);
            String OooO0O0 = o0ooooo.m19037OooO0O0();
            C7434o0OOoOo OooO00o2 = C7437o0OOoo0.m19047OooO00o(OooO0OO, "dc:rights", false);
            if (OooO00o2 != null) {
                if (OooO00o2.OooO0o()) {
                    int OooO00o3 = C7437o0OOoo0.OooO00o(OooO00o2, AbstractC7410o0OOOoOo.OoooooO);
                    if (OooO00o3 < 0) {
                        o0ooo000.OooO0OO("http://purl.org/dc/elements/1.1/", "rights", "", AbstractC7410o0OOOoOo.OoooooO, OooO00o2.OooO00o(1).m19037OooO0O0(), null);
                        OooO00o3 = C7437o0OOoo0.OooO00o(OooO00o2, AbstractC7410o0OOOoOo.OoooooO);
                    }
                    C7434o0OOoOo OooO00o4 = OooO00o2.OooO00o(OooO00o3);
                    String OooO0O02 = OooO00o4.m19037OooO0O0();
                    int indexOf = OooO0O02.indexOf("\n\n");
                    if (indexOf < 0) {
                        if (!OooO0O0.equals(OooO0O02)) {
                            str = OooO0O02 + "\n\n" + OooO0O0;
                        }
                        o0ooooo.m19029OooO00o().OooO0Oo(o0ooooo);
                    }
                    int i = indexOf + 2;
                    if (!OooO0O02.substring(i).equals(OooO0O0)) {
                        str = OooO0O02.substring(0, i) + OooO0O0;
                    }
                    o0ooooo.m19029OooO00o().OooO0Oo(o0ooooo);
                    OooO00o4.m19040OooO0O0(str);
                    o0ooooo.m19029OooO00o().OooO0Oo(o0ooooo);
                }
            }
            o0ooo000.OooO0OO("http://purl.org/dc/elements/1.1/", "rights", "", AbstractC7410o0OOOoOo.OoooooO, "\n\n" + OooO0O0, null);
            o0ooooo.m19029OooO00o().OooO0Oo(o0ooooo);
        } catch (XMPException unused) {
        }
    }

    public static void OooO00o(C7433o0OOoOOO o0oooooo) throws XMPException {
        C7434o0OOoOo OooO00o2;
        C7437o0OOoo0.OooO0OO(o0oooooo.m19008OooO00o(), "http://purl.org/dc/elements/1.1/", true);
        Iterator OooO00o3 = o0oooooo.m19008OooO00o().m19032OooO00o();
        while (OooO00o3.hasNext()) {
            C7434o0OOoOo o0ooooo = (C7434o0OOoOo) OooO00o3.next();
            if ("http://purl.org/dc/elements/1.1/".equals(o0ooooo.m19031OooO00o())) {
                OooO0OO(o0ooooo);
            } else {
                if ("http://ns.adobe.com/exif/1.0/".equals(o0ooooo.m19031OooO00o())) {
                    OooO0O0(o0ooooo);
                    OooO00o2 = C7437o0OOoo0.m19047OooO00o(o0ooooo, "exif:UserComment", false);
                    if (OooO00o2 == null) {
                    }
                } else if (AbstractC7410o0OOOoOo.OoooO00.equals(o0ooooo.m19031OooO00o())) {
                    C7434o0OOoOo OooO00o4 = C7437o0OOoo0.m19047OooO00o(o0ooooo, "xmpDM:copyright", false);
                    if (OooO00o4 != null) {
                        OooO00o(o0oooooo, OooO00o4);
                    }
                } else if (AbstractC7410o0OOOoOo.OooOO0O.equals(o0ooooo.m19031OooO00o())) {
                    OooO00o2 = C7437o0OOoo0.m19047OooO00o(o0ooooo, "xmpRights:UsageTerms", false);
                    if (OooO00o2 == null) {
                    }
                }
                OooO0Oo(OooO00o2);
            }
        }
    }

    public static void OooO00o(C7434o0OOoOo o0ooooo) {
        Iterator OooO00o2 = o0ooooo.m19032OooO00o();
        while (OooO00o2.hasNext()) {
            if (!((C7434o0OOoOo) OooO00o2.next()).OooO0o()) {
                OooO00o2.remove();
            }
        }
    }

    public static void OooO00o(C7434o0OOoOo o0ooooo, C7434o0OOoOo o0ooooo2, boolean z) throws XMPException {
        if (!o0ooooo.m19037OooO0O0().equals(o0ooooo2.m19037OooO0O0()) || o0ooooo.OooO00o() != o0ooooo2.OooO00o()) {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        } else if (z || (o0ooooo.m19031OooO00o().equals(o0ooooo2.m19031OooO00o()) && o0ooooo.m19030OooO00o().equals(o0ooooo2.m19030OooO00o()) && o0ooooo.m19041OooO0OO() == o0ooooo2.m19041OooO0OO())) {
            Iterator OooO00o2 = o0ooooo.m19032OooO00o();
            Iterator OooO00o3 = o0ooooo2.m19032OooO00o();
            while (OooO00o2.hasNext() && OooO00o3.hasNext()) {
                OooO00o((C7434o0OOoOo) OooO00o2.next(), (C7434o0OOoOo) OooO00o3.next(), false);
            }
            Iterator OooO0O0 = o0ooooo.m19038OooO0O0();
            Iterator OooO0O02 = o0ooooo2.m19038OooO0O0();
            while (OooO0O0.hasNext() && OooO0O02.hasNext()) {
                OooO00o((C7434o0OOoOo) OooO0O0.next(), (C7434o0OOoOo) OooO0O02.next(), false);
            }
        } else {
            throw new XMPException("Mismatch between alias and base nodes", 203);
        }
    }

    public static void OooO00o(C7434o0OOoOo o0ooooo, C7448o0Oo0 o0oo0) throws XMPException {
        if (o0ooooo.m19043OooO0OO()) {
            o0ooooo.OooO0O0(false);
            boolean OooO0o = o0oo0.OooO0o();
            for (C7434o0OOoOo o0ooooo2 : o0ooooo.m19033OooO00o()) {
                if (o0ooooo2.m19043OooO0OO()) {
                    Iterator OooO00o2 = o0ooooo2.m19032OooO00o();
                    while (OooO00o2.hasNext()) {
                        C7434o0OOoOo o0ooooo3 = (C7434o0OOoOo) OooO00o2.next();
                        if (o0ooooo3.OooO0oo()) {
                            o0ooooo3.m19036OooO00o(false);
                            AbstractC7455o0Oo0O0 OooO00o3 = C7415o0OOo00.m18952OooO00o().OooO00o(o0ooooo3.m19031OooO00o());
                            if (OooO00o3 != null) {
                                C7434o0OOoOo o0ooooo4 = null;
                                C7434o0OOoOo OooO00o4 = C7437o0OOoo0.OooO00o(o0ooooo, OooO00o3.getNamespace(), (String) null, true);
                                OooO00o4.OooO0Oo(false);
                                C7434o0OOoOo OooO00o5 = C7437o0OOoo0.m19047OooO00o(OooO00o4, OooO00o3.m19082OooO00o() + OooO00o3.OooO0O0(), false);
                                if (OooO00o5 == null) {
                                    if (OooO00o3.OooO00o().OooO0o0()) {
                                        o0ooooo3.m19035OooO00o(OooO00o3.m19082OooO00o() + OooO00o3.OooO0O0());
                                        OooO00o4.OooO00o(o0ooooo3);
                                    } else {
                                        C7434o0OOoOo o0ooooo5 = new C7434o0OOoOo(OooO00o3.m19082OooO00o() + OooO00o3.OooO0O0(), OooO00o3.OooO00o().OooO00o());
                                        OooO00o4.OooO00o(o0ooooo5);
                                        OooO00o(OooO00o2, o0ooooo3, o0ooooo5);
                                    }
                                } else if (!OooO00o3.OooO00o().OooO0o0()) {
                                    if (OooO00o3.OooO00o().m19069OooO0O0()) {
                                        int OooO00o6 = C7437o0OOoo0.OooO00o(OooO00o5, AbstractC7410o0OOOoOo.OoooooO);
                                        if (OooO00o6 != -1) {
                                            o0ooooo4 = OooO00o5.OooO00o(OooO00o6);
                                        }
                                    } else if (OooO00o5.OooO0o()) {
                                        o0ooooo4 = OooO00o5.OooO00o(1);
                                    }
                                    if (o0ooooo4 == null) {
                                        OooO00o(OooO00o2, o0ooooo3, OooO00o5);
                                    } else if (OooO0o) {
                                        OooO00o(o0ooooo3, o0ooooo4, true);
                                    }
                                } else if (OooO0o) {
                                    OooO00o(o0ooooo3, OooO00o5, true);
                                }
                                OooO00o2.remove();
                            }
                        }
                    }
                    o0ooooo2.OooO0O0(false);
                }
            }
        }
    }

    public static void OooO00o(Iterator it, C7434o0OOoOo o0ooooo, C7434o0OOoOo o0ooooo2) throws XMPException {
        if (o0ooooo2.m19030OooO00o().OooO0o0()) {
            if (!o0ooooo.m19030OooO00o().OooO00o()) {
                o0ooooo.OooO0O0(new C7434o0OOoOo(AbstractC7410o0OOOoOo.Ooooooo, AbstractC7410o0OOOoOo.OoooooO, null));
            } else {
                throw new XMPException("Alias to x-default already has a language qualifier", 203);
            }
        }
        it.remove();
        o0ooooo.m19035OooO00o("[]");
        o0ooooo2.OooO00o(o0ooooo);
    }

    public static void OooO0O0(C7434o0OOoOo o0ooooo) throws XMPException {
        C7434o0OOoOo OooO00o2 = C7437o0OOoo0.m19047OooO00o(o0ooooo, "exif:GPSTimeStamp", false);
        if (OooO00o2 != null) {
            try {
                AbstractC7412o0OOOoo0 OooO00o3 = C7420o0OOo0O0.m18983OooO00o(OooO00o2.m19037OooO0O0());
                if (OooO00o3.getYear() != 0 || OooO00o3.getMonth() != 0) {
                    return;
                }
                if (OooO00o3.getDay() == 0) {
                    C7434o0OOoOo OooO00o4 = C7437o0OOoo0.m19047OooO00o(o0ooooo, "exif:DateTimeOriginal", false);
                    if (OooO00o4 == null) {
                        OooO00o4 = C7437o0OOoo0.m19047OooO00o(o0ooooo, "exif:DateTimeDigitized", false);
                    }
                    AbstractC7412o0OOOoo0 OooO00o5 = C7420o0OOo0O0.m18983OooO00o(OooO00o4.m19037OooO0O0());
                    Calendar OooO00o6 = OooO00o3.OooO00o();
                    OooO00o6.set(1, OooO00o5.getYear());
                    OooO00o6.set(2, OooO00o5.getMonth());
                    OooO00o6.set(5, OooO00o5.getDay());
                    OooO00o2.m19040OooO0O0(C7420o0OOo0O0.OooO00o(new C7427o0OOoO(OooO00o6)));
                }
            } catch (XMPException unused) {
            }
        }
    }

    public static void OooO0OO(C7434o0OOoOo o0ooooo) throws XMPException {
        for (int i = 1; i <= o0ooooo.OooO00o(); i++) {
            C7434o0OOoOo OooO00o2 = o0ooooo.OooO00o(i);
            C7710o0ooO0O0 o0ooo0o0 = (C7710o0ooO0O0) OooO00o.get(OooO00o2.m19031OooO00o());
            if (o0ooo0o0 != null) {
                if (OooO00o2.m19030OooO00o().OooOO0o()) {
                    C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo(OooO00o2.m19031OooO00o(), o0ooo0o0);
                    OooO00o2.m19035OooO00o("[]");
                    o0ooooo2.OooO00o(OooO00o2);
                    o0ooooo.OooO0O0(i, o0ooooo2);
                    if (o0ooo0o0.OooO0o0() && !OooO00o2.m19030OooO00o().OooO00o()) {
                        OooO00o2.OooO0O0(new C7434o0OOoOo(AbstractC7410o0OOOoOo.Ooooooo, AbstractC7410o0OOOoOo.OoooooO, null));
                    }
                } else {
                    OooO00o2.m19030OooO00o().OooO00o(7680, false);
                    OooO00o2.m19030OooO00o().OooO00o(o0ooo0o0);
                    if (o0ooo0o0.OooO0o0()) {
                        OooO0Oo(OooO00o2);
                    }
                }
            }
        }
    }

    public static void OooO0Oo(C7434o0OOoOo o0ooooo) throws XMPException {
        if (o0ooooo != null && o0ooooo.m19030OooO00o().OooO0Oo()) {
            o0ooooo.m19030OooO00o().OooO0Oo(true).OooO0OO(true).OooO0O0(true);
            Iterator OooO00o2 = o0ooooo.m19032OooO00o();
            while (OooO00o2.hasNext()) {
                C7434o0OOoOo o0ooooo2 = (C7434o0OOoOo) OooO00o2.next();
                if (!o0ooooo2.m19030OooO00o().OooO0oo()) {
                    if (!o0ooooo2.m19030OooO00o().OooO00o()) {
                        String OooO0O0 = o0ooooo2.m19037OooO0O0();
                        if (!(OooO0O0 == null || OooO0O0.length() == 0)) {
                            o0ooooo2.OooO0O0(new C7434o0OOoOo(AbstractC7410o0OOOoOo.Ooooooo, "x-repair", null));
                        }
                    }
                }
                OooO00o2.remove();
            }
        }
    }

    public static void OooO0o0(C7434o0OOoOo o0ooooo) throws XMPException {
        if (o0ooooo.m19031OooO00o() != null && o0ooooo.m19031OooO00o().length() >= 36) {
            String lowerCase = o0ooooo.m19031OooO00o().toLowerCase();
            if (lowerCase.startsWith("uuid:")) {
                lowerCase = lowerCase.substring(5);
            }
            if (C7431o0OOoO0o.m18998OooO00o(lowerCase)) {
                C7434o0OOoOo OooO00o2 = C7437o0OOoo0.OooO00o(o0ooooo, C7444o0OOooo.OooO00o(AbstractC7410o0OOOoOo.OooOO0o, "InstanceID"), true, (C7710o0ooO0O0) null);
                if (OooO00o2 != null) {
                    OooO00o2.OooO00o((C7710o0ooO0O0) null);
                    OooO00o2.m19040OooO0O0("uuid:" + lowerCase);
                    OooO00o2.m19042OooO0OO();
                    OooO00o2.OooO0Oo();
                    o0ooooo.m19035OooO00o((String) null);
                    return;
                }
                throw new XMPException("Failure creating xmpMM:InstanceID", 9);
            }
        }
    }
}
