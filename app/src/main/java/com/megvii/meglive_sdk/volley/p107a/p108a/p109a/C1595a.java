package com.megvii.meglive_sdk.volley.p107a.p108a.p109a;

import com.megvii.meglive_sdk.volley.p107a.p114f.C1611a;
import com.umeng.message.util.HttpRequest;
import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.megvii.meglive_sdk.volley.a.a.a.a */
public final class C1595a {

    /* renamed from: a */
    public static final TimeZone f2821a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    public static final String[] f2822b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: c */
    public static final Date f2823c;

    /* renamed from: com.megvii.meglive_sdk.volley.a.a.a.a$OooO00o */
    public static final class OooO00o {
        public static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> OooO00o = new C4904OooO00o();

        /* renamed from: com.megvii.meglive_sdk.volley.a.a.a.a$OooO00o$OooO00o  reason: collision with other inner class name */
        public static class C4904OooO00o extends ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.lang.ThreadLocal
            public final /* synthetic */ SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference(new HashMap());
            }
        }

        public static SimpleDateFormat OooO00o(String str) {
            Map<String, SimpleDateFormat> map = OooO00o.get().get();
            if (map == null) {
                map = new HashMap<>();
                OooO00o.set(new SoftReference<>(map));
            }
            SimpleDateFormat simpleDateFormat = map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(f2821a);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f2823c = instance.getTime();
    }

    /* renamed from: a */
    public static Date m2745a(String str) {
        C1611a.m2771a(str, "Date value");
        String[] strArr = f2822b;
        Date date = f2823c;
        if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1);
        }
        for (String str2 : strArr) {
            SimpleDateFormat OooO00o2 = OooO00o.OooO00o(str2);
            OooO00o2.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = OooO00o2.parse(str, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m2744a(Date date) {
        C1611a.m2771a(date, HttpRequest.HEADER_DATE);
        C1611a.m2771a("EEE, dd MMM yyyy HH:mm:ss zzz", "Pattern");
        return OooO00o.OooO00o("EEE, dd MMM yyyy HH:mm:ss zzz").format(date);
    }
}
