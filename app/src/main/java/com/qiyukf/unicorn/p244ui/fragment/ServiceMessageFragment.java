package com.qiyukf.unicorn.p244ui.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.session.fragment.MessageFragment;
import com.qiyukf.nim.uikit.session.module.input.C2066e;
import com.qiyukf.nim.uikit.session.module.p153a.C2044b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.StatusCode;
import com.qiyukf.nimlib.sdk.auth.AuthService;
import com.qiyukf.nimlib.sdk.auth.AuthServiceObserver;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.MsgServiceObserve;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2433b;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.ProductDetail;
import com.qiyukf.unicorn.api.event.UnicornEventBase;
import com.qiyukf.unicorn.api.event.entry.ConnectionStaffResultEntry;
import com.qiyukf.unicorn.api.lifecycle.SessionLifeCycleListener;
import com.qiyukf.unicorn.api.lifecycle.SessionLifeCycleOptions;
import com.qiyukf.unicorn.api.msg.MsgStatusEnum;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;
import com.qiyukf.unicorn.api.pop.ShopEntrance;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.AbstractC2471f;
import com.qiyukf.unicorn.p212e.C2467c;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p212e.C2478m;
import com.qiyukf.unicorn.p212e.C2482q;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2559a;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2571g;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2574i;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2578m;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2579n;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2583r;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2589s;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2590t;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2606b;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2612h;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p229h.C2670d;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p244ui.activity.ServiceMessageActivity;
import com.qiyukf.unicorn.p244ui.evaluate.C2982d;
import com.qiyukf.unicorn.p244ui.p247c.C2837a;
import com.qiyukf.unicorn.p244ui.p247c.C2842b;
import com.qiyukf.unicorn.widget.p251a.C3021g;
import com.qiyukf.unicorn.widget.p251a.DialogC3019f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment */
public class ServiceMessageFragment extends MessageFragment {

    /* renamed from: l */
    public static long f6497l;

    /* renamed from: A */
    public Observer<StatusCode> f6498A = new Observer<StatusCode>() {
        /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C29973 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(com.qiyukf.nimlib.sdk.StatusCode r4) {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C29973.onEvent(java.lang.Object):void");
        }
    };

    /* renamed from: m */
    public int f6499m = 0;

    /* renamed from: n */
    public C2837a f6500n;

    /* renamed from: o */
    public ViewGroup f6501o;

    /* renamed from: p */
    public SessionLifeCycleListener f6502p;

    /* renamed from: q */
    public C2982d f6503q;

    /* renamed from: r */
    public ConsultSource f6504r;

    /* renamed from: s */
    public SessionLifeCycleOptions f6505s;

    /* renamed from: t */
    public C2467c f6506t;

    /* renamed from: u */
    public boolean f6507u = false;

    /* renamed from: v */
    public boolean f6508v = false;

    /* renamed from: w */
    public boolean f6509w = false;

    /* renamed from: x */
    public boolean f6510x = false;

    /* renamed from: y */
    public C2452d.AbstractC2459a f6511y = new C2452d.AbstractC2459a() {
        /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C29851 */

        @Override // com.qiyukf.unicorn.C2452d.AbstractC2459a
        /* renamed from: a */
        public final void mo34456a() {
            C2452d.m5375g().mo36334a(ServiceMessageFragment.this.f6504r);
            ServiceMessageFragment.this.m6966a((ServiceMessageFragment) true);
            ServiceMessageFragment.m6973c(ServiceMessageFragment.this);
            ServiceMessageFragment.m6975d(ServiceMessageFragment.this);
            ServiceMessageFragment.m6976e(ServiceMessageFragment.this);
        }
    };

    /* renamed from: z */
    public Observer<CustomNotification> f6512z = new Observer<CustomNotification>() {
        /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C29962 */

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.qiyukf.nimlib.sdk.Observer
        public final /* synthetic */ void onEvent(CustomNotification customNotification) {
            CustomNotification customNotification2 = customNotification;
            if (TextUtils.equals(ServiceMessageFragment.this.f3931g, customNotification2.getSessionId()) && customNotification2.getSessionType() == SessionTypeEnum.Ysf) {
                ServiceMessageFragment.this.mo36825a(customNotification2);
            }
        }
    };

    /* renamed from: com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment$11 */
    public static /* synthetic */ class C298711 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6516a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        static {
            /*
                int[] r0 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.m6606a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a = r0
                r1 = 1
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6040b     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6041c     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6042d     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6043e     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6039a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = r2 - r1
                r3 = 5
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                int[] r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6044f     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r2 = r2 - r1
                r3 = 6
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                int[] r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.f6516a     // Catch:{ NoSuchFieldError -> 0x003f }
                int r2 = com.qiyukf.unicorn.p244ui.p247c.C2842b.EnumC2844a.f6045g     // Catch:{ NoSuchFieldError -> 0x003f }
                int r2 = r2 - r1
                r1 = 7
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298711.<clinit>():void");
        }
    }

    static {
        C.i(16777274);
    }

    /* renamed from: C */
    public static /* synthetic */ void m6946C(ServiceMessageFragment serviceMessageFragment) {
        if (serviceMessageFragment.f6499m == 1 || serviceMessageFragment.m6977e()) {
            final boolean e = serviceMessageFragment.m6977e();
            C3021g.m7059a(serviceMessageFragment.getContext(), serviceMessageFragment.getString(e ? C2364R.string.ysf_dialog_quit_queue : C2364R.string.ysf_dialog_close_session), true, (C3021g.AbstractC3022a) new C3021g.AbstractC3022a() {
                /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C29995 */

                @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                /* renamed from: a */
                public final void mo34369a(int i) {
                    if (i != 0) {
                        return;
                    }
                    if (!e && ServiceMessageFragment.this.f6499m == 1) {
                        ServiceMessageFragment.m6961a(ServiceMessageFragment.this, C2452d.m5375g().mo36349c(ServiceMessageFragment.this.f3931g));
                    } else if (e && ServiceMessageFragment.this.m6977e()) {
                        ServiceMessageFragment.m6964a(ServiceMessageFragment.this, true);
                    }
                }
            });
            return;
        }
        C1865f.m3557a("会话已退出");
    }

    /* renamed from: a */
    private List<C2842b> m6958a(List<C2583r.C2586c.C2587a> list) {
        C2842b bVar;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (C2583r.C2586c.C2587a aVar : list) {
            String c = aVar.mo36098c();
            char c2 = 65535;
            switch (c.hashCode()) {
                case -1349088399:
                    if (c.equals("custom")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 161787033:
                    if (c.equals("evaluate")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1235521359:
                    if (c.equals("close_session")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1546100943:
                    if (c.equals("open_link")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                int i = this.f6499m;
                if ((i == 1 || i == 0 || i == 8) && C2433b.m5229a().mo35650b() == null && this.f6509w) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6042d, aVar.mo36096a(), true, aVar.mo36097b(), aVar.mo36099d());
                    bVar.mo36672a(aVar.mo36100e() == null ? "" : aVar.mo36100e().mo36101a());
                }
            } else if (c2 != 1) {
                if (c2 == 2) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6045g, aVar.mo36096a(), true, aVar.mo36097b(), aVar.mo36099d());
                } else if (c2 == 3) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6044f, aVar.mo36096a(), true, aVar.mo36097b(), aVar.mo36099d());
                }
            } else if (this.f6499m == 1) {
                bVar = new C2842b(C2842b.EnumC2844a.f6043e, aVar.mo36096a(), true, aVar.mo36097b(), aVar.mo36099d());
            } else if (m6977e()) {
                bVar = new C2842b(C2842b.EnumC2844a.f6043e, aVar.mo36096a(), true, aVar.mo36097b(), aVar.mo36099d());
            } else if (this.f6499m == 8) {
                bVar = new C2842b(C2842b.EnumC2844a.f6043e, aVar.mo36096a(), false, aVar.mo36097b(), aVar.mo36099d());
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6959a(C2559a aVar) {
        int b = aVar.mo35986b();
        if (b == 200) {
            this.f6499m = C2452d.m5375g().mo36355f(this.f3931g) == 1 ? 6 : 1;
            if (aVar.mo36003n() != null) {
                this.f6509w = aVar.mo36003n().mo35965h();
            } else {
                this.f6509w = false;
            }
            mo34184a(new Runnable() {
                /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.RunnableC299216 */

                public final void run() {
                    if (ServiceMessageFragment.this.f6504r.productDetail != null && ServiceMessageFragment.this.f6504r.productDetail.valid() && C2452d.m5375g().mo36349c(ServiceMessageFragment.this.f3931g) != ServiceMessageFragment.f6497l) {
                        if (ServiceMessageFragment.this.f6499m == 1 || (ServiceMessageFragment.this.f6499m == 6 && ServiceMessageFragment.this.f6504r.isSendProductonRobot)) {
                            if (ServiceMessageFragment.this.f6499m != 6 || !ServiceMessageFragment.this.f6504r.productDetail.isSendByUser()) {
                                ServiceMessageFragment serviceMessageFragment = ServiceMessageFragment.this;
                                ServiceMessageFragment.m6962a(serviceMessageFragment, serviceMessageFragment.f6504r.productDetail);
                            } else {
                                ProductDetail clone = ServiceMessageFragment.this.f6504r.productDetail.clone();
                                if (clone != null) {
                                    clone.setSendByUser(false);
                                    ServiceMessageFragment.m6962a(ServiceMessageFragment.this, clone);
                                }
                            }
                            long unused = ServiceMessageFragment.f6497l = C2452d.m5375g().mo36349c(ServiceMessageFragment.this.f3931g);
                        }
                    }
                }
            }, 250);
            ConsultSource consultSource = this.f6504r;
            if (consultSource != null && !TextUtils.isEmpty(consultSource.vipStaffid) && !TextUtils.isEmpty(this.f6504r.vipStaffWelcomeMsg) && this.f6499m == 1) {
                ((MsgService) NIMClient.getService(MsgService.class)).sendMessage(MessageBuilder.createTextMessage(this.f3931g, SessionTypeEnum.Ysf, this.f6504r.vipStaffWelcomeMsg), false, false);
            }
        } else {
            this.f6499m = b == 201 ? 3 : b == 203 ? aVar.mo36007r() ? 10 : 4 : b == 204 ? 5 : b == 205 ? 9 : -1;
        }
        m6970b(aVar);
        m6965a(aVar.mo36011v(), aVar.mo36010u(), aVar.mo36002m());
    }

    /* renamed from: a */
    private void m6960a(C2583r rVar) {
        C2837a aVar;
        ArrayList arrayList;
        C2842b bVar = null;
        if (rVar == null || rVar.mo36085c() == null) {
            aVar = this.f6500n;
            arrayList = new ArrayList();
        } else if (this.f6499m == 10) {
            aVar = this.f6500n;
            arrayList = new ArrayList();
        } else {
            C2583r.C2586c c = rVar.mo36085c();
            C2837a aVar2 = this.f6500n;
            List<C2583r.C2586c.C2587a> a = c.mo36094a();
            boolean z = false;
            if (!(a == null || a.size() == 0 || a.get(0) == null)) {
                C2583r.C2586c.C2587a aVar3 = a.get(0);
                String c2 = aVar3.mo36098c();
                char c3 = 65535;
                switch (c2.hashCode()) {
                    case -1349088399:
                        if (c2.equals("custom")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 161787033:
                        if (c2.equals("evaluate")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 1235521359:
                        if (c2.equals("close_session")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 1546100943:
                        if (c2.equals("open_link")) {
                            c3 = 2;
                            break;
                        }
                        break;
                }
                if (c3 == 0) {
                    int i = this.f6499m;
                    if ((i == 1 || i == 0 || i == 8) && C2433b.m5229a().mo35650b() == null && this.f6509w) {
                        bVar = new C2842b(C2842b.EnumC2844a.f6042d, aVar3.mo36096a(), true, aVar3.mo36097b(), aVar3.mo36099d());
                        bVar.mo36672a(aVar3.mo36100e() == null ? "" : aVar3.mo36100e().mo36101a());
                    }
                } else if (c3 != 1) {
                    if (c3 == 2) {
                        bVar = new C2842b(C2842b.EnumC2844a.f6045g, aVar3.mo36096a(), true, aVar3.mo36097b(), aVar3.mo36097b());
                    } else if (c3 == 3) {
                        bVar = new C2842b(C2842b.EnumC2844a.f6044f, aVar3.mo36096a(), true, aVar3.mo36097b(), aVar3.mo36097b());
                    }
                } else if (this.f6499m == 1) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6043e, aVar3.mo36096a(), true, aVar3.mo36097b(), aVar3.mo36099d());
                } else if (m6977e()) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6043e, aVar3.mo36096a(), true, aVar3.mo36097b(), aVar3.mo36099d());
                } else if (this.f6499m == 8) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6043e, aVar3.mo36096a(), false, aVar3.mo36097b(), aVar3.mo36099d());
                }
            }
            aVar2.mo36664a(bVar, m6958a(c.mo36095b()));
            C2982d dVar = this.f6503q;
            int i2 = this.f6499m;
            if (i2 == 1 || i2 == 0 || i2 == 8) {
                z = true;
            }
            dVar.mo36822a(z);
            return;
        }
        aVar.mo36664a((C2842b) null, arrayList);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6961a(ServiceMessageFragment serviceMessageFragment, long j) {
        final DialogC3019f fVar = new DialogC3019f(serviceMessageFragment.getContext());
        fVar.show();
        final C2606b bVar = new C2606b();
        bVar.mo36153a(j);
        C2667c.m6115a((AbstractC2597e) bVar, serviceMessageFragment.f3931g, false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C30028 */

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
            @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
            public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                if (ServiceMessageFragment.this.isAdded()) {
                    fVar.cancel();
                    if (i == 200) {
                        ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(ServiceMessageFragment.this.f3931g, SessionTypeEnum.Ysf, bVar), true);
                        return;
                    }
                    fVar.mo36878a();
                    fVar.mo36879a(C2452d.m5367c().getString(C2364R.string.ysf_msg_quit_session_failed));
                    fVar.mo36880b();
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m6962a(ServiceMessageFragment serviceMessageFragment, ProductDetail productDetail) {
        if (productDetail != null) {
            ProductAttachment productAttachment = new ProductAttachment();
            productAttachment.fromProductDetail(productDetail, true);
            if (productAttachment.getShow() == 1 || productAttachment.getSendByUser() == 1) {
                IMMessage createCustomMessage = MessageBuilder.createCustomMessage(serviceMessageFragment.f3931g, SessionTypeEnum.Ysf, productAttachment);
                createCustomMessage.setStatus(MsgStatusEnum.success);
                if (1 == productAttachment.getSendByUser()) {
                    serviceMessageFragment.f3929e.mo34483a(createCustomMessage);
                    serviceMessageFragment.f6507u = true;
                    C2452d.m5375g().mo36340a(serviceMessageFragment.f3931g, productDetail.clone());
                } else if (serviceMessageFragment.sendMessage(createCustomMessage, false)) {
                    serviceMessageFragment.f6507u = true;
                    C2452d.m5375g().mo36340a(serviceMessageFragment.f3931g, productDetail.clone());
                }
            } else {
                C2667c.m6115a((AbstractC2597e) productAttachment, serviceMessageFragment.f3931g, false);
                serviceMessageFragment.f6507u = true;
                C2452d.m5375g().mo36340a(serviceMessageFragment.f3931g, productDetail.clone());
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m6964a(ServiceMessageFragment serviceMessageFragment, final boolean z) {
        SessionLifeCycleListener sessionLifeCycleListener;
        C2474i b = C2452d.m5375g().mo36345b(serviceMessageFragment.f3931g);
        if (b != null) {
            long j = b.f4886a;
            final C2606b bVar = new C2606b();
            bVar.mo36153a(j);
            C2667c.m6115a((AbstractC2597e) bVar, serviceMessageFragment.f3931g, false).setCallback(new RequestCallbackWrapper<Void>() {
                /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C30039 */

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
                    	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
                    	at java.util.ArrayList.get(ArrayList.java:435)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                public final /* synthetic */ void onResult(int r1, java.lang.Void r2, java.lang.Throwable r3) {
                    /*
                        r0 = this;
                        r2 = 200(0xc8, float:2.8E-43)
                        if (r1 != r2) goto L_0x003b
                        com.qiyukf.unicorn.h.d r1 = com.qiyukf.unicorn.C2452d.m5375g()
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r2 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        java.lang.String r2 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6952I(r2)
                        r1.mo36365o(r2)
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r1 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        r2 = 0
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6954a(r1, r2)
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r1 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6985m(r1)
                        boolean r1 = r4
                        if (r1 != 0) goto L_0x0040
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r1 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        java.lang.String r1 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6953J(r1)
                        com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum r2 = com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum.Ysf
                        com.qiyukf.unicorn.f.a.f.b r3 = r2
                        com.qiyukf.nimlib.h.a r1 = com.qiyukf.nimlib.sdk.msg.MessageBuilder.createCustomReceivedMessage(r1, r2, r3)
                        java.lang.Class<com.qiyukf.nimlib.sdk.msg.MsgService> r2 = com.qiyukf.nimlib.sdk.msg.MsgService.class
                        java.lang.Object r2 = com.qiyukf.nimlib.sdk.NIMClient.getService(r2)
                        com.qiyukf.nimlib.sdk.msg.MsgService r2 = (com.qiyukf.nimlib.sdk.msg.MsgService) r2
                        r3 = 1
                        r2.saveMessageToLocal(r1, r3)
                        return
                    L_0x003b:
                        int r1 = com.qiyukf.unicorn.C2364R.string.ysf_msg_quit_queue_failed
                        com.qiyukf.basesdk.p138c.p143d.C1865f.m3555a(r1)
                    L_0x0040:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C30039.onResult(int, java.lang.Object, java.lang.Throwable):void");
                }
            });
            if (z && (sessionLifeCycleListener = serviceMessageFragment.f6502p) != null) {
                sessionLifeCycleListener.onLeaveSession();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0160 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6965a(java.lang.String r15, int r16, long r17) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6965a(java.lang.String, int, long):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6966a(boolean z) {
        FragmentActivity fragmentActivity;
        C2670d dVar;
        C2670d g = C2452d.m5375g();
        if (z) {
            g.mo36337a(new C2670d.AbstractC2678a() {
                /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C299519 */

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
                    	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
                    	at java.util.ArrayList.get(ArrayList.java:435)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // com.qiyukf.unicorn.p229h.C2670d.AbstractC2678a
                /* renamed from: a */
                public final void mo36372a() {
                    /*
                        r2 = this;
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        r1 = -1
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6954a(r0, r1)
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6985m(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C299519.mo36372a():void");
                }

                @Override // com.qiyukf.unicorn.p229h.C2670d.AbstractC2678a
                /* renamed from: a */
                public final void mo36373a(String str) {
                    if (TextUtils.equals(ServiceMessageFragment.this.f3931g, str)) {
                        ServiceMessageFragment.this.f6503q.mo36823b();
                    }
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
                    	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
                    	at java.util.ArrayList.get(ArrayList.java:435)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // com.qiyukf.unicorn.p229h.C2670d.AbstractC2678a
                /* renamed from: a */
                public final void mo36374a(java.lang.String r2, com.qiyukf.unicorn.p212e.C2467c r3) {
                    /*
                        r1 = this;
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        java.lang.String r0 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6984l(r0)
                        boolean r2 = android.text.TextUtils.equals(r0, r2)
                        if (r2 == 0) goto L_0x001c
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r2 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        r0 = 2
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6954a(r2, r0)
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r2 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6957a(r2, r3)
                        com.qiyukf.unicorn.ui.fragment.ServiceMessageFragment r2 = com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.this
                        com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6985m(r2)
                    L_0x001c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C299519.mo36374a(java.lang.String, com.qiyukf.unicorn.e.c):void");
                }

                @Override // com.qiyukf.unicorn.p229h.C2670d.AbstractC2678a
                /* renamed from: b */
                public final void mo36375b(String str) {
                    if (TextUtils.equals(ServiceMessageFragment.this.f3931g, str)) {
                        if (ServiceMessageFragment.this.f6499m == 1) {
                            ServiceMessageFragment.this.f6509w = true;
                        }
                        ServiceMessageFragment.this.f3928d.mo34568e();
                        ServiceMessageFragment.this.m6972c();
                        ServiceMessageFragment.this.f6503q.mo36823b();
                    }
                }
            });
            dVar = C2452d.m5375g();
            fragmentActivity = getActivity();
        } else {
            fragmentActivity = null;
            g.mo36337a((C2670d.AbstractC2678a) null);
            dVar = C2452d.m5375g();
        }
        dVar.mo36333a(fragmentActivity);
        C2452d.m5375g().mo36343a(this.f3931g, z);
        ((MsgServiceObserve) NIMClient.getService(MsgServiceObserve.class)).observeCustomNotification(this.f6512z, z);
        ((AuthServiceObserver) NIMClient.getService(AuthServiceObserver.class)).observeOnlineStatus(this.f6498A, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
        if (com.qiyukf.unicorn.C2452d.m5375g().mo36344a(r1) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r11 != 3) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6967a(int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.m6967a(int, boolean):boolean");
    }

    /* renamed from: b */
    private void m6970b(C2559a aVar) {
        UnicornEventBase eventOf;
        if (!TextUtils.isEmpty(aVar.mo36000k()) && (getActivity() instanceof ServiceMessageActivity) && getActivity() != null) {
            C1870a.m3569a(aVar.mo36000k(), new ImageLoaderListener() {
                /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C299317 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    if (ServiceMessageFragment.this.getActivity() != null && bitmap != null) {
                        ((ServiceMessageActivity) ServiceMessageFragment.this.getActivity()).setAvatar(bitmap);
                    }
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                }
            });
        }
        if (C2452d.m5373e().sdkEvents != null && C2452d.m5373e().sdkEvents.eventProcessFactory != null && (eventOf = C2452d.m5373e().sdkEvents.eventProcessFactory.eventOf(1)) != null) {
            ConnectionStaffResultEntry connectionStaffResultEntry = new ConnectionStaffResultEntry();
            if (aVar.mo35986b() == 200) {
                connectionStaffResultEntry.setStaffType(aVar.mo35998i() == 1 ? 0 : 1);
                connectionStaffResultEntry.setConnectResult(0);
                if (this.f6499m == 1) {
                    ConsultSource consultSource = this.f6504r;
                    if (consultSource != null) {
                        if (!TextUtils.isEmpty(consultSource.vipStaffid)) {
                            connectionStaffResultEntry.setVipStaffid(this.f6504r.vipStaffid);
                        }
                        if (!TextUtils.isEmpty(this.f6504r.VIPStaffAvatarUrl)) {
                            connectionStaffResultEntry.setVIPStaffAvatarUrl(this.f6504r.VIPStaffAvatarUrl);
                        }
                        if (!TextUtils.isEmpty(this.f6504r.vipStaffName)) {
                            connectionStaffResultEntry.setVipStaffName(this.f6504r.vipStaffName.length() > 40 ? this.f6504r.vipStaffName.substring(0, 40) : this.f6504r.vipStaffName);
                        }
                    } else {
                        return;
                    }
                }
                connectionStaffResultEntry.setStaffId(aVar.mo35989c());
                connectionStaffResultEntry.setStaffRealId(aVar.mo36001l());
                connectionStaffResultEntry.setStaffIconUrl(aVar.mo36000k());
                connectionStaffResultEntry.setStaffName(aVar.mo35991d());
                connectionStaffResultEntry.setGroupId(aVar.mo36002m());
                connectionStaffResultEntry.setCode(aVar.mo35986b());
            } else {
                connectionStaffResultEntry.setCode(aVar.mo35986b());
                connectionStaffResultEntry.setConnectResult(1);
                if (C1861b.m3529b(getContext())) {
                    connectionStaffResultEntry.setErrorType(1);
                } else {
                    connectionStaffResultEntry.setErrorType(0);
                }
            }
            eventOf.onEvent(connectionStaffResultEntry, getContext(), null);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m6972c() {
        C2842b bVar;
        int i;
        if (this.f6500n != null) {
            if (!C2690a.m6219a().mo36462d() || (i = this.f6499m) == 6 || i == 2 || i == 0) {
                ArrayList arrayList = new ArrayList();
                ShopEntrance shopEntrance = this.f6504r.shopEntrance;
                if (shopEntrance != null) {
                    arrayList.add(new C2842b(C2842b.EnumC2844a.f6040b, shopEntrance.getLogo(), true, this.f6504r.shopEntrance.getName()));
                }
                int i2 = this.f6499m;
                if ((i2 == 1 || i2 == 0 || i2 == 8) && C2433b.m5229a().mo35650b() == null && this.f6509w) {
                    arrayList.add(new C2842b(C2842b.EnumC2844a.f6042d));
                }
                if (this.f6499m == 6 && C2452d.m5375g().mo36368r(this.f3931g)) {
                    arrayList.add(new C2842b(C2842b.EnumC2844a.f6041c));
                }
                if (this.f6499m == 1 && this.f6505s.canCloseSession()) {
                    bVar = new C2842b(C2842b.EnumC2844a.f6043e, true);
                } else if (!m6977e() || !this.f6505s.canQuitQueue()) {
                    if (this.f6499m == 8 && this.f6505s.canCloseSession()) {
                        bVar = new C2842b(C2842b.EnumC2844a.f6043e, false);
                    }
                    this.f6500n.mo36666a(arrayList);
                    return;
                } else {
                    bVar = new C2842b(C2842b.EnumC2844a.f6043e, true);
                }
                arrayList.add(bVar);
                this.f6500n.mo36666a(arrayList);
                return;
            }
            m6960a(C2452d.m5375g().mo36363m(this.f3931g));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m6973c(ServiceMessageFragment serviceMessageFragment) {
        int i;
        C2670d g = C2452d.m5375g();
        if (C2670d.m6139j(serviceMessageFragment.f3931g) != null) {
            i = 7;
        } else if (g.mo36328a(serviceMessageFragment.f3931g) > 0) {
            i = g.mo36345b(serviceMessageFragment.f3931g).f4891f ? 10 : 4;
        } else if (g.mo36359h(serviceMessageFragment.f3931g)) {
            i = 2;
        } else if (g.mo36355f(serviceMessageFragment.f3931g) == 1) {
            i = 6;
        } else {
            if (g.mo36349c(serviceMessageFragment.f3931g) > 0) {
                serviceMessageFragment.f6499m = 1;
            }
            serviceMessageFragment.m6965a((String) null, 1, 0);
        }
        serviceMessageFragment.f6499m = i;
        serviceMessageFragment.m6965a((String) null, 1, 0);
    }

    /* renamed from: d */
    private void m6974d() {
        String p = C2437b.m5296p();
        if (!TextUtils.isEmpty(p)) {
            C2437b.m5297p(null);
            String[] split = TextUtils.split(p, Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (final String str : split) {
                C2667c.m6115a((AbstractC2597e) new C2612h(str, 2), this.f3931g, false).setCallback(new RequestCallbackWrapper<Void>() {
                    /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298610 */

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, java.lang.Throwable] */
                    @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                    public final /* synthetic */ void onResult(int i, Void r2, Throwable th) {
                        if (i != 200) {
                            C2437b.m5297p(str);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m6975d(ServiceMessageFragment serviceMessageFragment) {
        serviceMessageFragment.f3929e.mo34495i().mo34510a((C2044b.AbstractC2046a) new C2044b.AbstractC2046a() {
            /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C298812 */

            @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2046a
            /* renamed from: a */
            public final void mo34519a() {
                ServiceMessageFragment.m6964a(ServiceMessageFragment.this, false);
            }

            @Override // com.qiyukf.nim.uikit.session.module.p153a.C2044b.AbstractC2046a
            /* renamed from: b */
            public final void mo34520b() {
                ServiceMessageFragment.this.m6967a((ServiceMessageFragment) 6, false);
            }
        });
    }

    /* renamed from: e */
    public static /* synthetic */ void m6976e(ServiceMessageFragment serviceMessageFragment) {
        boolean z = true;
        ((AuthService) NIMClient.getService(AuthService.class)).changeSaverMode(1);
        if (!C2452d.m5353a().mo35678i()) {
            serviceMessageFragment.f6508v = true;
            serviceMessageFragment.f6499m = 2;
            serviceMessageFragment.m6965a((String) null, 1, 0);
            return;
        }
        serviceMessageFragment.m6974d();
        if (C2452d.m5376h().mo35653a(serviceMessageFragment.f3931g) > 0) {
            z = false;
        }
        C2482q d = C2452d.m5375g().mo36351d(serviceMessageFragment.f3931g);
        if (d != null) {
            C2559a aVar = new C2559a();
            aVar.mo35983a(200);
            aVar.mo35987b(d.f4928g);
            aVar.mo35990c(d.f4925d);
            aVar.mo35994e(d.f4930i);
            aVar.mo35992d(d.f4926e);
            aVar.mo35984a(d.f4924c);
            serviceMessageFragment.m6970b(aVar);
        }
        if (z) {
            serviceMessageFragment.m6967a(0, false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private boolean m6977e() {
        int i = this.f6499m;
        return i == 4 || i == 10;
    }

    /* renamed from: v */
    public static /* synthetic */ void m6994v(ServiceMessageFragment serviceMessageFragment) {
        int i = 0;
        serviceMessageFragment.f6508v = false;
        if (TextUtils.isEmpty(serviceMessageFragment.f3931g)) {
            serviceMessageFragment.mo34449a(C2437b.m5260c());
            serviceMessageFragment.f6503q.mo36821a(serviceMessageFragment.f3931g);
            C2452d.m5375g().mo36350c().mo36316a(serviceMessageFragment, serviceMessageFragment.f3931g);
            Bundle arguments = serviceMessageFragment.getArguments();
            if (arguments != null) {
                arguments.putString("account", serviceMessageFragment.f3931g);
            }
        }
        serviceMessageFragment.mo34448a();
        C2478m mVar = new C2478m(serviceMessageFragment.f3931g);
        mVar.mo35733a(false);
        mVar.mo35732a(serviceMessageFragment.f6506t);
        C2467c cVar = serviceMessageFragment.f6506t;
        if (cVar != null) {
            i = cVar.f4863a;
        }
        mVar.mo35729a(i);
        C2452d.m5375g().mo36344a(mVar);
    }

    /* renamed from: a */
    public final void mo36825a(CustomNotification customNotification) {
        int b;
        AbstractC2597e attachment = customNotification.getAttachment();
        if (attachment != null) {
            int cmdId = attachment.getCmdId();
            if (cmdId == 2) {
                final C2559a aVar = (C2559a) attachment;
                if (aVar.mo36012w() == 1) {
                    C3021g.m7059a(getContext(), aVar.mo35986b() == 200 ? "您有会话正在进行中，是否结束会话发起新的咨询" : "您已在另一个入口排队，是否退出排队发起新的咨询", true, (C3021g.AbstractC3022a) new C3021g.AbstractC3022a() {
                        /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.C299014 */

                        @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                        /* renamed from: a */
                        public final void mo34369a(int i) {
                            if (i == 0) {
                                ServiceMessageFragment.this.m6967a((ServiceMessageFragment) 0, true);
                                return;
                            }
                            C2452d.m5375g().mo36341a(ServiceMessageFragment.this.f3931g, aVar);
                            ServiceMessageFragment.this.m6959a((ServiceMessageFragment) aVar);
                        }
                    });
                } else if (aVar.mo35986b() == 200) {
                    m6959a(aVar);
                } else {
                    mo34184a(new Runnable() {
                        /* class com.qiyukf.unicorn.p244ui.fragment.ServiceMessageFragment.RunnableC299115 */

                        public final void run() {
                            ServiceMessageFragment.this.m6959a((ServiceMessageFragment) aVar);
                        }
                    }, 1000);
                }
                this.f6506t = null;
            } else if (cmdId == 6) {
                this.f6499m = 8;
                if (((C2590t) attachment).mo36104b() != 1) {
                    this.f6503q.mo36824c();
                }
                m6965a((String) null, 1, 0);
            } else if (cmdId == 15) {
                C2579n nVar = (C2579n) attachment;
                if (this.f6499m != 1 && (b = nVar.mo36063b()) != 200) {
                    if (b == 301) {
                        this.f6499m = 1;
                        m6965a((String) null, 1, 0);
                    } else if (b == 302) {
                        this.f6499m = 3;
                        m6965a(nVar.mo36067f(), 1, 0);
                    } else if (b == 303) {
                        this.f6499m = 9;
                        m6965a(nVar.mo36067f(), 1, 0);
                    } else {
                        this.f6499m = -1;
                        m6965a((String) null, 1, 0);
                    }
                }
            } else if (cmdId == 25) {
                this.f3928d.mo34558a((C2571g) attachment);
            } else if (cmdId == 28) {
                C2578m mVar = (C2578m) attachment;
                C2313a a = C2323f.m5018a(mVar.mo36061b());
                if (a != null) {
                    ((MsgService) NIMClient.getService(MsgService.class)).deleteChattingHistory(a);
                    this.f3929e.mo34488b(a);
                    mVar.mo36060a(getString(C2364R.string.ysf_staff_withdrawal_str, C2180b.m4479d().userInfoProvider.getUserInfo(a.getFromAccount()).getName()));
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomMessage(this.f3931g, SessionTypeEnum.Ysf, mVar), true);
                }
            } else if (cmdId == 34) {
                onProcessRunUIResponse((C2583r) attachment);
            } else if (cmdId == 59) {
                onInputingEventProcess((C2574i) attachment);
            } else if (cmdId == 90) {
                this.f6499m = 7;
                m6965a((String) null, 1, 0);
            } else if (cmdId == 211) {
                C2589s sVar = (C2589s) attachment;
                C2452d.m5375g().mo36342a(this.f3931g, sVar.mo36102a());
                this.f3928d.mo34560a((List<? extends AbstractC2471f>) sVar.mo36102a(), false);
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment, com.qiyukf.nim.uikit.session.module.AbstractC2048b
    public native boolean isAllowSendMessage(boolean z);

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment, androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onActivityCreated(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment, androidx.fragment.app.Fragment
    public native void onActivityResult(int i, int i2, Intent intent);

    public native boolean onBackPressed();

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment, androidx.fragment.app.Fragment, com.qiyukf.nim.uikit.common.fragment.TFragment
    public native void onDestroy();

    public void onInputingEventProcess(C2574i iVar) {
        C2066e eVar;
        if (iVar.mo36054a() == C2452d.m5375g().mo36349c(this.f3931g) && (eVar = this.f3928d) != null) {
            eVar.mo34569f();
        }
    }

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        try {
            C2452d.m5375g().mo36350c().mo36313a();
        } catch (NullPointerException e) {
            C1709a.m3015b("NullPointerException", "邀请评价发生异常", e);
        }
    }

    public native void onProcessRunUIResponse(C2583r rVar);

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment
    public void onReceiveMessage(List<IMMessage> list) {
        IMMessage iMMessage = list.get(0);
        if (iMMessage.getSessionType() == SessionTypeEnum.Ysf && TextUtils.equals(this.f3931g, iMMessage.getSessionId())) {
            ConsultSource consultSource = this.f6504r;
            if (consultSource != null && !TextUtils.isEmpty(consultSource.prompt) && !TextUtils.isEmpty(this.f6504r.vipStaffid) && !TextUtils.isEmpty(this.f6504r.VIPStaffAvatarUrl) && this.f6499m == 1) {
                for (IMMessage iMMessage2 : list) {
                    if (iMMessage2.getAttachment() instanceof C2559a) {
                        C2559a aVar = (C2559a) iMMessage2.getAttachment();
                        aVar.mo36009t();
                        aVar.mo35988b(this.f6504r.prompt.length() > 100 ? this.f6504r.prompt.substring(0, 100) : this.f6504r.prompt);
                    }
                    iMMessage2.setFromAccount(this.f6504r.vipStaffid);
                    ((MsgService) NIMClient.getService(MsgService.class)).updateMessage(iMMessage2, true);
                }
            }
            m6974d();
            if (C2437b.m5284j(this.f3931g) != -1) {
                this.f6503q.mo36823b();
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.fragment.MessageFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f3934j) {
            try {
                C2452d.m5375g().mo36350c().mo36316a(this, this.f3931g);
                C2452d.m5375g().mo36348b(this.f3931g, true);
            } catch (NullPointerException e) {
                C1709a.m3015b("NullPointerException", "邀请评价发生异常", e);
            }
            if (this.f6510x) {
                this.f6510x = false;
                m6967a(100, false);
            }
        }
    }

    public native void setArguments(String str, ConsultSource consultSource, ViewGroup viewGroup);
}
