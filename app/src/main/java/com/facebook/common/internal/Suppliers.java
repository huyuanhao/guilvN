package com.facebook.common.internal;

public class Suppliers {
    public static final Supplier<Boolean> BOOLEAN_FALSE = new Supplier<Boolean>() {
        /* class com.facebook.common.internal.Suppliers.C04693 */

        @Override // com.facebook.common.internal.Supplier
        public Boolean get() {
            return false;
        }
    };
    public static final Supplier<Boolean> BOOLEAN_TRUE = new Supplier<Boolean>() {
        /* class com.facebook.common.internal.Suppliers.C04682 */

        @Override // com.facebook.common.internal.Supplier
        public Boolean get() {
            return true;
        }
    };

    /* renamed from: of */
    public static <T> Supplier<T> m852of(final T t) {
        return new Supplier<T>() {
            /* class com.facebook.common.internal.Suppliers.C04671 */

            @Override // com.facebook.common.internal.Supplier
            public T get() {
                return (T) t;
            }
        };
    }
}
