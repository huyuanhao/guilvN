package com.p118pd.sdk;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0oo0oo  reason: case insensitive filesystem */
public final class C8762oo0oo0oo {

    /* renamed from: com.pd.sdk.oo0oo0oo$OooO00o */
    public static class OooO00o implements OooO0O0 {
        public final /* synthetic */ Map OooO00o;

        public OooO00o(Map map) {
            this.OooO00o = map;
        }

        @Override // com.p118pd.sdk.C8762oo0oo0oo.OooO0O0
        public C8757oo0oo0OO OooO00o(Map<Integer, ByteBuffer> map) {
            Map map2 = this.OooO00o;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.OooO00o);
            }
            C8757oo0oo0OO oo0oo0oo = new C8757oo0oo0OO();
            for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
                oo0oo0oo.OooO00o(new C8758oo0oo0Oo(entry.getKey().intValue(), entry.getValue()));
            }
            return oo0oo0oo;
        }
    }

    /* renamed from: com.pd.sdk.oo0oo0oo$OooO0O0 */
    public interface OooO0O0 {
        C8757oo0oo0OO OooO00o(Map<Integer, ByteBuffer> map);
    }

    public static void OooO00o(File file, int i, byte[] bArr) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(bArr, 0, bArr.length);
        allocate.flip();
        OooO00o(file, i, allocate);
    }

    public static void OooO00o(File file, int i, ByteBuffer byteBuffer) throws IOException {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(i), byteBuffer);
        OooO00o(file, hashMap);
    }

    public static void OooO00o(File file, Map<Integer, ByteBuffer> map) throws IOException {
        OooO00o(file, new OooO00o(map));
    }

    public static void OooO00o(File file, OooO0O0 oooO0O0) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                long OooO0O02 = C8760oo0oo0o0.OooO0O0(fileChannel);
                long OooO00o2 = C8760oo0oo0o0.OooO00o(fileChannel, OooO0O02);
                C8759oo0oo0o<ByteBuffer, Long> OooO00o3 = C8760oo0oo0o0.m20401OooO00o(fileChannel, OooO00o2);
                ByteBuffer OooO00o4 = OooO00o3.OooO00o();
                long longValue = OooO00o3.OooO0O0().longValue();
                if (OooO00o2 == 0 || longValue == 0) {
                    throw new IOException("No APK Signature Scheme v2 block in APK Signing Block");
                }
                Map<Integer, ByteBuffer> OooO00o5 = C8760oo0oo0o0.OooO00o(OooO00o4);
                if (OooO00o5.get(Integer.valueOf((int) C8765oo0ooO00.OooO0O0)) != null) {
                    C8757oo0oo0OO OooO00o6 = oooO0O0.OooO00o(OooO00o5);
                    randomAccessFile.seek(OooO00o2);
                    byte[] bArr = new byte[((int) (fileChannel.size() - OooO00o2))];
                    randomAccessFile.read(bArr);
                    fileChannel.position(longValue);
                    long OooO00o7 = OooO00o6.OooO00o(randomAccessFile);
                    randomAccessFile.write(bArr);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.seek((fileChannel.size() - OooO0O02) - 6);
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    allocate.putInt((int) (((OooO00o7 + OooO00o2) + 8) - (OooO00o2 - longValue)));
                    allocate.flip();
                    randomAccessFile.write(allocate.array());
                    C8764oo0ooO0.OooO00o(fileChannel);
                    C8764oo0ooO0.OooO00o(randomAccessFile);
                    return;
                }
                throw new IOException("No APK Signature Scheme v2 block in APK Signing Block");
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
