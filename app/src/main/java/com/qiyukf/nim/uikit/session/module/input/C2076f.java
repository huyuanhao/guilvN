package com.qiyukf.nim.uikit.session.module.input;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.session.helper.C2020g;
import com.qiyukf.nim.uikit.session.module.C2023a;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.OnBotEventListener;
import com.qiyukf.unicorn.api.OnMessageItemClickListener;
import com.qiyukf.unicorn.api.QuickEntry;
import com.qiyukf.unicorn.api.QuickEntryListener;
import com.qiyukf.unicorn.api.RequestCallback;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.event.EventService;
import com.qiyukf.unicorn.p212e.AbstractC2471f;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2598a;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2599b;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2600c;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2601d;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2602e;
import com.qiyukf.unicorn.p213f.p214a.p221e.C2603f;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2605a;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;
import com.qiyukf.unicorn.widget.BotActionItemView;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.f */
public final class C2076f {

    /* renamed from: a */
    public C2023a f4177a;

    /* renamed from: b */
    public LinearLayout f4178b;

    /* renamed from: c */
    public LinearLayout f4179c;

    /* renamed from: d */
    public long f4180d = 0;

    /* renamed from: e */
    public C2020g f4181e;

    public C2076f(C2023a aVar, LinearLayout linearLayout) {
        this.f4177a = aVar;
        this.f4178b = linearLayout;
    }

    /* renamed from: a */
    public final void mo34588a(int i, Intent intent) {
        C2020g gVar;
        if (i == 19) {
            C2020g gVar2 = this.f4181e;
            if (gVar2 != null) {
                gVar2.mo34474a(19, intent);
            }
        } else if (i == 20 && (gVar = this.f4181e) != null) {
            gVar.mo34474a(20, intent);
        }
    }

    /* renamed from: a */
    public final void mo34589a(List<? extends AbstractC2471f> list) {
        int i;
        TextView textView;
        if (list == null || list.isEmpty()) {
            LinearLayout linearLayout = this.f4179c;
            if (linearLayout != null && linearLayout.getVisibility() != 8) {
                this.f4179c.setVisibility(8);
                return;
            }
            return;
        }
        int i2 = 0;
        if (this.f4179c == null) {
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(this.f4177a.f3991a).inflate(C2364R.layout.ysf_message_quick_entry_layout, (ViewGroup) this.f4178b, false);
            this.f4179c = linearLayout2;
            this.f4178b.addView(linearLayout2, 0);
        }
        this.f4179c.setVisibility(0);
        LinearLayout linearLayout3 = (LinearLayout) this.f4179c.findViewById(C2364R.C2367id.ysf_message_quick_entry_container);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f4179c.findViewById(C2364R.C2367id.ysf_hs_quick_scroller);
        if (horizontalScrollView != null) {
            horizontalScrollView.setScrollX(0);
        }
        linearLayout3.removeAllViews();
        while (i2 < list.size()) {
            final AbstractC2471f fVar = (AbstractC2471f) list.get(i2);
            BotActionItemView botActionItemView = new BotActionItemView(this.f4177a.f3991a);
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization == null || uICustomization.inputUpBtnTextColor == 0) {
                textView = botActionItemView.mo36837a();
                i = this.f4177a.f3991a.getResources().getColor(C2364R.C2365color.ysf_black_333333);
            } else {
                textView = botActionItemView.mo36837a();
                i = uICustomization.inputUpBtnTextColor;
            }
            textView.setTextColor(i);
            if (C2690a.m6219a().mo36462d()) {
                botActionItemView.getRootView().setBackgroundDrawable(C2692b.m6229a(C2690a.m6219a().mo36461c().mo35690b(), "#ffffff"));
            } else if (uICustomization == null || uICustomization.inputUpBtnBack == 0) {
                botActionItemView.getRootView().setBackgroundResource(C2364R.C2366drawable.ysf_message_quick_entry_item_bg);
            } else {
                botActionItemView.getRootView().setBackgroundResource(uICustomization.inputUpBtnBack);
            }
            botActionItemView.mo36841a(fVar.getIconUrl(), fVar.getName());
            int i3 = i2 + 1;
            botActionItemView.mo36840a(Long.valueOf((long) ((i3 * 100) << 1)));
            botActionItemView.mo36839a((Boolean) true);
            botActionItemView.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.nim.uikit.session.module.input.C2076f.View$OnClickListenerC20771 */

                public final void onClick(View view) {
                    OnMessageItemClickListener onMessageItemClickListener;
                    Activity activity;
                    String a;
                    OnBotEventListener onBotEventListener;
                    if (System.currentTimeMillis() - C2076f.this.f4180d >= 1000) {
                        AbstractC2471f fVar = fVar;
                        if (fVar instanceof C2598a) {
                            C2598a aVar = (C2598a) fVar;
                            if (aVar.mo36143a() == 1) {
                                if (C2076f.this.f4177a.f3995e.isAllowSendMessage(true)) {
                                    C2076f.this.f4177a.f3995e.sendMessage(MessageBuilder.createTextMessage(C2076f.this.f4177a.f3993c, C2076f.this.f4177a.f3994d, aVar.mo36144b()), false);
                                }
                                JSONObject jSONObject = new JSONObject();
                                C1810b.m3425a(jSONObject, "content", aVar.getName());
                                String str = C2076f.this.f4177a.f3993c;
                                try {
                                    C2605a aVar2 = new C2605a();
                                    aVar2.mo36151a("ai_bot_direct_button_click");
                                    aVar2.mo36152a(jSONObject);
                                    aVar2.mo36150a(Long.valueOf(C2452d.m5375g().mo36349c(str)));
                                    C2667c.m6115a((AbstractC2597e) aVar2, str, false);
                                } catch (Exception e) {
                                    C1709a.m3011a("埋点失败，失败原因", e.toString());
                                }
                            } else if (aVar.mo36143a() == 2 && (onBotEventListener = C2452d.m5373e().onBotEventListener) != null) {
                                onBotEventListener.onUrlClick(C2076f.this.f4177a.f3991a, aVar.mo36145c());
                            }
                        } else if (fVar instanceof QuickEntry) {
                            QuickEntry quickEntry = (QuickEntry) fVar;
                            QuickEntryListener quickEntryListener = C2452d.m5373e().quickEntryListener;
                            if (quickEntryListener != null) {
                                quickEntryListener.onClick(C2076f.this.f4177a.f3991a, C2076f.this.f4177a.f3993c, quickEntry);
                            }
                        } else if (fVar instanceof C2601d) {
                            EventService.openEvaluation(C2076f.this.f4177a.f3991a, C2076f.this.f4177a.f3993c, new RequestCallbackWrapper() {
                                /* class com.qiyukf.nim.uikit.session.module.input.C2076f.View$OnClickListenerC20771.C20781 */

                                @Override // com.qiyukf.nimlib.sdk.RequestCallbackWrapper
                                public final void onResult(int i, Object obj, Throwable th) {
                                    C1865f.m3557a("评价成功");
                                }
                            });
                        } else {
                            if (fVar instanceof C2602e) {
                                C2602e eVar = (C2602e) fVar;
                                if (!TextUtils.isEmpty(eVar.mo36147a())) {
                                    onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
                                    if (onMessageItemClickListener != null) {
                                        activity = C2076f.this.f4177a.f3991a;
                                        a = eVar.mo36147a();
                                    }
                                } else {
                                    return;
                                }
                            } else if (fVar instanceof C2599b) {
                                if (!EventService.closeSession(C2076f.this.f4177a.f3993c, "您已退出会话")) {
                                    C1865f.m3557a("您已退出咨询");
                                }
                            } else if (fVar instanceof C2600c) {
                                C2600c cVar = (C2600c) fVar;
                                if (!TextUtils.isEmpty(cVar.mo36146a())) {
                                    onMessageItemClickListener = C2452d.m5373e().onMessageItemClickListener;
                                    if (onMessageItemClickListener != null) {
                                        activity = C2076f.this.f4177a.f3991a;
                                        a = cVar.mo36146a();
                                    }
                                } else {
                                    return;
                                }
                            } else if (fVar instanceof C2603f) {
                                C2076f fVar2 = C2076f.this;
                                fVar2.f4181e = new C2020g(fVar2.f4177a.f3992b);
                                C2076f.this.f4181e.mo34475a(((C2603f) fVar).mo36148a(), C2076f.this.f4177a.f3993c, 20, 19, new RequestCallback<String>() {
                                    /* class com.qiyukf.nim.uikit.session.module.input.C2076f.View$OnClickListenerC20771.C20792 */

                                    @Override // com.qiyukf.unicorn.api.RequestCallback
                                    public final void onException(Throwable th) {
                                    }

                                    @Override // com.qiyukf.unicorn.api.RequestCallback
                                    public final void onFailed(int i) {
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.qiyukf.unicorn.api.RequestCallback
                                    public final /* synthetic */ void onSuccess(String str) {
                                        C2076f.this.f4181e = null;
                                    }
                                });
                            }
                            onMessageItemClickListener.onURLClicked(activity, a);
                        }
                        C2076f.this.f4180d = System.currentTimeMillis();
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C1862c.m3540a(28.0f));
            float f = 8.0f;
            layoutParams.leftMargin = C1862c.m3540a(i2 == 0 ? 8.0f : 4.0f);
            if (i2 != list.size() - 1) {
                f = 4.0f;
            }
            layoutParams.rightMargin = C1862c.m3540a(f);
            botActionItemView.setLayoutParams(layoutParams);
            linearLayout3.addView(botActionItemView);
            i2 = i3;
        }
    }
}
