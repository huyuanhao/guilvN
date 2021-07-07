package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.o0O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

public abstract class PropertyReference extends CallableReference implements KProperty {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !o0O0OO00.OooO00o(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof KProperty) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + O0OO00.f16956OooO00o;
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }
}
