package com.p118pd.sdk;

import com.facebook.react.modules.netinfo.NetInfoModule;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.iii1  reason: case insensitive filesystem */
public class C6259iii1 {
    public static final short OooO00o = 0;
    public static final short OooO0O0 = 1;
    public static final short OooO0OO = 2;
    public static final short OooO0Oo = 3;
    public static final short OooO0o = 5;
    public static final short OooO0o0 = 4;
    public static final short OooO0oO = 6;

    public static String OooO00o(short s) {
        switch (s) {
            case 0:
                return "none";
            case 1:
                return FileAttachment.KEY_MD5;
            case 2:
                return "sha1";
            case 3:
                return "sha224";
            case 4:
                return "sha256";
            case 5:
                return "sha384";
            case 6:
                return "sha512";
            default:
                return NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17267OooO00o(short s) {
        return 224 <= s && s <= 255;
    }

    public static String OooO0O0(short s) {
        return OooO00o(s) + C3848l.f10401s + ((int) s) + C3848l.f10402t;
    }
}
