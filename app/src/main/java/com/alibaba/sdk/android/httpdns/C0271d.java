package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.p014b.C0260b;
import com.alibaba.sdk.android.httpdns.p014b.C0261c;
import com.alibaba.sdk.android.httpdns.p014b.C0263e;
import com.alibaba.sdk.android.httpdns.p014b.C0265g;
import com.alibaba.sdk.android.httpdns.probe.AbstractC0316b;
import com.alibaba.sdk.android.httpdns.probe.C0318d;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.alibaba.sdk.android.httpdns.d */
public class C0271d {

    /* renamed from: a */
    public static C0271d f596a = new C0271d();

    /* renamed from: a */
    public static IPProbeService f597a = C0318d.m572a(new AbstractC0316b() {
        /* class com.alibaba.sdk.android.httpdns.C0271d.C02721 */

        @Override // com.alibaba.sdk.android.httpdns.probe.AbstractC0316b
        /* renamed from: a */
        public void mo3978a(String str, String[] strArr) {
            C0292e eVar;
            if (!(str == null || strArr == null || strArr.length == 0 || (eVar = (C0292e) C0271d.f598a.get(str)) == null)) {
                C0292e eVar2 = new C0292e(str, strArr, eVar.mo4013a(), eVar.mo4014b());
                C0271d.f598a.put(str, eVar2);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < eVar2.m520a().length; i++) {
                    sb.append(eVar2.m520a()[i] + Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                C0299i.m536f("optimized host:" + str + ", ip:" + sb.toString());
            }
        }
    });

    /* renamed from: a */
    public static ConcurrentMap<String, C0292e> f598a;

    /* renamed from: a */
    public static ConcurrentSkipListSet<String> f599a;

    public C0271d() {
        f598a = new ConcurrentHashMap();
        f599a = new ConcurrentSkipListSet<>();
    }

    /* renamed from: a */
    public static C0271d mo3973a() {
        return f596a;
    }

    /* renamed from: a */
    private IPProbeItem mo3974a(String str) {
        List<IPProbeItem> list = C0296f.f643a;
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getHostName())) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m483a(C0263e eVar) {
        return (System.currentTimeMillis() / 1000) - C0261c.m445a(eVar.f584j) > 604800;
    }

    /* renamed from: a */
    private boolean mo3975a(String str, C0292e eVar) {
        IPProbeItem a;
        if (eVar == null || eVar.m520a() == null || eVar.m520a().length <= 1 || f597a == null || (a = mo3974a(str)) == null) {
            return false;
        }
        if (f597a.getProbeStatus(str) == IPProbeService.EnumC0314a.PROBING) {
            f597a.stopIPProbeTask(str);
        }
        C0299i.m536f("START PROBE");
        f597a.launchIPProbeTask(str, a.getPort(), eVar.m520a());
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m485b() {
        List<C0263e> a = C0260b.m436a();
        String g = C0260b.m444g();
        for (C0263e eVar : a) {
            if (m483a(eVar)) {
                C0260b.m443b(eVar);
            } else if (g.equals(eVar.f582i)) {
                eVar.f584j = String.valueOf(System.currentTimeMillis() / 1000);
                C0292e eVar2 = new C0292e(eVar);
                f598a.put(eVar.f581h, eVar2);
                C0260b.m443b(eVar);
                mo3975a(eVar.f581h, eVar2);
            }
        }
    }

    /* renamed from: a */
    public int m486a() {
        return f598a.size();
    }

    /* renamed from: a */
    public C0292e m487a(String str) {
        return f598a.get(str);
    }

    /* renamed from: a */
    public ArrayList<String> m488a() {
        return new ArrayList<>(f598a.keySet());
    }

    /* renamed from: a */
    public void m489a() {
        if (C0260b.m441a()) {
            C0266c.m467a().submit(new Runnable() {
                /* class com.alibaba.sdk.android.httpdns.C0271d.RunnableC02732 */

                public void run() {
                    try {
                        C0271d.this.m485b();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m490a(String str) {
        f599a.add(str);
    }

    /* renamed from: a */
    public void m491a(String str, C0292e eVar) {
        ArrayList<C0265g> arrayList;
        f598a.put(str, eVar);
        if (C0260b.m441a()) {
            C0263e a = eVar.m519a();
            ArrayList<C0265g> arrayList2 = a.f579a;
            if ((arrayList2 == null || arrayList2.size() <= 0) && ((arrayList = a.f580b) == null || arrayList.size() <= 0)) {
                C0260b.m443b(a);
            } else {
                C0260b.m439a(a);
            }
        }
        mo3975a(str, eVar);
    }

    /* renamed from: a */
    public boolean m492a(String str) {
        return f599a.contains(str);
    }

    /* renamed from: b */
    public void mo3976b(String str) {
        f599a.remove(str);
    }

    public void clear() {
        f598a.clear();
        f599a.clear();
    }
}
