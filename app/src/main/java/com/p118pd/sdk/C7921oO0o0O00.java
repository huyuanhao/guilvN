package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/* renamed from: com.pd.sdk.oO0o0O00  reason: case insensitive filesystem */
public final class C7921oO0o0O00 {
    @NotNull
    public static String OooO00o(@NotNull Iterable<? extends CharSequence> iterable, @NotNull String str) {
        int length = str.length();
        Iterator<? extends CharSequence> it = iterable.iterator();
        int i = 0;
        if (it.hasNext()) {
            i = 0 + ((CharSequence) it.next()).length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (it2.hasNext()) {
            sb.append((CharSequence) it2.next());
            while (it2.hasNext()) {
                sb.append(str);
                sb.append((CharSequence) it2.next());
            }
        }
        return sb.toString();
    }

    @NotNull
    public static <T extends CharSequence> String OooO00o(@NotNull T[] tArr, @NotNull String str) {
        int length = str.length();
        int i = 0;
        for (T t : tArr) {
            i += t.length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        boolean z = true;
        for (T t2 : tArr) {
            if (!z) {
                sb.append(str);
            } else {
                z = false;
            }
            sb.append((CharSequence) t2);
        }
        return sb.toString();
    }

    @NotNull
    public static String OooO00o(@NotNull InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }

    public static int OooO00o(@Nullable String str, @Nullable String str2) {
        boolean z = str == null;
        boolean z2 = str2 == null;
        if (z && z2) {
            return 0;
        }
        if (z) {
            return -1;
        }
        if (z2) {
            return 1;
        }
        return str.compareTo(str2);
    }

    @NotNull
    public static String OooO00o(@NotNull String str) {
        return str.replace(" ", "%20");
    }
}
