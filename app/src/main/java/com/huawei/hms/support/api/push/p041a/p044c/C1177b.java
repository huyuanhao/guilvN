package com.huawei.hms.support.api.push.p041a.p044c;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.huawei.hms.p035a.C1107a;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.push.a.c.b */
public class C1177b {
    /* renamed from: a */
    public static int m1213a(Context context, String str, String str2, Object obj) {
        try {
            String str3 = context.getPackageName() + ".R";
            C1202a.m1316a("PushSelfShowLog", "try to refrect " + str3 + " typeName is " + str2);
            Class<?>[] classes = Class.forName(str3).getClasses();
            StringBuilder sb = new StringBuilder();
            sb.append("sonClassArr length ");
            sb.append(classes.length);
            C1202a.m1316a("PushSelfShowLog", sb.toString());
            Class<?> cls = null;
            int i = 0;
            while (true) {
                if (i >= classes.length) {
                    break;
                }
                Class<?> cls2 = classes[i];
                String substring = cls2.getName().substring(str3.length() + 1);
                C1202a.m1316a("PushSelfShowLog", "sonTypeClass,query sonclass is " + substring + " sonClass.getName() is" + cls2.getName());
                if (str2.equals(substring)) {
                    cls = cls2;
                    break;
                }
                i++;
            }
            if (cls != null) {
                int i2 = cls.getField(str).getInt(obj);
                C1202a.m1316a("PushSelfShowLog", "refect res id is " + i2);
                return i2;
            }
            C1202a.m1316a("PushSelfShowLog", "sonTypeClass is null");
            String str4 = context.getPackageName() + ".R$" + str2;
            C1202a.m1316a("PushSelfShowLog", "try to refrect 2 " + str4 + " typeName is " + str2);
            int i3 = Class.forName(str4).getField(str).getInt(obj);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" refect res id 2 is ");
            sb2.append(i3);
            C1202a.m1316a("PushSelfShowLog", sb2.toString());
            return i3;
        } catch (ClassNotFoundException e) {
            C1202a.m1317a("PushSelfShowLog", "ClassNotFound failed,", e);
            return 0;
        } catch (NoSuchFieldException e2) {
            C1202a.m1317a("PushSelfShowLog", "NoSuchFieldException failed,", e2);
            return 0;
        } catch (IllegalAccessException e3) {
            C1202a.m1317a("PushSelfShowLog", "IllegalAccessException failed,", e3);
            return 0;
        } catch (IllegalArgumentException e4) {
            C1202a.m1317a("PushSelfShowLog", "IllegalArgumentException failed,", e4);
            return 0;
        } catch (IndexOutOfBoundsException e5) {
            C1202a.m1317a("PushSelfShowLog", "IndexOutOfBoundsException failed,", e5);
            return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m1215b(Context context, C1174a aVar) {
        Bitmap bitmap = null;
        if (context == null || aVar == null) {
            return null;
        }
        try {
            if (aVar.mo15674m() != null && aVar.mo15674m().length() > 0) {
                int i = 0;
                String m = aVar.mo15674m();
                if (!m.equals("" + aVar.mo15662a())) {
                    i = m1213a(context, aVar.mo15674m(), "drawable", new R.drawable());
                    if (i == 0) {
                        i = context.getResources().getIdentifier(aVar.mo15674m(), "drawable", "android");
                    }
                    C1202a.m1316a("PushSelfShowLog", "msg.notifyIcon is " + aVar.mo15674m() + ",and defaultIcon is " + i);
                }
                if (i != 0) {
                    bitmap = BitmapFactory.decodeResource(context.getResources(), i);
                }
            }
            if (C1107a.C1108a.f1094a >= 11) {
                C1202a.m1318b("PushSelfShowLog", "huawei phone, and emui5.0, need not show large icon.");
                return bitmap;
            } else if (bitmap != null || "com.huawei.android.pushagent".equals(aVar.mo15670i())) {
                return bitmap;
            } else {
                C1202a.m1318b("PushSelfShowLog", "get left bitmap from " + aVar.mo15670i());
                return ((BitmapDrawable) context.getPackageManager().getApplicationIcon(aVar.mo15670i())).getBitmap();
            }
        } catch (PackageManager.NameNotFoundException e) {
            C1202a.m1317a("PushSelfShowLog", "" + e.toString(), e);
            return null;
        } catch (Exception e2) {
            C1202a.m1317a("PushSelfShowLog", "" + e2.toString(), e2);
            return null;
        }
    }

    @TargetApi(23)
    /* renamed from: c */
    public static Icon m1216c(Context context, C1174a aVar) {
        if (context == null || aVar == null) {
            C1202a.m1320d("PushSelfShowLog", "getSmallIcon, context is null");
            return null;
        } else if (Build.VERSION.SDK_INT < 23) {
            C1202a.m1318b("PushSelfShowLog", "getSmallIcon failed, Build.VERSION less than 23");
            return null;
        } else {
            try {
                return Icon.createWithResource(aVar.mo15670i(), context.getPackageManager().getApplicationInfo(aVar.mo15670i(), 0).icon);
            } catch (PackageManager.NameNotFoundException e) {
                C1202a.m1320d("PushSelfShowLog", e.toString());
                return null;
            } catch (Exception e2) {
                C1202a.m1317a("PushSelfShowLog", e2.toString(), e2);
                return null;
            }
        }
    }

    /* renamed from: d */
    public static boolean m1217d(Context context, C1174a aVar) {
        if ("com.huawei.android.pushagent".equals(aVar.mo15670i()) || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return C1184a.m1248b(context) || C1184a.m1249c(context);
    }

    /* renamed from: a */
    public static int m1212a(Context context, C1174a aVar) {
        if (context == null || aVar == null) {
            C1202a.m1318b("PushSelfShowLog", "enter getSmallIconId, context or msg is null");
            return 0;
        }
        int i = context.getApplicationInfo().icon;
        if (i != 0) {
            return i;
        }
        int identifier = context.getResources().getIdentifier("btn_star_big_on", "drawable", "android");
        C1202a.m1316a("PushSelfShowLog", "icon is btn_star_big_on ");
        if (identifier != 0) {
            return identifier;
        }
        C1202a.m1316a("PushSelfShowLog", "icon is sym_def_app_icon ");
        return 17301651;
    }

    @TargetApi(23)
    /* renamed from: a */
    public static void m1214a(Context context, Notification.Builder builder, C1174a aVar) {
        if (context == null || builder == null || aVar == null) {
            C1202a.m1320d("PushSelfShowLog", "msg is null");
        } else if (m1217d(context, aVar)) {
            C1202a.m1318b("PushSelfShowLog", "get small icon from " + aVar.mo15670i());
            Icon c = m1216c(context, aVar);
            if (c != null) {
                builder.setSmallIcon(c);
            } else {
                builder.setSmallIcon(m1212a(context, aVar));
            }
        } else {
            builder.setSmallIcon(m1212a(context, aVar));
        }
    }
}
