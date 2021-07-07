package com.p118pd.sdk;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: com.pd.sdk.o00oooo  reason: case insensitive filesystem */
public final class C7246o00oooo {
    public static final int OooO00o = 22;
    public static final int OooO0O0 = 101010256;
    public static final int OooO0OO = 16384;

    /* renamed from: com.pd.sdk.o00oooo$OooO00o */
    public static class OooO00o {
        public long OooO00o;
        public long OooO0O0;
    }

    public static long OooO00o(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return OooO00o(randomAccessFile, OooO00o(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    public static OooO00o OooO00o(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    OooO00o oooO00o = new OooO00o();
                    oooO00o.OooO0O0 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    oooO00o.OooO00o = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return oooO00o;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    public static long OooO00o(RandomAccessFile randomAccessFile, OooO00o oooO00o) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = oooO00o.OooO0O0;
        randomAccessFile.seek(oooO00o.OooO00o);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }
}
