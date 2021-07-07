package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.ej */
public class C4383ej extends AbstractC4379ef {

    /* renamed from: a */
    public SharedPreferences f11655a;

    public C4383ej(Context context, int i) {
        super(context, i);
        this.f11655a = context.getSharedPreferences("mipush_extra", 0);
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 9;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12190a() {
        return EnumC4496hq.TopApp;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12191a() {
        return null;
    }
}
