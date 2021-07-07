package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* renamed from: com.pd.sdk.o0OOoO00  reason: case insensitive filesystem */
public class C7429o0OOoO00 implements AbstractC7413o0OOOooO, AbstractC7410o0OOOoOo {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public static final int o00000 = 1;
    public static final int o000000 = 10;
    public static final int o000000O = 11;
    public static final int o000000o = 12;
    public static final int o00000O = 1;
    public static final int o00000O0 = 7;
    public static final int o00000OO = 9;
    public static final int o00000Oo = 10;
    public static final int o00000o0 = 12;
    public static final int o000OOo = 9;
    public static final int o00oO0O = 0;
    public static final int o0O0O00 = 8;
    public static final int o0OO00O = 6;
    public static final int o0OOO0o = 4;
    public static final int o0Oo0oo = 5;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f20241o0ooOOo = "_dflt";
    public static final int o0ooOoO = 3;
    public static final int oo0o0Oo = 7;

    public static int OooO00o(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && AbstractC7410o0OOOoOo.OooO0O0.equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = AbstractC7410o0OOOoOo.OooO0O0;
        }
        if (!AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return "bagID".equals(localName) ? 12 : 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7433o0OOoOOO m18995OooO00o(Node node) throws XMPException {
        C7433o0OOoOOO o0oooooo = new C7433o0OOoOOO();
        OooO00o(o0oooooo, node);
        return o0oooooo;
    }

    public static C7434o0OOoOo OooO00o(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, String str, boolean z) throws XMPException {
        AbstractC7418o0OOo00o OooO00o = C7415o0OOo00.m18952OooO00o();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if (AbstractC7410o0OOOoOo.OoooO0O.equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            String OooO00o2 = OooO00o.m18977OooO00o(namespaceURI);
            if (OooO00o2 == null) {
                OooO00o2 = OooO00o.m18978OooO00o(namespaceURI, node.getPrefix() != null ? node.getPrefix() : f20241o0ooOOo);
            }
            String str2 = OooO00o2 + node.getLocalName();
            C7710o0ooO0O0 o0ooo0o0 = new C7710o0ooO0O0();
            boolean z2 = false;
            if (z) {
                o0ooooo = C7437o0OOoo0.OooO00o(o0oooooo.m19008OooO00o(), namespaceURI, f20241o0ooOOo, true);
                o0ooooo.OooO0Oo(false);
                if (OooO00o.OooO00o(str2) != null) {
                    o0oooooo.m19008OooO00o().OooO0O0(true);
                    o0ooooo.OooO0O0(true);
                    z2 = true;
                }
            }
            boolean equals = "rdf:li".equals(str2);
            boolean equals2 = "rdf:value".equals(str2);
            C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo(str2, str, o0ooo0o0);
            o0ooooo2.m19036OooO00o(z2);
            if (!equals2) {
                o0ooooo.OooO00o(o0ooooo2);
            } else {
                o0ooooo.OooO00o(1, o0ooooo2);
            }
            if (equals2) {
                if (z || !o0ooooo.m19030OooO00o().OooOOO0()) {
                    throw new XMPException("Misplaced rdf:value element", 202);
                }
                o0ooooo.OooO0OO(true);
            }
            if (equals) {
                if (o0ooooo.m19030OooO00o().OooO0Oo()) {
                    o0ooooo2.m19035OooO00o("[]");
                } else {
                    throw new XMPException("Misplaced rdf:li element", 202);
                }
            }
            return o0ooooo2;
        }
        throw new XMPException("XML namespace required for all elements and attributes", 202);
    }

    public static C7434o0OOoOo OooO00o(C7434o0OOoOo o0ooooo, String str, String str2) throws XMPException {
        if (AbstractC7410o0OOOoOo.Ooooooo.equals(str)) {
            str2 = C7431o0OOoO0o.OooO00o(str2);
        }
        C7434o0OOoOo o0ooooo2 = new C7434o0OOoOo(str, str2, null);
        o0ooooo.OooO0O0(o0ooooo2);
        return o0ooooo2;
    }

    public static void OooO00o() throws XMPException {
        throw new XMPException("ParseTypeCollection property element not allowed", 203);
    }

    public static void OooO00o(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node) throws XMPException {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!m18996OooO00o(item)) {
                OooO0OO(o0oooooo, o0ooooo, item, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(com.p118pd.sdk.C7433o0OOoOOO r16, com.p118pd.sdk.C7434o0OOoOo r17, org.w3c.dom.Node r18, boolean r19) throws com.adobe.xmp.XMPException {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7429o0OOoO00.OooO00o(com.pd.sdk.o0OOoOOO, com.pd.sdk.o0OOoOo, org.w3c.dom.Node, boolean):void");
    }

    public static void OooO00o(C7433o0OOoOOO o0oooooo, Node node) throws XMPException {
        if (node.hasAttributes()) {
            OooO00o(o0oooooo, o0oooooo.m19008OooO00o(), node);
            return;
        }
        throw new XMPException("Invalid attributes of rdf:RDF element", 202);
    }

    public static void OooO00o(C7434o0OOoOo o0ooooo) throws XMPException {
        C7434o0OOoOo OooO00o = o0ooooo.OooO00o(1);
        if (OooO00o.m19030OooO00o().OooO00o()) {
            if (!o0ooooo.m19030OooO00o().OooO00o()) {
                C7434o0OOoOo OooO0O02 = OooO00o.OooO0O0(1);
                OooO00o.OooO0o0(OooO0O02);
                o0ooooo.OooO0O0(OooO0O02);
            } else {
                throw new XMPException("Redundant xml:lang for rdf:value element", 203);
            }
        }
        for (int i = 1; i <= OooO00o.m19041OooO0OO(); i++) {
            o0ooooo.OooO0O0(OooO00o.OooO0O0(i));
        }
        for (int i2 = 2; i2 <= o0ooooo.OooO00o(); i2++) {
            o0ooooo.OooO0O0(o0ooooo.OooO00o(i2));
        }
        o0ooooo.OooO0OO(false);
        o0ooooo.m19030OooO00o().OooOO0(false);
        o0ooooo.m19030OooO00o().OooO00o(OooO00o.m19030OooO00o());
        o0ooooo.m19040OooO0O0(OooO00o.m19037OooO0O0());
        o0ooooo.m19042OooO0OO();
        Iterator OooO00o2 = OooO00o.m19032OooO00o();
        while (OooO00o2.hasNext()) {
            o0ooooo.OooO00o((C7434o0OOoOo) OooO00o2.next());
        }
    }

    public static boolean OooO00o(int i) {
        return 1 <= i && i <= 7;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18996OooO00o(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void OooO0O0() throws XMPException {
        throw new XMPException("ParseTypeLiteral property element not allowed", 203);
    }

    public static void OooO0O0(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        C7434o0OOoOo OooO00o = OooO00o(o0oooooo, o0ooooo, node, null, z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if (AbstractC7410o0OOOoOo.Ooooooo.equals(item.getNodeName())) {
                    OooO00o(OooO00o, AbstractC7410o0OOOoOo.Ooooooo, item.getNodeValue());
                } else if (!AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new XMPException("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node item2 = node.getChildNodes().item(i2);
            if (item2.getNodeType() == 3) {
                str = str + item2.getNodeValue();
            } else {
                throw new XMPException("Invalid child of literal property element", 202);
            }
        }
        OooO00o.m19040OooO0O0(str);
    }

    public static boolean OooO0O0(int i) {
        return 10 <= i && i <= 12;
    }

    public static void OooO0OO() throws XMPException {
        throw new XMPException("ParseTypeOther property element not allowed", 203);
    }

    public static void OooO0OO(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        int OooO00o = OooO00o(node);
        if (OooO00o != 8 && OooO00o != 0) {
            throw new XMPException("Node element must be rdf:Description or typed node", 202);
        } else if (!z || OooO00o != 0) {
            OooO0Oo(o0oooooo, o0ooooo, node, z);
            OooO0oO(o0oooooo, o0ooooo, node, z);
        } else {
            throw new XMPException("Top level typed node not allowed", 203);
        }
    }

    public static boolean OooO0OO(int i) {
        if (i == 8 || OooO0O0(i)) {
            return false;
        }
        return !OooO00o(i);
    }

    public static void OooO0Oo(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item = node.getAttributes().item(i2);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                int OooO00o = OooO00o(item);
                if (OooO00o == 0) {
                    OooO00o(o0oooooo, o0ooooo, item, item.getNodeValue(), z);
                } else if (OooO00o != 6 && OooO00o != 2 && OooO00o != 3) {
                    throw new XMPException("Invalid nodeElement attribute", 202);
                } else if (i <= 0) {
                    i++;
                    if (z && OooO00o == 3) {
                        if (o0ooooo.m19031OooO00o() == null || o0ooooo.m19031OooO00o().length() <= 0) {
                            o0ooooo.m19035OooO00o(item.getNodeValue());
                        } else if (!o0ooooo.m19031OooO00o().equals(item.getNodeValue())) {
                            throw new XMPException("Mismatched top level rdf:about values", 203);
                        }
                    }
                } else {
                    throw new XMPException("Mutally exclusive about, ID, nodeID attributes", 202);
                }
            }
        }
    }

    public static void OooO0o(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        if (OooO0OO(OooO00o(node))) {
            NamedNodeMap attributes = node.getAttributes();
            ArrayList<String> arrayList = null;
            for (int i = 0; i < attributes.getLength(); i++) {
                Node item = attributes.item(i);
                if ("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName()))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(item.getNodeName());
                }
            }
            if (arrayList != null) {
                for (String str : arrayList) {
                    attributes.removeNamedItem(str);
                }
            }
            if (attributes.getLength() <= 3) {
                for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                    Node item2 = attributes.item(i2);
                    String localName = item2.getLocalName();
                    String namespaceURI = item2.getNamespaceURI();
                    String nodeValue = item2.getNodeValue();
                    if (!AbstractC7410o0OOOoOo.Ooooooo.equals(item2.getNodeName()) || ("ID".equals(localName) && AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI))) {
                        if ("datatype".equals(localName) && AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI)) {
                            OooO0O0(o0oooooo, o0ooooo, node, z);
                            return;
                        } else if (!"parseType".equals(localName) || !AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI)) {
                            OooO00o(o0oooooo, o0ooooo, node, z);
                            return;
                        } else if ("Literal".equals(nodeValue)) {
                            OooO0O0();
                            return;
                        } else if ("Resource".equals(nodeValue)) {
                            OooO0o0(o0oooooo, o0ooooo, node, z);
                            return;
                        } else if ("Collection".equals(nodeValue)) {
                            OooO00o();
                            return;
                        } else {
                            OooO0OO();
                            return;
                        }
                    }
                }
                if (node.hasChildNodes()) {
                    for (int i3 = 0; i3 < node.getChildNodes().getLength(); i3++) {
                        if (node.getChildNodes().item(i3).getNodeType() != 3) {
                            OooO0oo(o0oooooo, o0ooooo, node, z);
                            return;
                        }
                    }
                    OooO0O0(o0oooooo, o0ooooo, node, z);
                    return;
                }
            }
            OooO00o(o0oooooo, o0ooooo, node, z);
            return;
        }
        throw new XMPException("Invalid property element name", 202);
    }

    public static void OooO0o0(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        C7434o0OOoOo OooO00o = OooO00o(o0oooooo, o0ooooo, node, "", z);
        OooO00o.m19030OooO00o().OooOO0(true);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String localName = item.getLocalName();
                String namespaceURI = item.getNamespaceURI();
                if (AbstractC7410o0OOOoOo.Ooooooo.equals(item.getNodeName())) {
                    OooO00o(OooO00o, AbstractC7410o0OOOoOo.Ooooooo, item.getNodeValue());
                } else if (!AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI) || (!"ID".equals(localName) && !"parseType".equals(localName))) {
                    throw new XMPException("Invalid attribute for ParseTypeResource property element", 202);
                }
            }
        }
        OooO0oO(o0oooooo, OooO00o, node, false);
        if (OooO00o.m19044OooO0o0()) {
            OooO00o(OooO00o);
        }
    }

    public static void OooO0oO(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!m18996OooO00o(item)) {
                if (item.getNodeType() == 1) {
                    OooO0o(o0oooooo, o0ooooo, item, z);
                } else {
                    throw new XMPException("Expected property element node not found", 202);
                }
            }
        }
    }

    public static void OooO0oo(C7433o0OOoOOO o0oooooo, C7434o0OOoOo o0ooooo, Node node, boolean z) throws XMPException {
        XMPException xMPException;
        if (!z || !"iX:changes".equals(node.getNodeName())) {
            C7434o0OOoOo OooO00o = OooO00o(o0oooooo, o0ooooo, node, "", z);
            for (int i = 0; i < node.getAttributes().getLength(); i++) {
                Node item = node.getAttributes().item(i);
                if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                    String localName = item.getLocalName();
                    String namespaceURI = item.getNamespaceURI();
                    if (AbstractC7410o0OOOoOo.Ooooooo.equals(item.getNodeName())) {
                        OooO00o(OooO00o, AbstractC7410o0OOOoOo.Ooooooo, item.getNodeValue());
                    } else if (!"ID".equals(localName) || !AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI)) {
                        throw new XMPException("Invalid attribute for resource property element", 202);
                    }
                }
            }
            boolean z2 = false;
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
                Node item2 = node.getChildNodes().item(i2);
                if (!m18996OooO00o(item2)) {
                    if (item2.getNodeType() == 1 && !z2) {
                        boolean equals = AbstractC7410o0OOOoOo.OooO0O0.equals(item2.getNamespaceURI());
                        String localName2 = item2.getLocalName();
                        if (equals && "Bag".equals(localName2)) {
                            OooO00o.m19030OooO00o().OooO00o(true);
                        } else if (equals && "Seq".equals(localName2)) {
                            OooO00o.m19030OooO00o().OooO00o(true).OooO0Oo(true);
                        } else if (!equals || !"Alt".equals(localName2)) {
                            OooO00o.m19030OooO00o().OooOO0(true);
                            if (!equals && !"Description".equals(localName2)) {
                                String namespaceURI2 = item2.getNamespaceURI();
                                if (namespaceURI2 != null) {
                                    OooO00o(OooO00o, AbstractC7410o0OOOoOo.o0OoOo0, namespaceURI2 + ':' + localName2);
                                } else {
                                    throw new XMPException("All XML elements must be in a namespace", 203);
                                }
                            }
                        } else {
                            OooO00o.m19030OooO00o().OooO00o(true).OooO0Oo(true).OooO0OO(true);
                        }
                        OooO0OO(o0oooooo, OooO00o, item2, false);
                        if (OooO00o.m19044OooO0o0()) {
                            OooO00o(OooO00o);
                        } else if (OooO00o.m19030OooO00o().OooO0o()) {
                            C7437o0OOoo0.OooO0O0(OooO00o);
                        }
                        z2 = true;
                    } else if (z2) {
                        throw xMPException;
                    } else {
                        xMPException = new XMPException("Children of resource property element must be XML elements", 202);
                        throw xMPException;
                    }
                }
            }
            if (!z2) {
                throw new XMPException("Missing child of resource property element", 202);
            }
        }
    }
}
