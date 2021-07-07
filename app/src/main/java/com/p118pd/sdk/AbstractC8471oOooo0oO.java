package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOooo0oO  reason: case insensitive filesystem */
public abstract class AbstractC8471oOooo0oO implements AbstractC8384oOoOoo00 {
    public static List<AbstractC8411oOoo0Oo0> OooO00o(Context context, Intent intent) {
        AbstractC8411oOoo0Oo0 OooO00o;
        if (intent == null) {
            return null;
        }
        int i = 4096;
        try {
            i = Integer.parseInt(C8419oOoo0oO.OooO00o(intent.getStringExtra("type")));
        } catch (Exception e) {
            C8409oOoo0OOo.OooO0O0("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
        }
        C8409oOoo0OOo.OooO00o("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (AbstractC8384oOoOoo00 oooooo00 : C8379oOoOoOo.OooO00o().m20057OooO00o()) {
            if (!(oooooo00 == null || (OooO00o = oooooo00.OooO00o(context, i, intent)) == null)) {
                arrayList.add(OooO00o);
            }
        }
        return arrayList;
    }

    public abstract AbstractC8411oOoo0Oo0 OooO00o(Intent intent);
}
