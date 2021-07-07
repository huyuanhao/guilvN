package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return O0OO00.OooO00o(this);
    }

    @Override // kotlin.reflect.KProperty2
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // com.p118pd.sdk.O00Oo000
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty2
    public KProperty2.OooO00o getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
