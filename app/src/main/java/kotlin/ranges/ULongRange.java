package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0017\u0010\u0005\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo43195d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", ViewProps.START, "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive", "()Lkotlin/ULong;", "getStart", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", DispatchConstants.OTHER, "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.OO00OO0  reason: invalid package */
public final class ULongRange extends ULongProgression implements ClosedRange<ULong> {
    public static final OooO00o OooO00o = new OooO00o(null);
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ULongRange f16963OooO00o = new ULongRange(-1, 0, null);

    /* renamed from: com.pd.sdk.OO00OO0$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final ULongRange OooO00o() {
            return ULongRange.f16963OooO00o;
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public ULongRange(long j, long j2) {
        super(j, j2, 1, null);
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongRange) {
            if (!isEmpty() || !((ULongRange) obj).isEmpty()) {
                ULongRange oo00oo0 = (ULongRange) obj;
                if (!(OooO00o() == oo00oo0.OooO00o() && OooO0O0() == oo00oo0.OooO0O0())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((int) ULong.m20943OooO00o(OooO0O0() ^ ULong.m20943OooO00o(OooO0O0() >>> 32))) + (((int) ULong.m20943OooO00o(OooO00o() ^ ULong.m20943OooO00o(OooO00o() >>> 32))) * 31);
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return C9175oooOOooo.OooO00o(OooO00o(), OooO0O0()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    @NotNull
    public String toString() {
        return ULong.OooO00o(OooO00o()) + ".." + ULong.OooO00o(OooO0O0());
    }

    public /* synthetic */ ULongRange(long j, long j2, O0o0o o0o0o) {
        this(j, j2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean OooO00o(ULong oooooo00) {
        return OooO00o(oooooo00.OooO00o());
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO0O0 */
    public ULong OooO00o() {
        return ULong.OooO00o(OooO00o());
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO00o */
    public ULong OooO0O0() {
        return ULong.OooO00o(OooO0O0());
    }

    public boolean OooO00o(long j) {
        return C9175oooOOooo.OooO00o(OooO00o(), j) <= 0 && C9175oooOOooo.OooO00o(j, OooO0O0()) <= 0;
    }
}
