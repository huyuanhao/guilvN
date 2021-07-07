package com.p118pd.sdk;

import android.content.Context;
import androidx.multidex.MultiDexExtractor;
import com.p118pd.sdk.C8552oo00OoOo;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.pd.sdk.oo00OooO  reason: case insensitive filesystem */
public class C8555oo00OooO {
    public static long OooO00o(String str) {
        try {
            Date parse = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).parse(str);
            if (parse == null) {
                return 0;
            }
            return parse.getTime();
        } catch (ParseException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "Time conversion Exception : getTimeMillis!");
            return 0;
        }
    }

    public static synchronized void OooO00o(Context context) {
        synchronized (C8555oo00OooO.class) {
            if (context != null) {
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "Clear all data of local log");
                String path = context.getFilesDir().getPath();
                OooO0O0(new File(path + C8552oo00OoOo.OooO00o.OooO00o));
            }
        }
    }

    public static void OooO00o(File file) {
        C8590oo0O000o.OooO00o(file);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20210OooO00o(String str) {
        String str2;
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                if (name.endsWith(".log") || name.endsWith(MultiDexExtractor.o0OO00O)) {
                    if (!"eventinfo.log".equals(name)) {
                        String[] split = name.substring(0, name.lastIndexOf(C9058ooOoOoOO.OooOO0)).split("_");
                        if (System.currentTimeMillis() - OooO00o(split[split.length - 1].trim()) >= 604800000 && file.delete()) {
                            str2 = "out time file del ok";
                        }
                    }
                } else if (file.delete()) {
                    str2 = "this file is not our fileName :" + name;
                }
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", str2);
            }
        }
    }

    public static void OooO0O0(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                if (file.delete()) {
                    return;
                }
            } else if (file.isDirectory()) {
                String[] list = file.list();
                if (list != null) {
                    for (String str : list) {
                        OooO0O0(new File(file, str));
                    }
                    if (file.delete()) {
                        return;
                    }
                } else if (file.delete()) {
                    return;
                }
            } else {
                return;
            }
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "refresh clear file fail");
        }
    }
}
