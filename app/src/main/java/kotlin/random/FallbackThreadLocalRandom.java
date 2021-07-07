package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, mo43195d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "implStorage", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.O0oOOOO  reason: invalid package */
public final class FallbackThreadLocalRandom extends o0OOOO0O {
    public final OooO00o OooO00o = new OooO00o();

    /* renamed from: com.pd.sdk.O0oOOOO$OooO00o */
    public static final class OooO00o extends ThreadLocal<Random> {
        @NotNull
        /* renamed from: OooO00o */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // com.p118pd.sdk.o0OOOO0O, com.p118pd.sdk.o0OOOO0O, com.p118pd.sdk.o0OOOO0O, com.p118pd.sdk.o0OOOO0O, com.p118pd.sdk.o0OOOO0O, com.p118pd.sdk.o0OOOO0O, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random, kotlin.random.Random
    @NotNull
    public Random OooO00o() {
        Object obj = this.OooO00o.get();
        o0O0OO00.OooO00o(obj, "implStorage.get()");
        return (Random) obj;
    }
}
