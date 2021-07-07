package com.qiyukf.basesdk.p120b.p132b.p133a;

import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g;

/* renamed from: com.qiyukf.basesdk.b.b.a.d */
public abstract class AbstractC1771d {

    /* renamed from: a */
    public C1774g f3267a;

    /* renamed from: b */
    public volatile AbstractC1771d f3268b;

    /* renamed from: c */
    public volatile AbstractC1771d f3269c;

    /* renamed from: d */
    public boolean f3270d;

    /* renamed from: e */
    public boolean f3271e;

    public AbstractC1771d(C1774g gVar, boolean z, boolean z2) {
        this.f3267a = gVar;
        this.f3270d = z;
        this.f3271e = z2;
    }

    /* renamed from: a */
    public final AbstractC1771d mo34001a() {
        return this.f3269c;
    }

    /* renamed from: b */
    public final AbstractC1771d mo34002b() {
        for (AbstractC1771d dVar = this.f3269c; dVar != null; dVar = dVar.f3269c) {
            if (dVar.f3270d) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final AbstractC1771d mo34003c() {
        for (AbstractC1771d dVar = this.f3268b; dVar != null; dVar = dVar.f3268b) {
            if (dVar.f3271e) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final AbstractC1794d mo34004d() {
        AbstractC1771d b = mo34002b();
        if (b == null) {
            return null;
        }
        return (AbstractC1794d) b.mo34007g();
    }

    /* renamed from: e */
    public final AbstractC1798g mo34005e() {
        AbstractC1771d c = mo34003c();
        if (c == null) {
            return null;
        }
        return (AbstractC1798g) c.mo34007g();
    }

    /* renamed from: f */
    public final AbstractC1765a mo34006f() {
        return this.f3267a.mo34010a();
    }

    /* renamed from: g */
    public abstract AbstractC1793c mo34007g();
}
