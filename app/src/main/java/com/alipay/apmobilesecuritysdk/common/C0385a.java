package com.alipay.apmobilesecuritysdk.common;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p023e.C0398h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* renamed from: com.alipay.apmobilesecuritysdk.common.a */
public final class C0385a {
    /* renamed from: a */
    public static boolean m746a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0398h.m798e(context));
        return m747a(arrayList) || m747a(new RushTimeUtil$1());
    }

    /* renamed from: a */
    public static boolean m747a(List<String> list) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setLenient(false);
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        try {
            for (String str : list) {
                String[] split = str.split("&");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse2);
                    instance.add(13, random);
                    Date time = instance.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
