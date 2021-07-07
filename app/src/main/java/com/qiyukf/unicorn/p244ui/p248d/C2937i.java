package com.qiyukf.unicorn.p244ui.p248d;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.p212e.C2476k;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2582q;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2619o;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2620p;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2621q;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;
import com.qiyukf.unicorn.widget.p251a.DialogC3013d;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.d.i */
public class C2937i extends AbstractC2845a<C2476k> {

    /* renamed from: b */
    public View f6358b;

    /* renamed from: c */
    public View f6359c;

    /* renamed from: d */
    public View f6360d;

    /* renamed from: e */
    public TextView f6361e;

    /* renamed from: f */
    public TextView f6362f;

    /* renamed from: g */
    public TextView f6363g;

    /* renamed from: a */
    private void m6833a(int i) {
        final C2582q qVar = (C2582q) this.message.getAttachment();
        if (i != 3 || !qVar.mo36082h()) {
            this.f6361e.setVisibility(8);
            return;
        }
        this.f6361e.setVisibility(0);
        this.f6361e.setText(qVar.mo36080f());
        TextView textView = this.f6361e;
        textView.setHint(textView.length() == 0 ? qVar.mo36075b(this.context) : null);
        this.f6361e.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2937i.View$OnClickListenerC29414 */

            public final void onClick(View view) {
                if (C2937i.this.m6835a((C2937i) qVar)) {
                    C2937i.m6839d(C2937i.this);
                } else {
                    C1865f.m3555a(C2364R.string.ysf_robot_evaluate_disable);
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m6834a(C2937i iVar, final int i) {
        boolean z = true;
        iVar.f6359c.setSelected(i == 2);
        View view = iVar.f6360d;
        if (i != 3) {
            z = false;
        }
        view.setSelected(z);
        final C2582q qVar = (C2582q) iVar.message.getAttachment();
        C2619o oVar = new C2619o();
        oVar.mo36210a(iVar.message.getUuid());
        oVar.mo36209a(i);
        C2667c.m6115a((AbstractC2597e) oVar, iVar.message.getSessionId(), false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2937i.C29403 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, Void r3, Throwable th) {
                if (i == 200) {
                    qVar.mo36072a(i);
                    if (i == 2) {
                        qVar.mo36074a((String) null);
                    }
                    ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(C2937i.this.message, false);
                    if (i != 2 && C2937i.this.m6835a((C2937i) qVar)) {
                        if (qVar.mo36082h()) {
                            C2937i.m6839d(C2937i.this);
                            return;
                        }
                        C2620p pVar = new C2620p();
                        pVar.mo36211a(C2937i.this.message.getUuid());
                        pVar.mo36212b("");
                        C2667c.m6115a((AbstractC2597e) pVar, C2937i.this.message.getSessionId(), false);
                        return;
                    }
                    return;
                }
                C1865f.m3555a(C2364R.string.ysf_network_error);
            }
        });
        iVar.m6833a(i);
        if (i == 3) {
            iVar.getAdapter().mo34518e().mo34508c();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private boolean m6835a(C2582q qVar) {
        if (qVar.mo36081g() == 0) {
            return false;
        }
        String sessionId = this.message.getSessionId();
        return qVar.mo36081g() == C2452d.m5375g().mo36349c(sessionId) || qVar.mo36081g() == C2452d.m5375g().mo36357g(sessionId);
    }

    /* renamed from: d */
    public static /* synthetic */ void m6839d(C2937i iVar) {
        final C2582q qVar = (C2582q) iVar.message.getAttachment();
        new DialogC3013d(iVar.context).mo36870a(qVar.mo36080f(), qVar.mo36075b(iVar.context)).mo36869a(new DialogC3013d.AbstractC3016a() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2937i.C29425 */

            @Override // com.qiyukf.unicorn.widget.p251a.DialogC3013d.AbstractC3016a
            /* renamed from: a */
            public final void mo36781a() {
                if (C2937i.this.m6835a((C2937i) qVar)) {
                    C2620p pVar = new C2620p();
                    pVar.mo36211a(C2937i.this.message.getUuid());
                    pVar.mo36212b("");
                    C2667c.m6115a((AbstractC2597e) pVar, C2937i.this.message.getSessionId(), false);
                    return;
                }
                C1865f.m3555a(C2364R.string.ysf_robot_evaluate_disable);
            }

            @Override // com.qiyukf.unicorn.widget.p251a.DialogC3013d.AbstractC3016a
            /* renamed from: a */
            public final void mo36782a(final String str) {
                if (C2937i.this.m6835a((C2937i) qVar)) {
                    C2937i.this.f6361e.setText(str);
                    C2937i.this.f6361e.setHint(C2937i.this.f6361e.length() == 0 ? qVar.mo36075b(C2937i.this.context) : null);
                    C2620p pVar = new C2620p();
                    pVar.mo36211a(C2937i.this.message.getUuid());
                    pVar.mo36212b(str);
                    C2667c.m6115a((AbstractC2597e) pVar, C2937i.this.message.getSessionId(), false).setCallback(new RequestCallbackWrapper<Void>() {
                        /* class com.qiyukf.unicorn.p244ui.p248d.C2937i.C29425.C29431 */

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                        @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                        public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                            if (i == 200) {
                                C1865f.m3557a("感谢您的反馈");
                                qVar.mo36074a(str);
                                ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(C2937i.this.message, true);
                                return;
                            }
                            C1865f.m3555a(C2364R.string.ysf_network_error);
                        }
                    });
                    return;
                }
                C1865f.m3555a(C2364R.string.ysf_robot_evaluate_disable);
            }
        }).show();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.widget.TextView, java.lang.Object] */
    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: a */
    public final /* synthetic */ void mo36682a(TextView textView, C2476k kVar) {
        textView.setText(kVar.f4902b);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: a */
    public final /* synthetic */ void mo36683a(C2476k kVar) {
        C2476k kVar2 = kVar;
        if (!mo36684a()) {
            C1865f.m3555a(C2364R.string.ysf_robot_msg_invalid);
        } else if (C2452d.m5375g().mo36355f(this.message.getSessionId()) == 1) {
            C2621q qVar = new C2621q();
            qVar.mo36214a(kVar2.f4901a);
            qVar.mo36216b(kVar2.f4902b);
            qVar.mo36215a(this.message.getUuid());
            getAdapter().mo34518e().mo34509c(MessageBuilder.createCustomMessage(this.message.getSessionId(), this.message.getSessionType(), qVar));
        } else {
            IMMessage createTextMessage = MessageBuilder.createTextMessage(this.message.getSessionId(), this.message.getSessionType(), kVar2.f4902b);
            createTextMessage.setStatus(MsgStatusEnum.success);
            getAdapter().mo34518e().mo34509c(createTextMessage);
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    public void bindContentView() {
        super.bindContentView();
        final C2582q qVar = (C2582q) this.message.getAttachment();
        if (qVar.mo36079e() <= 0 || !m6835a(qVar)) {
            this.f6358b.setVisibility(8);
            return;
        }
        boolean z = false;
        this.f6358b.setVisibility(0);
        this.f6359c.setSelected(qVar.mo36079e() == 2);
        View view = this.f6360d;
        if (qVar.mo36079e() == 3) {
            z = true;
        }
        view.setSelected(z);
        m6833a(qVar.mo36079e());
        if (C2690a.m6219a().mo36462d()) {
            this.f6362f.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), this.f6047a.getResources().getColor(C2364R.C2365color.ysf_grey_666666)));
            this.f6362f.setCompoundDrawables(C2692b.m6227a(this.context, C2690a.m6219a().mo36461c().mo35690b()), null, null, null);
            this.f6363g.setTextColor(C2692b.m6226a(C2690a.m6219a().mo36461c().mo35690b(), this.f6047a.getResources().getColor(C2364R.C2365color.ysf_grey_666666)));
            this.f6363g.setCompoundDrawables(C2692b.m6227a(this.context, C2690a.m6219a().mo36461c().mo35690b()), null, null, null);
        }
        this.f6359c.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2937i.View$OnClickListenerC29381 */

            public final void onClick(View view) {
                if (C2937i.this.f6359c.isSelected()) {
                    return;
                }
                if (C2937i.this.m6835a((C2937i) qVar)) {
                    C2937i.m6834a(C2937i.this, 2);
                } else {
                    C1865f.m3555a(C2364R.string.ysf_robot_evaluate_disable);
                }
            }
        });
        this.f6360d.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p248d.C2937i.View$OnClickListenerC29392 */

            public final void onClick(View view) {
                if (C2937i.this.f6360d.isSelected()) {
                    return;
                }
                if (C2937i.this.m6835a((C2937i) qVar)) {
                    C2937i.m6834a(C2937i.this, 3);
                } else {
                    C1865f.m3555a(C2364R.string.ysf_robot_evaluate_disable);
                }
            }
        });
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: c */
    public final String mo36686c() {
        C2582q qVar = (C2582q) this.message.getAttachment();
        List<C2476k> d = qVar.mo36078d();
        if (TextUtils.isEmpty(qVar.mo36071a()) && d != null && d.size() == 1 && !TextUtils.isEmpty(d.get(0).f4903c)) {
            return d.get(0).f4903c;
        }
        if (!TextUtils.isEmpty(qVar.mo36071a())) {
            return qVar.mo36071a();
        }
        return null;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: d */
    public final String mo36687d() {
        return ((C2582q) this.message.getAttachment()).mo36077c();
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: e */
    public final List<C2476k> mo36688e() {
        C2582q qVar = (C2582q) this.message.getAttachment();
        List<C2476k> d = qVar.mo36078d();
        if (!TextUtils.isEmpty(qVar.mo36071a()) || d == null || d.size() != 1 || TextUtils.isEmpty(d.get(0).f4903c)) {
            return d;
        }
        return null;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: f */
    public final boolean mo36689f() {
        this.message.getAttachment();
        return true;
    }

    @Override // com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    /* renamed from: g */
    public final boolean mo36690g() {
        return ((C2582q) this.message.getAttachment()).mo36076b();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.p244ui.p248d.AbstractC2845a
    public void inflateContentView() {
        super.inflateContentView();
        View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_message_item_robot_evaluation, (ViewGroup) this.f6047a, false);
        this.f6358b = inflate;
        this.f6359c = inflate.findViewById(C2364R.C2367id.ysf_robot_evaluate_useful);
        this.f6362f = (TextView) this.f6358b.findViewById(C2364R.C2367id.ysf_robot_evaluate_useful_text);
        this.f6363g = (TextView) this.f6358b.findViewById(C2364R.C2367id.ysf_robot_evaluate_useless_text);
        this.f6360d = this.f6358b.findViewById(C2364R.C2367id.ysf_robot_evaluate_useless);
        this.f6361e = (TextView) this.f6358b.findViewById(C2364R.C2367id.ysf_robot_evaluation_content);
        this.f6047a.addView(this.f6358b);
    }
}
