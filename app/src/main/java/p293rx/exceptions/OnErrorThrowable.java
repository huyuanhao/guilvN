package p293rx.exceptions;

import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.ilL1l;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rx.exceptions.OnErrorThrowable */
public final class OnErrorThrowable extends RuntimeException {
    public static final long serialVersionUID = -569558213262703934L;
    public final boolean hasValue;
    public final Object value;

    /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue */
    public static class OnNextValue extends RuntimeException {
        public static final long serialVersionUID = -3454462756050397899L;
        public final Object value;

        /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$OooO00o */
        public static final class OooO00o {
            public static final Set<Class<?>> OooO00o = OooO00o();

            public static Set<Class<?>> OooO00o() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.value = obj;
        }

        public static String renderValue(Object obj) {
            if (obj == null) {
                return "null";
            }
            if (OooO00o.OooO00o.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String OooO00o2 = ilL1l.OooO00o().m17361OooO00o().OooO00o(obj);
            if (OooO00o2 != null) {
                return OooO00o2;
            }
            return obj.getClass().getName() + ".class";
        }

        public Object getValue() {
            return this.value;
        }
    }

    public OnErrorThrowable(Throwable th) {
        super(th);
        this.hasValue = false;
        this.value = null;
    }

    public static Throwable addValueAsLastCause(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable OooO00o = IIl11.m15446OooO00o(th);
        if ((OooO00o instanceof OnNextValue) && ((OnNextValue) OooO00o).getValue() == obj) {
            return th;
        }
        IIl11.OooO00o(th, new OnNextValue(obj));
        return th;
    }

    public static OnErrorThrowable from(Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable OooO00o = IIl11.m15446OooO00o(th);
        if (OooO00o instanceof OnNextValue) {
            return new OnErrorThrowable(th, ((OnNextValue) OooO00o).getValue());
        }
        return new OnErrorThrowable(th);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isValueNull() {
        return this.hasValue;
    }

    public OnErrorThrowable(Throwable th, Object obj) {
        super(th);
        this.hasValue = true;
        if (!(obj instanceof Serializable)) {
            try {
                obj = String.valueOf(obj);
            } catch (Throwable th2) {
                obj = th2.getMessage();
            }
        }
        this.value = obj;
    }
}
