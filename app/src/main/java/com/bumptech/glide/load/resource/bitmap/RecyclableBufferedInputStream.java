package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.p118pd.sdk.AbstractC7707o0ooO00O;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {
    public final AbstractC7707o0ooO00O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile byte[] f14840OooO00o;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;
    public int o0ooOoO;

    public static class InvalidMarkException extends IOException {
        public static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) {
        this(inputStream, o0ooo00o, 65536);
    }

    public static IOException OooO00o() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void OooO0O0() {
        if (this.f14840OooO00o != null) {
            this.OooO00o.OooO00o(this.f14840OooO00o);
            this.f14840OooO00o = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f14840OooO00o == null || inputStream == null) {
            throw OooO00o();
        }
        return (this.o00oO0O - this.o0ooOoO) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        if (this.f14840OooO00o != null) {
            this.OooO00o.OooO00o(this.f14840OooO00o);
            this.f14840OooO00o = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.o0ooOO0 = Math.max(this.o0ooOO0, i);
        this.o0ooOOo = this.o0ooOoO;
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f14840OooO00o;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw OooO00o();
        } else if (this.o0ooOoO >= this.o00oO0O && OooO00o(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.f14840OooO00o && (bArr = this.f14840OooO00o) == null) {
                throw OooO00o();
            } else if (this.o00oO0O - this.o0ooOoO <= 0) {
                return -1;
            } else {
                int i = this.o0ooOoO;
                this.o0ooOoO = i + 1;
                return bArr[i] & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f14840OooO00o == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.o0ooOOo) {
            this.o0ooOoO = this.o0ooOOo;
        } else {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.o0ooOoO + " markLimit: " + this.o0ooOO0);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f14840OooO00o;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                throw OooO00o();
            } else if (((long) (this.o00oO0O - this.o0ooOoO)) >= j) {
                this.o0ooOoO = (int) (((long) this.o0ooOoO) + j);
                return j;
            } else {
                long j2 = ((long) this.o00oO0O) - ((long) this.o0ooOoO);
                this.o0ooOoO = this.o00oO0O;
                if (this.o0ooOOo == -1 || j > ((long) this.o0ooOO0)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (OooO00o(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.o00oO0O - this.o0ooOoO)) >= j - j2) {
                        this.o0ooOoO = (int) ((((long) this.o0ooOoO) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.o00oO0O)) - ((long) this.o0ooOoO);
                    this.o0ooOoO = this.o00oO0O;
                    return j3;
                }
            }
        } else {
            throw OooO00o();
        }
    }

    @VisibleForTesting
    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o, int i) {
        super(inputStream);
        this.o0ooOOo = -1;
        this.OooO00o = o0ooo00o;
        this.f14840OooO00o = (byte[]) o0ooo00o.OooO0O0(i, byte[].class);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m15004OooO00o() {
        this.o0ooOO0 = this.f14840OooO00o.length;
    }

    private int OooO00o(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.o0ooOOo;
        if (i2 == -1 || this.o0ooOoO - i2 >= (i = this.o0ooOO0)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.o0ooOOo = -1;
                this.o0ooOoO = 0;
                this.o00oO0O = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.o00oO0O == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.OooO00o.OooO0O0(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f14840OooO00o = bArr2;
            this.OooO00o.OooO00o(bArr);
            bArr = bArr2;
        } else {
            int i3 = this.o0ooOOo;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        int i4 = this.o0ooOoO - this.o0ooOOo;
        this.o0ooOoO = i4;
        this.o0ooOOo = 0;
        this.o00oO0O = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.o0ooOoO;
        if (read2 > 0) {
            i5 += read2;
        }
        this.o00oO0O = i5;
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f14840OooO00o;
        if (bArr2 == null) {
            throw OooO00o();
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                if (this.o0ooOoO < this.o00oO0O) {
                    int i5 = this.o00oO0O - this.o0ooOoO >= i2 ? i2 : this.o00oO0O - this.o0ooOoO;
                    System.arraycopy(bArr2, this.o0ooOoO, bArr, i, i5);
                    this.o0ooOoO += i5;
                    if (i5 == i2 || inputStream.available() == 0) {
                        return i5;
                    }
                    i += i5;
                    i3 = i2 - i5;
                } else {
                    i3 = i2;
                }
                while (true) {
                    int i6 = -1;
                    if (this.o0ooOOo == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i6 = i2 - i3;
                            }
                            return i6;
                        }
                    } else if (OooO00o(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i6 = i2 - i3;
                        }
                        return i6;
                    } else if (bArr2 == this.f14840OooO00o || (bArr2 = this.f14840OooO00o) != null) {
                        i4 = this.o00oO0O - this.o0ooOoO >= i3 ? i3 : this.o00oO0O - this.o0ooOoO;
                        System.arraycopy(bArr2, this.o0ooOoO, bArr, i, i4);
                        this.o0ooOoO += i4;
                    } else {
                        throw OooO00o();
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                throw OooO00o();
            }
        }
    }
}
