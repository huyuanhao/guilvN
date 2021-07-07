package com.p118pd.sdk;

import android.content.Context;
import com.huawei.hianalytics.global.AutoCollectEventType;
import java.util.List;

/* renamed from: com.pd.sdk.oo00ooO  reason: case insensitive filesystem */
public interface AbstractC8578oo00ooO extends AbstractC8579oo00ooO0 {

    /* renamed from: com.pd.sdk.oo00ooO$OooO00o */
    public static final class OooO00o {
        public Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C8573oo00oo f21686OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<AutoCollectEventType> f21687OooO00o = null;
        public C8573oo00oo OooO0O0 = null;
        public C8573oo00oo OooO0OO = null;

        public OooO00o(Context context) {
            if (context != null) {
                this.OooO00o = context.getApplicationContext();
            }
        }

        private void OooO00o(C8588oo0O0000 oo0o0000) {
            C8573oo00oo oo00oo = this.OooO0O0;
            C8573oo00oo oo00oo2 = null;
            oo0o0000.OooO0OO(oo00oo == null ? null : new C8573oo00oo(oo00oo));
            C8573oo00oo oo00oo3 = this.f21686OooO00o;
            oo0o0000.OooO00o(oo00oo3 == null ? null : new C8573oo00oo(oo00oo3));
            C8573oo00oo oo00oo4 = this.OooO0OO;
            if (oo00oo4 != null) {
                oo00oo2 = new C8573oo00oo(oo00oo4);
            }
            oo0o0000.OooO0O0(oo00oo2);
        }

        public OooO00o OooO00o(C8573oo00oo oo00oo) {
            this.OooO0OO = oo00oo;
            return this;
        }

        public OooO00o OooO00o(List<AutoCollectEventType> list) {
            this.f21687OooO00o = list;
            return this;
        }

        public AbstractC8578oo00ooO OooO00o() {
            String str;
            if (this.OooO00o == null) {
                str = "create(): instanceEx context is null,create failed!";
            } else if (AbstractC8581oo00ooo.m20225OooO00o("_instance_ex_tag")) {
                str = "create(): DEFAULT or existed tag is not allowed here.";
            } else {
                C8485oo0 oo0 = new C8485oo0(this.OooO00o);
                OooO00o(oo0);
                C8582oo00oooO.OooO00o().OooO00o(this.OooO00o);
                C8583oo00oooo.OooO00o().OooO00o(this.OooO00o);
                C8582oo00oooO.OooO00o().OooO00o(oo0);
                oo0.OooO00o(this.f21687OooO00o);
                return oo0;
            }
            AbstractC8536oo00OO0O.OooO0Oo("HianalyticsSDK", str);
            return null;
        }

        public OooO00o OooO0O0(C8573oo00oo oo00oo) {
            this.f21686OooO00o = oo00oo;
            return this;
        }

        public AbstractC8578oo00ooO OooO0O0() {
            C8485oo0 OooO00o2 = C8582oo00oooO.OooO00o().m20227OooO00o();
            if (OooO00o2 == null) {
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "HiAnalyticsInstanceEx.Builder.Refresh(): calling refresh before create. Instance not exist.");
                return OooO00o();
            }
            OooO00o2.OooO00o(1, this.f21686OooO00o);
            OooO00o2.OooO00o(0, this.OooO0O0);
            OooO00o2.OooO00o(3, this.OooO0OO);
            OooO00o2.OooO00o(this.f21687OooO00o);
            return OooO00o2;
        }

        public OooO00o OooO0OO(C8573oo00oo oo00oo) {
            this.OooO0O0 = oo00oo;
            return this;
        }
    }

    void OooO00o(Context context, C8580oo00ooOo oo00oooo);

    void OooO00o(C8580oo00ooOo oo00oooo, boolean z);

    void OooO00o(String str, String str2);

    @Deprecated
    void OooO0O0();
}
