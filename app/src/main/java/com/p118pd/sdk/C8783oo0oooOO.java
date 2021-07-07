package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC8784oo0oooo;

/* renamed from: com.pd.sdk.oo0oooOO  reason: case insensitive filesystem */
public class C8783oo0oooOO extends C8881ooO0oo {
    public static final int OooO00o = 1048576;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f21981OooO00o = false;
    public static final String OooO0O0 = "nim_sdk.log";
    public static final String OooO0OO = "ui";
    public static final String OooO0Oo = "push";

    /* renamed from: com.pd.sdk.oo0oooOO$OooO00o */
    public static class OooO00o implements AbstractC8784oo0oooo.AbstractC8786OooO0o0 {
        @Override // com.p118pd.sdk.AbstractC8784oo0oooo.AbstractC8786OooO0o0
        public boolean OooO00o() {
            return C8882ooO0oo0.OooO00o().m20532OooO00o();
        }
    }

    public static void OooO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0(C7482o0OoO0OO.OooOOO0), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooO00o(boolean z, String str, int i, boolean z2) {
        String str2;
        String str3;
        f21981OooO00o = z;
        String str4 = "push";
        if (OooO00o()) {
            str2 = OooO0OO;
        } else {
            str2 = OooO0O0() ? str4 : null;
        }
        OooO00o oooO00o = new OooO00o();
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("nim_sdk_");
            if (OooO00o()) {
                str4 = OooO0OO;
            }
            sb.append(str4);
            sb.append(".mlog");
            str3 = sb.toString();
        } else {
            str3 = OooO0O0;
        }
        if (z) {
            C8881ooO0oo.OooO0O0(str2, str, str3, i, OooO00o() ? 16777216 : 8388608, OooO00o() ? 8388608 : 4194304, z2, oooO00o);
        } else {
            C8881ooO0oo.OooO0OO(str2, str, str3, i, 20971520, 10485760, z2, oooO00o);
        }
    }

    public static boolean OooO00o() {
        return true;
    }

    public static void OooO0O0(String str, Throwable th) {
        AbstractC8796ooO0000o.OooO00o().OooO0O0(AbstractC8796ooO0000o.OooO0O0("core"), AbstractC8796ooO0000o.OooO00o(str), th);
    }

    public static boolean OooO0O0() {
        return false;
    }

    public static boolean OooO0OO() {
        return f21981OooO00o;
    }

    public static void OooO0Oo(String str, Throwable th) {
        AbstractC8796ooO0000o.OooO00o().OooO0O0(AbstractC8796ooO0000o.OooO0O0(OooO0OO), AbstractC8796ooO0000o.OooO00o(str), th);
    }

    public static void OooO0o(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("app"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooO0o0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("api"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooO0oO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("audio"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooO0oo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0(C7482o0OoO0OO.OooOOO0), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOO0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("db"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOO0O(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("framework"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOO0o(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("im_packet"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("local"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOO0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("ipc"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOOO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("mix_push"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOOo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("mix_push"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("room_net"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOo0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("mode"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOOoo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("room_net"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("room"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOo0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("remote"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOo00(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0O0(AbstractC8796ooO0000o.OooO0O0("room_net"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOo0O(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("res"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOo0o(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("res"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOoO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("room_packet"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOoO0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("room"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOoOO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("session_ack"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOoo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0("stat"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOoo0(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("stat"), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooOooO(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO00o(AbstractC8796ooO0000o.OooO0O0(OooO0OO), AbstractC8796ooO0000o.OooO00o(str));
    }

    public static void OooO0OO(String str, Throwable th) {
        AbstractC8796ooO0000o.OooO00o().OooO0O0(AbstractC8796ooO0000o.OooO0O0("db"), AbstractC8796ooO0000o.OooO00o(str), th);
    }

    public static void OooO0Oo(String str) {
        AbstractC8796ooO0000o.OooO00o().OooO0OO(AbstractC8796ooO0000o.OooO0O0("api"), AbstractC8796ooO0000o.OooO00o(str));
    }
}
