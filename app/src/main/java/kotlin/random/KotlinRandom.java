package kotlin.random;

import com.p118pd.sdk.o0O0OO00;
import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, mo43195d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "impl", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)V", "getImpl", "()Lkotlin/random/Random;", "next", "", "bits", "nextBoolean", "", "nextBytes", "", "bytes", "", "nextDouble", "", "nextFloat", "", "nextInt", "bound", "nextLong", "", "setSeed", "seed", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class KotlinRandom extends Random {
    @NotNull
    public final Random impl;

    public KotlinRandom(@NotNull Random oo) {
        o0O0OO00.OooO0o(oo, "impl");
        this.impl = oo;
    }

    @NotNull
    public final Random getImpl() {
        return this.impl;
    }

    public int next(int i) {
        return this.impl.OooO00o(i);
    }

    public boolean nextBoolean() {
        return this.impl.m16529OooO00o();
    }

    public void nextBytes(@NotNull byte[] bArr) {
        o0O0OO00.OooO0o(bArr, "bytes");
        this.impl.OooO00o(bArr);
    }

    public double nextDouble() {
        return this.impl.OooO00o();
    }

    public float nextFloat() {
        return this.impl.m16526OooO00o();
    }

    public int nextInt() {
        return this.impl.m16527OooO00o();
    }

    public long nextLong() {
        return this.impl.m16528OooO00o();
    }

    public void setSeed(long j) {
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public int nextInt(int i) {
        return this.impl.OooO0O0(i);
    }
}
