package com.vivo.push.util;

import android.content.Context;

public class NotifyUtil {
    public static BaseNotifyDataAdapter sNotifyData = null;
    public static String sNotifyDataAdapter = "com.vivo.push.util.NotifyDataAdapter";
    public static BaseNotifyLayoutAdapter sNotifyLayout = null;
    public static String sNotifyLayoutAdapter = "com.vivo.push.util.NotifyLayoutAdapter";

    public static BaseNotifyDataAdapter getNotifyDataAdapter(Context context) {
        initAdapter(context);
        return sNotifyData;
    }

    public static BaseNotifyLayoutAdapter getNotifyLayoutAdapter(Context context) {
        initAdapter(context);
        return sNotifyLayout;
    }

    public static Object getObjectByReflect(String str, Object obj) {
        Class<?> cls;
        Object obj2 = null;
        try {
            cls = Class.forName(str);
        } catch (Exception unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                obj2 = cls.newInstance();
            } catch (Exception unused2) {
            }
        }
        return obj2 == null ? obj : obj2;
    }

    public static synchronized void initAdapter(Context context) {
        synchronized (NotifyUtil.class) {
            if (sNotifyData == null) {
                BaseNotifyDataAdapter baseNotifyDataAdapter = (BaseNotifyDataAdapter) getObjectByReflect(sNotifyDataAdapter, new C4139i());
                sNotifyData = baseNotifyDataAdapter;
                baseNotifyDataAdapter.init(context);
            }
            if (sNotifyLayout == null) {
                BaseNotifyLayoutAdapter baseNotifyLayoutAdapter = (BaseNotifyLayoutAdapter) getObjectByReflect(sNotifyLayoutAdapter, new C4140j());
                sNotifyLayout = baseNotifyLayoutAdapter;
                baseNotifyLayoutAdapter.init(context);
            }
        }
    }
}
