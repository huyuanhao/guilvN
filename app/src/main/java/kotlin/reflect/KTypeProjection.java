package kotlin.reflect;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.message.proguard.C3848l;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo43195d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", DispatchConstants.OTHER, "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.Oo0o0OO  reason: invalid package */
public final class KTypeProjection {
    public static final OooO00o OooO00o = new OooO00o(null);
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final KTypeProjection f16999OooO00o = new KTypeProjection(null, null);
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final KType f17000OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final KVariance f17001OooO00o;

    /* renamed from: com.pd.sdk.Oo0o0OO$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final KTypeProjection OooO00o() {
            return KTypeProjection.f16999OooO00o;
        }

        @NotNull
        public final KTypeProjection OooO0O0(@NotNull KType oo0o0o00) {
            o0O0OO00.OooO0o(oo0o0o00, "type");
            return new KTypeProjection(KVariance.OUT, oo0o0o00);
        }

        @NotNull
        public final KTypeProjection OooO0OO(@NotNull KType oo0o0o00) {
            o0O0OO00.OooO0o(oo0o0o00, "type");
            return new KTypeProjection(KVariance.INVARIANT, oo0o0o00);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }

        @NotNull
        public final KTypeProjection OooO00o(@NotNull KType oo0o0o00) {
            o0O0OO00.OooO0o(oo0o0o00, "type");
            return new KTypeProjection(KVariance.IN, oo0o0o00);
        }
    }

    public KTypeProjection(@Nullable KVariance kVariance, @Nullable KType oo0o0o00) {
        this.f17001OooO00o = kVariance;
        this.f17000OooO00o = oo0o0o00;
    }

    @NotNull
    public static /* synthetic */ KTypeProjection OooO00o(KTypeProjection oo0o0OO, KVariance kVariance, KType oo0o0o00, int i, Object obj) {
        if ((i & 1) != 0) {
            kVariance = oo0o0OO.f17001OooO00o;
        }
        if ((i & 2) != 0) {
            oo0o0o00 = oo0o0OO.f17000OooO00o;
        }
        return oo0o0OO.OooO00o(kVariance, oo0o0o00);
    }

    @NotNull
    public final KTypeProjection OooO00o(@Nullable KVariance kVariance, @Nullable KType oo0o0o00) {
        return new KTypeProjection(kVariance, oo0o0o00);
    }

    @Nullable
    public final KType OooO00o() {
        return this.f17000OooO00o;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final KVariance m16628OooO00o() {
        return this.f17001OooO00o;
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final KVariance m16629OooO0O0() {
        return this.f17001OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection oo0o0OO = (KTypeProjection) obj;
        return o0O0OO00.OooO00o(this.f17001OooO00o, oo0o0OO.f17001OooO00o) && o0O0OO00.OooO00o(this.f17000OooO00o, oo0o0OO.f17000OooO00o);
    }

    public int hashCode() {
        KVariance kVariance = this.f17001OooO00o;
        int i = 0;
        int hashCode = (kVariance != null ? kVariance.hashCode() : 0) * 31;
        KType oo0o0o00 = this.f17000OooO00o;
        if (oo0o0o00 != null) {
            i = oo0o0o00.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "KTypeProjection(variance=" + this.f17001OooO00o + ", type=" + this.f17000OooO00o + C3848l.f10402t;
    }

    @Nullable
    public final KType OooO0O0() {
        return this.f17000OooO00o;
    }
}
