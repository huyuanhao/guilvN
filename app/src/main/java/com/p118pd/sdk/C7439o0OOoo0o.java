package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.adobe.xmp.XMPException;
import com.facebook.react.views.text.FontMetricsUtil;
import com.umeng.message.proguard.C3848l;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.o0OOoo0o  reason: case insensitive filesystem */
public final class C7439o0OOoo0o implements AbstractC7418o0OOo00o, AbstractC7410o0OOOoOo {
    public Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Pattern f20258OooO00o = Pattern.compile("[/*?\\[\\]]");
    public Map OooO0O0 = new HashMap();
    public Map OooO0OO = new HashMap();

    /* renamed from: com.pd.sdk.o0OOoo0o$OooO00o */
    public class OooO00o implements AbstractC7455o0Oo0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7450o0Oo00o f20259OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f20260OooO00o;
        public final /* synthetic */ String OooO0O0;
        public final /* synthetic */ String OooO0OO;

        public OooO00o(String str, String str2, String str3, C7450o0Oo00o o0oo00o) {
            this.f20260OooO00o = str;
            this.OooO0O0 = str2;
            this.OooO0OO = str3;
            this.f20259OooO00o = o0oo00o;
        }

        @Override // com.p118pd.sdk.AbstractC7455o0Oo0O0, com.p118pd.sdk.AbstractC7455o0Oo0O0
        public C7450o0Oo00o OooO00o() {
            return this.f20259OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7455o0Oo0O0, com.p118pd.sdk.AbstractC7455o0Oo0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m19056OooO00o() {
            return this.OooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC7455o0Oo0O0
        public String OooO0O0() {
            return this.OooO0OO;
        }

        @Override // com.p118pd.sdk.AbstractC7455o0Oo0O0
        public String getNamespace() {
            return this.f20260OooO00o;
        }

        public String toString() {
            return this.OooO0O0 + this.OooO0OO + " NS(" + this.f20260OooO00o + "), FORM (" + OooO00o() + C3848l.f10402t;
        }
    }

    public C7439o0OOoo0o() {
        try {
            OooO0O0();
            OooO00o();
        } catch (XMPException unused) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o
    private void OooO00o() throws XMPException {
        C7450o0Oo00o OooO0Oo = new C7450o0Oo00o().OooO0Oo(true);
        C7450o0Oo00o OooO0O02 = new C7450o0Oo00o().OooO0O0(true);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", OooO0Oo);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
        OooO00o("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOO0O, ExifInterface.f14209Oooo000, "http://purl.org/dc/elements/1.1/", "rights", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "Author", "http://purl.org/dc/elements/1.1/", "creator", OooO0Oo);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "Subject", "http://purl.org/dc/elements/1.1/", "description", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "Title", "http://purl.org/dc/elements/1.1/", "title", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, "Author", "http://purl.org/dc/elements/1.1/", "creator", OooO0Oo);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, "Caption", "http://purl.org/dc/elements/1.1/", "description", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, ExifInterface.f14209Oooo000, "http://purl.org/dc/elements/1.1/", "rights", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, "Marked", AbstractC7410o0OOOoOo.OooOO0O, "Marked", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, "Title", "http://purl.org/dc/elements/1.1/", "title", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOo, "WebStatement", AbstractC7410o0OOOoOo.OooOO0O, "WebStatement", null);
        OooO00o("http://ns.adobe.com/tiff/1.0/", ExifInterface.f14203OooOooo, "http://purl.org/dc/elements/1.1/", "creator", OooO0Oo);
        OooO00o("http://ns.adobe.com/tiff/1.0/", ExifInterface.f14209Oooo000, "http://purl.org/dc/elements/1.1/", "rights", null);
        OooO00o("http://ns.adobe.com/tiff/1.0/", ExifInterface.f14191OooOoO, "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        OooO00o("http://ns.adobe.com/tiff/1.0/", ExifInterface.f14195OooOoOO, "http://purl.org/dc/elements/1.1/", "description", null);
        OooO00o("http://ns.adobe.com/tiff/1.0/", ExifInterface.f14201OooOooO, "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, "Author", "http://purl.org/dc/elements/1.1/", "creator", OooO0Oo);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, ExifInterface.f14209Oooo000, "http://purl.org/dc/elements/1.1/", "rights", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, "Description", "http://purl.org/dc/elements/1.1/", "description", OooO0O02);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, ExifInterface.f14201OooOooO, "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        OooO00o(AbstractC7410o0OOOoOo.OooOooO, "Title", "http://purl.org/dc/elements/1.1/", "title", OooO0O02);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o
    private void OooO0O0() throws XMPException {
        m19051OooO00o(AbstractC7410o0OOOoOo.f20234OooO00o, "xml");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO0O0, "rdf");
        m19051OooO00o("http://purl.org/dc/elements/1.1/", SocializeProtocolConstants.PROTOCOL_KEY_DESCRIPTOR);
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO0Oo, "Iptc4xmpCore");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO0o0, "Iptc4xmpExt");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO0o, "DICOM");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO0oO, "plus");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO0oo, FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT);
        m19051OooO00o(AbstractC7410o0OOOoOo.OooO, "iX");
        m19051OooO00o("http://ns.adobe.com/xap/1.0/", "xmp");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOO0O, "xmpRights");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOO0o, "xmpMM");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOOO0, "xmpBJ");
        m19051OooO00o("http://ns.adobe.com/xmp/note/", "xmpNote");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOOOO, "pdf");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOOOo, "pdfx");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOOo0, "pdfxid");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOOo, "pdfaSchema");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOOoo, "pdfaProperty");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOo00, "pdfaType");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOo0, "pdfaField");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOo0O, "pdfaid");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOo0o, "pdfaExtension");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOo, "photoshop");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOoO0, "album");
        m19051OooO00o("http://ns.adobe.com/exif/1.0/", "exif");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOoOO, "exifEX");
        m19051OooO00o("http://ns.adobe.com/exif/1.0/aux/", "aux");
        m19051OooO00o("http://ns.adobe.com/tiff/1.0/", "tiff");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOooO, "png");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooOooo, "jpeg");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo000, "jp2k");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo00O, "crs");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo00o, "bmsp");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0, "creatorAtom");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0O0, "asf");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0OO, "wav");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0o0, "bext");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0o, "riffinfo");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0oO, "xmpScript");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo0oo, "txmp");
        m19051OooO00o(AbstractC7410o0OOOoOo.Oooo, "swf");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooO00, "xmpDM");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooO0, "xmpx");
        m19051OooO00o(AbstractC7410o0OOOoOo.o000oOoO, "xmpT");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooOOO, "xmpTPg");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooOOo, "xmpG");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooOo0, "xmpGImg");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooOoO, "stFnt");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooOO0, "stDim");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooOoo, "stEvt");
        m19051OooO00o(AbstractC7410o0OOOoOo.Ooooo00, "stRef");
        m19051OooO00o(AbstractC7410o0OOOoOo.Ooooo0o, "stVer");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooooO0, "stJob");
        m19051OooO00o(AbstractC7410o0OOOoOo.OooooOO, "stMfs");
        m19051OooO00o(AbstractC7410o0OOOoOo.OoooO, "xmpidq");
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o
    public synchronized AbstractC7455o0Oo0O0 OooO00o(String str) {
        return (AbstractC7455o0Oo0O0) this.OooO0OO.get(str);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o
    public synchronized AbstractC7455o0Oo0O0 OooO00o(String str, String str2) {
        String OooO00o2 = m19050OooO00o(str);
        if (OooO00o2 == null) {
            return null;
        }
        Map map = this.OooO0OO;
        return (AbstractC7455o0Oo0O0) map.get(OooO00o2 + str2);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized String m19050OooO00o(String str) {
        return (String) this.OooO00o.get(str);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized String m19051OooO00o(String str, String str2) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0O0(str2);
        if (str2.charAt(str2.length() - 1) != ':') {
            str2 = str2 + ':';
        }
        if (C7431o0OOoO0o.OooO0OO(str2.substring(0, str2.length() - 1))) {
            String str3 = (String) this.OooO00o.get(str);
            String str4 = (String) this.OooO0O0.get(str2);
            if (str3 != null) {
                return str3;
            }
            if (str4 != null) {
                String str5 = str2;
                int i = 1;
                while (this.OooO0O0.containsKey(str5)) {
                    str5 = str2.substring(0, str2.length() - 1) + "_" + i + "_:";
                    i++;
                }
                str2 = str5;
            }
            this.OooO0O0.put(str2, str);
            this.OooO00o.put(str, str2);
            return str2;
        }
        throw new XMPException("The prefix is a bad XML name", 201);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized Map m19052OooO00o() {
        return Collections.unmodifiableMap(new TreeMap(this.OooO0OO));
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m19053OooO00o(String str) {
        String OooO00o2 = m19050OooO00o(str);
        if (OooO00o2 != null) {
            this.OooO00o.remove(str);
            this.OooO0O0.remove(OooO00o2);
        }
    }

    public synchronized void OooO00o(String str, String str2, String str3, String str4, C7450o0Oo00o o0oo00o) throws XMPException {
        C7426o0OOo0oo.OooO0Oo(str);
        C7426o0OOo0oo.OooO0OO(str2);
        C7426o0OOo0oo.OooO0Oo(str3);
        C7426o0OOo0oo.OooO0OO(str4);
        C7450o0Oo00o o0oo00o2 = o0oo00o != null ? new C7450o0Oo00o(C7437o0OOoo0.OooO00o(o0oo00o.OooO00o(), (Object) null).m19073OooO00o()) : new C7450o0Oo00o();
        if (this.f20258OooO00o.matcher(str2).find() || this.f20258OooO00o.matcher(str4).find()) {
            throw new XMPException("Alias and actual property names must be simple", 102);
        }
        String OooO00o2 = m19050OooO00o(str);
        String OooO00o3 = m19050OooO00o(str3);
        if (OooO00o2 == null) {
            throw new XMPException("Alias namespace is not registered", 101);
        } else if (OooO00o3 != null) {
            String str5 = OooO00o2 + str2;
            if (!this.OooO0OO.containsKey(str5)) {
                if (!this.OooO0OO.containsKey(OooO00o3 + str4)) {
                    this.OooO0OO.put(str5, new OooO00o(str3, OooO00o3, str4, o0oo00o2));
                } else {
                    throw new XMPException("Actual property is already an alias, use the base property", 4);
                }
            } else {
                throw new XMPException("Alias is already existing", 4);
            }
        } else {
            throw new XMPException("Actual namespace is not registered", 101);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o, com.p118pd.sdk.AbstractC7418o0OOo00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized AbstractC7455o0Oo0O0[] m19054OooO00o(String str) {
        ArrayList arrayList;
        String OooO00o2 = m19050OooO00o(str);
        arrayList = new ArrayList();
        if (OooO00o2 != null) {
            for (String str2 : this.OooO0OO.keySet()) {
                if (str2.startsWith(OooO00o2)) {
                    arrayList.add(OooO00o(str2));
                }
            }
        }
        return (AbstractC7455o0Oo0O0[]) arrayList.toArray(new AbstractC7455o0Oo0O0[arrayList.size()]);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o
    public synchronized String OooO0O0(String str) {
        if (str != null) {
            if (!str.endsWith(Constants.COLON_SEPARATOR)) {
                str = str + Constants.COLON_SEPARATOR;
            }
        }
        return (String) this.OooO0O0.get(str);
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized Map m19055OooO0O0() {
        return Collections.unmodifiableMap(new TreeMap(this.OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC7418o0OOo00o
    public synchronized Map OooO0OO() {
        return Collections.unmodifiableMap(new TreeMap(this.OooO0O0));
    }
}
