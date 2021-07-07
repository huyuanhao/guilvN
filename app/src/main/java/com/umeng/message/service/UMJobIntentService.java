package com.umeng.message.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.HashMap;

public class UMJobIntentService extends JobIntentService {

    /* renamed from: a */
    public static int f10535a = 21000;

    /* renamed from: b */
    public static HashMap<Class<? extends UMJobIntentService>, Integer> f10536b = new HashMap<>();

    /* renamed from: c */
    public static Object f10537c = new Object();

    public static void enqueueWork(Context context, Class<? extends UMJobIntentService> cls, Intent intent) {
        int i;
        synchronized (f10537c) {
            MLog.m9802i("wuchi", "--->>> UMJobIntentService enqueueWork, cla is " + cls.getName());
            if (!(context == null || cls == null)) {
                if (intent != null) {
                    if (!f10536b.containsKey(cls)) {
                        i = f10535a + f10536b.size();
                        f10536b.put(cls, Integer.valueOf(i));
                    } else {
                        i = f10536b.get(cls).intValue();
                    }
                    MLog.m9802i("wuchi", "UMJobIntentService cla jobId is " + i);
                    JobIntentService.enqueueWork(context, cls, i, intent);
                }
            }
        }
    }

    @Override // com.umeng.message.service.JobIntentService
    /* renamed from: a */
    public void mo39680a(Intent intent) {
        MLog.m9802i("wuchi", "--->>> UMJobIntentService onHandleWork");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: java.util.HashMap<java.lang.Class<? extends com.umeng.message.service.UMJobIntentService>, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void enqueueWork(Context context, String str, Intent intent) {
        int i;
        synchronized (f10537c) {
            MLog.m9802i("wuchi", "--->>> UMJobIntentService enqueueWork, className is " + str);
            if (context != null && !TextUtils.isEmpty(str) && intent != null) {
                Class<?> cls = null;
                try {
                    cls = Class.forName(str);
                } catch (ClassNotFoundException unused) {
                }
                if (cls == null) {
                    MLog.m9802i("wuchi", "UMJobIntentService cla == null");
                    return;
                }
                if (!f10536b.containsKey(cls)) {
                    i = f10535a + f10536b.size();
                    f10536b.put(cls, Integer.valueOf(i));
                } else {
                    i = f10536b.get(cls).intValue();
                }
                MLog.m9802i("wuchi", "UMJobIntentService className jobId is " + i);
                JobIntentService.enqueueWork(context, cls, i, intent);
            }
        }
    }
}
