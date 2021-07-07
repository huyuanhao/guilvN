package com.vivo.push.p282c;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4121p;
import com.vivo.push.p281b.C4032aa;
import com.vivo.push.p281b.C4057w;
import com.vivo.push.util.C4134d;
import com.vivo.push.util.C4146p;
import com.vivo.push.util.C4156z;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;

/* renamed from: com.vivo.push.c.ah */
public final class C4070ah extends AbstractC4064ab {
    public C4070ah(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4057w wVar = (C4057w) yVar;
        if (!C4121p.m11080a().mo41122g() || mo40945a(C4156z.m11270d(this.f11150a), wVar.mo40936e(), wVar.mo40938i())) {
            boolean repealNotifyById = NotifyAdapterUtil.repealNotifyById(this.f11150a, (int) wVar.mo40935d());
            C4146p.m11216d("OnUndoMsgTask", "undo message " + wVar.mo40935d() + ", " + repealNotifyById);
            if (repealNotifyById) {
                Context context = this.f11150a;
                C4146p.m11213b(context, "回收client通知成功, 上报埋点 1031, messageId = " + wVar.mo40935d());
                C4134d.m11165a(this.f11150a, wVar.mo40935d(), 1031);
                return;
            }
            C4146p.m11216d("OnUndoMsgTask", "undo message fail，messageId = " + wVar.mo40935d());
            Context context2 = this.f11150a;
            C4146p.m11215c(context2, "回收client通知失败，messageId = " + wVar.mo40935d());
            return;
        }
        C4146p.m11216d("OnUndoMsgTask", " vertify msg is error ");
        C4032aa aaVar = new C4032aa(1021);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("messageID", String.valueOf(wVar.mo40937f()));
        Context context3 = this.f11150a;
        String b = C4156z.m11266b(context3, context3.getPackageName());
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("remoteAppId", b);
        }
        aaVar.mo40901a(hashMap);
        C4121p.m11080a().mo41096a(aaVar);
    }
}
