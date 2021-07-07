package com.megvii.meglive_sdk.volley.p107a.p111c;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1594a;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1596b;
import com.megvii.meglive_sdk.volley.p107a.p112d.C1603b;

/* renamed from: com.megvii.meglive_sdk.volley.a.c.a */
public abstract class AbstractC1599a implements AbstractC1596b {

    /* renamed from: a */
    public AbstractC1594a f2824a;

    /* renamed from: b */
    public AbstractC1594a f2825b;

    /* renamed from: c */
    public boolean f2826c;

    /* renamed from: a */
    public final void mo17303a(String str) {
        this.f2824a = str != null ? new C1603b("Content-Type", str) : null;
    }

    /* renamed from: b */
    public final void mo17304b(String str) {
        this.f2825b = str != null ? new C1603b("Content-Encoding", str) : null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f2824a != null) {
            sb.append("Content-Type: ");
            sb.append(this.f2824a.mo17298b());
            sb.append(AbstractC1299b.COMMA);
        }
        if (this.f2825b != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.f2825b.mo17298b());
            sb.append(AbstractC1299b.COMMA);
        }
        long a = mo17300a();
        if (a >= 0) {
            sb.append("Content-Length: ");
            sb.append(a);
            sb.append(AbstractC1299b.COMMA);
        }
        sb.append("Chunked: ");
        sb.append(this.f2826c);
        sb.append(']');
        return sb.toString();
    }
}
