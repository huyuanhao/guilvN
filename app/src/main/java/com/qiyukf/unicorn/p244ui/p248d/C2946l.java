package com.qiyukf.unicorn.p244ui.p248d;

import android.widget.TextView;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.YSFOptions;
import com.qiyukf.unicorn.p212e.C2467c;
import com.qiyukf.unicorn.p212e.C2478m;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2594x;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import com.qiyukf.unicorn.widget.p251a.DialogC3008a;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.l */
public class C2946l extends AbstractC2845a<C2467c> {
    /* renamed from: b */
    public static void m6860b(IMMessage iMMessage, C2467c cVar) {
        C2594x xVar = (C2594x) iMMessage.getAttachment();
        if (xVar.mo36127d()) {
            xVar.mo36128e();
            ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(iMMessage, true);
            C2478m mVar = new C2478m(iMMessage.getSessionId());
            mVar.mo35733a(true);
            mVar.mo35732a(cVar);
            mVar.mo35729a(cVar == null ? 0 : cVar.f4863a);
            C2452d.m5375g().mo36344a(mVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.widget.TextView, java.lang.Object] */
    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: a */
    public final /* synthetic */ void mo36682a(TextView textView, C2467c cVar) {
        textView.setText(cVar.f4865c);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: a */
    public final /* synthetic */ void mo36683a(C2467c cVar) {
        m6860b(this.message, cVar);
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: b */
    public final boolean mo36685b() {
        return ((C2594x) this.message.getAttachment()).mo36127d();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    public void bindContentView() {
        super.bindContentView();
        final IMMessage iMMessage = this.message;
        YSFOptions e = C2452d.m5373e();
        if (e.categoryDialogStyle > 0) {
            C2594x xVar = (C2594x) iMMessage.getAttachment();
            if (xVar.mo36127d() && !xVar.mo36130g()) {
                final List<C2467c> c = xVar.mo36126c();
                String[] strArr = new String[c.size()];
                for (int i = 0; i < c.size(); i++) {
                    strArr[i] = c.get(i).f4865c;
                }
                DialogC3008a aVar = new DialogC3008a(this.context, e.categoryDialogStyle == 1 ? 17 : 80);
                aVar.setTitle(xVar.mo36124a());
                aVar.mo36857a(strArr);
                aVar.mo36856a(new C3021g.AbstractC3022a() {
                    /* class com.qiyukf.unicorn.p244ui.p248d.C2946l.C29471 */

                    @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                    /* renamed from: a */
                    public final void mo34369a(int i) {
                        C2946l.m6860b(iMMessage, (C2467c) c.get(i));
                    }
                });
                aVar.show();
                xVar.mo36131h();
                ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(iMMessage, true);
            }
        }
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: c */
    public final String mo36686c() {
        return ((C2594x) this.message.getAttachment()).mo36124a();
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: d */
    public final String mo36687d() {
        return null;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: e */
    public final List<C2467c> mo36688e() {
        return ((C2594x) this.message.getAttachment()).mo36126c();
    }
}
