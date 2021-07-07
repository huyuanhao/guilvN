package com.p118pd.sdk;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0oo0oO  reason: case insensitive filesystem */
public final class C8761oo0oo0oO {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20403OooO00o(File file, int i) throws IOException {
        ByteBuffer OooO00o = OooO00o(file, i);
        if (OooO00o == null) {
            return null;
        }
        return C8764oo0ooO0.OooO00o(OooO00o);
    }

    public static ByteBuffer OooO00o(File file, int i) throws IOException {
        Map<Integer, ByteBuffer> OooO00o = OooO00o(file);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.get(Integer.valueOf(i));
    }

    public static Map<Integer, ByteBuffer> OooO00o(File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                Map<Integer, ByteBuffer> OooO00o = C8760oo0oo0o0.OooO00o(C8760oo0oo0o0.m20400OooO00o(fileChannel).OooO00o());
                C8764oo0ooO0.OooO00o(fileChannel);
                C8764oo0ooO0.OooO00o(randomAccessFile);
                return OooO00o;
            } catch (Throwable th2) {
                th = th2;
                C8764oo0ooO0.OooO00o(fileChannel);
                C8764oo0ooO0.OooO00o(randomAccessFile);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            C8764oo0ooO0.OooO00o(fileChannel);
            C8764oo0ooO0.OooO00o(randomAccessFile);
            throw th;
        }
    }
}
