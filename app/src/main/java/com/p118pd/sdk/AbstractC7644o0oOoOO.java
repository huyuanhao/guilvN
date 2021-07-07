package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.o0oOoOO  reason: case insensitive filesystem */
public interface AbstractC7644o0oOoOO {
    public static final String OooO00o = "UTF-8";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Charset f20533OooO00o = Charset.forName("UTF-8");

    void OooO00o(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
