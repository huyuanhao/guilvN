package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.proto.C3708a;
import com.umeng.commonsdk.statistics.proto.C3715b;
import com.umeng.commonsdk.statistics.proto.C3722c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.a */
public abstract class AbstractC3672a {

    /* renamed from: a */
    public final int f9620a = 10;

    /* renamed from: b */
    public final int f9621b = 100;

    /* renamed from: c */
    public final String f9622c;

    /* renamed from: d */
    public List<C3708a> f9623d;

    /* renamed from: e */
    public C3715b f9624e;

    public AbstractC3672a(String str) {
        this.f9622c = str;
    }

    /* renamed from: g */
    private boolean mo39258g() {
        String str;
        int i;
        C3715b bVar = this.f9624e;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.mo39361b();
        }
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.mo39369h();
        }
        String a = mo39236a(mo39245f());
        if (a == null || a.equals(str)) {
            return false;
        }
        if (bVar == null) {
            bVar = new C3715b();
        }
        bVar.mo39358a(a);
        bVar.mo39357a(System.currentTimeMillis());
        bVar.mo39356a(i + 1);
        C3708a aVar = new C3708a();
        aVar.mo39328a(this.f9622c);
        aVar.mo39333c(a);
        aVar.mo39330b(str);
        aVar.mo39327a(bVar.mo39366e());
        if (this.f9623d == null) {
            this.f9623d = new ArrayList(2);
        }
        this.f9623d.add(aVar);
        if (this.f9623d.size() > 10) {
            this.f9623d.remove(0);
        }
        this.f9624e = bVar;
        return true;
    }

    /* renamed from: a */
    public boolean mo39240a() {
        return mo39258g();
    }

    /* renamed from: b */
    public String mo39241b() {
        return this.f9622c;
    }

    /* renamed from: c */
    public boolean mo39242c() {
        C3715b bVar = this.f9624e;
        return bVar == null || bVar.mo39369h() <= 100;
    }

    /* renamed from: d */
    public C3715b mo39243d() {
        return this.f9624e;
    }

    /* renamed from: e */
    public List<C3708a> mo39244e() {
        return this.f9623d;
    }

    /* renamed from: f */
    public abstract String mo39245f();

    /* renamed from: a */
    public void mo39237a(C3715b bVar) {
        this.f9624e = bVar;
    }

    /* renamed from: a */
    public void mo39239a(List<C3708a> list) {
        this.f9623d = list;
    }

    /* renamed from: a */
    public String mo39236a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() != 0 && !"0".equals(trim) && !"unknown".equals(trim.toLowerCase(Locale.US))) {
            return trim;
        }
        return null;
    }

    /* renamed from: a */
    public void mo39238a(C3722c cVar) {
        this.f9624e = cVar.mo39390c().get(this.f9622c);
        List<C3708a> h = cVar.mo39396h();
        if (h != null && h.size() > 0) {
            if (this.f9623d == null) {
                this.f9623d = new ArrayList();
            }
            for (C3708a aVar : h) {
                if (this.f9622c.equals(aVar.f9711a)) {
                    this.f9623d.add(aVar);
                }
            }
        }
    }
}
