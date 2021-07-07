package com.p118pd.sdk;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000oo  reason: case insensitive filesystem */
public final class C7028o000oo {
    public final float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PointF f19291OooO00o;
    public final float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final PointF f19292OooO0O0;

    public C7028o000oo(@NonNull PointF pointF, float f, @NonNull PointF pointF2, float f2) {
        this.f19291OooO00o = (PointF) C7086o00OO0OO.OooO00o(pointF, "start == null");
        this.OooO00o = f;
        this.f19292OooO0O0 = (PointF) C7086o00OO0OO.OooO00o(pointF2, "end == null");
        this.OooO0O0 = f2;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public PointF m18290OooO00o() {
        return this.f19292OooO0O0;
    }

    @NonNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public PointF m18291OooO0O0() {
        return this.f19291OooO00o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7028o000oo)) {
            return false;
        }
        C7028o000oo o000oo = (C7028o000oo) obj;
        if (Float.compare(this.OooO00o, o000oo.OooO00o) != 0 || Float.compare(this.OooO0O0, o000oo.OooO0O0) != 0 || !this.f19291OooO00o.equals(o000oo.f19291OooO00o) || !this.f19292OooO0O0.equals(o000oo.f19292OooO0O0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f19291OooO00o.hashCode() * 31;
        float f = this.OooO00o;
        int i = 0;
        int floatToIntBits = (((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f19292OooO0O0.hashCode()) * 31;
        float f2 = this.OooO0O0;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        return "PathSegment{start=" + this.f19291OooO00o + ", startFraction=" + this.OooO00o + ", end=" + this.f19292OooO0O0 + ", endFraction=" + this.OooO0O0 + '}';
    }

    public float OooO00o() {
        return this.OooO0O0;
    }

    public float OooO0O0() {
        return this.OooO00o;
    }
}
