package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return O0OO00.OooO00o(this);
    }

    @Override // kotlin.reflect.KProperty0
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // com.p118pd.sdk.O00O0000
    public Object invoke() {
        return get();
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty0
    public KProperty0.OooO00o getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
