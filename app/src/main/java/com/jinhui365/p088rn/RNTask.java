package com.jinhui365.p088rn;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8698oo0o00o;
import com.p118pd.sdk.C8651oo0OOooo;
import com.p118pd.sdk.C8700oo0o00oo;
import com.p118pd.sdk.C8701oo0o0O;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;

/* renamed from: com.jinhui365.rn.RNTask */
public class RNTask implements AbstractC8698oo0o00o {
    @Override // com.p118pd.sdk.AbstractC8698oo0o00o
    public void execute(C8700oo0o00oo oo0o00oo) {
        Intent intent = new Intent(oo0o00oo.m20310OooO00o(), MyReactActivity.class);
        Bundle bundle = new Bundle();
        Map<String, Object> taskOptions = oo0o00oo.m20311OooO00o().getTaskOptions();
        for (String str : taskOptions.keySet()) {
            bundle.putAll(C8701oo0o0O.OooO00o(bundle, str, taskOptions.get(str)));
        }
        for (String str2 : oo0o00oo.m20311OooO00o().getParams().keySet()) {
            bundle.putAll(C8701oo0o0O.OooO00o(bundle, str2, oo0o00oo.m20311OooO00o().getParams().get(str2)));
        }
        if (TextUtils.isEmpty(bundle.getString(C8651oo0OOooo.OooO0o)) || !"1".equals(bundle.getString(C8651oo0OOooo.OooO0o))) {
            intent.setFlags(603979776);
        } else {
            intent.setFlags(CommonNetImpl.FLAG_AUTH);
        }
        if (TextUtils.isEmpty(bundle.getString("__EVENT_TYPE__"))) {
            bundle.putString("__EVENT_TYPE__", "push");
        }
        intent.putExtras(bundle);
        oo0o00oo.m20310OooO00o().startActivity(intent);
    }
}
