package com.qiyukf.unicorn.p213f.p214a.p215a.p216a;

import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.p203a.p204a.p205a.p206a.p207a.AbstractC2370a;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2498a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.List;
import org.json.JSONObject;

@AbstractC2551d(mo35943a = "static_union")
/* renamed from: com.qiyukf.unicorn.f.a.a.a.o */
public class C2528o extends AbstractC2370a {
    @AbstractC2548a(mo35940a = "unions")

    /* renamed from: a */
    public List<C2529a> f5064a;

    /* renamed from: com.qiyukf.unicorn.f.a.a.a.o$a */
    public static class C2529a implements AbstractC2498a {
        @AbstractC2548a(mo35940a = "type")

        /* renamed from: a */
        public String f5065a;
        @AbstractC2548a(mo35940a = "detail")

        /* renamed from: b */
        public transient JSONObject f5066b;

        /* renamed from: a */
        public final boolean mo35869a() {
            return TextUtils.equals(this.f5065a, SocializeProtocolConstants.IMAGE);
        }

        /* renamed from: b */
        public final boolean mo35870b() {
            return TextUtils.equals(this.f5065a, "link") && TextUtils.equals(C1810b.m3432e(this.f5066b, "type"), "url");
        }

        /* renamed from: c */
        public final boolean mo35871c() {
            return TextUtils.equals(this.f5065a, "link") && TextUtils.equals(C1810b.m3432e(this.f5066b, "type"), "block");
        }

        /* renamed from: d */
        public final boolean mo35872d() {
            return TextUtils.equals(this.f5065a, "link") && TextUtils.equals(C1810b.m3432e(this.f5066b, "type"), "tel");
        }

        /* renamed from: e */
        public final boolean mo35873e() {
            return TextUtils.equals(this.f5065a, "richText");
        }

        /* renamed from: f */
        public final String mo35874f() {
            return C1810b.m3432e(this.f5066b, "label");
        }

        /* renamed from: g */
        public final String mo35875g() {
            return C1810b.m3432e(this.f5066b, "url");
        }

        /* renamed from: h */
        public final String mo35876h() {
            return C1810b.m3432e(this.f5066b, "target");
        }

        /* renamed from: i */
        public final String mo35877i() {
            return C1810b.m3432e(this.f5066b, "params");
        }
    }

    /* renamed from: c */
    public final List<C2529a> mo35868c() {
        return this.f5064a;
    }
}
