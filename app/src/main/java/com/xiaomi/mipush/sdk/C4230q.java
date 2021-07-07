package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.AbstractC4364dr;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.EnumC4494ho;

/* renamed from: com.xiaomi.mipush.sdk.q */
public class C4230q implements AbstractC4364dr {

    /* renamed from: a */
    public Context f11318a;

    public C4230q(Context context) {
        this.f11318a = context;
    }

    @Override // com.xiaomi.push.AbstractC4364dr
    /* renamed from: a */
    public String mo41461a() {
        return C4209b.m11491a(this.f11318a).mo41432d();
    }

    @Override // com.xiaomi.push.AbstractC4364dr
    /* renamed from: a */
    public void mo41462a(C4520in inVar, EnumC4494ho hoVar, C4508ib ibVar) {
        C4204aw.m11444a(this.f11318a).mo41402a(inVar, hoVar, ibVar);
    }
}
