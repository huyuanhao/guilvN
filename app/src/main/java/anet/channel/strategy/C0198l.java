package anet.channel.strategy;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.taobao.accs.utl.BaseMonitor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: anet.channel.strategy.l */
public class C0198l {

    /* renamed from: anet.channel.strategy.l$a */
    public static class C0199a {

        /* renamed from: a */
        public final int f414a;

        /* renamed from: b */
        public final String f415b;

        /* renamed from: c */
        public final int f416c;

        /* renamed from: d */
        public final int f417d;

        /* renamed from: e */
        public final int f418e;

        /* renamed from: f */
        public final int f419f;

        /* renamed from: g */
        public final String f420g;

        /* renamed from: h */
        public final String f421h;

        public C0199a(JSONObject jSONObject) {
            this.f414a = jSONObject.optInt("port");
            this.f415b = jSONObject.optString("protocol");
            this.f416c = jSONObject.optInt("cto");
            this.f417d = jSONObject.optInt("rto");
            this.f418e = jSONObject.optInt("retry");
            this.f419f = jSONObject.optInt("heartbeat");
            this.f420g = jSONObject.optString("rtt", "");
            this.f421h = jSONObject.optString("publickey");
        }
    }

    /* renamed from: anet.channel.strategy.l$b */
    public static class C0200b {

        /* renamed from: a */
        public final String f422a;

        /* renamed from: b */
        public final int f423b;

        /* renamed from: c */
        public final String f424c;

        /* renamed from: d */
        public final String f425d;

        /* renamed from: e */
        public final String f426e;

        /* renamed from: f */
        public final String[] f427f;

        /* renamed from: g */
        public final String[] f428g;

        /* renamed from: h */
        public final C0199a[] f429h;

        /* renamed from: i */
        public final C0203e[] f430i;

        /* renamed from: j */
        public final boolean f431j;

        /* renamed from: k */
        public final boolean f432k;

        public C0200b(JSONObject jSONObject) {
            this.f422a = jSONObject.optString("host");
            this.f423b = jSONObject.optInt("ttl");
            this.f424c = jSONObject.optString("safeAisles");
            this.f425d = jSONObject.optString("cname", null);
            this.f426e = jSONObject.optString("unit", null);
            this.f431j = jSONObject.optInt("clear") != 1 ? false : true;
            this.f432k = jSONObject.optBoolean("effectNow");
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f427f = new String[length];
                for (int i = 0; i < length; i++) {
                    this.f427f[i] = optJSONArray.optString(i);
                }
            } else {
                this.f427f = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sips");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                this.f428g = null;
            } else {
                int length2 = optJSONArray2.length();
                this.f428g = new String[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f428g[i2] = optJSONArray2.optString(i2);
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("aisles");
            if (optJSONArray3 != null) {
                int length3 = optJSONArray3.length();
                this.f429h = new C0199a[length3];
                for (int i3 = 0; i3 < length3; i3++) {
                    this.f429h[i3] = new C0199a(optJSONArray3.optJSONObject(i3));
                }
            } else {
                this.f429h = null;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("strategies");
            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                this.f430i = null;
                return;
            }
            int length4 = optJSONArray4.length();
            this.f430i = new C0203e[length4];
            for (int i4 = 0; i4 < length4; i4++) {
                this.f430i[i4] = new C0203e(optJSONArray4.optJSONObject(i4));
            }
        }
    }

    /* renamed from: anet.channel.strategy.l$c */
    public static class C0201c {

        /* renamed from: a */
        public final String f433a;

        /* renamed from: b */
        public final C0203e[] f434b;

        public C0201c(JSONObject jSONObject) {
            this.f433a = jSONObject.optString("host");
            JSONArray optJSONArray = jSONObject.optJSONArray("strategies");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f434b = new C0203e[length];
                for (int i = 0; i < length; i++) {
                    this.f434b[i] = new C0203e(optJSONArray.optJSONObject(i));
                }
                return;
            }
            this.f434b = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$d */
    public static class C0202d {

        /* renamed from: a */
        public final String f435a;

        /* renamed from: b */
        public final C0200b[] f436b;

        /* renamed from: c */
        public final C0201c[] f437c;

        /* renamed from: d */
        public final String f438d;

        /* renamed from: e */
        public final String f439e;

        /* renamed from: f */
        public final int f440f;

        /* renamed from: g */
        public final int f441g;

        /* renamed from: h */
        public final int f442h;

        public C0202d(JSONObject jSONObject) {
            this.f435a = jSONObject.optString("ip");
            this.f438d = jSONObject.optString("uid", null);
            this.f439e = jSONObject.optString("utdid", null);
            this.f440f = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.f441g = jSONObject.optInt("fcl");
            this.f442h = jSONObject.optInt("fct");
            JSONArray optJSONArray = jSONObject.optJSONArray(BaseMonitor.COUNT_POINT_DNS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f436b = new C0200b[length];
                for (int i = 0; i < length; i++) {
                    this.f436b[i] = new C0200b(optJSONArray.optJSONObject(i));
                }
            } else {
                this.f436b = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.f437c = new C0201c[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f437c[i2] = new C0201c(optJSONArray2.optJSONObject(i2));
                }
                return;
            }
            this.f437c = null;
        }
    }

    /* renamed from: anet.channel.strategy.l$e */
    public static class C0203e {

        /* renamed from: a */
        public final String f443a;

        /* renamed from: b */
        public final C0199a f444b;

        /* renamed from: c */
        public final String f445c;

        public C0203e(JSONObject jSONObject) {
            this.f443a = jSONObject.optString("ip");
            this.f445c = jSONObject.optString("path");
            this.f444b = new C0199a(jSONObject);
        }
    }

    /* renamed from: a */
    public static C0202d m264a(JSONObject jSONObject) {
        try {
            return new C0202d(jSONObject);
        } catch (Exception e) {
            ALog.m288e("StrategyResultParser", "Parse HttpDns response failed.", null, e, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
