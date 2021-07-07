package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.pd.sdk.L1li1 */
public class L1li1 {
    public static final long OooO00o = Runtime.getRuntime().maxMemory();

    public static int OooO00o(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    public static int OooO00o(InputStream inputStream) {
        if (inputStream instanceof IIi1II) {
            return ((IIi1II) inputStream).OooO0O0();
        }
        if (inputStream instanceof C5805Ll1) {
            return ((C5805Ll1) inputStream).OooO0O0();
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j = OooO00o;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static int OooO0O0(int i) throws IOException {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i2 = 4;
        do {
            i >>= 7;
            i2--;
            bArr[i2] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (5 - i2);
    }
}
