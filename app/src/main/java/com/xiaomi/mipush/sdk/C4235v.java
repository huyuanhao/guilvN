package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4274az;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4570r;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.service.C4605ah;
import java.lang.Thread;

/* renamed from: com.xiaomi.mipush.sdk.v */
public class C4235v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final Object f11324a = new Object();

    /* renamed from: a */
    public static final String[] f11325a = {"com.xiaomi.channel.commonutils", "com.xiaomi.common.logger", "com.xiaomi.measite.smack", "com.xiaomi.metoknlp", "com.xiaomi.mipush.sdk", "com.xiaomi.network", "com.xiaomi.push", "com.xiaomi.slim", "com.xiaomi.smack", "com.xiaomi.stats", "com.xiaomi.tinyData", "com.xiaomi.xmpush.thrift", "com.xiaomi.clientreport"};

    /* renamed from: a */
    public Context f11326a;

    /* renamed from: a */
    public SharedPreferences f11327a;

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f11328a;

    public C4235v(Context context) {
        this(context, Thread.getDefaultUncaughtExceptionHandler());
    }

    public C4235v(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f11326a = context;
        this.f11328a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private String m11597a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(3, stackTrace.length); i++) {
            sb.append(stackTrace[i].toString() + "\r\n");
        }
        String sb2 = sb.toString();
        return TextUtils.isEmpty(sb2) ? "" : C4285bf.m11800a(sb2);
    }

    /* renamed from: a */
    private void m11598a() {
        C4251ai.m11641a(this.f11326a).mo41474a(new RunnableC4236w(this));
    }

    /* renamed from: a */
    private void m11600a(Throwable th) {
        String b = m11603b(th);
        if (!TextUtils.isEmpty(b)) {
            String a = m11597a(th);
            if (!TextUtils.isEmpty(a)) {
                C4232s.m11590a(this.f11326a).mo41465a(b, a);
                if (m11601a()) {
                    m11598a();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m11601a() {
        this.f11327a = this.f11326a.getSharedPreferences("mipush_extra", 4);
        if (C4274az.m11738e(this.f11326a)) {
            if (!C4605ah.m13919a(this.f11326a).mo42661a(EnumC4499ht.Crash4GUploadSwitch.mo42043a(), true)) {
                return false;
            }
            return ((float) Math.abs((System.currentTimeMillis() / 1000) - this.f11327a.getLong("last_crash_upload_time_stamp", 0))) >= ((float) Math.max(3600, C4605ah.m13919a(this.f11326a).mo42656a(EnumC4499ht.Crash4GUploadFrequency.mo42043a(), 3600))) * 0.9f;
        } else if (!C4274az.m11737d(this.f11326a)) {
            return true;
        } else {
            return Math.abs((System.currentTimeMillis() / 1000) - this.f11327a.getLong("last_crash_upload_time_stamp", 0)) >= ((long) Math.max(60, C4605ah.m13919a(this.f11326a).mo42656a(EnumC4499ht.CrashWIFIUploadFrequency.mo42043a(), 1800)));
        }
    }

    /* renamed from: a */
    private boolean m11602a(boolean z, String str) {
        for (String str2 : f11325a) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private String m11603b(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(th.toString());
        sb.append("\r\n");
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            z = m11602a(z, stackTraceElement2);
            sb.append(stackTraceElement2);
            sb.append("\r\n");
        }
        return z ? sb.toString() : "";
    }

    /* renamed from: b */
    private void m11604b() {
        SharedPreferences sharedPreferences = this.f11326a.getSharedPreferences("mipush_extra", 4);
        this.f11327a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("last_crash_upload_time_stamp", System.currentTimeMillis() / 1000);
        C4570r.m13744a(edit);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        m11600a(th);
        synchronized (f11324a) {
            try {
                f11324a.wait(3000);
            } catch (InterruptedException e) {
                AbstractC4163b.m11303a(e);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11328a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
