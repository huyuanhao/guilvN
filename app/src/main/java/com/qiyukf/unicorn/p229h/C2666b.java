package com.qiyukf.unicorn.p229h;

import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.OnPushMessageListener;
import com.qiyukf.unicorn.api.msg.PushMessageExtension;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2479n;
import com.qiyukf.unicorn.p212e.C2480o;
import com.qiyukf.unicorn.p212e.C2481p;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2612h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.h.b */
public final class C2666b {

    /* renamed from: a */
    public C2480o f5511a;

    /* renamed from: b */
    public List<OnPushMessageListener> f5512b = new ArrayList();

    /* renamed from: c */
    public C2481p f5513c;

    public C2666b(C2480o oVar, C2481p pVar) {
        this.f5511a = oVar;
        this.f5513c = pVar;
    }

    /* renamed from: a */
    public final void mo36323a(IMMessage iMMessage) {
        C2479n nVar;
        String str;
        JSONObject f;
        int a = C2667c.m6114a(iMMessage);
        if (iMMessage.getDirect() == MsgDirectionEnum.In && a == 2) {
            String e = C1810b.m3432e(iMMessage.getExtension(), "msgSessionId");
            C2667c.m6115a((AbstractC2597e) new C2612h(e, 1), iMMessage.getSessionId(), true);
            C2437b.m5297p(e);
            JSONObject extension = iMMessage.getExtension();
            if (extension == null || (f = C1810b.m3433f(extension, "shop")) == null) {
                nVar = null;
            } else {
                nVar = new C2479n();
                nVar.mo35746a(f.toString());
            }
            if (nVar != null) {
                this.f5511a.mo35748a(nVar);
            }
            PushMessageExtension pushMessageExtension = new PushMessageExtension();
            JSONObject extension2 = iMMessage.getExtension();
            JSONObject f2 = C1810b.m3433f(extension2, "senderInfo");
            if (f2 != null) {
                PushMessageExtension.Sender sender = new PushMessageExtension.Sender();
                sender.setId(C1810b.m3432e(f2, "staffId"));
                sender.setAvatar(C1810b.m3432e(f2, "staffIcon"));
                sender.setName(C1810b.m3432e(f2, "staffName"));
                pushMessageExtension.setSender(sender);
            }
            JSONObject f3 = C1810b.m3433f(extension2, "action");
            if (f3 != null) {
                PushMessageExtension.Action action = new PushMessageExtension.Action();
                action.setLabel(C1810b.m3432e(f3, "label"));
                action.setUrl(C1810b.m3432e(f3, "url"));
                pushMessageExtension.setAction(action);
            }
            if (pushMessageExtension.getSender() == null || TextUtils.isEmpty(pushMessageExtension.getSender().getId())) {
                str = C2481p.m5460a(iMMessage.getSessionId());
            } else {
                this.f5513c.mo35750a(pushMessageExtension.getSender().getId(), pushMessageExtension.getSender().getName(), pushMessageExtension.getSender().getAvatar(), iMMessage.getUuid());
                str = pushMessageExtension.getSender().getId() + iMMessage.getUuid();
            }
            iMMessage.setFromAccount(str);
            for (OnPushMessageListener onPushMessageListener : this.f5512b) {
                onPushMessageListener.onReceive(iMMessage, pushMessageExtension);
            }
        }
    }

    /* renamed from: a */
    public final void mo36324a(OnPushMessageListener onPushMessageListener) {
        if (onPushMessageListener != null && !this.f5512b.contains(onPushMessageListener)) {
            this.f5512b.add(onPushMessageListener);
        }
    }

    /* renamed from: b */
    public final void mo36325b(OnPushMessageListener onPushMessageListener) {
        this.f5512b.remove(onPushMessageListener);
    }
}
