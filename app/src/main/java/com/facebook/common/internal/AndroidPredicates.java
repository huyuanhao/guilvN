package com.facebook.common.internal;

public class AndroidPredicates {
    public static <T> Predicate<T> False() {
        return new Predicate<T>() {
            /* class com.facebook.common.internal.AndroidPredicates.C04642 */

            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
                return false;
            }
        };
    }

    public static <T> Predicate<T> True() {
        return new Predicate<T>() {
            /* class com.facebook.common.internal.AndroidPredicates.C04631 */

            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
                return true;
            }
        };
    }
}
