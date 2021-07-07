package com.qiyukf.unicorn.api.event;

import android.app.Activity;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.RequestCallbackWrapper;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.evaluation.EvaluationApi;
import com.qiyukf.unicorn.api.evaluation.entry.EvaluationOpenEntry;
import com.qiyukf.unicorn.api.event.eventcallback.TransferCloseResultCallback;
import com.qiyukf.unicorn.api.event.eventcallback.TransferRequestCallback;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p212e.C2467c;
import com.qiyukf.unicorn.p212e.C2474i;
import com.qiyukf.unicorn.p212e.C2478m;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2606b;
import com.qiyukf.unicorn.p229h.C2658a;
import com.qiyukf.unicorn.p229h.C2667c;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b;
import java.util.List;

public class EventService {
    public static boolean closeSession(String str, String str2) {
        if (C2452d.m5375g().mo36349c(str) == 0) {
            return false;
        }
        final C2606b bVar = new C2606b();
        bVar.mo36153a(C2452d.m5375g().mo36349c(str));
        bVar.mo36154a(str2);
        C2667c.m6115a((AbstractC2597e) bVar, str, false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.api.event.EventService.C24151 */

            public final void onResult(int i, Void r2, Throwable th) {
                if (i == 200) {
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(C2667c.m6116a(), SessionTypeEnum.Ysf, bVar), true);
                    return;
                }
                C1865f.m3557a("退出会话失败");
            }
        });
        return true;
    }

    public static void openEvaluation(final Activity activity, final String str, final RequestCallbackWrapper requestCallbackWrapper) {
        C2452d.m5375g();
        C2555c a = C2658a.m6097a(str);
        long m = C2437b.m5290m(String.valueOf(C2437b.m5282i(str)));
        if ((a == null || System.currentTimeMillis() > (a.mo35963f().longValue() * 60 * 1000) + m) && m != 0) {
            C1865f.m3555a(C2364R.string.ysf_evaluation_time_out);
        } else if (2 == C2437b.m5286k(str)) {
            C1865f.m3557a("您已经评价过了哦~");
        } else if (EvaluationApi.getInstance().getOnEvaluationEventListener() != null) {
            EvaluationOpenEntry evaluationOpenEntry = new EvaluationOpenEntry();
            C2452d.m5375g();
            C2555c a2 = C2658a.m6097a(str);
            evaluationOpenEntry.setEvaluationEntryList(a2.mo35962e());
            evaluationOpenEntry.setType(a2.mo35961d());
            evaluationOpenEntry.setTitle(a2.mo35960c());
            evaluationOpenEntry.setExchange(str);
            evaluationOpenEntry.setSessionId(C2437b.m5282i(str));
            evaluationOpenEntry.setResolvedEnabled(a2.mo35968k());
            evaluationOpenEntry.setResolvedRequired(a2.mo35969l());
            EvaluationApi.getInstance().getOnEvaluationEventListener().onEvaluationMessageClick(evaluationOpenEntry, activity);
        } else {
            C2706g.m6258a(activity);
            final DialogC2972b bVar = new DialogC2972b(activity, str);
            bVar.setCanceledOnTouchOutside(false);
            bVar.mo36805a(new DialogC2972b.AbstractC2980a() {
                /* class com.qiyukf.unicorn.api.event.EventService.C24173 */

                @Override // com.qiyukf.unicorn.p244ui.evaluate.DialogC2972b.AbstractC2980a
                public final void onSubmit(int i, List<String> list, String str, String str2, int i2) {
                    bVar.mo36806a(false);
                    bVar.mo36807b(true);
                    C2452d.m5375g().mo36350c().mo36319a(str, i, str, list, i2, new RequestCallbackWrapper<String>() {
                        /* class com.qiyukf.unicorn.api.event.EventService.C24173.C24181 */

                        public void onResult(int i, String str, Throwable th) {
                            DialogC2972b bVar;
                            DialogC2972b bVar2;
                            if (i == 200 && (bVar2 = bVar) != null) {
                                bVar2.cancel();
                            } else if (!(i == 200 || (bVar = bVar) == null || !bVar.isShowing())) {
                                bVar.mo36806a(true);
                                bVar.mo36807b(false);
                                C1865f.m3557a(activity.getString(C2364R.string.ysf_network_error));
                            }
                            requestCallbackWrapper.onResult(i, str, th);
                        }
                    });
                }
            });
            bVar.show();
        }
    }

    public static boolean quitQueue(final String str) {
        C2474i b = C2452d.m5375g().mo36345b(str);
        if (b == null) {
            return false;
        }
        long j = b.f4886a;
        final C2606b bVar = new C2606b();
        bVar.mo36153a(j);
        C2667c.m6115a((AbstractC2597e) bVar, str, false).setCallback(new RequestCallbackWrapper<Void>() {
            /* class com.qiyukf.unicorn.api.event.EventService.C24162 */

            public final void onResult(int i, Void r2, Throwable th) {
                if (i == 200) {
                    C2452d.m5375g().mo36365o(str);
                    ((MsgService) NIMClient.getService(MsgService.class)).saveMessageToLocal(MessageBuilder.createCustomReceivedMessage(str, SessionTypeEnum.Ysf, bVar), true);
                    return;
                }
                C1865f.m3555a(C2364R.string.ysf_msg_quit_queue_failed);
            }
        });
        return true;
    }

    public static void requestStaff(boolean z) {
        requestStaff(C2667c.m6116a(), z, 0, 0, z ? 5 : 0);
    }

    public static boolean requestStaff(String str, boolean z, long j, long j2, int i) {
        C2467c cVar;
        if (j == 0 && j2 == 0) {
            cVar = null;
        } else {
            C2467c cVar2 = new C2467c();
            cVar2.f4863a = j == 0 ? 1 : 2;
            cVar2.f4864b = j != 0 ? j : j2;
            cVar2.mo35696a(j2);
            cVar2.mo35698b(j);
            cVar = cVar2;
        }
        C2478m mVar = new C2478m(str);
        mVar.mo35733a(z);
        mVar.mo35732a(cVar);
        mVar.mo35729a(i);
        mVar.mo35737c(30);
        return C2452d.m5375g().mo36344a(mVar);
    }

    public static void transferStaff(String str, long j, long j2, String str2, boolean z, TransferCloseResultCallback transferCloseResultCallback, TransferRequestCallback transferRequestCallback) {
        C2452d.m5375g().mo36339a(TextUtils.isEmpty(str) ? C2667c.m6116a() : str, j, j2, str2, z, transferCloseResultCallback, transferRequestCallback);
    }
}
