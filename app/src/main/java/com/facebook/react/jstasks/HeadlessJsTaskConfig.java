package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;

public class HeadlessJsTaskConfig {
    public final boolean mAllowedInForeground;
    public final WritableMap mData;
    public final String mTaskKey;
    public final long mTimeout;

    public HeadlessJsTaskConfig(String str, WritableMap writableMap) {
        this(str, writableMap, 0, false);
    }

    public WritableMap getData() {
        return this.mData;
    }

    public String getTaskKey() {
        return this.mTaskKey;
    }

    public long getTimeout() {
        return this.mTimeout;
    }

    public boolean isAllowedInForeground() {
        return this.mAllowedInForeground;
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j) {
        this(str, writableMap, j, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j, boolean z) {
        this.mTaskKey = str;
        this.mData = writableMap;
        this.mTimeout = j;
        this.mAllowedInForeground = z;
    }
}
