package kotlin.reflect;

import kotlin.Metadata;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\fJ\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, mo43195d2 = {"Lkotlin/reflect/KMutableProperty0;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/KMutableProperty;", "setter", "Lkotlin/reflect/KMutableProperty0$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty0$Setter;", "set", "", "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0O0000  reason: invalid package */
public interface KMutableProperty0<R> extends KProperty0<R>, KMutableProperty<R> {

    /* renamed from: com.pd.sdk.oO0O0000$OooO00o */
    public interface OooO00o<R> extends KMutableProperty.OooO00o<R>, O00O0OOO<R, C9174oooOOooO> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    OooO00o<R> getSetter();

    void set(R r);
}
