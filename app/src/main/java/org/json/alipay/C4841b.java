package org.json.alipay;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: org.json.alipay.b */
public class C4841b {

    /* renamed from: a */
    public static final Object f13512a = new C4842a((byte) 0);

    /* renamed from: b */
    public Map f13513b;

    /* renamed from: org.json.alipay.b$a */
    public static final class C4842a {
        public C4842a() {
        }

        public /* synthetic */ C4842a(byte b) {
            this();
        }

        public final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return "null";
        }
    }

    public C4841b() {
        this.f13513b = new HashMap();
    }

    public C4841b(String str) {
        this(new C4843c(str));
    }

    public C4841b(Map map) {
        this.f13513b = map == null ? new HashMap() : map;
    }

    public C4841b(C4843c cVar) {
        this();
        if (cVar.mo45555c() == '{') {
            while (true) {
                char c = cVar.mo45555c();
                if (c == 0) {
                    throw cVar.mo45552a("A JSONObject text must end with '}'");
                } else if (c != '}') {
                    cVar.mo45553a();
                    String obj = cVar.mo45556d().toString();
                    char c2 = cVar.mo45555c();
                    if (c2 == '=') {
                        if (cVar.mo45554b() != '>') {
                            cVar.mo45553a();
                        }
                    } else if (c2 != ':') {
                        throw cVar.mo45552a("Expected a ':' after a key");
                    }
                    Object d = cVar.mo45556d();
                    if (obj != null) {
                        if (d != null) {
                            m14310b(d);
                            this.f13513b.put(obj, d);
                        } else {
                            this.f13513b.remove(obj);
                        }
                        char c3 = cVar.mo45555c();
                        if (c3 == ',' || c3 == ';') {
                            if (cVar.mo45555c() != '}') {
                                cVar.mo45553a();
                            } else {
                                return;
                            }
                        } else if (c3 != '}') {
                            throw cVar.mo45552a("Expected a ',' or '}'");
                        } else {
                            return;
                        }
                    } else {
                        throw new JSONException("Null key.");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw cVar.mo45552a("A JSONObject text must begin with '{'");
        }
    }

    /* renamed from: a */
    public static String m14309a(Object obj) {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (!(obj instanceof Number)) {
            return ((obj instanceof Boolean) || (obj instanceof C4841b) || (obj instanceof C4840a)) ? obj.toString() : obj instanceof Map ? new C4841b((Map) obj).toString() : obj instanceof Collection ? new C4840a((Collection) obj).toString() : obj.getClass().isArray() ? new C4840a(obj).toString() : m14311c(obj.toString());
        }
        Number number = (Number) obj;
        if (number != null) {
            m14310b(number);
            String obj2 = number.toString();
            if (obj2.indexOf(46) <= 0 || obj2.indexOf(101) >= 0 || obj2.indexOf(69) >= 0) {
                return obj2;
            }
            while (obj2.endsWith("0")) {
                obj2 = obj2.substring(0, obj2.length() - 1);
            }
            return obj2.endsWith(C9058ooOoOoOO.OooOO0) ? obj2.substring(0, obj2.length() - 1) : obj2;
        }
        throw new JSONException("Null pointer");
    }

    /* renamed from: b */
    public static void m14310b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4 == '<') goto L_0x0086;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14311c(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.C4841b.m14311c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final Object mo45545a(String str) {
        Object obj = str == null ? null : this.f13513b.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + m14311c(str) + "] not found.");
    }

    /* renamed from: a */
    public final Iterator mo45546a() {
        return this.f13513b.keySet().iterator();
    }

    /* renamed from: b */
    public final boolean mo45547b(String str) {
        return this.f13513b.containsKey(str);
    }

    public String toString() {
        try {
            Iterator a = mo45546a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (a.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(AbstractC1299b.COMMA);
                }
                Object next = a.next();
                stringBuffer.append(m14311c(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(m14309a(this.f13513b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
