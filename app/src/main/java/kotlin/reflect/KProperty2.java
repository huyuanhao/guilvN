package kotlin.reflect;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u0010J\u001d\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H'¢\u0006\u0002\u0010\rR$\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo43195d2 = {"Lkotlin/reflect/KProperty2;", "D", ExifInterface.o000oo00, "R", "Lkotlin/reflect/KProperty;", "Lkotlin/Function2;", "getter", "Lkotlin/reflect/KProperty2$Getter;", "getGetter", "()Lkotlin/reflect/KProperty2$Getter;", "get", "receiver1", "receiver2", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "", "Getter", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OO0O0O0  reason: invalid package */
public interface KProperty2<D, E, R> extends KProperty<R>, O00Oo000<D, E, R> {

    /* renamed from: com.pd.sdk.OO0O0O0$OooO00o */
    public interface OooO00o<D, E, R> extends KProperty.OooO0OO<R>, O00Oo000<D, E, R> {
    }

    R get(D d, E e);

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(D d, E e);

    @Override // kotlin.reflect.KProperty
    @NotNull
    OooO00o<D, E, R> getGetter();
}
