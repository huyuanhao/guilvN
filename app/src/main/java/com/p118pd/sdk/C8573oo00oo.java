package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oo00oo  reason: case insensitive filesystem */
public class C8573oo00oo {
    public C8482oOooooOo OooO00o;

    /* renamed from: com.pd.sdk.oo00oo$OooO0O0 */
    public static final class OooO0O0 {
        public int OooO00o = 10;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f21677OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f21678OooO00o;
        public int OooO0O0 = 7;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f21679OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f21680OooO0O0;
        public String OooO0OO;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f21681OooO0OO;
        public String OooO0Oo;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public boolean f21682OooO0Oo;
        public String OooO0o;

        /* renamed from: OooO0o  reason: collision with other field name */
        public boolean f21683OooO0o;
        public String OooO0o0;

        /* renamed from: OooO0o0  reason: collision with other field name */
        public boolean f21684OooO0o0;
        public boolean OooO0oO = true;

        public OooO0O0 OooO00o(int i) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setAutoReportThreshold() is executed.");
            this.OooO00o = C8591oo0O00O.OooO00o(i, 500, 10);
            return this;
        }

        public OooO0O0 OooO00o(String str) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setAndroidId() is executed.");
            if (!C8591oo0O00O.OooO00o("AndroidId_CustomSet", str, 4096)) {
                str = "";
            }
            this.OooO0o0 = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO00o(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableAndroidID() is executed.");
            this.f21682OooO0Oo = z;
            return this;
        }

        public C8573oo00oo OooO00o() {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.build() is executed.");
            return new C8573oo00oo(this);
        }

        public OooO0O0 OooO0O0(int i) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setCacheExpireTime() is executed.");
            this.OooO0O0 = C8591oo0O00O.OooO00o(i, 7, 2);
            return this;
        }

        public OooO0O0 OooO0O0(String str) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setChannel() is executed.");
            if (!C8591oo0O00O.OooO00o("channel", str, 256)) {
                str = "";
            }
            this.f21677OooO00o = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO0O0(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableImei() is executed.");
            this.f21678OooO00o = z;
            return this;
        }

        public OooO0O0 OooO0OO(String str) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setCollectURL() is executed.");
            if (!C8591oo0O00O.OooO00o(str, "(https://)[a-zA-Z0-9-_]+[\\.a-zA-Z0-9_-]*(\\.hicloud\\.com)(:(\\d){2,5})?(\\\\|\\/)?")) {
                str = "";
            }
            if (str.endsWith(C8932ooOOO0o.OooO0OO) || str.endsWith("\\")) {
                str = str.substring(0, str.length() - 1);
            }
            this.f21679OooO0O0 = str;
            return this;
        }

        public OooO0O0 OooO0OO(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableMccMnc() is executed.");
            this.f21684OooO0o0 = z;
            return this;
        }

        public OooO0O0 OooO0Oo(String str) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setImei() is executed.");
            if (!C8591oo0O00O.OooO00o("IMEI_CustomSet", str, 4096)) {
                str = "";
            }
            this.OooO0OO = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO0Oo(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableSN() is executed.");
            this.f21680OooO0O0 = z;
            return this;
        }

        public OooO0O0 OooO0o(String str) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setUdid() is executed.");
            if (!C8591oo0O00O.OooO00o("Udid_CustomSet", str, 4096)) {
                str = "";
            }
            this.OooO0Oo = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO0o(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableUDID() is executed.");
            this.f21681OooO0OO = z;
            return this;
        }

        public OooO0O0 OooO0o0(String str) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setSN() is executed.");
            if (!C8591oo0O00O.OooO00o("SN_CustomSet", str, 4096)) {
                str = "";
            }
            this.OooO0o = str;
            return this;
        }

        public OooO0O0 OooO0o0(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableSession() is executed.");
            this.f21683OooO0o = z;
            return this;
        }

        public OooO0O0 OooO0oO(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableUUID() is executed.");
            this.OooO0oO = z;
            return this;
        }
    }

    public C8573oo00oo(OooO0O0 oooO0O0) {
        this.OooO00o = new C8482oOooooOo();
        OooO00o(oooO0O0);
        OooO00o(oooO0O0.f21677OooO00o);
        OooO0O0(oooO0O0.f21679OooO0O0);
        OooO0O0(oooO0O0.f21684OooO0o0);
        OooO0OO(oooO0O0.f21683OooO0o);
        OooO0O0(oooO0O0.OooO00o);
        OooO00o(oooO0O0.OooO0O0);
        OooO00o(oooO0O0.OooO0oO);
    }

    public C8573oo00oo(C8573oo00oo oo00oo) {
        this.OooO00o = new C8482oOooooOo(oo00oo.OooO00o);
    }

    private void OooO00o(int i) {
        this.OooO00o.OooO00o(i);
    }

    private void OooO00o(OooO0O0 oooO0O0) {
        C8479oOooooO OooO00o2 = this.OooO00o.m20157OooO00o();
        OooO00o2.OooO00o(oooO0O0.f21678OooO00o);
        OooO00o2.OooO00o(oooO0O0.OooO0OO);
        OooO00o2.OooO0Oo(oooO0O0.f21682OooO0Oo);
        OooO00o2.OooO0OO(oooO0O0.OooO0o0);
        OooO00o2.OooO0O0(oooO0O0.f21680OooO0O0);
        OooO00o2.OooO0Oo(oooO0O0.OooO0o);
        OooO00o2.OooO0OO(oooO0O0.f21681OooO0OO);
        OooO00o2.OooO0O0(oooO0O0.OooO0Oo);
    }

    private void OooO00o(String str) {
        this.OooO00o.OooO00o(str);
    }

    private void OooO0O0(int i) {
        this.OooO00o.OooO0O0(i);
    }

    private void OooO0O0(String str) {
        this.OooO00o.OooO0O0(str);
    }

    private void OooO0O0(boolean z) {
        this.OooO00o.OooO0O0(z);
    }

    private void OooO0OO(boolean z) {
        this.OooO00o.OooO00o(z);
    }

    public void OooO00o(boolean z) {
        this.OooO00o.OooO0OO(z);
    }
}
