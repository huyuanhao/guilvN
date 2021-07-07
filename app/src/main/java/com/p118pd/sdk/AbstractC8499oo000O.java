package com.p118pd.sdk;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oo000O  reason: case insensitive filesystem */
public abstract class AbstractC8499oo000O {

    /* renamed from: com.pd.sdk.oo000O$OooO00o */
    public interface OooO00o {
        void OooO00o(long j, byte[] bArr);
    }

    public static void OooO00o(String str, String str2, OooO00o oooO00o) {
        MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0Oo);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] digest = instance.digest((str + str2 + currentTimeMillis).getBytes("UTF-8"));
            if (oooO00o != null) {
                oooO00o.OooO00o(currentTimeMillis, digest);
            }
        } catch (UnsupportedEncodingException unused) {
            AbstractC8536oo00OO0O.OooO0OO("Generator", "getHmac(): UnsupportedEncodingException: Exception when writing the log file.");
        }
    }
}
