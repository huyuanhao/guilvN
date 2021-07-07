package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.pd.sdk.o0OOoOo0  reason: case insensitive filesystem */
public class C7435o0OOoOo0 {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static DocumentBuilderFactory f20257OooO00o = OooO00o();

    public static AbstractC7416o0OOo000 OooO00o(Object obj, C7448o0Oo0 o0oo0) throws XMPException {
        C7426o0OOo0oo.OooO00o(obj);
        if (o0oo0 == null) {
            o0oo0 = new C7448o0Oo0();
        }
        Object[] OooO00o2 = OooO00o(m19045OooO00o(obj, o0oo0), o0oo0.OooO0o0(), new Object[3]);
        if (OooO00o2 == null || OooO00o2[1] != OooO00o) {
            return new C7433o0OOoOOO();
        }
        C7433o0OOoOOO OooO00o3 = C7429o0OOoO00.m18995OooO00o((Node) OooO00o2[0]);
        OooO00o3.OooO0O0((String) OooO00o2[2]);
        return !o0oo0.OooO0Oo() ? C7438o0OOoo0O.OooO00o(OooO00o3, o0oo0) : OooO00o3;
    }

    public static DocumentBuilderFactory OooO00o() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
        } catch (Exception unused) {
        }
        return newInstance;
    }

    public static Document OooO00o(C7421o0OOo0OO o0ooo0oo, C7448o0Oo0 o0oo0) throws XMPException {
        InputSource inputSource = new InputSource(o0ooo0oo.m18988OooO00o());
        try {
            if (o0oo0.m19067OooO0O0()) {
                try {
                    f20257OooO00o.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return OooO00o(inputSource);
        } catch (XMPException e) {
            if (e.getErrorCode() == 201 || e.getErrorCode() == 204) {
                if (o0oo0.OooO00o()) {
                    o0ooo0oo = C7425o0OOo0oO.OooO00o(o0ooo0oo);
                }
                if (!o0oo0.OooO0OO()) {
                    return OooO00o(new InputSource(o0ooo0oo.m18988OooO00o()));
                }
                try {
                    return OooO00o(new InputSource(new C7424o0OOo0o0(new InputStreamReader(o0ooo0oo.m18988OooO00o(), o0ooo0oo.m18989OooO00o()))));
                } catch (UnsupportedEncodingException unused2) {
                    throw new XMPException("Unsupported Encoding", 9, e);
                }
            } else {
                throw e;
            }
        }
    }

    public static Document OooO00o(InputStream inputStream, C7448o0Oo0 o0oo0) throws XMPException {
        if (!o0oo0.OooO00o() && !o0oo0.OooO0OO()) {
            return OooO00o(new InputSource(inputStream));
        }
        try {
            return OooO00o(new C7421o0OOo0OO(inputStream), o0oo0);
        } catch (IOException e) {
            throw new XMPException("Error reading the XML-file", 204, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Document m19045OooO00o(Object obj, C7448o0Oo0 o0oo0) throws XMPException {
        return obj instanceof InputStream ? OooO00o((InputStream) obj, o0oo0) : obj instanceof byte[] ? OooO00o(new C7421o0OOo0OO((byte[]) obj), o0oo0) : OooO00o((String) obj, o0oo0);
    }

    public static Document OooO00o(String str, C7448o0Oo0 o0oo0) throws XMPException {
        new InputSource(new StringReader(str));
        try {
            if (o0oo0.m19067OooO0O0()) {
                try {
                    f20257OooO00o.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return OooO00o(new InputSource(new StringReader(str)));
        } catch (XMPException e) {
            if (e.getErrorCode() == 201 && o0oo0.OooO0OO()) {
                return OooO00o(new InputSource(new C7424o0OOo0o0(new StringReader(str))));
            }
            throw e;
        }
    }

    public static Document OooO00o(InputSource inputSource) throws XMPException {
        try {
            DocumentBuilder newDocumentBuilder = f20257OooO00o.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (SAXException e) {
            throw new XMPException("XML parsing failure", 201, e);
        } catch (ParserConfigurationException e2) {
            throw new XMPException("XML Parser not correctly configured", 0, e2);
        } catch (IOException e3) {
            throw new XMPException("Error reading the XML-file", 204, e3);
        }
    }

    public static Object[] OooO00o(Node node, boolean z, Object[] objArr) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (7 == item.getNodeType()) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                if (AbstractC7410o0OOOoOo.ooOO.equals(processingInstruction.getTarget())) {
                    if (objArr != null) {
                        objArr[2] = processingInstruction.getData();
                    }
                }
            }
            if (!(3 == item.getNodeType() || 7 == item.getNodeType())) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ((AbstractC7410o0OOOoOo.o00O0O.equals(localName) || AbstractC7410o0OOOoOo.o00Oo0.equals(localName)) && AbstractC7410o0OOOoOo.OooO0oo.equals(namespaceURI)) {
                    return OooO00o(item, false, objArr);
                }
                if (z || !"RDF".equals(localName) || !AbstractC7410o0OOOoOo.OooO0O0.equals(namespaceURI)) {
                    Object[] OooO00o2 = OooO00o(item, z, objArr);
                    if (OooO00o2 != null) {
                        return OooO00o2;
                    }
                } else {
                    if (objArr != null) {
                        objArr[0] = item;
                        objArr[1] = OooO00o;
                    }
                    return objArr;
                }
            }
        }
        return null;
    }
}
