package com.qiyukf.unicorn.p229h;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.p118pd.sdk.C6930o000;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2315c;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.evaluation.EvaluationApi;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOpenEntry;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2567c;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2569e;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2608d;
import com.qiyukf.unicorn.p229h.C2670d;
import com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.qiyukf.unicorn.h.a */
public final class C2658a {

    /* renamed from: a */
    public Fragment f5479a;

    /* renamed from: b */
    public String f5480b;

    /* renamed from: c */
    public Map<String, IMMessage> f5481c = new HashMap();

    /* renamed from: d */
    public C6930o000<RequestCallbackWrapper<String>> f5482d = new C6930o000<>();

    /* renamed from: e */
    public DialogC2972b f5483e;

    /* renamed from: a */
    public static C2555c m6097a(String str) {
        C2555c l = C2437b.m5288l(str);
        return l == null ? C2555c.m5698a() : l;
    }

    /* renamed from: a */
    private void m6098a(long j, RequestCallbackWrapper<String> requestCallbackWrapper) {
        this.f5482d.OooO0O0(j, requestCallbackWrapper);
    }

    /* renamed from: a */
    public static void m6099a(IMMessage iMMessage) {
        String sessionId = iMMessage.getSessionId();
        int j = C2437b.m5284j(sessionId);
        if (j != -1 && j != 4) {
            MsgDirectionEnum direct = iMMessage.getDirect();
            if ((direct == MsgDirectionEnum.Out && j % 2 == 0) || (direct == MsgDirectionEnum.In && j % 2 == 1)) {
                C2437b.m5244a(sessionId, j + 1);
            }
        }
    }

    /* renamed from: a */
    public final RequestCallbackWrapper<String> mo36312a(long j) {
        RequestCallbackWrapper<String> OooO00o = this.f5482d.m18084OooO00o(j);
        this.f5482d.OooO0O0(j);
        return OooO00o;
    }

    /* renamed from: a */
    public final void mo36313a() {
        this.f5479a = null;
        this.f5480b = null;
    }

    /* renamed from: a */
    public final void mo36314a(long j, String str, long j2, boolean z, int i, String str2) {
        C2555c a = m6097a(str);
        if (a.mo35970m() == 1) {
            C2567c cVar = new C2567c();
            cVar.mo36020a(-1);
            cVar.mo36022a(m6097a(str));
            C1810b.m3425a(cVar.mo36031e().mo35958b(), "richTextInvite", str2);
            cVar.mo36031e().mo35959b(str2);
            cVar.mo36023a("android");
            cVar.mo36021a(j2);
            cVar.mo36026b(i);
            C2315c.m4986a(MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, null, cVar, j));
            return;
        }
        C2608d dVar = new C2608d();
        dVar.mo36159a(-1);
        dVar.mo36161a(m6097a(str));
        C1810b.m3425a(dVar.mo36173g().mo35958b(), "richTextInvite", str2);
        dVar.mo36173g().mo35959b(str2);
        dVar.mo36162a("android");
        dVar.mo36160a(j2);
        dVar.mo36165b(i);
        C2313a createCustomReceivedMessage = MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, null, dVar, j);
        C2315c.m4986a(createCustomReceivedMessage);
        if (z) {
            if (a.mo35970m() == 2) {
                if (EvaluationApi.getInstance().getOnEvaluationEventListener() != null) {
                    EvaluationApi.OnEvaluationEventListener onEvaluationEventListener = EvaluationApi.getInstance().getOnEvaluationEventListener();
                    String sessionId = createCustomReceivedMessage.getSessionId();
                    EvaluationOpenEntry evaluationOpenEntry = new EvaluationOpenEntry();
                    evaluationOpenEntry.setEvaluationEntryList(dVar.mo36173g().mo35962e());
                    evaluationOpenEntry.setExchange(sessionId);
                    evaluationOpenEntry.setLastRemark(dVar.mo36171e());
                    evaluationOpenEntry.setLastSource(dVar.mo36168c());
                    evaluationOpenEntry.setSessionId(dVar.mo36170d());
                    evaluationOpenEntry.setTitle(dVar.mo36173g().mo35960c());
                    evaluationOpenEntry.setType(dVar.mo36173g().mo35961d());
                    evaluationOpenEntry.setResolvedEnabled(dVar.mo36173g().mo35968k());
                    evaluationOpenEntry.setResolvedRequired(dVar.mo36173g().mo35969l());
                    onEvaluationEventListener.onEvaluationMessageClick(evaluationOpenEntry, this.f5479a.getContext());
                }
            } else if (a.mo35970m() != 0) {
            } else {
                if (createCustomReceivedMessage.getSessionId().equals(this.f5480b)) {
                    if (this.f5483e == null) {
                        mo36315a(this.f5479a.getContext(), createCustomReceivedMessage);
                    }
                } else if (!this.f5481c.containsKey(createCustomReceivedMessage.getSessionId())) {
                    this.f5481c.put(createCustomReceivedMessage.getSessionId(), createCustomReceivedMessage);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo36315a(final Context context, final IMMessage iMMessage) {
        final DialogC2972b bVar = new DialogC2972b(context, (C2608d) iMMessage.getAttachment());
        bVar.setCanceledOnTouchOutside(false);
        bVar.mo36805a(new DialogC2972b.AbstractC2980a() {
            /* class com.qiyukf.unicorn.p229h.C2658a.C26591 */

            @Override // com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.AbstractC2980a
            public final void onSubmit(int i, List<String> list, String str, String str2, int i2) {
                bVar.mo36806a(false);
                bVar.mo36807b(true);
                C2658a.this.mo36317a(iMMessage, i, str, list, str2, i2, new RequestCallbackWrapper<String>() {
                    /* class com.qiyukf.unicorn.p229h.C2658a.C26591.C26601 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                    @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                    public final /* synthetic */ void onResult(int i, String str, Throwable th) {
                        if (i == 200) {
                            bVar.cancel();
                        } else if (bVar.isShowing()) {
                            bVar.mo36806a(true);
                            bVar.mo36807b(false);
                            C1865f.m3557a(context.getString(C2364R.string.ysf_network_error));
                        }
                    }
                });
            }
        });
        bVar.show();
    }

    /* renamed from: a */
    public final void mo36316a(Fragment fragment, String str) {
        this.f5479a = fragment;
        this.f5480b = str;
        if (this.f5481c.containsKey(str)) {
            IMMessage remove = this.f5481c.remove(str);
            if (this.f5483e == null && remove != null && (remove.getAttachment() instanceof C2608d)) {
                mo36315a(fragment.getContext(), remove);
            }
        }
    }

    /* renamed from: a */
    public final void mo36317a(final IMMessage iMMessage, int i, String str, List<String> list, final String str2, int i2, final RequestCallbackWrapper<String> requestCallbackWrapper) {
        if (iMMessage.getAttachment() instanceof C2608d) {
            final C2608d dVar = (C2608d) iMMessage.getAttachment();
            final C2608d dVar2 = new C2608d();
            dVar2.mo36159a(i);
            dVar2.mo36161a(dVar.mo36173g());
            dVar2.mo36166b(str);
            dVar2.mo36162a("android");
            dVar2.mo36160a(dVar.mo36170d());
            dVar2.mo36163a(list);
            dVar2.mo36169c(i2);
            final String sessionId = iMMessage.getSessionId();
            final IMMessage queryLastMessage = ((MsgService) NIMClient.getService(MsgService.class)).queryLastMessage(sessionId, SessionTypeEnum.Ysf);
            C2667c.m6115a((AbstractC2597e) dVar2, sessionId, true).setCallback(new RequestCallback<Void>() {
                /* class com.qiyukf.unicorn.p229h.C2658a.C26623 */

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onException(Throwable th) {
                }

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final /* synthetic */ void onSuccess(Void r3) {
                    IMMessage createTextMessage = MessageBuilder.createTextMessage(iMMessage.getSessionId(), SessionTypeEnum.Ysf, str2);
                    createTextMessage.setStatus(MsgStatusEnum.success);
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(createTextMessage, true);
                }
            });
            m6098a(dVar2.mo36170d(), new RequestCallbackWrapper<String>() {
                /* class com.qiyukf.unicorn.p229h.C2658a.C26634 */

                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper, com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                    super.onFailed(i);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                public final /* synthetic */ void onResult(int i, String str, Throwable th) {
                    C2670d.AbstractC2678a g;
                    String str2 = str;
                    if (i == 200) {
                        dVar.mo36176j();
                        ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(iMMessage, true);
                        C1810b.m3425a(dVar2.mo36173g().mo35958b(), "richTextThanks", str2);
                        dVar2.mo36173g().mo35956a(str2);
                        ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(sessionId, SessionTypeEnum.Ysf, dVar2), true);
                        if (dVar2.mo36170d() == C2437b.m5282i(sessionId)) {
                            C2437b.m5254b(sessionId, 2);
                            C2437b.m5244a(sessionId, -1);
                        }
                    }
                    if ((C2437b.m5282i(sessionId) == ((C2608d) iMMessage.getAttachment()).mo36170d() || iMMessage.isTheSame(queryLastMessage)) && (g = C2452d.m5375g().mo36358g()) != null) {
                        g.mo36373a(sessionId);
                    }
                    RequestCallbackWrapper requestCallbackWrapper = requestCallbackWrapper;
                    if (requestCallbackWrapper != null) {
                        requestCallbackWrapper.onResult(i, str2, th);
                    }
                }
            });
        } else if (iMMessage.getAttachment() instanceof C2567c) {
            final C2567c cVar = (C2567c) iMMessage.getAttachment();
            final C2608d dVar3 = new C2608d();
            dVar3.mo36159a(i);
            dVar3.mo36161a(cVar.mo36031e());
            dVar3.mo36166b(str);
            dVar3.mo36162a("android");
            dVar3.mo36160a(cVar.mo36025b());
            dVar3.mo36163a(list);
            dVar3.mo36169c(i2);
            final String sessionId2 = iMMessage.getSessionId();
            final IMMessage queryLastMessage2 = ((MsgService) NIMClient.getService(MsgService.class)).queryLastMessage(sessionId2, SessionTypeEnum.Ysf);
            C2667c.m6115a((AbstractC2597e) dVar3, sessionId2, true).setCallback(new RequestCallback<Void>() {
                /* class com.qiyukf.unicorn.p229h.C2658a.C26645 */

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onException(Throwable th) {
                }

                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.qiyukf.unicorn.api.RequestCallback
                public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
                }
            });
            m6098a(dVar3.mo36170d(), new RequestCallbackWrapper<String>() {
                /* class com.qiyukf.unicorn.p229h.C2658a.C26656 */

                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper, com.qiyukf.unicorn.api.RequestCallback
                public final void onFailed(int i) {
                    super.onFailed(i);
                    requestCallbackWrapper.onFailed(i);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                public final /* synthetic */ void onResult(int i, String str, Throwable th) {
                    C2670d.AbstractC2678a g;
                    String str2 = str;
                    if (i == 200) {
                        cVar.mo36034g();
                        ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(iMMessage, true);
                        C1810b.m3425a(dVar3.mo36173g().mo35958b(), "richTextThanks", str2);
                        dVar3.mo36173g().mo35956a(str2);
                        ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(sessionId2, SessionTypeEnum.Ysf, dVar3), true);
                        if (dVar3.mo36170d() == C2437b.m5282i(sessionId2)) {
                            C2437b.m5254b(sessionId2, 2);
                            C2437b.m5244a(sessionId2, -1);
                        }
                    }
                    if ((C2437b.m5282i(sessionId2) == ((C2567c) iMMessage.getAttachment()).mo36025b() || iMMessage.isTheSame(queryLastMessage2)) && (g = C2452d.m5375g().mo36358g()) != null) {
                        g.mo36373a(sessionId2);
                    }
                    RequestCallbackWrapper requestCallbackWrapper = requestCallbackWrapper;
                    if (requestCallbackWrapper != null) {
                        requestCallbackWrapper.onResult(i, str2, th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo36318a(DialogC2972b bVar) {
        this.f5483e = bVar;
    }

    /* renamed from: a */
    public final void mo36319a(String str, int i, String str2, List<String> list, int i2, RequestCallbackWrapper<String> requestCallbackWrapper) {
        mo36320a(str, C2437b.m5282i(str), i, str2, list, i2, requestCallbackWrapper);
    }

    /* renamed from: a */
    public final void mo36320a(final String str, long j, int i, String str2, List<String> list, int i2, final RequestCallbackWrapper<String> requestCallbackWrapper) {
        final C2608d dVar = new C2608d();
        dVar.mo36159a(i);
        dVar.mo36161a(m6097a(str));
        dVar.mo36166b(str2);
        dVar.mo36162a("android");
        dVar.mo36160a(j);
        dVar.mo36163a(list);
        dVar.mo36169c(i2);
        C2667c.m6115a((AbstractC2597e) dVar, str, false);
        m6098a(dVar.mo36170d(), new RequestCallbackWrapper<String>() {
            /* class com.qiyukf.unicorn.p229h.C2658a.C26612 */

            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper, com.qiyukf.unicorn.api.RequestCallback
            public final void onFailed(int i) {
                super.onFailed(i);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, String str, Throwable th) {
                String str2 = str;
                if (i == 200) {
                    C1810b.m3425a(dVar.mo36173g().mo35958b(), "richTextThanks", str2);
                    dVar.mo36173g().mo35956a(str2);
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, dVar), true);
                    if (dVar.mo36170d() == C2437b.m5282i(str)) {
                        C2437b.m5254b(str, 2);
                        C2437b.m5244a(str, -1);
                    }
                }
                C2670d.AbstractC2678a g = C2452d.m5375g().mo36358g();
                if (g != null) {
                    g.mo36373a(str);
                }
                RequestCallbackWrapper requestCallbackWrapper = requestCallbackWrapper;
                if (requestCallbackWrapper != null) {
                    requestCallbackWrapper.onResult(i, str2, th);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo36321a(String str, C2569e eVar) {
        if (m6097a(str) != null) {
            if (C2437b.m5286k(str) == 1 || m6097a(str).mo35964g()) {
                mo36314a(System.currentTimeMillis(), str, eVar.mo36044b(), eVar.mo36045c(), eVar.mo36043a(), eVar.mo36046d());
            }
        }
    }

    /* renamed from: b */
    public final void mo36322b() {
        DialogC2972b bVar = this.f5483e;
        if (bVar != null && bVar.isShowing() && this.f5479a != null) {
            this.f5483e.cancel();
        }
    }
}
