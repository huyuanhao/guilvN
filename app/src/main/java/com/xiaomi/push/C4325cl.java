package com.xiaomi.push;

import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cl */
public class C4325cl {

    /* renamed from: a */
    public int f11506a;

    /* renamed from: a */
    public long f11507a;

    /* renamed from: a */
    public String f11508a;

    /* renamed from: b */
    public int f11509b;

    /* renamed from: b */
    public long f11510b;

    /* renamed from: c */
    public int f11511c;

    /* renamed from: d */
    public int f11512d;

    /* renamed from: e */
    public int f11513e;

    /* renamed from: h */
    public String f11514h;

    public C4325cl() {
    }

    public C4325cl(C4325cl clVar) {
        this.f11507a = clVar.f11507a;
        this.f11506a = clVar.f11506a;
        this.f11514h = clVar.f11514h;
        this.f11509b = clVar.f11509b;
        this.f11511c = clVar.f11511c;
        this.f11510b = clVar.f11510b;
        this.f11512d = clVar.f11512d;
        this.f11508a = clVar.f11508a;
        this.f11513e = clVar.f11513e;
    }

    /* renamed from: a */
    public Bundle mo41592a() {
        Bundle bundle = new Bundle();
        bundle.putLong("id", this.f11507a);
        bundle.putInt("showType", this.f11506a);
        bundle.putInt("nonsense", this.f11509b);
        bundle.putInt("receiveUpperBound", this.f11511c);
        bundle.putLong("lastShowTime", this.f11510b);
        bundle.putInt("multi", this.f11513e);
        return bundle;
    }

    /* renamed from: a */
    public String m11956a() {
        return this.f11508a;
    }

    /* renamed from: a */
    public void mo41593a(String str) {
        this.f11508a = str;
    }

    /* renamed from: a */
    public void mo41594a(JSONObject jSONObject) {
        this.f11507a = jSONObject.optLong("id");
        this.f11506a = jSONObject.optInt("showType");
        this.f11509b = jSONObject.optInt("nonsense");
        this.f11511c = jSONObject.optInt("receiveUpperBound");
        this.f11510b = jSONObject.optLong("lastShowTime");
        this.f11513e = jSONObject.optInt("multi");
    }

    public String toString() {
        return "";
    }
}
