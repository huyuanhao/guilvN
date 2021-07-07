package com.megvii.meglive_sdk.volley;

import android.os.Handler;
import com.megvii.meglive_sdk.volley.C1631o;
import java.util.concurrent.Executor;

/* renamed from: com.megvii.meglive_sdk.volley.f */
public final class C1621f implements AbstractC1634p {

    /* renamed from: a */
    public final Executor f2871a;

    /* renamed from: com.megvii.meglive_sdk.volley.f$OooO00o */
    public class OooO00o implements Executor {
        public final /* synthetic */ Handler OooO00o;

        public OooO00o(Handler handler) {
            this.OooO00o = handler;
        }

        public final void execute(Runnable runnable) {
            this.OooO00o.post(runnable);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.volley.f$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC1628m f15104OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C1631o f15105OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Runnable f15106OooO00o;

        public OooO0O0(AbstractC1628m mVar, C1631o oVar, Runnable runnable) {
            this.f15104OooO00o = mVar;
            this.f15105OooO00o = oVar;
            this.f15106OooO00o = runnable;
        }

        public final void run() {
            AbstractC1628m mVar = this.f15104OooO00o;
            if (mVar.f2890k) {
                mVar.mo17349b("canceled-at-delivery");
                return;
            }
            if (this.f15105OooO00o.f2913c == null) {
                this.f15104OooO00o.mo17347a((Object) this.f15105OooO00o.f2911a);
            } else {
                AbstractC1628m mVar2 = this.f15104OooO00o;
                C1638t tVar = this.f15105OooO00o.f2913c;
                C1631o.AbstractC1632a aVar = mVar2.f2886g;
                if (aVar != null) {
                    aVar.mo16993a(tVar);
                }
            }
            if (this.f15105OooO00o.f2914d) {
                this.f15104OooO00o.mo17348a("intermediate-response");
            } else {
                this.f15104OooO00o.mo17349b("done");
            }
            Runnable runnable = this.f15106OooO00o;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C1621f(Handler handler) {
        this.f2871a = new OooO00o(handler);
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1634p
    /* renamed from: a */
    public final void mo17339a(AbstractC1628m<?> mVar, C1631o<?> oVar) {
        mo17340a(mVar, oVar, null);
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1634p
    /* renamed from: a */
    public final void mo17341a(AbstractC1628m<?> mVar, C1638t tVar) {
        mVar.mo17348a("post-error");
        this.f2871a.execute(new OooO0O0(mVar, C1631o.m2809a(tVar), null));
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1634p
    /* renamed from: a */
    public final void mo17340a(AbstractC1628m<?> mVar, C1631o<?> oVar, Runnable runnable) {
        mVar.f2891l = true;
        mVar.mo17348a("post-response");
        this.f2871a.execute(new OooO0O0(mVar, oVar, runnable));
    }
}
