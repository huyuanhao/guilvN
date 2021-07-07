package com.p118pd.sdk;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.li1LI1l */
public class li1LI1l extends FilterOutputStream {
    public I1LLllll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLLi1iII f18583OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6744ll1L f18584OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18585OooO00o;
    public byte[] OooO0O0;

    public li1LI1l(OutputStream outputStream, I1LLllll i1LLllll) {
        super(outputStream);
        this.f18585OooO00o = new byte[1];
        this.OooO00o = i1LLllll;
    }

    public li1LI1l(OutputStream outputStream, LLLi1iII lLLi1iII) {
        super(outputStream);
        this.f18585OooO00o = new byte[1];
        this.f18583OooO00o = lLLi1iII;
    }

    public li1LI1l(OutputStream outputStream, C6744ll1L r2) {
        super(outputStream);
        this.f18585OooO00o = new byte[1];
        this.f18584OooO00o = r2;
    }

    private void OooO00o(int i, boolean z) {
        if (z) {
            C6744ll1L r2 = this.f18584OooO00o;
            if (r2 != null) {
                i = r2.OooO00o(i);
            } else {
                LLLi1iII lLLi1iII = this.f18583OooO00o;
                if (lLLi1iII != null) {
                    i = lLLi1iII.OooO00o(i);
                }
            }
        } else {
            C6744ll1L r22 = this.f18584OooO00o;
            if (r22 != null) {
                i = r22.OooO0O0(i);
            } else {
                LLLi1iII lLLi1iII2 = this.f18583OooO00o;
                if (lLLi1iII2 != null) {
                    i = lLLi1iII2.OooO0O0(i);
                }
            }
        }
        byte[] bArr = this.OooO0O0;
        if (bArr == null || bArr.length < i) {
            this.OooO0O0 = new byte[i];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r4.OooO00o(r0, r1)
            com.pd.sdk.ll1丨丨L r1 = r4.f18584OooO00o     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            if (r1 == 0) goto L_0x001b
            com.pd.sdk.ll1丨丨L r1 = r4.f18584OooO00o     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            byte[] r2 = r4.OooO0O0     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            int r1 = r1.OooO00o(r2, r0)     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.io.OutputStream r2 = r4.out     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            byte[] r3 = r4.OooO0O0     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            r2.write(r3, r0, r1)     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            goto L_0x003a
        L_0x001b:
            com.pd.sdk.LLLi1iII r1 = r4.f18583OooO00o     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            if (r1 == 0) goto L_0x0031
            com.pd.sdk.LLLi1iII r1 = r4.f18583OooO00o     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            byte[] r2 = r4.OooO0O0     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            int r1 = r1.OooO00o(r2, r0)     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.io.OutputStream r2 = r4.out     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            byte[] r3 = r4.OooO0O0     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            r2.write(r3, r0, r1)     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            goto L_0x003a
        L_0x0031:
            com.pd.sdk.I1LLllll r0 = r4.OooO00o     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            if (r0 == 0) goto L_0x003a
            com.pd.sdk.I1LLllll r0 = r4.OooO00o     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
            r0.reset()     // Catch:{ InvalidCipherTextException -> 0x0045, Exception -> 0x003c }
        L_0x003a:
            r0 = 0
            goto L_0x004e
        L_0x003c:
            r0 = move-exception
            org.bouncycastle.crypto.io.CipherIOException r1 = new org.bouncycastle.crypto.io.CipherIOException
            java.lang.String r2 = "Error closing stream: "
            r1.<init>(r2, r0)
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            org.bouncycastle.crypto.io.InvalidCipherTextIOException r1 = new org.bouncycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error finalising cipher data"
            r1.<init>(r2, r0)
        L_0x004d:
            r0 = r1
        L_0x004e:
            r4.flush()     // Catch:{ IOException -> 0x0057 }
            java.io.OutputStream r1 = r4.out     // Catch:{ IOException -> 0x0057 }
            r1.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            if (r0 != 0) goto L_0x005b
            r0 = r1
        L_0x005b:
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.li1LI1l.close():void");
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f18585OooO00o;
        byte b = (byte) i;
        bArr[0] = b;
        I1LLllll i1LLllll = this.OooO00o;
        if (i1LLllll != null) {
            ((FilterOutputStream) this).out.write(i1LLllll.OooO00o(b));
        } else {
            write(bArr, 0, 1);
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        OooO00o(i2, false);
        C6744ll1L r1 = this.f18584OooO00o;
        if (r1 != null) {
            int OooO00o2 = r1.OooO00o(bArr, i, i2, this.OooO0O0, 0);
            if (OooO00o2 != 0) {
                ((FilterOutputStream) this).out.write(this.OooO0O0, 0, OooO00o2);
                return;
            }
            return;
        }
        LLLi1iII lLLi1iII = this.f18583OooO00o;
        if (lLLi1iII != null) {
            int OooO00o3 = lLLi1iII.OooO00o(bArr, i, i2, this.OooO0O0, 0);
            if (OooO00o3 != 0) {
                ((FilterOutputStream) this).out.write(this.OooO0O0, 0, OooO00o3);
                return;
            }
            return;
        }
        this.OooO00o.OooO00o(bArr, i, i2, this.OooO0O0, 0);
        ((FilterOutputStream) this).out.write(this.OooO0O0, 0, i2);
    }
}
