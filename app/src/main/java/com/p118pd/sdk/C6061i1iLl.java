package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;
import p293rx.internal.operators.NotificationLite;
import p293rx.subjects.SubjectSubscriptionManager;

/* renamed from: com.pd.sdk.i1丨iLl  reason: invalid class name and case insensitive filesystem */
public final class C6061i1iLl<T> extends AbstractC5635LIi1<T, T> {
    public final LL1LL.OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SubjectSubscriptionManager<T> f17464OooO00o;

    /* renamed from: com.pd.sdk.i1丨iLl$OooO00o */
    public static class OooO00o implements AbstractC6153iL1l<SubjectSubscriptionManager.OooO0OO<T>> {
        public final /* synthetic */ SubjectSubscriptionManager OooO00o;

        public OooO00o(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.OooO00o = subjectSubscriptionManager;
        }

        /* renamed from: OooO00o */
        public void call(SubjectSubscriptionManager.OooO0OO<T> oooO0OO) {
            oooO0OO.OooO0O0(this.OooO00o.getLatest());
        }
    }

    /* renamed from: com.pd.sdk.i1丨iLl$OooO0O0 */
    public class OooO0O0 implements liii1l {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            C6061i1iLl.this.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.i1丨iLl$OooO0OO */
    public class OooO0OO implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Throwable f17465OooO00o;

        public OooO0OO(Throwable th) {
            this.f17465OooO00o = th;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            C6061i1iLl.this.OooO00o(this.f17465OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.i1丨iLl$OooO0Oo  reason: case insensitive filesystem */
    public class C6062OooO0Oo implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f17466OooO00o;

        public C6062OooO0Oo(Object obj) {
            this.f17466OooO00o = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.i1丨iLl */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.liii1l
        public void call() {
            C6061i1iLl.this.OooO00o(this.f17466OooO00o);
        }
    }

    public C6061i1iLl(C9349III.OooO00o<T> oooO00o, SubjectSubscriptionManager<T> subjectSubscriptionManager, C6308ilI1I r3) {
        super(oooO00o);
        this.f17464OooO00o = subjectSubscriptionManager;
        this.OooO00o = r3.m17344OooO00o();
    }

    public static <T> C6061i1iLl<T> OooO00o(C6308ilI1I r2) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        OooO00o oooO00o = new OooO00o(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = oooO00o;
        subjectSubscriptionManager.onTerminated = oooO00o;
        return new C6061i1iLl<>(subjectSubscriptionManager, subjectSubscriptionManager, r2);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        OooO00o(0L);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        OooO00o(th, 0L);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        OooO00o((Object) t, 0L);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    public void OooO00o() {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.f17464OooO00o;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : subjectSubscriptionManager.terminate(NotificationLite.OooO00o())) {
                oooO0OO.onCompleted();
            }
        }
    }

    @Override // com.p118pd.sdk.C9349III
    public void OooO00o(long j) {
        this.OooO00o.OooO00o(new OooO0O0(), j, TimeUnit.MILLISECONDS);
    }

    public void OooO00o(Throwable th) {
        SubjectSubscriptionManager<T> subjectSubscriptionManager = this.f17464OooO00o;
        if (subjectSubscriptionManager.active) {
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : subjectSubscriptionManager.terminate(NotificationLite.OooO00o(th))) {
                oooO0OO.onError(th);
            }
        }
    }

    public void OooO00o(Throwable th, long j) {
        this.OooO00o.OooO00o(new OooO0OO(th), j, TimeUnit.MILLISECONDS);
    }

    @Override // com.p118pd.sdk.C9349III
    public void OooO00o(T t) {
        for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : this.f17464OooO00o.observers()) {
            oooO0OO.onNext(t);
        }
    }

    public void OooO00o(T t, long j) {
        this.OooO00o.OooO00o(new C6062OooO0Oo(t), j, TimeUnit.MILLISECONDS);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16924OooO00o() {
        return this.f17464OooO00o.observers().length > 0;
    }
}
