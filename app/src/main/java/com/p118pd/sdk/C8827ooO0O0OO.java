package com.p118pd.sdk;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.umeng.message.entity.UMessage;
import java.util.Map;
import java.util.Set;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.pd.sdk.ooO0O0OO  reason: case insensitive filesystem */
public class C8827ooO0O0OO {
    public static int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC8826ooO0O0O0 f22027OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC8842ooO0OOoo f22028OooO00o;
    public static int OooO0O0;

    public static AbstractC8826ooO0O0O0 OooO00o(int i) {
        if (OooO00o != i || f22027OooO00o == null) {
            f22027OooO00o = C8825ooO0O0O.OooO00o(i);
            OooO00o = i;
        }
        return f22027OooO00o;
    }

    public static void OooO0O0(Context context, int i) {
        try {
            C8818ooO00ooO OooO00o2 = C8797ooO000O.OooO00o(i);
            if (OooO00o2 == null) {
                C8783oo0oooOO.OooOOOO("register mix push failed, as registration is null, push type = " + i);
                return;
            }
            OooO0O0++;
            OooO00o(i).OooO00o(context, OooO00o2.f22022OooO00o, OooO00o2.OooO0O0, OooO00o2.OooO0OO);
        } catch (Throwable th) {
            C8783oo0oooOO.OooOOOO("register push exception " + th);
        }
    }

    public static void OooO00o(Context context, int i, AbstractC8842ooO0OOoo ooo0oooo) {
        try {
            C8818ooO00ooO OooO00o2 = C8797ooO000O.OooO00o(i);
            if (OooO00o2 == null) {
                C8783oo0oooOO.OooOOOO("register mix push failed, as registration is null, push type = " + i);
                if (ooo0oooo != null) {
                    ooo0oooo.OooO00o(null, null);
                    return;
                }
                return;
            }
            OooO0O0++;
            f22028OooO00o = ooo0oooo;
            OooO00o(i).OooO00o(context, OooO00o2.f22022OooO00o, OooO00o2.OooO0O0, OooO00o2.OooO0OO);
        } catch (Throwable th) {
            C8783oo0oooOO.OooOOOO("register push exception " + th);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20454OooO00o() {
        return OooO0O0 > 0;
    }

    public static void OooO00o(int i, String str) {
        int OooO00o2;
        int i2 = OooO0O0;
        if (i2 > 0) {
            OooO0O0 = i2 - 1;
            if (i == 8 && str == null && (OooO00o2 = OooO00o()) != 0) {
                C8802ooO000o0.OooO00o(OooO00o2);
                return;
            }
            String OooO00o3 = C8797ooO000O.m20438OooO00o(i);
            AbstractC8842ooO0OOoo ooo0oooo = f22028OooO00o;
            if (ooo0oooo != null) {
                ooo0oooo.OooO00o(OooO00o3, str);
                f22028OooO00o = null;
                return;
            }
            C8802ooO000o0.OooO0O0(new C8817ooO00oo0(i, OooO00o3, str));
        }
    }

    public static int OooO00o() {
        String str = Build.MANUFACTURER;
        int i = 0;
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("xiaomi")) {
            i = 5;
        } else if (lowerCase.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI)) {
            i = 6;
        } else if (lowerCase.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_MEIZU)) {
            i = 7;
        } else if (lowerCase.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO)) {
            i = 9;
        } else if (lowerCase.equals(AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO)) {
            i = 10;
        }
        C8783oo0oooOO.OooOOOO("get push type from local " + i);
        return i;
    }

    public static void OooO00o(Context context, Map<String, String> map, Set<String> set) {
        try {
            C8802ooO000o0.OooO00o(context, OooO00o(map, set));
        } catch (Throwable th) {
            C8783oo0oooOO.OooOOOO("mix push onNotificationClicked exception " + th);
        }
    }

    public static Map<String, String> OooO00o(Map<String, String> map, Set<String> set) {
        C8783oo0oooOO.OooOOOO("mix push extra:" + map);
        if (map == null) {
            return null;
        }
        for (String str : set) {
            if (str != null && map.containsKey(str)) {
                map.remove(str);
            }
        }
        return map;
    }

    public static void OooO00o(Context context, int i) {
        C8783oo0oooOO.OooOOOO("clear push notification type = " + i);
        try {
            if (!OooO00o(i).OooO00o(context)) {
                AbstractC8862ooO0o0O OooO00o2 = C8802ooO000o0.m20440OooO00o();
                boolean z = false;
                if (OooO00o2 != null) {
                    z = OooO00o2.OooO00o(i);
                }
                if (!z) {
                    ((NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)).cancelAll();
                }
            }
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("clear push notification exception");
        }
    }
}
