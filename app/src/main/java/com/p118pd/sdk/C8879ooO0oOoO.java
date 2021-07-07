package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.pd.sdk.ooO0oOoO  reason: case insensitive filesystem */
public class C8879ooO0oOoO {
    public static boolean OooO00o(int i, long j) {
        return m20523OooO00o() - j > ((long) (((i * 24) * 3600) * 1000));
    }

    public static int OooO0O0() {
        return (int) (new Date().getTime() / 1000);
    }

    public static String OooO0OO(String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date());
    }

    public static int OooO00o() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static String OooO0O0(String str) {
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
        Date date = new Date(m20523OooO00o());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(timeZone);
        String str2 = gregorianCalendar.get(9) == 0 ? "上午" : "下午";
        return str2 + simpleDateFormat.format(date);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20523OooO00o() {
        return System.currentTimeMillis();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m20526OooO00o() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return new long[]{instance.getTimeInMillis() / 1000, instance.getTimeInMillis() / 1000};
    }

    public static String OooO0OO(long j) {
        return OooO00o(j, "HHmmss");
    }

    public static String OooO0OO(int i) {
        if (i < 0 || i >= 10) {
            return "" + i;
        }
        return "0" + Integer.toString(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20524OooO00o() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
    }

    public static String OooO0O0(long j) {
        Date date = new Date();
        Date date2 = new Date(j);
        if (!date2.before(new Date(date.getYear(), 0, 0))) {
            return new SimpleDateFormat("MM-dd", Locale.getDefault()).format(date2);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20525OooO00o(long j) {
        return OooO00o(j, "yyyyMMdd");
    }

    public static String OooO00o(String str) {
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
        Date date = new Date(m20523OooO00o());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }

    public static String OooO00o(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static String OooO0O0(Date date) {
        String[] strArr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return strArr[instance.get(7) - 1];
    }

    public static String OooO00o(long j, boolean z) {
        String str;
        Date date = new Date(j);
        Date date2 = new Date();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Date time = instance.getTime();
        Date date3 = new Date(time.getTime() - 86400000);
        Date date4 = new Date(date3.getTime() - 86400000);
        if (!date.before(time)) {
            str = "今天";
        } else if (!date.before(date3)) {
            str = "昨天";
        } else if (!date.before(date4)) {
            str = "前天";
        } else if (OooO0O0(date, date2)) {
            str = OooO0O0(date);
        } else {
            str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date);
        }
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
        if (z) {
            return !date.before(time) ? OooO00o(date) : str;
        }
        return str + " " + format;
    }

    public static boolean OooO0O0(Date date, Date date2) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(date);
        instance2.setTime(date2);
        int i = instance.get(1) - instance2.get(1);
        if (i == 0) {
            if (instance.get(3) == instance2.get(3)) {
                return true;
            }
            return false;
        } else if (1 == i && 11 == instance2.get(2)) {
            if (instance.get(3) == instance2.get(3)) {
                return true;
            }
            return false;
        } else if (-1 == i && 11 == instance.get(2) && instance.get(3) == instance2.get(3)) {
            return true;
        } else {
            return false;
        }
    }

    public static String OooO0O0(int i) {
        if (i <= 0) {
            return "00:00";
        }
        int i2 = i / 60;
        if (i2 < 60) {
            return OooO0OO(i2) + Constants.COLON_SEPARATOR + OooO0OO(i % 60);
        }
        int i3 = i2 / 60;
        if (i3 > 99) {
            return "99:59:59";
        }
        int i4 = i2 % 60;
        return OooO0OO(i3) + Constants.COLON_SEPARATOR + OooO0OO(i4) + Constants.COLON_SEPARATOR + OooO0OO((i - (i3 * 3600)) - (i4 * 60));
    }

    public static String OooO00o(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("KK:mm", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mm", Locale.getDefault());
        int i = instance.get(11);
        if (i >= 0 && i < 5) {
            return "凌晨 " + simpleDateFormat.format(date);
        } else if (i >= 5 && i < 12) {
            return "上午 " + simpleDateFormat.format(date);
        } else if (i >= 12 && i < 18) {
            return "下午 " + simpleDateFormat2.format(date);
        } else if (i < 18 || i >= 24) {
            return "";
        } else {
            return "晚上 " + simpleDateFormat2.format(date);
        }
    }

    public static boolean OooO00o(long j, long j2) {
        return OooO00o(new Date(j), new Date(j2));
    }

    public static boolean OooO00o(Date date, Date date2) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(date);
        instance2.setTime(date2);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    public static long OooO00o(long j) {
        return (long) new BigDecimal((double) (((float) j) / 1000.0f)).setScale(0, 4).intValue();
    }

    public static String OooO00o(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 1000;
        if (i2 < 1) {
            i2 = 1;
        }
        int i3 = i2 / 3600;
        if (i3 != 0) {
            sb.append(i3);
            sb.append("小时");
        }
        int i4 = i2 - (i3 * 3600);
        int i5 = i4 / 60;
        if (i5 != 0) {
            sb.append(i5);
            sb.append("分");
        }
        int i6 = i4 - (i5 * 60);
        if (i6 != 0) {
            sb.append(i6);
            sb.append("秒");
        }
        return sb.toString();
    }
}
