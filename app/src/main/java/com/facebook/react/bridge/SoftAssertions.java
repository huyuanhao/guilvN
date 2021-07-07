package com.facebook.react.bridge;

import javax.annotation.Nullable;

public class SoftAssertions {
    public static void assertCondition(boolean z, String str) {
        if (!z) {
            throw new AssertionException(str);
        }
    }

    public static <T> T assertNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionException("Expected object to not be null!");
    }

    public static void assertUnreachable(String str) {
        throw new AssertionException(str);
    }
}
