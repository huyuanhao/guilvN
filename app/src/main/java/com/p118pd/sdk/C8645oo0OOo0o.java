package com.p118pd.sdk;

import com.megvii.apo.PhoneFingerManager;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.pd.sdk.oo0OOo0o  reason: case insensitive filesystem */
public class C8645oo0OOo0o {
    public static final String OooO = "yyyyMMdd";
    public static final int OooO00o = 86400000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static long f21768OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21769OooO00o = "HH:mm:ss";
    public static final int OooO0O0 = 3600000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21770OooO0O0 = "HH:mm";
    public static final int OooO0OO = 60000;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f21771OooO0OO = "yyyy-MM-dd";
    public static final int OooO0Oo = 7200000;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f21772OooO0Oo = "yy-MM-dd";
    public static final String OooO0o = "yyyy-MM-dd HH:mm";
    public static final String OooO0o0 = "yyyy.MM.dd";
    public static final String OooO0oO = "yyyy-MM-dd HH:mm:ss";
    public static final String OooO0oo = "MM-dd HH:mm";

    public static long OooO00o(int i) {
        Date date = new Date();
        date.setTime(OooO0O0() + ((long) (i * 24 * 3600 * 1000)));
        return date.getTime();
    }

    public static boolean OooO00o(long j, long j2) {
        return j2 - j <= 86400000;
    }

    public static long OooO0O0(int i) {
        Date date = new Date();
        date.setTime(date.getTime() - ((long) (((i * 24) * 3600) * 1000)));
        return date.getTime();
    }

    public static boolean OooO0O0(long j, long j2) {
        return j2 - j <= PhoneFingerManager.PER_HOUR_MILLISECOND;
    }

    public static boolean OooO0OO(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        return date.getYear() == date2.getYear() && date.getMonth() == date2.getMonth() && date.getDate() == date2.getDate();
    }

    public static boolean OooO0Oo(long j, long j2) {
        return j2 - j <= 7200000;
    }

    public static long OooO00o() {
        return new Date().getTime();
    }

    public static long OooO0O0() {
        return OooO00o() + f21768OooO00o;
    }

    public static String OooO00o(long j, String str) {
        if (j == 0) {
            return "--";
        }
        return new SimpleDateFormat(str).format(new Date(j));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static String m20269OooO0O0(int i) {
        if (i < 0 || i >= 10) {
            return "" + i;
        }
        return "0" + Integer.toString(i);
    }

    public static String OooO00o(long j, String str, boolean z) {
        if (j == 0) {
            return "--";
        }
        Date date = new Date(j);
        long OooO00o2 = OooO00o() - j;
        if (OooO00o2 < PhoneFingerManager.PER_HOUR_MILLISECOND) {
            return "刚刚";
        }
        if (OooO00o2 >= 86400000) {
            return new SimpleDateFormat(str).format(date);
        }
        return Math.ceil((double) (OooO00o2 / PhoneFingerManager.PER_HOUR_MILLISECOND)) + "小时";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20267OooO00o(long j) {
        Date date = new Date(OooO0O0());
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);
        if (j > date.getTime()) {
            return true;
        }
        return false;
    }

    public static void OooO00o(long j) {
        f21768OooO00o = j - OooO00o();
    }

    public static String OooO00o(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        try {
            return new SimpleDateFormat(str3).format(simpleDateFormat.parse(str));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20268OooO00o(String str, String str2) {
        if (!C9054ooOoOo0.OooO0OO(str) && !C9054ooOoOo0.OooO0OO(str2)) {
            try {
                long parseLong = Long.parseLong(str);
                long parseLong2 = Long.parseLong(str2);
                long OooO0O02 = OooO0O0();
                if (OooO0O02 >= parseLong2 || OooO0O02 <= parseLong) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static long OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
        String str;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        try {
            str = String.valueOf(simpleDateFormat.parse(i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i3 + " " + i4 + Constants.COLON_SEPARATOR + i5 + Constants.COLON_SEPARATOR + i6).getTime()).substring(0, 13);
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long OooO00o(String str, String str2) {
        String str3;
        try {
            str3 = String.valueOf(new SimpleDateFormat(str2, Locale.CHINA).parse(str).getTime()).substring(0, 13);
        } catch (ParseException e) {
            e.printStackTrace();
            str3 = null;
        }
        try {
            return Long.parseLong(str3);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Date OooO00o(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, 1);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.add(5, -1);
        return instance.getTime();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20266OooO00o(int i) {
        return m20269OooO0O0(Math.round((float) (i / 60))) + Constants.COLON_SEPARATOR + m20269OooO0O0(i % 60);
    }
}
