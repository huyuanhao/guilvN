package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0016\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo43195d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", ViewProps.START, "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst", "()I", "I", "last", "getLast", "getStep", "equals", "", DispatchConstants.OTHER, "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/UIntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oO00O00O  reason: invalid package */
public class UIntProgression implements Iterable<UInt>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);
    public final int o00oO0O;
    public final int o0ooOO0;
    public final int o0ooOOo;

    /* renamed from: com.pd.sdk.oO00O00O$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final UIntProgression OooO00o(int i, int i2, int i3) {
            return new UIntProgression(i, i2, i3, null);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public /* synthetic */ UIntProgression(int i, int i2, int i3, O0o0o o0o0o) {
        this(i, i2, i3);
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
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression oo00o00o = (UIntProgression) obj;
                if (!(this.o00oO0O == oo00o00o.o00oO0O && this.o0ooOO0 == oo00o00o.o0ooOO0 && this.o0ooOOo == oo00o00o.o0ooOOo)) {
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
            if (C9175oooOOooo.OooO00o(this.o00oO0O, this.o0ooOO0) > 0) {
                return true;
            }
        } else if (C9175oooOOooo.OooO00o(this.o00oO0O, this.o0ooOO0) < 0) {
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
            sb.append(UInt.OooO00o(this.o00oO0O));
            sb.append("..");
            sb.append(UInt.OooO00o(this.o0ooOO0));
            sb.append(" step ");
            i = this.o0ooOOo;
        } else {
            sb = new StringBuilder();
            sb.append(UInt.OooO00o(this.o00oO0O));
            sb.append(" downTo ");
            sb.append(UInt.OooO00o(this.o0ooOO0));
            sb.append(" step ");
            i = -this.o0ooOOo;
        }
        sb.append(i);
        return sb.toString();
    }

    public UIntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.o00oO0O = i;
            this.o0ooOO0 = O000O0O.OooO0O0(i, i2, i3);
            this.o0ooOOo = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9245ooooO0O iterator() {
        return new OO00O0O(this.o00oO0O, this.o0ooOO0, this.o0ooOOo, null);
    }
}
