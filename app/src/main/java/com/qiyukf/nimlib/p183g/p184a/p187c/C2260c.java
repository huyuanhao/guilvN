package com.qiyukf.nimlib.p183g.p184a.p187c;

import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2154b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2297d;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;
import com.umeng.message.MsgConstant;
import java.util.ArrayList;

@AbstractC2154b(mo34696a = 2, mo34697b = {MsgConstant.MESSAGE_NOTIFY_ARRIVAL})
/* renamed from: com.qiyukf.nimlib.g.a.c.c */
public class C2260c extends AbstractC2148a {

    /* renamed from: b */
    public byte f4498b;

    /* renamed from: c */
    public ArrayList<C2107a> f4499c;

    @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
    /* renamed from: a */
    public final C2299f mo34642a(C2299f fVar) {
        this.f4498b = fVar.mo34978c();
        int f = fVar.mo34981f();
        this.f4499c = new ArrayList<>(f);
        for (int i = 0; i < f; i++) {
            this.f4499c.add(C2107a.m4276a(C2297d.m4893a(fVar)));
        }
        return null;
    }

    /* renamed from: f */
    public final byte mo34887f() {
        return this.f4498b;
    }

    /* renamed from: g */
    public final ArrayList<C2107a> mo34888g() {
        return this.f4499c;
    }
}
