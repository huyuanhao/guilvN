package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import p293rx.internal.operators.NotificationLite;
import p293rx.internal.producers.SingleProducer;
import p293rx.subjects.SubjectSubscriptionManager;

/* renamed from: com.pd.sdk.丨1丨L1LI1  reason: invalid class name */
public final class C1L1LI1<T> extends AbstractC5635LIi1<T, T> {
    public volatile Object OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SubjectSubscriptionManager<T> f22827OooO00o;

    /* renamed from: com.pd.sdk.丨1丨L1LI1$OooO00o */
    public static class OooO00o implements AbstractC6153iL1l<SubjectSubscriptionManager.OooO0OO<T>> {
        public final /* synthetic */ SubjectSubscriptionManager OooO00o;

        public OooO00o(SubjectSubscriptionManager subjectSubscriptionManager) {
            this.OooO00o = subjectSubscriptionManager;
        }

        /* renamed from: OooO00o */
        public void call(SubjectSubscriptionManager.OooO0OO<T> oooO0OO) {
            Object latest = this.OooO00o.getLatest();
            if (latest == null || NotificationLite.m22999OooO00o(latest)) {
                oooO0OO.onCompleted();
            } else if (NotificationLite.m23000OooO0O0(latest)) {
                oooO0OO.onError(NotificationLite.m22998OooO00o(latest));
            } else {
                oooO0OO.OooO00o.setProducer(new SingleProducer(oooO0OO.OooO00o, NotificationLite.OooO00o(latest)));
            }
        }
    }

    public C1L1LI1(C9349III.OooO00o<T> oooO00o, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(oooO00o);
        this.f22827OooO00o = subjectSubscriptionManager;
    }

    public static <T> C1L1LI1<T> OooO00o() {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        subjectSubscriptionManager.onTerminated = new OooO00o(subjectSubscriptionManager);
        return new C1L1LI1<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public boolean OooO0O0() {
        Object latest = this.f22827OooO00o.getLatest();
        return latest != null && !NotificationLite.m23000OooO0O0(latest);
    }

    @Override // com.p118pd.sdk.C9349III
    public boolean OooO0OO() {
        return NotificationLite.m23000OooO0O0(this.f22827OooO00o.getLatest());
    }

    @Override // com.p118pd.sdk.C9349III
    public boolean OooO0Oo() {
        return !NotificationLite.m23000OooO0O0(this.f22827OooO00o.getLatest()) && NotificationLite.OooO0OO(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (this.f22827OooO00o.active) {
            Object obj = this.OooO00o;
            if (obj == null) {
                obj = NotificationLite.OooO00o();
            }
            SubjectSubscriptionManager.OooO0OO<T>[] terminate = this.f22827OooO00o.terminate(obj);
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : terminate) {
                if (obj == NotificationLite.OooO00o()) {
                    oooO0OO.onCompleted();
                } else {
                    oooO0OO.OooO00o.setProducer(new SingleProducer(oooO0OO.OooO00o, NotificationLite.OooO00o(obj)));
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        if (this.f22827OooO00o.active) {
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : this.f22827OooO00o.terminate(NotificationLite.OooO00o(th))) {
                try {
                    oooO0OO.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            IIl11.OooO00o(arrayList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.OooO00o = NotificationLite.OooO0O0((Object) t);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21351OooO00o() {
        return this.f22827OooO00o.observers().length > 0;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m21349OooO00o() {
        Object obj = this.OooO00o;
        if (NotificationLite.m23000OooO0O0(this.f22827OooO00o.getLatest()) || !NotificationLite.OooO0OO(obj)) {
            return null;
        }
        return (T) NotificationLite.OooO00o(obj);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m21350OooO00o() {
        Object latest = this.f22827OooO00o.getLatest();
        if (NotificationLite.m23000OooO0O0(latest)) {
            return NotificationLite.m22998OooO00o(latest);
        }
        return null;
    }
}
