package anet.channel.util;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import java.io.File;
import java.io.Serializable;

public class SerializeHelper {
    public static final String TAG = "awcn.SerializeHelper";
    public static File cacheDir;

    public static File getCacheFiles(String str) {
        Context context;
        if (cacheDir == null && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            cacheDir = context.getCacheDir();
        }
        return new File(cacheDir, str);
    }

    public static synchronized void persist(Serializable serializable, File file) {
        synchronized (SerializeHelper.class) {
            persist(serializable, file, null);
        }
    }

    public static synchronized <T> T restore(File file) {
        T t;
        synchronized (SerializeHelper.class) {
            t = (T) restore(file, null);
        }
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r4 != null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[Catch:{ all -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9 A[Catch:{ all -> 0x00b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T> T restore(java.io.File r14, anet.channel.statist.StrategyStatObject r15) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.restore(java.io.File, anet.channel.statist.StrategyStatObject):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r15.appendErrorTrace("SerializeHelper.persist()", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[Catch:{ all -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[SYNTHETIC, Splitter:B:30:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC, Splitter:B:59:0x00eb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void persist(java.io.Serializable r13, java.io.File r14, anet.channel.statist.StrategyStatObject r15) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.SerializeHelper.persist(java.io.Serializable, java.io.File, anet.channel.statist.StrategyStatObject):void");
    }
}
