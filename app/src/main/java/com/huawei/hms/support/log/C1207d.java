package com.huawei.hms.support.log;

import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.huawei.hms.support.log.d */
public class C1207d {

    /* renamed from: a */
    public final StringBuilder f1312a = new StringBuilder();

    /* renamed from: b */
    public String f1313b = null;

    /* renamed from: c */
    public String f1314c = "HMS";

    /* renamed from: d */
    public int f1315d = 0;

    /* renamed from: e */
    public long f1316e = 0;

    /* renamed from: f */
    public long f1317f = 0;

    /* renamed from: g */
    public String f1318g;

    /* renamed from: h */
    public int f1319h;

    /* renamed from: i */
    public int f1320i;

    /* renamed from: j */
    public int f1321j = 0;

    public C1207d(int i, String str, int i2, String str2) {
        this.f1321j = i;
        this.f1313b = str;
        this.f1315d = i2;
        if (str2 != null) {
            this.f1314c = str2;
        }
        m1338c();
    }

    /* renamed from: a */
    public static String m1335a(int i) {
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i != 5) {
            return i != 6 ? String.valueOf(i) : ExifInterface.o000oo00;
        }
        return ExifInterface.o000oo0;
    }

    /* renamed from: c */
    private C1207d m1338c() {
        this.f1316e = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f1317f = currentThread.getId();
        this.f1319h = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.f1321j;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.f1318g = stackTraceElement.getFileName();
            this.f1320i = stackTraceElement.getLineNumber();
        }
        return this;
    }

    /* renamed from: b */
    public String mo15720b() {
        StringBuilder sb = new StringBuilder();
        m1337b(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m1336a(sb);
        m1337b(sb);
        return sb.toString();
    }

    /* renamed from: a */
    public <T> C1207d mo15717a(T t) {
        this.f1312a.append((Object) t);
        return this;
    }

    /* renamed from: a */
    public C1207d mo15718a(Throwable th) {
        mo15717a((Object) '\n').mo15717a(Log.getStackTraceString(th));
        return this;
    }

    /* renamed from: b */
    private StringBuilder m1337b(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f1312a.toString());
        return sb;
    }

    /* renamed from: a */
    public String mo15719a() {
        StringBuilder sb = new StringBuilder();
        m1336a(sb);
        return sb.toString();
    }

    /* renamed from: a */
    private StringBuilder m1336a(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f1316e)));
        String a = m1335a(this.f1315d);
        sb.append(' ');
        sb.append(a);
        sb.append('/');
        sb.append(this.f1314c);
        sb.append('/');
        sb.append(this.f1313b);
        sb.append(' ');
        sb.append(this.f1319h);
        sb.append(':');
        sb.append(this.f1317f);
        sb.append(' ');
        sb.append(this.f1318g);
        sb.append(':');
        sb.append(this.f1320i);
        sb.append(']');
        return sb;
    }
}
