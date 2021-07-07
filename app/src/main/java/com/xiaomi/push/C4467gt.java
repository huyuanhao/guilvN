package com.xiaomi.push;

import android.text.TextUtils;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.p118pd.sdk.AbstractC7410o0OOOoOo;
import com.p118pd.sdk.AbstractC8411oOoo0Oo0;
import com.umeng.commonsdk.proguard.C3617o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.push.C4453gj;
import com.xiaomi.push.C4458gn;
import com.xiaomi.push.C4462gp;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.C4628av;
import com.xiaomi.push.service.C4659e;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.xiaomi.push.gt */
public class C4467gt {

    /* renamed from: a */
    public static XmlPullParser f12111a;

    /* renamed from: a */
    public static C4452gi m12819a(String str, String str2, XmlPullParser xmlPullParser) {
        Object a = C4466gs.mo41986a().m12816a("all", "xm:chat");
        if (a == null || !(a instanceof C4659e)) {
            return null;
        }
        return ((C4659e) a).mo42722b(xmlPullParser);
    }

    /* renamed from: a */
    public static C4453gj m12820a(XmlPullParser xmlPullParser, AbstractC4435fu fuVar) {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        C4453gj.C4454a a = C4453gj.C4454a.m12754a(xmlPullParser.getAttributeValue("", "type"));
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            hashMap.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        C4453gj gjVar = null;
        C4462gp gpVar = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    gpVar = m12824a(xmlPullParser);
                } else {
                    gjVar = new C4453gj();
                    gjVar.mo41964a(m12819a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (gjVar == null) {
            if (C4453gj.C4454a.f12024a == a || C4453gj.C4454a.f12025b == a) {
                C4468gu guVar = new C4468gu();
                guVar.mo41968k(attributeValue);
                guVar.mo41972m(attributeValue3);
                guVar.mo41974n(attributeValue2);
                guVar.mo41939a(C4453gj.C4454a.f12027d);
                guVar.mo41970l(attributeValue4);
                guVar.mo41965a(new C4462gp(C4462gp.C4463a.f12087e));
                fuVar.mo41889a(guVar);
                AbstractC4163b.m11306d("iq usage error. send packet in packet parser.");
                return null;
            }
            gjVar = new C4469gv();
        }
        gjVar.mo41968k(attributeValue);
        gjVar.mo41972m(attributeValue2);
        gjVar.mo41970l(attributeValue4);
        gjVar.mo41974n(attributeValue3);
        gjVar.mo41939a(a);
        gjVar.mo41965a(gpVar);
        gjVar.mo41940a(hashMap);
        return gjVar;
    }

    /* renamed from: a */
    public static AbstractC4456gl m12821a(XmlPullParser xmlPullParser) {
        String str;
        boolean z = false;
        String str2 = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", C3617o.f9366at))) {
            String attributeValue = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "type");
            C4611am.C4613b a = C4611am.mo42670a().mo42671a(attributeValue, attributeValue4);
            if (a == null) {
                a = C4611am.mo42670a().mo42671a(attributeValue, attributeValue3);
            }
            if (a != null) {
                AbstractC4456gl glVar = null;
                while (!z) {
                    int next = xmlPullParser.next();
                    if (next == 2) {
                        if (!C3617o.f9366at.equals(xmlPullParser.getName())) {
                            throw new C4449gf("error while receiving a encrypted message with wrong format");
                        } else if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if ("5".equals(attributeValue) || "6".equals(attributeValue)) {
                                C4455gk gkVar = new C4455gk();
                                gkVar.mo41970l(attributeValue);
                                gkVar.mo41947b(true);
                                gkVar.mo41974n(attributeValue3);
                                gkVar.mo41972m(attributeValue4);
                                gkVar.mo41968k(attributeValue2);
                                gkVar.mo41956f(attributeValue5);
                                C4452gi giVar = new C4452gi(C3617o.f9366at, null, null, null);
                                giVar.m12744a(text);
                                gkVar.mo41964a(giVar);
                                return gkVar;
                            }
                            m12826a(C4628av.m14005a(C4628av.m14004a(a.f13195h, attributeValue2), text));
                            f12111a.next();
                            glVar = m12821a(f12111a);
                        } else {
                            throw new C4449gf("error while receiving a encrypted message with wrong format");
                        }
                    } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                        z = true;
                    }
                }
                if (glVar != null) {
                    return glVar;
                }
                throw new C4449gf("error while receiving a encrypted message with wrong format");
            }
            throw new C4449gf("the channel id is wrong while receiving a encrypted message");
        }
        C4455gk gkVar2 = new C4455gk();
        String attributeValue6 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue6 == null) {
            attributeValue6 = "ID_NOT_AVAILABLE";
        }
        gkVar2.mo41968k(attributeValue6);
        gkVar2.mo41972m(xmlPullParser.getAttributeValue("", "to"));
        gkVar2.mo41974n(xmlPullParser.getAttributeValue("", "from"));
        gkVar2.mo41970l(xmlPullParser.getAttributeValue("", "chid"));
        gkVar2.mo41943a(xmlPullParser.getAttributeValue("", ConstantHelper.LOG_APPID));
        try {
            str = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            str = null;
        }
        try {
            String attributeValue7 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue7)) {
                gkVar2.mo41946b(attributeValue7);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                gkVar2.mo41949c(attributeValue8);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                gkVar2.mo41951d(attributeValue9);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "status");
            if (!TextUtils.isEmpty(attributeValue10)) {
                gkVar2.mo41953e(attributeValue10);
            }
        } catch (Exception unused5) {
        }
        gkVar2.mo41945a(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("true"));
        gkVar2.mo41956f(xmlPullParser.getAttributeValue("", "type"));
        String b = m12827b(xmlPullParser);
        if (b == null || "".equals(b.trim())) {
            AbstractC4456gl.m12778q();
        } else {
            gkVar2.mo41963j(b);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    m12827b(xmlPullParser);
                    gkVar2.mo41958g(m12825a(xmlPullParser));
                } else if (name.equals(AgooConstants.MESSAGE_BODY)) {
                    String attributeValue11 = xmlPullParser.getAttributeValue("", "encode");
                    String a2 = m12825a(xmlPullParser);
                    if (!TextUtils.isEmpty(attributeValue11)) {
                        gkVar2.mo41944a(a2, attributeValue11);
                    } else {
                        gkVar2.mo41960h(a2);
                    }
                } else if (name.equals("thread")) {
                    if (str2 == null) {
                        str2 = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    gkVar2.mo41965a(m12824a(xmlPullParser));
                } else {
                    gkVar2.mo41964a(m12819a(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        gkVar2.mo41962i(str2);
        return gkVar2;
    }

    /* renamed from: a */
    public static C4458gn m12822a(XmlPullParser xmlPullParser) {
        C4458gn.EnumC4460b bVar = C4458gn.EnumC4460b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVar = C4458gn.EnumC4460b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                PrintStream printStream = System.err;
                printStream.println("Found invalid presence type " + attributeValue);
            }
        }
        C4458gn gnVar = new C4458gn(bVar);
        gnVar.mo41972m(xmlPullParser.getAttributeValue("", "to"));
        gnVar.mo41974n(xmlPullParser.getAttributeValue("", "from"));
        gnVar.mo41970l(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        gnVar.mo41968k(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("status")) {
                    gnVar.mo41943a(xmlPullParser.nextText());
                } else if (name.equals(AbstractC8411oOoo0Oo0.OooOOo)) {
                    try {
                        gnVar.mo41978a(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        gnVar.mo41978a(0);
                    }
                } else if (name.equals("show")) {
                    String nextText = xmlPullParser.nextText();
                    try {
                        gnVar.mo41979a(C4458gn.EnumC4459a.valueOf(nextText));
                    } catch (IllegalArgumentException unused4) {
                        PrintStream printStream2 = System.err;
                        printStream2.println("Found invalid presence mode " + nextText);
                    }
                } else if (name.equals("error")) {
                    gnVar.mo41965a(m12824a(xmlPullParser));
                } else {
                    gnVar.mo41964a(m12819a(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return gnVar;
    }

    /* renamed from: a */
    public static C4461go m12823a(XmlPullParser xmlPullParser) {
        C4461go goVar = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                goVar = new C4461go(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return goVar;
    }

    /* renamed from: a */
    public static C4462gp m12824a(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        String str = "-1";
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                str = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                str3 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals(MiPushCommandMessage.KEY_REASON)) {
                str2 = xmlPullParser.getAttributeValue("", MiPushCommandMessage.KEY_REASON);
            }
        }
        String str4 = null;
        String str5 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    str5 = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str4 = name;
                    } else {
                        arrayList.add(m12819a(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                str5 = xmlPullParser.getText();
            }
        }
        return new C4462gp(Integer.parseInt(str), str3 == null ? "cancel" : str3, str2, str4, str5, arrayList);
    }

    /* renamed from: a */
    public static String m12825a(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    /* renamed from: a */
    public static void m12826a(byte[] bArr) {
        if (f12111a == null) {
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f12111a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f12111a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* renamed from: b */
    public static String m12827b(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if (AbstractC7410o0OOOoOo.Ooooooo.equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
