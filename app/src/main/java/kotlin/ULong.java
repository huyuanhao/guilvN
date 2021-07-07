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
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b@\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001eB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\u0013\u0010'\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b(\u0010\u0005J\u0013\u0010)\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0005J\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u001dJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b-\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b.\u0010\u000bJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001b\u00100\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\b1\u0010\u000bJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u001dJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u001fJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u000bJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b6\u0010\"J\u001b\u00107\u001a\u0002082\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\b<\u0010\u001dJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\b=\u0010\u001fJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\b?\u0010\"J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\rH\fø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010C\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\rH\fø\u0001\u0000¢\u0006\u0004\bD\u0010\u001fJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\nø\u0001\u0000¢\u0006\u0004\bF\u0010\u001dJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\nø\u0001\u0000¢\u0006\u0004\bG\u0010\u001fJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\nø\u0001\u0000¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\nø\u0001\u0000¢\u0006\u0004\bI\u0010\"J\u0010\u0010J\u001a\u00020KH\b¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\rH\b¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0003H\b¢\u0006\u0004\bR\u0010\u0005J\u0010\u0010S\u001a\u00020TH\b¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ\u0013\u0010[\u001a\u00020\u000eH\bø\u0001\u0000¢\u0006\u0004\b\\\u0010MJ\u0013\u0010]\u001a\u00020\u0011H\bø\u0001\u0000¢\u0006\u0004\b^\u0010PJ\u0013\u0010_\u001a\u00020\u0000H\bø\u0001\u0000¢\u0006\u0004\b`\u0010\u0005J\u0013\u0010a\u001a\u00020\u0016H\bø\u0001\u0000¢\u0006\u0004\bb\u0010VJ\u001b\u0010c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\fø\u0001\u0000¢\u0006\u0004\bd\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, mo43195d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "data$annotations", "()V", "and", DispatchConstants.OTHER, "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-impl", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "hashCode", "inc", "inc-impl", "inv", "inv-impl", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-impl", "shr", "shr-impl", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-impl", "toUInt", "toUInt-impl", "toULong", "toULong-impl", "toUShort", "toUShort-impl", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.oooOOo00  reason: invalid package */
public final class ULong implements Comparable<ULong> {
    public static final OooO00o OooO00o = new OooO00o(null);
    public static final long OooO0O0 = 0;
    public static final long OooO0OO = -1;
    public static final int o00oO0O = 8;
    public static final int o0ooOO0 = 64;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f22629OooO00o;

    /* renamed from: com.pd.sdk.oooOOo00$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    @PublishedApi
    public /* synthetic */ ULong(long j) {
        this.f22629OooO00o = j;
    }

    @InlineOnly
    public static final byte OooO00o(long j) {
        return (byte) ((int) j);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    private int m20942OooO00o(long j) {
        return OooO00o(this.f22629OooO00o, j);
    }

    @PublishedApi
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20943OooO00o(long j) {
        return j;
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final short m20950OooO00o(long j) {
        return (short) ((int) j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20951OooO00o(long j, long j2) {
        throw null;
    }

    public static boolean OooO00o(long j, @Nullable Object obj) {
        if (obj instanceof ULong) {
            if (j == ((ULong) obj).OooO00o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static int m20952OooO0O0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @InlineOnly
    public static final long OooO0O0(long j, byte b) {
        return m20943OooO00o(j - m20943OooO00o(((long) b) & 255));
    }

    @InlineOnly
    public static final int OooO0OO(long j) {
        return (int) j;
    }

    @InlineOnly
    public static final long OooO0OO(long j, byte b) {
        return m20943OooO00o(j + m20943OooO00o(((long) b) & 255));
    }

    @InlineOnly
    public static final long OooO0Oo(long j, byte b) {
        return C9175oooOOooo.OooO0O0(j, m20943OooO00o(((long) b) & 255));
    }

    @InlineOnly
    public static final long OooO0o(long j) {
        return j;
    }

    @InlineOnly
    public static final long OooO0o(long j, long j2) {
        return C9175oooOOooo.OooO0O0(j, j2);
    }

    @InlineOnly
    public static final long OooO0o0(long j) {
        return j;
    }

    @InlineOnly
    public static final long OooO0o0(long j, long j2) {
        return m20943OooO00o(j + j2);
    }

    @InlineOnly
    public static final long OooO0oO(long j, int i) {
        return m20943OooO00o(j * m20943OooO00o(((long) i) & 4294967295L));
    }

    @InlineOnly
    public static final long OooO0oo(long j, long j2) {
        return m20943OooO00o(j ^ j2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong oooooo00) {
        return m20942OooO00o(oooooo00.OooO00o());
    }

    public boolean equals(Object obj) {
        return OooO00o(this.f22629OooO00o, obj);
    }

    public int hashCode() {
        return m20952OooO0O0(this.f22629OooO00o);
    }

    @NotNull
    public String toString() {
        return m20949OooO00o(this.f22629OooO00o);
    }

    @InlineOnly
    public static final int OooO00o(long j, byte b) {
        return C9175oooOOooo.OooO00o(j, m20943OooO00o(((long) b) & 255));
    }

    @InlineOnly
    public static final long OooO0O0(long j, short s) {
        return m20943OooO00o(j - m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    public static final long OooO0OO(long j, short s) {
        return m20943OooO00o(j + m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    public static final long OooO0Oo(long j, short s) {
        return C9175oooOOooo.OooO0O0(j, m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    public static final long OooO0o(long j, int i) {
        return m20943OooO00o(j >>> i);
    }

    @InlineOnly
    public static final long OooO0o0(long j, byte b) {
        return m20943OooO00o(j * m20943OooO00o(((long) b) & 255));
    }

    @InlineOnly
    public static final long OooO0oO(long j, long j2) {
        return m20943OooO00o(j * j2);
    }

    @InlineOnly
    public static final int OooO00o(long j, short s) {
        return C9175oooOOooo.OooO00o(j, m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    public static final long OooO0O0(long j, int i) {
        return m20943OooO00o(j - m20943OooO00o(((long) i) & 4294967295L));
    }

    @InlineOnly
    public static final long OooO0OO(long j, int i) {
        return m20943OooO00o(j + m20943OooO00o(((long) i) & 4294967295L));
    }

    @InlineOnly
    public static final long OooO0Oo(long j, int i) {
        return C9175oooOOooo.OooO0O0(j, m20943OooO00o(((long) i) & 4294967295L));
    }

    @InlineOnly
    public static final long OooO0o0(long j, short s) {
        return m20943OooO00o(j * m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    public static final int OooO00o(long j, int i) {
        return C9175oooOOooo.OooO00o(j, m20943OooO00o(((long) i) & 4294967295L));
    }

    @InlineOnly
    public static final long OooO0O0(long j, long j2) {
        return C9175oooOOooo.m20977OooO00o(j, j2);
    }

    @InlineOnly
    public static final long OooO0OO(long j, long j2) {
        return m20943OooO00o(j - j2);
    }

    @InlineOnly
    public static final long OooO0Oo(long j, long j2) {
        return m20943OooO00o(j | j2);
    }

    @InlineOnly
    public static final long OooO0o0(long j, int i) {
        return m20943OooO00o(j << i);
    }

    @InlineOnly
    public static int OooO00o(long j, long j2) {
        return C9175oooOOooo.OooO00o(j, j2);
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final long m20953OooO0O0(long j) {
        return m20943OooO00o(j - 1);
    }

    @InlineOnly
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static final long m20955OooO0OO(long j) {
        return m20943OooO00o(j + 1);
    }

    @InlineOnly
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static final long m20956OooO0Oo(long j) {
        return m20943OooO00o(j ^ -1);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20944OooO00o(long j, byte b) {
        return C9175oooOOooo.m20977OooO00o(j, m20943OooO00o(((long) b) & 255));
    }

    @InlineOnly
    public static final byte OooO0O0(long j) {
        return UByte.OooO00o((byte) ((int) j));
    }

    @InlineOnly
    public static final int OooO0Oo(long j) {
        return UInt.m20934OooO0O0((int) j);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20947OooO00o(long j, short s) {
        return C9175oooOOooo.m20977OooO00o(j, m20943OooO00o(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static final short m20954OooO0O0(long j) {
        return UShort.m20962OooO00o((short) ((int) j));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20945OooO00o(long j, int i) {
        return C9175oooOOooo.m20977OooO00o(j, m20943OooO00o(((long) i) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final ULongRange m20948OooO00o(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    @InlineOnly
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final long m20946OooO00o(long j, long j2) {
        return m20943OooO00o(j & j2);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20949OooO00o(long j) {
        return C9175oooOOooo.OooO00o(j);
    }
}
