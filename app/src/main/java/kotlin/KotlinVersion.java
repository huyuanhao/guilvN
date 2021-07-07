package kotlin;

import anet.channel.strategy.dispatch.DispatchConstants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo43195d2 = {"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", DispatchConstants.OTHER, "equals", "", "", "hashCode", "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oooooO  reason: invalid package */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final OooO00o OooO00o = new OooO00o(null);
    @JvmField
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final KotlinVersion f22702OooO00o = new KotlinVersion(1, 3, 11);
    public static final int o0OOO0o = 255;
    public final int o00oO0O;
    public final int o0ooOO0;
    public final int o0ooOOo;
    public final int o0ooOoO;

    /* renamed from: com.pd.sdk.oooooO$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.o0ooOO0 = i;
        this.o0ooOOo = i2;
        this.o0ooOoO = i3;
        this.o00oO0O = OooO00o(i, i2, i3);
    }

    public final int OooO00o() {
        return this.o0ooOO0;
    }

    public final int OooO0OO() {
        return this.o0ooOOo;
    }

    public final int OooO0Oo() {
        return this.o0ooOoO;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinVersion)) {
            obj = null;
        }
        KotlinVersion oooooo = (KotlinVersion) obj;
        if (oooooo == null || this.o00oO0O != oooooo.o00oO0O) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.o00oO0O;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.o0ooOO0);
        sb.append('.');
        sb.append(this.o0ooOOo);
        sb.append('.');
        sb.append(this.o0ooOoO);
        return sb.toString();
    }

    private final int OooO00o(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }

    /* renamed from: OooO00o */
    public int compareTo(@NotNull KotlinVersion oooooo) {
        o0O0OO00.OooO0o(oooooo, DispatchConstants.OTHER);
        return this.o00oO0O - oooooo.o00oO0O;
    }

    public final boolean OooO00o(int i, int i2) {
        int i3 = this.o0ooOO0;
        return i3 > i || (i3 == i && this.o0ooOOo >= i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m21209OooO00o(int i, int i2, int i3) {
        int i4;
        int i5 = this.o0ooOO0;
        return i5 > i || (i5 == i && ((i4 = this.o0ooOOo) > i2 || (i4 == i2 && this.o0ooOoO >= i3)));
    }
}
