package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.LlL1  reason: case insensitive filesystem */
public class C5787LlL1 {
    public static List OooO00o = Collections.unmodifiableList(new ArrayList());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set f16718OooO00o = Collections.unmodifiableSet(new HashSet());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final X509CertificateHolder[] f16719OooO00o = new X509CertificateHolder[0];

    public static Date OooO00o(C9623il r3) {
        try {
            return r3.OooO00o();
        } catch (Exception e) {
            throw new IllegalStateException("exception processing GeneralizedTime: " + e.getMessage());
        }
    }

    public static List OooO00o(iI11IL r0) {
        return r0 == null ? OooO00o : Collections.unmodifiableList(Arrays.asList(r0.m17474OooO0O0()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set m16383OooO00o(iI11IL r1) {
        return r1 == null ? f16718OooO00o : Collections.unmodifiableSet(new HashSet(Arrays.asList(r1.m17473OooO00o())));
    }

    public static Set OooO0O0(iI11IL r1) {
        return r1 == null ? f16718OooO00o : Collections.unmodifiableSet(new HashSet(Arrays.asList(r1.OooO0OO())));
    }
}
