package com.p118pd.sdk;

import java.util.Arrays;

/* renamed from: com.pd.sdk.oo00ooOo  reason: case insensitive filesystem */
public class C8580oo00ooOo {
    public C8488oo00000 OooO00o;

    /* renamed from: com.pd.sdk.oo00ooOo$OooO0O0 */
    public static final class OooO0O0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f21689OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f21690OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String[] f21691OooO00o = new String[0];
        public int OooO0O0 = 3;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f21692OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f21693OooO0O0;
        public int OooO0OO = 5;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public String f21694OooO0OO = "";

        /* renamed from: OooO0OO  reason: collision with other field name */
        public boolean f21695OooO0OO;
        public int OooO0Oo = 0;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public String f21696OooO0Oo = "";
        public String OooO0o0 = "";

        public OooO0O0(int i, String str, String str2) {
            this.OooO00o = i;
            this.f21689OooO00o = str;
            this.f21692OooO0O0 = str2;
        }

        public OooO0O0 OooO00o(int i) {
            this.OooO0OO = i;
            return this;
        }

        public OooO0O0 OooO00o(int i, String[] strArr) {
            this.OooO0Oo = i;
            if (strArr != null) {
                this.f21691OooO00o = (String[]) strArr.clone();
            } else {
                this.f21691OooO00o = new String[0];
            }
            return this;
        }

        public OooO0O0 OooO00o(String str) {
            if (!C8591oo0O00O.OooO00o("logimei", str, 4096)) {
                str = "";
            }
            this.f21694OooO0OO = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO00o(boolean z) {
            this.f21690OooO00o = z;
            return this;
        }

        public C8580oo00ooOo OooO00o() {
            return new C8580oo00ooOo(this);
        }

        public OooO0O0 OooO0O0(int i) {
            this.OooO0O0 = i;
            return this;
        }

        public OooO0O0 OooO0O0(String str) {
            if (!C8591oo0O00O.OooO00o("logsn", str, 4096)) {
                str = "";
            }
            this.OooO0o0 = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO0O0(boolean z) {
            this.f21695OooO0OO = z;
            return this;
        }

        public OooO0O0 OooO0OO(String str) {
            if (!C8591oo0O00O.OooO00o("logudid", str, 4096)) {
                str = "";
            }
            this.f21696OooO0Oo = str;
            return this;
        }

        @Deprecated
        public OooO0O0 OooO0OO(boolean z) {
            this.f21693OooO0O0 = z;
            return this;
        }
    }

    public C8580oo00ooOo(OooO0O0 oooO0O0) {
        this.OooO00o = new C8488oo00000();
        OooO0OO(oooO0O0.OooO00o);
        OooO0O0(oooO0O0.OooO0O0);
        OooO00o(oooO0O0.OooO0OO);
        OooO0o0(oooO0O0.f21689OooO00o);
        OooO0OO(oooO0O0.f21692OooO0O0);
        OooO00o(oooO0O0.f21691OooO00o);
        OooO0Oo(oooO0O0.OooO0Oo);
        OooO00o(oooO0O0.f21690OooO00o);
        OooO0OO(oooO0O0.f21693OooO0O0);
        OooO0O0(oooO0O0.f21695OooO0OO);
        OooO00o(oooO0O0.f21694OooO0OO);
        OooO0Oo(oooO0O0.f21696OooO0Oo);
        OooO0O0(oooO0O0.OooO0o0);
    }

    private void OooO00o(int i) {
        this.OooO00o.OooO0OO(C8591oo0O00O.OooO00o(i, 10, 5));
    }

    private void OooO00o(String str) {
        this.OooO00o.OooO0OO(str);
    }

    private void OooO00o(boolean z) {
        this.OooO00o.OooO00o(z);
    }

    private void OooO00o(String[] strArr) {
        if (strArr == null) {
            this.OooO00o.OooO00o(new String[0]);
        } else if (Arrays.toString(strArr).length() > 204800) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "The throwableInfo parameter is too long!");
            this.OooO00o.OooO00o(new String[0]);
        } else {
            this.OooO00o.OooO00o((String[]) strArr.clone());
        }
    }

    private void OooO0O0(int i) {
        this.OooO00o.OooO0O0(C8591oo0O00O.OooO00o(i, 10, 3));
    }

    private void OooO0O0(String str) {
        this.OooO00o.OooO0o0(str);
    }

    private void OooO0O0(boolean z) {
        this.OooO00o.OooO0OO(z);
    }

    private void OooO0OO(int i) {
        if (3 > i || i > 6) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "HiAnalyticsLogConfig.setMinLogLevel(): minLogLevel: " + i + " invalid. Replaced with default value");
            this.OooO00o.OooO00o(4);
            return;
        }
        this.OooO00o.OooO00o(i);
    }

    private void OooO0OO(String str) {
        String OooO00o2 = C8591oo0O00O.OooO00o("logUrl", str, "(https://)[a-zA-Z0-9-_]+[\\.a-zA-Z0-9_-]*(\\.hicloud\\.com)(:(\\d){2,5})?(\\\\|\\/)?", "");
        if (OooO00o2.endsWith(C8932ooOOO0o.OooO0OO) || OooO00o2.endsWith("\\")) {
            OooO00o2 = OooO00o2.substring(0, OooO00o2.length() - 1);
        }
        this.OooO00o.OooO0O0(OooO00o2);
    }

    private void OooO0OO(boolean z) {
        this.OooO00o.OooO0O0(z);
    }

    private void OooO0Oo(int i) {
        if (i == 0 || i == 1) {
            this.OooO00o.OooO0Oo(i);
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", "The throwableFlag is wrong. Set to default value.");
        this.OooO00o.OooO0Oo(0);
    }

    private void OooO0Oo(String str) {
        this.OooO00o.OooO0Oo(str);
    }

    private void OooO0o0(String str) {
        this.OooO00o.OooO00o(C8591oo0O00O.OooO00o(str, 999, 100));
    }

    public C8488oo00000 OooO00o() {
        return this.OooO00o;
    }
}
