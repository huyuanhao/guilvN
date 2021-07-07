package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.ci */
public class C4322ci {

    /* renamed from: a */
    public static String f11504a;

    /* renamed from: a */
    public static SimpleDateFormat f11505a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f11505a = simpleDateFormat;
        f11504a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public static C4498hs m11952a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4498hs hsVar = new C4498hs();
        hsVar.mo42028d("category_push_stat");
        hsVar.mo42018a("push_sdk_stat_channel");
        hsVar.mo42017a(1);
        hsVar.mo42021b(str);
        hsVar.mo42019a(true);
        hsVar.mo42020b(System.currentTimeMillis());
        hsVar.mo42035g(C4298br.m11843a(context).m11850a());
        hsVar.mo42030e(MiPushRegistar.PACKAGE_XIAOMI);
        hsVar.mo42033f("");
        hsVar.mo42024c("push_stat");
        return hsVar;
    }
}
