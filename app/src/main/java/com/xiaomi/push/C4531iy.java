package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4544jg;
import com.xiaomi.push.C4555jq;

/* renamed from: com.xiaomi.push.iy */
public class C4531iy {
    /* renamed from: a */
    public static short m13588a(Context context, C4517ik ikVar) {
        int i = 0;
        int a = C4442g.m12697a(context, ikVar.f12694b).mo41918a() + 0 + (C4250ah.m11638b(context) ? 4 : 0);
        if (C4250ah.m11637a(context)) {
            i = 8;
        }
        return (short) (a + i);
    }

    /* renamed from: a */
    public static <T extends AbstractC4532iz<T, ?>> void m13589a(T t, byte[] bArr) {
        if (bArr != null) {
            new C4541jd(new C4555jq.C4556a(true, true, bArr.length)).mo42567a(t, bArr);
            return;
        }
        throw new C4542je("the message byte is empty.");
    }

    /* renamed from: a */
    public static <T extends AbstractC4532iz<T, ?>> byte[] m13590a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new C4543jf(new C4544jg.C4545a()).mo42568a(t);
        } catch (C4542je e) {
            AbstractC4163b.m11302a("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
