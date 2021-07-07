package com.qiyukf.unicorn.p213f.p214a.p215a.p216a;

import android.text.TextUtils;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.AbstractC2370a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.List;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "bot_form")
/* renamed from: com.qiyukf.unicorn.f.a.a.a.k */
public class C2520k extends AbstractC2370a {
    @AbstractC2548a(mo35940a = "label")

    /* renamed from: a */
    public String f5037a;
    @AbstractC2548a(mo35940a = "params")

    /* renamed from: b */
    public String f5038b;
    @AbstractC2548a(mo35940a = "forms")

    /* renamed from: c */
    public List<C2521a> f5039c;
    @AbstractC2548a(mo35940a = "hasCommit")

    /* renamed from: d */
    public boolean f5040d;

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.k$a */
    public static class C2521a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "id")

        /* renamed from: a */
        public String f5041a;
        @AbstractC2548a(mo35940a = "type")

        /* renamed from: b */
        public String f5042b;
        @AbstractC2548a(mo35940a = "label")

        /* renamed from: c */
        public String f5043c;
        @AbstractC2548a(mo35940a = "required")

        /* renamed from: d */
        public int f5044d;
        @AbstractC2548a(mo35940a = "value")

        /* renamed from: e */
        public Object f5045e;

        /* renamed from: a */
        public final String mo35840a() {
            return this.f5041a;
        }

        /* renamed from: a */
        public final void mo35841a(Object obj) {
            this.f5045e = obj;
        }

        /* renamed from: b */
        public final String mo35842b() {
            return this.f5042b;
        }

        /* renamed from: c */
        public final String mo35843c() {
            return this.f5043c;
        }

        /* renamed from: d */
        public final boolean mo35844d() {
            return this.f5044d == 1;
        }

        /* renamed from: e */
        public final boolean mo35845e() {
            return TextUtils.equals(this.f5042b, SocializeProtocolConstants.IMAGE);
        }

        /* renamed from: f */
        public final Object mo35846f() {
            return this.f5045e;
        }

        /* renamed from: g */
        public final String mo35847g() {
            if (mo35845e()) {
                return null;
            }
            Object obj = this.f5045e;
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        /* renamed from: h */
        public final JSONObject mo35848h() {
            if (!mo35845e()) {
                return null;
            }
            Object obj = this.f5045e;
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            return null;
        }

        /* renamed from: i */
        public final boolean mo35849i() {
            return !mo35844d() || !TextUtils.isEmpty(mo35847g()) || mo35848h() != null;
        }
    }

    /* renamed from: c */
    public final String mo35835c() {
        return this.f5037a;
    }

    /* renamed from: d */
    public final String mo35836d() {
        return this.f5038b;
    }

    /* renamed from: e */
    public final List<C2521a> mo35837e() {
        return this.f5039c;
    }

    /* renamed from: f */
    public final boolean mo35838f() {
        return this.f5040d;
    }

    /* renamed from: g */
    public final void mo35839g() {
        this.f5040d = true;
    }
}
