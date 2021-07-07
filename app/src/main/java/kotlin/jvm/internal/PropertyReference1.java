package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return O0OO00.OooO00o(this);
    }

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    @Override // com.p118pd.sdk.O00O0OOO
    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty, kotlin.reflect.KProperty1
    public KProperty1.OooO00o getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }
}
