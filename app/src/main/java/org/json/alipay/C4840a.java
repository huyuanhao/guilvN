package org.json.alipay;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: org.json.alipay.a */
public class C4840a {

    /* renamed from: a */
    public ArrayList f13511a;

    public C4840a() {
        this.f13511a = new ArrayList();
    }

    public C4840a(Object obj) {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f13511a.add(Array.get(obj, i));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }

    public C4840a(String str) {
        this(new C4843c(str));
    }

    public C4840a(Collection collection) {
        this.f13511a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public C4840a(C4843c cVar) {
        this();
        char c;
        Object obj;
        ArrayList arrayList;
        char c2 = cVar.mo45555c();
        if (c2 == '[') {
            c = ']';
        } else if (c2 == '(') {
            c = ')';
        } else {
            throw cVar.mo45552a("A JSONArray text must start with '['");
        }
        if (cVar.mo45555c() != ']') {
            do {
                cVar.mo45553a();
                char c3 = cVar.mo45555c();
                cVar.mo45553a();
                if (c3 == ',') {
                    arrayList = this.f13511a;
                    obj = null;
                } else {
                    arrayList = this.f13511a;
                    obj = cVar.mo45556d();
                }
                arrayList.add(obj);
                char c4 = cVar.mo45555c();
                if (c4 != ')') {
                    if (c4 != ',' && c4 != ';') {
                        if (c4 != ']') {
                            throw cVar.mo45552a("Expected a ',' or ']'");
                        }
                    }
                }
                if (c != c4) {
                    throw cVar.mo45552a("Expected a '" + new Character(c) + "'");
                }
                return;
            } while (cVar.mo45555c() != ']');
        }
    }

    /* renamed from: a */
    private String m14306a(String str) {
        int size = this.f13511a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(C4841b.m14309a(this.f13511a.get(i)));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final int mo45542a() {
        return this.f13511a.size();
    }

    /* renamed from: a */
    public final Object mo45543a(int i) {
        Object obj = (i < 0 || i >= this.f13511a.size()) ? null : this.f13511a.get(i);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public String toString() {
        try {
            return "[" + m14306a(Constants.ACCEPT_TIME_SEPARATOR_SP) + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
