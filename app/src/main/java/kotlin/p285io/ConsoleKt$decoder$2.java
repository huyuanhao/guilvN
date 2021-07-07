package kotlin.p285io;

import com.p118pd.sdk.O00O0000;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo43195d2 = {"<anonymous>", "Ljava/nio/charset/CharsetDecoder;", "kotlin.jvm.PlatformType", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
/* renamed from: kotlin.io.ConsoleKt$decoder$2 */
public final class ConsoleKt$decoder$2 extends Lambda implements O00O0000<CharsetDecoder> {
    public static final ConsoleKt$decoder$2 INSTANCE = new ConsoleKt$decoder$2();

    public ConsoleKt$decoder$2() {
        super(0);
    }

    @Override // com.p118pd.sdk.O00O0000
    public final CharsetDecoder invoke() {
        return Charset.defaultCharset().newDecoder();
    }
}
