package com.qiyukf.nimlib.p183g.p191c.p194c;

import com.p118pd.sdk.O0O00O;
import com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.qiyukf.nimlib.g.c.c.f */
public final class C2299f {

    /* renamed from: a */
    public ByteBuffer f4590a;

    public C2299f() {
        this.f4590a = null;
    }

    public C2299f(ByteBuffer byteBuffer) {
        this(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public C2299f(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C2299f(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        this.f4590a = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    private byte[] m4898a(int i) {
        try {
            byte[] bArr = new byte[i];
            this.f4590a.get(bArr);
            return bArr;
        } catch (BufferUnderflowException unused) {
            throw new C2300g();
        }
    }

    /* renamed from: a */
    public final int mo34974a() {
        return this.f4590a.limit() - this.f4590a.position();
    }

    /* renamed from: a */
    public final AbstractC2292a mo34975a(AbstractC2292a aVar) {
        aVar.mo34938a(this);
        return aVar;
    }

    /* renamed from: a */
    public final String mo34976a(String str) {
        try {
            return new String(mo34979d(), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C2300g();
        }
    }

    /* renamed from: b */
    public final ByteBuffer mo34977b() {
        return this.f4590a.duplicate();
    }

    /* renamed from: c */
    public final byte mo34978c() {
        try {
            return this.f4590a.get();
        } catch (BufferUnderflowException unused) {
            throw new C2300g();
        }
    }

    /* renamed from: d */
    public final byte[] mo34979d() {
        return m4898a(mo34981f());
    }

    /* renamed from: e */
    public final int mo34980e() {
        try {
            return this.f4590a.getInt();
        } catch (BufferUnderflowException unused) {
            throw new C2300g();
        }
    }

    /* renamed from: f */
    public final int mo34981f() {
        byte c;
        int i = 1;
        int i2 = 0;
        do {
            c = mo34978c();
            i2 += (c & O0O00O.OooO0O0) * i;
            i <<= 7;
        } while ((c & O0O00O.OooO00o) != 0);
        return i2;
    }

    /* renamed from: g */
    public final long mo34982g() {
        try {
            return this.f4590a.getLong();
        } catch (BufferUnderflowException unused) {
            throw new C2300g();
        }
    }

    /* renamed from: h */
    public final short mo34983h() {
        try {
            return this.f4590a.getShort();
        } catch (BufferUnderflowException unused) {
            throw new C2300g();
        }
    }

    public final String toString() {
        return this.f4590a.toString();
    }
}
