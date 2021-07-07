package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, mo43195d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", ViewProps.START, "endInclusive", "(JJ)V", "getEndInclusive", "()Ljava/lang/Long;", "getStart", "contains", "", "value", "equals", DispatchConstants.OTHER, "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oo000ooo  reason: invalid package */
public final class LongRange extends LongProgression implements ClosedRange<Long> {
    public static final OooO00o OooO00o = new OooO00o(null);
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final LongRange f21651OooO00o = new LongRange(1, 0);

    /* renamed from: com.pd.sdk.oo000ooo$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final LongRange OooO00o() {
            return LongRange.f21651OooO00o;
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public LongRange(long j, long j2) {
        super(j, j2, 1);
    }

    @Override // kotlin.ranges.LongProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LongRange) {
            if (!isEmpty() || !((LongRange) obj).isEmpty()) {
                LongRange oo000ooo = (LongRange) obj;
                if (!(OooO00o() == oo000ooo.OooO00o() && OooO0O0() == oo000ooo.OooO0O0())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.LongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (OooO00o() ^ (OooO00o() >>> 32))) + (OooO0O0() ^ (OooO0O0() >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return OooO00o() > OooO0O0();
    }

    @Override // kotlin.ranges.LongProgression
    @NotNull
    public String toString() {
        return OooO00o() + ".." + OooO0O0();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean OooO00o(Long l) {
        return OooO00o(l.longValue());
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO0O0 */
    public Long OooO00o() {
        return Long.valueOf(OooO00o());
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO00o */
    public Long OooO0O0() {
        return Long.valueOf(OooO0O0());
    }

    public boolean OooO00o(long j) {
        return OooO00o() <= j && j <= OooO0O0();
    }
}
