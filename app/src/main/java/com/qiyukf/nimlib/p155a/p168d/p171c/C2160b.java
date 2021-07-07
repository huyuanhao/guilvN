package com.qiyukf.nimlib.p155a.p168d.p171c;

import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import java.util.ArrayList;
import java.util.List;

@AbstractC2154b(mo34696a = 2, mo34697b = {"8"})
/* renamed from: com.qiyukf.nimlib.a.d.c.b */
public class C2160b extends AbstractC2148a {

    /* renamed from: b */
    public List<String> f4322b;

    @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
    /* renamed from: a */
    public final C2299f mo34642a(C2299f fVar) {
        int f = fVar.mo34981f();
        ArrayList arrayList = new ArrayList(f);
        for (int i = 0; i < f; i++) {
            arrayList.add(fVar.mo34976a("utf-8"));
        }
        this.f4322b = arrayList;
        return null;
    }

    /* renamed from: f */
    public final List<String> mo34704f() {
        return this.f4322b;
    }
}
