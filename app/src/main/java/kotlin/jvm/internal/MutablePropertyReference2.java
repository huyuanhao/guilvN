package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty2;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return O0OO00.OooO00o(this);
    }

    @Override // kotlin.reflect.KProperty2
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KMutableProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // com.p118pd.sdk.O00Oo000
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty2
    public KProperty2.OooO00o getGetter() {
        return ((KMutableProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.KMutableProperty, kotlin.reflect.KMutableProperty2
    public KMutableProperty2.OooO00o getSetter() {
        return ((KMutableProperty2) getReflected()).getSetter();
    }
}
