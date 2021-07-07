package com.huawei.hms.support.api.push.p041a.p045d;

import android.content.Context;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.C7773oO0000oO;
import java.lang.reflect.Field;

/* renamed from: com.huawei.hms.support.api.push.a.d.b */
public class C1185b {
    /* renamed from: a */
    public static int m1254a(Context context, String str, String str2) {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier == 0) {
                Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
                identifier = Integer.parseInt(field.get(field.getName()).toString());
                if (identifier == 0) {
                    C1202a.m1318b(C7773oO0000oO.OooO00o, "Error-resourceType=" + str + "--resourceName=" + str2 + "--resourceId =" + identifier);
                }
            }
            return identifier;
        } catch (ClassNotFoundException e) {
            C1202a.m1317a(C7773oO0000oO.OooO00o, "!!!! ResourceLoader: ClassNotFoundException-resourceType=" + str + "--resourceName=" + str2, e);
            return 0;
        } catch (NoSuchFieldException e2) {
            C1202a.m1317a(C7773oO0000oO.OooO00o, "!!!! ResourceLoader: NoSuchFieldException-resourceType=" + str + "--resourceName=" + str2, e2);
            return 0;
        } catch (NumberFormatException e3) {
            C1202a.m1317a(C7773oO0000oO.OooO00o, "!!!! ResourceLoader: NumberFormatException-resourceType=" + str + "--resourceName=" + str2, e3);
            return 0;
        } catch (IllegalAccessException e4) {
            C1202a.m1317a(C7773oO0000oO.OooO00o, "!!!! ResourceLoader: IllegalAccessException-resourceType=" + str + "--resourceName=" + str2, e4);
            return 0;
        } catch (IllegalArgumentException e5) {
            C1202a.m1317a(C7773oO0000oO.OooO00o, "!!!! ResourceLoader: IllegalArgumentException-resourceType=" + str + "--resourceName=" + str2, e5);
            return 0;
        }
    }

    /* renamed from: b */
    public static int m1255b(Context context, String str) {
        return m1254a(context, "id", str);
    }

    /* renamed from: a */
    public static int m1253a(Context context, String str) {
        return m1254a(context, "layout", str);
    }
}
