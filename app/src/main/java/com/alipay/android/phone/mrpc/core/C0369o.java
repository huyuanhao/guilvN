package com.alipay.android.phone.mrpc.core;

import com.umeng.message.util.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* renamed from: com.alipay.android.phone.mrpc.core.o */
public final class C0369o extends AbstractC0374t {

    /* renamed from: b */
    public String f820b;

    /* renamed from: c */
    public byte[] f821c;

    /* renamed from: d */
    public String f822d = HttpRequest.CONTENT_TYPE_FORM;

    /* renamed from: e */
    public ArrayList<Header> f823e = new ArrayList<>();

    /* renamed from: f */
    public Map<String, String> f824f = new HashMap();

    /* renamed from: g */
    public boolean f825g;

    public C0369o(String str) {
        this.f820b = str;
    }

    /* renamed from: a */
    public final String mo4155a() {
        return this.f820b;
    }

    /* renamed from: a */
    public final void mo4156a(String str) {
        this.f822d = str;
    }

    /* renamed from: a */
    public final void mo4157a(String str, String str2) {
        if (this.f824f == null) {
            this.f824f = new HashMap();
        }
        this.f824f.put(str, str2);
    }

    /* renamed from: a */
    public final void mo4158a(Header header) {
        this.f823e.add(header);
    }

    /* renamed from: a */
    public final void mo4159a(boolean z) {
        this.f825g = z;
    }

    /* renamed from: a */
    public final void mo4160a(byte[] bArr) {
        this.f821c = bArr;
    }

    /* renamed from: b */
    public final String mo4161b(String str) {
        Map<String, String> map = this.f824f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: b */
    public final byte[] mo4162b() {
        return this.f821c;
    }

    /* renamed from: c */
    public final String mo4163c() {
        return this.f822d;
    }

    /* renamed from: d */
    public final ArrayList<Header> mo4164d() {
        return this.f823e;
    }

    /* renamed from: e */
    public final boolean mo4165e() {
        return this.f825g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0369o.class != obj.getClass()) {
            return false;
        }
        C0369o oVar = (C0369o) obj;
        byte[] bArr = this.f821c;
        if (bArr == null) {
            if (oVar.f821c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f821c)) {
            return false;
        }
        String str = this.f820b;
        String str2 = oVar.f820b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f824f;
        int hashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f824f.get("id").hashCode() + 31) * 31;
        String str = this.f820b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f820b, this.f823e);
    }
}
