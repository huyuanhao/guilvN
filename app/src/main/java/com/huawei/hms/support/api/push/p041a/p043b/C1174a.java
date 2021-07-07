package com.huawei.hms.support.api.push.p041a.p043b;

import android.text.TextUtils;
import com.huawei.hms.support.api.push.p041a.p044c.EnumC1176a;
import com.huawei.hms.support.log.C1202a;
import com.taobao.agoo.p265a.p266a.AbstractC3199b;
import com.umeng.commonsdk.proguard.C3617o;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.support.api.push.a.b.a */
public class C1174a implements Serializable {

    /* renamed from: A */
    public String f1231A;

    /* renamed from: B */
    public String f1232B = "";

    /* renamed from: C */
    public String f1233C;

    /* renamed from: D */
    public String f1234D;

    /* renamed from: E */
    public String f1235E;

    /* renamed from: F */
    public String f1236F;

    /* renamed from: G */
    public String f1237G;

    /* renamed from: H */
    public String f1238H = "";

    /* renamed from: I */
    public int f1239I = 1;

    /* renamed from: J */
    public int f1240J = 0;

    /* renamed from: K */
    public String f1241K;

    /* renamed from: L */
    public String f1242L;

    /* renamed from: M */
    public String f1243M;

    /* renamed from: N */
    public int f1244N = EnumC1176a.STYLE_1.ordinal();

    /* renamed from: O */
    public int f1245O = 0;

    /* renamed from: P */
    public String[] f1246P = null;

    /* renamed from: Q */
    public String[] f1247Q = null;

    /* renamed from: R */
    public String[] f1248R = null;

    /* renamed from: S */
    public int f1249S = 0;

    /* renamed from: T */
    public String[] f1250T = null;

    /* renamed from: U */
    public String f1251U = "";

    /* renamed from: V */
    public String f1252V = "";

    /* renamed from: a */
    public int f1253a = 1;

    /* renamed from: b */
    public String f1254b = "";

    /* renamed from: c */
    public String f1255c = "";

    /* renamed from: d */
    public String f1256d;

    /* renamed from: e */
    public String f1257e;

    /* renamed from: f */
    public String f1258f;

    /* renamed from: g */
    public String f1259g;

    /* renamed from: h */
    public int f1260h;

    /* renamed from: i */
    public String f1261i;

    /* renamed from: j */
    public int f1262j;

    /* renamed from: k */
    public String f1263k;

    /* renamed from: l */
    public int f1264l;

    /* renamed from: m */
    public int f1265m;

    /* renamed from: n */
    public String f1266n;

    /* renamed from: o */
    public String f1267o = "";

    /* renamed from: p */
    public String f1268p = "";

    /* renamed from: q */
    public String f1269q;

    /* renamed from: r */
    public String f1270r = "";

    /* renamed from: s */
    public String f1271s = "";

    /* renamed from: t */
    public String f1272t = "";

    /* renamed from: u */
    public String f1273u = "";

    /* renamed from: v */
    public String f1274v;

    /* renamed from: w */
    public String f1275w;

    /* renamed from: x */
    public String f1276x;

    /* renamed from: y */
    public String f1277y;

    /* renamed from: z */
    public String f1278z;

    public C1174a() {
    }

    /* renamed from: c */
    private void m1178c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("ap")) {
            String string = jSONObject.getString("ap");
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.f1266n = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i = 0; i < length; i++) {
                sb.append("0");
            }
            sb.append(string);
            this.f1266n = sb.toString();
        }
    }

    /* renamed from: d */
    private boolean m1179d(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        if (!jSONObject.has("psContent") || (jSONObject2 = jSONObject.getJSONObject("psContent")) == null) {
            return false;
        }
        this.f1270r = jSONObject2.getString(AbstractC3199b.JSON_CMD);
        if (jSONObject2.has("content")) {
            this.f1271s = jSONObject2.getString("content");
        } else {
            this.f1271s = "";
        }
        if (jSONObject2.has("notifyIcon")) {
            this.f1272t = jSONObject2.getString("notifyIcon");
        } else {
            this.f1272t = "" + this.f1267o;
        }
        if (jSONObject2.has("statusIcon")) {
            this.f1274v = jSONObject2.getString("statusIcon");
        }
        if (jSONObject2.has("notifyTitle")) {
            this.f1273u = jSONObject2.getString("notifyTitle");
        }
        if (jSONObject2.has("notifyParam")) {
            m1185j(jSONObject2);
        }
        if (jSONObject2.has("param")) {
            return m1180e(jSONObject2);
        }
        return false;
    }

    /* renamed from: e */
    private boolean m1180e(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("param");
            if (jSONObject2.has("autoClear")) {
                this.f1260h = jSONObject2.getInt("autoClear");
            } else {
                this.f1260h = 0;
            }
            if (!"app".equals(this.f1270r)) {
                if (!"cosa".equals(this.f1270r)) {
                    if ("email".equals(this.f1270r)) {
                        m1182g(jSONObject2);
                        return true;
                    } else if ("phone".equals(this.f1270r)) {
                        if (jSONObject2.has("phoneNum")) {
                            this.f1277y = jSONObject2.getString("phoneNum");
                            return true;
                        }
                        C1202a.m1316a("PushSelfShowLog", "phoneNum is null");
                        return false;
                    } else if ("url".equals(this.f1270r)) {
                        m1183h(jSONObject2);
                        return true;
                    } else if (!"rp".equals(this.f1270r)) {
                        return true;
                    } else {
                        m1184i(jSONObject2);
                        return true;
                    }
                }
            }
            m1181f(jSONObject2);
            return true;
        } catch (Exception e) {
            C1202a.m1317a("PushSelfShowLog", "ParseParam error ", e);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m1181f(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("acn")) {
            String string = jSONObject.getString("acn");
            this.f1234D = string;
            this.f1261i = string;
        }
        if (jSONObject.has("intentUri")) {
            this.f1261i = jSONObject.getString("intentUri");
        }
        if (jSONObject.has("appPackageName")) {
            this.f1233C = jSONObject.getString("appPackageName");
            return true;
        }
        C1202a.m1316a("PushSelfShowLog", "appPackageName is null");
        return false;
    }

    /* renamed from: g */
    private boolean m1182g(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("emailAddr") || !jSONObject.has("emailSubject")) {
            C1202a.m1316a("PushSelfShowLog", "emailAddr or emailSubject is null");
            return false;
        }
        this.f1278z = jSONObject.getString("emailAddr");
        this.f1231A = jSONObject.getString("emailSubject");
        if (!jSONObject.has("emailContent")) {
            return true;
        }
        this.f1232B = jSONObject.getString("emailContent");
        return true;
    }

    /* renamed from: h */
    private boolean m1183h(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("url")) {
            this.f1235E = jSONObject.getString("url");
            if (jSONObject.has("inBrowser")) {
                this.f1239I = jSONObject.getInt("inBrowser");
            }
            if (jSONObject.has("needUserId")) {
                this.f1240J = jSONObject.getInt("needUserId");
            }
            if (jSONObject.has("sign")) {
                this.f1241K = jSONObject.getString("sign");
            }
            if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
                return true;
            }
            this.f1236F = jSONObject.getString("rpl");
            this.f1237G = jSONObject.getString("rpt");
            if (!jSONObject.has("rpct")) {
                return true;
            }
            this.f1238H = jSONObject.getString("rpct");
            return true;
        }
        C1202a.m1316a("PushSelfShowLog", "url is null");
        return false;
    }

    /* renamed from: i */
    private boolean m1184i(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            C1202a.m1316a("PushSelfShowLog", "rpl or rpt is null");
            return false;
        }
        this.f1236F = jSONObject.getString("rpl");
        this.f1237G = jSONObject.getString("rpt");
        if (jSONObject.has("rpct")) {
            this.f1238H = jSONObject.getString("rpct");
        }
        if (!jSONObject.has("needUserId")) {
            return true;
        }
        this.f1240J = jSONObject.getInt("needUserId");
        return true;
    }

    /* renamed from: j */
    private boolean m1185j(JSONObject jSONObject) {
        C1202a.m1316a("PushSelfShowLog", "enter parseNotifyParam");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("notifyParam");
            if (!jSONObject2.has("style")) {
                return false;
            }
            m1187l(jSONObject2);
            m1186k(jSONObject2);
            return true;
        } catch (JSONException e) {
            C1202a.m1318b("PushSelfShowLog", e.toString());
            return false;
        }
    }

    /* renamed from: k */
    private void m1186k(JSONObject jSONObject) throws JSONException {
        this.f1244N = jSONObject.getInt("style");
        C1202a.m1316a("PushSelfShowLog", "style:" + this.f1244N);
        EnumC1176a aVar = EnumC1176a.STYLE_1;
        int i = this.f1244N;
        if (i >= 0 && i < EnumC1176a.values().length) {
            aVar = EnumC1176a.values()[this.f1244N];
        }
        int i2 = C1175b.f1279a[aVar.ordinal()];
        if (i2 == 1) {
            if (jSONObject.has("iconCount")) {
                this.f1249S = jSONObject.getInt("iconCount");
            }
            int i3 = this.f1249S;
            if (i3 > 0) {
                if (i3 > 6) {
                    this.f1249S = 6;
                }
                C1202a.m1316a("PushSelfShowLog", "iconCount:" + this.f1249S);
                this.f1250T = new String[this.f1249S];
                int i4 = 0;
                while (i4 < this.f1249S) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("icon");
                    int i5 = i4 + 1;
                    sb.append(i5);
                    String sb2 = sb.toString();
                    if (jSONObject.has(sb2)) {
                        this.f1250T[i4] = jSONObject.getString(sb2);
                    }
                    i4 = i5;
                }
            }
        } else if (i2 != 2) {
            if ((i2 == 3 || i2 == 4) && jSONObject.has("bigPic")) {
                this.f1252V = jSONObject.getString("bigPic");
                C1202a.m1316a("PushSelfShowLog", "bigPicUrl:" + this.f1252V);
            }
        } else if (jSONObject.has("subTitle")) {
            this.f1251U = jSONObject.getString("subTitle");
            C1202a.m1316a("PushSelfShowLog", "subTitle:" + this.f1251U);
        }
    }

    /* renamed from: l */
    private void m1187l(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("btnCount")) {
            this.f1245O = jSONObject.getInt("btnCount");
        }
        int i = this.f1245O;
        if (i > 0) {
            if (i > 3) {
                this.f1245O = 3;
            }
            C1202a.m1316a("PushSelfShowLog", "btnCount:" + this.f1245O);
            int i2 = this.f1245O;
            this.f1246P = new String[i2];
            this.f1247Q = new String[i2];
            this.f1248R = new String[i2];
            int i3 = 0;
            while (i3 < this.f1245O) {
                StringBuilder sb = new StringBuilder();
                sb.append("btn");
                int i4 = i3 + 1;
                sb.append(i4);
                sb.append("Text");
                String sb2 = sb.toString();
                String str = "btn" + i4 + "Image";
                String str2 = "btn" + i4 + "Event";
                if (jSONObject.has(sb2)) {
                    this.f1246P[i3] = jSONObject.getString(sb2);
                }
                if (jSONObject.has(str)) {
                    this.f1247Q[i3] = jSONObject.getString(str);
                }
                if (jSONObject.has(str2)) {
                    this.f1248R[i3] = jSONObject.getString(str2);
                }
                i3 = i4;
            }
        }
    }

    /* renamed from: a */
    public String mo15662a() {
        C1202a.m1316a("PushSelfShowLog", "msgId =" + this.f1267o);
        return this.f1267o;
    }

    /* renamed from: b */
    public boolean mo15663b() {
        try {
            if (TextUtils.isEmpty(this.f1243M)) {
                C1202a.m1316a("PushSelfShowLog", "token is null");
                return false;
            }
            this.f1263k = this.f1243M;
            if (TextUtils.isEmpty(this.f1242L)) {
                C1202a.m1316a("PushSelfShowLog", "msg is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject(this.f1242L);
            int i = jSONObject.getInt("msgType");
            this.f1262j = i;
            int i2 = 1;
            if (i != 1) {
                C1202a.m1316a("PushSelfShowLog", "not a selefShowMsg");
                return false;
            }
            m1176a(jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject("msgContent");
            if (jSONObject2 == null) {
                C1202a.m1318b("PushSelfShowLog", "msgObj == null");
                return false;
            } else if (!m1177b(jSONObject2)) {
                return false;
            } else {
                if (jSONObject2.has("dispPkgName")) {
                    this.f1268p = jSONObject2.getString("dispPkgName");
                }
                this.f1265m = jSONObject2.has("rtn") ? jSONObject2.getInt("rtn") : 1;
                if (jSONObject2.has("fm")) {
                    i2 = jSONObject2.getInt("fm");
                }
                this.f1264l = i2;
                m1178c(jSONObject2);
                if (jSONObject2.has("extras")) {
                    this.f1269q = jSONObject2.getJSONArray("extras").toString();
                }
                return m1179d(jSONObject2);
            }
        } catch (JSONException unused) {
            C1202a.m1316a("PushSelfShowLog", "parse message exception.");
            return false;
        } catch (Exception e) {
            C1202a.m1316a("PushSelfShowLog", e.toString());
            return false;
        }
    }

    /* renamed from: m */
    public String mo15674m() {
        return this.f1272t;
    }

    /* renamed from: n */
    public String mo15675n() {
        return this.f1273u;
    }

    /* renamed from: o */
    public String mo15676o() {
        return this.f1277y;
    }

    /* renamed from: p */
    public String mo15677p() {
        return this.f1278z;
    }

    /* renamed from: q */
    public String mo15678q() {
        return this.f1231A;
    }

    /* renamed from: r */
    public String mo15679r() {
        return this.f1232B;
    }

    /* renamed from: s */
    public String mo15680s() {
        return this.f1233C;
    }

    /* renamed from: t */
    public String mo15681t() {
        return this.f1234D;
    }

    /* renamed from: u */
    public int mo15682u() {
        return this.f1244N;
    }

    /* renamed from: v */
    public String[] mo15683v() {
        return this.f1246P;
    }

    /* renamed from: w */
    public String[] mo15684w() {
        return this.f1248R;
    }

    /* renamed from: x */
    public String mo15685x() {
        return this.f1251U;
    }

    /* renamed from: a */
    private void m1176a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("group")) {
            this.f1255c = jSONObject.getString("group");
            C1202a.m1316a("PushSelfShowLog", "NOTIFY_GROUP:" + this.f1255c);
        }
        if (jSONObject.has("badgeClass")) {
            this.f1254b = jSONObject.getString("badgeClass");
            C1202a.m1316a("PushSelfShowLog", "BADGE_CLASS:" + this.f1254b);
        }
        if (jSONObject.has("badgeAddNum")) {
            this.f1253a = jSONObject.getInt("badgeAddNum");
            C1202a.m1316a("PushSelfShowLog", "BADGE_ADD_NUM:" + this.f1253a);
        }
    }

    /* renamed from: g */
    public String mo15668g() {
        return this.f1261i;
    }

    /* renamed from: j */
    public String mo15671j() {
        return this.f1269q;
    }

    /* renamed from: f */
    public int mo15667f() {
        return this.f1260h;
    }

    /* renamed from: i */
    public String mo15670i() {
        return this.f1268p;
    }

    /* renamed from: c */
    public byte[] mo15664c() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("autoClear", this.f1260h);
            jSONObject4.put(C3617o.f9366at, this.f1256d);
            jSONObject4.put("r", this.f1257e);
            jSONObject4.put("smsC", this.f1258f);
            jSONObject4.put("mmsUrl", this.f1259g);
            jSONObject4.put("url", this.f1235E);
            jSONObject4.put("inBrowser", this.f1239I);
            jSONObject4.put("needUserId", this.f1240J);
            jSONObject4.put("sign", this.f1241K);
            jSONObject4.put("rpl", this.f1236F);
            jSONObject4.put("rpt", this.f1237G);
            jSONObject4.put("rpct", this.f1238H);
            jSONObject4.put("appPackageName", this.f1233C);
            jSONObject4.put("acn", this.f1234D);
            jSONObject4.put("intentUri", this.f1261i);
            jSONObject4.put("emailAddr", this.f1278z);
            jSONObject4.put("emailSubject", this.f1231A);
            jSONObject4.put("emailContent", this.f1232B);
            jSONObject4.put("phoneNum", this.f1277y);
            jSONObject4.put("replyToSms", this.f1276x);
            jSONObject4.put("smsNum", this.f1275w);
            jSONObject3.put(AbstractC3199b.JSON_CMD, this.f1270r);
            jSONObject3.put("content", this.f1271s);
            jSONObject3.put("notifyIcon", this.f1272t);
            jSONObject3.put("notifyTitle", this.f1273u);
            jSONObject3.put("statusIcon", this.f1274v);
            jSONObject3.put("param", jSONObject4);
            jSONObject2.put("dispPkgName", this.f1268p);
            jSONObject2.put("msgId", this.f1267o);
            jSONObject2.put("fm", this.f1264l);
            jSONObject2.put("ap", this.f1266n);
            jSONObject2.put("rtn", this.f1265m);
            jSONObject2.put("psContent", jSONObject3);
            if (this.f1269q != null && this.f1269q.length() > 0) {
                jSONObject2.put("extras", new JSONArray(this.f1269q));
            }
            jSONObject.put("msgType", this.f1262j);
            jSONObject.put("msgContent", jSONObject2);
            jSONObject.put("group", this.f1255c);
            jSONObject.put("badgeClass", this.f1254b);
            jSONObject.put("badgeAddNum", this.f1253a);
            return jSONObject.toString().getBytes("UTF-8");
        } catch (JSONException unused) {
            C1202a.m1320d("PushSelfShowLog", "getMsgData failed JSONException");
            return new byte[0];
        } catch (UnsupportedEncodingException unused2) {
            C1202a.m1320d("PushSelfShowLog", "getMsgData failed UnsupportedEncodingException");
            return new byte[0];
        }
    }

    /* renamed from: h */
    public String mo15669h() {
        return this.f1266n;
    }

    /* renamed from: d */
    public byte[] mo15665d() {
        try {
            if (this.f1263k != null && this.f1263k.length() > 0) {
                return this.f1263k.getBytes("UTF-8");
            }
        } catch (Exception unused) {
            C1202a.m1319c("PushSelfShowLog", "getToken getByte failed ");
        }
        return new byte[0];
    }

    /* renamed from: e */
    public String mo15666e() {
        return this.f1255c;
    }

    /* renamed from: l */
    public String mo15673l() {
        return this.f1271s;
    }

    /* renamed from: b */
    private boolean m1177b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("msgId")) {
            Object obj = jSONObject.get("msgId");
            if (obj instanceof String) {
                this.f1267o = (String) obj;
                return true;
            } else if (!(obj instanceof Integer)) {
                return true;
            } else {
                this.f1267o = String.valueOf(((Integer) obj).intValue());
                return true;
            }
        } else {
            C1202a.m1318b("PushSelfShowLog", "msgId == null");
            return false;
        }
    }

    /* renamed from: k */
    public String mo15672k() {
        return this.f1270r;
    }

    public C1174a(byte[] bArr, byte[] bArr2) {
        try {
            this.f1242L = new String(bArr, "UTF-8");
            this.f1243M = new String(bArr2, "UTF-8");
        } catch (Exception unused) {
            C1202a.m1320d("PushSelfShowLog", "get msg byte arr error");
        }
    }
}
