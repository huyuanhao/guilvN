package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.pd.sdk.oO0O0oO0  reason: case insensitive filesystem */
public class C7853oO0O0oO0 {
    public static final Iterable<AbstractC8313oOo0o0oO> OooO00o = Arrays.asList(new C8031oOO0O(), new oOO0O0OO(), new C9272ooooOoOO(), new C8032oOO0O00o(), new C7946oO0oO0O(), new C8138oOOOo00o(), new C8023oOO00o0o(), new C8310oOo0o(), new C8120oOOOO0o0(), new C8026oOO00oOo(), new C7932oO0o0o0(), new C8036oOO0O0o0(), new C8037oOO0O0oo());

    public C7853oO0O0oO0() throws Exception {
        throw new Exception("Not intended for instantiation");
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream, @Nullable Iterable<AbstractC8313oOo0o0oO> iterable) throws JpegProcessingException, IOException {
        C7925oO0o0OO0 oo0o0oo0 = new C7925oO0o0OO0();
        OooO00o(oo0o0oo0, inputStream, iterable);
        return oo0o0oo0;
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull InputStream inputStream) throws JpegProcessingException, IOException {
        return OooO00o(inputStream, (Iterable<AbstractC8313oOo0o0oO>) null);
    }

    /* JADX INFO: finally extract failed */
    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file, @Nullable Iterable<AbstractC8313oOo0o0oO> iterable) throws JpegProcessingException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            C7925oO0o0OO0 OooO00o2 = OooO00o(fileInputStream, iterable);
            fileInputStream.close();
            new oOO00O0O().OooO00o(file, OooO00o2);
            return OooO00o2;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    @NotNull
    public static C7925oO0o0OO0 OooO00o(@NotNull File file) throws JpegProcessingException, IOException {
        return OooO00o(file, (Iterable<AbstractC8313oOo0o0oO>) null);
    }

    public static void OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull InputStream inputStream) throws JpegProcessingException, IOException {
        OooO00o(oo0o0oo0, inputStream, (Iterable<AbstractC8313oOo0o0oO>) null);
    }

    public static void OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull InputStream inputStream, @Nullable Iterable<AbstractC8313oOo0o0oO> iterable) throws JpegProcessingException, IOException {
        if (iterable == null) {
            iterable = OooO00o;
        }
        HashSet hashSet = new HashSet();
        for (AbstractC8313oOo0o0oO ooo0o0oo : iterable) {
            for (JpegSegmentType jpegSegmentType : ooo0o0oo.OooO00o()) {
                hashSet.add(jpegSegmentType);
            }
        }
        OooO00o(oo0o0oo0, iterable, C8931ooOOO0Oo.OooO00o(new C8986ooOOoOoo(inputStream), hashSet));
    }

    public static void OooO00o(C7925oO0o0OO0 oo0o0oo0, Iterable<AbstractC8313oOo0o0oO> iterable, C7852oO0O0oO oo0o0oo) {
        for (AbstractC8313oOo0o0oO ooo0o0oo : iterable) {
            for (JpegSegmentType jpegSegmentType : ooo0o0oo.OooO00o()) {
                ooo0o0oo.OooO00o(oo0o0oo.m19534OooO00o(jpegSegmentType), oo0o0oo0, jpegSegmentType);
            }
        }
    }
}
