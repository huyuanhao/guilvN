package com.tencent.bugly.beta.download;

import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class DownloadTask {
    public static final int COMPLETE = 1;
    public static final int DELETED = 4;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 5;
    public static final int INIT = 0;
    public static final int PAUSED = 3;
    public static final int TYPE_HOTFIX = 2;
    public static final int TYPE_UPGRADE = 1;

    /* renamed from: a */
    public String f7332a;

    /* renamed from: b */
    public String f7333b;

    /* renamed from: c */
    public String f7334c;

    /* renamed from: d */
    public List<DownloadListener> f7335d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public long f7336e;

    /* renamed from: f */
    public long f7337f;

    /* renamed from: g */
    public boolean f7338g = true;

    /* renamed from: h */
    public String f7339h = "";

    /* renamed from: i */
    public int f7340i = 0;

    /* renamed from: j */
    public int f7341j = 1;

    public DownloadTask(String str, String str2, String str3, String str4) {
        this.f7332a = str;
        this.f7333b = str2;
        this.f7334c = str3;
        this.f7339h = str4;
    }

    public void addListener(DownloadListener downloadListener) {
        if (downloadListener != null && !this.f7335d.contains(downloadListener)) {
            this.f7335d.add(downloadListener);
        }
    }

    public abstract void delete(boolean z);

    public abstract void download();

    public abstract long getCostTime();

    public int getDownloadType() {
        return this.f7341j;
    }

    public String getDownloadUrl() {
        return this.f7332a;
    }

    public String getMD5() {
        return this.f7339h;
    }

    public abstract File getSaveFile();

    public long getSavedLength() {
        return this.f7336e;
    }

    public abstract int getStatus();

    public long getTotalLength() {
        return this.f7337f;
    }

    public boolean isNeededNotify() {
        return this.f7338g;
    }

    public boolean removeListener(DownloadListener downloadListener) {
        return downloadListener != null && this.f7335d.remove(downloadListener);
    }

    public void setDownloadType(int i) {
        this.f7341j = i;
    }

    public void setNeededNotify(boolean z) {
        this.f7338g = z;
    }

    public void setSavedLength(long j) {
        this.f7336e = j;
    }

    public void setTotalLength(long j) {
        this.f7337f = j;
    }

    public abstract void stop();
}
