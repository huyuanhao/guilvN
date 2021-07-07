package com.xiaomi.push;

import android.os.Build;
import android.system.Os;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.io.File;

/* renamed from: com.xiaomi.push.cj */
public class C4323cj {
    /* renamed from: a */
    public static long m11953a(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0;
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return 0;
        }
    }
}
