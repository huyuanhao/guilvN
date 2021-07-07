package com.vivo.push.p282c;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4121p;
import com.vivo.push.C4158w;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.p281b.C4032aa;
import com.vivo.push.p281b.C4044j;
import com.vivo.push.p281b.C4051q;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4156z;
import java.util.HashMap;

/* renamed from: com.vivo.push.c.p */
public final class C4088p extends AbstractC4064ab {
    public C4088p(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4051q qVar = (C4051q) yVar;
        C4121p.m11080a().mo41096a(new C4044j(String.valueOf(qVar.mo40937f())));
        if (!ClientConfigManagerImpl.getInstance(this.f11150a).isEnablePush()) {
            C4146p.m11216d("OnMessageTask", "command  " + yVar + " is ignore by disable push ");
            C4032aa aaVar = new C4032aa(1020);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("messageID", String.valueOf(qVar.mo40937f()));
            Context context = this.f11150a;
            String b = C4156z.m11266b(context, context.getPackageName());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("remoteAppId", b);
            }
            aaVar.mo40901a(hashMap);
            C4121p.m11080a().mo41096a(aaVar);
        } else if (!C4121p.m11080a().mo41122g() || mo40945a(C4156z.m11270d(this.f11150a), qVar.mo40924d(), qVar.mo40938i())) {
            UnvarnishedMessage e = qVar.mo40925e();
            if (e != null) {
                int targetType = e.getTargetType();
                String tragetContent = e.getTragetContent();
                C4146p.m11216d("OnMessageTask", "tragetType is " + targetType + " ; target is " + tragetContent);
                C4158w.m11280b(new RunnableC4089q(this, e));
                return;
            }
            C4146p.m11204a("OnMessageTask", " message is null");
        } else {
            C4032aa aaVar2 = new C4032aa(1021);
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("messageID", String.valueOf(qVar.mo40937f()));
            Context context2 = this.f11150a;
            String b2 = C4156z.m11266b(context2, context2.getPackageName());
            if (!TextUtils.isEmpty(b2)) {
                hashMap2.put("remoteAppId", b2);
            }
            aaVar2.mo40901a(hashMap2);
            C4121p.m11080a().mo41096a(aaVar2);
        }
    }
}
