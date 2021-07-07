package com.umeng.analytics.process;

import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DBFileTraversalUtil {

    /* renamed from: a */
    public static ExecutorService f8809a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public static FileLockUtil f8810b = new FileLockUtil();

    /* renamed from: com.umeng.analytics.process.DBFileTraversalUtil$a */
    public interface AbstractC3475a {
        /* renamed from: a */
        void mo38811a();
    }

    public static void traverseDBFiles(String str, final FileLockCallback fileLockCallback, final AbstractC3475a aVar) {
        final File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            f8809a.execute(new Runnable() {
                /* class com.umeng.analytics.process.DBFileTraversalUtil.RunnableC34741 */

                public void run() {
                    try {
                        File[] listFiles = file.listFiles();
                        for (File file : listFiles) {
                            if (file.getName().endsWith(AbstractC3479a.f8832d)) {
                                DBFileTraversalUtil.f8810b.doFileOperateion(file, fileLockCallback);
                                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> file: " + file.getName());
                            }
                        }
                        if (aVar != null) {
                            aVar.mo38811a();
                        }
                    } catch (Throwable unused) {
                    }
                    UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "--->>> end *** ");
                }
            });
        }
    }
}
