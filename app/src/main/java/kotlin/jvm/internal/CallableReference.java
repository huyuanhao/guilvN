package kotlin.jvm.internal;

import com.p118pd.sdk.AbstractC8704oo0o0O0O;
import com.p118pd.sdk.OO0O0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;

public abstract class CallableReference implements KCallable, Serializable {
    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = NoReceiver.OooO00o;
    public transient KCallable OooO00o;
    @SinceKotlin(version = "1.1")
    public final Object receiver;

    @SinceKotlin(version = "1.2")
    public static class NoReceiver implements Serializable {
        public static final NoReceiver OooO00o = new NoReceiver();

        private Object readResolve() throws ObjectStreamException {
            return OooO00o;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.KCallable
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.KCallable
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @SinceKotlin(version = "1.1")
    public KCallable compute() {
        KCallable oo00ooo0 = this.OooO00o;
        if (oo00ooo0 != null) {
            return oo00ooo0;
        }
        KCallable computeReflected = computeReflected();
        this.OooO00o = computeReflected;
        return computeReflected;
    }

    public abstract KCallable computeReflected();

    @Override // com.p118pd.sdk.Oo00oOo
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        throw new AbstractMethodError();
    }

    public OO0O0 getOwner() {
        throw new AbstractMethodError();
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @SinceKotlin(version = "1.1")
    public KCallable getReflected() {
        KCallable compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public List<AbstractC8704oo0o0O0O> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.KCallable
    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @SinceKotlin(version = "1.1")
    public CallableReference(Object obj) {
        this.receiver = obj;
    }
}
