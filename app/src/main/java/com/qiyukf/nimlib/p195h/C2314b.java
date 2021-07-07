package com.qiyukf.nimlib.p195h;

import com.qiyukf.basesdk.p120b.p121a.p122a.C1732f;
import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.nimlib.p182f.C2244b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.qiyukf.nimlib.h.b */
public final class C2314b {

    /* renamed from: d */
    public static C2314b f4634d = new C2314b();

    /* renamed from: a */
    public Set<String> f4635a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    public Set<String> f4636b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public C2321e f4637c = new C2321e();

    /* renamed from: a */
    public static C2314b m4972a() {
        return f4634d;
    }

    /* renamed from: a */
    public final void mo35039a(String str) {
        this.f4635a.add(str);
    }

    /* renamed from: b */
    public final void mo35040b() {
        C1732f.m3104a().mo33907b();
        C1735a.m3113a().mo33913b();
        C2244b.m4692a();
        this.f4635a.clear();
        this.f4636b.clear();
    }

    /* renamed from: b */
    public final void mo35041b(String str) {
        this.f4635a.remove(str);
    }

    /* renamed from: c */
    public final C2321e mo35042c() {
        return this.f4637c;
    }

    /* renamed from: c */
    public final boolean mo35043c(String str) {
        return this.f4635a.contains(str);
    }

    /* renamed from: d */
    public final void mo35044d(String str) {
        this.f4636b.add(str);
    }

    /* renamed from: e */
    public final void mo35045e(String str) {
        this.f4636b.remove(str);
    }

    /* renamed from: f */
    public final boolean mo35046f(String str) {
        return this.f4636b.contains(str);
    }
}
