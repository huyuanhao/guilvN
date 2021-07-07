package com.netease.nis.captcha;

import android.content.Context;
import android.os.Build;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.netease.nis.captcha.C1667f;
import com.p118pd.sdk.C7031o000oo0O;
import java.net.URLEncoder;
import org.json.JSONObject;

/* renamed from: com.netease.nis.captcha.h */
public class C1670h {

    /* renamed from: a */
    public static volatile C1670h f3066a;

    /* renamed from: b */
    public C1671a f3067b = new C1671a();

    /* renamed from: com.netease.nis.captcha.h$OooO00o */
    public class OooO00o implements C1667f.AbstractC1668a {
        public OooO00o() {
        }

        @Override // com.netease.nis.captcha.C1667f.AbstractC1668a
        /* renamed from: a */
        public void mo17691a(int i, String str) {
        }

        @Override // com.netease.nis.captcha.C1667f.AbstractC1668a
        /* renamed from: a */
        public void mo17692a(String str) {
            C1664d.m2931a("%s", "上传统计信息成功");
        }
    }

    /* renamed from: com.netease.nis.captcha.h$a */
    public static class C1671a {

        /* renamed from: a */
        public String f3068a = "captcha";

        /* renamed from: b */
        public String f3069b;

        /* renamed from: c */
        public String f3070c;

        /* renamed from: d */
        public String f3071d = "Android";

        /* renamed from: e */
        public String f3072e;

        /* renamed from: f */
        public String f3073f;

        /* renamed from: g */
        public C1672a f3074g = new C1672a();

        /* renamed from: com.netease.nis.captcha.h$a$a */
        public static class C1672a {

            /* renamed from: a */
            public String f3075a;

            /* renamed from: b */
            public String f3076b;

            /* renamed from: c */
            public String f3077c;

            /* renamed from: d */
            public String f3078d;
        }
    }

    /* renamed from: a */
    public static C1670h m2962a() {
        if (f3066a == null) {
            synchronized (C1670h.class) {
                if (f3066a == null) {
                    f3066a = new C1670h();
                }
            }
        }
        return f3066a;
    }

    /* renamed from: b */
    private String m2963b() {
        StringBuilder sb = new StringBuilder();
        sb.append("pid=");
        sb.append(this.f3067b.f3068a);
        sb.append("&bid=");
        sb.append(this.f3067b.f3069b);
        sb.append("&nts=");
        sb.append(this.f3067b.f3070c);
        sb.append("&tt=");
        sb.append(this.f3067b.f3071d);
        sb.append("&ip=");
        sb.append(this.f3067b.f3072e);
        sb.append("&dns=");
        sb.append(this.f3067b.f3073f);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tc", this.f3067b.f3074g.f3075a);
        jSONObject.put(C7031o000oo0O.OooO0O0, this.f3067b.f3074g.f3076b);
        jSONObject.put(DispatchConstants.VERSION, this.f3067b.f3074g.f3077c);
        jSONObject.put("os", this.f3067b.f3074g.f3078d);
        sb.append("&value=" + URLEncoder.encode(jSONObject.toString(), "utf-8"));
        return URLEncoder.encode(sb.toString(), "utf-8");
    }

    /* renamed from: b */
    private void m2964b(Context context) {
        this.f3067b.f3072e = C1664d.m2935b(context);
        this.f3067b.f3073f = C1664d.m2937c(context);
        C1671a.C1672a aVar = this.f3067b.f3074g;
        aVar.f3076b = Build.MODEL;
        aVar.f3077c = Captcha.SDK_VERSION;
        aVar.f3078d = Build.VERSION.RELEASE;
    }

    /* renamed from: a */
    public void mo17704a(Context context) {
        m2964b(context);
        try {
            String b = m2963b();
            C1667f.m2945a("http://da.dun.163.com/sn.gif?d=" + URLEncoder.encode(b, "utf-8"), new OooO00o());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo17705a(String str, long j, long j2) {
        C1671a aVar = this.f3067b;
        aVar.f3069b = str;
        aVar.f3070c = String.valueOf(j);
        this.f3067b.f3074g.f3075a = String.valueOf(j2);
    }
}
