package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p293rx.internal.operators.NotificationLite;
import p293rx.subjects.SubjectSubscriptionManager;

/* renamed from: com.pd.sdk.lLiiIi1 */
public final class lLiiIi1<T> extends AbstractC5635LIi1<T, T> {
    public static final Object[] OooO00o = new Object[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SubjectSubscriptionManager<T> f18538OooO00o;

    /* renamed from: com.pd.sdk.lLiiIi1$OooO00o */
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

    public lLiiIi1(C9349III.OooO00o<T> oooO00o, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(oooO00o);
        this.f18538OooO00o = subjectSubscriptionManager;
    }

    public static <T> lLiiIi1<T> OooO00o() {
        return OooO00o((Object) null, false);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public int OooO0O0() {
        return this.f18538OooO00o.observers().length;
    }

    @Override // com.p118pd.sdk.C9349III
    public boolean OooO0OO() {
        return NotificationLite.m23000OooO0O0(this.f18538OooO00o.getLatest());
    }

    @Override // com.p118pd.sdk.C9349III
    public boolean OooO0Oo() {
        return NotificationLite.OooO0OO(this.f18538OooO00o.getLatest());
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (this.f18538OooO00o.getLatest() == null || this.f18538OooO00o.active) {
            Object OooO00o2 = NotificationLite.OooO00o();
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : this.f18538OooO00o.terminate(OooO00o2)) {
                oooO0OO.OooO0OO(OooO00o2);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        if (this.f18538OooO00o.getLatest() == null || this.f18538OooO00o.active) {
            Object OooO00o2 = NotificationLite.OooO00o(th);
            ArrayList arrayList = null;
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : this.f18538OooO00o.terminate(OooO00o2)) {
                try {
                    oooO0OO.OooO0OO(OooO00o2);
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
        if (this.f18538OooO00o.getLatest() == null || this.f18538OooO00o.active) {
            Object OooO0O0 = NotificationLite.OooO0O0((Object) t);
            for (SubjectSubscriptionManager.OooO0OO<T> oooO0OO : this.f18538OooO00o.next(OooO0O0)) {
                oooO0OO.OooO0OO(OooO0O0);
            }
        }
    }

    public static <T> lLiiIi1<T> OooO00o(T t) {
        return OooO00o((Object) t, true);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17697OooO0O0() {
        return NotificationLite.m22999OooO00o(this.f18538OooO00o.getLatest());
    }

    public static <T> lLiiIi1<T> OooO00o(T t, boolean z) {
        SubjectSubscriptionManager subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.setLatest(NotificationLite.OooO0O0((Object) t));
        }
        OooO00o oooO00o = new OooO00o(subjectSubscriptionManager);
        subjectSubscriptionManager.onAdded = oooO00o;
        subjectSubscriptionManager.onTerminated = oooO00o;
        return new lLiiIi1<>(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17695OooO00o() {
        return this.f18538OooO00o.observers().length > 0;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m17693OooO00o() {
        Object latest = this.f18538OooO00o.getLatest();
        if (NotificationLite.OooO0OO(latest)) {
            return (T) NotificationLite.OooO00o(latest);
        }
        return null;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m17694OooO00o() {
        Object latest = this.f18538OooO00o.getLatest();
        if (NotificationLite.m23000OooO0O0(latest)) {
            return NotificationLite.m22998OooO00o(latest);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    public T[] OooO00o(T[] tArr) {
        Object latest = this.f18538OooO00o.getLatest();
        if (NotificationLite.OooO0OO(latest)) {
            if (tArr.length == 0) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            }
            tArr[0] = NotificationLite.OooO00o(latest);
            if (tArr.length > 1) {
                tArr[1] = null;
            }
        } else if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.lLiiIi1<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object[] m17696OooO00o() {
        Object[] OooO00o2 = OooO00o(OooO00o);
        return OooO00o2 == OooO00o ? new Object[0] : OooO00o2;
    }
}
