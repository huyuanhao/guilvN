package com.p118pd.sdk;

import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o00OOOoO  reason: case insensitive filesystem */
public interface AbstractC7100o00OOOoO {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
