package com.p118pd.sdk;

import com.allen.library.config.OkHttpConfig;
import com.tencent.p269mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0OO0O  reason: case insensitive filesystem */
public class C8628oo0OO0O implements AbstractC8977ooOOoO0O {
    @Override // com.p118pd.sdk.AbstractC8977ooOOoO0O
    public Map<String, String> OooO00o(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(C8912ooOO0o0.Oooo00O, "android");
        map.put("version", C8742oo0oOo00.OooO0Oo(C8625oo0OO00.OooO00o().OooO00o));
        StringBuilder sb = new StringBuilder();
        sb.append(C8742oo0oOo00.OooO0O0(C8625oo0OO00.OooO00o().OooO00o));
        String str = "";
        sb.append(str);
        map.put("versionNumber", sb.toString());
        map.put("mobileTerminal", C8630oo0OO0OO.OooO00o().OooO0o);
        map.put("encrypt", "1");
        if (C9054ooOoOo0.OooO0Oo(C8630oo0OO0OO.OooO00o().OooO0oO)) {
            map.put(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, C8630oo0OO0OO.OooO00o().OooO0oO);
        }
        map.putAll(C8625oo0OO00.OooO00o().m20250OooO00o());
        String OooO0OO = C8630oo0OO0OO.OooO00o().OooO0OO();
        if (C9054ooOoOo0.OooO0Oo(OooO0OO) && map.containsKey(OooO0OO)) {
            str = map.get(OooO0OO);
        }
        return C9046ooOoOOO.OooO00o(C8630oo0OO0OO.OooO00o().OooO0oo, C8630oo0OO0OO.OooO00o().m20254OooO00o(), OooO00o(str), String.valueOf(C8645oo0OOo0o.OooO0O0()), map);
    }

    private String OooO00o(String str) {
        String OooO0O0 = C8630oo0OO0OO.OooO00o().OooO0O0();
        String str2 = C8630oo0OO0OO.OooO00o().OooO0oo;
        if (!C9054ooOoOo0.OooO0Oo(str) || !str2.equals(C9048ooOoOOOo.OooO00o().m20707OooO0O0())) {
            return OooO0O0;
        }
        int OooO00o = C8642oo0OOo0.m20260OooO00o(str);
        int OooO0o = OooO00o % C9048ooOoOOOo.OooO00o().OooO0o();
        int length = OooO00o % (OooO0O0.length() + 1);
        C9048ooOoOOOo.OooO00o().OooO0Oo(OooO0o);
        return OooO0O0.substring(0, length) + str + OooO0O0.substring(length);
    }
}
