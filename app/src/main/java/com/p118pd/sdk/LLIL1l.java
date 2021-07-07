package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p293rx.Notification;
import p293rx.exceptions.CompositeException;

@Deprecated
/* renamed from: com.pd.sdk.LLIL1l */
public class LLIL1l<T> implements AbstractC5477Il11<T> {
    public static final AbstractC5477Il11<Object> OooO0O0 = new OooO00o();
    public final AbstractC5477Il11<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<T> f16420OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final List<Throwable> f16421OooO0O0;
    public final List<Notification<T>> OooO0OO;

    /* renamed from: com.pd.sdk.LLIL1l$OooO00o */
    public static class OooO00o implements AbstractC5477Il11<Object> {
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(Object obj) {
        }
    }

    public LLIL1l(AbstractC5477Il11<T> r2) {
        this.f16420OooO00o = new ArrayList();
        this.f16421OooO0O0 = new ArrayList();
        this.OooO0OO = new ArrayList();
        this.OooO00o = r2;
    }

    public List<T> OooO00o() {
        return Collections.unmodifiableList(this.f16420OooO00o);
    }

    public List<Throwable> OooO0O0() {
        return Collections.unmodifiableList(this.f16421OooO0O0);
    }

    public List<Object> OooO0OO() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f16420OooO00o);
        arrayList.add(this.f16421OooO0O0);
        arrayList.add(this.OooO0OO);
        return Collections.unmodifiableList(arrayList);
    }

    public List<Notification<T>> OooO0Oo() {
        return Collections.unmodifiableList(this.OooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.OooO0OO.add(Notification.OooO00o());
        this.OooO00o.onCompleted();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.f16421OooO0O0.add(th);
        this.OooO00o.onError(th);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.f16420OooO00o.add(t);
        this.OooO00o.onNext(t);
    }

    public void OooO00o(List<T> list) {
        if (this.f16420OooO00o.size() != list.size()) {
            OooO00o("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.f16420OooO00o.size() + ".\n" + "Provided values: " + list + "\n" + "Actual values: " + this.f16420OooO00o + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            T t2 = this.f16420OooO00o.get(i);
            if (t == null) {
                if (t2 != null) {
                    OooO00o("Value at index: " + i + " expected to be [null] but was: [" + ((Object) t2) + "]\n");
                }
            } else if (!t.equals(t2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value at index: ");
                sb.append(i);
                sb.append(" expected to be [");
                sb.append((Object) t);
                sb.append("] (");
                sb.append(t.getClass().getSimpleName());
                sb.append(") but was: [");
                sb.append((Object) t2);
                sb.append("] (");
                sb.append(t2 != null ? t2.getClass().getSimpleName() : "null");
                sb.append(")\n");
                OooO00o(sb.toString());
            }
        }
    }

    public LLIL1l() {
        this.f16420OooO00o = new ArrayList();
        this.f16421OooO0O0 = new ArrayList();
        this.OooO0OO = new ArrayList();
        this.OooO00o = (AbstractC5477Il11<T>) OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16196OooO00o() {
        if (this.f16421OooO0O0.size() > 1) {
            OooO00o("Too many onError events: " + this.f16421OooO0O0.size());
        }
        if (this.OooO0OO.size() > 1) {
            OooO00o("Too many onCompleted events: " + this.OooO0OO.size());
        }
        if (this.OooO0OO.size() == 1 && this.f16421OooO0O0.size() == 1) {
            OooO00o("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.OooO0OO.isEmpty() && this.f16421OooO0O0.isEmpty()) {
            OooO00o("No terminal events received.");
        }
    }

    public final void OooO00o(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int size = this.OooO0OO.size();
        sb.append(size);
        sb.append(" completion");
        if (size != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.f16421OooO0O0.isEmpty()) {
            int size2 = this.f16421OooO0O0.size();
            sb.append(" (+");
            sb.append(size2);
            sb.append(" error");
            if (size2 != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f16421OooO0O0.isEmpty()) {
            if (this.f16421OooO0O0.size() == 1) {
                assertionError.initCause(this.f16421OooO0O0.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.f16421OooO0O0));
            }
        }
        throw assertionError;
    }
}
