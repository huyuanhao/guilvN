package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo43195d2 = {"Lkotlin/ranges/IntProgression;", "", "", ViewProps.START, "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", DispatchConstants.OTHER, "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO000O0  reason: invalid package */
public class IntProgression implements Iterable<Integer>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);
    public final int o00oO0O;
    public final int o0ooOO0;
    public final int o0ooOOo;

    /* renamed from: com.pd.sdk.OO000O0$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final IntProgression OooO00o(int i, int i2, int i3) {
            return new IntProgression(i, i2, i3);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.o00oO0O = i;
            this.o0ooOO0 = O000O00O.OooO0O0(i, i2, i3);
            this.o0ooOOo = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int OooO00o() {
        return this.o00oO0O;
    }

    public final int OooO0O0() {
        return this.o0ooOO0;
    }

    public final int OooO0OO() {
        return this.o0ooOOo;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) obj).isEmpty()) {
                IntProgression oo000o0 = (IntProgression) obj;
                if (!(this.o00oO0O == oo000o0.o00oO0O && this.o0ooOO0 == oo000o0.o0ooOO0 && this.o0ooOOo == oo000o0.o0ooOOo)) {
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
        return (((this.o00oO0O * 31) + this.o0ooOO0) * 31) + this.o0ooOOo;
    }

    public boolean isEmpty() {
        if (this.o0ooOOo > 0) {
            if (this.o00oO0O > this.o0ooOO0) {
                return true;
            }
        } else if (this.o00oO0O < this.o0ooOO0) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.o0ooOOo > 0) {
            sb = new StringBuilder();
            sb.append(this.o00oO0O);
            sb.append("..");
            sb.append(this.o0ooOO0);
            sb.append(" step ");
            i = this.o0ooOOo;
        } else {
            sb = new StringBuilder();
            sb.append(this.o00oO0O);
            sb.append(" downTo ");
            sb.append(this.o0ooOO0);
            sb.append(" step ");
            i = -this.o0ooOOo;
        }
        sb.append(i);
        return sb.toString();
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9218oooo0O iterator() {
        return new oO000O00(this.o00oO0O, this.o0ooOO0, this.o0ooOOo);
    }
}
