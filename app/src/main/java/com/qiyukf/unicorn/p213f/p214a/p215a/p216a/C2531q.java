package com.qiyukf.unicorn.p213f.p214a.p215a.p216a;

import com.p118pd.sdk.C8412oOoo0OoO;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.AbstractC2370a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import java.util.List;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "order_list")
/* renamed from: com.qiyukf.unicorn.f.a.a.a.q */
public class C2531q extends AbstractC2370a {
    @AbstractC2548a(mo35940a = "label")

    /* renamed from: a */
    public String f5074a;
    @AbstractC2548a(mo35940a = C8412oOoo0OoO.OooO0OO)

    /* renamed from: b */
    public List<C2533b> f5075b;
    @AbstractC2548a(mo35940a = "action")

    /* renamed from: c */
    public C2532a f5076c;

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.q$a */
    public static class C2532a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "label")

        /* renamed from: a */
        public String f5077a;
        @AbstractC2548a(mo35940a = "target")

        /* renamed from: b */
        public String f5078b;
        @AbstractC2548a(mo35940a = "params")

        /* renamed from: c */
        public String f5079c;

        /* renamed from: a */
        public final String mo35888a() {
            return this.f5077a;
        }

        /* renamed from: b */
        public final String mo35889b() {
            return this.f5078b;
        }

        /* renamed from: c */
        public final String mo35890c() {
            return this.f5079c;
        }
    }

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.q$b */
    public static class C2533b implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "s_name")

        /* renamed from: a */
        public String f5080a;
        @AbstractC2548a(mo35940a = "s_status")

        /* renamed from: b */
        public String f5081b;
        @AbstractC2548a(mo35940a = "goods")

        /* renamed from: c */
        public List<C2534a> f5082c;

        /* renamed from: com.qiyukf.unicorn.f.a.a.a.q$b$a */
        public static class C2534a implements AbstractC2498a {
            @AbstractC2548a(mo35940a = "target")

            /* renamed from: a */
            public String f5083a;
            @AbstractC2548a(mo35940a = "params")

            /* renamed from: b */
            public String f5084b;
            @AbstractC2548a(mo35940a = "p_status")

            /* renamed from: c */
            public String f5085c;
            @AbstractC2548a(mo35940a = "p_img")

            /* renamed from: d */
            public String f5086d;
            @AbstractC2548a(mo35940a = "p_name")

            /* renamed from: e */
            public String f5087e;
            @AbstractC2548a(mo35940a = "p_price")

            /* renamed from: f */
            public String f5088f;
            @AbstractC2548a(mo35940a = "p_count")

            /* renamed from: g */
            public String f5089g;
            @AbstractC2548a(mo35940a = "p_stock")

            /* renamed from: h */
            public String f5090h;
            @AbstractC2548a(mo35940a = "p_url")

            /* renamed from: i */
            public String f5091i;

            /* renamed from: j */
            public transient JSONObject f5092j;

            /* renamed from: a */
            public final JSONObject mo35894a() {
                if (this.f5092j == null) {
                    JSONObject jSONObject = new JSONObject();
                    this.f5092j = jSONObject;
                    C1810b.m3425a(jSONObject, "target", this.f5083a);
                    C1810b.m3425a(this.f5092j, "params", this.f5084b);
                    C1810b.m3425a(this.f5092j, "p_status", this.f5085c);
                    C1810b.m3425a(this.f5092j, "p_img", this.f5086d);
                    C1810b.m3425a(this.f5092j, "p_name", this.f5087e);
                    C1810b.m3425a(this.f5092j, "p_price", this.f5088f);
                    C1810b.m3425a(this.f5092j, "p_count", this.f5089g);
                    C1810b.m3425a(this.f5092j, "p_stock", this.f5090h);
                    C1810b.m3425a(this.f5092j, "p_url", this.f5091i);
                }
                return this.f5092j;
            }

            /* renamed from: b */
            public final String mo35895b() {
                return this.f5083a;
            }

            /* renamed from: c */
            public final String mo35896c() {
                return this.f5084b;
            }

            /* renamed from: d */
            public final String mo35897d() {
                return this.f5085c;
            }

            /* renamed from: e */
            public final String mo35898e() {
                return this.f5086d;
            }

            /* renamed from: f */
            public final String mo35899f() {
                return this.f5087e;
            }

            /* renamed from: g */
            public final String mo35900g() {
                return this.f5088f;
            }

            /* renamed from: h */
            public final String mo35901h() {
                return this.f5089g;
            }

            /* renamed from: i */
            public final String mo35902i() {
                return this.f5090h;
            }

            /* renamed from: j */
            public final String mo35903j() {
                return this.f5091i;
            }
        }

        /* renamed from: a */
        public final String mo35891a() {
            return this.f5080a;
        }

        /* renamed from: b */
        public final String mo35892b() {
            return this.f5081b;
        }

        /* renamed from: c */
        public final List<C2534a> mo35893c() {
            return this.f5082c;
        }
    }

    /* renamed from: c */
    public final String mo35885c() {
        return this.f5074a;
    }

    /* renamed from: d */
    public final List<C2533b> mo35886d() {
        return this.f5075b;
    }

    /* renamed from: e */
    public final C2532a mo35887e() {
        return this.f5076c;
    }
}
