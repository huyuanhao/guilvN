package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.service.C4611am;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.fm */
public class C4427fm {
    /* renamed from: a */
    public static void m12592a(C4611am.C4613b bVar, String str, AbstractC4435fu fuVar) {
        String str2;
        C4387em.C4390c cVar = new C4387em.C4390c();
        if (!TextUtils.isEmpty(bVar.f13190c)) {
            cVar.mo41726a(bVar.f13190c);
        }
        if (!TextUtils.isEmpty(bVar.f13192e)) {
            cVar.mo41730d(bVar.f13192e);
        }
        if (!TextUtils.isEmpty(bVar.f13193f)) {
            cVar.mo41732e(bVar.f13193f);
        }
        cVar.mo41727b(bVar.f13186a ? "1" : "0");
        if (!TextUtils.isEmpty(bVar.f13191d)) {
            cVar.mo41728c(bVar.f13191d);
        } else {
            cVar.mo41728c("XIAOMI-SASL");
        }
        C4428fn fnVar = new C4428fn();
        fnVar.mo41875c(bVar.f13188b);
        fnVar.mo41866a(Integer.parseInt(bVar.f13194g));
        fnVar.mo41873b(bVar.f13184a);
        fnVar.mo41869a("BIND", (String) null);
        fnVar.mo41868a(fnVar.mo41876e());
        AbstractC4163b.m11301a("[Slim]: bind id=" + fnVar.mo41876e());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put("token", bVar.f13190c);
        hashMap.put("chid", bVar.f13194g);
        hashMap.put("from", bVar.f13188b);
        hashMap.put("id", fnVar.mo41876e());
        hashMap.put("to", "xiaomi.com");
        if (bVar.f13186a) {
            hashMap.put("kick", "1");
        } else {
            hashMap.put("kick", "0");
        }
        if (!TextUtils.isEmpty(bVar.f13192e)) {
            hashMap.put("client_attrs", bVar.f13192e);
        } else {
            hashMap.put("client_attrs", "");
        }
        if (!TextUtils.isEmpty(bVar.f13193f)) {
            hashMap.put("cloud_attrs", bVar.f13193f);
        } else {
            hashMap.put("cloud_attrs", "");
        }
        if (bVar.f13191d.equals("XIAOMI-PASS") || bVar.f13191d.equals("XMPUSH-PASS")) {
            str2 = C4283bd.m11795a(bVar.f13191d, null, hashMap, bVar.f13195h);
        } else {
            bVar.f13191d.equals("XIAOMI-SASL");
            str2 = null;
        }
        cVar.mo41734f(str2);
        fnVar.mo41871a(cVar.m12147a(), (String) null);
        fuVar.mo41894b(fnVar);
    }

    /* renamed from: a */
    public static void m12593a(String str, String str2, AbstractC4435fu fuVar) {
        C4428fn fnVar = new C4428fn();
        fnVar.mo41875c(str2);
        fnVar.mo41866a(Integer.parseInt(str));
        fnVar.mo41869a("UBND", (String) null);
        fuVar.mo41894b(fnVar);
    }
}
