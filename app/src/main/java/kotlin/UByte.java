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
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001^B\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u0013\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\rHÖ\u0001J\u0013\u0010%\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005J\u0013\u0010'\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0005J\u001b\u0010)\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b*\u0010\u000fJ\u001b\u0010)\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\nø\u0001\u0000¢\u0006\u0004\b+\u0010\u0012J\u001b\u0010)\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u001fJ\u001b\u0010)\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b-\u0010\u0018J\u001b\u0010.\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b/\u0010\u000bJ\u001b\u00100\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u000fJ\u001b\u00100\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\nø\u0001\u0000¢\u0006\u0004\b2\u0010\u0012J\u001b\u00100\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u001fJ\u001b\u00100\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0018J\u001b\u00105\u001a\u0002062\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b:\u0010\u000fJ\u001b\u00109\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\nø\u0001\u0000¢\u0006\u0004\b;\u0010\u0012J\u001b\u00109\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\nø\u0001\u0000¢\u0006\u0004\b<\u0010\u001fJ\u001b\u00109\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b=\u0010\u0018J\u001b\u0010>\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b?\u0010\u000fJ\u001b\u0010>\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0012J\u001b\u0010>\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u001fJ\u001b\u0010>\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u0018J\u0010\u0010C\u001a\u00020\u0003H\b¢\u0006\u0004\bD\u0010\u0005J\u0010\u0010E\u001a\u00020\rH\b¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020IH\b¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020MH\b¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0013\u0010T\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\bU\u0010\u0005J\u0013\u0010V\u001a\u00020\u0010H\bø\u0001\u0000¢\u0006\u0004\bW\u0010GJ\u0013\u0010X\u001a\u00020\u0013H\bø\u0001\u0000¢\u0006\u0004\bY\u0010KJ\u0013\u0010Z\u001a\u00020\u0016H\bø\u0001\u0000¢\u0006\u0004\b[\u0010OJ\u001b\u0010\\\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b]\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006_"}, mo43195d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "data$annotations", "()V", "and", DispatchConstants.OTHER, "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-impl", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toInt", "toInt-impl", "(B)I", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oooOOO  reason: invalid package */
public final class UByte implements Comparable<UByte> {
    public static final OooO00o OooO00o = new OooO00o(null);
    public static final byte OooO0O0 = 0;
    public static final byte OooO0OO = -1;
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte f22628OooO00o;

    /* renamed from: com.pd.sdk.oooOOO$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    @PublishedApi
    public /* synthetic */ UByte(byte b) {
        this.f22628OooO00o = b;
    }

    @PublishedApi
    public static byte OooO00o(byte b) {
        return b;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m20900OooO00o(byte b) {
        return m20901OooO00o(this.f22628OooO00o, b);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20902OooO00o(byte b) {
        return ((long) b) & 255;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m20906OooO00o(byte b) {
        return (short) (((short) b) & 255);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20907OooO00o(byte b, byte b2) {
        throw null;
    }

    public static boolean OooO00o(byte b, @Nullable Object obj) {
        if (obj instanceof UByte) {
            if (b == ((UByte) obj).OooO00o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m20908OooO0O0(byte b) {
        return b;
    }

    @InlineOnly
    public static final long OooO0O0(byte b, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) b) & 255) - j);
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final int m20912OooO0OO(byte b) {
        return b & 255;
    }

    @InlineOnly
    public static final long OooO0OO(byte b, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) b) & 255) + j);
    }

    @InlineOnly
    public static final int OooO0Oo(byte b, byte b2) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) + UInt.m20934OooO0O0(b2 & 255));
    }

    @InlineOnly
    public static final byte OooO0o(byte b) {
        return b;
    }

    @InlineOnly
    public static final int OooO0o(byte b, byte b2) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) * UInt.m20934OooO0O0(b2 & 255));
    }

    @InlineOnly
    public static final byte OooO0o0(byte b) {
        return b;
    }

    @InlineOnly
    public static final long OooO0o0(byte b, long j) {
        return ULong.m20943OooO00o(ULong.m20943OooO00o(((long) b) & 255) * j);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte oooooo) {
        return m20900OooO00o(oooooo.OooO00o());
    }

    public boolean equals(Object obj) {
        return OooO00o(this.f22628OooO00o, obj);
    }

    public int hashCode() {
        return m20908OooO0O0(this.f22628OooO00o);
    }

    @NotNull
    public String toString() {
        return m20905OooO00o(this.f22628OooO00o);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int m20901OooO00o(byte b, byte b2) {
        return o0O0OO00.OooO00o(b & 255, b2 & 255);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final int m20909OooO0O0(byte b, byte b2) {
        return C9175oooOOooo.OooO0O0(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(b2 & 255));
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final int m20913OooO0OO(byte b, byte b2) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) - UInt.m20934OooO0O0(b2 & 255));
    }

    @InlineOnly
    public static final int OooO0Oo(byte b, short s) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) + UInt.m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0o(byte b, short s) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) * UInt.m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0o0(byte b, byte b2) {
        return C9175oooOOooo.OooO0OO(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(b2 & 255));
    }

    @InlineOnly
    public static final int OooO00o(byte b, short s) {
        return o0O0OO00.OooO00o(b & 255, s & UShort.OooO0OO);
    }

    @InlineOnly
    public static final int OooO0O0(byte b, short s) {
        return C9175oooOOooo.OooO0O0(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0OO(byte b, short s) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) - UInt.m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO0Oo(byte b, int i) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) + i);
    }

    @InlineOnly
    public static final int OooO0o(byte b, int i) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) * i);
    }

    @InlineOnly
    public static final int OooO0o0(byte b, short s) {
        return C9175oooOOooo.OooO0OO(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(s & UShort.OooO0OO));
    }

    @InlineOnly
    public static final int OooO00o(byte b, int i) {
        return C9175oooOOooo.OooO00o(UInt.m20934OooO0O0(b & 255), i);
    }

    @InlineOnly
    public static final int OooO0O0(byte b, int i) {
        return C9175oooOOooo.OooO0O0(UInt.m20934OooO0O0(b & 255), i);
    }

    @InlineOnly
    public static final int OooO0OO(byte b, int i) {
        return UInt.m20934OooO0O0(UInt.m20934OooO0O0(b & 255) - i);
    }

    @InlineOnly
    public static final long OooO0Oo(byte b, long j) {
        return C9175oooOOooo.OooO0O0(ULong.m20943OooO00o(((long) b) & 255), j);
    }

    @InlineOnly
    public static final int OooO0o0(byte b, int i) {
        return C9175oooOOooo.OooO0OO(UInt.m20934OooO0O0(b & 255), i);
    }

    @InlineOnly
    public static final int OooO00o(byte b, long j) {
        return C9175oooOOooo.OooO00o(ULong.m20943OooO00o(((long) b) & 255), j);
    }

    @InlineOnly
    public static final byte OooO0O0(byte b) {
        return OooO00o((byte) (b - 1));
    }

    @InlineOnly
    public static final byte OooO0OO(byte b) {
        return OooO00o((byte) (b + 1));
    }

    @InlineOnly
    public static final byte OooO0Oo(byte b) {
        return OooO00o((byte) (b ^ -1));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20903OooO00o(byte b, long j) {
        return C9175oooOOooo.m20977OooO00o(ULong.m20943OooO00o(((long) b) & 255), j);
    }

    @InlineOnly
    public static final byte OooO0O0(byte b, byte b2) {
        return OooO00o((byte) (b | b2));
    }

    @InlineOnly
    public static final byte OooO0OO(byte b, byte b2) {
        return OooO00o((byte) (b ^ b2));
    }

    @InlineOnly
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final int m20914OooO0Oo(byte b) {
        return UInt.m20934OooO0O0(b & 255);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final UIntRange m20904OooO00o(byte b, byte b2) {
        return new UIntRange(UInt.m20934OooO0O0(b & 255), UInt.m20934OooO0O0(b2 & 255), null);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final short m20911OooO0O0(byte b) {
        return UShort.m20962OooO00o((short) (((short) b) & 255));
    }

    @InlineOnly
    public static final byte OooO00o(byte b, byte b2) {
        return OooO00o((byte) (b & b2));
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final long m20910OooO0O0(byte b) {
        return ULong.m20943OooO00o(((long) b) & 255);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20905OooO00o(byte b) {
        return String.valueOf(b & 255);
    }
}
