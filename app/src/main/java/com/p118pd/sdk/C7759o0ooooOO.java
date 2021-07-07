package com.p118pd.sdk;

import java.util.Random;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.random.KotlinRandom;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0ooooOO  reason: case insensitive filesystem */
public final class C7759o0ooooOO {
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random OooO00o(@NotNull Random oo) {
        Random OooO00o;
        o0O0OO00.OooO0o(oo, "receiver$0");
        o0OOOO0O o0oooo0o = (o0OOOO0O) (!(oo instanceof o0OOOO0O) ? null : oo);
        return (o0oooo0o == null || (OooO00o = o0oooo0o.m18926OooO00o()) == null) ? new KotlinRandom(oo) : OooO00o;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Random OooO00o(@NotNull Random random) {
        Random impl;
        o0O0OO00.OooO0o(random, "receiver$0");
        KotlinRandom kotlinRandom = (KotlinRandom) (!(random instanceof KotlinRandom) ? null : random);
        return (kotlinRandom == null || (impl = kotlinRandom.getImpl()) == null) ? new C7725o0ooOOo0(random) : impl;
    }

    @InlineOnly
    public static final Random OooO00o() {
        return O000O000.OooO00o.OooO00o();
    }

    public static final int OooO00o(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final double OooO00o(int i, int i2) {
        double d = (double) ((((long) i) << 27) + ((long) i2));
        double d2 = (double) 9007199254740992L;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }
}
