package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, mo43195d2 = {"Lkotlin/ranges/LongProgression;", "", "", ViewProps.START, "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", DispatchConstants.OTHER, "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO000OO  reason: invalid package */
public class LongProgression implements Iterable<Long>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f20819OooO00o;
    public final long OooO0O0;
    public final long OooO0OO;

    /* renamed from: com.pd.sdk.oO000OO$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final LongProgression OooO00o(long j, long j2, long j3) {
            return new LongProgression(j, j2, j3);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public LongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f20819OooO00o = j;
            this.OooO0O0 = O000O00O.OooO0O0(j, j2, j3);
            this.OooO0OO = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long OooO00o() {
        return this.f20819OooO00o;
    }

    public final long OooO0O0() {
        return this.OooO0O0;
    }

    public final long OooO0OO() {
        return this.OooO0OO;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) obj).isEmpty()) {
                LongProgression oo000oo = (LongProgression) obj;
                if (!(this.f20819OooO00o == oo000oo.f20819OooO00o && this.OooO0O0 == oo000oo.OooO0O0 && this.OooO0OO == oo000oo.OooO0OO)) {
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
        long j = (long) 31;
        long j2 = this.f20819OooO00o;
        long j3 = this.OooO0O0;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.OooO0OO;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.OooO0OO > 0 ? 1 : (this.OooO0OO == 0 ? 0 : -1));
        long j = this.f20819OooO00o;
        long j2 = this.OooO0O0;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.OooO0OO > 0) {
            sb.append(this.f20819OooO00o);
            sb.append("..");
            sb.append(this.OooO0O0);
            sb.append(" step ");
            j = this.OooO0OO;
        } else {
            sb = new StringBuilder();
            sb.append(this.f20819OooO00o);
            sb.append(" downTo ");
            sb.append(this.OooO0O0);
            sb.append(" step ");
            j = -this.OooO0OO;
        }
        sb.append(j);
        return sb.toString();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9223oooo0OO iterator() {
        return new oO000OO0(this.f20819OooO00o, this.OooO0O0, this.OooO0OO);
    }
}
