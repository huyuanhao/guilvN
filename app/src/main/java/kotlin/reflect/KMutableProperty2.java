package kotlin.reflect;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u0010J%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u000fR$\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo43195d2 = {"Lkotlin/reflect/KMutableProperty2;", "D", ExifInterface.o000oo00, "R", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/KMutableProperty;", "setter", "Lkotlin/reflect/KMutableProperty2$Setter;", "getSetter", "()Lkotlin/reflect/KMutableProperty2$Setter;", "set", "", "receiver1", "receiver2", "value", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO0O00O  reason: invalid package */
public interface KMutableProperty2<D, E, R> extends KProperty2<D, E, R>, KMutableProperty<R> {

    /* renamed from: com.pd.sdk.OO0O00O$OooO00o */
    public interface OooO00o<D, E, R> extends KMutableProperty.OooO00o<R>, O00Oo00O<D, E, R, C9174oooOOooO> {
    }

    @Override // kotlin.reflect.KMutableProperty
    @NotNull
    OooO00o<D, E, R> getSetter();

    void set(D d, E e, R r);
}
