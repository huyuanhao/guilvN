package com.p118pd.sdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oOoo00oO  reason: case insensitive filesystem */
public class C8400oOoo00oO extends AbstractC8411oOoo0Oo0 {
    public static final int OooOOoo = 12288;
    public static final int OooOo = 12293;
    public static final int OooOo0 = 12290;
    public static final int OooOo00 = 12289;
    public static final int OooOo0O = 12291;
    public static final int OooOo0o = 12292;
    public static final int OooOoO = 12295;
    public static final int OooOoO0 = 12294;
    public static final int OooOoOO = 12296;
    public static final int OooOoo = 12298;

    /* renamed from: OooOoo  reason: collision with other field name */
    public static final String f21504OooOoo = "alias";
    public static final int OooOoo0 = 12297;

    /* renamed from: OooOoo0  reason: collision with other field name */
    public static final String f21505OooOoo0 = "tags";
    public static final int OooOooO = 12299;

    /* renamed from: OooOooO  reason: collision with other field name */
    public static final String f21506OooOooO = null;
    public static final int OooOooo = 12300;

    /* renamed from: OooOooo  reason: collision with other field name */
    public static final String f21507OooOooo = "code";
    public static final int Oooo = 12311;
    public static final int Oooo0 = 12304;

    /* renamed from: Oooo0  reason: collision with other field name */
    public static final String f21508Oooo0 = "registerID";
    public static final int Oooo000 = 12301;

    /* renamed from: Oooo000  reason: collision with other field name */
    public static final String f21509Oooo000 = "command";
    public static final int Oooo00O = 12302;

    /* renamed from: Oooo00O  reason: collision with other field name */
    public static final String f21510Oooo00O = "appKey";
    public static final int Oooo00o = 12303;

    /* renamed from: Oooo00o  reason: collision with other field name */
    public static final String f21511Oooo00o = "appSecret";
    public static final int Oooo0O0 = 12305;

    /* renamed from: Oooo0O0  reason: collision with other field name */
    public static final String f21512Oooo0O0 = "sdkVersion";
    public static final int Oooo0OO = 12306;

    /* renamed from: Oooo0OO  reason: collision with other field name */
    public static final String f21513Oooo0OO = "params";
    public static final int Oooo0o = 12308;
    public static final int Oooo0o0 = 12307;

    /* renamed from: Oooo0o0  reason: collision with other field name */
    public static final String f21514Oooo0o0 = "&";
    public static final int Oooo0oO = 12309;
    public static final int Oooo0oo = 12310;
    public static final int OoooO0 = 12313;
    public static final int OoooO00 = 12312;
    public int OooOOo = -2;
    public int OooOOo0;

    /* renamed from: OooOo  reason: collision with other field name */
    public String f21515OooOo;

    /* renamed from: OooOo0O  reason: collision with other field name */
    public String f21516OooOo0O;

    /* renamed from: OooOo0o  reason: collision with other field name */
    public String f21517OooOo0o;

    /* renamed from: OooOoO  reason: collision with other field name */
    public String f21518OooOoO;

    /* renamed from: OooOoO0  reason: collision with other field name */
    public String f21519OooOoO0;

    /* renamed from: OooOoOO  reason: collision with other field name */
    public String f21520OooOoOO;

    public static <T> String OooO00o(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append((Object) t);
            sb.append("&");
        }
        return sb.toString();
    }

    public static List<String> OooO00o(String str) {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("&");
        if (split.length > 0) {
            arrayList = new ArrayList();
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static List<C8407oOoo0OO0> OooO00o(String str, String str2, String str3, String str4) {
        ArrayList arrayList;
        JSONException e;
        ArrayList arrayList2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(str2);
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C8407oOoo0OO0 oooo0oo0 = new C8407oOoo0OO0();
                    oooo0oo0.OooO00o(jSONObject.getString(str4));
                    oooo0oo0.OooO0O0(jSONObject.getString(str3));
                    arrayList.add(oooo0oo0);
                } catch (JSONException e2) {
                    e = e2;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    arrayList = arrayList2;
                    C8409oOoo0OOo.OooO00o("parseToSubscribeResultList--" + arrayList);
                    return arrayList;
                }
            }
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            arrayList = arrayList2;
            C8409oOoo0OOo.OooO00o("parseToSubscribeResultList--" + arrayList);
            return arrayList;
        }
        C8409oOoo0OOo.OooO00o("parseToSubscribeResultList--" + arrayList);
        return arrayList;
    }

    @Override // com.p118pd.sdk.AbstractC8411oOoo0Oo0, com.p118pd.sdk.AbstractC8411oOoo0Oo0
    public int OooO0O0() {
        return 4105;
    }

    public int OooO0OO() {
        return this.OooOOo0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m20068OooO0OO() {
        return this.f21516OooOo0O;
    }

    public void OooO0OO(int i) {
        this.OooOOo0 = i;
    }

    public void OooO0OO(String str) {
        this.f21516OooOo0O = str;
    }

    public int OooO0Oo() {
        return this.OooOOo;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m20069OooO0Oo() {
        return this.f21517OooOo0o;
    }

    public void OooO0Oo(int i) {
        this.OooOOo = i;
    }

    public void OooO0Oo(String str) {
        this.f21517OooOo0o = str;
    }

    public String OooO0o() {
        return this.f21520OooOoOO;
    }

    public void OooO0o(String str) {
        this.f21520OooOoOO = str;
    }

    public String OooO0o0() {
        return this.f21518OooOoO;
    }

    public void OooO0o0(String str) {
        this.f21518OooOoO = str;
    }

    public String OooO0oO() {
        return this.f21515OooOo;
    }

    public void OooO0oO(String str) {
        this.f21515OooOo = str;
    }

    public String OooO0oo() {
        return this.f21519OooOoO0;
    }

    public void OooO0oo(String str) {
        this.f21519OooOoO0 = str;
    }

    public String toString() {
        return "CommandMessage{, mRegisterID='" + this.f21515OooOo + '\'' + ", mSdkVersion='" + this.f21519OooOoO0 + '\'' + ", mCommand=" + this.OooOOo0 + ", mContent='" + this.f21518OooOoO + '\'' + ", mResponseCode=" + this.OooOOo + '}';
    }
}
