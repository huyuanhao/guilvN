package kotlin.coroutines.experimental.migration;

import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.experimental.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo43195d2 = {"Lkotlin/coroutines/experimental/migration/ExperimentalContextMigration;", "Lkotlin/coroutines/experimental/AbstractCoroutineContextElement;", C3416b.f8433Q, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Key", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.O0000  reason: invalid package */
public final class ExperimentalContextMigration extends AbstractC9286oooooOO0 {
    public static final OooO00o OooO00o = new OooO00o(null);
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CoroutineContext f16935OooO00o;

    /* renamed from: com.pd.sdk.O0000$OooO00o */
    public static final class OooO00o implements CoroutineContext.OooO0O0<ExperimentalContextMigration> {
        public OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExperimentalContextMigration(@NotNull kotlin.coroutines.CoroutineContext coroutineContext) {
        super(OooO00o);
        o0O0OO00.OooO0o(coroutineContext, C3416b.f8433Q);
        this.f16935OooO00o = coroutineContext;
    }

    @Override // kotlin.coroutines.experimental.CoroutineContext.Element, com.p118pd.sdk.AbstractC9286oooooOO0
    @NotNull
    public final kotlin.coroutines.CoroutineContext OooO00o() {
        return this.f16935OooO00o;
    }
}
