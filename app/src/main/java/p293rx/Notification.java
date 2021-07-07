package p293rx;

import com.p118pd.sdk.AbstractC5477Il11;

/* renamed from: rx.Notification */
public final class Notification<T> {
    public static final Notification<Void> OooO00o = new Notification<>(Kind.OnCompleted, null, null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f24011OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Throwable f24012OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Kind f24013OooO00o;

    /* renamed from: rx.Notification$Kind */
    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    public Notification(Kind kind, T t, Throwable th) {
        this.f24011OooO00o = t;
        this.f24012OooO00o = th;
        this.f24013OooO00o = kind;
    }

    public static <T> Notification<T> OooO00o(T t) {
        return new Notification<>(Kind.OnNext, t, null);
    }

    public boolean OooO0O0() {
        return OooO0o0() && this.f24011OooO00o != null;
    }

    public boolean OooO0OO() {
        return m22992OooO00o() == Kind.OnCompleted;
    }

    public boolean OooO0Oo() {
        return m22992OooO00o() == Kind.OnError;
    }

    public boolean OooO0o0() {
        return m22992OooO00o() == Kind.OnNext;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != Notification.class) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (notification.m22992OooO00o() != m22992OooO00o()) {
            return false;
        }
        T t = this.f24011OooO00o;
        T t2 = notification.f24011OooO00o;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f24012OooO00o;
        Throwable th2 = notification.f24012OooO00o;
        if (th == th2 || (th != null && th.equals(th2))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = m22992OooO00o().hashCode();
        if (OooO0O0()) {
            hashCode = (hashCode * 31) + m22990OooO00o().hashCode();
        }
        return m22993OooO00o() ? (hashCode * 31) + m22991OooO00o().hashCode() : hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(m22992OooO00o());
        if (OooO0O0()) {
            sb.append(' ');
            sb.append((Object) m22990OooO00o());
        }
        if (m22993OooO00o()) {
            sb.append(' ');
            sb.append(m22991OooO00o().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> Notification<T> OooO00o(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    public static <T> Notification<T> OooO00o() {
        return (Notification<T>) OooO00o;
    }

    @Deprecated
    public static <T> Notification<T> OooO00o(Class<T> cls) {
        return (Notification<T>) OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m22991OooO00o() {
        return this.f24012OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m22990OooO00o() {
        return this.f24011OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m22993OooO00o() {
        return OooO0Oo() && this.f24012OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Kind m22992OooO00o() {
        return this.f24013OooO00o;
    }

    public void OooO00o(AbstractC5477Il11<? super T> r3) {
        Kind kind = this.f24013OooO00o;
        if (kind == Kind.OnNext) {
            r3.onNext(m22990OooO00o());
        } else if (kind == Kind.OnCompleted) {
            r3.onCompleted();
        } else {
            r3.onError(m22991OooO00o());
        }
    }
}
