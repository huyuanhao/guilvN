package com.alibaba.sdk.android.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alibaba.sdk.android.httpdns.p014b.C0260b;
import java.util.ArrayList;

/* renamed from: com.alibaba.sdk.android.httpdns.l */
public class C0302l {

    /* renamed from: a */
    public static Context f655a;

    /* renamed from: d */
    public static String f656d;

    /* renamed from: d */
    public static boolean f657d;

    /* renamed from: c */
    public static String m542c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f655a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                String typeName = activeNetworkInfo.getTypeName();
                C0299i.m534d("[detectCurrentNetwork] - Network name:" + typeName + " subType name: " + activeNetworkInfo.getSubtypeName());
                return typeName == null ? "None_Network" : typeName;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "None_Network";
    }

    public static void setContext(Context context) {
        if (context != null) {
            f655a = context;
            C03031 r2 = new BroadcastReceiver() {
                /* class com.alibaba.sdk.android.httpdns.C0302l.C03031 */

                public void onReceive(Context context, Intent intent) {
                    try {
                        if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            C0260b.m442b(context);
                            String c = C0302l.m542c();
                            if (c != "None_Network" && !c.equalsIgnoreCase(C0302l.f656d)) {
                                C0299i.m534d("[BroadcastReceiver.onReceive] - Network state changed");
                                ArrayList<String> a = C0271d.mo3973a().m488a();
                                C0271d.mo3973a().clear();
                                C0271d.mo3973a().m489a();
                                if (C0302l.f657d && HttpDns.instance != null) {
                                    C0299i.m534d("[BroadcastReceiver.onReceive] - refresh host");
                                    HttpDns.instance.setPreResolveHosts(a);
                                }
                            }
                            String unused = C0302l.f656d = c;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                f655a.registerReceiver(r2, intentFilter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException("Context can't be null");
        }
    }
}
