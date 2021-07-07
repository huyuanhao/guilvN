package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.manager.C4166a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.bl */
public class C4291bl {
    /* renamed from: a */
    public static String m11818a() {
        return Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: a */
    public static String m11819a(Context context) {
        String a = C4294bo.m11827a(context).mo41526a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = C4285bf.m11799a(20);
        C4294bo.m11827a(context).m11831a("sp_client_report_status", "sp_client_report_key", a2);
        return a2;
    }

    /* renamed from: a */
    public static void m11820a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e4, code lost:
        if (r7 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0104  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11821a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4291bl.m11821a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m11822a(Context context, List<String> list) {
        if (list != null && list.size() > 0 && m11823a(context)) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    m11820a(context, str);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m11823a(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 0).versionCode >= 108;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m11824a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = C4166a.m11308a(context).mo41252a().getMaxFileLength();
        if (file.exists()) {
            try {
                if (file.length() > maxFileLength) {
                    return false;
                }
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
                return false;
            }
        } else {
            C4693y.m14241a(file);
        }
        return true;
    }

    @TargetApi(9)
    /* renamed from: a */
    public static byte[] m11825a(String str) {
        byte[] copyOf = Arrays.copyOf(C4282bc.m11788a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* renamed from: a */
    public static File[] m11826a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new C4293bn());
        }
        return null;
    }
}
