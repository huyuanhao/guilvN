package com.yongchun.library.model;

import java.io.Serializable;

public class LocalMedia implements Serializable {
    public long duration;
    public long lastUpdateAt;
    public String path;

    public LocalMedia(String str, long j, long j2) {
        this.path = str;
        this.duration = j2;
        this.lastUpdateAt = j;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getLastUpdateAt() {
        return this.lastUpdateAt;
    }

    public String getPath() {
        return this.path;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setLastUpdateAt(long j) {
        this.lastUpdateAt = j;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public LocalMedia(String str) {
        this.path = str;
    }
}
