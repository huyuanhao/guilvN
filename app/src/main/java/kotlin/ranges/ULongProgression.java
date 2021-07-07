package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo43195d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", ViewProps.START, "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst", "()J", "J", "last", "getLast", "getStep", "equals", "", DispatchConstants.OTHER, "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/ULongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oO00O0OO  reason: invalid package */
public class ULongProgression implements Iterable<ULong>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f20850OooO00o;
    public final long OooO0O0;
    public final long OooO0OO;

    /* renamed from: com.pd.sdk.oO00O0OO$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final ULongProgression OooO00o(long j, long j2, long j3) {
            return new ULongProgression(j, j2, j3, null);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public /* synthetic */ ULongProgression(long j, long j2, long j3, O0o0o o0o0o) {
        this(j, j2, j3);
    }

    public final long OooO00o() {
        return this.f20850OooO00o;
    }

    public final long OooO0O0() {
        return this.OooO0O0;
    }

    public final long OooO0OO() {
        return this.OooO0OO;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression oo00o0oo = (ULongProgression) obj;
                if (!(this.f20850OooO00o == oo00o0oo.f20850OooO00o && this.OooO0O0 == oo00o0oo.OooO0O0 && this.OooO0OO == oo00o0oo.OooO0OO)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f20850OooO00o;
        long j2 = this.OooO0O0;
        long j3 = this.OooO0OO;
        return ((int) (j3 ^ (j3 >>> 32))) + (((((int) ULong.m20943OooO00o(j ^ ULong.m20943OooO00o(j >>> 32))) * 31) + ((int) ULong.m20943OooO00o(j2 ^ ULong.m20943OooO00o(j2 >>> 32)))) * 31);
    }

    public boolean isEmpty() {
        int i = (this.OooO0OO > 0 ? 1 : (this.OooO0OO == 0 ? 0 : -1));
        int OooO00o2 = C9175oooOOooo.OooO00o(this.f20850OooO00o, this.OooO0O0);
        if (i > 0) {
            if (OooO00o2 > 0) {
                return true;
            }
        } else if (OooO00o2 < 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.OooO0OO > 0) {
            sb.append(ULong.OooO00o(this.f20850OooO00o));
            sb.append("..");
            sb.append(ULong.OooO00o(this.OooO0O0));
            sb.append(" step ");
            j = this.OooO0OO;
        } else {
            sb = new StringBuilder();
            sb.append(ULong.OooO00o(this.f20850OooO00o));
            sb.append(" downTo ");
            sb.append(ULong.OooO00o(this.OooO0O0));
            sb.append(" step ");
            j = -this.OooO0OO;
        }
        sb.append(j);
        return sb.toString();
    }

    public ULongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f20850OooO00o = j;
            this.OooO0O0 = O000O0O.OooO0O0(j, j2, j3);
            this.OooO0OO = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9247ooooO0OO iterator() {
        return new Oo00oO(this.f20850OooO00o, this.OooO0O0, this.OooO0OO, null);
    }
}
