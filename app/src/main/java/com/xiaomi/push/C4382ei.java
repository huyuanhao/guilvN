package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ei */
public class C4382ei extends AbstractC4379ef {
    public C4382ei(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 23;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12187a() {
        return EnumC4496hq.Storage;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12188a() {
        return "ram:" + C4506i.m13039b() + Constants.ACCEPT_TIME_SEPARATOR_SP + "rom:" + C4506i.m13044c();
    }
}
