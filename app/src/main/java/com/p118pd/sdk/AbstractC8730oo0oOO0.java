package com.p118pd.sdk;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.oo0oOO0  reason: case insensitive filesystem */
public interface AbstractC8730oo0oOO0 {
    @IntRange(from = -1)
    int OooO00o(Locale locale);

    Object OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    String m20345OooO00o();

    Locale OooO00o(int i);

    @Nullable
    Locale OooO00o(String[] strArr);

    void OooO00o(@NonNull Locale... localeArr);

    boolean equals(Object obj);

    int hashCode();

    boolean isEmpty();

    @IntRange(from = 0)
    int size();

    String toString();
}
