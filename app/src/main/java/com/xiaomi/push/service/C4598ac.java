package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4285bf;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.xiaomi.push.service.ac */
public class C4598ac {

    /* renamed from: a */
    public static Object f13150a = new Object();

    /* renamed from: a */
    public static Map<String, Queue<String>> f13151a = new HashMap();

    /* renamed from: a */
    public static boolean m13904a(XMPushService xMPushService, String str, String str2) {
        synchronized (f13150a) {
            SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
            Queue<String> queue = f13151a.get(str);
            if (queue == null) {
                String[] split = sharedPreferences.getString(str, "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                LinkedList linkedList = new LinkedList();
                for (String str3 : split) {
                    linkedList.add(str3);
                }
                f13151a.put(str, linkedList);
                queue = linkedList;
            }
            if (queue.contains(str2)) {
                return true;
            }
            queue.add(str2);
            if (queue.size() > 25) {
                queue.poll();
            }
            String a = C4285bf.m11802a(queue, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, a);
            edit.commit();
            return false;
        }
    }
}
