package kotlin.text;

import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.OO0O0;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\b\u0003"}, mo43195d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "p1", "invoke"}, mo43196k = 3, mo43197mv = {1, 1, 13})
public final class Regex$findAll$2 extends FunctionReference implements O00O0OOO<MatchResult, MatchResult> {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "next";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final OO0O0 getOwner() {
        return O0OO00.OooO0O0(MatchResult.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "next()Lkotlin/text/MatchResult;";
    }

    @Nullable
    public final MatchResult invoke(@NotNull MatchResult ooo0o0) {
        o0O0OO00.OooO0o(ooo0o0, "p1");
        return ooo0o0.m16548OooO00o();
    }
}
