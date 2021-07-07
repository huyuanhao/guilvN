package com.tencent.p269mm.opensdk.channel.p270a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p269mm.opensdk.constants.Build;
import com.tencent.p269mm.opensdk.constants.ConstantsAPI;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.channel.a.a */
public final class C3374a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a */
    public static class C3375a {

        /* renamed from: a */
        public String f8313a;
        public String action;

        /* renamed from: b */
        public long f8314b;
        public Bundle bundle;
        public String content;
    }

    /* renamed from: a */
    public static boolean m8636a(Context context, C3375a aVar) {
        String str;
        if (context == null) {
            str = "send fail, invalid argument";
        } else if (C3392d.m8661b(aVar.action)) {
            str = "send fail, action is null";
        } else {
            String str2 = null;
            if (!C3392d.m8661b(aVar.f8313a)) {
                str2 = aVar.f8313a + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(aVar.action);
            Bundle bundle = aVar.bundle;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, aVar.content);
            intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, aVar.f8314b);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C3376b.m8637a(aVar.content, Build.SDK_INT, packageName));
            context.sendBroadcast(intent, str2);
            Log.m8650d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
            return true;
        }
        Log.m8651e("MicroMsg.SDK.MMessage", str);
        return false;
    }
}
