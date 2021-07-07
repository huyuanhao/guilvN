package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.pd.sdk.oo000OOo  reason: case insensitive filesystem */
public class C8506oo000OOo {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21638OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8493oo0000OO[] f21639OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public C8506oo000OOo(Context context, String str, AbstractC8493oo0000OO[] oo0000ooArr, String str2, String str3) {
        this.OooO00o = context;
        this.f21638OooO00o = str;
        this.f21639OooO00o = oo0000ooArr;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
    }

    private void OooO00o(List<AbstractC8496oo0000o0> list, String str, String str2) {
        int size = list.size();
        if (size > 0) {
            while (size > 0) {
                int i = 500;
                if (size <= 500) {
                    i = size;
                }
                int i2 = size - i;
                OooO0O0(list.subList(i2, size), str, str2);
                size = i2;
            }
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "no events to send,TAG : %s,TYPE: %s", str2, str);
    }

    private void OooO00o(AbstractC8493oo0000OO[] oo0000ooArr, String str, String str2) {
        AbstractC8536oo00OO0O.OooO00o("EventDataHandler", "choiceHandleEvents TAG : %s,TYPE: %s", str2, str);
        OooO00o(C8517oo000oOo.OooO00o(oo0000ooArr), str, str2);
    }

    @SafeVarargs
    private final void OooO00o(AbstractC8493oo0000OO[] oo0000ooArr, List<AbstractC8493oo0000OO>... listArr) {
        List<AbstractC8493oo0000OO> list;
        for (AbstractC8493oo0000OO oo0000oo : oo0000ooArr) {
            String OooO0o0 = oo0000oo.OooO0o0();
            if (TextUtils.isEmpty(OooO0o0) || "oper".equals(OooO0o0)) {
                list = listArr[0];
            } else if ("maint".equals(OooO0o0)) {
                list = listArr[1];
            } else if ("preins".equals(OooO0o0)) {
                list = listArr[2];
            } else if ("diffprivacy".equals(OooO0o0)) {
                list = listArr[3];
            }
            list.add(oo0000oo);
        }
    }

    private void OooO0O0(List<AbstractC8496oo0000o0> list, String str, String str2) {
        if (list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            long currentTimeMillis = System.currentTimeMillis();
            long OooO00o2 = ((long) AbstractC8454oOooOoOo.OooO00o(str2, str)) * 86400000;
            for (AbstractC8496oo0000o0 oo0000o0 : list) {
                if (!oo0000o0.mo30660a(currentTimeMillis, OooO00o2)) {
                    C8492oo0000O0 OooO00o3 = oo0000o0.OooO00o();
                    arrayList.add(OooO00o3);
                    jSONArray.put(OooO00o3.OooO00o());
                }
            }
            if (arrayList.size() <= 0 || jSONArray.length() <= 0) {
                AbstractC8536oo00OO0O.OooO0OO("EventDataHandler", "Not have data need to send.TAG : %s,TYPE: %s", str2, str);
                return;
            }
            SharedPreferences OooO00o4 = AbstractC8521oo00O00.OooO00o(this.OooO00o, "backup_event");
            if (!AbstractC8521oo00O00.OooO00o(this.OooO00o, "backup_event", 5242880)) {
                String OooO00o5 = AbstractC8526oo00O0O0.OooO00o(str2, str, this.OooO0OO);
                AbstractC8536oo00OO0O.OooO0O0("EventDataHandler", "Update data cached into backup,spKey: " + OooO00o5);
                AbstractC8521oo00O00.m20194OooO00o(OooO00o4, OooO00o5, (Object) jSONArray.toString());
            } else {
                AbstractC8536oo00OO0O.OooO0O0("EventDataHandler", "backup file reach max limited size, discard new event ");
            }
            C8525oo00O0O.OooO0O0(new C8503oo000OO(this.OooO00o, arrayList, str, str2, this.OooO0O0, this.OooO0OO));
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "empty event data, no need to send,TAG : %s,TYPE: %s", str2, str);
    }

    public void OooO00o() {
        AbstractC8536oo00OO0O.OooO0O0("EventDataHandler", "handler event report...");
        Pair<String, String> OooO00o2 = AbstractC8526oo00O0O0.OooO00o(this.f21638OooO00o);
        if (!"_default_config_tag".equals(OooO00o2.first)) {
            OooO00o(this.f21639OooO00o, (String) OooO00o2.second, (String) OooO00o2.first);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        OooO00o(this.f21639OooO00o, arrayList, arrayList2, arrayList3, arrayList4);
        if (arrayList.size() > 0) {
            OooO00o((AbstractC8493oo0000OO[]) arrayList.toArray(new AbstractC8493oo0000OO[arrayList.size()]), "oper", "_default_config_tag");
        }
        if (arrayList2.size() > 0) {
            OooO00o((AbstractC8493oo0000OO[]) arrayList2.toArray(new AbstractC8493oo0000OO[arrayList2.size()]), "maint", "_default_config_tag");
        }
        if (arrayList3.size() > 0) {
            OooO00o((AbstractC8493oo0000OO[]) arrayList3.toArray(new AbstractC8493oo0000OO[arrayList3.size()]), "preins", "_default_config_tag");
        }
        if (arrayList4.size() > 0) {
            OooO00o((AbstractC8493oo0000OO[]) arrayList4.toArray(new AbstractC8493oo0000OO[arrayList4.size()]), "diffprivacy", "_default_config_tag");
        }
    }
}
