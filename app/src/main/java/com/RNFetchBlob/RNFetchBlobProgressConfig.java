package com.RNFetchBlob;

public class RNFetchBlobProgressConfig {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f14743OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReportType f14744OooO00o = ReportType.Download;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f14745OooO00o = false;
    public int OooO0O0 = -1;
    public int OooO0OO = -1;

    public enum ReportType {
        Upload,
        Download
    }

    public RNFetchBlobProgressConfig(boolean z, int i, int i2, ReportType reportType) {
        this.f14745OooO00o = z;
        this.OooO0OO = i;
        this.f14744OooO00o = reportType;
        this.OooO0O0 = i2;
    }

    public boolean OooO00o(float f) {
        int i = this.OooO0O0;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.OooO00o);
        if (System.currentTimeMillis() - this.f14743OooO00o > ((long) this.OooO0OO) && this.f14745OooO00o && z2) {
            z = true;
        }
        if (z) {
            this.OooO00o++;
            this.f14743OooO00o = System.currentTimeMillis();
        }
        return z;
    }
}
