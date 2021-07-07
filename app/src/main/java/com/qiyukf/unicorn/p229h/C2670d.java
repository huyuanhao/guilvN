package com.qiyukf.unicorn.p229h;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p118pd.sdk.C6930o000;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.C8713oo0o0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.viewholder.C2090c;
import com.qiyukf.nim.uikit.session.viewholder.C2096h;
import com.qiyukf.nim.uikit.session.viewholder.C2099j;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p177c.C2204c;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2315c;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.p195h.C2324g;
import com.qiyukf.nimlib.p195h.C2326h;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.nimlib.sdk.msg.model.QueryDirectionEnum;
import com.qiyukf.nimlib.sdk.uinfo.UserInfoProvider;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2438c;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.analytics.C2379a;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.ProductDetail;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.evaluation.EvaluationApi;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOpenEntry;
import com.qiyukf.unicorn.api.event.entry.RequestStaffEntry;
import com.qiyukf.unicorn.api.event.entry.TransferCloseResultEntry;
import com.qiyukf.unicorn.api.event.entry.TransferRequestEntry;
import com.qiyukf.unicorn.api.event.eventcallback.TransferCloseResultCallback;
import com.qiyukf.unicorn.api.event.eventcallback.TransferRequestCallback;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.OnPushMessageListener;
import com.qiyukf.unicorn.api.msg.SessionStatusEnum;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;
import com.qiyukf.unicorn.api.pop.POPManager;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.C2372c;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2376b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2377c;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2465a;
import com.qiyukf.unicorn.p212e.C2467c;
import com.qiyukf.unicorn.p212e.C2469e;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p212e.C2475j;
import com.qiyukf.unicorn.p212e.C2477l;
import com.qiyukf.unicorn.p212e.C2478m;
import com.qiyukf.unicorn.p212e.C2480o;
import com.qiyukf.unicorn.p212e.C2481p;
import com.qiyukf.unicorn.p212e.C2482q;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.C2604f;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2500a;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2502b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2507e;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2511g;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2520k;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2522l;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2523m;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2524n;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2528o;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2530p;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2531q;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2535r;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2537s;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2539t;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2541u;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2543a;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2544b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2545c;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2559a;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2560aa;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2562ab;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2567c;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2568d;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2569e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2573h;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2575j;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2578m;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2579n;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2580o;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2581p;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2582q;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2583r;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2590t;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2591u;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2592v;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2593w;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2594x;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2595y;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2596z;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2598a;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2606b;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2608d;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2611g;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2614j;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2617m;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2621q;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2622r;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2628x;
import com.qiyukf.unicorn.p229h.C2680e;
import com.qiyukf.unicorn.p230i.C2683b;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p232k.C2716n;
import com.qiyukf.unicorn.p244ui.p248d.C2925d;
import com.qiyukf.unicorn.p244ui.p248d.C2927e;
import com.qiyukf.unicorn.p244ui.p248d.C2929f;
import com.qiyukf.unicorn.p244ui.p248d.C2930g;
import com.qiyukf.unicorn.p244ui.p248d.C2935h;
import com.qiyukf.unicorn.p244ui.p248d.C2937i;
import com.qiyukf.unicorn.p244ui.p248d.C2944j;
import com.qiyukf.unicorn.p244ui.p248d.C2945k;
import com.qiyukf.unicorn.p244ui.p248d.C2946l;
import com.qiyukf.unicorn.p244ui.p248d.C2948m;
import com.qiyukf.unicorn.p244ui.p248d.C2949n;
import com.qiyukf.unicorn.p244ui.p248d.View$OnClickListenerC2917b;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2850c;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2852d;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2854e;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2859g;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2873k;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2882m;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2884n;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2887o;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2888p;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2894r;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2897s;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2899t;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2907v;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2909w;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2913x;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2915y;
import com.qiyukf.unicorn.p244ui.p248d.p249a.C2916z;
import com.qiyukf.unicorn.p244ui.p248d.p249a.DialogInterface$OnDismissListenerC2876l;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2865h;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2866i;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2871j;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2892q;
import com.qiyukf.unicorn.p244ui.p248d.p249a.View$OnClickListenerC2901u;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.h.d */
public final class C2670d {

    /* renamed from: A */
    public Handler f5519A;

    /* renamed from: B */
    public boolean f5520B;

    /* renamed from: C */
    public Observer<CustomNotification> f5521C = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p229h.C2670d.C26733 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            AbstractC2597e attachment;
            CustomNotification customNotification2 = customNotification;
            if (customNotification2.getSessionType() == SessionTypeEnum.Ysf && (attachment = customNotification2.getAttachment()) != null) {
                C2670d.m6125a(C2670d.this, customNotification2.getTime(), customNotification2.getSessionId(), attachment);
            }
        }
    };

    /* renamed from: D */
    public Observer<IMMessage> f5522D = new Observer<IMMessage>() {
        /* class com.qiyukf.unicorn.p229h.C2670d.C26744 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(IMMessage iMMessage) {
            IMMessage iMMessage2 = iMMessage;
            if (iMMessage2.getSessionType() == SessionTypeEnum.Ysf) {
                C2658a.m6099a(iMMessage2);
            }
        }
    };

    /* renamed from: E */
    public Observer<List<IMMessage>> f5523E = new Observer<List<IMMessage>>() {
        /* class com.qiyukf.unicorn.p229h.C2670d.C26755 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(List<IMMessage> list) {
            String str;
            List<IMMessage> list2 = list;
            if (list2.get(0).getSessionType() == SessionTypeEnum.Ysf) {
                for (IMMessage iMMessage : list2) {
                    if (iMMessage.getAttachment() instanceof C2559a) {
                        C2559a aVar = (C2559a) iMMessage.getAttachment();
                        C2670d.this.f5528e.mo35749a(aVar.mo35989c(), aVar.mo35991d(), aVar.mo36000k());
                        C2437b.m5295o(aVar.mo35989c());
                        C2670d.this.f5529f.mo35748a(aVar.mo36004o());
                        C2670d.m6127a(C2670d.this, aVar);
                    }
                    C2670d.this.f5531h.mo36323a(iMMessage);
                    int a = C2667c.m6114a(iMMessage);
                    if (iMMessage.getDirect() == MsgDirectionEnum.In && !(iMMessage.getAttachment() instanceof C2594x)) {
                        C2482q qVar = (C2482q) C2670d.this.f5525b.get(iMMessage.getSessionId());
                        if (a != 2) {
                            if (C2670d.this.f5534k.get(iMMessage.getFromAccount()) == null || ((C2474i) C2670d.this.f5534k.get(iMMessage.getFromAccount())).f4891f) {
                                str = qVar == null ? C2437b.m5294o() : qVar.f4925d;
                                if (TextUtils.isEmpty(str)) {
                                    str = C2481p.m5460a(iMMessage.getSessionId());
                                }
                            } else {
                                C1709a.m3014b(C7383o0OOO0O.OooOOO0, "queues.get(message.getFromAccount()" + System.currentTimeMillis());
                                str = "CORP_AVATER_TAG";
                            }
                            iMMessage.setFromAccount(str);
                            ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(iMMessage, false);
                        } else {
                            return;
                        }
                    }
                    if (iMMessage.getAttachment() instanceof C2582q) {
                        long c = C2670d.this.mo36349c(iMMessage.getSessionId());
                        if (c <= 0) {
                            c = C2670d.this.mo36357g(iMMessage.getSessionId());
                        }
                        if (c > 0) {
                            ((C2582q) iMMessage.getAttachment()).mo36073a(c);
                            ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(iMMessage, false);
                        }
                    }
                    if (iMMessage.getAttachment() instanceof C2537s) {
                        C2437b.m5240a(C2670d.this.mo36349c(iMMessage.getSessionId()), iMMessage.getUuid());
                    }
                }
                C2658a.m6099a(list2.get(0));
            }
        }
    };

    /* renamed from: a */
    public C2604f f5524a;

    /* renamed from: b */
    public Map<String, C2482q> f5525b;

    /* renamed from: c */
    public Map<String, Runnable> f5526c = new HashMap();

    /* renamed from: d */
    public ConsultSource f5527d;

    /* renamed from: e */
    public C2481p f5528e;

    /* renamed from: f */
    public C2480o f5529f;

    /* renamed from: g */
    public C2658a f5530g;

    /* renamed from: h */
    public C2666b f5531h;

    /* renamed from: i */
    public boolean f5532i = false;

    /* renamed from: j */
    public TransferRequestCallback f5533j = null;

    /* renamed from: k */
    public Map<String, C2474i> f5534k = new HashMap();

    /* renamed from: l */
    public AbstractC2678a f5535l;

    /* renamed from: m */
    public Map<String, ProductDetail> f5536m = new HashMap();

    /* renamed from: n */
    public Map<String, List<C2598a>> f5537n = new HashMap();

    /* renamed from: o */
    public Map<Long, List<C2469e>> f5538o = new HashMap();

    /* renamed from: p */
    public Map<String, C2477l> f5539p = new HashMap();

    /* renamed from: q */
    public C6930o000<C2477l> f5540q = new C6930o000<>();

    /* renamed from: r */
    public Map<String, Long> f5541r = new HashMap();

    /* renamed from: s */
    public Map<String, C2465a> f5542s = new HashMap();

    /* renamed from: t */
    public Map<String, Boolean> f5543t = new HashMap();

    /* renamed from: u */
    public Map<String, Long> f5544u = new HashMap();

    /* renamed from: v */
    public C6930o000<C2504c> f5545v = new C6930o000<>();

    /* renamed from: w */
    public Map<String, Boolean> f5546w = new HashMap();

    /* renamed from: x */
    public Map<String, C2583r> f5547x = new HashMap();

    /* renamed from: y */
    public Context f5548y;

    /* renamed from: z */
    public Map<String, C2475j> f5549z = new HashMap();

    /* renamed from: com.qiyukf.unicorn.h.d$a */
    public interface AbstractC2678a {
        /* renamed from: a */
        void mo36372a();

        /* renamed from: a */
        void mo36373a(String str);

        /* renamed from: a */
        void mo36374a(String str, C2467c cVar);

        /* renamed from: b */
        void mo36375b(String str);
    }

    /* renamed from: com.qiyukf.unicorn.h.d$b */
    public static class RunnableC2679b implements Runnable {

        /* renamed from: a */
        public String f5569a;

        public RunnableC2679b(String str) {
            this.f5569a = str;
        }

        public /* synthetic */ RunnableC2679b(String str, byte b) {
            this(str);
        }

        public final void run() {
            if (TextUtils.isEmpty(C2437b.m5260c()) || this.f5569a.equals(C2437b.m5260c())) {
                C2559a aVar = new C2559a();
                aVar.mo35983a(408);
                aVar.mo35985a(this.f5569a);
                C2209b.m4597a(MessageBuilder.createCustomNotification(aVar, this.f5569a));
            }
        }
    }

    public C2670d(Context context) {
        this.f5519A = new Handler(context.getMainLooper());
        this.f5524a = C2604f.m5892a();
        this.f5525b = new HashMap();
        this.f5528e = new C2481p();
        this.f5529f = new C2480o();
        this.f5530g = new C2658a();
        this.f5531h = new C2666b(this.f5529f, this.f5528e);
        ((MsgService) NIMClient.getService(MsgService.class)).registerCustomAttachmentParser(MsgTypeEnum.custom, this.f5524a);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f5521C, true);
        if (!(C2452d.m5373e().sdkEvents == null || C2452d.m5373e().sdkEvents.eventProcessFactory == null)) {
            C2452d.m5373e().sdkEvents.eventProcessFactory.eventOf(2);
        }
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeMsgStatus(this.f5522D, true);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeReceiveMessage(this.f5523E, true);
        C2090c.m4246a(C2559a.class, C2099j.class);
        C2090c.m4246a(C2606b.class, C2945k.class);
        C2090c.m4246a(C2608d.class, C2925d.class);
        C2090c.m4246a(C2567c.class, View$OnClickListenerC2917b.class);
        C2090c.m4246a(C2582q.class, C2937i.class);
        C2090c.m4246a(C2594x.class, C2946l.class);
        C2090c.m4246a(C2621q.class, C2944j.class);
        C2090c.m4246a(ProductAttachment.class, C2930g.class);
        C2090c.m4246a(C2581p.class, C2935h.class);
        C2090c.m4246a(C2592v.class, C2099j.class);
        C2090c.m4246a(C2590t.class, C2949n.class);
        C2090c.m4246a(C2578m.class, C2948m.class);
        C2090c.m4246a(C2573h.class, C2927e.class);
        C2090c.m4246a(C2500a.class, C2850c.class);
        C2090c.m4246a(C2502b.class, C2852d.class);
        C2090c.m4246a(C2524n.class, View$OnClickListenerC2892q.class);
        C2090c.m4246a(C2530p.class, C2899t.class);
        C2090c.m4246a(C2531q.class, View$OnClickListenerC2901u.class);
        C2090c.m4246a(C2539t.class, C2915y.class);
        C2090c.m4246a(C2535r.class, C2907v.class);
        C2090c.m4246a(C2541u.class, C2916z.class);
        C2090c.m4246a(C2520k.class, DialogInterface$OnDismissListenerC2876l.class);
        C2090c.m4246a(C2504c.class, C2854e.class);
        C2090c.m4246a(C2628x.class, C2096h.class);
        C2090c.m4246a(C2528o.class, C2894r.class);
        C2090c.m4246a(C2537s.class, C2913x.class);
        C2090c.m4246a(C2515i.class, View$OnClickListenerC2866i.class);
        C2090c.m4246a(C2511g.class, View$OnClickListenerC2871j.class);
        C2090c.m4246a(C2372c.class, C2897s.class);
        C2090c.m4246a(C2519j.class, C2873k.class);
        C2090c.m4246a(C2506d.class, C2859g.class);
        C2090c.m4246a(C2507e.class, View$OnClickListenerC2865h.class);
        C2090c.m4246a(C2522l.class, C2887o.class);
        C2090c.m4246a(C2523m.class, C2888p.class);
        C2090c.m4246a(C2376b.class, C2884n.class);
        C2090c.m4246a(C2377c.class, C2909w.class);
        C2090c.m4246a(C2545c.class, C2916z.class);
        C2090c.m4246a(C2543a.class, C2882m.class);
        C2090c.m4246a(C2544b.class, C2916z.class);
        C2090c.m4246a(C2575j.class, C2929f.class);
    }

    /* renamed from: a */
    public static IMMessage m6122a(long j, String str) {
        return MessageBuilder.createEmptyMessage(str, SessionTypeEnum.Ysf, j);
    }

    /* renamed from: a */
    public static String m6124a(C2474i iVar) {
        String str;
        if (iVar == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (iVar.f4888c) {
            spannableStringBuilder.append((CharSequence) "排队中，您排在第");
            spannableStringBuilder.append((CharSequence) String.valueOf(iVar.f4887b));
            str = "位，排到将自动接入";
        } else {
            str = "当前排队人数较多，请耐心等待…";
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder.toString();
    }

    /* renamed from: a */
    public static /* synthetic */ void m6125a(C2670d dVar, long j, String str, AbstractC2597e eVar) {
        C2313a a;
        C2313a a2;
        String content;
        RequestCallbackWrapper<String> a3;
        boolean z = false;
        switch (eVar.getCmdId()) {
            case 2:
                C2559a aVar = (C2559a) eVar;
                if (aVar == null) {
                    return;
                }
                if (aVar.mo36012w() == 1) {
                    Runnable remove = dVar.f5526c.remove(str);
                    if (remove != null) {
                        dVar.f5519A.removeCallbacks(remove);
                        return;
                    }
                    return;
                }
                dVar.mo36341a(str, aVar);
                return;
            case 6:
                C2590t tVar = (C2590t) eVar;
                dVar.f5525b.remove(str);
                dVar.f5540q.OooO0O0(tVar.mo36103a());
                dVar.f5541r.remove(str);
                dVar.f5542s.remove(str);
                dVar.f5537n.remove(str);
                dVar.f5544u.remove(str);
                dVar.f5543t.remove(str);
                dVar.f5538o.remove(str);
                dVar.f5545v.OooO0O0(tVar.mo36103a());
                C2437b.m5255b(String.valueOf(tVar.mo36103a()), System.currentTimeMillis());
                C2437b.m5240a(tVar.mo36103a(), "");
                dVar.m6138h();
                dVar.f5539p.remove(str);
                if (C2205d.m4582e() != StatusCode.UNLOGIN && C2204c.m4563a().mo34813b()) {
                    if (tVar.mo36107e() == 2 || tVar.mo36107e() == 0) {
                        C2315c.m4986a(MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, tVar));
                    }
                    if (tVar.mo36104b() == 1) {
                        if (tVar.mo36105c() && EvaluationApi.getInstance().getOnEvaluationEventListener() != null) {
                            EvaluationOpenEntry evaluationOpenEntry = new EvaluationOpenEntry();
                            C2555c l = C2437b.m5288l(str);
                            if (l != null) {
                                evaluationOpenEntry.setEvaluationEntryList(l.mo35962e());
                                evaluationOpenEntry.setType(l.mo35961d());
                                evaluationOpenEntry.setTitle(l.mo35960c());
                                evaluationOpenEntry.setExchange(str);
                                evaluationOpenEntry.setSessionId(C2437b.m5282i(str));
                                evaluationOpenEntry.setResolvedEnabled(l.mo35968k());
                                evaluationOpenEntry.setResolvedRequired(l.mo35969l());
                                EvaluationApi.getInstance().getOnEvaluationEventListener().onEvaluationMessageClick(evaluationOpenEntry, dVar.f5548y);
                            } else {
                                return;
                            }
                        }
                        dVar.f5530g.mo36314a(j, str, tVar.mo36103a(), tVar.mo36105c(), 0, tVar.mo36111i());
                    }
                }
                C2452d.m5376h().mo35658a(str, SessionStatusEnum.NONE);
                return;
            case 9:
                dVar.m6132b(str, j);
                return;
            case 15:
                C2579n nVar = (C2579n) eVar;
                if (nVar.mo36063b() == 200) {
                    C2474i iVar = dVar.f5534k.get(str);
                    if (iVar != null) {
                        iVar.f4886a = nVar.mo36062a();
                        iVar.f4887b = nVar.mo36064c();
                        iVar.f4888c = nVar.mo36065d();
                        iVar.f4889d = nVar.mo36066e();
                        dVar.m6129a(str, TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                    }
                    C2474i iVar2 = dVar.f5534k.get(str);
                    if (iVar2 != null) {
                        IMMessage iMMessage = iVar2.f4894i;
                        if (iMMessage.getAttachment() instanceof C2573h) {
                            ((C2573h) iMMessage.getAttachment()).mo36051a(m6124a(iVar2));
                        }
                        ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(iMMessage, true);
                        return;
                    }
                    return;
                } else if (nVar.mo36063b() == 301 || nVar.mo36063b() != 302) {
                    dVar.mo36365o(str);
                    return;
                } else {
                    dVar.mo36365o(str);
                    C2452d.m5376h().mo35658a(str, SessionStatusEnum.NONE);
                    return;
                }
            case 23:
                C2591u uVar = (C2591u) eVar;
                dVar.f5541r.put(str, Long.valueOf(uVar.mo36112a()));
                if (uVar.mo36113b() == 1) {
                    z = true;
                }
                dVar.f5540q.OooO0O0(uVar.mo36112a(), new C2477l(z, uVar.mo36114c()));
                return;
            case 28:
                C2578m mVar = (C2578m) eVar;
                if (!(dVar.f5546w.get(str) == null ? false : dVar.f5546w.get(str)).booleanValue() && (a = C2323f.m5018a(mVar.mo36061b())) != null) {
                    ((MsgService) NIMClient.getService(MsgService.class)).deleteChattingHistory(a);
                    UserInfoProvider.UserInfo userInfo = C2180b.m4479d().userInfoProvider.getUserInfo(a.getFromAccount());
                    mVar.mo36060a(userInfo.getName() + "撤回了一条消息");
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomMessage(str, SessionTypeEnum.Ysf, mVar), true);
                    return;
                }
                return;
            case 34:
                dVar.f5547x.put(str, (C2583r) eVar);
                return;
            case 42:
                C2596z zVar = (C2596z) eVar;
                if (zVar != null && zVar.mo36136a() && (a2 = C2323f.m5018a(zVar.mo36137b())) != null) {
                    JSONObject extension = a2.getExtension();
                    if (extension == null) {
                        extension = new JSONObject();
                    }
                    C1810b.m3424a(extension, "trashWords", zVar.mo36138c());
                    C1810b.m3422a(extension, "auditResult", zVar.mo36139d());
                    a2.setExt(extension.toString());
                    ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(a2, true);
                    C2326h a4 = C2323f.m5021a(a2.getSessionId(), a2.getSessionType());
                    if (a4 != null && TextUtils.equals(a4.getRecentMessageId(), a2.getUuid())) {
                        C2595y yVar = new C2595y();
                        if (a2.getMsgType() == MsgTypeEnum.image) {
                            content = "[图片]";
                        } else if (a2.getAttachment() instanceof C2581p) {
                            yVar.mo36134a(((C2581p) a2.getAttachment()).toJson(false));
                            yVar.mo36132a();
                            yVar.mo36135a(zVar.mo36138c());
                            yVar.mo36133a(zVar.mo36139d());
                            a4.mo35058b(MsgTypeEnum.custom.getValue());
                            a4.mo35062e(yVar.toJson(false));
                            a4.setMsgStatus(MsgStatusEnum.fail);
                            C2323f.m5030a(a4);
                            C2209b.m4599a(a4);
                            return;
                        } else {
                            content = a2.getContent();
                        }
                        yVar.mo36134a(content);
                        yVar.mo36135a(zVar.mo36138c());
                        yVar.mo36133a(zVar.mo36139d());
                        a4.mo35058b(MsgTypeEnum.custom.getValue());
                        a4.mo35062e(yVar.toJson(false));
                        a4.setMsgStatus(MsgStatusEnum.fail);
                        C2323f.m5030a(a4);
                        C2209b.m4599a(a4);
                        return;
                    }
                    return;
                }
                return;
            case 50:
                dVar.f5530g.mo36321a(str, (C2569e) eVar);
                return;
            case 55:
                C2568d dVar2 = (C2568d) eVar;
                if (dVar.f5530g == null || !(dVar2.mo36040a() == 411 || dVar2.mo36040a() == 413)) {
                    C2658a aVar2 = dVar.f5530g;
                    if (!(aVar2 == null || (a3 = aVar2.mo36312a(dVar2.mo36041b())) == null)) {
                        a3.onFailed(dVar2.mo36040a());
                    }
                    int a5 = dVar2.mo36040a();
                    if (a5 == 412) {
                        C1865f.m3555a(C2364R.string.ysf_evaluation_timeout);
                        return;
                    } else if (a5 == 414) {
                        C1865f.m3555a(C2364R.string.ysf_evaluation_error);
                        return;
                    } else {
                        return;
                    }
                } else {
                    RequestCallbackWrapper<String> a6 = dVar.f5530g.mo36312a(dVar2.mo36041b());
                    if (a6 != null) {
                        a6.onResult(200, dVar2.mo36042c(), null);
                        return;
                    }
                    return;
                }
            case 57:
                C2560aa aaVar = (C2560aa) eVar;
                dVar.f5539p.put(str, new C2477l(aaVar.mo36013a(), aaVar.mo36014b()));
                return;
            case 70:
                C2592v vVar = (C2592v) eVar;
                C2581p pVar = new C2581p();
                pVar.mo36070a(TextUtils.isEmpty(vVar.mo36115a()) ? vVar.mo36116b() : vVar.mo36115a());
                IMMessage createCustomMessage = MessageBuilder.createCustomMessage(str, SessionTypeEnum.Ysf, pVar);
                createCustomMessage.setStatus(MsgStatusEnum.success);
                createCustomMessage.setDirect(MsgDirectionEnum.In);
                ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(createCustomMessage, true);
                C2437b.m5255b(String.valueOf(vVar.mo36117c()), System.currentTimeMillis());
                return;
            case 90:
                C2594x xVar = (C2594x) eVar;
                Runnable remove2 = dVar.f5526c.remove(str);
                if (remove2 != null) {
                    dVar.f5519A.removeCallbacks(remove2);
                }
                dVar.f5528e.mo35749a(C2481p.m5461b(str), "客服分组", xVar.mo36125b());
                dVar.f5529f.mo35748a(xVar.mo36129f());
                C2313a createCustomReceivedMessage = MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, xVar);
                createCustomReceivedMessage.setFromAccount(C2481p.m5461b(str));
                ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(createCustomReceivedMessage, true);
                dVar.f5525b.remove(str);
                C2452d.m5376h().mo35658a(str, SessionStatusEnum.NONE);
                return;
            case 108:
                AbstractC2678a aVar3 = dVar.f5535l;
                if (aVar3 != null) {
                    aVar3.mo36375b(str);
                }
                dVar.f5543t.put(str, true);
                return;
            case 163:
                C2379a.m5203b();
                return;
            case C8713oo0o0o.OooO0o:
                C2680e.C2681a.m6189a().mo36377a(j, str, (C2593w) eVar);
                return;
            case C8713oo0o0o.OooO0oo:
                C2452d.m5376h().mo35657a((C2580o) eVar);
                return;
            case 701:
                C2716n.m6280a((C2562ab) eVar);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6127a(C2670d dVar, C2559a aVar) {
        ConsultSource consultSource;
        if (aVar.mo35998i() == 0 && (consultSource = dVar.f5527d) != null && !TextUtils.isEmpty(consultSource.vipStaffid) && !TextUtils.isEmpty(dVar.f5527d.VIPStaffAvatarUrl)) {
            C2481p pVar = dVar.f5528e;
            ConsultSource consultSource2 = dVar.f5527d;
            pVar.mo35749a(consultSource2.vipStaffid, TextUtils.isEmpty(consultSource2.vipStaffName) ? aVar.mo35991d() : dVar.f5527d.vipStaffName.length() > 40 ? dVar.f5527d.vipStaffName.substring(0, 40) : dVar.f5527d.vipStaffName, dVar.f5527d.VIPStaffAvatarUrl);
        }
    }

    /* renamed from: a */
    private void m6129a(final String str, long j) {
        C2474i iVar = this.f5534k.get(str);
        if (iVar != null) {
            if (iVar.f4890e == null) {
                iVar.f4890e = new Runnable() {
                    /* class com.qiyukf.unicorn.p229h.C2670d.RunnableC26777 */

                    public final void run() {
                        C2614j jVar = new C2614j();
                        jVar.mo36187a(C2437b.m5267d());
                        C2667c.m6115a((AbstractC2597e) jVar, str, false);
                    }
                };
            }
            this.f5519A.removeCallbacks(iVar.f4890e);
            this.f5519A.postDelayed(iVar.f4890e, j);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m6131b(C2478m mVar) {
        if (mVar != null) {
            String a = mVar.mo35728a();
            C2467c c = mVar.mo35736c();
            RequestStaffEntry g = mVar.mo35741g();
            RunnableC2679b bVar = new RunnableC2679b(a, (byte) 0);
            this.f5526c.put(a, bVar);
            this.f5519A.postDelayed(bVar, C1861b.m3529b(C2452d.m5367c()) ? 15000 : 3000);
            mo36365o(a);
            C2617m mVar2 = new C2617m();
            mVar2.mo36207g(C2452d.m5367c().getPackageName());
            mVar2.mo36190a(mVar.mo35735b() ? 1 : 0);
            ConsultSource consultSource = this.f5527d;
            if (consultSource != null) {
                mVar2.mo36192a(consultSource.uri);
                mVar2.mo36195b(this.f5527d.title);
                mVar2.mo36198c(this.f5527d.custom);
                mVar2.mo36194b(this.f5527d.groupId);
                mVar2.mo36191a(this.f5527d.staffId);
                mVar2.mo36200d(this.f5527d.faqGroupId);
                mVar2.mo36193b(this.f5527d.robotFirst ? 1 : 0);
                mVar2.mo36196c(this.f5527d.vipLevel);
                mVar2.mo36203e(this.f5527d.robotId);
                mVar2.mo36208h(this.f5527d.robotWelcomeMsgId);
                if (!(g == null || g.getProductDetail() == null)) {
                    this.f5527d.productDetail = g.getProductDetail();
                }
            }
            mVar2.mo36201d("Android");
            mVar2.mo36204e(Build.BRAND + "$$" + Build.VERSION.RELEASE);
            mVar2.mo36206f(C2180b.m4483h());
            mVar2.mo36189a();
            if (c != null) {
                mVar2.mo36191a(c.mo35697b());
                mVar2.mo36194b(c.mo35695a());
                mVar2.mo36197c(c.f4866d);
            }
            if (g != null) {
                mVar2.mo36192a(g.getUri());
                mVar2.mo36195b(g.getTitle());
                mVar2.mo36198c(g.getCustom());
                mVar2.mo36200d(g.getFaqGroupId());
                mVar2.mo36203e(g.getRobotId());
                mVar2.mo36197c(g.getEntryId());
                mVar2.mo36193b(g.isRobotFirst() ? 1 : 0);
                mVar2.mo36196c(g.getVipLevel());
                mVar2.mo36203e(g.getRobotId());
                mVar2.mo36194b(g.getGroupId());
                mVar2.mo36191a(g.getStaffId());
            }
            mVar2.mo36202e(mVar.mo35742h());
            mVar2.mo36199d(mVar.mo35743i());
            mVar2.mo36205f(mVar.mo35744j());
            C2667c.m6115a((AbstractC2597e) mVar2, a, false);
            this.f5525b.remove(a);
            C2452d.m5376h().mo35658a(a, SessionStatusEnum.NONE);
            AbstractC2678a aVar = this.f5535l;
            if (aVar != null) {
                aVar.mo36374a(a, c);
            }
        }
    }

    /* renamed from: b */
    private void m6132b(String str, long j) {
        ArrayList<C2313a> a;
        long longValue = this.f5544u.get(str) == null ? 0 : this.f5544u.get(str).longValue();
        ArrayList<C2313a> arrayList = new ArrayList();
        if (longValue == 0) {
            a = C2323f.m5024a((C2313a) m6122a(j, str), QueryDirectionEnum.QUERY_OLD, 20, true);
        } else if (longValue <= j) {
            a = C2323f.m5023a((C2313a) m6122a(longValue, str), longValue, j);
        } else {
            return;
        }
        arrayList.addAll(a);
        for (C2313a aVar : arrayList) {
            if (aVar.getStatus() == MsgStatusEnum.unread && aVar.getTime() < j) {
                aVar.setStatus(MsgStatusEnum.read);
                ((MsgService) NIMClient.getService(MsgService.class)).updateIMMessageStatus(aVar, true);
            }
        }
        this.f5544u.put(str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m6133b(String str, C2559a aVar) {
        boolean z;
        Map<String, Boolean> map;
        SessionStatusEnum sessionStatusEnum;
        C2438c cVar;
        Runnable remove = this.f5526c.remove(str);
        if (remove != null) {
            this.f5519A.removeCallbacks(remove);
        }
        int i = 0;
        if (aVar.mo36003n() != null) {
            map = this.f5543t;
            z = Boolean.valueOf(aVar.mo36003n().mo35965h());
        } else {
            map = this.f5543t;
            z = false;
        }
        map.put(str, z);
        this.f5525b.remove(str);
        int b = aVar.mo35986b();
        if (b == 201 || b == 203) {
            this.f5529f.mo35748a(aVar.mo36004o());
        }
        if (C2690a.m6219a().mo36462d() && aVar.mo35998i() != 1) {
            C2622r rVar = new C2622r();
            rVar.mo36218a(Long.valueOf(aVar.mo35995f() == 0 ? -1 : aVar.mo35995f()));
            rVar.mo36219a("Android");
            rVar.mo36217a();
            rVar.mo36220b(0L);
            if ((b == 203 && !aVar.mo36007r()) || b == 201 || b == 200) {
                C2667c.m6115a((AbstractC2597e) rVar, str, false);
            }
        }
        if (b == 200) {
            if ("-1".equals(aVar.mo35989c())) {
                this.f5528e.mo35749a(aVar.mo35989c(), aVar.mo35991d(), aVar.mo36000k());
            }
            ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(1);
            C2482q qVar = new C2482q(aVar.mo35995f());
            qVar.f4925d = aVar.mo35989c();
            qVar.f4926e = aVar.mo35991d();
            qVar.f4927f = aVar.mo35993e();
            qVar.f4928g = aVar.mo35998i();
            qVar.f4929h = aVar.mo35999j();
            qVar.f4923b = aVar.mo36001l();
            qVar.f4924c = aVar.mo36002m();
            qVar.f4930i = aVar.mo36000k();
            this.f5525b.put(str, qVar);
            m6140t(str);
            if (C2452d.m5376h() != null) {
                C2452d.m5376h().mo35658a(str, SessionStatusEnum.IN_SESSION);
            }
            long i2 = C2437b.m5282i(str);
            long j = qVar.f4922a;
            if (i2 != j) {
                C2437b.m5245a(str, j);
                C2437b.m5244a(str, 0);
                if (qVar.f4928g != 1) {
                    i = 1;
                }
                C2437b.m5254b(str, i);
            }
            C2437b.m5246a(str, aVar.mo36003n());
            int i3 = qVar.f4928g;
            if (i3 != 1 && i3 == 0) {
                C2683b.m6190a().mo36450b();
            }
            this.f5542s.put(str, aVar.mo36005p());
        } else {
            if (b == 203) {
                ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(1);
                C2474i iVar = new C2474i(aVar.mo35995f(), aVar.mo35996g(), aVar.mo35997h(), aVar.mo36006q(), aVar.mo36007r(), aVar.mo36008s(), aVar.mo36000k());
                if (aVar.mo36012w() == 0) {
                    this.f5534k.put(str, iVar);
                    C2573h hVar = new C2573h();
                    hVar.mo36051a(m6124a(iVar));
                    C2313a createCustomReceivedMessage = MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, hVar);
                    createCustomReceivedMessage.setStatus(MsgStatusEnum.success);
                    iVar.f4894i = createCustomReceivedMessage;
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(createCustomReceivedMessage, true);
                }
                m6129a(str, TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
                if (!iVar.f4891f) {
                    this.f5528e.mo35749a("CORP_AVATER_TAG", aVar.mo35991d(), aVar.mo36000k());
                }
                m6140t(str);
                cVar = C2452d.m5376h();
                sessionStatusEnum = SessionStatusEnum.IN_QUEUE;
            } else {
                cVar = C2452d.m5376h();
                sessionStatusEnum = SessionStatusEnum.NONE;
            }
            cVar.mo35658a(str, sessionStatusEnum);
        }
        if (b == 200 || b == 201 || b == 205) {
            mo36365o(str);
        }
    }

    /* renamed from: h */
    private void m6138h() {
        if (!this.f5520B && this.f5525b.size() == 0 && this.f5534k.size() == 0) {
            ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(0);
        }
    }

    /* renamed from: j */
    public static IMMessage m6139j(String str) {
        IMMessage u = m6141u(str);
        if (u == null || !((C2594x) u.getAttachment()).mo36127d()) {
            return null;
        }
        return u;
    }

    /* renamed from: t */
    public static void m6140t(String str) {
        if (!C2452d.m5376h().mo35661b(str)) {
            C2313a aVar = (C2313a) POPManager.queryLastMessage(str);
            if (aVar == null) {
                aVar = (C2313a) MessageBuilder.createEmptyMessage(str, SessionTypeEnum.Ysf, System.currentTimeMillis());
                aVar.setStatus(MsgStatusEnum.success);
                aVar.mo35006a(MsgTypeEnum.tips.getValue());
                aVar.setContent("");
            }
            C2209b.m4599a(C2324g.m5037a(aVar));
        }
    }

    /* renamed from: u */
    public static IMMessage m6141u(String str) {
        C2313a aVar;
        try {
            aVar = C2323f.m5019a(str, SessionTypeEnum.Ysf.getValue());
        } catch (Exception unused) {
            aVar = null;
        }
        if (aVar == null || !(aVar.getAttachment() instanceof C2594x)) {
            return null;
        }
        return aVar;
    }

    /* renamed from: a */
    public final int mo36328a(String str) {
        C2474i iVar = this.f5534k.get(str);
        if (iVar == null) {
            return 0;
        }
        return iVar.f4887b;
    }

    /* renamed from: a */
    public final C2481p mo36329a() {
        return this.f5528e;
    }

    /* renamed from: a */
    public final C2504c mo36330a(long j) {
        return this.f5545v.m18084OooO00o(j);
    }

    /* renamed from: a */
    public final List<C2469e> mo36331a(Long l) {
        return this.f5538o.get(l) == null ? new ArrayList() : this.f5538o.get(l);
    }

    /* renamed from: a */
    public final void mo36332a(long j, C2504c cVar) {
        this.f5545v.OooO0O0(j, cVar);
    }

    /* renamed from: a */
    public final void mo36333a(Context context) {
        this.f5548y = context;
    }

    /* renamed from: a */
    public final void mo36334a(ConsultSource consultSource) {
        this.f5527d = consultSource;
    }

    /* renamed from: a */
    public final void mo36335a(RequestCallback requestCallback) {
        if (this.f5525b.get(C2667c.m6116a()) != null) {
            C2606b bVar = new C2606b();
            bVar.mo36153a(this.f5525b.get(C2667c.m6116a()).f4922a);
            C2667c.m6115a((AbstractC2597e) bVar, C2667c.m6116a(), false);
        }
        C2611g gVar = new C2611g();
        gVar.mo36186a(C2437b.m5267d());
        C2667c.m6115a((AbstractC2597e) gVar, C2667c.m6116a(), false).setCallback(requestCallback);
        mo36356f();
        this.f5539p.clear();
        this.f5540q.OooO0O0();
        this.f5541r.clear();
        this.f5542s.clear();
        this.f5544u.clear();
        this.f5537n.clear();
        this.f5536m.clear();
        this.f5519A.removeCallbacks(null);
        this.f5549z.clear();
        this.f5526c.clear();
    }

    /* renamed from: a */
    public final void mo36336a(OnPushMessageListener onPushMessageListener) {
        this.f5531h.mo36324a(onPushMessageListener);
    }

    /* renamed from: a */
    public final void mo36337a(AbstractC2678a aVar) {
        this.f5535l = aVar;
    }

    /* renamed from: a */
    public final void mo36338a(Long l, List<C2469e> list) {
        this.f5538o.put(l, list);
    }

    /* renamed from: a */
    public final void mo36339a(final String str, final long j, final long j2, String str2, final boolean z, final TransferCloseResultCallback transferCloseResultCallback, TransferRequestCallback transferRequestCallback) {
        this.f5533j = transferRequestCallback;
        final C2606b bVar = new C2606b();
        bVar.mo36153a(mo36349c(str));
        bVar.mo36154a(str2);
        C2667c.m6115a((AbstractC2597e) bVar, str, false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.p229h.C2670d.C26711 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, Void r6, Throwable th) {
                if (transferCloseResultCallback != null) {
                    TransferCloseResultEntry transferCloseResultEntry = new TransferCloseResultEntry();
                    transferCloseResultEntry.setCode(i);
                    transferCloseResultCallback.handlerTransferCloseCallback(transferCloseResultEntry);
                }
                if (i == 200) {
                    int i2 = 1;
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, bVar), true);
                    C2467c cVar = null;
                    if (!(j == 0 && j2 == 0)) {
                        cVar = new C2467c();
                        if (j != 0) {
                            i2 = 2;
                        }
                        cVar.f4863a = i2;
                        long j = j;
                        if (j == 0) {
                            j = j2;
                        }
                        cVar.f4864b = j;
                        cVar.mo35698b(j);
                        cVar.mo35696a(j2);
                    }
                    C2478m mVar = new C2478m(str);
                    mVar.mo35733a(z);
                    mVar.mo35732a(cVar);
                    mVar.mo35729a(z ? 5 : 0);
                    mVar.mo35740f();
                    C2670d.this.mo36344a(mVar);
                    return;
                }
                C1865f.m3559b(C2364R.string.ysf_transfer_staff_error);
            }
        });
    }

    /* renamed from: a */
    public final void mo36340a(String str, ProductDetail productDetail) {
        this.f5536m.put(str, productDetail);
    }

    /* renamed from: a */
    public final void mo36341a(final String str, final C2559a aVar) {
        if (this.f5532i) {
            TransferRequestEntry transferRequestEntry = new TransferRequestEntry();
            transferRequestEntry.setCode(aVar.mo35986b());
            this.f5533j.handlerTransferRequestCallback(transferRequestEntry);
        }
        if (aVar.mo35986b() == 200 || aVar.mo35986b() == 203) {
            m6133b(str, aVar);
        } else {
            this.f5519A.postDelayed(new Runnable() {
                /* class com.qiyukf.unicorn.p229h.C2670d.RunnableC26766 */

                public final void run() {
                    C2670d.this.m6133b((C2670d) str, (String) aVar);
                }
            }, 1000);
        }
    }

    /* renamed from: a */
    public final void mo36342a(String str, List<C2598a> list) {
        this.f5537n.put(str, list);
    }

    /* renamed from: a */
    public final void mo36343a(String str, boolean z) {
        Runnable runnable;
        this.f5520B = z;
        m6138h();
        if (!this.f5534k.containsKey(str)) {
            return;
        }
        if (z) {
            m6129a(str, 0);
            return;
        }
        C2474i iVar = this.f5534k.get(str);
        if (iVar != null && (runnable = iVar.f4890e) != null) {
            this.f5519A.removeCallbacks(runnable);
            C1709a.m3014b(C7383o0OOO0O.OooOOO0, "handler testremove" + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00df, code lost:
        if (r7.f4864b > 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
        if (mo36328a(r3) == 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        if (r18.mo35742h() == 1) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36344a(final com.qiyukf.unicorn.p212e.C2478m r18) {
        /*
        // Method dump skipped, instructions count: 511
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p229h.C2670d.mo36344a(com.qiyukf.unicorn.e.m):boolean");
    }

    /* renamed from: b */
    public final C2474i mo36345b(String str) {
        return this.f5534k.get(str);
    }

    /* renamed from: b */
    public final C2480o mo36346b() {
        return this.f5529f;
    }

    /* renamed from: b */
    public final void mo36347b(OnPushMessageListener onPushMessageListener) {
        this.f5531h.mo36325b(onPushMessageListener);
    }

    /* renamed from: b */
    public final void mo36348b(String str, boolean z) {
        this.f5546w.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final long mo36349c(String str) {
        C2482q qVar = this.f5525b.get(str);
        if (qVar == null) {
            return 0;
        }
        return qVar.f4922a;
    }

    /* renamed from: c */
    public final C2658a mo36350c() {
        return this.f5530g;
    }

    /* renamed from: d */
    public final C2482q mo36351d(String str) {
        return this.f5525b.get(str);
    }

    /* renamed from: d */
    public final boolean mo36352d() {
        return !this.f5525b.isEmpty() || !this.f5534k.isEmpty();
    }

    /* renamed from: e */
    public final long mo36353e(String str) {
        try {
            if (this.f5541r.get(str) == null) {
                return -100;
            }
            return this.f5541r.get(str).longValue();
        } catch (NullPointerException e) {
            C1709a.m3011a("getfaqSessionId", "获取 getfaqSessionId 失败" + e.getMessage());
            return 0;
        }
    }

    /* renamed from: e */
    public final Map<String, C2482q> mo36354e() {
        return this.f5525b;
    }

    /* renamed from: f */
    public final int mo36355f(String str) {
        C2482q qVar = this.f5525b.get(str);
        if (qVar == null) {
            return 0;
        }
        return qVar.f4928g;
    }

    /* renamed from: f */
    public final void mo36356f() {
        this.f5525b.clear();
        Runnable runnable = this.f5526c.get(C2437b.m5260c());
        if (runnable != null) {
            this.f5519A.removeCallbacks(runnable);
            C1709a.m3014b(C7383o0OOO0O.OooOOO0, "handler testremove" + C2437b.m5260c());
        }
        this.f5519A.removeCallbacks(null);
        C1709a.m3014b(C7383o0OOO0O.OooOOO0, "handler testremovenull");
        this.f5534k.clear();
    }

    /* renamed from: g */
    public final long mo36357g(String str) {
        C2474i iVar = this.f5534k.get(str);
        if (iVar == null) {
            return 0;
        }
        return iVar.f4892g;
    }

    /* renamed from: g */
    public final AbstractC2678a mo36358g() {
        return this.f5535l;
    }

    /* renamed from: h */
    public final boolean mo36359h(String str) {
        return this.f5526c.containsKey(str);
    }

    /* renamed from: i */
    public final SessionStatusEnum mo36360i(String str) {
        return this.f5525b.containsKey(str) ? SessionStatusEnum.IN_SESSION : this.f5534k.containsKey(str) ? SessionStatusEnum.IN_QUEUE : SessionStatusEnum.NONE;
    }

    /* renamed from: k */
    public final C2477l mo36361k(String str) {
        C2477l lVar = this.f5539p.get(str);
        return lVar == null ? C2477l.f4905a : lVar;
    }

    /* renamed from: l */
    public final C2477l mo36362l(String str) {
        Long l = this.f5541r.get(str);
        if (l == null) {
            return null;
        }
        return this.f5540q.m18084OooO00o(l.longValue());
    }

    /* renamed from: m */
    public final C2583r mo36363m(String str) {
        return this.f5547x.get(str);
    }

    /* renamed from: n */
    public final C2465a mo36364n(String str) {
        if (mo36349c(str) == 0) {
            return null;
        }
        return this.f5542s.get(str);
    }

    /* renamed from: o */
    public final void mo36365o(String str) {
        Runnable runnable;
        C2474i remove = this.f5534k.remove(str);
        if (remove != null && (runnable = remove.f4890e) != null) {
            this.f5519A.removeCallbacks(runnable);
        }
    }

    /* renamed from: p */
    public final ProductDetail mo36366p(String str) {
        return this.f5536m.get(str);
    }

    /* renamed from: q */
    public final List<C2598a> mo36367q(String str) {
        return this.f5537n.get(str);
    }

    /* renamed from: r */
    public final boolean mo36368r(String str) {
        C2482q qVar = this.f5525b.get(str);
        return qVar != null && qVar.f4928g == 1 && qVar.f4929h == 1;
    }

    /* renamed from: s */
    public final Boolean mo36369s(String str) {
        return Boolean.valueOf(this.f5543t.get(str) == null ? false : this.f5543t.get(str).booleanValue());
    }
}
