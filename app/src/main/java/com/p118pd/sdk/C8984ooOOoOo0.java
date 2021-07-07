package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.ooOOoOo0  reason: case insensitive filesystem */
public final class C8984ooOOoOo0 {
    public static final int OooO00o = 16384;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AtomicReference<byte[]> f22257OooO00o = new AtomicReference<>();

    /* renamed from: com.pd.sdk.ooOOoOo0$OooO0O0 */
    public static final class OooO0O0 {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f22258OooO00o;
        public final int OooO0O0;

        public OooO0O0(@NonNull byte[] bArr, int i, int i2) {
            this.f22258OooO00o = bArr;
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(2:10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[SYNTHETIC, Splitter:B:24:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050 A[SYNTHETIC, Splitter:B:28:0x0050] */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer OooO00o(@androidx.annotation.NonNull java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0045 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x003d
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0045 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r8
        L_0x0033:
            r8 = move-exception
            goto L_0x0047
        L_0x0035:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)
            throw r8
        L_0x003d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)
            throw r8
        L_0x0045:
            r8 = move-exception
            r7 = r0
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r7 == 0) goto L_0x0053
            r7.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8984ooOOoOo0.OooO00o(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: com.pd.sdk.ooOOoOo0$OooO00o */
    public static class OooO00o extends InputStream {
        public static final int o0ooOO0 = -1;
        @NonNull
        public final ByteBuffer OooO00o;
        public int o00oO0O = -1;

        public OooO00o(@NonNull ByteBuffer byteBuffer) {
            this.OooO00o = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.OooO00o.remaining();
        }

        public synchronized void mark(int i) {
            this.o00oO0O = this.OooO00o.position();
        }

        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (!this.OooO00o.hasRemaining()) {
                return -1;
            }
            return this.OooO00o.get();
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            if (this.o00oO0O != -1) {
                this.OooO00o.position(this.o00oO0O);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (!this.OooO00o.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.OooO00o;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
            if (!this.OooO00o.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.OooO00o.get(bArr, i, min);
            return min;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(@androidx.annotation.NonNull java.nio.ByteBuffer r4, @androidx.annotation.NonNull java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0027 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r1.force(r0)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r2 = r1
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8984ooOOoOo0.OooO00o(java.nio.ByteBuffer, java.io.File):void");
    }

    public static void OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull OutputStream outputStream) throws IOException {
        OooO0O0 OooO00o2 = OooO00o(byteBuffer);
        if (OooO00o2 != null) {
            byte[] bArr = OooO00o2.f22258OooO00o;
            int i = OooO00o2.OooO00o;
            outputStream.write(bArr, i, OooO00o2.OooO0O0 + i);
            return;
        }
        byte[] andSet = f22257OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, min);
            outputStream.write(andSet, 0, min);
        }
        f22257OooO00o.set(andSet);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20651OooO00o(@NonNull ByteBuffer byteBuffer) {
        OooO0O0 OooO00o2 = OooO00o(byteBuffer);
        if (OooO00o2 != null && OooO00o2.OooO00o == 0 && OooO00o2.OooO0O0 == OooO00o2.f22258OooO00o.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static InputStream m20650OooO00o(@NonNull ByteBuffer byteBuffer) {
        return new OooO00o(byteBuffer);
    }

    @NonNull
    public static ByteBuffer OooO00o(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f22257OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f22257OooO00o.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    @Nullable
    public static OooO0O0 OooO00o(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new OooO0O0(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }
}
