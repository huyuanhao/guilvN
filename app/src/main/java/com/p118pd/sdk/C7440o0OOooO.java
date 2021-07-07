package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.pd.sdk.o0OOooO  reason: case insensitive filesystem */
public class C7440o0OOooO {
    public static final String OooO = "</rdf:Description>";
    public static final String OooO00o = "<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set f20261OooO00o = new HashSet(Arrays.asList(AbstractC7410o0OOOoOo.Ooooooo, "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));
    public static final String OooO0O0 = "<?xpacket end=\"";
    public static final int OooO0OO = 2048;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f20262OooO0OO = "\"?>";
    public static final String OooO0Oo = "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"";
    public static final String OooO0o = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">";
    public static final String OooO0o0 = "</x:xmpmeta>";
    public static final String OooO0oO = "</rdf:RDF>";
    public static final String OooO0oo = "<rdf:Description rdf:about=";
    public static final String OooOO0 = "<rdf:Description";
    public static final String OooOO0O = "</rdf:Description>";
    public static final String OooOO0o = "<rdf:Description/>";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f20263OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7422o0OOo0Oo f20264OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7433o0OOoOOO f20265OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7456o0Oo0O00 f20266OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OutputStreamWriter f20267OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f20268OooO0O0;

    private String OooO00o() throws IOException, XMPException {
        int i = 0;
        if (!this.f20266OooO00o.OooO0o0()) {
            OooO0o(0);
            OooO00o(OooO00o);
            OooO0O0();
        }
        if (!this.f20266OooO00o.OooO0oO()) {
            OooO0o(0);
            OooO00o(OooO0Oo);
            if (!this.f20266OooO00o.OooO0o()) {
                OooO00o(C7415o0OOo00.m18953OooO00o().m19189OooO00o());
            }
            OooO00o("\">");
            OooO0O0();
            i = 1;
        }
        OooO0o(i);
        OooO00o(OooO0o);
        OooO0O0();
        if (this.f20266OooO00o.OooOO0()) {
            OooO0OO(i);
        } else {
            OooO0Oo(i);
        }
        OooO0o(i);
        OooO00o(OooO0oO);
        OooO0O0();
        if (!this.f20266OooO00o.OooO0oO()) {
            OooO0o(i - 1);
            OooO00o(OooO0o0);
            OooO0O0();
        }
        String str = "";
        if (this.f20266OooO00o.OooO0o0()) {
            return str;
        }
        for (int OooO0OO2 = this.f20266OooO00o.OooO0OO(); OooO0OO2 > 0; OooO0OO2--) {
            str = str + this.f20266OooO00o.m19086OooO0OO();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str + OooO0O0);
        sb.append(this.f20266OooO00o.OooO0oo() ? 'r' : 'w');
        return sb.toString() + f20262OooO0OO;
    }

    private void OooO00o(int i) throws XMPException, IOException {
        if (this.f20266OooO00o.m19087OooO0OO()) {
            int OooO0O02 = this.f20264OooO00o.OooO0O0() + (i * this.f20263OooO00o);
            int i2 = this.f20268OooO0O0;
            if (OooO0O02 <= i2) {
                this.f20268OooO0O0 = i2 - OooO0O02;
            } else {
                throw new XMPException("Can't fit into specified packet size", 107);
            }
        }
        this.f20268OooO0O0 /= this.f20263OooO00o;
        int length = this.f20266OooO00o.m19088OooO0Oo().length();
        int i3 = this.f20268OooO0O0;
        if (i3 >= length) {
            int i4 = i3 - length;
            while (true) {
                this.f20268OooO0O0 = i4;
                int i5 = this.f20268OooO0O0;
                int i6 = length + 100;
                if (i5 >= i6) {
                    OooO00o(100, ' ');
                    OooO0O0();
                    i4 = this.f20268OooO0O0 - i6;
                } else {
                    OooO00o(i5, ' ');
                    OooO0O0();
                    return;
                }
            }
        } else {
            OooO00o(i3, ' ');
        }
    }

    private void OooO00o(int i, char c) throws IOException {
        while (i > 0) {
            this.f20267OooO00o.write(c);
            i--;
        }
    }

    private void OooO00o(int i, C7434o0OOoOo o0ooooo) throws IOException, XMPException {
        OooO00o(" rdf:parseType=\"Resource\">");
        OooO0O0();
        int i2 = i + 1;
        OooO00o(o0ooooo, false, true, i2);
        Iterator OooO0O02 = o0ooooo.m19038OooO0O0();
        while (OooO0O02.hasNext()) {
            OooO00o((C7434o0OOoOo) OooO0O02.next(), false, false, i2);
        }
    }

    private void OooO00o(C7434o0OOoOo o0ooooo, int i) throws IOException, XMPException {
        Iterator OooO00o2 = o0ooooo.m19032OooO00o();
        while (OooO00o2.hasNext()) {
            OooO00o((C7434o0OOoOo) OooO00o2.next(), this.f20266OooO00o.OooOO0(), false, i + 2);
        }
    }

    private void OooO00o(C7434o0OOoOo o0ooooo, Set set, int i) throws IOException {
        if (o0ooooo.m19030OooO00o().OooOO0O()) {
            OooO00o(o0ooooo.m19037OooO0O0().substring(0, o0ooooo.m19037OooO0O0().length() - 1), o0ooooo.m19031OooO00o(), set, i);
        } else if (o0ooooo.m19030OooO00o().OooOOO0()) {
            Iterator OooO00o2 = o0ooooo.m19032OooO00o();
            while (OooO00o2.hasNext()) {
                OooO00o(((C7434o0OOoOo) OooO00o2.next()).m19031OooO00o(), (String) null, set, i);
            }
        }
        Iterator OooO00o3 = o0ooooo.m19032OooO00o();
        while (OooO00o3.hasNext()) {
            OooO00o((C7434o0OOoOo) OooO00o3.next(), set, i);
        }
        Iterator OooO0O02 = o0ooooo.m19038OooO0O0();
        while (OooO0O02.hasNext()) {
            C7434o0OOoOo o0ooooo2 = (C7434o0OOoOo) OooO0O02.next();
            OooO00o(o0ooooo2.m19031OooO00o(), (String) null, set, i);
            OooO00o(o0ooooo2, set, i);
        }
    }

    private void OooO00o(C7434o0OOoOo o0ooooo, boolean z, int i) throws IOException {
        if (z || o0ooooo.OooO0o()) {
            OooO0o(i);
            OooO00o(z ? "<rdf:" : "</rdf:");
            OooO00o(o0ooooo.m19030OooO00o().OooO0o() ? "Alt" : o0ooooo.m19030OooO00o().OooO0oO() ? "Seq" : "Bag");
            OooO00o((!z || o0ooooo.OooO0o()) ? ">" : "/>");
            OooO0O0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        if (r18 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bb, code lost:
        if (r18 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(com.p118pd.sdk.C7434o0OOoOo r17, boolean r18, boolean r19, int r20) throws java.io.IOException, com.adobe.xmp.XMPException {
        /*
        // Method dump skipped, instructions count: 537
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7440o0OOooO.OooO00o(com.pd.sdk.o0OOoOo, boolean, boolean, int):void");
    }

    private void OooO00o(String str) throws IOException {
        this.f20267OooO00o.write(str);
    }

    private void OooO00o(String str, String str2, Set set, int i) throws IOException {
        if (str2 == null) {
            C7430o0OOoO0O o0oooo0o = new C7430o0OOoO0O(str);
            if (o0oooo0o.m18997OooO00o()) {
                str = o0oooo0o.OooO0O0();
                AbstractC7418o0OOo00o OooO00o2 = C7415o0OOo00.m18952OooO00o();
                str2 = OooO00o2.OooO0O0(str + Constants.COLON_SEPARATOR);
                OooO00o(str, str2, set, i);
            } else {
                return;
            }
        }
        if (!set.contains(str)) {
            OooO0O0();
            OooO0o(i);
            OooO00o("xmlns:");
            OooO00o(str);
            OooO00o("=\"");
            OooO00o(str2);
            OooO0o0(34);
            set.add(str);
        }
    }

    private void OooO00o(String str, boolean z) throws IOException {
        if (str == null) {
            str = "";
        }
        OooO00o(C7431o0OOoO0o.OooO00o(str, z, true));
    }

    private boolean OooO00o(C7434o0OOoOo o0ooooo) {
        return !o0ooooo.OooO0oO() && !o0ooooo.m19030OooO00o().OooOOO() && !o0ooooo.m19030OooO00o().OooO0oo() && !"[]".equals(o0ooooo.m19031OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m19057OooO00o(C7434o0OOoOo o0ooooo, int i) throws IOException {
        Iterator OooO00o2 = o0ooooo.m19032OooO00o();
        boolean z = true;
        while (OooO00o2.hasNext()) {
            C7434o0OOoOo o0ooooo2 = (C7434o0OOoOo) OooO00o2.next();
            if (OooO00o(o0ooooo2)) {
                OooO0O0();
                OooO0o(i);
                OooO00o(o0ooooo2.m19031OooO00o());
                OooO00o("=\"");
                OooO00o(o0ooooo2.m19037OooO0O0(), true);
                OooO0o0(34);
            } else {
                z = false;
            }
        }
        return z;
    }

    private boolean OooO00o(C7434o0OOoOo o0ooooo, int i, boolean z) throws XMPException, IOException {
        String str;
        Iterator OooO00o2 = o0ooooo.m19032OooO00o();
        boolean z2 = false;
        boolean z3 = false;
        while (OooO00o2.hasNext()) {
            if (OooO00o((C7434o0OOoOo) OooO00o2.next())) {
                z2 = true;
            } else {
                z3 = true;
            }
            if (z2 && z3) {
                break;
            }
        }
        if (!z || !z3) {
            if (!o0ooooo.OooO0o()) {
                str = " rdf:parseType=\"Resource\"/>";
            } else if (!z3) {
                m19057OooO00o(o0ooooo, i + 1);
                str = "/>";
            } else {
                if (!z2) {
                    OooO00o(" rdf:parseType=\"Resource\">");
                    OooO0O0();
                    OooO0OO(o0ooooo, i + 1);
                } else {
                    OooO0o0(62);
                    OooO0O0();
                    int i2 = i + 1;
                    OooO0o(i2);
                    OooO00o(OooOO0);
                    m19057OooO00o(o0ooooo, i + 2);
                    OooO00o(">");
                    OooO0O0();
                    OooO0OO(o0ooooo, i2);
                    OooO0o(i2);
                    OooO00o("</rdf:Description>");
                    OooO0O0();
                }
                return true;
            }
            OooO00o(str);
            OooO0O0();
            return false;
        }
        throw new XMPException("Can't mix rdf:resource qualifier and element fields", 202);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Object[] m19058OooO00o(C7434o0OOoOo o0ooooo) throws IOException {
        Boolean bool;
        String str;
        Boolean bool2 = Boolean.TRUE;
        if (o0ooooo.m19030OooO00o().OooOOO()) {
            OooO00o(" rdf:resource=\"");
            OooO00o(o0ooooo.m19037OooO0O0(), true);
            str = "\"/>";
        } else if (o0ooooo.m19037OooO0O0() == null || o0ooooo.m19037OooO0O0().length() == 0) {
            str = "/>";
        } else {
            OooO0o0(62);
            OooO00o(o0ooooo.m19037OooO0O0(), false);
            bool = Boolean.FALSE;
            return new Object[]{bool2, bool};
        }
        OooO00o(str);
        OooO0O0();
        bool2 = Boolean.FALSE;
        bool = bool2;
        return new Object[]{bool2, bool};
    }

    private void OooO0O0() throws IOException {
        this.f20267OooO00o.write(this.f20266OooO00o.m19088OooO0Oo());
    }

    private void OooO0O0(int i) throws IOException {
        OooO0o(i + 1);
        OooO00o("</rdf:Description>");
        OooO0O0();
    }

    private void OooO0O0(C7434o0OOoOo o0ooooo, int i) throws IOException, XMPException {
        OooO0o0(62);
        OooO0O0();
        int i2 = i + 1;
        OooO00o(o0ooooo, true, i2);
        if (o0ooooo.m19030OooO00o().OooO0o0()) {
            C7437o0OOoo0.OooO0OO(o0ooooo);
        }
        OooO0OO(o0ooooo, i + 2);
        OooO00o(o0ooooo, false, i2);
    }

    private void OooO0OO() throws IOException {
        OooO0o0(34);
        String OooO00o2 = this.f20265OooO00o.m19008OooO00o().m19031OooO00o();
        if (OooO00o2 != null) {
            OooO00o(OooO00o2, true);
        }
        OooO0o0(34);
    }

    private void OooO0OO(int i) throws IOException, XMPException {
        if (this.f20265OooO00o.m19008OooO00o().OooO00o() > 0) {
            OooO0Oo(this.f20265OooO00o.m19008OooO00o(), i);
            Iterator OooO00o2 = this.f20265OooO00o.m19008OooO00o().m19032OooO00o();
            while (OooO00o2.hasNext()) {
                OooO00o((C7434o0OOoOo) OooO00o2.next(), i);
            }
            OooO0O0(i);
            return;
        }
        OooO0o(i + 1);
        OooO00o(OooO0oo);
        OooO0OO();
        OooO00o("/>");
        OooO0O0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0OO(com.p118pd.sdk.C7434o0OOoOo r11, int r12) throws java.io.IOException, com.adobe.xmp.XMPException {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7440o0OOooO.OooO0OO(com.pd.sdk.o0OOoOo, int):void");
    }

    private void OooO0Oo(int i) throws IOException, XMPException {
        String str;
        int i2 = i + 1;
        OooO0o(i2);
        OooO00o(OooO0oo);
        OooO0OO();
        HashSet hashSet = new HashSet();
        hashSet.add("xml");
        hashSet.add("rdf");
        Iterator OooO00o2 = this.f20265OooO00o.m19008OooO00o().m19032OooO00o();
        while (OooO00o2.hasNext()) {
            OooO00o((C7434o0OOoOo) OooO00o2.next(), hashSet, i + 3);
        }
        Iterator OooO00o3 = this.f20265OooO00o.m19008OooO00o().m19032OooO00o();
        boolean z = true;
        while (OooO00o3.hasNext()) {
            z &= m19057OooO00o((C7434o0OOoOo) OooO00o3.next(), i + 2);
        }
        if (!z) {
            OooO0o0(62);
            OooO0O0();
            Iterator OooO00o4 = this.f20265OooO00o.m19008OooO00o().m19032OooO00o();
            while (OooO00o4.hasNext()) {
                OooO0OO((C7434o0OOoOo) OooO00o4.next(), i + 2);
            }
            OooO0o(i2);
            str = "</rdf:Description>";
        } else {
            str = "/>";
        }
        OooO00o(str);
        OooO0O0();
    }

    private void OooO0Oo(C7434o0OOoOo o0ooooo, int i) throws IOException {
        OooO0o(i + 1);
        OooO00o(OooO0oo);
        OooO0OO();
        HashSet hashSet = new HashSet();
        hashSet.add("xml");
        hashSet.add("rdf");
        OooO00o(o0ooooo, hashSet, i + 3);
        OooO0o0(62);
        OooO0O0();
    }

    private void OooO0o(int i) throws IOException {
        for (int OooO0OO2 = this.f20266OooO00o.OooO0OO() + i; OooO0OO2 > 0; OooO0OO2--) {
            this.f20267OooO00o.write(this.f20266OooO00o.m19086OooO0OO());
        }
    }

    private void OooO0o0(int i) throws IOException {
        this.f20267OooO00o.write(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19059OooO00o() throws XMPException {
        if (this.f20266OooO00o.OooO00o() || this.f20266OooO00o.m19085OooO0O0()) {
            this.f20263OooO00o = 2;
        }
        if (!this.f20266OooO00o.m19087OooO0OO()) {
            if (this.f20266OooO00o.OooO0oo()) {
                if (this.f20266OooO00o.OooO0o0() || this.f20266OooO00o.m19089OooO0Oo()) {
                    throw new XMPException("Inconsistent options for read-only packet", 103);
                }
            } else if (!this.f20266OooO00o.OooO0o0()) {
                if (this.f20268OooO0O0 == 0) {
                    this.f20268OooO0O0 = this.f20263OooO00o * 2048;
                }
                if (this.f20266OooO00o.m19089OooO0Oo() && !this.f20265OooO00o.m19022OooO00o("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                    this.f20268OooO0O0 += this.f20263OooO00o * 10000;
                    return;
                }
                return;
            } else if (this.f20266OooO00o.m19089OooO0Oo()) {
                throw new XMPException("Inconsistent options for non-packet serialize", 103);
            }
            this.f20268OooO0O0 = 0;
        } else if (this.f20266OooO00o.OooO0o0() || this.f20266OooO00o.m19089OooO0Oo()) {
            throw new XMPException("Inconsistent options for exact size serialize", 103);
        } else if ((this.f20266OooO00o.OooO0Oo() & (this.f20263OooO00o - 1)) != 0) {
            throw new XMPException("Exact size must be a multiple of the Unicode element", 103);
        }
    }

    public void OooO00o(AbstractC7416o0OOo000 o0ooo000, OutputStream outputStream, C7456o0Oo0O00 o0oo0o00) throws XMPException {
        try {
            this.f20264OooO00o = new C7422o0OOo0Oo(outputStream);
            this.f20267OooO00o = new OutputStreamWriter(this.f20264OooO00o, o0oo0o00.m19084OooO0O0());
            this.f20265OooO00o = (C7433o0OOoOOO) o0ooo000;
            this.f20266OooO00o = o0oo0o00;
            this.f20268OooO0O0 = o0oo0o00.OooO0Oo();
            this.f20267OooO00o = new OutputStreamWriter(this.f20264OooO00o, o0oo0o00.m19084OooO0O0());
            m19059OooO00o();
            String OooO00o2 = OooO00o();
            this.f20267OooO00o.flush();
            OooO00o(OooO00o2.length());
            OooO00o(OooO00o2);
            this.f20267OooO00o.flush();
            this.f20264OooO00o.close();
        } catch (IOException unused) {
            throw new XMPException("Error writing to the OutputStream", 0);
        }
    }
}
