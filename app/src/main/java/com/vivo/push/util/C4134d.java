package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.C4121p;
import com.vivo.push.p281b.C4032aa;
import java.util.HashMap;

/* renamed from: com.vivo.push.util.d */
public final class C4134d {
    /* renamed from: a */
    public static boolean m11165a(Context context, long j, long j2) {
        C4146p.m11216d("ClientReportUtil", "report message: " + j + ", reportType: " + j2);
        C4032aa aaVar = new C4032aa(j2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("messageID", String.valueOf(j));
        String b = C4156z.m11266b(context, context.getPackageName());
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("remoteAppId", b);
        }
        aaVar.mo40901a(hashMap);
        C4121p.m11080a().mo41096a(aaVar);
        return true;
    }
}
