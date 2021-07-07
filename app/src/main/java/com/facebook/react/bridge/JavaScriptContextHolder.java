package com.facebook.react.bridge;

import javax.annotation.concurrent.GuardedBy;

public class JavaScriptContextHolder {
    @GuardedBy("this")
    public long mContext;

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    public synchronized void clear() {
        this.mContext = 0;
    }

    @GuardedBy("this")
    public long get() {
        return this.mContext;
    }
}
