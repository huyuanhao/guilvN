package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5477Il11;
import java.io.Serializable;

/* renamed from: rx.internal.operators.NotificationLite */
public final class NotificationLite {
    public static final Object OooO00o = new Serializable() {
        /* class p293rx.internal.operators.NotificationLite.C48811 */
        public static final long serialVersionUID = 1;

        public String toString() {
            return "Notification=>Completed";
        }
    };
    public static final Object OooO0O0 = new Serializable() {
        /* class p293rx.internal.operators.NotificationLite.C48822 */
        public static final long serialVersionUID = 2;

        public String toString() {
            return "Notification=>NULL";
        }
    };

    /* renamed from: rx.internal.operators.NotificationLite$OnErrorSentinel */
    public static final class OnErrorSentinel implements Serializable {
        public static final long serialVersionUID = 3;

        /* renamed from: e */
        public final Throwable f13521e;

        public OnErrorSentinel(Throwable th) {
            this.f13521e = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f13521e;
        }
    }

    public static Object OooO00o() {
        return OooO00o;
    }

    public static <T> Object OooO0O0(T t) {
        return t == null ? OooO0O0 : t;
    }

    public static boolean OooO0OO(Object obj) {
        return obj != null && !m23000OooO0O0(obj) && !m22999OooO00o(obj);
    }

    public static boolean OooO0Oo(Object obj) {
        return obj == OooO0O0;
    }

    public static Object OooO00o(Throwable th) {
        return new OnErrorSentinel(th);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m23000OooO0O0(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    public static <T> boolean OooO00o(AbstractC5477Il11<? super T> r4, Object obj) {
        if (obj == OooO00o) {
            r4.onCompleted();
            return true;
        } else if (obj == OooO0O0) {
            r4.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == OnErrorSentinel.class) {
            r4.onError(((OnErrorSentinel) obj).f13521e);
            return true;
        } else {
            r4.onNext(obj);
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m22999OooO00o(Object obj) {
        return obj == OooO00o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T OooO00o(Object obj) {
        if (obj == OooO0O0) {
            return null;
        }
        return obj;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Throwable m22998OooO00o(Object obj) {
        return ((OnErrorSentinel) obj).f13521e;
    }
}
