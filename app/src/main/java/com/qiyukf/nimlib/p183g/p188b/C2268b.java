package com.qiyukf.nimlib.p183g.p188b;

import com.p118pd.sdk.C7482o0OoO0OO;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p132b.C1764a;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1772e;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1773f;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1766b;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1767c;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1774g;
import com.qiyukf.basesdk.p120b.p132b.p134b.C1788b;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c;
import com.qiyukf.basesdk.p120b.p132b.p135c.C1795e;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p180e.p181a.C2227a;
import com.qiyukf.nimlib.p183g.C2247a;
import com.qiyukf.nimlib.p183g.p184a.p186b.C2254b;
import com.qiyukf.nimlib.p183g.p188b.C2281d;
import com.qiyukf.nimlib.p183g.p188b.p189a.C2266a;
import com.qiyukf.nimlib.p183g.p188b.p189a.C2267b;
import com.qiyukf.nimlib.p183g.p188b.p190b.C2275a;
import com.qiyukf.nimlib.p183g.p188b.p190b.C2278b;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2300g;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.g.b.b */
public final class C2268b {

    /* renamed from: a */
    public AbstractC2274a f4515a;

    /* renamed from: b */
    public AtomicInteger f4516b = new AtomicInteger(0);

    /* renamed from: c */
    public AbstractC1765a f4517c;

    /* renamed from: d */
    public C1767c f4518d;

    /* renamed from: e */
    public C2281d f4519e;

    /* renamed from: f */
    public C1764a f4520f;

    /* renamed from: g */
    public C2247a f4521g = new C2247a() {
        /* class com.qiyukf.nimlib.p183g.p188b.C2268b.C22691 */

        @Override // com.qiyukf.nimlib.p183g.C2247a
        /* renamed from: a */
        public final void mo34874a() {
            C2268b.this.mo34904a((AbstractC2131a) new C2254b());
        }

        @Override // com.qiyukf.nimlib.p183g.C2247a
        /* renamed from: b */
        public final void mo34876b() {
            C1709a.m3011a("core", "keep alive on timeout");
            C2268b.this.m4784e();
        }
    };

    /* renamed from: h */
    public AbstractC1773f f4522h = new AbstractC1773f() {
        /* class com.qiyukf.nimlib.p183g.p188b.C2268b.C22713 */

        @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1773f
        /* renamed from: a */
        public final void mo34009a(C1767c cVar) {
            C2268b.m4775a(C2268b.this, cVar);
        }
    };

    /* renamed from: com.qiyukf.nimlib.g.b.b$a */
    public interface AbstractC2274a {
        /* renamed from: a */
        void mo34910a(int i);

        /* renamed from: a */
        void mo34911a(AbstractC2148a.C2149a aVar);
    }

    public C2268b(AbstractC2274a aVar) {
        this.f4515a = aVar;
        m4786f();
    }

    /* renamed from: a */
    public static /* synthetic */ void m4775a(C2268b bVar, C1767c cVar) {
        synchronized (bVar) {
            bVar.f4518d = null;
        }
        char c = cVar.mo33996d() ? (char) 2 : 0;
        StringBuilder sb = new StringBuilder("on connect completed, state=");
        sb.append(cVar.mo33996d() ? "CONNECTED" : "DISCONNECTED");
        C1709a.m3011a("core", sb.toString());
        if (bVar.f4516b.get() == 1) {
            if (c == 2) {
                bVar.f4516b.set(2);
                synchronized (bVar) {
                    bVar.f4517c = cVar.mo33990a();
                }
                AbstractC2274a aVar = bVar.f4515a;
                if (aVar != null) {
                    aVar.mo34910a(2);
                    return;
                }
                return;
            }
            bVar.m4784e();
        } else if (c == 2) {
            cVar.mo33990a().mo33987e();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4776a(C2268b bVar, AbstractC2148a.C2149a aVar) {
        AbstractC2274a aVar2 = bVar.f4515a;
        if (aVar2 != null) {
            aVar2.mo34911a(aVar);
        }
    }

    /* renamed from: a */
    private void m4777a(Object obj) {
        AbstractC1765a aVar = this.f4517c;
        if (aVar != null) {
            aVar.mo33981a(obj);
        } else {
            C1709a.m3011a("core", "writeRequest while channel is null");
        }
    }

    /* renamed from: c */
    private boolean m4780c() {
        return this.f4516b.get() == 2 || this.f4516b.get() == 3;
    }

    /* renamed from: d */
    private int m4781d() {
        AbstractC1765a aVar = this.f4517c;
        C1767c cVar = this.f4518d;
        synchronized (this) {
            this.f4517c = null;
            this.f4518d = null;
        }
        if (cVar != null) {
            cVar.mo33994b(this.f4522h);
            cVar.mo33997e();
        }
        if (aVar != null) {
            aVar.mo33987e();
        }
        int andSet = this.f4516b.getAndSet(0);
        if (!(andSet == 3 || andSet == 0)) {
            C1709a.m3011a("core", "on channel unreachable");
            C2275a.m4806a().mo34913c();
        }
        this.f4521g.mo34879e();
        C1709a.m3018d("core", "do disconnect from " + andSet);
        return andSet;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m4784e() {
        int d = m4781d();
        AbstractC2274a aVar = this.f4515a;
        if (aVar != null && d != 0) {
            aVar.mo34910a(0);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m4786f() {
        C1764a aVar = this.f4520f;
        if (aVar != null) {
            aVar.mo33980b();
        }
        C1764a aVar2 = new C1764a();
        this.f4520f = aVar2;
        aVar2.mo33978a(1, (Object) true).mo33977a().mo33978a(4098, (Object) 65536).mo33979a(new AbstractC1772e() {
            /* class com.qiyukf.nimlib.p183g.p188b.C2268b.C22735 */

            @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1772e
            /* renamed from: a */
            public final void mo34008a(C1774g gVar) {
                gVar.mo34013a((AbstractC1793c) new C2266a(C2268b.this.f4519e));
                gVar.mo34013a((AbstractC1793c) new C2267b(C2268b.this.f4519e));
                gVar.mo34013a((AbstractC1793c) new C1795e() {
                    /* class com.qiyukf.nimlib.p183g.p188b.C2268b.C22702 */

                    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d, com.qiyukf.basesdk.p120b.p132b.p135c.C1795e
                    /* renamed from: a */
                    public final void mo34039a(Object obj) {
                        if (C2268b.this.f4517c == this.f3305a.mo34006f() && (obj instanceof AbstractC2148a.C2149a)) {
                            C2268b.m4776a(C2268b.this, (AbstractC2148a.C2149a) obj);
                            C2268b.this.f4521g.mo34875a(false);
                        }
                    }

                    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.C1792b, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
                    /* renamed from: a */
                    public final void mo34032a(Object obj, C1767c cVar) {
                        super.mo34032a(obj, cVar);
                        C2268b.this.f4521g.mo34875a(true);
                    }

                    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.C1792b, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
                    /* renamed from: a */
                    public final void mo34033a(Throwable th) {
                        if (this.f3305a.mo34006f() == C2268b.this.f4517c || C2268b.this.f4517c == null) {
                            C1709a.m3020e("core", "network exception caught: " + th);
                            th.printStackTrace();
                            if (th instanceof SocketException) {
                                C1709a.m3011a("core", "on channel throw socket exception, on disconnected");
                                C2268b.this.m4784e();
                            } else if ((th instanceof C1788b) && (th.getCause() instanceof C2300g)) {
                                C1709a.m3011a("core", "on channel throw unpack exception, on disconnected and setup netty");
                                C2268b.this.m4784e();
                                C2268b.this.m4786f();
                            }
                        } else {
                            C1709a.m3018d(C7482o0OoO0OO.OooOO0O, "channel exception, but not current one, cause: " + th);
                        }
                    }

                    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d, com.qiyukf.basesdk.p120b.p132b.p135c.C1795e
                    /* renamed from: h */
                    public final void mo34040h() {
                        if (C2268b.this.f4517c != null && C2268b.this.f4517c == this.f3305a.mo34006f()) {
                            C1709a.m3011a("core", "on channel inactive, on disconnected");
                            C2268b.this.m4784e();
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void mo34903a() {
        if (this.f4516b.get() != 0) {
            m4781d();
        }
    }

    /* renamed from: a */
    public final boolean mo34904a(AbstractC2131a aVar) {
        if (!m4780c()) {
            C1709a.m3011a("core", "sendPacket while not connected");
            return false;
        }
        m4777a((Object) aVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo34905a(C2227a aVar) {
        if (!m4780c()) {
            return false;
        }
        m4777a((Object) aVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo34906a(C2278b bVar) {
        if (!this.f4516b.compareAndSet(0, 1)) {
            return false;
        }
        if (this.f4519e == null) {
            this.f4519e = new C2281d(C2180b.m4471a(), new C2281d.AbstractC2283b() {
                /* class com.qiyukf.nimlib.p183g.p188b.C2268b.C22724 */

                @Override // com.qiyukf.nimlib.p183g.p188b.C2281d.AbstractC2283b
                /* renamed from: a */
                public final void mo34908a() {
                    C2268b.this.m4784e();
                }

                @Override // com.qiyukf.nimlib.p183g.p188b.C2281d.AbstractC2283b
                /* renamed from: a */
                public final void mo34909a(AbstractC2131a.C2132a aVar, boolean z) {
                    C2268b.this.f4516b.compareAndSet(2, 3);
                    if (z) {
                        AbstractC2148a.C2149a a = AbstractC2148a.C2149a.m4409a(aVar.f4285a, 201);
                        if (a != null && C2268b.this.f4515a != null) {
                            C2268b.this.f4515a.mo34911a(a);
                            return;
                        }
                        return;
                    }
                    C2268b.this.f4521g.mo34878d();
                }
            });
        }
        this.f4519e.mo34923a();
        try {
            C1767c a = this.f4520f.mo33976a(bVar.f4542a, bVar.f4543b);
            synchronized (this) {
                this.f4518d = a;
            }
            a.mo33991a(this.f4522h);
        } catch (Exception e) {
            e.printStackTrace();
            C1709a.m3011a("core", "connect server failed: " + e);
            m4784e();
            if (e instanceof C1766b) {
                C1709a.m3011a("core", "connect server failed, e=ChannelException " + e.getMessage());
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo34907b() {
        if (m4780c()) {
            this.f4521g.mo34877c();
        }
    }
}
