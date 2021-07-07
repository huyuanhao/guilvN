package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4449gf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.o */
public class C4675o {

    /* renamed from: a */
    public static ArrayList<Pair<String, byte[]>> f13371a = new ArrayList<>();

    /* renamed from: a */
    public static final Map<String, byte[]> f13372a = new HashMap();

    /* renamed from: a */
    public static void m14162a(Context context, int i, String str) {
        synchronized (f13372a) {
            for (String str2 : f13372a.keySet()) {
                m14163a(context, str2, f13372a.get(str2), i, str);
            }
            f13372a.clear();
        }
    }

    /* renamed from: a */
    public static void m14163a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, C4684w.m14208a(str));
    }

    /* renamed from: a */
    public static void m14164a(XMPushService xMPushService) {
        try {
            synchronized (f13372a) {
                for (String str : f13372a.keySet()) {
                    C4684w.m14213a(xMPushService, str, f13372a.get(str));
                }
                f13372a.clear();
            }
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            xMPushService.mo42622a(10, e);
        }
    }

    /* renamed from: a */
    public static void m14165a(String str, byte[] bArr) {
        synchronized (f13372a) {
            f13372a.put(str, bArr);
        }
    }

    /* renamed from: b */
    public static void m14166b(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f13371a) {
                arrayList = f13371a;
                f13371a = new ArrayList<>();
            }
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair<String, byte[]> next = it.next();
                C4684w.m14213a(xMPushService, (String) next.first, (byte[]) next.second);
            }
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            xMPushService.mo42622a(10, e);
        }
    }

    /* renamed from: b */
    public static void m14167b(String str, byte[] bArr) {
        synchronized (f13371a) {
            f13371a.add(new Pair<>(str, bArr));
            if (f13371a.size() > 50) {
                f13371a.remove(0);
            }
        }
    }
}
