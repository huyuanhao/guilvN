package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.ax */
public class HandlerC4206ax extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C4204aw f11262a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC4206ax(C4204aw awVar, Looper looper) {
        super(looper);
        this.f11262a = awVar;
    }

    public void dispatchMessage(Message message) {
        C4204aw awVar;
        EnumC4212bb bbVar;
        HashMap<String, String> a;
        C4204aw awVar2;
        EnumC4212bb bbVar2;
        if (message.what == 19) {
            String str = (String) message.obj;
            int i = message.arg1;
            synchronized (C4194am.class) {
                if (C4194am.m11405a(C4204aw.m11439a(this.f11262a)).m11410a(str)) {
                    if (C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41386a(str) < 10) {
                        if (EnumC4212bb.DISABLE_PUSH.ordinal() == i && "syncing".equals(C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41387a(EnumC4212bb.DISABLE_PUSH))) {
                            awVar2 = this.f11262a;
                            bbVar2 = EnumC4212bb.DISABLE_PUSH;
                        } else if (EnumC4212bb.ENABLE_PUSH.ordinal() != i || !"syncing".equals(C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41387a(EnumC4212bb.ENABLE_PUSH))) {
                            if (EnumC4212bb.UPLOAD_HUAWEI_TOKEN.ordinal() == i && "syncing".equals(C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41387a(EnumC4212bb.UPLOAD_HUAWEI_TOKEN))) {
                                awVar = this.f11262a;
                                bbVar = EnumC4212bb.UPLOAD_HUAWEI_TOKEN;
                                a = C4220h.m11556a(C4204aw.m11439a(this.f11262a), EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
                            } else if (EnumC4212bb.UPLOAD_FCM_TOKEN.ordinal() == i && "syncing".equals(C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41387a(EnumC4212bb.UPLOAD_FCM_TOKEN))) {
                                awVar = this.f11262a;
                                bbVar = EnumC4212bb.UPLOAD_FCM_TOKEN;
                                a = C4220h.m11556a(C4204aw.m11439a(this.f11262a), EnumC4216d.ASSEMBLE_PUSH_FCM);
                            } else if (EnumC4212bb.UPLOAD_COS_TOKEN.ordinal() != i || !"syncing".equals(C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41387a(EnumC4212bb.UPLOAD_COS_TOKEN))) {
                                if (EnumC4212bb.UPLOAD_FTOS_TOKEN.ordinal() == i && "syncing".equals(C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41387a(EnumC4212bb.UPLOAD_FTOS_TOKEN))) {
                                    awVar = this.f11262a;
                                    bbVar = EnumC4212bb.UPLOAD_FTOS_TOKEN;
                                    a = C4220h.m11556a(C4204aw.m11439a(this.f11262a), EnumC4216d.ASSEMBLE_PUSH_FTOS);
                                }
                                C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41389b(str);
                            } else {
                                awVar = this.f11262a;
                                bbVar = EnumC4212bb.UPLOAD_COS_TOKEN;
                                a = C4220h.m11556a(C4204aw.m11439a(this.f11262a), EnumC4216d.ASSEMBLE_PUSH_COS);
                            }
                            awVar.m11450a((C4204aw) str, (String) bbVar, (EnumC4212bb) false, (boolean) a);
                            C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41389b(str);
                        } else {
                            awVar2 = this.f11262a;
                            bbVar2 = EnumC4212bb.ENABLE_PUSH;
                        }
                        awVar2.m11450a((C4204aw) str, (String) bbVar2, (EnumC4212bb) true, (boolean) null);
                        C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41389b(str);
                    } else {
                        C4194am.m11405a(C4204aw.m11439a(this.f11262a)).mo41390c(str);
                    }
                }
            }
        }
    }
}
