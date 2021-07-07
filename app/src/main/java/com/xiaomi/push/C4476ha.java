package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.C4256al;
import java.util.ArrayList;

/* renamed from: com.xiaomi.push.ha */
public final class C4476ha extends C4256al.AbstractC4258b {

    /* renamed from: a */
    public final /* synthetic */ Context f12135a;

    public C4476ha(Context context) {
        this.f12135a = context;
    }

    @Override // com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: b */
    public void mo41488b() {
        ArrayList arrayList;
        synchronized (C4473gz.m12843a()) {
            arrayList = new ArrayList(C4473gz.m12845a());
            C4473gz.m12845a().clear();
        }
        C4473gz.m12853b(this.f12135a, arrayList);
    }
}
