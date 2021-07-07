package com.p118pd.sdk;

import android.text.TextUtils;

/* renamed from: com.pd.sdk.oOooOooo  reason: case insensitive filesystem */
public class C8458oOooOooo {
    public C8462oOooo000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8573oo00oo f21577OooO00o;

    /* renamed from: com.pd.sdk.oOooOooo$OooO0O0 */
    public static final class OooO0O0 {
        public int OooO00o = 1440;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C8573oo00oo f21578OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f21579OooO00o;
        public String OooO0O0;
        public String OooO0OO;

        public OooO0O0 OooO00o(int i) {
            AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", "setExpSyncInterval() is execute");
            if (i < 10) {
                AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", " setExpSyncInterval : expSyncInterval check failed");
                i = 10;
            }
            this.OooO00o = i;
            return this;
        }

        public OooO0O0 OooO00o(C8573oo00oo oo00oo) {
            AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", "setHiAnalyticsConfig() is execute");
            this.f21578OooO00o = oo00oo;
            return this;
        }

        public OooO0O0 OooO00o(String str) {
            AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", "setSecretKey() is execute");
            if (TextUtils.isEmpty(str) || str.length() > 200) {
                AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", " setSecretKey : secretKey check failed");
                str = "";
            }
            this.f21579OooO00o = str;
            return this;
        }

        public C8458oOooOooo OooO00o() {
            return new C8458oOooOooo(this);
        }

        public OooO0O0 OooO0O0(String str) {
            AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", "setUrl() is execute");
            if (!C8591oo0O00O.OooO00o(str, "(https://abn-)[a-zA-Z0-9]{1,10}(\\.dt\\.hicloud\\.com)(:(\\d){2,5})?(\\\\|\\/)?")) {
                str = "";
            }
            this.OooO0O0 = str;
            return this;
        }

        public OooO0O0 OooO0OO(String str) {
            AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", "setUserId() is execute");
            if (TextUtils.isEmpty(str) || str.length() > 128) {
                AbstractC8536oo00OO0O.OooO0O0("ABTest/ABTestConfig", " setUserId : userId check failed");
                str = "";
            }
            this.OooO0OO = str;
            return this;
        }
    }

    public C8458oOooOooo(OooO0O0 oooO0O0) {
        this.f21577OooO00o = oooO0O0.f21578OooO00o;
        C8462oOooo000 ooooo000 = new C8462oOooo000();
        this.OooO00o = ooooo000;
        ooooo000.OooO0O0(oooO0O0.OooO0O0);
        this.OooO00o.OooO00o(oooO0O0.f21579OooO00o);
        this.OooO00o.OooO0OO(oooO0O0.OooO0OO);
        this.OooO00o.OooO00o(oooO0O0.OooO00o);
    }

    public C8462oOooo000 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8573oo00oo m20113OooO00o() {
        return this.f21577OooO00o;
    }
}
