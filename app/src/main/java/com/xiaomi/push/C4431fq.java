package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.xiaomi.push.fq */
public class C4431fq {

    /* renamed from: a */
    public XmlPullParser f11950a;

    public C4431fq() {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f11950a = newPullParser;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* renamed from: a */
    public AbstractC4456gl mo41885a(byte[] bArr, AbstractC4435fu fuVar) {
        this.f11950a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f11950a.next();
        int eventType = this.f11950a.getEventType();
        String name = this.f11950a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return C4467gt.m12821a(this.f11950a);
        }
        if (name.equals("iq")) {
            return C4467gt.m12820a(this.f11950a, fuVar);
        }
        if (name.equals("presence")) {
            return C4467gt.m12822a(this.f11950a);
        }
        if (this.f11950a.getName().equals("stream")) {
            return null;
        }
        if (this.f11950a.getName().equals("error")) {
            throw new C4449gf(C4467gt.m12823a(this.f11950a));
        } else if (this.f11950a.getName().equals("warning")) {
            this.f11950a.next();
            this.f11950a.getName().equals("multi-login");
            return null;
        } else {
            this.f11950a.getName().equals("bind");
            return null;
        }
    }
}
