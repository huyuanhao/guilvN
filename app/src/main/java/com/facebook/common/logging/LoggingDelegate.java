package com.facebook.common.logging;

public interface LoggingDelegate {
    /* renamed from: d */
    void mo5137d(String str, String str2);

    /* renamed from: d */
    void mo5138d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo5139e(String str, String str2);

    /* renamed from: e */
    void mo5140e(String str, String str2, Throwable th);

    int getMinimumLoggingLevel();

    /* renamed from: i */
    void mo5142i(String str, String str2);

    /* renamed from: i */
    void mo5143i(String str, String str2, Throwable th);

    boolean isLoggable(int i);

    void log(int i, String str, String str2);

    void setMinimumLoggingLevel(int i);

    /* renamed from: v */
    void mo5148v(String str, String str2);

    /* renamed from: v */
    void mo5149v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo5150w(String str, String str2);

    /* renamed from: w */
    void mo5151w(String str, String str2, Throwable th);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th);
}
