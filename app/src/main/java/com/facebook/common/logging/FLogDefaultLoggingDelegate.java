package com.facebook.common.logging;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;

public class FLogDefaultLoggingDelegate implements LoggingDelegate {
    public static final FLogDefaultLoggingDelegate sInstance = new FLogDefaultLoggingDelegate();
    public String mApplicationTag = "unknown";
    public int mMinimumLoggingLevel = 5;

    public static FLogDefaultLoggingDelegate getInstance() {
        return sInstance;
    }

    public static String getMsg(String str, Throwable th) {
        return str + '\n' + getStackTraceString(th);
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private String prefixTag(String str) {
        if (this.mApplicationTag == null) {
            return str;
        }
        return this.mApplicationTag + Constants.COLON_SEPARATOR + str;
    }

    private void println(int i, String str, String str2) {
        Log.println(i, prefixTag(str), str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: d */
    public void mo5137d(String str, String str2) {
        println(3, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: e */
    public void mo5139e(String str, String str2) {
        println(6, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: i */
    public void mo5142i(String str, String str2) {
        println(4, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public boolean isLoggable(int i) {
        return this.mMinimumLoggingLevel <= i;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void log(int i, String str, String str2) {
        println(i, str, str2);
    }

    public void setApplicationTag(String str) {
        this.mApplicationTag = str;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: v */
    public void mo5148v(String str, String str2) {
        println(2, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: w */
    public void mo5150w(String str, String str2) {
        println(5, str, str2);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void wtf(String str, String str2) {
        println(6, str, str2);
    }

    private void println(int i, String str, String str2, Throwable th) {
        Log.println(i, prefixTag(str), getMsg(str2, th));
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: d */
    public void mo5138d(String str, String str2, Throwable th) {
        println(3, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: e */
    public void mo5140e(String str, String str2, Throwable th) {
        println(6, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: i */
    public void mo5143i(String str, String str2, Throwable th) {
        println(4, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: v */
    public void mo5149v(String str, String str2, Throwable th) {
        println(2, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    /* renamed from: w */
    public void mo5151w(String str, String str2, Throwable th) {
        println(5, str, str2, th);
    }

    @Override // com.facebook.common.logging.LoggingDelegate
    public void wtf(String str, String str2, Throwable th) {
        println(6, str, str2, th);
    }
}
