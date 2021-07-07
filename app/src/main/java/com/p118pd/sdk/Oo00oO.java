package com.p118pd.sdk;

import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.Oo00oO */
public final class Oo00oO extends AbstractC9247ooooO0OO {
    public final long OooO00o;
    public final long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16997OooO0O0;
    public long OooO0OO;

    public Oo00oO(long j, long j2, long j3) {
        this.OooO00o = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int OooO00o2 = C9175oooOOooo.OooO00o(j, j2);
        if (i <= 0 ? OooO00o2 < 0 : OooO00o2 > 0) {
            z = false;
        }
        this.f16997OooO0O0 = z;
        this.OooO0O0 = ULong.m20943OooO00o(j3);
        this.OooO0OO = !this.f16997OooO0O0 ? this.OooO00o : j;
    }

    @Override // com.p118pd.sdk.AbstractC9247ooooO0OO, com.p118pd.sdk.AbstractC9247ooooO0OO
    public long OooO00o() {
        long j = this.OooO0OO;
        if (j != this.OooO00o) {
            this.OooO0OO = ULong.m20943OooO00o(this.OooO0O0 + j);
        } else if (this.f16997OooO0O0) {
            this.f16997OooO0O0 = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public boolean hasNext() {
        return this.f16997OooO0O0;
    }

    public /* synthetic */ Oo00oO(long j, long j2, long j3, O0o0o o0o0o) {
        this(j, j2, j3);
    }
}
