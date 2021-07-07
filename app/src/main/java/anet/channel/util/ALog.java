package anet.channel.util;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

public class ALog {
    public static Object LOG_BREAK = "|";
    public static boolean canUseTlog = true;
    public static boolean isPrintLog = true;
    public static volatile ILog log;
    public static Logcat logcat;

    public interface ILog {
        /* renamed from: d */
        void mo3462d(String str, String str2);

        /* renamed from: e */
        void mo3463e(String str, String str2);

        /* renamed from: e */
        void mo3464e(String str, String str2, Throwable th);

        /* renamed from: i */
        void mo3465i(String str, String str2);

        boolean isPrintLog(int i);

        boolean isValid();

        void setLogLevel(int i);

        /* renamed from: w */
        void mo3469w(String str, String str2);

        /* renamed from: w */
        void mo3470w(String str, String str2, Throwable th);
    }

    public static class Level {

        /* renamed from: D */
        public static final int f464D = 1;

        /* renamed from: E */
        public static final int f465E = 4;

        /* renamed from: I */
        public static final int f466I = 2;

        /* renamed from: N */
        public static final int f467N = 5;

        /* renamed from: V */
        public static final int f468V = 0;

        /* renamed from: W */
        public static final int f469W = 3;
    }

    public static class Logcat implements ILog {
        public int defaultLevel = 1;

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: d */
        public void mo3462d(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo3463e(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo3464e(String str, String str2, Throwable th) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: i */
        public void mo3465i(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i) {
            return i >= this.defaultLevel;
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i) {
            if (i < 0 || i > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i;
            }
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo3469w(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo3470w(String str, String str2, Throwable th) {
        }
    }

    static {
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
    }

    public static String buildLogMsg(String str, String str2, Object... objArr) {
        Object obj;
        Object obj2;
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(LOG_BREAK);
            sb.append("[seq:");
            sb.append(str2);
            sb.append("]");
        }
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                if (objArr[i] != null) {
                    obj = objArr[i];
                } else {
                    obj = "";
                }
                sb.append(obj);
                sb.append(Constants.COLON_SEPARATOR);
                if (objArr[i2] != null) {
                    obj2 = objArr[i2];
                } else {
                    obj2 = "";
                }
                sb.append(obj2);
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static String buildLogTag(String str) {
        return str;
    }

    /* renamed from: d */
    public static void m287d(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(1) && log != null) {
            log.mo3462d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    /* renamed from: e */
    public static void m289e(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(4) && log != null) {
            log.mo3463e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static ILog getLog() {
        return log;
    }

    /* renamed from: i */
    public static void m290i(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(2) && log != null) {
            log.mo3465i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static boolean isPrintLog(int i) {
        if (isPrintLog && log != null) {
            return log.isPrintLog(i);
        }
        return false;
    }

    public static void setLevel(int i) {
        if (log != null) {
            log.setLogLevel(i);
        }
    }

    public static void setLog(ILog iLog) {
        if (iLog != null) {
            if ((canUseTlog || !iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) && iLog.isValid()) {
                log = iLog;
            }
        }
    }

    public static void setPrintLog(boolean z) {
        isPrintLog = z;
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        if (!z) {
            canUseTlog = false;
            log = logcat;
            return;
        }
        canUseTlog = true;
    }

    /* renamed from: w */
    public static void m292w(String str, String str2, String str3, Object... objArr) {
        if (isPrintLog(3) && log != null) {
            log.mo3469w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    /* renamed from: e */
    public static void m288e(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (isPrintLog(4) && log != null) {
            log.mo3464e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }

    /* renamed from: w */
    public static void m291w(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (isPrintLog(3) && log != null) {
            log.mo3470w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }
}
