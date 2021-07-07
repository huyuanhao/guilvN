package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.AbstractC4435fu;
import com.xiaomi.push.AbstractC4456gl;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4351dh;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4510id;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4542je;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.service.C4611am;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.w */
public final class C4684w {
    /* renamed from: a */
    public static C4428fn m14203a(XMPushService xMPushService, byte[] bArr) {
        C4517ik ikVar = new C4517ik();
        try {
            C4531iy.m13589a(ikVar, bArr);
            return m14204a(C4671l.m14141a((Context) xMPushService), xMPushService, ikVar);
        } catch (C4542je e) {
            AbstractC4163b.m11303a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static C4428fn m14204a(C4670k kVar, Context context, C4517ik ikVar) {
        try {
            C4428fn fnVar = new C4428fn();
            fnVar.mo41866a(5);
            fnVar.mo41875c(kVar.f13353a);
            fnVar.mo41873b(m14207a(ikVar));
            fnVar.mo41869a("SECMSG", "message");
            String str = kVar.f13353a;
            ikVar.f12689a.f12555a = str.substring(0, str.indexOf("@"));
            ikVar.f12689a.f12559c = str.substring(str.indexOf(C8932ooOOO0o.OooO0OO) + 1);
            fnVar.mo41871a(C4531iy.m13590a(ikVar), kVar.f13355c);
            fnVar.mo41870a((short) 1);
            AbstractC4163b.m11301a("try send mi push message. packagename:" + ikVar.f12694b + " action:" + ikVar.f12687a);
            return fnVar;
        } catch (NullPointerException e) {
            AbstractC4163b.m11303a(e);
            return null;
        }
    }

    /* renamed from: a */
    public static C4517ik m14205a(String str, String str2) {
        C4520in inVar = new C4520in();
        inVar.mo42314b(str2);
        inVar.mo42317c("package uninstalled");
        inVar.mo42307a(AbstractC4456gl.m12777i());
        inVar.mo42310a(false);
        return m14206a(str, str2, inVar, EnumC4494ho.Notification);
    }

    /* renamed from: a */
    public static <T extends AbstractC4532iz<T, ?>> C4517ik m14206a(String str, String str2, T t, EnumC4494ho hoVar) {
        byte[] a = C4531iy.m13590a(t);
        C4517ik ikVar = new C4517ik();
        C4510id idVar = new C4510id();
        idVar.f12554a = 5;
        idVar.f12555a = "fakeid";
        ikVar.mo42276a(idVar);
        ikVar.mo42278a(ByteBuffer.wrap(a));
        ikVar.mo42274a(hoVar);
        ikVar.mo42281b(true);
        ikVar.mo42280b(str);
        ikVar.mo42279a(false);
        ikVar.mo42277a(str2);
        return ikVar;
    }

    /* renamed from: a */
    public static String m14207a(C4517ik ikVar) {
        Map<String, String> map;
        C4508ib ibVar = ikVar.f12688a;
        if (!(ibVar == null || (map = ibVar.f12536b) == null)) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return ikVar.f12694b;
    }

    /* renamed from: a */
    public static String m14208a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* renamed from: a */
    public static void m14209a(XMPushService xMPushService) {
        C4670k a = C4671l.m14141a(xMPushService.getApplicationContext());
        if (a != null) {
            C4611am.C4613b a2 = C4671l.m14141a(xMPushService.getApplicationContext()).mo42740a(xMPushService);
            m14211a(xMPushService, a2);
            C4611am.mo42670a().mo42676a(a2);
            C4638bd.m14046a(xMPushService).mo42701a(new C4685x("GAID", 172800, xMPushService, a));
            m14212a(xMPushService, a, 172800);
        }
    }

    /* renamed from: a */
    public static void m14210a(XMPushService xMPushService, C4517ik ikVar) {
        C4351dh.m12080a(ikVar.mo42282b(), xMPushService.getApplicationContext(), ikVar, -1);
        AbstractC4435fu a = xMPushService.m13792a();
        if (a == null) {
            throw new C4449gf("try send msg while connection is null.");
        } else if (a.m12660a()) {
            C4428fn a2 = m14204a(C4671l.m14141a((Context) xMPushService), xMPushService, ikVar);
            if (a2 != null) {
                a.mo41894b(a2);
            }
        } else {
            throw new C4449gf("Don't support XMPP connection.");
        }
    }

    /* renamed from: a */
    public static void m14211a(XMPushService xMPushService, C4611am.C4613b bVar) {
        bVar.mo42681a((Messenger) null);
        bVar.mo42682a(new C4687z(xMPushService));
    }

    /* renamed from: a */
    public static void m14212a(XMPushService xMPushService, C4670k kVar, int i) {
        C4638bd.m14046a(xMPushService).mo42701a(new C4686y("MSAID", (long) i, xMPushService, kVar));
    }

    /* renamed from: a */
    public static void m14213a(XMPushService xMPushService, String str, byte[] bArr) {
        C4351dh.m12082a(str, xMPushService.getApplicationContext(), bArr);
        AbstractC4435fu a = xMPushService.m13792a();
        if (a == null) {
            throw new C4449gf("try send msg while connection is null.");
        } else if (a.m12660a()) {
            C4428fn a2 = m14203a(xMPushService, bArr);
            if (a2 != null) {
                a.mo41894b(a2);
            } else {
                C4675o.m14163a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
            }
        } else {
            throw new C4449gf("Don't support XMPP connection.");
        }
    }
}
