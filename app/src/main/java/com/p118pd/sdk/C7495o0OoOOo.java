package com.p118pd.sdk;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0OoOOo  reason: case insensitive filesystem */
public final class C7495o0OoOOo {
    public final String OooO00o;
    public final String OooO0O0;

    public C7495o0OoOOo(String str, String str2) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.OooO00o, this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public JSONObject m19120OooO00o() {
        if (TextUtils.isEmpty(this.OooO0O0)) {
            return null;
        }
        try {
            return new JSONObject(this.OooO0O0);
        } catch (Exception e) {
            C7620o0oOOOoo.m19257OooO00o((Throwable) e);
            return null;
        }
    }
}
