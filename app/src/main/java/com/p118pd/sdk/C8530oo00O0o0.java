package com.p118pd.sdk;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo00O0o0  reason: case insensitive filesystem */
public class C8530oo00O0o0 implements AbstractC8527oo00O0OO {
    public LinkedList<C8535oo00OO00> OooO00o = new LinkedList<>();

    private void OooO00o(String str) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String replace = split[0].replace("^", Constants.ACCEPT_TIME_SEPARATOR_SP);
        String replace2 = split[1].replace("^", Constants.ACCEPT_TIME_SEPARATOR_SP);
        Long OooO00o2 = AbstractC8531oo00O0oO.OooO00o(split[2]);
        if (!TextUtils.isEmpty(replace) && OooO00o2.longValue() != -1) {
            this.OooO00o.add(new C8535oo00OO00(replace, replace2, OooO00o2.longValue()));
        }
    }

    private void OooO00o(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (string != null && m20199OooO00o(string)) {
                OooO00o(string);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20199OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.split(Constants.ACCEPT_TIME_SEPARATOR_SP).length == 3;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "event data is empty");
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8527oo00O0OO
    /* renamed from: a */
    public void mo30720a(String str) {
        AbstractC8536oo00OO0O.OooO0O0("V1EventsAdapter", "onReport: will report " + this.OooO00o.size() + " events.");
        Iterator<C8535oo00OO00> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            C8548oo00Oo0O.OooO00o(it.next(), str);
        }
        C8548oo00Oo0O.OooO00o(str);
        this.OooO00o.clear();
    }

    @Override // com.p118pd.sdk.AbstractC8527oo00O0OO
    /* renamed from: a */
    public void mo30721a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(C7522o0Ooo0o.OooO0O0);
            for (String str3 : split) {
                if (m20199OooO00o(str3)) {
                    OooO00o(str3);
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8527oo00O0OO
    /* renamed from: b */
    public void mo30722b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.isNull("termination") ? new JSONArray() : jSONObject.getJSONArray("termination");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && optJSONObject.has("e")) {
                        OooO00o(optJSONObject.optJSONArray("e"));
                    }
                }
            } catch (JSONException unused) {
                AbstractC8536oo00OO0O.OooO0Oo("V1EventsAdapter", "Exception occurred in parsing file data.");
            }
        }
    }
}
