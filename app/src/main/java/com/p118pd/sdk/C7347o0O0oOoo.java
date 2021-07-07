package com.p118pd.sdk;

import anet.channel.util.HttpHelper;
import anetwork.channel.cache.Cache;
import com.umeng.message.util.HttpRequest;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.pd.sdk.o0O0oOoo  reason: case insensitive filesystem */
public class C7347o0O0oOoo {
    public static final DateFormat OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final TimeZone f20068OooO00o = TimeZone.getTimeZone("GMT");

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        OooO00o = simpleDateFormat;
        simpleDateFormat.setTimeZone(f20068OooO00o);
    }

    public static String OooO00o(long j) {
        return OooO00o.format(new Date(j));
    }

    public static long OooO00o(String str) {
        if (str.length() == 0) {
            return 0;
        }
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = OooO00o.parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return parse.getTime();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static Cache.Entry OooO00o(Map<String, List<String>> map) {
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control");
        boolean z = true;
        int i = 0;
        if (singleHeaderFieldByKey != null) {
            String[] split = singleHeaderFieldByKey.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            j = 0;
            while (true) {
                if (i >= split.length) {
                    break;
                }
                String trim = split[i].trim();
                if (trim.equals("no-store")) {
                    return null;
                }
                if (trim.equals("no-cache")) {
                    j = 0;
                    break;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                }
                i++;
            }
        } else {
            j = 0;
            z = false;
        }
        String singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map, HttpRequest.HEADER_DATE);
        long OooO00o2 = singleHeaderFieldByKey2 != null ? OooO00o(singleHeaderFieldByKey2) : 0;
        String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map, HttpRequest.HEADER_EXPIRES);
        long OooO00o3 = singleHeaderFieldByKey3 != null ? OooO00o(singleHeaderFieldByKey3) : 0;
        String singleHeaderFieldByKey4 = HttpHelper.getSingleHeaderFieldByKey(map, HttpRequest.HEADER_LAST_MODIFIED);
        long OooO00o4 = singleHeaderFieldByKey4 != null ? OooO00o(singleHeaderFieldByKey4) : 0;
        String singleHeaderFieldByKey5 = HttpHelper.getSingleHeaderFieldByKey(map, HttpRequest.HEADER_ETAG);
        if (z) {
            currentTimeMillis += j * 1000;
        } else if (OooO00o2 <= 0 || OooO00o3 < OooO00o2) {
            j2 = OooO00o4;
            if (j2 <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis != 0 && singleHeaderFieldByKey5 == null) {
                return null;
            }
            Cache.Entry entry = new Cache.Entry();
            entry.etag = singleHeaderFieldByKey5;
            entry.ttl = currentTimeMillis;
            entry.serverDate = OooO00o2;
            entry.lastModified = j2;
            entry.responseHeaders = map;
            return entry;
        } else {
            currentTimeMillis += OooO00o3 - OooO00o2;
        }
        j2 = OooO00o4;
        if (currentTimeMillis != 0) {
        }
        Cache.Entry entry2 = new Cache.Entry();
        entry2.etag = singleHeaderFieldByKey5;
        entry2.ttl = currentTimeMillis;
        entry2.serverDate = OooO00o2;
        entry2.lastModified = j2;
        entry2.responseHeaders = map;
        return entry2;
    }
}
