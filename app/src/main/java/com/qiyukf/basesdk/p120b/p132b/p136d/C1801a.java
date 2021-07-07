package com.qiyukf.basesdk.p120b.p132b.p136d;

import android.util.SparseArray;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1767c;
import com.qiyukf.basesdk.p120b.p132b.p137e.C1804a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.qiyukf.basesdk.b.b.d.a */
public final class C1801a {

    /* renamed from: a */
    public AbstractC1765a f3320a;

    /* renamed from: b */
    public SocketChannel f3321b;

    /* renamed from: c */
    public SelectionKey f3322c;

    /* renamed from: d */
    public boolean f3323d = false;

    /* renamed from: e */
    public final List<C1803a> f3324e = new LinkedList();

    /* renamed from: com.qiyukf.basesdk.b.b.d.a$a */
    public static class C1803a {

        /* renamed from: a */
        public ByteBuffer f3326a;

        /* renamed from: b */
        public C1767c f3327b;

        public C1803a(ByteBuffer byteBuffer, C1767c cVar) {
            this.f3326a = byteBuffer;
            this.f3327b = cVar;
        }
    }

    public C1801a(AbstractC1765a aVar) {
        this.f3320a = aVar;
    }

    /* renamed from: b */
    private boolean m3388b(SocketAddress socketAddress) {
        try {
            boolean connect = this.f3321b.connect(socketAddress);
            if (!connect) {
                this.f3322c.interestOps(8);
            }
            return connect;
        } catch (Throwable th) {
            try {
                this.f3321b.close();
            } catch (IOException unused) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private boolean m3389b(ByteBuffer byteBuffer, C1767c cVar) {
        boolean z = true;
        if (byteBuffer.remaining() == 0) {
            cVar.mo33993b();
            return true;
        }
        int i = 9;
        while (true) {
            if (i >= 16) {
                z = false;
                break;
            }
            try {
                if (this.f3321b.write(byteBuffer) == 0) {
                    break;
                } else if (byteBuffer.remaining() <= 0) {
                    cVar.mo33993b();
                    return true;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                this.f3320a.mo33982a().mo34014a(th);
            }
        }
        if (z) {
            this.f3322c.interestOps(4);
        } else {
            this.f3320a.mo33985c().execute(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p132b.p136d.C1801a.RunnableC18021 */

                public final void run() {
                    C1801a.this.mo34068d();
                }
            });
        }
        return false;
    }

    /* renamed from: a */
    public final int mo34060a(ByteBuffer byteBuffer) {
        return this.f3321b.read(byteBuffer);
    }

    /* renamed from: a */
    public final SelectionKey mo34061a(Selector selector, AbstractC1765a aVar) {
        SelectionKey register = this.f3321b.register(selector, 0, aVar);
        this.f3322c = register;
        return register;
    }

    /* renamed from: a */
    public final <T> void mo34062a(SparseArray<Object> sparseArray) {
        SocketChannel openSocketChannel = SelectorProvider.provider().openSocketChannel();
        this.f3321b = openSocketChannel;
        openSocketChannel.configureBlocking(false);
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            Object valueAt = sparseArray.valueAt(i);
            if (keyAt == 4098) {
                this.f3321b.socket().setReceiveBufferSize(((Integer) valueAt).intValue());
            } else if (keyAt == 4097) {
                this.f3321b.socket().setSendBufferSize(((Integer) valueAt).intValue());
            } else {
                boolean z = true;
                if (keyAt == 1) {
                    this.f3321b.socket().setTcpNoDelay(((Boolean) valueAt).booleanValue());
                } else if (keyAt == 8) {
                    this.f3321b.socket().setKeepAlive(((Boolean) valueAt).booleanValue());
                } else if (keyAt == 4) {
                    this.f3321b.socket().setReuseAddress(((Boolean) valueAt).booleanValue());
                } else if (keyAt == 128) {
                    int intValue = ((Integer) valueAt).intValue();
                    Socket socket = this.f3321b.socket();
                    if (intValue <= 0) {
                        z = false;
                    }
                    socket.setSoLinger(z, intValue);
                } else if (keyAt == 3) {
                    this.f3321b.socket().setTrafficClass(((Integer) valueAt).intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34063a(ByteBuffer byteBuffer, C1767c cVar) {
        this.f3324e.add(new C1803a(byteBuffer, cVar));
        mo34068d();
    }

    /* renamed from: a */
    public final boolean mo34064a() {
        SocketChannel socketChannel = this.f3321b;
        return socketChannel != null && socketChannel.isOpen();
    }

    /* renamed from: a */
    public final boolean mo34065a(SocketAddress socketAddress) {
        return m3388b(socketAddress);
    }

    /* renamed from: b */
    public final boolean mo34066b() {
        SocketChannel socketChannel = this.f3321b;
        return socketChannel != null && socketChannel.isOpen() && this.f3321b.isConnected();
    }

    /* renamed from: c */
    public final void mo34067c() {
        this.f3321b.close();
        for (C1803a aVar : this.f3324e) {
            aVar.f3327b.mo33992a(C1804a.m3401a(this.f3320a));
        }
        this.f3324e.clear();
    }

    /* renamed from: d */
    public final void mo34068d() {
        if (!this.f3323d) {
            this.f3323d = true;
            Iterator<C1803a> it = this.f3324e.iterator();
            while (it.hasNext()) {
                C1803a next = it.next();
                if (!m3389b(next.f3326a, next.f3327b)) {
                    break;
                }
                it.remove();
            }
            this.f3323d = false;
        }
    }

    /* renamed from: e */
    public final boolean mo34069e() {
        return this.f3323d;
    }

    /* renamed from: f */
    public final void mo34070f() {
        if (!this.f3321b.finishConnect()) {
            throw new Error();
        }
    }
}
