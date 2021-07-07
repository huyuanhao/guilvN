package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import com.umeng.message.proguard.C3848l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.xiaomi.push.gp */
public class C4462gp {

    /* renamed from: a */
    public int f12077a;

    /* renamed from: a */
    public String f12078a;

    /* renamed from: a */
    public List<C4452gi> f12079a = null;

    /* renamed from: b */
    public String f12080b;

    /* renamed from: c */
    public String f12081c;

    /* renamed from: d */
    public String f12082d;

    /* renamed from: com.xiaomi.push.gp$a */
    public static class C4463a {

        /* renamed from: a */
        public static final C4463a f12083a = new C4463a("internal-server-error");

        /* renamed from: b */
        public static final C4463a f12084b = new C4463a("forbidden");

        /* renamed from: c */
        public static final C4463a f12085c = new C4463a("bad-request");

        /* renamed from: d */
        public static final C4463a f12086d = new C4463a("conflict");

        /* renamed from: e */
        public static final C4463a f12087e = new C4463a("feature-not-implemented");

        /* renamed from: f */
        public static final C4463a f12088f = new C4463a("gone");

        /* renamed from: g */
        public static final C4463a f12089g = new C4463a("item-not-found");

        /* renamed from: h */
        public static final C4463a f12090h = new C4463a("jid-malformed");

        /* renamed from: i */
        public static final C4463a f12091i = new C4463a("not-acceptable");

        /* renamed from: j */
        public static final C4463a f12092j = new C4463a("not-allowed");

        /* renamed from: k */
        public static final C4463a f12093k = new C4463a("not-authorized");

        /* renamed from: l */
        public static final C4463a f12094l = new C4463a("payment-required");

        /* renamed from: m */
        public static final C4463a f12095m = new C4463a("recipient-unavailable");

        /* renamed from: n */
        public static final C4463a f12096n = new C4463a("redirect");

        /* renamed from: o */
        public static final C4463a f12097o = new C4463a("registration-required");

        /* renamed from: p */
        public static final C4463a f12098p = new C4463a("remote-server-error");

        /* renamed from: q */
        public static final C4463a f12099q = new C4463a("remote-server-not-found");

        /* renamed from: r */
        public static final C4463a f12100r = new C4463a("remote-server-timeout");

        /* renamed from: s */
        public static final C4463a f12101s = new C4463a("resource-constraint");

        /* renamed from: t */
        public static final C4463a f12102t = new C4463a("service-unavailable");

        /* renamed from: u */
        public static final C4463a f12103u = new C4463a("subscription-required");

        /* renamed from: v */
        public static final C4463a f12104v = new C4463a("undefined-condition");

        /* renamed from: w */
        public static final C4463a f12105w = new C4463a("unexpected-request");

        /* renamed from: x */
        public static final C4463a f12106x = new C4463a("request-timeout");

        /* renamed from: a */
        public String f12107a;

        public C4463a(String str) {
            this.f12107a = str;
        }

        public String toString() {
            return this.f12107a;
        }
    }

    public C4462gp(int i, String str, String str2, String str3, String str4, List<C4452gi> list) {
        this.f12077a = i;
        this.f12078a = str;
        this.f12081c = str2;
        this.f12080b = str3;
        this.f12082d = str4;
        this.f12079a = list;
    }

    public C4462gp(Bundle bundle) {
        this.f12077a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f12078a = bundle.getString("ext_err_type");
        }
        this.f12080b = bundle.getString("ext_err_cond");
        this.f12081c = bundle.getString("ext_err_reason");
        this.f12082d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f12079a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C4452gi a = C4452gi.m12737a((Bundle) parcelable);
                if (a != null) {
                    this.f12079a.add(a);
                }
            }
        }
    }

    public C4462gp(C4463a aVar) {
        m12808a(aVar);
        this.f12082d = null;
    }

    /* renamed from: a */
    private void m12808a(C4463a aVar) {
        this.f12080b = aVar.f12107a;
    }

    /* renamed from: a */
    public Bundle mo41982a() {
        Bundle bundle = new Bundle();
        String str = this.f12078a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f12077a);
        String str2 = this.f12081c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f12080b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f12082d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<C4452gi> list = this.f12079a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (C4452gi giVar : this.f12079a) {
                Bundle a = giVar.mo41932a();
                if (a != null) {
                    bundleArr[i] = a;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: a */
    public String m12810a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.f12077a);
        sb.append("\"");
        if (this.f12078a != null) {
            sb.append(" type=\"");
            sb.append(this.f12078a);
            sb.append("\"");
        }
        if (this.f12081c != null) {
            sb.append(" reason=\"");
            sb.append(this.f12081c);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f12080b != null) {
            sb.append("<");
            sb.append(this.f12080b);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f12082d != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.f12082d);
            sb.append("</text>");
        }
        for (C4452gi giVar : m12811a()) {
            sb.append(giVar.mo41936d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized List<C4452gi> m12811a() {
        if (this.f12079a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.f12079a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f12080b;
        if (str != null) {
            sb.append(str);
        }
        sb.append(C3848l.f10401s);
        sb.append(this.f12077a);
        sb.append(C3848l.f10402t);
        if (this.f12082d != null) {
            sb.append(" ");
            sb.append(this.f12082d);
        }
        return sb.toString();
    }
}
