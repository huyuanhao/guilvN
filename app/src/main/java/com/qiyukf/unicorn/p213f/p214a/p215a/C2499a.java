package com.qiyukf.unicorn.p213f.p214a.p215a;

import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.AbstractC2378c;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2369a;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.C2374b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.C2371b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.C2372c;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2376b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p208b.C2377c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2500a;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2502b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2504c;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2506d;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2507e;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2511g;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2514h;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2515i;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2519j;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2520k;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2522l;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2523m;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2524n;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2528o;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2530p;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2531q;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2535r;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2537s;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2539t;
import com.qiyukf.unicorn.p213f.p214a.p215a.p216a.C2541u;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2543a;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2544b;
import com.qiyukf.unicorn.p213f.p214a.p215a.p217b.C2545c;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2628x;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a.a.a */
public final class C2499a {

    /* renamed from: b */
    public static C2499a f4964b;

    /* renamed from: a */
    public Map<String, Class<? extends AbstractC2378c>> f4965a = new HashMap();

    public C2499a() {
        m5494a(C2524n.class);
        m5494a(C2531q.class);
        m5494a(C2530p.class);
        m5494a(C2539t.class);
        m5494a(C2502b.class);
        m5494a(C2500a.class);
        m5494a(C2535r.class);
        m5494a(C2541u.class);
        m5494a(C2520k.class);
        m5494a(C2504c.class);
        m5494a(C2628x.class);
        m5494a(C2528o.class);
        m5494a(C2537s.class);
        m5494a(C2515i.class);
        m5494a(C2511g.class);
        m5494a(C2514h.class);
        m5494a(C2371b.class);
        m5494a(C2372c.class);
        m5494a(C2506d.class);
        m5494a(C2507e.class);
        m5494a(C2519j.class);
        m5494a(C2523m.class);
        m5494a(C2522l.class);
        m5494a(C2376b.class);
        m5494a(C2377c.class);
        m5494a(C2545c.class);
        m5494a(C2543a.class);
        m5494a(C2544b.class);
    }

    /* renamed from: a */
    public static C2499a m5493a() {
        if (f4964b == null) {
            f4964b = new C2499a();
        }
        return f4964b;
    }

    /* renamed from: a */
    private void m5494a(Class<? extends AbstractC2378c> cls) {
        AbstractC2551d dVar = (AbstractC2551d) cls.getAnnotation(AbstractC2551d.class);
        if (dVar != null) {
            this.f4965a.put(dVar.mo35943a(), cls);
        }
    }

    /* renamed from: a */
    public final AbstractC2378c mo35760a(C2369a aVar) {
        JSONObject a;
        Class<? extends AbstractC2378c> cls;
        try {
            if (TextUtils.equals(aVar.mo35228a(), "01")) {
                C2541u uVar = new C2541u();
                uVar.mo35924a(aVar.mo35231b());
                uVar.mo35276a(aVar);
                return uVar;
            } else if (!TextUtils.equals(aVar.mo35228a(), AgooConstants.ACK_BODY_NULL) || (cls = this.f4965a.get(C1810b.m3432e((a = C1810b.m3420a(aVar.mo35231b())), "id"))) == null) {
                return null;
            } else {
                AbstractC2378c cVar = (AbstractC2378c) cls.newInstance();
                cVar.fromJson(a);
                cVar.mo35276a(aVar);
                return cVar;
            }
        } catch (Exception e) {
            C1709a.m3015b("BotTemplateParser", "parseNotifyTemplate", e);
            return null;
        }
    }

    /* renamed from: a */
    public final AbstractC2378c mo35761a(C2374b bVar) {
        try {
            JSONObject a = bVar.mo35238a();
            Class<? extends AbstractC2378c> cls = this.f4965a.get(C1810b.m3432e(a, "id"));
            if (cls == null) {
                return null;
            }
            AbstractC2378c cVar = (AbstractC2378c) cls.newInstance();
            cVar.fromJson(a);
            cVar.mo35276a(bVar);
            return cVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
