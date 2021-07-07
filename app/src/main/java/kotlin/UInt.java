package kotlin;

import anet.channel.strategy.dispatch.DispatchConstants;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001bB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u001b\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0013\u0010#\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b$\u0010\u0005J\u0013\u0010%\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005J\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b(\u0010\u000fJ\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b)\u0010\u000bJ\u001b\u0010'\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b*\u0010\u001dJ\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b+\u0010\u0016J\u001b\u0010,\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b-\u0010\u000bJ\u001b\u0010.\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u0010.\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b0\u0010\u000bJ\u001b\u0010.\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u001dJ\u001b\u0010.\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b2\u0010\u0016J\u001b\u00103\u001a\u0002042\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\b8\u0010\u000fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b9\u0010\u000bJ\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b:\u0010\u001dJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b;\u0010\u0016J\u001b\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003H\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003H\fø\u0001\u0000¢\u0006\u0004\b@\u0010\u000bJ\u001b\u0010A\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u000fJ\u001b\u0010A\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u000bJ\u001b\u0010A\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bD\u0010\u001dJ\u001b\u0010A\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bE\u0010\u0016J\u0010\u0010F\u001a\u00020GH\b¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0003H\b¢\u0006\u0004\bK\u0010\u0005J\u0010\u0010L\u001a\u00020MH\b¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020QH\b¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020\rH\bø\u0001\u0000¢\u0006\u0004\bY\u0010IJ\u0013\u0010Z\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b[\u0010\u0005J\u0013\u0010\\\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b]\u0010OJ\u0013\u0010^\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b_\u0010SJ\u001b\u0010`\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\ba\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, mo43195d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "data$annotations", "()V", "and", DispatchConstants.OTHER, "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-impl", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-impl", "shr", "shr-impl", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oooOOOo0  reason: invalid package */
public final class UInt implements Comparable<UInt> {
    public static final OooO00o OooO00o = new OooO00o(null);
    public static final int o0OOO0o = 32;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = -1;
    public static final int o0ooOoO = 4;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.oooOOOo0$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    @PublishedApi
    public /* synthetic */ UInt(int i) {
        this.o00oO0O = i;
    }

    @InlineOnly
    public static final int OooO(int i, int i2) {
        return m20934OooO0O0(i >>> i2);
    }

    @InlineOnly
    public static final byte OooO00o(int i) {
        return (byte) i;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m20927OooO00o(int i) {
        return OooO0O0(this.o00oO0O, i);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20928OooO00o(int i) {
        return ((long) i) & 4294967295L;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m20932OooO00o(int i) {
        return (short) i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20933OooO00o(int i, int i2) {
        throw null;
    }

    public static boolean OooO00o(int i, @Nullable Object obj) {
        if (obj instanceof UInt) {
            if (i == ((UInt) obj).OooO00o()) {
                return true;
            }
        }
        return false;
    }

    @PublishedApi
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m20934OooO0O0(int i) {
        return i;
    }

    @InlineOnly
    public static int OooO0O0(int i, int i2) {
        return C9175oooOOooo.OooO00o(i, i2);
    }

    @InlineOnly
    public static final long OooO0OO(int i, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) i) & 4294967295L) + j);
    }

    public static int OooO0Oo(int i) {
        return i;
    }

    @InlineOnly
    public static final int OooO0Oo(int i, byte b) {
        return m20934OooO0O0(i + m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0o(int i, int i2) {
        return m20934OooO0O0(i + i2);
    }

    @InlineOnly
    public static final long OooO0o0(int i, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) i) & 4294967295L) * j);
    }

    @InlineOnly
    public static final int OooO0oO(int i) {
        return i;
    }

    @InlineOnly
    public static final int OooO0oO(int i, int i2) {
        return C9175oooOOooo.OooO0OO(i, i2);
    }

    @InlineOnly
    public static final int OooO0oo(int i) {
        return i;
    }

    @InlineOnly
    public static final int OooO0oo(int i, int i2) {
        return m20934OooO0O0(i << i2);
    }

    @InlineOnly
    public static final int OooOO0(int i, int i2) {
        return m20934OooO0O0(i * i2);
    }

    @InlineOnly
    public static final int OooOO0O(int i, int i2) {
        return m20934OooO0O0(i ^ i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt ooooooo0) {
        return m20927OooO00o(ooooooo0.OooO00o());
    }

    public boolean equals(Object obj) {
        return OooO00o(this.o00oO0O, obj);
    }

    public int hashCode() {
        return OooO0Oo(this.o00oO0O);
    }

    @NotNull
    public String toString() {
        return m20931OooO00o(this.o00oO0O);
    }

    @InlineOnly
    public static final int OooO00o(int i, byte b) {
        return C9175oooOOooo.OooO00o(i, m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final long OooO0O0(int i, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) i) & 4294967295L) - j);
    }

    @InlineOnly
    public static final int OooO0OO(int i, byte b) {
        return m20934OooO0O0(i - m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0Oo(int i, short s) {
        return m20934OooO0O0(i + m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0o(int i, byte b) {
        return m20934OooO0O0(i * m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0o0(int i, byte b) {
        return C9175oooOOooo.OooO0OO(i, m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO00o(int i, short s) {
        return C9175oooOOooo.OooO00o(i, m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0O0(int i, byte b) {
        return C9175oooOOooo.OooO0O0(i, m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0OO(int i, short s) {
        return m20934OooO0O0(i - m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0Oo(int i, int i2) {
        return m20934OooO0O0(i - i2);
    }

    @InlineOnly
    public static final int OooO0o(int i, short s) {
        return m20934OooO0O0(i * m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0o0(int i, short s) {
        return C9175oooOOooo.OooO0OO(i, m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO00o(int i, long j) {
        return C9175oooOOooo.OooO00o(ULong.m20943OooO00o(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    public static final int OooO0O0(int i, short s) {
        return C9175oooOOooo.OooO0O0(i, m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0OO(int i, int i2) {
        return C9175oooOOooo.OooO0O0(i, i2);
    }

    @InlineOnly
    public static final long OooO0Oo(int i, long j) {
        return C9175oooOOooo.OooO0O0(ULong.m20943OooO00o(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    public static final int OooO0o(int i) {
        return m20934OooO0O0(i ^ -1);
    }

    @InlineOnly
    public static final int OooO0o0(int i) {
        return m20934OooO0O0(i + 1);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20929OooO00o(int i, long j) {
        return C9175oooOOooo.m20977OooO00o(ULong.m20943OooO00o(((long) i) & 4294967295L), j);
    }

    @InlineOnly
    public static final byte OooO0O0(int i) {
        return UByte.OooO00o((byte) i);
    }

    @InlineOnly
    public static final int OooO0OO(int i) {
        return m20934OooO0O0(i - 1);
    }

    @InlineOnly
    public static final int OooO0o0(int i, int i2) {
        return m20934OooO0O0(i | i2);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UIntRange m20930OooO00o(int i, int i2) {
        return new UIntRange(i, i2, null);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final short m20936OooO0O0(int i) {
        return UShort.m20962OooO00o((short) i);
    }

    @InlineOnly
    public static final int OooO00o(int i, int i2) {
        return m20934OooO0O0(i & i2);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final long m20935OooO0O0(int i) {
        return ULong.m20943OooO00o(((long) i) & 4294967295L);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20931OooO00o(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }
}
