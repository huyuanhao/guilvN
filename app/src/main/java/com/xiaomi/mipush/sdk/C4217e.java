package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.service.C4605ah;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.e */
public class C4217e implements AbstractPushManager {

    /* renamed from: a */
    public static volatile C4217e f11298a;

    /* renamed from: a */
    public Context f11299a;

    /* renamed from: a */
    public PushConfiguration f11300a;

    /* renamed from: a */
    public Map<EnumC4216d, AbstractPushManager> f11301a = new HashMap();

    /* renamed from: a */
    public boolean f11302a = false;

    public C4217e(Context context) {
        this.f11299a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4217e m11541a(Context context) {
        if (f11298a == null) {
            synchronized (C4217e.class) {
                if (f11298a == null) {
                    f11298a = new C4217e(context);
                }
            }
        }
        return f11298a;
    }

    /* renamed from: a */
    private void m11542a() {
        AbstractPushManager a;
        AbstractPushManager a2;
        AbstractPushManager a3;
        AbstractPushManager a4;
        PushConfiguration pushConfiguration = this.f11300a;
        if (pushConfiguration != null) {
            if (pushConfiguration.getOpenHmsPush()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.f11300a.getOpenHmsPush() + " HW online switch : " + C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + EnumC4195an.HUAWEI.equals(C4226m.m11575a(this.f11299a)));
                AbstractC4163b.m11301a(sb.toString());
            }
            if (this.f11300a.getOpenHmsPush() && C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_HUAWEI) && EnumC4195an.HUAWEI.equals(C4226m.m11575a(this.f11299a))) {
                if (!m11549a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI)) {
                    EnumC4216d dVar = EnumC4216d.ASSEMBLE_PUSH_HUAWEI;
                    mo41449a(dVar, C4199ar.m11417a(this.f11299a, dVar));
                }
                AbstractC4163b.m11305c("hw manager add to list");
            } else if (m11549a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI) && (a4 = mo41447a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI)) != null) {
                m11547a(EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
                a4.unregister();
            }
            if (this.f11300a.getOpenFCMPush()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.f11300a.getOpenFCMPush() + " FCM online switch : " + C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + C4226m.m11577a(this.f11299a));
                AbstractC4163b.m11301a(sb2.toString());
            }
            if (this.f11300a.getOpenFCMPush() && C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_FCM) && C4226m.m11577a(this.f11299a)) {
                if (!m11549a(EnumC4216d.ASSEMBLE_PUSH_FCM)) {
                    EnumC4216d dVar2 = EnumC4216d.ASSEMBLE_PUSH_FCM;
                    mo41449a(dVar2, C4199ar.m11417a(this.f11299a, dVar2));
                }
                AbstractC4163b.m11305c("fcm manager add to list");
            } else if (m11549a(EnumC4216d.ASSEMBLE_PUSH_FCM) && (a3 = mo41447a(EnumC4216d.ASSEMBLE_PUSH_FCM)) != null) {
                m11547a(EnumC4216d.ASSEMBLE_PUSH_FCM);
                a3.unregister();
            }
            if (this.f11300a.getOpenCOSPush()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.f11300a.getOpenCOSPush() + " COS online switch : " + C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_COS) + " COS isSupport : " + C4226m.m11578b(this.f11299a));
                AbstractC4163b.m11301a(sb3.toString());
            }
            if (this.f11300a.getOpenCOSPush() && C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_COS) && C4226m.m11578b(this.f11299a)) {
                EnumC4216d dVar3 = EnumC4216d.ASSEMBLE_PUSH_COS;
                mo41449a(dVar3, C4199ar.m11417a(this.f11299a, dVar3));
            } else if (m11549a(EnumC4216d.ASSEMBLE_PUSH_COS) && (a2 = mo41447a(EnumC4216d.ASSEMBLE_PUSH_COS)) != null) {
                m11547a(EnumC4216d.ASSEMBLE_PUSH_COS);
                a2.unregister();
            }
            if (this.f11300a.getOpenFTOSPush() && C4220h.m11564a(this.f11299a, EnumC4216d.ASSEMBLE_PUSH_FTOS) && C4226m.m11579c(this.f11299a)) {
                EnumC4216d dVar4 = EnumC4216d.ASSEMBLE_PUSH_FTOS;
                mo41449a(dVar4, C4199ar.m11417a(this.f11299a, dVar4));
            } else if (m11549a(EnumC4216d.ASSEMBLE_PUSH_FTOS) && (a = mo41447a(EnumC4216d.ASSEMBLE_PUSH_FTOS)) != null) {
                m11547a(EnumC4216d.ASSEMBLE_PUSH_FTOS);
                a.unregister();
            }
        }
    }

    /* renamed from: a */
    public AbstractPushManager mo41447a(EnumC4216d dVar) {
        return this.f11301a.get(dVar);
    }

    /* renamed from: a */
    public void mo41448a(PushConfiguration pushConfiguration) {
        this.f11300a = pushConfiguration;
        this.f11302a = C4605ah.m13919a(this.f11299a).mo42661a(EnumC4499ht.AggregatePushSwitch.mo42043a(), true);
        if (this.f11300a.getOpenHmsPush() || this.f11300a.getOpenFCMPush() || this.f11300a.getOpenCOSPush()) {
            C4605ah.m13919a(this.f11299a).mo42659a(new C4218f(this, 101, "assemblePush"));
        }
    }

    /* renamed from: a */
    public void m11547a(EnumC4216d dVar) {
        this.f11301a.remove(dVar);
    }

    /* renamed from: a */
    public void mo41449a(EnumC4216d dVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f11301a.containsKey(dVar)) {
                this.f11301a.remove(dVar);
            }
            this.f11301a.put(dVar, abstractPushManager);
        }
    }

    /* renamed from: a */
    public boolean m11549a(EnumC4216d dVar) {
        return this.f11301a.containsKey(dVar);
    }

    /* renamed from: b */
    public boolean mo41450b(EnumC4216d dVar) {
        int i = C4219g.f11304a[dVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.f11300a;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        } else if (i != 2) {
            if (i == 3) {
                PushConfiguration pushConfiguration2 = this.f11300a;
                if (pushConfiguration2 != null) {
                    z = pushConfiguration2.getOpenCOSPush();
                }
            } else if (i != 4) {
                return false;
            }
            PushConfiguration pushConfiguration3 = this.f11300a;
            return pushConfiguration3 != null ? pushConfiguration3.getOpenFTOSPush() : z;
        } else {
            PushConfiguration pushConfiguration4 = this.f11300a;
            if (pushConfiguration4 != null) {
                return pushConfiguration4.getOpenFCMPush();
            }
            return false;
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        AbstractC4163b.m11301a("ASSEMBLE_PUSH : assemble push register");
        if (this.f11301a.size() <= 0) {
            m11542a();
        }
        if (this.f11301a.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.f11301a.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            C4220h.m11557a(this.f11299a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        AbstractC4163b.m11301a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.f11301a.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.f11301a.clear();
    }
}
