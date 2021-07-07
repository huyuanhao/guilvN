package com.p118pd.sdk;

import com.facebook.react.modules.netinfo.NetInfoModule;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.ll11丨  reason: invalid class name and case insensitive filesystem */
public class C6728ll11 {
    public static final short OooO = 42;
    public static final short OooO00o = 0;
    public static final short OooO0O0 = 10;
    public static final short OooO0OO = 20;
    public static final short OooO0Oo = 21;
    public static final short OooO0o = 30;
    public static final short OooO0o0 = 22;
    public static final short OooO0oO = 40;
    public static final short OooO0oo = 41;
    public static final short OooOO0 = 43;
    public static final short OooOO0O = 44;
    public static final short OooOO0o = 45;
    public static final short OooOOO = 47;
    public static final short OooOOO0 = 46;
    public static final short OooOOOO = 48;
    public static final short OooOOOo = 49;
    public static final short OooOOo = 51;
    public static final short OooOOo0 = 50;
    public static final short OooOOoo = 60;
    public static final short OooOo = 100;
    public static final short OooOo0 = 71;
    public static final short OooOo00 = 70;
    public static final short OooOo0O = 80;
    public static final short OooOo0o = 90;
    public static final short OooOoO = 111;
    public static final short OooOoO0 = 110;
    public static final short OooOoOO = 112;
    public static final short OooOoo = 114;
    public static final short OooOoo0 = 113;
    public static final short OooOooO = 115;
    public static final short OooOooo = 86;

    public static String OooO00o(short s) {
        if (s == 0) {
            return "close_notify";
        }
        if (s == 10) {
            return "unexpected_message";
        }
        if (s == 30) {
            return "decompression_failure";
        }
        if (s == 60) {
            return "export_restriction";
        }
        if (s == 80) {
            return "internal_error";
        }
        if (s == 86) {
            return "inappropriate_fallback";
        }
        if (s == 90) {
            return "user_canceled";
        }
        if (s == 100) {
            return "no_renegotiation";
        }
        if (s == 70) {
            return "protocol_version";
        }
        if (s == 71) {
            return "insufficient_security";
        }
        switch (s) {
            case 20:
                return "bad_record_mac";
            case 21:
                return "decryption_failed";
            case 22:
                return "record_overflow";
            default:
                switch (s) {
                    case 40:
                        return "handshake_failure";
                    case 41:
                        return "no_certificate";
                    case 42:
                        return "bad_certificate";
                    case 43:
                        return "unsupported_certificate";
                    case 44:
                        return "certificate_revoked";
                    case 45:
                        return "certificate_expired";
                    case 46:
                        return "certificate_unknown";
                    case 47:
                        return "illegal_parameter";
                    case 48:
                        return "unknown_ca";
                    case 49:
                        return "access_denied";
                    case 50:
                        return "decode_error";
                    case 51:
                        return "decrypt_error";
                    default:
                        switch (s) {
                            case 110:
                                return "unsupported_extension";
                            case 111:
                                return "certificate_unobtainable";
                            case 112:
                                return "unrecognized_name";
                            case 113:
                                return "bad_certificate_status_response";
                            case 114:
                                return "bad_certificate_hash_value";
                            case 115:
                                return "unknown_psk_identity";
                            default:
                                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                        }
                }
        }
    }

    public static String OooO0O0(short s) {
        return OooO00o(s) + C3848l.f10401s + ((int) s) + C3848l.f10402t;
    }
}
