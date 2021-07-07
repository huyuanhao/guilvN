package com.qiyukf.nimlib.p183g.p191c.p194c;

import java.nio.ByteBuffer;
import java.util.zip.Inflater;

/* renamed from: com.qiyukf.nimlib.g.c.c.e */
public final class C2298e {
    /* renamed from: a */
    public static ByteBuffer m4897a(C2299f fVar) {
        int e = fVar.mo34980e();
        if (e < 0 || e >= 10485760) {
            throw new C2300g("invalid uncompress len:" + e);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate(e);
            Inflater inflater = new Inflater();
            ByteBuffer b = fVar.mo34977b();
            inflater.setInput(b.array(), b.position(), b.limit() - b.position());
            allocate.position(inflater.inflate(allocate.array()));
            inflater.end();
            allocate.flip();
            return allocate;
        } catch (Exception unused) {
            throw new C2300g("uncompress error");
        }
    }
}
