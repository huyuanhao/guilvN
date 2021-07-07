package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: com.pd.sdk.ooOOO0Oo  reason: case insensitive filesystem */
public class C8931ooOOO0Oo {
    public static final byte OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f22175OooO00o = false;
    public static final byte OooO0O0 = -38;
    public static final byte OooO0OO = -39;

    public C8931ooOOO0Oo() throws Exception {
        throw new Exception("Not intended for instantiation.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    @com.drew.lang.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C7852oO0O0oO OooO00o(@com.drew.lang.annotations.NotNull java.io.File r2, @com.drew.lang.annotations.Nullable java.lang.Iterable<com.drew.imaging.jpeg.JpegSegmentType> r3) throws com.drew.imaging.jpeg.JpegProcessingException, java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0016 }
            r1.<init>(r2)     // Catch:{ all -> 0x0016 }
            com.pd.sdk.ooOOoOoo r2 = new com.pd.sdk.ooOOoOoo     // Catch:{ all -> 0x0013 }
            r2.<init>(r1)     // Catch:{ all -> 0x0013 }
            com.pd.sdk.oO0O0oO r2 = OooO00o(r2, r3)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r2
        L_0x0013:
            r2 = move-exception
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r2 = move-exception
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            r0.close()
        L_0x001c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8931ooOOO0Oo.OooO00o(java.io.File, java.lang.Iterable):com.pd.sdk.oO0O0oO");
    }

    @NotNull
    public static C7852oO0O0oO OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @Nullable Iterable<JpegSegmentType> iterable) throws JpegProcessingException, IOException {
        int OooO0OO2 = oo0o000o.OooO0OO();
        if (OooO0OO2 == 65496) {
            HashSet hashSet = null;
            if (iterable != null) {
                hashSet = new HashSet();
                for (JpegSegmentType jpegSegmentType : iterable) {
                    hashSet.add(Byte.valueOf(jpegSegmentType.byteValue));
                }
            }
            C7852oO0O0oO oo0o0oo = new C7852oO0O0oO();
            while (true) {
                byte OooO0O02 = oo0o000o.OooO0O0();
                byte OooO0O03 = oo0o000o.OooO0O0();
                while (true) {
                    if (!(OooO0O02 != -1 || OooO0O03 == -1 || OooO0O03 == 0)) {
                        break;
                    }
                    OooO0O03 = oo0o000o.OooO0O0();
                    OooO0O02 = OooO0O03;
                }
                if (OooO0O03 == -38 || OooO0O03 == -39) {
                    return oo0o0oo;
                }
                int OooO0OO3 = oo0o000o.OooO0OO() - 2;
                if (OooO0OO3 < 0) {
                    throw new JpegProcessingException("JPEG segment size would be less than zero");
                } else if (hashSet == null || hashSet.contains(Byte.valueOf(OooO0O03))) {
                    oo0o0oo.OooO00o(OooO0O03, oo0o000o.m19620OooO00o(OooO0OO3));
                } else if (!oo0o000o.m19619OooO00o((long) OooO0OO3)) {
                    return oo0o0oo;
                }
            }
        } else {
            throw new JpegProcessingException("JPEG data is expected to begin with 0xFFD8 (ÿØ) not 0x" + Integer.toHexString(OooO0OO2));
        }
    }
}
