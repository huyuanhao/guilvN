package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.ee */
public class C4378ee extends AbstractC4379ef {

    /* renamed from: a */
    public static String f11642a = "";

    /* renamed from: b */
    public static String f11643b = "";

    public C4378ee(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    private String m12160a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length <= 10) {
            return str2;
        }
        int length = split.length;
        while (true) {
            length--;
            if (length < split.length - 10) {
                return str;
            }
            str = str + split[length];
        }
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 12;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public EnumC4496hq m12162a() {
        return EnumC4496hq.BroadcastAction;
    }

    @Override // com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.AbstractC4379ef, com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public String m12163a() {
        String str;
        if (!TextUtils.isEmpty(f11642a)) {
            str = "" + m12160a(C4370dx.f11636a, f11642a);
            f11642a = "";
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(f11643b)) {
            return str;
        }
        String str2 = str + m12160a(C4370dx.f11637b, f11643b);
        f11643b = "";
        return str2;
    }
}
