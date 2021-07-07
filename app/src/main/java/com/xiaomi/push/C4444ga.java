package com.xiaomi.push;

import com.vivo.push.PushClientConstants;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.xiaomi.push.ga */
public final class C4444ga {

    /* renamed from: a */
    public static int f11992a = 5000;

    /* renamed from: a */
    public static Vector<String> f11993a = new Vector<>();

    /* renamed from: b */
    public static int f11994b = 330000;

    /* renamed from: c */
    public static int f11995c = 600000;

    /* renamed from: d */
    public static int f11996d = 330000;

    static {
        try {
            for (ClassLoader classLoader : m12711a()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStream = null;
                    try {
                        inputStream = resources.nextElement().openStream();
                        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                        newPullParser.setInput(inputStream, "UTF-8");
                        int eventType = newPullParser.getEventType();
                        do {
                            if (eventType == 2) {
                                if (newPullParser.getName().equals(PushClientConstants.TAG_CLASS_NAME)) {
                                    m12710a(newPullParser);
                                } else if (newPullParser.getName().equals("packetReplyTimeout")) {
                                    f11992a = m12708a(newPullParser, f11992a);
                                } else if (newPullParser.getName().equals("keepAliveInterval")) {
                                    f11994b = m12708a(newPullParser, f11994b);
                                } else if (newPullParser.getName().equals("mechName")) {
                                    f11993a.add(newPullParser.nextText());
                                }
                            }
                            eventType = newPullParser.next();
                        } while (eventType != 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } catch (Throwable th) {
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m12707a() {
        return f11994b;
    }

    /* renamed from: a */
    public static int m12708a(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: a */
    public static String m12709a() {
        return "3.1.0";
    }

    /* renamed from: a */
    public static void m12710a(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        try {
            Class.forName(nextText);
        } catch (ClassNotFoundException unused) {
            PrintStream printStream = System.err;
            printStream.println("Error! A startup class specified in smack-config.xml could not be loaded: " + nextText);
        }
    }

    /* renamed from: a */
    public static ClassLoader[] m12711a() {
        ClassLoader[] classLoaderArr = {C4444ga.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* renamed from: b */
    public static int m12712b() {
        return f11995c;
    }
}
