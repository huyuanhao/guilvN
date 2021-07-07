package com.p118pd.sdk;

import com.facebook.react.uimanager.ViewProps;
import java.lang.Comparable;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.OO000O */
public class OO000O<T extends Comparable<? super T>> implements ClosedRange<T> {
    @NotNull
    public final T OooO00o;
    @NotNull
    public final T OooO0O0;

    public OO000O(@NotNull T t, @NotNull T t2) {
        o0O0OO00.OooO0o(t, ViewProps.START);
        o0O0OO00.OooO0o(t2, "endInclusive");
        this.OooO00o = t;
        this.OooO0O0 = t2;
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean OooO00o(@NotNull T t) {
        o0O0OO00.OooO0o(t, "value");
        return ClosedRange.OooO00o.OooO00o(this, t);
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public T OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof OO000O) {
            if (!isEmpty() || !((OO000O) obj).isEmpty()) {
                OO000O oo000o = (OO000O) obj;
                if (!o0O0OO00.OooO00o(OooO00o(), oo000o.OooO00o()) || !o0O0OO00.OooO00o(OooO0O0(), oo000o.OooO0O0())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (OooO00o().hashCode() * 31) + OooO0O0().hashCode();
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return ClosedRange.OooO00o.OooO00o(this);
    }

    @NotNull
    public String toString() {
        return OooO00o() + ".." + OooO0O0();
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public T OooO00o() {
        return this.OooO00o;
    }
}
