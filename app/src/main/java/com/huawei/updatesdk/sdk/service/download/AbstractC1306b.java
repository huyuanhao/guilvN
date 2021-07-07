package com.huawei.updatesdk.sdk.service.download;

import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;

/* renamed from: com.huawei.updatesdk.sdk.service.download.b */
public abstract class AbstractC1306b {

    /* renamed from: com.huawei.updatesdk.sdk.service.download.b$a */
    public static class C1307a {

        /* renamed from: a */
        public boolean f1487a;

        /* renamed from: b */
        public long f1488b;

        /* renamed from: c */
        public long f1489c;

        /* renamed from: d */
        public String f1490d;

        /* renamed from: a */
        public void mo15949a(long j) {
            this.f1488b = j;
        }

        /* renamed from: a */
        public void mo15950a(String str) {
            this.f1490d = str;
        }

        /* renamed from: a */
        public void mo15951a(boolean z) {
            this.f1487a = z;
        }

        /* renamed from: a */
        public boolean mo15952a() {
            return this.f1487a;
        }

        /* renamed from: b */
        public long mo15953b() {
            return this.f1488b;
        }

        /* renamed from: c */
        public String mo15954c() {
            return this.f1490d;
        }

        public String toString() {
            return "DiskInfo [isEnough=" + this.f1487a + ", internalStorageSpace=" + this.f1488b + ", externalStorageSpace=" + this.f1489c + ", availableStoragePath=" + this.f1490d + "]";
        }
    }

    /* renamed from: a */
    public abstract C1307a mo15946a(DownloadTask downloadTask);

    /* renamed from: a */
    public void mo15947a(DownloadTask downloadTask, C1307a aVar) {
    }

    /* renamed from: a */
    public void mo15948a(DownloadTask downloadTask, String str) {
    }
}
