package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.mipush.sdk.i */
public final class RunnableC4221i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11306a;

    /* renamed from: a */
    public final /* synthetic */ EnumC4216d f11307a;

    /* renamed from: a */
    public final /* synthetic */ String f11308a;

    public RunnableC4221i(String str, Context context, EnumC4216d dVar) {
        this.f11308a = str;
        this.f11306a = context;
        this.f11307a = dVar;
    }

    public void run() {
        String str;
        if (!TextUtils.isEmpty(this.f11308a)) {
            String[] split = this.f11308a.split(Constants.WAVE_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.startsWith("token:")) {
                    str = str2.substring(str2.indexOf(Constants.COLON_SEPARATOR) + 1);
                    break;
                }
                i++;
            }
            if (!TextUtils.isEmpty(str)) {
                AbstractC4163b.m11301a("ASSEMBLE_PUSH : receive correct token");
                C4220h.m11570d(this.f11306a, this.f11307a, str);
                C4220h.m11557a(this.f11306a);
                return;
            }
            AbstractC4163b.m11301a("ASSEMBLE_PUSH : receive incorrect token");
        }
    }
}
