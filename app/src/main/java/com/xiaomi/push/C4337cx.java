package com.xiaomi.push;

import android.text.TextUtils;
import com.p118pd.sdk.C7482o0OoO0OO;
import com.umeng.socialize.handler.UMSSOHandler;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cx */
public class C4337cx {

    /* renamed from: a */
    public double f11543a = 0.1d;

    /* renamed from: a */
    public long f11544a;

    /* renamed from: a */
    public String f11545a = "";

    /* renamed from: a */
    public ArrayList<C4350dg> f11546a = new ArrayList<>();

    /* renamed from: b */
    public long f11547b = 86400000;

    /* renamed from: b */
    public String f11548b;

    /* renamed from: c */
    public String f11549c;

    /* renamed from: d */
    public String f11550d;

    /* renamed from: e */
    public String f11551e;

    /* renamed from: f */
    public String f11552f;

    /* renamed from: g */
    public String f11553g;

    /* renamed from: h */
    public String f11554h;

    /* renamed from: i */
    public String f11555i;

    /* renamed from: j */
    public String f11556j = "s.mi1.cc";

    public C4337cx(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11544a = System.currentTimeMillis();
            this.f11546a.add(new C4350dg(str, -1));
            this.f11545a = C4342db.m12029a();
            this.f11548b = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    /* renamed from: c */
    private synchronized void m11985c(String str) {
        Iterator<C4350dg> it = this.f11546a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f11583a, str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C4337cx mo41612a(JSONObject jSONObject) {
        this.f11545a = jSONObject.optString(C7482o0OoO0OO.OooOO0O);
        this.f11547b = jSONObject.getLong("ttl");
        this.f11543a = jSONObject.getDouble("pct");
        this.f11544a = jSONObject.getLong("ts");
        this.f11550d = jSONObject.optString(UMSSOHandler.CITY);
        this.f11549c = jSONObject.optString("prv");
        this.f11553g = jSONObject.optString("cty");
        this.f11551e = jSONObject.optString("isp");
        this.f11552f = jSONObject.optString("ip");
        this.f11548b = jSONObject.optString("host");
        this.f11554h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            mo41618a(new C4350dg().mo41656a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized String mo41613a() {
        if (!TextUtils.isEmpty(this.f11555i)) {
            return this.f11555i;
        } else if (TextUtils.isEmpty(this.f11551e)) {
            return "hardcode_isp";
        } else {
            String a = C4285bf.m11805a(new String[]{this.f11551e, this.f11549c, this.f11550d, this.f11553g, this.f11552f}, "_");
            this.f11555i = a;
            return a;
        }
    }

    /* renamed from: a */
    public synchronized ArrayList<String> m11988a() {
        return mo41615a(false);
    }

    /* renamed from: a */
    public ArrayList<String> mo41614a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (TextUtils.equals(url.getHost(), this.f11548b)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<String> it = mo41615a(true).iterator();
                while (it.hasNext()) {
                    C4339cz a = C4339cz.m12015a(it.next(), url.getPort());
                    arrayList.add(new URL(url.getProtocol(), a.m12018a(), a.mo41636a(), url.getFile()).toString());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    /* renamed from: a */
    public synchronized ArrayList<String> mo41615a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        int size = this.f11546a.size();
        C4350dg[] dgVarArr = new C4350dg[size];
        this.f11546a.toArray(dgVarArr);
        Arrays.sort(dgVarArr);
        arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            C4350dg dgVar = dgVarArr[i];
            if (z) {
                substring = dgVar.f11583a;
            } else {
                int indexOf = dgVar.f11583a.indexOf(Constants.COLON_SEPARATOR);
                substring = indexOf != -1 ? dgVar.f11583a.substring(0, indexOf) : dgVar.f11583a;
            }
            arrayList.add(substring);
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized JSONObject m11991a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(C7482o0OoO0OO.OooOO0O, this.f11545a);
        jSONObject.put("ttl", this.f11547b);
        jSONObject.put("pct", this.f11543a);
        jSONObject.put("ts", this.f11544a);
        jSONObject.put(UMSSOHandler.CITY, this.f11550d);
        jSONObject.put("prv", this.f11549c);
        jSONObject.put("cty", this.f11553g);
        jSONObject.put("isp", this.f11551e);
        jSONObject.put("ip", this.f11552f);
        jSONObject.put("host", this.f11548b);
        jSONObject.put("xf", this.f11554h);
        JSONArray jSONArray = new JSONArray();
        Iterator<C4350dg> it = this.f11546a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo41657a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public void mo41616a(double d) {
        this.f11543a = d;
    }

    /* renamed from: a */
    public void mo41617a(long j) {
        if (j > 0) {
            this.f11547b = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    /* renamed from: a */
    public synchronized void mo41618a(C4350dg dgVar) {
        m11985c(dgVar.f11583a);
        this.f11546a.add(dgVar);
    }

    /* renamed from: a */
    public synchronized void m11995a(String str) {
        mo41618a(new C4350dg(str));
    }

    /* renamed from: a */
    public void mo41619a(String str, int i, long j, long j2, Exception exc) {
        mo41622a(str, new C4336cw(i, j, j2, exc));
    }

    /* renamed from: a */
    public void mo41620a(String str, long j, long j2) {
        try {
            mo41626b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: a */
    public void mo41621a(String str, long j, long j2, Exception exc) {
        try {
            mo41627b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo41622a(String str, C4336cw cwVar) {
        Iterator<C4350dg> it = this.f11546a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4350dg next = it.next();
            if (TextUtils.equals(str, next.f11583a)) {
                next.mo41658a(cwVar);
                break;
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo41623a(String[] strArr) {
        int i;
        int size = this.f11546a.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (TextUtils.equals(this.f11546a.get(size).f11583a, strArr[i])) {
                    this.f11546a.remove(size);
                    break;
                }
                i++;
            }
            size--;
        }
        Iterator<C4350dg> it = this.f11546a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4350dg next = it.next();
            if (next.f11581a > i2) {
                i2 = next.f11581a;
            }
        }
        while (i < strArr.length) {
            mo41618a(new C4350dg(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    /* renamed from: a */
    public boolean m12001a() {
        return TextUtils.equals(this.f11545a, C4342db.m12029a());
    }

    /* renamed from: a */
    public boolean mo41624a(C4337cx cxVar) {
        return TextUtils.equals(this.f11545a, cxVar.f11545a);
    }

    /* renamed from: b */
    public void mo41625b(String str) {
        this.f11556j = str;
    }

    /* renamed from: b */
    public void mo41626b(String str, long j, long j2) {
        mo41619a(str, 0, j, j2, null);
    }

    /* renamed from: b */
    public void mo41627b(String str, long j, long j2, Exception exc) {
        mo41619a(str, -1, j, j2, exc);
    }

    /* renamed from: b */
    public boolean mo41628b() {
        return System.currentTimeMillis() - this.f11544a < this.f11547b;
    }

    /* renamed from: c */
    public boolean mo41629c() {
        long j = this.f11547b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f11544a;
        return currentTimeMillis - j2 > j || (currentTimeMillis - j2 > this.f11547b && this.f11545a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11545a);
        sb.append("\n");
        sb.append(mo41613a());
        Iterator<C4350dg> it = this.f11546a.iterator();
        while (it.hasNext()) {
            sb.append("\n");
            sb.append(it.next().toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
