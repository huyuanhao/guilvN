package kotlin;

import anet.channel.strategy.dispatch.DispatchConstants;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import okhttp3.internal.p288ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001^B\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u0013\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\rHÖ\u0001J\u0013\u0010%\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005J\u0013\u0010'\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0005J\u001b\u0010)\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b*\u0010\u0010J\u001b\u0010)\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b+\u0010\u0013J\u001b\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u001fJ\u001b\u0010)\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b-\u0010\u0018J\u001b\u0010.\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b/\u0010\u000bJ\u001b\u00100\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0010J\u001b\u00100\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b2\u0010\u0013J\u001b\u00100\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u001fJ\u001b\u00100\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0018J\u001b\u00105\u001a\u0002062\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b:\u0010\u0010J\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b;\u0010\u0013J\u001b\u00109\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\b<\u0010\u001fJ\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b=\u0010\u0018J\u001b\u0010>\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b?\u0010\u0010J\u001b\u0010>\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0013J\u001b\u0010>\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u001fJ\u001b\u0010>\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u0018J\u0010\u0010C\u001a\u00020DH\b¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\rH\b¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020KH\b¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0003H\b¢\u0006\u0004\bO\u0010\u0005J\u000f\u0010P\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0013\u0010T\u001a\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\bU\u0010FJ\u0013\u0010V\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\bW\u0010IJ\u0013\u0010X\u001a\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\bY\u0010MJ\u0013\u0010Z\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b[\u0010\u0005J\u001b\u0010\\\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b]\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, mo43195d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "data$annotations", "()V", "and", DispatchConstants.OTHER, "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-impl", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toInt", "toInt-impl", "(S)I", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oooOOoOO  reason: invalid package */
public final class UShort implements Comparable<UShort> {
    public static final OooO00o OooO00o = new OooO00o(null);
    public static final short OooO0O0 = 0;
    public static final short OooO0OO = -1;
    public static final int o00oO0O = 2;
    public static final int o0ooOO0 = 16;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final short f22630OooO00o;

    /* renamed from: com.pd.sdk.oooOOoOO$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    @PublishedApi
    public /* synthetic */ UShort(short s) {
        this.f22630OooO00o = s;
    }

    @InlineOnly
    public static final byte OooO00o(short s) {
        return (byte) s;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m20957OooO00o(short s) {
        return OooO00o(this.f22630OooO00o, s);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20958OooO00o(short s) {
        return ((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @PublishedApi
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m20962OooO00o(short s) {
        return s;
    }

    public static boolean OooO00o(short s, @Nullable Object obj) {
        if (obj instanceof UShort) {
            if (s == ((UShort) obj).OooO00o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20964OooO00o(short s, short s2) {
        throw null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m20965OooO0O0(short s) {
        return s;
    }

    @InlineOnly
    public static final long OooO0O0(short s, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @InlineOnly
    public static final int OooO0OO(short s) {
        return s & OooO0OO;
    }

    @InlineOnly
    public static final long OooO0OO(short s, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @InlineOnly
    public static final int OooO0Oo(short s, byte b) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) + UInt.m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0o(short s, byte b) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) * UInt.m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final short OooO0o(short s) {
        return s;
    }

    @InlineOnly
    public static final long OooO0o0(short s, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @InlineOnly
    public static final short OooO0o0(short s) {
        return s;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort oooooooo) {
        return m20957OooO00o(oooooooo.OooO00o());
    }

    public boolean equals(Object obj) {
        return OooO00o(this.f22630OooO00o, obj);
    }

    public int hashCode() {
        return m20965OooO0O0(this.f22630OooO00o);
    }

    @NotNull
    public String toString() {
        return m20961OooO00o(this.f22630OooO00o);
    }

    @InlineOnly
    public static final int OooO00o(short s, byte b) {
        return o0O0OO00.OooO00o(s & OooO0OO, b & 255);
    }

    @InlineOnly
    public static final int OooO0O0(short s, byte b) {
        return C9175oooOOooo.OooO0O0(UInt.m20934OooO0O0(s & OooO0OO), UInt.m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0OO(short s, byte b) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) - UInt.m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static final int OooO0Oo(short s, short s2) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) + UInt.m20934OooO0O0(s2 & OooO0OO));
    }

    @InlineOnly
    public static final int OooO0o(short s, short s2) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) * UInt.m20934OooO0O0(s2 & OooO0OO));
    }

    @InlineOnly
    public static final int OooO0o0(short s, byte b) {
        return C9175oooOOooo.OooO0OO(UInt.m20934OooO0O0(s & OooO0OO), UInt.m20934OooO0O0(b & 255));
    }

    @InlineOnly
    public static int OooO00o(short s, short s2) {
        return o0O0OO00.OooO00o(s & OooO0OO, s2 & OooO0OO);
    }

    @InlineOnly
    public static final int OooO0O0(short s, short s2) {
        return C9175oooOOooo.OooO0O0(UInt.m20934OooO0O0(s & OooO0OO), UInt.m20934OooO0O0(s2 & OooO0OO));
    }

    @InlineOnly
    public static final int OooO0OO(short s, short s2) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) - UInt.m20934OooO0O0(s2 & OooO0OO));
    }

    @InlineOnly
    public static final int OooO0Oo(short s, int i) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) + i);
    }

    @InlineOnly
    public static final int OooO0o(short s, int i) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) * i);
    }

    @InlineOnly
    public static final int OooO0o0(short s, short s2) {
        return C9175oooOOooo.OooO0OO(UInt.m20934OooO0O0(s & OooO0OO), UInt.m20934OooO0O0(s2 & OooO0OO));
    }

    @InlineOnly
    public static final int OooO00o(short s, int i) {
        return C9175oooOOooo.OooO00o(UInt.m20934OooO0O0(s & OooO0OO), i);
    }

    @InlineOnly
    public static final int OooO0O0(short s, int i) {
        return C9175oooOOooo.OooO0O0(UInt.m20934OooO0O0(s & OooO0OO), i);
    }

    @InlineOnly
    public static final int OooO0OO(short s, int i) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(s & OooO0OO) - i);
    }

    @InlineOnly
    public static final long OooO0Oo(short s, long j) {
        return C9175oooOOooo.OooO0O0(ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    public static final int OooO0o0(short s, int i) {
        return C9175oooOOooo.OooO0OO(UInt.m20934OooO0O0(s & OooO0OO), i);
    }

    @InlineOnly
    public static final int OooO00o(short s, long j) {
        return C9175oooOOooo.OooO00o(ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final short m20967OooO0O0(short s) {
        return m20962OooO00o((short) (s - 1));
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final short m20969OooO0OO(short s) {
        return m20962OooO00o((short) (s + 1));
    }

    @InlineOnly
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final short m20971OooO0Oo(short s) {
        return m20962OooO00o((short) (s ^ -1));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20959OooO00o(short s, long j) {
        return C9175oooOOooo.m20977OooO00o(ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final short m20968OooO0O0(short s, short s2) {
        return m20962OooO00o((short) (s | s2));
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final short m20970OooO0OO(short s, short s2) {
        return m20962OooO00o((short) (s ^ s2));
    }

    @InlineOnly
    public static final int OooO0Oo(short s) {
        return UInt.m20934OooO0O0(s & OooO0OO);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UIntRange m20960OooO00o(short s, short s2) {
        return new UIntRange(UInt.m20934OooO0O0(s & OooO0OO), UInt.m20934OooO0O0(s2 & OooO0OO), null);
    }

    @InlineOnly
    public static final byte OooO0O0(short s) {
        return UByte.OooO00o((byte) s);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m20963OooO00o(short s, short s2) {
        return m20962OooO00o((short) (s & s2));
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final long m20966OooO0O0(short s) {
        return ULong.m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20961OooO00o(short s) {
        return String.valueOf(s & OooO0OO);
    }
}
