package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4497hr;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.C4693y;
import com.xiaomi.push.EnumC4504hy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.xiaomi.push.service.bf */
public class C4641bf {

    /* renamed from: a */
    public static String f13296a;

    /* renamed from: a */
    public static SimpleDateFormat f13297a;

    /* renamed from: a */
    public static AtomicLong f13298a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f13297a = simpleDateFormat;
        f13296a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public static synchronized String m14054a() {
        String str;
        synchronized (C4641bf.class) {
            String format = f13297a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f13296a, format)) {
                f13298a.set(0);
                f13296a = format;
            }
            str = format + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f13298a.incrementAndGet();
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList<C4520in> m14055a(List<C4498hs> list, String str, String str2, int i) {
        String str3;
        if (list == null) {
            str3 = "requests can not be null in TinyDataHelper.transToThriftObj().";
        } else if (list.size() == 0) {
            str3 = "requests.length is 0 in TinyDataHelper.transToThriftObj().";
        } else {
            ArrayList<C4520in> arrayList = new ArrayList<>();
            C4497hr hrVar = new C4497hr();
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C4498hs hsVar = list.get(i3);
                if (hsVar != null) {
                    int length = C4531iy.m13590a(hsVar).length;
                    if (length > i) {
                        AbstractC4163b.m11306d("TinyData is too big, ignore upload request item:" + hsVar.mo42029d());
                    } else {
                        if (i2 + length > i) {
                            C4520in inVar = new C4520in("-1", false);
                            inVar.mo42321d(str);
                            inVar.mo42314b(str2);
                            inVar.mo42317c(EnumC4504hy.UploadTinyData.f12451a);
                            inVar.mo42311a(C4693y.m14242a(C4531iy.m13590a(hrVar)));
                            arrayList.add(inVar);
                            hrVar = new C4497hr();
                            i2 = 0;
                        }
                        hrVar.mo42010a(hsVar);
                        i2 += length;
                    }
                }
            }
            if (hrVar.mo42008a() != 0) {
                C4520in inVar2 = new C4520in("-1", false);
                inVar2.mo42321d(str);
                inVar2.mo42314b(str2);
                inVar2.mo42317c(EnumC4504hy.UploadTinyData.f12451a);
                inVar2.mo42311a(C4693y.m14242a(C4531iy.m13590a(hrVar)));
                arrayList.add(inVar2);
            }
            return arrayList;
        }
        AbstractC4163b.m11306d(str3);
        return null;
    }

    /* renamed from: a */
    public static void m14056a(Context context, String str, String str2, long j, String str3) {
        C4498hs hsVar = new C4498hs();
        hsVar.mo42028d(str);
        hsVar.mo42024c(str2);
        hsVar.mo42017a(j);
        hsVar.mo42021b(str3);
        hsVar.mo42018a("push_sdk_channel");
        hsVar.mo42035g(context.getPackageName());
        hsVar.mo42030e(context.getPackageName());
        hsVar.mo42019a(true);
        hsVar.mo42020b(System.currentTimeMillis());
        hsVar.mo42033f(m14054a());
        C4642bg.m14059a(context, hsVar);
    }

    /* renamed from: a */
    public static boolean m14057a(C4498hs hsVar, boolean z) {
        String str;
        if (hsVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(hsVar.f12262a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hsVar.f12269d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hsVar.f12268c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!C4285bf.m11807a(hsVar.f12269d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!C4285bf.m11807a(hsVar.f12268c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else {
            String str2 = hsVar.f12267b;
            if (str2 == null || str2.length() <= 10240) {
                return false;
            }
            str = "item.data is too large(" + hsVar.f12267b.length() + "), max size for data is " + 10240 + " , verfiy ClientUploadDataItem failed.";
        }
        AbstractC4163b.m11301a(str);
        return true;
    }

    /* renamed from: a */
    public static boolean m14058a(String str) {
        return !C4688t.m14226b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
