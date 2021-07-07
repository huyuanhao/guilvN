package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3416b;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.pd.sdk.oo00O0Oo  reason: case insensitive filesystem */
public class C8528oo00O0Oo implements AbstractRunnableC8546oo00Oo0 {
    public Context OooO00o;
    public String o0ooOOo;

    public C8528oo00O0Oo(Context context, String str) {
        this.OooO00o = context;
        this.o0ooOOo = str;
    }

    private String OooO00o(Context context) {
        return C8524oo00O00o.OooO00o(context, "cached");
    }

    private String OooO00o(SharedPreferences sharedPreferences, String str) {
        return (String) AbstractC8521oo00O00.OooO00o(sharedPreferences, str, (Object) "");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20198OooO00o(Context context) {
        OooO00o(context, "state");
        OooO00o(context, "sessioncontext");
        OooO00o(context, AgooConstants.MESSAGE_FLAG);
        OooO0O0(context);
    }

    private void OooO00o(Context context, String str) {
        SharedPreferences.Editor edit = AbstractC8521oo00O00.OooO00o(context, str).edit();
        edit.clear();
        edit.apply();
    }

    private void OooO00o(AbstractC8527oo00O0OO oo00o0oo, String str, String str2) {
        oo00o0oo.mo30721a(str, this.o0ooOOo);
        oo00o0oo.mo30722b(str2, this.o0ooOOo);
        oo00o0oo.mo30720a(this.o0ooOOo);
    }

    private void OooO00o(String str, String str2, String str3) {
        OooO00o(new C8530oo00O0o0(), str, str3);
        OooO00o(new C8529oo00O0o(), str2, str3);
    }

    private void OooO0O0(Context context) {
        C8524oo00O00o.m20196OooO00o(context, "cached");
    }

    public void OooO00o() {
        String str;
        SharedPreferences OooO00o2 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "state");
        if (OooO00o2 == null) {
            str = "checkAndReportV1Data: get sharedPreference error.";
        } else {
            String OooO00o3 = OooO00o(OooO00o2, C3416b.f8463ao);
            String OooO00o4 = OooO00o(OooO00o2, "activities");
            String OooO00o5 = OooO00o(this.OooO00o);
            m20198OooO00o(this.OooO00o);
            if (!TextUtils.isEmpty(OooO00o3) || !TextUtils.isEmpty(OooO00o4) || !TextUtils.isEmpty(OooO00o5)) {
                OooO00o(OooO00o3, OooO00o4, OooO00o5);
                return;
            }
            str = "checkAndReportV1Data: No cached V1 data found.";
        }
        AbstractC8536oo00OO0O.OooO0O0("V1CompatibleReportTask", str);
    }

    public void run() {
        OooO00o();
    }
}
