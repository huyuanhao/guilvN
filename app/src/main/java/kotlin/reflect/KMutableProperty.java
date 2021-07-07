package kotlin.reflect;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0007R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo43195d2 = {"Lkotlin/reflect/KMutableProperty;", "R", "Lkotlin/reflect/KProperty;", "setter", "Lkotlin/reflect/KMutableProperty$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty$Setter;", "Setter", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO0O000  reason: invalid package */
public interface KMutableProperty<R> extends KProperty<R> {

    /* renamed from: com.pd.sdk.OO0O000$OooO00o */
    public interface OooO00o<R> extends KProperty.OooO00o<R>, KFunction<C9174oooOOooO> {
    }

    @NotNull
    OooO00o<R> getSetter();
}
