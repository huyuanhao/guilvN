package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0017\u0010\u0005\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038VX\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo43195d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", ViewProps.START, "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive", "()Lkotlin/UInt;", "getStart", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", DispatchConstants.OTHER, "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oO00O0O0  reason: invalid package */
public final class UIntRange extends UIntProgression implements ClosedRange<UInt> {
    public static final OooO00o OooO00o = new OooO00o(null);
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final UIntRange f20849OooO00o = new UIntRange(-1, 0, null);

    /* renamed from: com.pd.sdk.oO00O0O0$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final UIntRange OooO00o() {
            return UIntRange.f20849OooO00o;
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public UIntRange(int i, int i2) {
        super(i, i2, 1, null);
    }

    @Override // kotlin.ranges.UIntProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UIntRange) {
            if (!isEmpty() || !((UIntRange) obj).isEmpty()) {
                UIntRange oo00o0o0 = (UIntRange) obj;
                if (!(OooO00o() == oo00o0o0.OooO00o() && OooO0O0() == oo00o0o0.OooO0O0())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.UIntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (OooO00o() * 31) + OooO0O0();
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return C9175oooOOooo.OooO00o(OooO00o(), OooO0O0()) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    @NotNull
    public String toString() {
        return UInt.OooO00o(OooO00o()) + ".." + UInt.OooO00o(OooO0O0());
    }

    public /* synthetic */ UIntRange(int i, int i2, O0o0o o0o0o) {
        this(i, i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean OooO00o(UInt ooooooo0) {
        return OooO00o(ooooooo0.OooO00o());
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO0O0 */
    public UInt OooO00o() {
        return UInt.OooO00o(OooO00o());
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    @NotNull
    /* renamed from: OooO00o */
    public UInt OooO0O0() {
        return UInt.OooO00o(OooO0O0());
    }

    public boolean OooO00o(int i) {
        return C9175oooOOooo.OooO00o(OooO00o(), i) <= 0 && C9175oooOOooo.OooO00o(i, OooO0O0()) <= 0;
    }
}
