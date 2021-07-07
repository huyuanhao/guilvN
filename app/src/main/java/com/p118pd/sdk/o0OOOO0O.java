package com.p118pd.sdk;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0OOOO0O */
public abstract class o0OOOO0O extends Random {
    @Override // kotlin.random.Random, kotlin.random.Random
    public int OooO00o(int i) {
        return OO0.OooO00o(m18926OooO00o().nextInt(), i);
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Random m18926OooO00o();

    @Override // kotlin.random.Random
    public int OooO0O0(int i) {
        return m18926OooO00o().nextInt(i);
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18924OooO00o() {
        return m18926OooO00o().nextInt();
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m18925OooO00o() {
        return m18926OooO00o().nextLong();
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18927OooO00o() {
        return m18926OooO00o().nextBoolean();
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    public double OooO00o() {
        return m18926OooO00o().nextDouble();
    }

    @Override // kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m18923OooO00o() {
        return m18926OooO00o().nextFloat();
    }

    @Override // kotlin.random.Random
    @NotNull
    public byte[] OooO00o(@NotNull byte[] bArr) {
        o0O0OO00.OooO0o(bArr, "array");
        m18926OooO00o().nextBytes(bArr);
        return bArr;
    }
}
