package kotlin.coroutines.experimental;

import androidx.exifinterface.media.ExifInterface;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.p118pd.sdk.C9289oooooOoo;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.o0O0OO00;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0000H\u0002J\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J5\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u0002H\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016¢\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\b\b\u0000\u0010\u0018*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0014\u0010\u001e\u001a\u00020\u00012\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\""}, mo43195d2 = {"Lkotlin/coroutines/experimental/CombinedContext;", "Lkotlin/coroutines/experimental/CoroutineContext;", "left", "element", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/CoroutineContext$Element;)V", "getElement", "()Lkotlin/coroutines/experimental/CoroutineContext$Element;", "getLeft", "()Lkotlin/coroutines/experimental/CoroutineContext;", "contains", "", "containsAll", C3416b.f8433Q, "equals", DispatchConstants.OTHER, "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.o000oo00, "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "hashCode", "", "minusKey", FileAttachment.KEY_SIZE, "toString", "", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class CombinedContext implements CoroutineContext {
    @NotNull
    public final CoroutineContext.Element OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CoroutineContext f23866OooO00o;

    public CombinedContext(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element oooO00o) {
        o0O0OO00.OooO0o(coroutineContext, "left");
        o0O0OO00.OooO0o(oooO00o, "element");
        this.f23866OooO00o = coroutineContext;
        this.OooO00o = oooO00o;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final CoroutineContext.Element m22792OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.OooO00o() != OooO00o() || !combinedContext.OooO00o(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext
    public <R> R fold(R r, @NotNull O00Oo000<? super R, ? super CoroutineContext.Element, ? extends R> o00Oo000) {
        o0O0OO00.OooO0o(o00Oo000, "operation");
        return (R) o00Oo000.invoke((Object) this.f23866OooO00o.fold(r, o00Oo000), this.OooO00o);
    }

    public int hashCode() {
        return this.f23866OooO00o.hashCode() + this.OooO00o.hashCode();
    }

    @NotNull
    public String toString() {
        return "[" + ((String) fold("", CombinedContext$toString$1.INSTANCE)) + "]";
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final CoroutineContext m22793OooO00o() {
        return this.f23866OooO00o;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    public CoroutineContext OooO00o(@NotNull CoroutineContext coroutineContext) {
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        return CoroutineContext.DefaultImpls.OooO00o(this, coroutineContext);
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E OooO00o(@NotNull CoroutineContext.OooO0O0<E> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.OooO00o.OooO00o(oooO0O0);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext.f23866OooO00o;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.OooO00o(oooO0O0);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext, kotlin.coroutines.experimental.CoroutineContext
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CoroutineContext m22794OooO00o(@NotNull CoroutineContext.OooO0O0<?> oooO0O0) {
        o0O0OO00.OooO0o(oooO0O0, "key");
        if (this.OooO00o.OooO00o((CoroutineContext.OooO0O0) oooO0O0) != null) {
            return this.f23866OooO00o;
        }
        CoroutineContext OooO00o2 = this.f23866OooO00o.m22795OooO00o(oooO0O0);
        if (OooO00o2 == this.f23866OooO00o) {
            return this;
        }
        if (OooO00o2 == C9289oooooOoo.OooO00o) {
            return this.OooO00o;
        }
        return new CombinedContext(OooO00o2, this.OooO00o);
    }

    private final int OooO00o() {
        CoroutineContext coroutineContext = this.f23866OooO00o;
        if (coroutineContext instanceof CombinedContext) {
            return ((CombinedContext) coroutineContext).OooO00o() + 1;
        }
        return 2;
    }

    private final boolean OooO00o(CoroutineContext.Element oooO00o) {
        return o0O0OO00.OooO00o(OooO00o((CoroutineContext.OooO0O0) oooO00o.OooO00o()), oooO00o);
    }

    private final boolean OooO00o(CombinedContext combinedContext) {
        while (OooO00o(combinedContext.OooO00o)) {
            CoroutineContext coroutineContext = combinedContext.f23866OooO00o;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else if (coroutineContext != null) {
                return OooO00o((CoroutineContext.Element) coroutineContext);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.CoroutineContext.Element");
            }
        }
        return false;
    }
}
