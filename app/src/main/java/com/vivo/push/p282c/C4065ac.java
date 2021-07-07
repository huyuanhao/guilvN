package com.vivo.push.p282c;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4121p;
import com.vivo.push.C4158w;
import com.vivo.push.p281b.C4056v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vivo.push.c.ac */
public final class C4065ac extends AbstractC4064ab {
    public C4065ac(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4056v vVar = (C4056v) yVar;
        ArrayList<String> d = vVar.mo40933d();
        List<String> e = vVar.mo40934e();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int h = vVar.mo40932h();
        String g = vVar.mo40931g();
        if (d != null) {
            for (String str : d) {
                if (str.startsWith("ali/")) {
                    arrayList2.add(str.replace("ali/", ""));
                } else if (str.startsWith("tag/")) {
                    arrayList.add(str.replace("tag/", ""));
                }
            }
        }
        if (e != null) {
            for (String str2 : e) {
                if (str2.startsWith("ali/")) {
                    arrayList4.add(str2.replace("ali/", ""));
                } else if (str2.startsWith("tag/")) {
                    arrayList3.add(str2.replace("tag/", ""));
                }
            }
        }
        if (arrayList.size() > 0 || arrayList3.size() > 0) {
            if (arrayList.size() > 0) {
                C4121p.m11080a().mo41104a(arrayList);
            }
            C4121p.m11080a().mo41098a(vVar.mo40931g(), arrayList3.size() > 0 ? 10000 : h);
            C4158w.m11280b(new RunnableC4066ad(this, h, arrayList, arrayList3, g));
        }
        if (arrayList2.size() > 0 || arrayList4.size() > 0) {
            if (arrayList2.size() > 0) {
                C4121p.m11080a().mo41109b((String) arrayList2.get(0));
            }
            C4121p.m11080a().mo41098a(vVar.mo40931g(), h);
            C4158w.m11280b(new RunnableC4067ae(this, h, arrayList2, arrayList4, g));
        }
    }
}
