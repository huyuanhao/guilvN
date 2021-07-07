package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.contracts.ExperimentalContracts;
import kotlin.contracts.InvocationKind;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, mo43195d2 = {"Lkotlin/contracts/ContractBuilder;", "", "callsInPlace", "Lkotlin/contracts/CallsInPlace;", "R", "lambda", "Lkotlin/Function;", "kind", "Lkotlin/contracts/InvocationKind;", "returns", "Lkotlin/contracts/Returns;", "value", "returnsNotNull", "Lkotlin/contracts/ReturnsNotNull;", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@ExperimentalContracts
/* renamed from: com.pd.sdk.ooooOoO  reason: invalid package */
public interface ContractBuilder {

    /* renamed from: com.pd.sdk.ooooOoO$OooO00o */
    public static final class OooO00o {
        @ContractsDsl
        @NotNull
        public static /* synthetic */ AbstractC9270ooooOo0o OooO00o(ContractBuilder ooooooo, AbstractC9139oooO0o0O oooo0o0o, InvocationKind invocationKind, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    invocationKind = InvocationKind.UNKNOWN;
                }
                return ooooooo.OooO00o(oooo0o0o, invocationKind);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @ContractsDsl
    @NotNull
    <R> AbstractC9270ooooOo0o OooO00o(@NotNull AbstractC9139oooO0o0O<? extends R> oooo0o0o, @NotNull InvocationKind invocationKind);

    @ContractsDsl
    @NotNull
    AbstractC9277ooooOooo OooO00o();

    @ContractsDsl
    @NotNull
    AbstractC9277ooooOooo OooO00o(@Nullable Object obj);

    @ContractsDsl
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    AbstractC9281ooooo000 m21163OooO00o();
}
