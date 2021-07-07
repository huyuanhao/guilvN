package com.qiyukf.unicorn.p213f.p214a.p215a.p216a;

import android.text.TextUtils;
import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.AbstractC2370a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.C2547b;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import java.util.List;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "order_logistic")
/* renamed from: com.qiyukf.unicorn.f.a.a.a.n */
public class C2524n extends AbstractC2370a {
    @AbstractC2548a(mo35940a = "label")

    /* renamed from: a */
    public String f5052a;
    @AbstractC2548a(mo35940a = "title")

    /* renamed from: b */
    public String f5053b;
    @AbstractC2548a(mo35940a = C8412oOoo0OoO.OooO0OO)

    /* renamed from: c */
    public List<C2526b> f5054c;
    @AbstractC2548a(mo35940a = "action")

    /* renamed from: d */
    public C2525a f5055d;

    /* renamed from: e */
    public C2527c f5056e;

    /* renamed from: f */
    public transient boolean f5057f;

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.n$a */
    public static class C2525a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "p_name")

        /* renamed from: a */
        public String f5058a;
        @AbstractC2548a(mo35940a = "target")

        /* renamed from: b */
        public String f5059b;

        /* renamed from: a */
        public final String mo35863a() {
            return this.f5058a;
        }

        /* renamed from: b */
        public final String mo35864b() {
            return this.f5059b;
        }
    }

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.n$b */
    public static class C2526b implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "logistic")

        /* renamed from: a */
        public String f5060a;
        @AbstractC2548a(mo35940a = "timestamp")

        /* renamed from: b */
        public String f5061b;

        /* renamed from: a */
        public final String mo35865a() {
            return this.f5060a;
        }

        /* renamed from: b */
        public final String mo35866b() {
            return this.f5061b;
        }
    }

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.n$c */
    public class C2527c implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "label")

        /* renamed from: b */
        public String f5063b;

        public C2527c() {
        }

        /* renamed from: a */
        public final String mo35867a() {
            return this.f5063b;
        }
    }

    @Override // com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public void afterParse(JSONObject jSONObject) {
        super.afterParse(jSONObject);
        if (!TextUtils.isEmpty(this.f5053b)) {
            C2527c cVar = new C2527c();
            this.f5056e = cVar;
            C2547b.m5680a(cVar, C1810b.m3420a(this.f5053b));
        }
    }

    /* renamed from: c */
    public final String mo35857c() {
        return this.f5052a;
    }

    /* renamed from: d */
    public final C2527c mo35858d() {
        return this.f5056e;
    }

    /* renamed from: e */
    public final List<C2526b> mo35859e() {
        return this.f5054c;
    }

    /* renamed from: f */
    public final C2525a mo35860f() {
        return this.f5055d;
    }

    /* renamed from: g */
    public final boolean mo35861g() {
        return this.f5057f;
    }

    /* renamed from: h */
    public final void mo35862h() {
        this.f5057f = true;
    }
}
