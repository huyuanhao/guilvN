package com.huawei.hms.p037c;

import android.content.Context;
import com.baidu.aip.face.stat.FileUtil;
import com.huawei.hms.support.log.C1202a;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.huawei.hms.c.b */
public abstract class AbstractC1132b {

    /* renamed from: a */
    public static boolean f1165a;

    /* renamed from: b */
    public static ScheduledExecutorService f1166b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public static void m1065a(File file, String str, long j) {
        f1166b.execute(new RunnableC1133c(file, j, str));
    }

    /* renamed from: a */
    public static void m1064a(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f1165a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    C1202a.m1320d(FileUtil.TAG, "file delete failed.");
                }
                f1165a = true;
            }
            m1065a(file2, str + "|" + j + "|" + i, 10240);
        }
    }
}
