package anet.channel.strategy;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: anet.channel.strategy.m */
public class C0204m {

    /* renamed from: a */
    public static File f446a;

    /* renamed from: b */
    public static volatile boolean f447b;

    /* renamed from: c */
    public static Comparator<File> f448c = new C0205n();

    /* renamed from: a */
    public static void m268a(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), "awcn_strategy");
                f446a = file;
                if (!m270a(file)) {
                    ALog.m289e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f446a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f446a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f446a = file2;
                    if (!m270a(file2)) {
                        ALog.m289e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f446a.getAbsolutePath());
                    }
                }
                ALog.m290i("awcn.StrategySerializeHelper", "StrateyFolder", null, "path", f446a.getAbsolutePath());
                if (f447b) {
                    m267a();
                    f447b = false;
                    return;
                }
                m272c();
            } catch (Throwable th) {
                ALog.m288e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static synchronized File[] m271b() {
        synchronized (C0204m.class) {
            if (f446a == null) {
                return null;
            }
            File[] listFiles = f446a.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, f448c);
            }
            return listFiles;
        }
    }

    /* renamed from: c */
    public static synchronized void m272c() {
        synchronized (C0204m.class) {
            File[] b = m271b();
            if (b != null) {
                int i = 0;
                for (File file : b) {
                    if (!file.isDirectory()) {
                        if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                            file.delete();
                        } else if (file.getName().startsWith("WIFI")) {
                            int i2 = i + 1;
                            if (((long) i) > 10) {
                                file.delete();
                            }
                            i = i2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m270a(File file) {
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    /* renamed from: a */
    public static File m265a(String str) {
        m270a(f446a);
        return new File(f446a, str);
    }

    /* renamed from: a */
    public static synchronized void m267a() {
        synchronized (C0204m.class) {
            ALog.m290i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
            if (f446a == null) {
                ALog.m292w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
                f447b = true;
                return;
            }
            File[] listFiles = f446a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
                ALog.m290i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m269a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        synchronized (C0204m.class) {
            SerializeHelper.persist(serializable, m265a(str), strategyStatObject);
        }
    }

    /* renamed from: a */
    public static synchronized <T> T m266a(String str, StrategyStatObject strategyStatObject) {
        T t;
        synchronized (C0204m.class) {
            t = (T) SerializeHelper.restore(m265a(str), strategyStatObject);
        }
        return t;
    }
}
