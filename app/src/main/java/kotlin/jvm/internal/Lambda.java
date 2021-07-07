package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.o0O0O0O0;
import com.p118pd.sdk.o0O0OO00;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo43195d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public abstract class Lambda<R> implements o0O0O0O0<R>, Serializable {
    public final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // com.p118pd.sdk.o0O0O0O0
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String OooO00o = O0OO00.OooO00o((Lambda) this);
        o0O0OO00.OooO00o((Object) OooO00o, "Reflection.renderLambdaToString(this)");
        return OooO00o;
    }
}
