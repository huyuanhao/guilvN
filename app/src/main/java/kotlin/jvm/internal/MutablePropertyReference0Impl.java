package kotlin.jvm.internal;

import com.p118pd.sdk.OO0O0;

public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public final String name;
    public final OO0O0 owner;
    public final String signature;

    public MutablePropertyReference0Impl(OO0O0 oo0o0, String str, String str2) {
        this.owner = oo0o0;
        this.name = str;
        this.signature = str2;
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public OO0O0 getOwner() {
        return this.owner;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        getSetter().call(obj);
    }
}
