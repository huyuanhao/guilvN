package com.p118pd.sdk;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oo0oo0Oo  reason: case insensitive filesystem */
public class C8758oo0oo0Oo {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ByteBuffer f21940OooO00o;

    public C8758oo0oo0Oo(int i, ByteBuffer byteBuffer) {
        this.OooO00o = i;
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            this.f21940OooO00o = byteBuffer;
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m20399OooO00o() {
        byte[] array = this.f21940OooO00o.array();
        int arrayOffset = this.f21940OooO00o.arrayOffset();
        return Arrays.copyOfRange(array, this.f21940OooO00o.position() + arrayOffset, arrayOffset + this.f21940OooO00o.limit());
    }
}
