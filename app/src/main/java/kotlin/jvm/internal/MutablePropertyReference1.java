package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return O0OO00.OooO00o(this);
    }

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    @Override // com.p118pd.sdk.O00O0OOO
    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty1
    public KProperty1.OooO00o getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty, kotlin.reflect.KMutableProperty1
    public KMutableProperty1.OooO00o getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }
}
