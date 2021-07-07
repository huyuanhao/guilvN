package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4273ay;
import com.xiaomi.push.AbstractC4348df;
import com.xiaomi.push.C4256al;
import com.xiaomi.push.C4385el;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.service.C4635bb;
import java.util.List;

/* renamed from: com.xiaomi.push.service.bc */
public class C4637bc extends C4256al.AbstractC4258b {

    /* renamed from: a */
    public final /* synthetic */ C4635bb f13285a;

    /* renamed from: a */
    public boolean f13286a = false;

    public C4637bc(C4635bb bbVar) {
        this.f13285a = bbVar;
    }

    @Override // com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: b */
    public void mo41488b() {
        try {
            C4385el.C4386a a = C4385el.C4386a.m12198a(Base64.decode(AbstractC4348df.m12069a(C4688t.m14218a(), "http://resolver.msg.xiaomi.net/psc/?t=a", (List<AbstractC4273ay>) null), 10));
            if (a != null) {
                this.f13285a.f13283a = a;
                this.f13286a = true;
                C4635bb.m14030a(this.f13285a);
            }
        } catch (Exception e) {
            AbstractC4163b.m11301a("fetch config failure: " + e.getMessage());
        }
    }

    @Override // com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: c */
    public void mo41489c() {
        C4635bb.AbstractC4636a[] aVarArr;
        this.f13285a.f13282a = null;
        if (this.f13286a) {
            synchronized (this.f13285a) {
                aVarArr = (C4635bb.AbstractC4636a[]) C4635bb.m14029a(this.f13285a).toArray(new C4635bb.AbstractC4636a[C4635bb.m14029a(this.f13285a).size()]);
            }
            for (C4635bb.AbstractC4636a aVar : aVarArr) {
                aVar.mo42687a(C4635bb.m14025a(this.f13285a));
            }
        }
    }
}
