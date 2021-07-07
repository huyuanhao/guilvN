package p293rx.internal.util;

import com.p118pd.sdk.AbstractC9847l1;

/* renamed from: rx.internal.util.UtilityFunctions */
public final class UtilityFunctions {

    /* renamed from: rx.internal.util.UtilityFunctions$AlwaysFalse */
    public enum AlwaysFalse implements AbstractC9847l1<Object, Boolean> {
        INSTANCE;

        @Override // com.p118pd.sdk.AbstractC9847l1
        public Boolean call(Object obj) {
            return false;
        }
    }

    /* renamed from: rx.internal.util.UtilityFunctions$AlwaysTrue */
    public enum AlwaysTrue implements AbstractC9847l1<Object, Boolean> {
        INSTANCE;

        @Override // com.p118pd.sdk.AbstractC9847l1
        public Boolean call(Object obj) {
            return true;
        }
    }

    /* renamed from: rx.internal.util.UtilityFunctions$Identity */
    public enum Identity implements AbstractC9847l1<Object, Object> {
        INSTANCE;

        @Override // com.p118pd.sdk.AbstractC9847l1
        public Object call(Object obj) {
            return obj;
        }
    }

    public UtilityFunctions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> AbstractC9847l1<? super T, Boolean> OooO00o() {
        return AlwaysFalse.INSTANCE;
    }

    public static <T> AbstractC9847l1<? super T, Boolean> OooO0O0() {
        return AlwaysTrue.INSTANCE;
    }

    public static <T> AbstractC9847l1<T, T> OooO0OO() {
        return Identity.INSTANCE;
    }
}
