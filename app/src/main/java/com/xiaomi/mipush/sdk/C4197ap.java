package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4282bc;
import com.xiaomi.push.C4475h;
import com.xiaomi.push.C4510id;
import com.xiaomi.push.C4511ie;
import com.xiaomi.push.C4512if;
import com.xiaomi.push.C4516ij;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4522ip;
import com.xiaomi.push.C4523iq;
import com.xiaomi.push.C4524ir;
import com.xiaomi.push.C4526it;
import com.xiaomi.push.C4528iv;
import com.xiaomi.push.C4530ix;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.mipush.sdk.ap */
public class C4197ap {
    /* renamed from: a */
    public static <T extends AbstractC4532iz<T, ?>> C4517ik m11413a(Context context, T t, EnumC4494ho hoVar) {
        return m11414a(context, t, hoVar, !hoVar.equals(EnumC4494ho.Registration), context.getPackageName(), C4209b.m11491a(context).m11495a());
    }

    /* renamed from: a */
    public static <T extends AbstractC4532iz<T, ?>> C4517ik m11414a(Context context, T t, EnumC4494ho hoVar, boolean z, String str, String str2) {
        String str3;
        byte[] a = C4531iy.m13590a(t);
        if (a == null) {
            str3 = "invoke convertThriftObjectToBytes method, return null.";
        } else {
            C4517ik ikVar = new C4517ik();
            if (z) {
                String d = C4209b.m11491a(context).mo41432d();
                if (TextUtils.isEmpty(d)) {
                    str3 = "regSecret is empty, return null";
                } else {
                    try {
                        a = C4475h.m12857b(C4282bc.m11788a(d), a);
                    } catch (Exception unused) {
                        AbstractC4163b.m11306d("encryption error. ");
                    }
                }
            }
            C4510id idVar = new C4510id();
            idVar.f12554a = 5;
            idVar.f12555a = "fakeid";
            ikVar.mo42276a(idVar);
            ikVar.mo42278a(ByteBuffer.wrap(a));
            ikVar.mo42274a(hoVar);
            ikVar.mo42281b(true);
            ikVar.mo42280b(str);
            ikVar.mo42279a(z);
            ikVar.mo42277a(str2);
            return ikVar;
        }
        AbstractC4163b.m11301a(str3);
        return null;
    }

    /* renamed from: a */
    public static AbstractC4532iz m11415a(Context context, C4517ik ikVar) {
        byte[] bArr;
        if (ikVar.m13289b()) {
            try {
                bArr = C4475h.m12856a(C4282bc.m11788a(C4209b.m11491a(context).mo41432d()), ikVar.m13283a());
            } catch (Exception e) {
                throw new C4233t("the aes decrypt failed.", e);
            }
        } else {
            bArr = ikVar.m13283a();
        }
        AbstractC4532iz a = m11416a(ikVar.mo42273a(), ikVar.f12695b);
        if (a != null) {
            C4531iy.m13589a(a, bArr);
        }
        return a;
    }

    /* renamed from: a */
    public static AbstractC4532iz m11416a(EnumC4494ho hoVar, boolean z) {
        switch (C4198aq.f11236a[hoVar.ordinal()]) {
            case 1:
                return new C4522ip();
            case 2:
                return new C4528iv();
            case 3:
                return new C4526it();
            case 4:
                return new C4530ix();
            case 5:
                return new C4524ir();
            case 6:
                return new C4511ie();
            case 7:
                return new C4516ij();
            case 8:
                return new C4523iq();
            case 9:
                if (z) {
                    return new C4520in();
                }
                C4512if ifVar = new C4512if();
                ifVar.mo42199a(true);
                return ifVar;
            case 10:
                return new C4516ij();
            default:
                return null;
        }
    }
}
