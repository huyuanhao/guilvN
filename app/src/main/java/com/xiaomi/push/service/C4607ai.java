package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.C4246ad;
import com.xiaomi.push.C4503hx;
import com.xiaomi.push.C4505hz;
import com.xiaomi.push.C4518il;
import com.xiaomi.push.C4519im;
import com.xiaomi.push.EnumC4500hu;
import com.xiaomi.push.EnumC4501hv;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.ai */
public class C4607ai {
    /* renamed from: a */
    public static int m13932a(C4605ah ahVar, EnumC4500hu huVar) {
        String a = m13933a(huVar);
        int i = 1;
        if (C4608aj.f13167a[huVar.ordinal()] != 1) {
            i = 0;
        }
        return ahVar.f13163a.getInt(a, i);
    }

    /* renamed from: a */
    public static String m13933a(EnumC4500hu huVar) {
        return "oc_version_" + huVar.mo42044a();
    }

    /* renamed from: a */
    public static List<Pair<Integer, Object>> m13934a(List<C4505hz> list, boolean z) {
        if (C4246ad.m11632a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C4505hz hzVar : list) {
            int a = hzVar.mo42067a();
            EnumC4501hv a2 = EnumC4501hv.m12978a(hzVar.mo42070b());
            if (a2 != null) {
                if (!z || !hzVar.f12464a) {
                    int i = C4608aj.f13168b[a2.ordinal()];
                    arrayList.add(i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : new Pair(Integer.valueOf(a), Boolean.valueOf(hzVar.mo42082g())) : new Pair(Integer.valueOf(a), hzVar.m13006a()) : new Pair(Integer.valueOf(a), Long.valueOf(hzVar.m13005a())) : new Pair(Integer.valueOf(a), Integer.valueOf(hzVar.mo42072c())));
                } else {
                    arrayList.add(new Pair(Integer.valueOf(a), null));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m13935a(C4605ah ahVar, EnumC4500hu huVar, int i) {
        ahVar.f13163a.edit().putInt(m13933a(huVar), i).commit();
    }

    /* renamed from: a */
    public static void m13936a(C4605ah ahVar, C4518il ilVar) {
        ahVar.mo42663b(m13934a(ilVar.mo42295a(), true));
        ahVar.mo42662b();
    }

    /* renamed from: a */
    public static void m13937a(C4605ah ahVar, C4519im imVar) {
        for (C4503hx hxVar : imVar.mo42301a()) {
            if (hxVar.mo42057a() > m13932a(ahVar, hxVar.m12994a())) {
                m13935a(ahVar, hxVar.m12994a(), hxVar.mo42057a());
                ahVar.mo42660a(m13934a(hxVar.f12405a, false));
            }
        }
        ahVar.mo42662b();
    }
}
