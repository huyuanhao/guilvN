package kotlin.text;

import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.OOO00OO;
import kotlin.Metadata;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo43195d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "value", "", "mask", "(Ljava/lang/String;III)V", "getMask", "()I", "getValue", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public enum RegexOption implements OOO00OO {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);
    
    public final int mask;
    public final int value;

    /* access modifiers changed from: public */
    RegexOption(int i, int i2) {
        this.value = i;
        this.mask = i2;
    }

    @Override // com.p118pd.sdk.OOO00OO
    public int getMask() {
        return this.mask;
    }

    @Override // com.p118pd.sdk.OOO00OO
    public int getValue() {
        return this.value;
    }

    /* access modifiers changed from: public */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ RegexOption(int i, int i2, int i3, O0o0o o0o0o) {
        this(i, (i3 & 2) != 0 ? i : i2);
    }
}
