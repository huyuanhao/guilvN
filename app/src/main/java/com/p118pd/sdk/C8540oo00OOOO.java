package com.p118pd.sdk;

import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.pd.sdk.oo00OOOO  reason: case insensitive filesystem */
public class C8540oo00OOOO {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f21657OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21658OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final StringBuilder f21659OooO00o = new StringBuilder();
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f21660OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f21661OooO0O0 = "HA";
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public String f21662OooO0OO;
    public int OooO0Oo = 0;

    public C8540oo00OOOO(int i, String str, int i2, String str2) {
        this.OooO0Oo = i;
        this.f21658OooO00o = str;
        this.OooO00o = i2;
        if (str2 != null) {
            this.f21661OooO0O0 = str2;
        }
        OooO00o();
    }

    private C8540oo00OOOO OooO00o() {
        this.f21657OooO00o = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.f21660OooO0O0 = currentThread.getId();
        this.OooO0O0 = Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        int length = stackTrace.length;
        int i = this.OooO0Oo;
        if (length > i) {
            StackTraceElement stackTraceElement = stackTrace[i];
            this.f21662OooO0OO = stackTraceElement.getFileName();
            this.OooO0OO = stackTraceElement.getLineNumber();
        }
        return this;
    }

    private StringBuilder OooO00o(StringBuilder sb) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        sb.append('[');
        sb.append(simpleDateFormat.format(Long.valueOf(this.f21657OooO00o)));
        String OooO00o2 = AbstractC8539oo00OOO0.OooO00o(this.OooO00o);
        sb.append(' ');
        sb.append(OooO00o2);
        sb.append('/');
        sb.append(this.f21658OooO00o);
        sb.append('/');
        sb.append(this.f21661OooO0O0);
        sb.append(' ');
        sb.append(this.OooO0O0);
        sb.append(':');
        sb.append(this.f21660OooO0O0);
        sb.append(' ');
        sb.append(this.f21662OooO0OO);
        sb.append(':');
        sb.append(this.OooO0OO);
        sb.append(']');
        return sb;
    }

    private StringBuilder OooO0O0(StringBuilder sb) {
        sb.append(' ');
        sb.append(this.f21659OooO00o.toString());
        return sb;
    }

    public <T> C8540oo00OOOO OooO00o(T t) {
        this.f21659OooO00o.append((Object) t);
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20206OooO00o() {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb);
        return sb.toString();
    }

    public String OooO0O0() {
        StringBuilder sb = new StringBuilder();
        OooO0O0(sb);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(4096);
        OooO00o(sb);
        OooO0O0(sb);
        return sb.toString();
    }
}
