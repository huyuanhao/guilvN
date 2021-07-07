package com.p118pd.sdk;

import android.text.TextUtils;
import com.alipay.sdk.protocol.EnumC0406a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0OoOooO  reason: case insensitive filesystem */
public class C7512o0OoOooO {
    public EnumC0406a OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20358OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String[] f20359OooO00o;

    public C7512o0OoOooO(String str) {
        this.f20358OooO00o = str;
    }

    public static void OooO00o(C7512o0OoOooO o0oooooo) {
        String[] OooO00o2 = o0oooooo.m19154OooO00o();
        if (OooO00o2.length == 3 && TextUtils.equals("tid", OooO00o2[0])) {
            C7518o0Ooo00o OooO00o3 = C7518o0Ooo00o.OooO00o(C7515o0Ooo00.OooO00o().m19156OooO00o());
            if (!TextUtils.isEmpty(OooO00o2[1]) && !TextUtils.isEmpty(OooO00o2[2])) {
                OooO00o3.OooO00o(OooO00o2[1], OooO00o2[2]);
            }
        }
    }

    public static String[] OooO0O0(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.split(C7522o0Ooo0o.OooO0O0);
        }
        return null;
    }

    public C7512o0OoOooO(String str, EnumC0406a aVar) {
        this.f20358OooO00o = str;
        this.OooO00o = aVar;
    }

    public static List<C7512o0OoOooO> OooO00o(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] OooO0O0 = OooO0O0(jSONObject.optString("name", ""));
        for (int i = 0; i < OooO0O0.length; i++) {
            EnumC0406a a = EnumC0406a.m837a(OooO0O0[i]);
            if (a != EnumC0406a.None) {
                C7512o0OoOooO o0oooooo = new C7512o0OoOooO(OooO0O0[i], a);
                o0oooooo.f20359OooO00o = OooO00o(OooO0O0[i]);
                arrayList.add(o0oooooo);
            }
        }
        return arrayList;
    }

    public static String[] OooO00o(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        for (String str2 : str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19153OooO00o() {
        return this.f20358OooO00o;
    }

    public EnumC0406a OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String[] m19154OooO00o() {
        return this.f20359OooO00o;
    }
}
