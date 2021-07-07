package com.qiyukf.nimlib.p183g.p191c.p194c;

import android.text.TextUtils;
import com.qiyukf.nimlib.p183g.p191c.p193b.AbstractC2292a;
import java.io.UnsupportedEncodingException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.qiyukf.nimlib.g.c.c.b */
public final class C2295b {

    /* renamed from: a */
    public ByteBuffer f4588a;

    /* renamed from: b */
    public int f4589b = 1048576;

    public C2295b() {
        ByteBuffer a = C2294a.m4877a();
        this.f4588a = a;
        a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: c */
    private void m4878c(int i) {
        if (this.f4588a.remaining() < i) {
            int capacity = (this.f4588a.capacity() + i) - this.f4588a.remaining();
            if (capacity <= this.f4589b) {
                ByteBuffer allocate = ByteBuffer.allocate(Math.min(Math.max(capacity, this.f4588a.capacity() << 1), this.f4589b));
                allocate.order(this.f4588a.order());
                this.f4588a.flip();
                allocate.put(this.f4588a);
                this.f4588a = allocate;
                return;
            }
            throw new BufferOverflowException();
        }
    }

    /* renamed from: a */
    public final int mo34959a() {
        return this.f4588a.position();
    }

    /* renamed from: a */
    public final C2295b mo34960a(byte b) {
        try {
            m4878c(1);
            this.f4588a.put(b);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34961a(int i) {
        try {
            m4878c(4);
            this.f4588a.putInt(i);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34962a(long j) {
        try {
            m4878c(8);
            this.f4588a.putLong(j);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34963a(AbstractC2292a aVar) {
        aVar.mo34937a(this);
        return this;
    }

    /* renamed from: a */
    public final C2295b mo34964a(String str) {
        try {
            return mo34971b(TextUtils.isEmpty(str) ? null : str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34965a(ByteBuffer byteBuffer) {
        try {
            m4878c(byteBuffer.remaining());
            this.f4588a.put(byteBuffer);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34966a(short s) {
        try {
            m4878c(2);
            this.f4588a.putShort(s);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34967a(boolean z) {
        int i = 1;
        try {
            m4878c(1);
            ByteBuffer byteBuffer = this.f4588a;
            if (!z) {
                i = 0;
            }
            byteBuffer.put((byte) i);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: a */
    public final C2295b mo34968a(byte[] bArr) {
        try {
            m4878c(bArr.length);
            this.f4588a.put(bArr);
            return this;
        } catch (BufferOverflowException unused) {
            throw new C2296c();
        }
    }

    /* renamed from: b */
    public final C2295b mo34969b(int i) {
        return mo34968a(C2297d.m4895a(i));
    }

    /* renamed from: b */
    public final C2295b mo34970b(String str) {
        try {
            mo34962a(Long.valueOf(str).longValue());
            return this;
        } catch (Exception unused) {
            throw new C2296c();
        }
    }

    /* renamed from: b */
    public final C2295b mo34971b(byte[] bArr) {
        if (bArr == null) {
            try {
                return mo34969b(0);
            } catch (BufferOverflowException unused) {
                throw new C2296c();
            }
        } else if (bArr.length <= 2147483645) {
            m4878c(C2297d.m4896b(bArr.length) + bArr.length);
            this.f4588a.put(C2297d.m4895a(bArr.length));
            this.f4588a.put(bArr);
            return this;
        } else {
            throw new C2296c();
        }
    }

    /* renamed from: b */
    public final ByteBuffer mo34972b() {
        ByteBuffer duplicate = this.f4588a.duplicate();
        duplicate.flip();
        return duplicate;
    }

    public final String toString() {
        return this.f4588a.toString() + " Size " + this.f4588a.position();
    }
}
