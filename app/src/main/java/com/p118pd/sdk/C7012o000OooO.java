package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.o000OooO  reason: case insensitive filesystem */
public final class C7012o000OooO {
    public static boolean OooO00o(@NonNull String[] strArr, @NonNull String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        } else if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        } else if (strArr.length != 2) {
            return false;
        } else {
            if (!"*".equals(strArr2[0]) && !strArr2[0].equals(strArr[0])) {
                return false;
            }
            if ("*".equals(strArr2[1]) || strArr2[1].equals(strArr[1])) {
                return true;
            }
            return false;
        }
    }

    public static boolean OooO00o(@Nullable String str, @NonNull String str2) {
        if (str == null) {
            return false;
        }
        return OooO00o(str.split(C8932ooOOO0o.OooO0OO), str2.split(C8932ooOOO0o.OooO0OO));
    }

    @Nullable
    public static String OooO00o(@Nullable String str, @NonNull String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(C8932ooOOO0o.OooO0OO);
        for (String str2 : strArr) {
            if (OooO00o(split, str2.split(C8932ooOOO0o.OooO0OO))) {
                return str2;
            }
        }
        return null;
    }

    @Nullable
    public static String OooO00o(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split(C8932ooOOO0o.OooO0OO);
        for (String str2 : strArr) {
            if (OooO00o(str2.split(C8932ooOOO0o.OooO0OO), split)) {
                return str2;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String[] m18271OooO00o(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(C8932ooOOO0o.OooO0OO);
        for (String str2 : strArr) {
            if (OooO00o(str2.split(C8932ooOOO0o.OooO0OO), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
