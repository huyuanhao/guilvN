package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4280bb;
import com.xiaomi.push.C4555jq;
import com.xiaomi.push.service.C4635bb;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* renamed from: com.xiaomi.push.hg */
public class C4483hg {

    /* renamed from: a */
    public int f12157a;

    /* renamed from: a */
    public long f12158a;

    /* renamed from: a */
    public C4280bb f12159a = C4280bb.mo41514a();

    /* renamed from: a */
    public C4482hf f12160a;

    /* renamed from: a */
    public String f12161a;

    /* renamed from: a */
    public boolean f12162a = false;

    /* renamed from: com.xiaomi.push.hg$a */
    public static class C4484a {

        /* renamed from: a */
        public static final C4483hg f12163a = new C4483hg();
    }

    /* renamed from: a */
    private C4425fk m12879a(C4280bb.C4281a aVar) {
        if (aVar.f11420a == 0) {
            Object obj = aVar.f11421a;
            if (obj instanceof C4425fk) {
                return (C4425fk) obj;
            }
            return null;
        }
        C4425fk a = m12884a();
        a.mo41825a(EnumC4424fj.CHANNEL_STATS_COUNTER.mo41822a());
        a.mo41835c(aVar.f11420a);
        a.mo41836c(aVar.f11422a);
        return a;
    }

    /* renamed from: a */
    private C4426fl mo41993a(int i) {
        ArrayList arrayList = new ArrayList();
        C4426fl flVar = new C4426fl(this.f12161a, arrayList);
        if (!C4274az.m11737d(this.f12160a.f12149a)) {
            flVar.mo41856a(C4506i.m13055m(this.f12160a.f12149a));
        }
        C4558js jsVar = new C4558js(i);
        AbstractC4549jk a = new C4555jq.C4556a().mo42592a(jsVar);
        try {
            flVar.mo41832b(a);
        } catch (C4542je unused) {
        }
        LinkedList<C4280bb.C4281a> a2 = this.f12159a.m11784a();
        while (true) {
            try {
                if (a2.size() <= 0) {
                    break;
                }
                C4425fk a3 = m12879a(a2.getLast());
                if (a3 != null) {
                    a3.mo41832b(a);
                }
                if (jsVar.mo42596a_() > i) {
                    break;
                }
                if (a3 != null) {
                    arrayList.add(a3);
                }
                a2.removeLast();
            } catch (C4542je | NoSuchElementException unused2) {
            }
        }
        return flVar;
    }

    /* renamed from: a */
    public static C4482hf mo41992a() {
        C4482hf hfVar;
        synchronized (C4484a.f12163a) {
            hfVar = C4484a.f12163a.f12160a;
        }
        return hfVar;
    }

    /* renamed from: a */
    public static C4483hg m12882a() {
        return C4484a.f12163a;
    }

    /* renamed from: a */
    private void m12883a() {
        if (this.f12162a && System.currentTimeMillis() - this.f12158a > ((long) this.f12157a)) {
            this.f12162a = false;
            this.f12158a = 0;
        }
    }

    /* renamed from: a */
    public synchronized C4425fk m12884a() {
        C4425fk fkVar;
        fkVar = new C4425fk();
        fkVar.mo41826a(C4274az.m11726a((Context) this.f12160a.f12149a));
        fkVar.f11909a = 0;
        fkVar.f11913b = 1;
        fkVar.mo41840d((int) (System.currentTimeMillis() / 1000));
        return fkVar;
    }

    /* renamed from: a */
    public synchronized C4426fl m12885a() {
        C4426fl flVar;
        flVar = null;
        if (mo41996b()) {
            int i = 750;
            if (!C4274az.m11737d(this.f12160a.f12149a)) {
                i = 375;
            }
            flVar = mo41993a(i);
        }
        return flVar;
    }

    /* renamed from: a */
    public void m12886a(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.f12157a != i2 || !this.f12162a) {
                this.f12162a = true;
                this.f12158a = System.currentTimeMillis();
                this.f12157a = i2;
                AbstractC4163b.m11305c("enable dot duration = " + i2 + " start = " + this.f12158a);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo41994a(C4425fk fkVar) {
        this.f12159a.mo41515a(fkVar);
    }

    /* renamed from: a */
    public synchronized void mo41995a(XMPushService xMPushService) {
        this.f12160a = new C4482hf(xMPushService);
        this.f12161a = "";
        C4635bb.mo42697a().mo42699a(new C4485hh(this));
    }

    /* renamed from: a */
    public boolean m12889a() {
        return this.f12162a;
    }

    /* renamed from: b */
    public boolean mo41996b() {
        m12883a();
        return this.f12162a && this.f12159a.m11783a() > 0;
    }
}
