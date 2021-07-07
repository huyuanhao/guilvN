package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.pd.sdk.oOoo0OO  reason: case insensitive filesystem */
public class C8406oOoo0OO {
    public static final String OooO00o = "type";

    public void OooO00o(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(C8379oOoOoOo.OooO0OO(context));
            intent.setPackage(C8379oOoOoOo.OooO00o(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("messageID", str);
            intent.putExtra("type", C8400oOoo00oO.OoooO00);
            context.startService(intent);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO0O0("statisticMessage--Exception" + e.getMessage());
        }
    }
}
