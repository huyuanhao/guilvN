package kotlin.ranges;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo43195d2 = {"Lkotlin/ranges/CharProgression;", "", "", ViewProps.START, "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", DispatchConstants.OTHER, "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.Oo0000  reason: invalid package */
public class CharProgression implements Iterable<Character>, O0OO0o {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final char f16996OooO00o;
    public final char OooO0O0;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.Oo0000$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @NotNull
        public final CharProgression OooO00o(char c, char c2, int i) {
            return new CharProgression(c, c2, i);
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public CharProgression(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f16996OooO00o = c;
            this.OooO0O0 = (char) O000O00O.OooO0O0((int) c, (int) c2, i);
            this.o00oO0O = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final char OooO00o() {
        return this.f16996OooO00o;
    }

    public final char OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CharProgression) {
            if (!isEmpty() || !((CharProgression) obj).isEmpty()) {
                CharProgression oo0000 = (CharProgression) obj;
                if (!(this.f16996OooO00o == oo0000.f16996OooO00o && this.OooO0O0 == oo0000.OooO0O0 && this.o00oO0O == oo0000.o00oO0O)) {
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
        return (((this.f16996OooO00o * 31) + this.OooO0O0) * 31) + this.o00oO0O;
    }

    public boolean isEmpty() {
        if (this.o00oO0O > 0) {
            if (this.f16996OooO00o > this.OooO0O0) {
                return true;
            }
        } else if (this.f16996OooO00o < this.OooO0O0) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.o00oO0O > 0) {
            sb = new StringBuilder();
            sb.append(this.f16996OooO00o);
            sb.append("..");
            sb.append(this.OooO0O0);
            sb.append(" step ");
            i = this.o00oO0O;
        } else {
            sb = new StringBuilder();
            sb.append(this.f16996OooO00o);
            sb.append(" downTo ");
            sb.append(this.OooO0O0);
            sb.append(" step ");
            i = -this.o00oO0O;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final int m16624OooO00o() {
        return this.o00oO0O;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9197oooOoo0o iterator() {
        return new OO00000(this.f16996OooO00o, this.OooO0O0, this.o00oO0O);
    }
}
