package com.xiaomi.push.service;

import com.xiaomi.push.AbstractC4465gr;
import com.xiaomi.push.C4452gi;
import com.xiaomi.push.C4466gs;
import com.xiaomi.push.C4470gw;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.xiaomi.push.service.e */
public class C4659e implements AbstractC4465gr {
    /* renamed from: a */
    public static C4452gi m14090a(XmlPullParser xmlPullParser) {
        ArrayList arrayList;
        String str;
        String[] strArr;
        String[] strArr2;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                strArr3[i] = xmlPullParser.getAttributeName(i);
                strArr4[i] = C4470gw.m12834b(xmlPullParser.getAttributeValue(i));
            }
            strArr2 = strArr3;
            str = null;
            arrayList = null;
            strArr = strArr4;
        } else {
            strArr2 = null;
            strArr = null;
            str = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new C4452gi(name, namespace, strArr2, strArr, str, arrayList);
            }
            if (next == 4) {
                str = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C4452gi a = m14090a(xmlPullParser);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo42721a() {
        C4466gs.mo41986a().mo41987a("all", "xm:chat", this);
    }

    /* renamed from: b */
    public C4452gi mo42722b(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m14090a(xmlPullParser);
        }
        return null;
    }
}
