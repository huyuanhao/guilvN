package kotlin.jvm.internal;

import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.o0O0O0O0;
import com.p118pd.sdk.o0O0OO00;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

public class FunctionReference extends CallableReference implements o0O0O0O0, KFunction {
    public final int arity;

    public FunctionReference(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable computeReflected() {
        return O0OO00.OooO00o(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getOwner() != null ? getOwner().equals(functionReference.getOwner()) : functionReference.getOwner() == null) {
                if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || !o0O0OO00.OooO00o(getBoundReceiver(), functionReference.getBoundReceiver())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof KFunction) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // com.p118pd.sdk.o0O0O0O0
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KFunction, kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + O0OO00.f16956OooO00o;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int i, Object obj) {
        super(obj);
        this.arity = i;
    }
}
