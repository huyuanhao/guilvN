package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.C3681i;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0O0000  reason: case insensitive filesystem */
public class C8588oo0O0000 implements AbstractC8579oo00ooO0 {
    public oo000000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21704OooO00o;

    public C8588oo0O0000(String str) {
        this.f21704OooO00o = str;
        this.OooO00o = new oo000000(str);
    }

    private C8482oOooooOo OooO00o(int i) {
        if (i == 0) {
            return this.OooO00o.OooO0O0();
        }
        if (i == 1) {
            return this.OooO00o.OooO00o();
        }
        if (i == 2) {
            return this.OooO00o.OooO0OO();
        }
        if (i != 3) {
            return null;
        }
        return this.OooO00o.OooO0Oo();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m20235OooO00o(int i) {
        String str;
        if (i != 2) {
            C8482oOooooOo OooO00o2 = OooO00o(i);
            if (OooO00o2 != null && !TextUtils.isEmpty(OooO00o2.m20160OooO0O0())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else if ("_default_config_tag".equals(this.f21704OooO00o)) {
            return true;
        } else {
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", str);
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o() {
        C8582oo00oooO.OooO00o().m20230OooO00o(this.f21704OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(int i, C8573oo00oo oo00oo) {
        C8573oo00oo oo00oo2;
        if (oo00oo == null) {
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.refresh(). Parameter config is null.TAG : %s , TYPE : %d", this.f21704OooO00o, Integer.valueOf(i));
            oo00oo2 = null;
        } else {
            oo00oo2 = new C8573oo00oo(oo00oo);
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.refresh() is executed.TAG : %s , TYPE : %d", this.f21704OooO00o, Integer.valueOf(i));
        if (i == 0) {
            OooO0OO(oo00oo2);
            C8504oo000OO0.OooO00o().m20181OooO00o(this.f21704OooO00o);
        } else if (i == 1) {
            OooO00o(oo00oo2);
        } else if (i == 2) {
            OooO0Oo(oo00oo2);
        } else if (i != 3) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "refresh(): HiAnalyticsType can only be OPERATION ,MAINTAIN or DIFF_PRIVACY.");
        } else {
            OooO0O0(oo00oo2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(int i, String str) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setStrOAID() is executed.TAG : " + this.f21704OooO00o);
        C8482oOooooOo OooO00o2 = OooO00o(i);
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "setOAID(): No related config found.type : %d", Integer.valueOf(i));
            return;
        }
        if (!C8591oo0O00O.OooO00o(C3681i.f9652d, str, 4096)) {
            str = "";
        }
        OooO00o2.OooO0OO(str);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onStreamEvent() is execute.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
        if (C8591oo0O00O.OooO00o(str) || !m20235OooO00o(i)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEventIM() parameters check fail. Nothing will be recorded.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
            return;
        }
        if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEventIM() parameter mapValue will be cleared.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
            linkedHashMap = null;
        }
        C8583oo00oooo.OooO00o().OooO0O0(this.f21704OooO00o, i, str, linkedHashMap);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(int i, Map<String, String> map) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setCommonProp() is executed.TAG : %s , TYPE : %d", this.f21704OooO00o, Integer.valueOf(i));
        if (!C8591oo0O00O.OooO00o(map)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "setCommonProp() parameter mapValue will be cleared.");
            return;
        }
        JSONObject jSONObject = new JSONObject(map);
        C8482oOooooOo OooO00o2 = OooO00o(i);
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "setCommonProp(): No related config found.");
        } else {
            OooO00o2.OooO0o0(String.valueOf(jSONObject));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(int i, boolean z) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setOAIDTrackingFlag() is executed.TAG : %s , TYPE : %d", this.f21704OooO00o, Integer.valueOf(i));
        C8482oOooooOo OooO00o2 = OooO00o(i);
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "setOAIDTrackingFlag(): No related config found.type : %d", Integer.valueOf(i));
        } else {
            OooO00o2.OooO0Oo(z ? "true" : "false");
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(long j) {
        String str;
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "onForeground() is executed。TAG : %s", this.f21704OooO00o);
        C8482oOooooOo OooO0O0 = this.OooO00o.OooO0O0();
        if (OooO0O0 == null) {
            str = "No operConf";
        } else if (OooO0O0.m20159OooO00o()) {
            C8504oo000OO0.OooO00o().OooO0O0(this.f21704OooO00o, j);
            return;
        } else {
            str = "No Session switch is set.";
        }
        AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", str);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(Context context) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onPause() is execute.TAG: " + this.f21704OooO00o);
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "context is null in onPause! Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else if (!m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, context);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    @Deprecated
    public void OooO00o(Context context, int i) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onReport(Context context) is execute.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "context is null in onreport!");
        } else {
            C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, context, i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    @Deprecated
    public void OooO00o(Context context, String str, String str2) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onEvent(eventId, mapValue) is execute.TAG : " + this.f21704OooO00o);
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "context is null in onevent ");
        } else if (C8591oo0O00O.OooO00o(str) || !m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            if (!C8591oo0O00O.OooO00o("value", str2, 65536)) {
                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f21704OooO00o);
                str2 = "";
            }
            C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, context, str, str2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(Context context, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onPause(context,map) is execute.TAG: " + this.f21704OooO00o);
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "context is null in onPause! Nothing will be recorded.");
        } else if (!m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onPause() parameter mapValue will be cleared.TAG: " + this.f21704OooO00o);
                linkedHashMap = null;
            }
            C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, context, linkedHashMap);
        }
    }

    public void OooO00o(C8573oo00oo oo00oo) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f21704OooO00o);
        if (oo00oo == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.OooO00o.OooO00o((C8482oOooooOo) null);
            return;
        }
        this.OooO00o.OooO00o(oo00oo.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO00o(String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onPause(viewName,map) is execute.TAG: " + this.f21704OooO00o);
        if (!m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onPause() URL check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else if (TextUtils.isEmpty(str) || !C8591oo0O00O.OooO00o("viewName", str, "[a-zA-Z_][a-zA-Z0-9. _-]{0,255}")) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onPause() parameter viewName verify failed. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onPause() parameter mapValue will be cleared.TAG: " + this.f21704OooO00o);
                linkedHashMap = null;
            }
            C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, str, linkedHashMap);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0O0(int i, String str) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setUpid() is executed.TAG : " + this.f21704OooO00o);
        C8482oOooooOo OooO00o2 = OooO00o(i);
        if (OooO00o2 == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "setUpid(): No related config found.type : %d ", Integer.valueOf(i));
            return;
        }
        if (!C8591oo0O00O.OooO00o("upid", str, 4096)) {
            str = "";
        }
        OooO00o2.OooO0o(str);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0O0(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onEvent(int type, String eventId, Map<String, String> mapValue) is execute.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
        if (C8591oo0O00O.OooO00o(str) || !m20235OooO00o(i)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEvent() parameters check fail. Nothing will be recorded.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
            return;
        }
        if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEvent() parameter mapValue will be cleared.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
            linkedHashMap = null;
        }
        C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, i, str, linkedHashMap);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0O0(long j) {
        String str;
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "onBackground() is executed.TAG : %s", this.f21704OooO00o);
        C8482oOooooOo OooO0O0 = this.OooO00o.OooO0O0();
        if (OooO0O0 == null) {
            str = "No operConf";
        } else if (OooO0O0.m20159OooO00o()) {
            C8504oo000OO0.OooO00o().m20182OooO00o(this.f21704OooO00o, j);
            return;
        } else {
            str = "No Session switch is set.";
        }
        AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", str);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0O0(Context context) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onResume() is execute.TAG: " + this.f21704OooO00o);
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "context is null in onResume! Nothing will be recorded.");
        } else if (!m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            C8583oo00oooo.OooO00o().OooO0O0(this.f21704OooO00o, context);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0O0(Context context, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onResume(context,map) is execute.TAG: " + this.f21704OooO00o);
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "context is null in onResume! Nothing will be recorded.");
        } else if (!m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() parameter mapValue will be cleared.TAG: " + this.f21704OooO00o);
                linkedHashMap = null;
            }
            C8583oo00oooo.OooO00o().OooO0O0(this.f21704OooO00o, context, linkedHashMap);
        }
    }

    public void OooO0O0(C8573oo00oo oo00oo) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setDiffConf() is executed.TAG : " + this.f21704OooO00o);
        if (oo00oo == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "HiAnalyticsInstanceImpl.setDiffConf(): config for diffPrivacy is null!");
            this.OooO00o.OooO0Oo(null);
            return;
        }
        this.OooO00o.OooO0Oo(oo00oo.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0O0(String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onResume(viewname,map) is execute.TAG: " + this.f21704OooO00o);
        if (!m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else if (TextUtils.isEmpty(str) || !C8591oo0O00O.OooO00o("viewName", str, "[a-zA-Z_][a-zA-Z0-9. _-]{0,255}")) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() parameter viewName verify failed. Nothing will be recorded.TAG: " + this.f21704OooO00o);
        } else {
            if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onResume() parameter mapValue will be cleared.TAG: " + this.f21704OooO00o);
                linkedHashMap = null;
            }
            C8583oo00oooo.OooO00o().OooO0O0(this.f21704OooO00o, str, linkedHashMap);
        }
    }

    public void OooO0OO(C8573oo00oo oo00oo) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f21704OooO00o);
        if (oo00oo == null) {
            this.OooO00o.OooO0O0(null);
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
            return;
        }
        this.OooO00o.OooO0O0(oo00oo.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void OooO0OO(String str, LinkedHashMap<String, String> linkedHashMap) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onEvent(String eventId, Map<String, String> mapValue) is execute.TAG: " + this.f21704OooO00o);
        if (C8591oo0O00O.OooO00o(str) || !m20235OooO00o(0)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f21704OooO00o);
            return;
        }
        if (!C8591oo0O00O.OooO00o(linkedHashMap)) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "onEvent() parameter mapValue will be cleared.TAG: " + this.f21704OooO00o);
            linkedHashMap = null;
        }
        C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, 0, str, linkedHashMap);
    }

    public void OooO0Oo(C8573oo00oo oo00oo) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstanceImpl.setPreInstallConf() is executed.TAG: " + this.f21704OooO00o);
        if (oo00oo == null) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", "HiAnalyticsInstanceImpl.setPreInstallConf(): config for PRE-INSTALL is null!");
            this.OooO00o.OooO0OO(null);
            return;
        }
        this.OooO00o.OooO0OO(oo00oo.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0
    public void onReport(int i) {
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "HiAnalyticsInstance.onReport() is execute.TAG: %s,TYPE: %d", this.f21704OooO00o, Integer.valueOf(i));
        C8583oo00oooo.OooO00o().OooO00o(this.f21704OooO00o, i);
    }
}
