package kotlin.text;

import com.p118pd.sdk.C9232oooo0o00;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.oO00O000;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, mo43195d2 = {"<anonymous>", "", "", "Lkotlin/text/CharDirectionality;", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements O00O0000<Map<Integer, ? extends CharDirectionality>> {
    public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE = new CharDirectionality$Companion$directionalityMap$2();

    public CharDirectionality$Companion$directionalityMap$2() {
        super(0);
    }

    /* Return type fixed from 'java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>' to match base method */
    @Override // com.p118pd.sdk.O00O0000
    @NotNull
    public final Map<Integer, ? extends CharDirectionality> invoke() {
        CharDirectionality[] values = CharDirectionality.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(oO00O000.OooO00o(C9232oooo0o00.OooO00o(values.length), 16));
        for (CharDirectionality charDirectionality : values) {
            linkedHashMap.put(Integer.valueOf(charDirectionality.getValue()), charDirectionality);
        }
        return linkedHashMap;
    }
}
