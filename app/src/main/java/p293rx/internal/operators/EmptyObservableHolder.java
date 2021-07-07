package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;

/* renamed from: rx.internal.operators.EmptyObservableHolder */
public enum EmptyObservableHolder implements C9349III.OooO00o<Object> {
    INSTANCE;
    
    public static final C9349III<Object> EMPTY;

    /* access modifiers changed from: public */
    static {
        EmptyObservableHolder emptyObservableHolder;
        EMPTY = C9349III.OooO0O0((C9349III.OooO00o) emptyObservableHolder);
    }

    public static <T> C9349III<T> instance() {
        return (C9349III<T>) EMPTY;
    }

    public void call(AbstractC9508LiLi<? super Object> r1) {
        r1.onCompleted();
    }
}
