package com.qiyukf.nimlib.p155a.p168d.p170b;

import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.android.agoo.message.MessageService;

@AbstractC2154b(mo34696a = 4, mo34697b = {"4", "9", MessageService.MSG_DB_COMPLETE, "101"})
/* renamed from: com.qiyukf.nimlib.a.d.b.b */
public class C2157b extends AbstractC2148a {

    /* renamed from: b */
    public List<C2293b> f4318b;

    @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
    /* renamed from: a */
    public final C2299f mo34642a(C2299f fVar) {
        int f = fVar.mo34981f();
        this.f4318b = new ArrayList(f);
        for (int i = 0; i < f; i++) {
            this.f4318b.add(C2297d.m4893a(fVar));
        }
        Collections.sort(this.f4318b, new Comparator<C2293b>() {
            /* class com.qiyukf.nimlib.p155a.p168d.p170b.C2157b.C21581 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(C2293b bVar, C2293b bVar2) {
                long c = bVar.mo34957c(7) - bVar2.mo34957c(7);
                if (c == 0) {
                    return 0;
                }
                return c > 0 ? 1 : -1;
            }
        });
        return null;
    }

    /* renamed from: f */
    public final List<C2293b> mo34700f() {
        return this.f4318b;
    }
}
