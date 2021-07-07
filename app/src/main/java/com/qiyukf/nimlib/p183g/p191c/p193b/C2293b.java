package com.qiyukf.nimlib.p183g.p191c.p193b;

import android.util.SparseArray;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2295b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;

/* renamed from: com.qiyukf.nimlib.g.c.b.b */
public final class C2293b implements AbstractC2292a {

    /* renamed from: a */
    public SparseArray<String> f4586a = new SparseArray<>();

    /* renamed from: a */
    public final String mo34953a(int i) {
        return this.f4586a.get(i);
    }

    /* renamed from: a */
    public final void mo34954a(int i, int i2) {
        this.f4586a.put(i, String.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo34955a(int i, String str) {
        if (str != null) {
            this.f4586a.put(i, str);
        }
    }

    @Override // com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a
    /* renamed from: a */
    public final void mo34937a(C2295b bVar) {
        bVar.mo34969b(this.f4586a.size());
        for (int i = 0; i < this.f4586a.size(); i++) {
            bVar.mo34969b(this.f4586a.keyAt(i));
            bVar.mo34964a(this.f4586a.valueAt(i));
        }
    }

    @Override // com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a
    /* renamed from: a */
    public final void mo34938a(C2299f fVar) {
        int f = fVar.mo34981f();
        for (int i = 0; i < f; i++) {
            mo34955a(fVar.mo34981f(), fVar.mo34976a("utf-8"));
        }
    }

    /* renamed from: b */
    public final int mo34956b(int i) {
        String str = this.f4586a.get(i);
        if (str != null && !str.equals("")) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: c */
    public final long mo34957c(int i) {
        String str = this.f4586a.get(i);
        if (str == null || str.equals("")) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String toString() {
        return this.f4586a.toString();
    }
}
