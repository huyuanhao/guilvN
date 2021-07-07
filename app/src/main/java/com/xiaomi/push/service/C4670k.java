package com.xiaomi.push.service;

import android.content.Context;
import com.baidu.idl.face.platform.common.ConstantHelper;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.umeng.socialize.handler.UMSSOHandler;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.service.C4611am;
import java.util.Locale;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.k */
public class C4670k {

    /* renamed from: a */
    public final int f13352a;

    /* renamed from: a */
    public final String f13353a;

    /* renamed from: b */
    public final String f13354b;

    /* renamed from: c */
    public final String f13355c;

    /* renamed from: d */
    public final String f13356d;

    /* renamed from: e */
    public final String f13357e;

    /* renamed from: f */
    public final String f13358f;

    public C4670k(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f13353a = str;
        this.f13354b = str2;
        this.f13355c = str3;
        this.f13356d = str4;
        this.f13357e = str5;
        this.f13358f = str6;
        this.f13352a = i;
    }

    /* renamed from: a */
    public static boolean m14136a() {
        try {
            return C4688t.m14219a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m14137a(Context context) {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName()) && m14136a();
    }

    /* renamed from: b */
    public static boolean m14138b(Context context) {
        return context.getPackageName().equals(MiPushRegistar.PACKAGE_XIAOMI);
    }

    /* renamed from: a */
    public C4611am.C4613b mo42740a(XMPushService xMPushService) {
        C4611am.C4613b bVar = new C4611am.C4613b(xMPushService);
        mo42741a(bVar, xMPushService, xMPushService.mo42633b(), C2756c.f5722a);
        return bVar;
    }

    /* renamed from: a */
    public C4611am.C4613b mo42741a(C4611am.C4613b bVar, Context context, C4658d dVar, String str) {
        bVar.f13184a = context.getPackageName();
        bVar.f13188b = this.f13353a;
        bVar.f13195h = this.f13355c;
        bVar.f13190c = this.f13354b;
        bVar.f13194g = "5";
        bVar.f13191d = "XMPUSH-PASS";
        bVar.f13186a = false;
        bVar.f13192e = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s:%7$s:%8$s,%9$s:%10$s,%11$s:%12$s", "sdk_ver", 38, "cpvn", "3_7_0", "cpvc", 30700, "aapn", m14138b(context) ? C4442g.m12702b(context) : "", "country_code", C4591a.m13848a(context).mo42649b(), UMSSOHandler.REGION, C4591a.m13848a(context).mo42647a());
        bVar.f13193f = String.format("%1$s:%2$s,%3$s:%4$s,%5$s:%6$s,sync:1", ConstantHelper.LOG_APPID, m14138b(context) ? "1000271" : this.f13356d, "locale", Locale.getDefault().toString(), Constants.EXTRA_KEY_MIID, C4688t.m14221a(context));
        if (m14137a(context)) {
            bVar.f13193f += String.format(",%1$s:%2$s", "ab", str);
        }
        bVar.f13183a = dVar;
        return bVar;
    }
}
