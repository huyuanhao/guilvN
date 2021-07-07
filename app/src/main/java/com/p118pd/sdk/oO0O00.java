package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0O00 */
public final class oO0O00 extends FilterInputStream {
    public static final int o0ooOO0 = -1;
    public static final String o0ooOOo = "ContentLengthStream";
    public final long OooO00o;
    public int o00oO0O;

    public oO0O00(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.OooO00o = j;
    }

    @NonNull
    public static InputStream OooO00o(@NonNull InputStream inputStream, @Nullable String str) {
        return OooO00o(inputStream, (long) OooO00o(str));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.OooO00o - ((long) this.o00oO0O), (long) ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        OooO00o(read >= 0 ? 1 : -1);
        return read;
    }

    @NonNull
    public static InputStream OooO00o(@NonNull InputStream inputStream, long j) {
        return new oO0O00(inputStream, j);
    }

    public static int OooO00o(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                if (Log.isLoggable(o0ooOOo, 3)) {
                    String str2 = "failed to parse content length header: " + str;
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return OooO00o(super.read(bArr, i, i2));
    }

    private int OooO00o(int i) throws IOException {
        if (i >= 0) {
            this.o00oO0O += i;
        } else if (this.OooO00o - ((long) this.o00oO0O) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.OooO00o + ", but read: " + this.o00oO0O);
        }
        return i;
    }
}
