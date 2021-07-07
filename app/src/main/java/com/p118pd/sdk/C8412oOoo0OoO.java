package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.pd.sdk.oOoo0OoO  reason: case insensitive filesystem */
public class C8412oOoo0OoO {
    public static final int OooO00o = 1017;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21542OooO00o = "type";
    public static final String OooO0O0 = "count";
    public static final String OooO0OO = "list";

    public static void OooO00o(Context context, C8404oOoo0O00 oooo0o00) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(oooo0o00);
        OooO00o(context, linkedList);
    }

    public static void OooO00o(Context context, List<C8404oOoo0O00> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        C8409oOoo0OOo.OooO00o("isSupportStatisticByMcs:" + OooO00o(context) + ",list size:" + linkedList.size());
        if (linkedList.size() > 0 && OooO00o(context)) {
            OooO0O0(context, linkedList);
        }
    }

    public static boolean OooO00o(Context context) {
        String OooO00o2 = C8379oOoOoOo.OooO00o(context);
        return C8415oOoo0o0.m20083OooO00o(context, OooO00o2) && C8415oOoo0o0.OooO00o(context, OooO00o2) >= 1017;
    }

    public static void OooO0O0(Context context, List<C8404oOoo0O00> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(C8379oOoOoOo.OooO0OO(context));
            intent.setPackage(C8379oOoOoOo.OooO00o(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("type", 12291);
            intent.putExtra(OooO0O0, list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            for (C8404oOoo0O00 oooo0o00 : list) {
                arrayList.add(oooo0o00.OooO0o());
            }
            intent.putStringArrayListExtra(OooO0OO, arrayList);
            context.startService(intent);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO0O0("statisticMessage--Exception" + e.getMessage());
        }
    }
}
