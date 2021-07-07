package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.UUID;

/* renamed from: com.pd.sdk.oo0OOOO  reason: case insensitive filesystem */
public class C8637oo0OOOO {
    public volatile long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f21757OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile boolean f21758OooO00o = false;

    /* renamed from: com.pd.sdk.oo0OOOO$OooO00o */
    public class OooO00o {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f21760OooO00o = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f21761OooO00o;

        public OooO00o(long j) {
            this.f21760OooO00o += "_" + j;
            this.OooO00o = j;
            this.f21761OooO00o = true;
            C8637oo0OOOO.this.f21758OooO00o = false;
        }

        private boolean OooO00o(long j, long j2) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            return (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) ? false : true;
        }

        private void OooO0O0(long j) {
            AbstractC8536oo00OO0O.OooO0O0("SessionWrapper", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f21760OooO00o = uuid;
            this.f21760OooO00o = uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            this.f21760OooO00o += "_" + j;
            this.OooO00o = j;
            this.f21761OooO00o = true;
        }

        private boolean OooO0O0(long j, long j2) {
            return j2 - j >= 1800000;
        }

        public void OooO00o(long j) {
            if (C8637oo0OOOO.this.f21758OooO00o) {
                C8637oo0OOOO.this.f21758OooO00o = false;
                OooO0O0(j);
            } else if (OooO0O0(this.OooO00o, j) || OooO00o(this.OooO00o, j)) {
                OooO0O0(j);
            } else {
                this.OooO00o = j;
                this.f21761OooO00o = false;
            }
        }
    }

    public String OooO00o() {
        OooO00o oooO00o = this.f21757OooO00o;
        if (oooO00o != null) {
            return oooO00o.f21760OooO00o;
        }
        AbstractC8536oo00OO0O.OooO0OO("SessionWrapper", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20257OooO00o() {
        this.f21757OooO00o = null;
        this.OooO00o = 0;
        this.f21758OooO00o = false;
    }

    public void OooO00o(long j) {
        OooO00o oooO00o = this.f21757OooO00o;
        if (oooO00o == null) {
            AbstractC8536oo00OO0O.OooO0O0("SessionWrapper", "Session is first flush");
            this.f21757OooO00o = new OooO00o(j);
            return;
        }
        oooO00o.OooO00o(j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20258OooO00o() {
        OooO00o oooO00o = this.f21757OooO00o;
        if (oooO00o != null) {
            return oooO00o.f21761OooO00o;
        }
        AbstractC8536oo00OO0O.OooO0OO("SessionWrapper", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }

    public synchronized void OooO0O0(long j) {
        this.f21758OooO00o = true;
        this.OooO00o = j;
    }

    public synchronized void OooO0OO(long j) {
        if (this.OooO00o == 0) {
            AbstractC8536oo00OO0O.OooO0OO("SessionWrapper", "OnBackground() need to be called before!");
            return;
        }
        this.f21758OooO00o = j - this.OooO00o > 30000;
        this.OooO00o = 0;
    }
}
