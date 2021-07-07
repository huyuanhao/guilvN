package com.qiyukf.basesdk.p120b.p132b.p137e;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a;
import com.qiyukf.basesdk.p120b.p132b.p135c.C1796f;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.qiyukf.basesdk.b.b.e.a */
public final class C1804a {

    /* renamed from: a */
    public static final ClosedChannelException f3328a = new ClosedChannelException();

    /* renamed from: b */
    public static final NotYetConnectedException f3329b = new NotYetConnectedException();

    /* renamed from: a */
    public static Exception m3401a(AbstractC1765a aVar) {
        if (!aVar.mo33984b().mo34066b()) {
            return aVar.mo33986d() ? f3329b : f3328a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m3402a(C1796f fVar, Runnable runnable) {
        try {
            fVar.execute(runnable);
        } catch (RejectedExecutionException unused) {
            C1709a.m3016c("socket", "execute task in terminated event loog");
        }
    }
}
