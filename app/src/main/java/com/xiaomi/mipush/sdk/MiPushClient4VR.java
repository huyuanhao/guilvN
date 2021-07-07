package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4609ak;

public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        C4520in inVar = new C4520in();
        inVar.mo42317c(EnumC4504hy.VRUpload.f12451a);
        inVar.mo42314b(C4209b.m11491a(context).m11495a());
        inVar.mo42321d(context.getPackageName());
        inVar.mo42313a("data", str);
        inVar.mo42307a(C4609ak.m13938a());
        C4204aw.m11444a(context).mo41402a(inVar, EnumC4494ho.Notification, (C4508ib) null);
    }
}
