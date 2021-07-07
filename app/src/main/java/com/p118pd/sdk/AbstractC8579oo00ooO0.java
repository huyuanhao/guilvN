package com.p118pd.sdk;

import android.content.Context;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo00ooO0  reason: case insensitive filesystem */
public interface AbstractC8579oo00ooO0 {

    /* renamed from: com.pd.sdk.oo00ooO0$OooO00o */
    public static final class OooO00o {
        public Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C8573oo00oo f21688OooO00o = null;
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
            if (oo00oo == null) {
                oo0o0000.OooO0OO(null);
            } else {
                oo0o0000.OooO0OO(new C8573oo00oo(oo00oo));
            }
            C8573oo00oo oo00oo3 = this.f21688OooO00o;
            if (oo00oo3 == null) {
                oo0o0000.OooO00o((C8573oo00oo) null);
            } else {
                oo0o0000.OooO00o(new C8573oo00oo(oo00oo3));
            }
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

        public AbstractC8579oo00ooO0 OooO00o(String str) {
            String str2;
            if (this.OooO00o == null) {
                str2 = "create(): instance context is null,create failed!";
            } else if (str == null || !C8591oo0O00O.OooO00o(CommonNetImpl.TAG, str, "[a-zA-Z0-9][a-zA-Z0-9_]{0,255}")) {
                str2 = "create(): check tag failed! TAG: " + str;
            } else if (AbstractC8581oo00ooo.m20225OooO00o(str)) {
                str2 = "This tag already exists";
            } else if (C8582oo00oooO.OooO00o().m20233OooO0O0(str)) {
                str2 = "create(): black tag is not allowed here.";
            } else if (C8582oo00oooO.OooO00o().m20226OooO00o() - C8582oo00oooO.OooO00o().m20232OooO0O0() > 50) {
                str2 = "The number of TAGs exceeds the limit!";
            } else {
                C8588oo0O0000 oo0o0000 = new C8588oo0O0000(str);
                OooO00o(oo0o0000);
                C8582oo00oooO.OooO00o().OooO00o(this.OooO00o);
                C8583oo00oooo.OooO00o().OooO00o(this.OooO00o);
                C8588oo0O0000 OooO00o2 = C8582oo00oooO.OooO00o().OooO00o(str, oo0o0000);
                return OooO00o2 == null ? oo0o0000 : OooO00o2;
            }
            AbstractC8536oo00OO0O.OooO0Oo("HianalyticsSDK", str2);
            return null;
        }

        public OooO00o OooO0O0(C8573oo00oo oo00oo) {
            this.f21688OooO00o = oo00oo;
            return this;
        }

        public AbstractC8579oo00ooO0 OooO0O0(String str) {
            C8588oo0O0000 OooO00o2 = C8582oo00oooO.OooO00o().OooO00o(str);
            if (OooO00o2 == null) {
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "HiAnalyticsInstance.Builder.Refresh(): calling refresh before create. TAG: " + str + " has no instance. ");
                return OooO00o(str);
            }
            OooO00o2.OooO00o(1, this.f21688OooO00o);
            OooO00o2.OooO00o(0, this.OooO0O0);
            OooO00o2.OooO00o(3, this.OooO0OO);
            return OooO00o2;
        }

        public OooO00o OooO0OO(C8573oo00oo oo00oo) {
            this.OooO0O0 = oo00oo;
            return this;
        }
    }

    void OooO00o();

    void OooO00o(int i, C8573oo00oo oo00oo);

    void OooO00o(int i, String str);

    void OooO00o(int i, String str, LinkedHashMap<String, String> linkedHashMap);

    void OooO00o(int i, Map<String, String> map);

    void OooO00o(int i, boolean z);

    void OooO00o(long j);

    void OooO00o(Context context);

    @Deprecated
    void OooO00o(Context context, int i);

    @Deprecated
    void OooO00o(Context context, String str, String str2);

    void OooO00o(Context context, LinkedHashMap<String, String> linkedHashMap);

    void OooO00o(String str, LinkedHashMap<String, String> linkedHashMap);

    void OooO0O0(int i, String str);

    void OooO0O0(int i, String str, LinkedHashMap<String, String> linkedHashMap);

    void OooO0O0(long j);

    void OooO0O0(Context context);

    void OooO0O0(Context context, LinkedHashMap<String, String> linkedHashMap);

    void OooO0O0(String str, LinkedHashMap<String, String> linkedHashMap);

    void OooO0OO(String str, LinkedHashMap<String, String> linkedHashMap);

    void onReport(int i);
}
