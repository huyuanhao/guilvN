package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import com.facebook.react.devsupport.WindowOverlayCompat;
import com.google.gson.internal.bind.util.ISO8601Utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.alipay.android.phone.mrpc.core.k */
public final class C0364k {

    /* renamed from: a */
    public static final Pattern f803a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* renamed from: b */
    public static final Pattern f804b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* renamed from: com.alipay.android.phone.mrpc.core.k$a */
    public static class C0365a {

        /* renamed from: a */
        public int f805a;

        /* renamed from: b */
        public int f806b;

        /* renamed from: c */
        public int f807c;

        public C0365a(int i, int i2, int i3) {
            this.f805a = i;
            this.f806b = i2;
            this.f807c = i3;
        }
    }

    /* renamed from: a */
    public static long m677a(String str) {
        int i;
        int i2;
        int i3;
        C0365a aVar;
        int i4;
        int i5;
        int i6;
        Matcher matcher = f803a.matcher(str);
        if (matcher.find()) {
            i = m678b(matcher.group(1));
            i3 = m679c(matcher.group(2));
            i2 = m680d(matcher.group(3));
            aVar = m681e(matcher.group(4));
        } else {
            Matcher matcher2 = f804b.matcher(str);
            if (matcher2.find()) {
                i3 = m679c(matcher2.group(1));
                int b = m678b(matcher2.group(2));
                C0365a e = m681e(matcher2.group(3));
                i2 = m680d(matcher2.group(4));
                i = b;
                aVar = e;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (i2 >= 2038) {
            i6 = 1;
            i5 = 0;
            i4 = WindowOverlayCompat.TYPE_APPLICATION_OVERLAY;
        } else {
            i6 = i;
            i5 = i3;
            i4 = i2;
        }
        Time time = new Time(ISO8601Utils.UTC_ID);
        time.set(aVar.f807c, aVar.f806b, aVar.f805a, i6, i5, i4);
        return time.toMillis(false);
    }

    /* renamed from: b */
    public static int m678b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    /* renamed from: c */
    public static int m679c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static int m680d(String str) {
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() == 4) {
                return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
            }
            return 1970;
        }
    }

    /* renamed from: e */
    public static C0365a m681e(String str) {
        int i;
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i = 2;
            charAt = (charAt * 10) + (str.charAt(1) - '0');
        } else {
            i = 1;
        }
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1 + 1;
        return new C0365a(charAt, ((str.charAt(i2) - '0') * 10) + (str.charAt(i3) - '0'), ((str.charAt(i4) - '0') * 10) + (str.charAt(i4 + 1) - '0'));
    }
}
