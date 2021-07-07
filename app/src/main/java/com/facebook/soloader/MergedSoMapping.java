package com.facebook.soloader;

import javax.annotation.Nullable;

public class MergedSoMapping {
    public static void invokeJniOnload(String str) {
        throw new IllegalArgumentException("Unknown library: " + str);
    }

    @Nullable
    public static String mapLibName(String str) {
        return null;
    }
}
