package com.p118pd.sdk;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.pd.sdk.ooOOo0oo  reason: case insensitive filesystem */
public class C8973ooOOo0oo {
    public static C8973ooOOo0oo OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22235OooO00o = "ConfigureManager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8975ooOOoO0 f22236OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8977ooOOoO0O f22237OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8983ooOOoOo f22238OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22239OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public DocumentBuilder f22240OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22241OooO00o;

    public void OooO00o(boolean z) {
        this.f22241OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20638OooO00o() {
        return this.f22241OooO00o;
    }

    public void OooO00o(AbstractC8983ooOOoOo ooooooo) {
        this.f22238OooO00o = ooooooo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8983ooOOoOo m20636OooO00o() {
        return this.f22238OooO00o;
    }

    public void OooO00o(AbstractC8977ooOOoO0O oooooo0o) {
        this.f22237OooO00o = oooooo0o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8977ooOOoO0O m20635OooO00o() {
        return this.f22237OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8975ooOOoO0 m20634OooO00o() {
        return this.f22236OooO00o;
    }

    public void OooO00o(AbstractC8975ooOOoO0 oooooo0) {
        this.f22236OooO00o = oooooo0;
    }

    public static C8973ooOOo0oo OooO00o() {
        if (OooO00o == null) {
            OooO00o = new C8973ooOOo0oo();
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public DocumentBuilder m20637OooO00o() {
        if (this.f22240OooO00o == null) {
            try {
                this.f22240OooO00o = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.getMessage();
            }
        }
        return this.f22240OooO00o;
    }

    public String OooO00o(String str) {
        return this.f22239OooO00o.get(str);
    }

    public void OooO00o(String str, String str2) {
        this.f22239OooO00o.put(str, str2);
    }

    public void OooO00o(AssetManager assetManager, String str) {
        InputStream inputStream;
        if (C9054ooOoOo0.OooO0OO(str)) {
            str = "config";
        }
        try {
            inputStream = assetManager.open("config/" + str + C5982OoooOoO.OooO);
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            OooO00o().OooO00o(inputStream);
        } catch (Exception unused2) {
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused3) {
            }
        }
    }

    public void OooO00o(AssetManager assetManager) {
        OooO00o(assetManager, "config");
    }

    public void OooO00o(InputStream inputStream) throws Exception {
        NodeList elementsByTagName = m20637OooO00o().parse(inputStream).getDocumentElement().getElementsByTagName("item");
        if (!(elementsByTagName == null || elementsByTagName.getLength() == 0)) {
            NodeList childNodes = ((Element) elementsByTagName.item(0)).getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1) {
                    this.f22239OooO00o.put(item.getNodeName(), item.getTextContent());
                }
            }
        }
    }
}
