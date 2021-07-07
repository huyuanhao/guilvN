package com.taobao.accs.utl;

import java.io.ByteArrayOutputStream;

/* renamed from: com.taobao.accs.utl.r */
public class C3188r extends ByteArrayOutputStream {
    public C3188r(int i) {
        super(i);
    }

    /* renamed from: a */
    public C3188r mo37786a(byte b) {
        write(b);
        return this;
    }

    public C3188r() {
    }

    /* renamed from: a */
    public C3188r mo37787a(short s) {
        write(s >> 8);
        write(s);
        return this;
    }
}
