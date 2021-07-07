package com.umeng.socialize.utils;

import android.content.Context;
import com.umeng.socialize.net.dplus.p278db.DBConfig;
import com.umeng.socialize.utils.UmengText;
import java.io.File;

public class ContextUtil {
    public static Context context;

    public static Context getContext() {
        if (context == null) {
            SLog.m10856E(UmengText.INTER.CONTEXT_ERROR);
        }
        return context;
    }

    public static File getDataFile(String str) {
        Context context2 = context;
        if (context2 != null) {
            return context2.getDatabasePath(DBConfig.DB_NAME);
        }
        return null;
    }

    public static final int getIcon() {
        Context context2 = context;
        if (context2 == null) {
            return 0;
        }
        return context2.getApplicationInfo().icon;
    }

    public static final String getPackageName() {
        Context context2 = context;
        return context2 == null ? "" : context2.getPackageName();
    }

    public static void setContext(Context context2) {
        context = context2;
    }
}
