package com.p118pd.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.p289io.CipherIOException;
import org.bouncycastle.crypto.p289io.InvalidCipherTextIOException;

/* renamed from: com.pd.sdk.丨丨l  reason: invalid class name and case insensitive filesystem */
public class C9846l extends FilterInputStream {
    public static final int o0ooOoO = 2048;
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1LLllll f23443OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLi1iII f23444OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6019i1II1 f23445OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6744ll1L f23446OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23447OooO00o;
    public boolean OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23448OooO0O0;
    public byte[] OooO0OO;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;

    public C9846l(InputStream inputStream, I1LLllll i1LLllll) {
        this(inputStream, i1LLllll, 2048);
    }

    public C9846l(InputStream inputStream, I1LLllll i1LLllll, int i) {
        super(inputStream);
        this.f23443OooO00o = i1LLllll;
        this.f23447OooO00o = new byte[i];
        this.f23445OooO00o = i1LLllll instanceof AbstractC6019i1II1 ? (AbstractC6019i1II1) i1LLllll : null;
    }

    public C9846l(InputStream inputStream, LLLi1iII lLLi1iII) {
        this(inputStream, lLLi1iII, 2048);
    }

    public C9846l(InputStream inputStream, LLLi1iII lLLi1iII, int i) {
        super(inputStream);
        this.f23444OooO00o = lLLi1iII;
        this.f23447OooO00o = new byte[i];
        this.f23445OooO00o = lLLi1iII instanceof AbstractC6019i1II1 ? (AbstractC6019i1II1) lLLi1iII : null;
    }

    public C9846l(InputStream inputStream, C6744ll1L r3) {
        this(inputStream, r3, 2048);
    }

    public C9846l(InputStream inputStream, C6744ll1L r2, int i) {
        super(inputStream);
        this.f23446OooO00o = r2;
        this.f23447OooO00o = new byte[i];
        this.f23445OooO00o = r2 instanceof AbstractC6019i1II1 ? (AbstractC6019i1II1) r2 : null;
    }

    private void OooO00o() throws IOException {
        int OooO00o2;
        try {
            this.OooO0O0 = true;
            OooO00o(0, true);
            if (this.f23446OooO00o != null) {
                OooO00o2 = this.f23446OooO00o.OooO00o(this.f23448OooO0O0, 0);
            } else if (this.f23444OooO00o != null) {
                OooO00o2 = this.f23444OooO00o.OooO00o(this.f23448OooO0O0, 0);
            } else {
                this.o0ooOO0 = 0;
                return;
            }
            this.o0ooOO0 = OooO00o2;
        } catch (InvalidCipherTextException e) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e);
        } catch (Exception e2) {
            throw new IOException("Error finalising cipher " + e2);
        }
    }

    private void OooO00o(int i, boolean z) {
        if (z) {
            C6744ll1L r2 = this.f23446OooO00o;
            if (r2 != null) {
                i = r2.OooO00o(i);
            } else {
                LLLi1iII lLLi1iII = this.f23444OooO00o;
                if (lLLi1iII != null) {
                    i = lLLi1iII.OooO00o(i);
                }
            }
        } else {
            C6744ll1L r22 = this.f23446OooO00o;
            if (r22 != null) {
                i = r22.OooO0O0(i);
            } else {
                LLLi1iII lLLi1iII2 = this.f23444OooO00o;
                if (lLLi1iII2 != null) {
                    i = lLLi1iII2.OooO0O0(i);
                }
            }
        }
        byte[] bArr = this.f23448OooO0O0;
        if (bArr == null || bArr.length < i) {
            this.f23448OooO0O0 = new byte[i];
        }
    }

    private int OooO0O0() throws IOException {
        if (this.OooO0O0) {
            return -1;
        }
        this.o00oO0O = 0;
        this.o0ooOO0 = 0;
        while (true) {
            int i = this.o0ooOO0;
            if (i != 0) {
                return i;
            }
            int read = ((FilterInputStream) this).in.read(this.f23447OooO00o);
            if (read == -1) {
                OooO00o();
                int i2 = this.o0ooOO0;
                if (i2 == 0) {
                    return -1;
                }
                return i2;
            }
            try {
                OooO00o(read, false);
                if (this.f23446OooO00o != null) {
                    read = this.f23446OooO00o.OooO00o(this.f23447OooO00o, 0, read, this.f23448OooO0O0, 0);
                } else if (this.f23444OooO00o != null) {
                    read = this.f23444OooO00o.OooO00o(this.f23447OooO00o, 0, read, this.f23448OooO0O0, 0);
                } else {
                    this.f23443OooO00o.OooO00o(this.f23447OooO00o, 0, read, this.f23448OooO0O0, 0);
                }
                this.o0ooOO0 = read;
            } catch (Exception e) {
                throw new CipherIOException("Error processing stream ", e);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.o0ooOO0 - this.o00oO0O;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.o00oO0O = 0;
            this.o0ooOO0 = 0;
            this.o0ooOOo = 0;
            this.OooO00o = 0;
            byte[] bArr = this.OooO0OO;
            if (bArr != null) {
                C9586iIILl.OooO00o(bArr, (byte) 0);
                this.OooO0OO = null;
            }
            byte[] bArr2 = this.f23448OooO0O0;
            if (bArr2 != null) {
                C9586iIILl.OooO00o(bArr2, (byte) 0);
                this.f23448OooO0O0 = null;
            }
            C9586iIILl.OooO00o(this.f23447OooO00o, (byte) 0);
        } finally {
            if (!this.OooO0O0) {
                OooO00o();
            }
        }
    }

    public void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        AbstractC6019i1II1 r4 = this.f23445OooO00o;
        if (r4 != null) {
            this.OooO00o = r4.OooO00o();
        }
        byte[] bArr = this.f23448OooO0O0;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.OooO0OO = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.o0ooOOo = this.o00oO0O;
    }

    public boolean markSupported() {
        if (this.f23445OooO00o != null) {
            return ((FilterInputStream) this).in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.o00oO0O >= this.o0ooOO0 && OooO0O0() < 0) {
            return -1;
        }
        byte[] bArr = this.f23448OooO0O0;
        int i = this.o00oO0O;
        this.o00oO0O = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.o00oO0O >= this.o0ooOO0 && OooO0O0() < 0) {
            return -1;
        }
        int min = Math.min(i2, available());
        System.arraycopy(this.f23448OooO0O0, this.o00oO0O, bArr, i, min);
        this.o00oO0O += min;
        return min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.f23445OooO00o != null) {
            ((FilterInputStream) this).in.reset();
            this.f23445OooO00o.OooO00o(this.OooO00o);
            byte[] bArr = this.OooO0OO;
            if (bArr != null) {
                this.f23448OooO0O0 = bArr;
            }
            this.o00oO0O = this.o0ooOOo;
            return;
        }
        throw new IOException("cipher must implement SkippingCipher to be used with reset()");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        if (this.f23445OooO00o != null) {
            long available = (long) available();
            if (j <= available) {
                this.o00oO0O = (int) (((long) this.o00oO0O) + j);
                return j;
            }
            this.o00oO0O = this.o0ooOO0;
            long skip = ((FilterInputStream) this).in.skip(j - available);
            if (skip == this.f23445OooO00o.skip(skip)) {
                return skip + available;
            }
            throw new IOException("Unable to skip cipher " + skip + " bytes.");
        }
        int min = (int) Math.min(j, (long) available());
        this.o00oO0O += min;
        return (long) min;
    }
}
