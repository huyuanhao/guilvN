package com.alibaba.sdk.android.beacon;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.beacon.Beacon;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p254ta.utdid2.device.UTDevice;
import com.taobao.accs.common.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.beacon.b */
public final class C0245b {

    /* renamed from: a */
    public static final String f538a = (C0244a.f537a ? "100.67.64.54" : "beacon-api.aliyuncs.com");

    /* renamed from: b */
    public static final String f539b = ("http://" + f538a + "/beacon/fetch/config");

    /* renamed from: a */
    public final Beacon f540a;

    /* renamed from: a */
    public final C0247a f541a;

    /* renamed from: c */
    public final List<Beacon.Config> f542c = new ArrayList();

    /* renamed from: com.alibaba.sdk.android.beacon.b$a */
    public final class C0247a {
        public C0247a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00aa A[SYNTHETIC, Splitter:B:42:0x00aa] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00af A[Catch:{ IOException -> 0x00b2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00b8 A[SYNTHETIC, Splitter:B:49:0x00b8] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00bd A[Catch:{ IOException -> 0x00c0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo3924a(java.lang.String r7, byte[] r8) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.beacon.C0245b.C0247a.mo3924a(java.lang.String, byte[]):java.lang.String");
        }

        /* renamed from: a */
        public boolean mo3925a(int i) {
            return i >= 200 && i < 300;
        }
    }

    /* renamed from: com.alibaba.sdk.android.beacon.b$b */
    public static final class C0248b {

        /* renamed from: a */
        public final Map<String, String> f544a;

        /* renamed from: c */
        public final String f545c;

        /* renamed from: d */
        public final String f546d;

        /* renamed from: e */
        public final String f547e;

        /* renamed from: f */
        public final String f548f;

        /* renamed from: g */
        public final String f549g;

        /* renamed from: h */
        public final String f550h;

        /* renamed from: i */
        public final String f551i;
        public final String mAppKey;
        public final Map<String, String> mExtras;

        /* renamed from: com.alibaba.sdk.android.beacon.b$b$a */
        public static final class C0249a {

            /* renamed from: b */
            public Map<String, String> f552b = new HashMap();

            /* renamed from: j */
            public String f553j;

            /* renamed from: k */
            public String f554k;

            /* renamed from: l */
            public String f555l;

            /* renamed from: m */
            public String f556m;

            /* renamed from: n */
            public String f557n;

            /* renamed from: o */
            public String f558o;

            /* renamed from: p */
            public String f559p;

            /* renamed from: a */
            public C0249a mo3926a(String str) {
                this.f553j = str;
                return this;
            }

            /* renamed from: a */
            public C0249a mo3927a(Map<String, String> map) {
                this.f552b.putAll(map);
                return this;
            }

            /* renamed from: a */
            public C0248b mo3928a() {
                return new C0248b(this);
            }

            /* renamed from: b */
            public C0249a mo3929b(String str) {
                this.f554k = str;
                return this;
            }

            /* renamed from: c */
            public C0249a mo3930c(String str) {
                this.f555l = str;
                return this;
            }

            /* renamed from: d */
            public C0249a mo3931d(String str) {
                this.f556m = str;
                return this;
            }

            /* renamed from: e */
            public C0249a mo3932e(String str) {
                this.f557n = str;
                return this;
            }

            /* renamed from: f */
            public C0249a mo3933f(String str) {
                this.f558o = str;
                return this;
            }

            /* renamed from: g */
            public C0249a mo3934g(String str) {
                this.f559p = str;
                return this;
            }
        }

        public C0248b(C0249a aVar) {
            this.f544a = new TreeMap();
            this.mAppKey = aVar.f553j;
            this.f545c = aVar.f554k;
            this.f546d = aVar.f555l;
            this.f547e = aVar.f556m;
            this.f548f = aVar.f557n;
            this.f549g = aVar.f558o;
            this.f550h = aVar.f559p;
            this.mExtras = aVar.f552b;
            this.f551i = m404a();
        }

        /* renamed from: a */
        private String m404a() {
            this.f544a.put("appKey", this.mAppKey);
            this.f544a.put("appVer", this.f546d);
            this.f544a.put(Constants.KEY_OS_TYPE, this.f547e);
            this.f544a.put("osVer", this.f548f);
            this.f544a.put("deviceId", this.f549g);
            this.f544a.put("beaconVer", this.f550h);
            for (String str : this.mExtras.keySet()) {
                this.f544a.put(str, this.mExtras.get(str));
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : this.f544a.keySet()) {
                sb.append(str2);
                sb.append(this.f544a.get(str2));
            }
            String a = C0250c.m415a(this.f545c, sb.toString());
            this.f544a.put("sign", a);
            return a;
        }
    }

    public C0245b(Beacon beacon) {
        this.f540a = beacon;
        this.f541a = new C0247a();
    }

    /* renamed from: a */
    private C0248b mo3923a(Context context, String str, String str2, Map<String, String> map) {
        return new C0248b.C0249a().mo3926a(str).mo3929b(str2).mo3930c(C0250c.m414a(context)).mo3931d("Android").mo3932e(String.valueOf(Build.VERSION.SDK_INT)).mo3933f(UTDevice.getUtdid(context)).mo3934g("1.0").mo3927a(map).mo3928a();
    }

    /* renamed from: a */
    private String m395a(C0248b bVar) {
        Map<String, String> map = bVar.f544a;
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(encode(str));
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(encode(map.get(str)));
            sb.append("&");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m397a(String str) {
        m399b(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m398a(String str, String str2) {
        this.f540a.mo3908a(new Beacon.Error(str, str2));
    }

    /* renamed from: b */
    private void m399b(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("result")) != null && optJSONArray.length() > 0) {
                this.f542c.clear();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) optJSONArray.get(i);
                    this.f542c.add(new Beacon.Config(jSONObject.optString("key"), jSONObject.optString("value")));
                }
            }
        } catch (Exception unused) {
        }
    }

    private String encode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public List<Beacon.Config> mo3922a() {
        return Collections.unmodifiableList(this.f542c);
    }

    /* renamed from: a */
    public void m401a(Context context, String str, String str2, Map<String, String> map) {
        C0248b a = mo3923a(context, str, str2, map);
        String str3 = f539b + C8932ooOOO0o.OooO0OO + "byappkey";
        Log.i("beacon", "url=" + str3);
        String a2 = this.f541a.mo3924a(str3, m395a(a).getBytes());
        Log.i("beacon", "[fetchByAppKey] result: " + a2);
        m397a(a2);
    }
}
