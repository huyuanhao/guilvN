package com.vivo.push.p282c;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.AbstractRunnableC4157v;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.c.c */
public final class C4075c extends AbstractRunnableC4157v {
    public C4075c(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4146p.m11209a(ClientConfigManagerImpl.getInstance(this.f11150a).isDebug());
    }
}
