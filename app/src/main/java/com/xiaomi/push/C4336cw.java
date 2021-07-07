package com.xiaomi.push;

import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cw */
public class C4336cw {

    /* renamed from: a */
    public int f11538a;

    /* renamed from: a */
    public long f11539a;

    /* renamed from: a */
    public String f11540a;

    /* renamed from: b */
    public long f11541b;

    /* renamed from: c */
    public long f11542c;

    public C4336cw() {
        this(0, 0, 0, null);
    }

    public C4336cw(int i, long j, long j2, Exception exc) {
        this.f11538a = i;
        this.f11539a = j;
        this.f11542c = j2;
        this.f11541b = System.currentTimeMillis();
        if (exc != null) {
            this.f11540a = exc.getClass().getSimpleName();
        }
    }

    /* renamed from: a */
    public int mo41610a() {
        return this.f11538a;
    }

    /* renamed from: a */
    public C4336cw mo41611a(JSONObject jSONObject) {
        this.f11539a = jSONObject.getLong("cost");
        this.f11542c = jSONObject.getLong(FileAttachment.KEY_SIZE);
        this.f11541b = jSONObject.getLong("ts");
        this.f11538a = jSONObject.getInt("wt");
        this.f11540a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a */
    public JSONObject m11984a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f11539a);
        jSONObject.put(FileAttachment.KEY_SIZE, this.f11542c);
        jSONObject.put("ts", this.f11541b);
        jSONObject.put("wt", this.f11538a);
        jSONObject.put("expt", this.f11540a);
        return jSONObject;
    }
}
