package com.qiyukf.basesdk.p120b.p121a.p123b.p126c;

import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.basesdk.b.a.b.c.d */
public final class C1747d {

    /* renamed from: a */
    public String f3200a;

    /* renamed from: b */
    public String f3201b;

    /* renamed from: c */
    public String f3202c;

    /* renamed from: d */
    public int f3203d;

    /* renamed from: a */
    public static C1747d m3167a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C1747d dVar = new C1747d();
        dVar.f3202c = C1810b.m3432e(jSONObject, "bucket");
        dVar.f3201b = C1810b.m3432e(jSONObject, "token");
        dVar.f3200a = C1810b.m3432e(jSONObject, IconCompat.f14005OooO0Oo);
        dVar.f3203d = C1810b.m3427b(jSONObject, FileAttachment.KEY_EXPIRE);
        return dVar;
    }

    /* renamed from: a */
    public static String m3168a(C1747d dVar) {
        return m3170b(dVar).toString();
    }

    /* renamed from: a */
    public static String m3169a(List<C1747d> list) {
        JSONArray jSONArray = new JSONArray();
        for (C1747d dVar : list) {
            JSONObject b = m3170b(dVar);
            if (b != null) {
                jSONArray.put(b);
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: b */
    public static JSONObject m3170b(C1747d dVar) {
        if (dVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        C1810b.m3425a(jSONObject, "bucket", dVar.f3202c);
        C1810b.m3425a(jSONObject, "token", dVar.f3201b);
        C1810b.m3425a(jSONObject, IconCompat.f14005OooO0Oo, dVar.f3200a);
        C1810b.m3422a(jSONObject, FileAttachment.KEY_EXPIRE, dVar.f3203d);
        return jSONObject;
    }

    /* renamed from: d */
    public static List<C1747d> m3171d(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray b = C1810b.m3428b(str);
                for (int i = 0; i < b.length(); i++) {
                    C1747d a = m3167a(b.getJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C1747d m3172e(String str) {
        return m3167a(C1810b.m3420a(str));
    }

    /* renamed from: a */
    public final String mo33933a() {
        return this.f3201b;
    }

    /* renamed from: a */
    public final void mo33934a(int i) {
        this.f3203d = i;
    }

    /* renamed from: a */
    public final void mo33935a(String str) {
        this.f3201b = str;
    }

    /* renamed from: b */
    public final String mo33936b() {
        return this.f3202c;
    }

    /* renamed from: b */
    public final void mo33937b(String str) {
        this.f3202c = str;
    }

    /* renamed from: c */
    public final String mo33938c() {
        return this.f3200a;
    }

    /* renamed from: c */
    public final void mo33939c(String str) {
        this.f3200a = str;
    }
}
