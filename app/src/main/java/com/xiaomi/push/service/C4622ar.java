package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.megvii.apo.PhoneFingerManager;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.AbstractC4341da;
import com.xiaomi.push.AbstractC4435fu;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4337cx;
import com.xiaomi.push.C4342db;
import com.xiaomi.push.C4385el;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.C4470gw;
import com.xiaomi.push.C4483hg;
import com.xiaomi.push.C4486hi;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.EnumC4424fj;
import com.xiaomi.push.service.C4635bb;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.service.ar */
public class C4622ar extends C4635bb.AbstractC4636a implements C4342db.AbstractC4343a {

    /* renamed from: a */
    public long f13248a;

    /* renamed from: a */
    public XMPushService f13249a;

    /* renamed from: com.xiaomi.push.service.ar$a */
    public static class C4623a implements C4342db.AbstractC4344b {
        @Override // com.xiaomi.push.C4342db.AbstractC4344b
        /* renamed from: a */
        public String mo41652a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(38));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", C4470gw.m12831a(Build.MODEL + Constants.COLON_SEPARATOR + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(C4688t.m14217a()));
            String builder = buildUpon.toString();
            AbstractC4163b.m11305c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a = C4274az.m11727a(C4688t.m14218a(), url);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C4486hi.m12898a(url.getHost() + Constants.COLON_SEPARATOR + port, (int) currentTimeMillis2, null);
                return a;
            } catch (IOException e) {
                C4486hi.m12898a(url.getHost() + Constants.COLON_SEPARATOR + port, -1, e);
                throw e;
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.ar$b */
    public static class C4624b extends C4342db {
        public C4624b(Context context, AbstractC4341da daVar, C4342db.AbstractC4344b bVar, String str) {
            super(context, daVar, bVar, str);
        }

        @Override // com.xiaomi.push.C4342db
        /* renamed from: a */
        public String mo41641a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (C4483hg.m12882a().m12889a()) {
                    str2 = C4635bb.m14028a();
                }
                return super.mo41641a(arrayList, str, str2, z);
            } catch (IOException e) {
                C4486hi.m12895a(0, EnumC4424fj.GSLB_ERR.mo41822a(), 1, null, C4274az.m11735b(C4342db.f11561a) ? 1 : 0);
                throw e;
            }
        }
    }

    public C4622ar(XMPushService xMPushService) {
        this.f13249a = xMPushService;
    }

    /* renamed from: a */
    public static void m13986a(XMPushService xMPushService) {
        C4622ar arVar = new C4622ar(xMPushService);
        C4635bb.mo42697a().mo42699a(arVar);
        synchronized (C4342db.class) {
            C4342db.m12033a(arVar);
            C4342db.m12032a(xMPushService, null, new C4623a(), "0", "push", "2.2");
        }
    }

    @Override // com.xiaomi.push.C4342db.AbstractC4343a
    /* renamed from: a */
    public C4342db mo41651a(Context context, AbstractC4341da daVar, C4342db.AbstractC4344b bVar, String str) {
        return new C4624b(context, daVar, bVar, str);
    }

    @Override // com.xiaomi.push.service.C4635bb.AbstractC4636a
    /* renamed from: a */
    public void mo42687a(C4385el.C4386a aVar) {
    }

    @Override // com.xiaomi.push.service.C4635bb.AbstractC4636a
    /* renamed from: a */
    public void mo41997a(C4387em.C4389b bVar) {
        C4337cx b;
        if (bVar.m12269b() && bVar.m12266a() && System.currentTimeMillis() - this.f13248a > PhoneFingerManager.PER_HOUR_MILLISECOND) {
            AbstractC4163b.m11301a("fetch bucket :" + bVar.m12266a());
            this.f13248a = System.currentTimeMillis();
            C4342db a = C4342db.mo41642a();
            a.m12040a();
            a.m12046b();
            AbstractC4435fu a2 = this.f13249a.m13792a();
            if (a2 != null && (b = a.mo41644b(a2.m12650a().mo41916c())) != null) {
                ArrayList<String> a3 = b.m11988a();
                boolean z = true;
                Iterator<String> it = a3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().equals(a2.m12651a())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && !a3.isEmpty()) {
                    AbstractC4163b.m11301a("bucket changed, force reconnect");
                    this.f13249a.mo42622a(0, (Exception) null);
                    this.f13249a.mo42630a(false);
                }
            }
        }
    }
}
