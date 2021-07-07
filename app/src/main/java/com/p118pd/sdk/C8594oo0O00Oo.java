package com.p118pd.sdk;

import android.content.Context;
import com.p118pd.sdk.C8573oo00oo;

/* renamed from: com.pd.sdk.oo0O00Oo  reason: case insensitive filesystem */
public class C8594oo0O00Oo {

    /* renamed from: com.pd.sdk.oo0O00Oo$OooO00o */
    public static class OooO00o {
        public Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C8573oo00oo.OooO0O0 f21706OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C8580oo00ooOo f21707OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f21708OooO00o;
        public C8573oo00oo.OooO0O0 OooO0O0;
        public C8573oo00oo.OooO0O0 OooO0OO;
        public C8573oo00oo.OooO0O0 OooO0Oo;

        public OooO00o(Context context) {
            if (context != null) {
                this.OooO00o = context.getApplicationContext();
            }
            this.f21706OooO00o = new C8573oo00oo.OooO0O0();
            this.OooO0O0 = new C8573oo00oo.OooO0O0();
            this.OooO0OO = new C8573oo00oo.OooO0O0();
            this.OooO0Oo = new C8573oo00oo.OooO0O0();
        }

        public OooO00o OooO00o(int i) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setAutoReportThreshold is execute");
            this.OooO0O0.OooO00o(i);
            this.f21706OooO00o.OooO00o(i);
            this.OooO0OO.OooO00o(i);
            this.OooO0Oo.OooO00o(i);
            return this;
        }

        public OooO00o OooO00o(int i, String str) {
            C8573oo00oo.OooO0O0 oooO0O0;
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
            if (i == 0) {
                oooO0O0 = this.OooO0O0;
            } else if (i == 1) {
                oooO0O0 = this.f21706OooO00o;
            } else if (i != 3) {
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "Builder.setCollectURL(int type,String collectURL): invalid type!");
                return this;
            } else {
                oooO0O0 = this.OooO0OO;
            }
            oooO0O0.OooO0OO(str);
            return this;
        }

        public OooO00o OooO00o(C8580oo00ooOo oo00oooo) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setEnableCollectLog (LogConfig logConfig) is execute.");
            this.f21707OooO00o = oo00oooo;
            return this;
        }

        public OooO00o OooO00o(String str) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "setAndroidId(String androidId) is execute.");
            this.OooO0O0.OooO00o(str);
            this.f21706OooO00o.OooO00o(str);
            this.OooO0OO.OooO00o(str);
            this.OooO0Oo.OooO00o(str);
            return this;
        }

        @Deprecated
        public OooO00o OooO00o(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setEnableAndroidID(boolean reportAndroidID) is execute.");
            this.f21706OooO00o.OooO00o(z);
            this.OooO0O0.OooO00o(z);
            this.OooO0OO.OooO00o(z);
            this.OooO0Oo.OooO00o(z);
            return this;
        }

        public void OooO00o() {
            if (this.OooO00o == null) {
                AbstractC8536oo00OO0O.OooO0Oo("HianalyticsSDK", "analyticsConf create(): context is null,create failed!");
                return;
            }
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.create() is execute.");
            C8573oo00oo OooO00o2 = this.f21706OooO00o.OooO00o();
            C8573oo00oo OooO00o3 = this.OooO0O0.OooO00o();
            C8573oo00oo OooO00o4 = this.OooO0OO.OooO00o();
            C8573oo00oo OooO00o5 = this.OooO0Oo.OooO00o();
            C8588oo0O0000 oo0o0000 = new C8588oo0O0000("_default_config_tag");
            oo0o0000.OooO0OO(OooO00o3);
            oo0o0000.OooO00o(OooO00o2);
            oo0o0000.OooO0O0(OooO00o4);
            oo0o0000.OooO0Oo(OooO00o5);
            C8582oo00oooO.OooO00o().OooO00o(this.OooO00o);
            C8583oo00oooo.OooO00o().OooO00o(this.OooO00o);
            C8582oo00oooO.OooO00o().OooO00o("_default_config_tag", oo0o0000);
            AbstractC8581oo00ooo.m20224OooO00o(this.f21708OooO00o);
            C8582oo00oooO.OooO00o().OooO00o(this.OooO00o, this.f21707OooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m20241OooO00o(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.refresh() is execute.");
            C8573oo00oo OooO00o2 = this.f21706OooO00o.OooO00o();
            C8573oo00oo OooO00o3 = this.OooO0O0.OooO00o();
            C8573oo00oo OooO00o4 = this.OooO0OO.OooO00o();
            C8573oo00oo OooO00o5 = this.OooO0Oo.OooO00o();
            C8588oo0O0000 OooO00o6 = C8582oo00oooO.OooO00o().OooO00o("_default_config_tag");
            if (OooO00o6 == null) {
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "HiAnalyticsInstance.Builder.Refresh(): calling refresh before create. TAG: _default_config_tag has no instance. ");
                return;
            }
            OooO00o6.OooO00o(1, OooO00o2);
            OooO00o6.OooO00o(0, OooO00o3);
            OooO00o6.OooO00o(3, OooO00o4);
            OooO00o6.OooO00o(2, OooO00o5);
            if (z) {
                C8582oo00oooO.OooO00o().m20230OooO00o("_default_config_tag");
            }
            C8582oo00oooO.OooO00o().OooO00o(this.f21707OooO00o, z);
            AbstractC8581oo00ooo.m20224OooO00o(this.f21708OooO00o);
        }

        public OooO00o OooO0O0(int i) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setCacheExpireTime is execute");
            this.OooO0O0.OooO0O0(i);
            this.f21706OooO00o.OooO0O0(i);
            this.OooO0OO.OooO0O0(i);
            this.OooO0Oo.OooO0O0(i);
            return this;
        }

        public OooO00o OooO0O0(String str) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setAppID is execute");
            this.f21708OooO00o = str;
            return this;
        }

        @Deprecated
        public OooO00o OooO0O0(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
            this.OooO0O0.OooO0O0(z);
            this.f21706OooO00o.OooO0O0(z);
            this.OooO0OO.OooO0O0(z);
            this.OooO0Oo.OooO0O0(z);
            return this;
        }

        public OooO00o OooO0OO(String str) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setChannel(String channel) is execute.");
            this.OooO0O0.OooO0O0(str);
            this.f21706OooO00o.OooO0O0(str);
            this.OooO0OO.OooO0O0(str);
            this.OooO0Oo.OooO0O0(str);
            return this;
        }

        public OooO00o OooO0OO(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setEnableMccMnc(boolean enableMccMnc) is execute.");
            this.f21706OooO00o.OooO0OO(z);
            this.OooO0O0.OooO0OO(z);
            this.OooO0OO.OooO0OO(z);
            this.OooO0Oo.OooO0OO(z);
            return this;
        }

        public OooO00o OooO0Oo(String str) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "setIMEI(String imei) is execute.");
            this.OooO0O0.OooO0Oo(str);
            this.f21706OooO00o.OooO0Oo(str);
            this.OooO0OO.OooO0Oo(str);
            this.OooO0Oo.OooO0Oo(str);
            return this;
        }

        @Deprecated
        public OooO00o OooO0Oo(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setEnableSN(boolean isReportSN) is execute.");
            this.f21706OooO00o.OooO0Oo(z);
            this.OooO0O0.OooO0Oo(z);
            this.OooO0OO.OooO0Oo(z);
            this.OooO0Oo.OooO0Oo(z);
            return this;
        }

        public OooO00o OooO0o(String str) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "setUDID(String udid) is execute.");
            this.OooO0O0.OooO0o(str);
            this.f21706OooO00o.OooO0o(str);
            this.OooO0OO.OooO0o(str);
            this.OooO0Oo.OooO0o(str);
            return this;
        }

        @Deprecated
        public OooO00o OooO0o(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
            this.f21706OooO00o.OooO0o(z);
            this.OooO0O0.OooO0o(z);
            this.OooO0OO.OooO0o(z);
            this.OooO0Oo.OooO0o(z);
            return this;
        }

        public OooO00o OooO0o0(String str) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "setSN(String sn) is execute.");
            this.OooO0O0.OooO0o0(str);
            this.f21706OooO00o.OooO0o0(str);
            this.OooO0OO.OooO0o0(str);
            this.OooO0Oo.OooO0o0(str);
            return this;
        }

        public OooO00o OooO0o0(boolean z) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "setEnableSession(boolean enableSession) is execute.");
            this.OooO0O0.OooO0o0(z);
            return this;
        }

        public OooO00o OooO0oO(boolean z) {
            AbstractC8536oo00OO0O.OooO00o("HianalyticsSDK", "Builder.setEnableUUID() is executed.");
            this.OooO0O0.OooO0oO(z);
            this.f21706OooO00o.OooO0oO(z);
            this.OooO0OO.OooO0oO(z);
            this.OooO0Oo.OooO0oO(z);
            return this;
        }
    }
}
