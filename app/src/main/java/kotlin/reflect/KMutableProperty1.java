package kotlin.reflect;

import kotlin.Metadata;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u000eJ\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\rR\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo43195d2 = {"Lkotlin/reflect/KMutableProperty1;", "T", "R", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/KMutableProperty;", "setter", "Lkotlin/reflect/KMutableProperty1$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty1$Setter;", "set", "", "receiver", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0O000O  reason: invalid package */
public interface KMutableProperty1<T, R> extends KProperty1<T, R>, KMutableProperty<R> {

    /* renamed from: com.pd.sdk.oO0O000O$OooO00o */
    public interface OooO00o<T, R> extends KMutableProperty.OooO00o<R>, O00Oo000<T, R, C9174oooOOooO> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    OooO00o<T, R> getSetter();

    void set(T t, R r);
}
