package kotlin.text;

import com.p118pd.sdk.AbstractC9141oooO0oO;
import com.p118pd.sdk.C9107oooO;
import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.O0o0o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, mo43195d2 = {"Lkotlin/text/CharDirectionality;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    public static final OooO00o Companion = new OooO00o(null);
    public static final AbstractC9141oooO0oO OooO00o = C9107oooO.OooO00o(CharDirectionality$Companion$directionalityMap$2.INSTANCE);
    public final int value;

    public static final class OooO00o {
        public static final /* synthetic */ KProperty[] OooO00o = {O0OO00.OooO00o(new PropertyReference1Impl(O0OO00.OooO0O0(OooO00o.class), "directionalityMap", "getDirectionalityMap()Ljava/util/Map;"))};

        public OooO00o() {
        }

        private final Map<Integer, CharDirectionality> OooO00o() {
            AbstractC9141oooO0oO oooo0oo = CharDirectionality.OooO00o;
            KProperty oo0o00o0 = OooO00o[0];
            return (Map) oooo0oo.getValue();
        }

        @NotNull
        public final CharDirectionality OooO00o(int i) {
            CharDirectionality charDirectionality = OooO00o().get(Integer.valueOf(i));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new IllegalArgumentException("Directionality #" + i + " is not defined.");
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    /* access modifiers changed from: public */
    CharDirectionality(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
