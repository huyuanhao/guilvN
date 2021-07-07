package com.qiyukf.unicorn.p229h;

import android.text.TextUtils;
import com.qiyukf.nim.uikit.session.module.AbstractC2048b;
import com.qiyukf.nimlib.sdk.InvocationFuture;
import com.qiyukf.nimlib.sdk.NIMClient;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.MsgService;
import com.qiyukf.nimlib.sdk.msg.model.CustomNotification;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.p209b.C2437b;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p232k.C2713k;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.h.c */
public final class C2667c {

    /* renamed from: a */
    public static AbstractC2048b f5514a;

    /* renamed from: a */
    public static int m6114a(IMMessage iMMessage) {
        JSONObject extension = iMMessage.getExtension();
        if (extension != null) {
            return extension.optInt("type");
        }
        return 0;
    }

    /* renamed from: a */
    public static InvocationFuture<Void> m6115a(AbstractC2597e eVar, String str, boolean z) {
        CustomNotification createCustomNotification = MessageBuilder.createCustomNotification(eVar, str);
        MsgService msgService = (MsgService) NIMClient.getService(MsgService.class);
        return z ? msgService.sendImportantNotification(createCustomNotification) : msgService.sendCustomNotification(createCustomNotification);
    }

    /* renamed from: a */
    public static String m6116a() {
        String c = C2437b.m5260c();
        return !TextUtils.isEmpty(c) ? c : "-1";
    }

    /* renamed from: a */
    public static void m6117a(AbstractC2048b bVar) {
        f5514a = bVar;
    }

    /* renamed from: a */
    public static void m6118a(final IMMessage iMMessage, final boolean z, final boolean z2) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.p229h.C2667c.RunnableC26681 */

            public final void run() {
                if (C2667c.f5514a != null) {
                    C2667c.f5514a.saveMessageToLocal(iMMessage, z, z2);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m6119b(final IMMessage iMMessage) {
        C2713k.m6273a(new Runnable() {
            /* class com.qiyukf.unicorn.p229h.C2667c.RunnableC26692 */

            public final void run() {
                if (C2667c.f5514a != null) {
                    C2667c.f5514a.sendMessage(iMMessage, false);
                }
            }
        });
    }

    /* renamed from: b */
    public static boolean m6120b() {
        AbstractC2048b bVar = f5514a;
        return bVar != null && bVar.isAllowSendMessage(false);
    }
}
