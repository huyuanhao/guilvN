package com.megvii.meglive_sdk.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.megvii.meglive_sdk.volley.AbstractC1616b;
import com.megvii.meglive_sdk.volley.C1631o;
import com.megvii.meglive_sdk.volley.C1654u;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C8318oOo0oooo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.megvii.meglive_sdk.volley.m */
public abstract class AbstractC1628m<T> implements Comparable<AbstractC1628m<T>> {

    /* renamed from: a */
    public final C1654u.OooO00o f2882a;

    /* renamed from: d */
    public final int f2883d;

    /* renamed from: e */
    public final String f2884e;

    /* renamed from: f */
    public final int f2885f;

    /* renamed from: g */
    public C1631o.AbstractC1632a f2886g;

    /* renamed from: h */
    public Integer f2887h;

    /* renamed from: i */
    public C1630n f2888i;

    /* renamed from: j */
    public boolean f2889j;

    /* renamed from: k */
    public boolean f2890k;

    /* renamed from: l */
    public boolean f2891l;

    /* renamed from: m */
    public boolean f2892m;

    /* renamed from: n */
    public AbstractC1635q f2893n;

    /* renamed from: o */
    public AbstractC1616b.C1617a f2894o;

    /* renamed from: com.megvii.meglive_sdk.volley.m$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ long OooO00o;
        public final /* synthetic */ String o0ooOOo;

        public OooO00o(String str, long j) {
            this.o0ooOOo = str;
            this.OooO00o = j;
        }

        public final void run() {
            AbstractC1628m.this.f2882a.OooO00o(this.o0ooOOo, this.OooO00o);
            AbstractC1628m.this.f2882a.OooO00o(toString());
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.m$a */
    public enum EnumC1629a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC1628m(int i, String str, C1631o.AbstractC1632a aVar) {
        Uri parse;
        String host;
        this.f2882a = C1654u.OooO00o.OooO0O0 ? new C1654u.OooO00o() : null;
        this.f2889j = true;
        int i2 = 0;
        this.f2890k = false;
        this.f2891l = false;
        this.f2892m = false;
        this.f2894o = null;
        this.f2883d = i;
        this.f2884e = str;
        this.f2886g = aVar;
        this.f2893n = new C1620e();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f2885f = i2;
    }

    /* renamed from: a */
    public static C1638t m2792a(C1638t tVar) {
        return tVar;
    }

    /* renamed from: d */
    public static String m2795d() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    /* renamed from: a */
    public abstract C1631o<T> mo17346a(C1625j jVar);

    /* renamed from: a */
    public Map<String, String> mo16994a() {
        return null;
    }

    /* renamed from: a */
    public abstract void mo17347a(T t);

    /* renamed from: b */
    public final void mo17349b(String str) {
        C1630n nVar = this.f2888i;
        if (nVar != null) {
            nVar.mo17359b(this);
        }
        if (C1654u.OooO00o.OooO0O0) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new OooO00o(str, id));
                return;
            }
            this.f2882a.OooO00o(str, id);
            this.f2882a.OooO00o(toString());
        }
    }

    @Deprecated
    /* renamed from: c */
    public final byte[] mo17350c() {
        Map<String, String> a = mo16994a();
        if (a == null || a.size() <= 0) {
            return null;
        }
        return m2794a(a, "UTF-8");
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        AbstractC1628m mVar = (AbstractC1628m) obj;
        EnumC1629a f = mo17353f();
        EnumC1629a f2 = mVar.mo17353f();
        if (f == f2) {
            return this.f2887h.intValue() - mVar.f2887h.intValue();
        }
        return f2.ordinal() - f.ordinal();
    }

    /* renamed from: e */
    public final byte[] mo17352e() {
        Map<String, String> a = mo16994a();
        if (a == null || a.size() <= 0) {
            return null;
        }
        return m2794a(a, "UTF-8");
    }

    /* renamed from: f */
    public EnumC1629a mo17353f() {
        return EnumC1629a.NORMAL;
    }

    /* renamed from: g */
    public final int mo17354g() {
        return this.f2893n.mo17336a();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(this.f2885f);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2890k ? "[X] " : "[ ] ");
        sb.append(this.f2884e);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(mo17353f());
        sb.append(" ");
        sb.append(this.f2887h);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo17348a(String str) {
        if (C1654u.OooO00o.OooO0O0) {
            this.f2882a.OooO00o(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: a */
    public static byte[] m2794a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append(C7490o0OoOO0o.OooO00o);
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append(C8318oOo0oooo.OooO0OO);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: b */
    public Map<String, String> mo16995b() {
        return Collections.emptyMap();
    }
}
