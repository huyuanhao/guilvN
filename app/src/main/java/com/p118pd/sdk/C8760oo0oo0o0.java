package com.p118pd.sdk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.p288ws.WebSocketProtocol;

/* renamed from: com.pd.sdk.oo0oo0o0  reason: case insensitive filesystem */
public final class C8760oo0oo0o0 {
    public static long OooO00o(FileChannel fileChannel) throws IOException {
        return OooO00o(fileChannel, OooO0O0(fileChannel));
    }

    public static long OooO0O0(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, (long) WebSocketProtocol.PAYLOAD_SHORT_MAX);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            return (long) s;
                        }
                    }
                    i++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    public static long OooO00o(FileChannel fileChannel, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(allocate);
        return (long) allocate.getInt(0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C8759oo0oo0o<ByteBuffer, Long> m20400OooO00o(FileChannel fileChannel) throws IOException {
        return m20401OooO00o(fileChannel, OooO00o(fileChannel));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C8759oo0oo0o<ByteBuffer, Long> m20401OooO00o(FileChannel fileChannel, long j) throws IOException {
        if (j >= 32) {
            fileChannel.position(j - 24);
            ByteBuffer allocate = ByteBuffer.allocate(24);
            fileChannel.read(allocate);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            if (allocate.getLong(8) == C8765oo0ooO00.f21943OooO0O0 && allocate.getLong(16) == C8765oo0ooO00.f21941OooO00o) {
                long j2 = allocate.getLong(0);
                if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                    throw new IOException("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = j - ((long) i);
                if (j3 >= 0) {
                    fileChannel.position(j3);
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    fileChannel.read(allocate2);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return C8759oo0oo0o.OooO00o(allocate2, Long.valueOf(j3));
                    }
                    throw new IOException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                }
                throw new IOException("APK Signing Block offset out of range: " + j3);
            }
            throw new IOException("No APK Signing Block before ZIP Central Directory");
        }
        throw new IOException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
    }

    public static Map<Integer, ByteBuffer> OooO00o(ByteBuffer byteBuffer) throws IOException {
        m20402OooO00o(byteBuffer);
        ByteBuffer OooO00o = OooO00o(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (OooO00o.hasRemaining()) {
            i++;
            if (OooO00o.remaining() >= 8) {
                long j = OooO00o.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new IOException("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position = OooO00o.position() + i2;
                if (i2 <= OooO00o.remaining()) {
                    linkedHashMap.put(Integer.valueOf(OooO00o.getInt()), OooO00o(OooO00o, i2 - 4));
                    OooO00o.position(position);
                } else {
                    throw new IOException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + OooO00o.remaining());
                }
            } else {
                throw new IOException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: finally extract failed */
    public static ByteBuffer OooO00o(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("start: " + i);
        } else if (i2 >= i) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
    }

    public static ByteBuffer OooO00o(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: " + i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20402OooO00o(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
