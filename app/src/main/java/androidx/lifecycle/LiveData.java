package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.p118pd.sdk.AbstractC7199o00oOOo0;
import com.p118pd.sdk.AbstractC7202o00oOo00;
import com.p118pd.sdk.AbstractC7208o00oOoOo;
import com.p118pd.sdk.C6959o0000Oo0;
import com.p118pd.sdk.C6966o0000o0O;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    public static final int OooO0OO = -1;
    public static final Object OooO0Oo = new Object();
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6966o0000o0O<AbstractC7208o00oOoOo<? super T>, LiveData<T>.OooO0OO> f14387OooO00o = new C6966o0000o0O<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f14388OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Runnable f14389OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f14390OooO00o;
    public int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public volatile Object f14391OooO0O0 = OooO0Oo;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14392OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public volatile Object f14393OooO0OO = OooO0Oo;

    public class LifecycleBoundObserver extends LiveData<T>.OooO0OO implements AbstractC7199o00oOOo0 {
        @NonNull
        public final AbstractC7202o00oOo00 OooO00o;

        public LifecycleBoundObserver(@NonNull AbstractC7202o00oOo00 o00ooo00, AbstractC7208o00oOoOo<? super T> o00ooooo) {
            super(o00ooooo);
            this.OooO00o = o00ooo00;
        }

        @Override // androidx.lifecycle.LiveData.OooO0OO, androidx.lifecycle.LiveData.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m14672OooO00o() {
            return this.OooO00o.getLifecycle().OooO00o().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // com.p118pd.sdk.AbstractC7199o00oOOo0
        public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event) {
            if (this.OooO00o.getLifecycle().OooO00o() == Lifecycle.State.DESTROYED) {
                LiveData.this.OooO0O0((AbstractC7208o00oOoOo) ((OooO0OO) this).f14395OooO00o);
            } else {
                OooO00o(m14672OooO00o());
            }
        }

        @Override // androidx.lifecycle.LiveData.OooO0OO
        public boolean OooO00o(AbstractC7202o00oOo00 o00ooo00) {
            return this.OooO00o == o00ooo00;
        }

        @Override // androidx.lifecycle.LiveData.OooO0OO, androidx.lifecycle.LiveData.OooO0OO
        public void OooO00o() {
            this.OooO00o.getLifecycle().OooO0O0(this);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Object obj;
            synchronized (LiveData.this.f14388OooO00o) {
                obj = LiveData.this.f14393OooO0OO;
                LiveData.this.f14393OooO0OO = LiveData.OooO0Oo;
            }
            LiveData.this.OooO0O0(obj);
        }
    }

    public class OooO0O0 extends LiveData<T>.OooO0OO {
        public OooO0O0(AbstractC7208o00oOoOo<? super T> o00ooooo) {
            super(o00ooooo);
        }

        @Override // androidx.lifecycle.LiveData.OooO0OO, androidx.lifecycle.LiveData.OooO0OO
        public boolean OooO00o() {
            return true;
        }
    }

    public abstract class OooO0OO {
        public int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7208o00oOoOo<? super T> f14395OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f14396OooO00o;

        public OooO0OO(AbstractC7208o00oOoOo<? super T> o00ooooo) {
            this.f14395OooO00o = o00ooooo;
        }

        public void OooO00o() {
        }

        public void OooO00o(boolean z) {
            if (z != this.f14396OooO00o) {
                this.f14396OooO00o = z;
                int i = 1;
                boolean z2 = LiveData.this.OooO00o == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.OooO00o;
                if (!this.f14396OooO00o) {
                    i = -1;
                }
                liveData.OooO00o = i2 + i;
                if (z2 && this.f14396OooO00o) {
                    LiveData.this.m14669OooO00o();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.OooO00o == 0 && !this.f14396OooO00o) {
                    liveData2.OooO0O0();
                }
                if (this.f14396OooO00o) {
                    LiveData.this.OooO00o((LiveData<T>.OooO0OO) this);
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract boolean m14673OooO00o();

        public boolean OooO00o(AbstractC7202o00oOo00 o00ooo00) {
            return false;
        }
    }

    private void OooO0O0(LiveData<T>.OooO0OO oooO0OO) {
        if (oooO0OO.f14396OooO00o) {
            if (!oooO0OO.m14673OooO00o()) {
                oooO0OO.OooO00o(false);
                return;
            }
            int i = oooO0OO.OooO00o;
            int i2 = this.OooO0O0;
            if (i < i2) {
                oooO0OO.OooO00o = i2;
                oooO0OO.f14395OooO00o.OooO00o((Object) this.f14391OooO0O0);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m14669OooO00o() {
    }

    public void OooO00o(@Nullable LiveData<T>.OooO0OO oooO0OO) {
        if (this.f14390OooO00o) {
            this.f14392OooO0O0 = true;
            return;
        }
        this.f14390OooO00o = true;
        do {
            this.f14392OooO0O0 = false;
            if (oooO0OO == null) {
                C6966o0000o0O<K, V>.C6967OooO0Oo OooO00o2 = this.f14387OooO00o.OooO00o();
                while (OooO00o2.hasNext()) {
                    OooO0O0((LiveData<T>.OooO0OO) ((OooO0OO) ((Map.Entry) OooO00o2.next()).getValue()));
                    if (this.f14392OooO0O0) {
                        break;
                    }
                }
            } else {
                OooO0O0(oooO0OO);
                oooO0OO = null;
            }
        } while (this.f14392OooO0O0);
        this.f14390OooO00o = false;
    }

    public void OooO0O0() {
    }

    @MainThread
    public void OooO0O0(@NonNull AbstractC7208o00oOoOo<? super T> o00ooooo) {
        OooO00o("removeObserver");
        LiveData<T>.OooO0OO OooO00o2 = this.f14387OooO00o.m18154OooO00o(o00ooooo);
        if (OooO00o2 != null) {
            OooO00o2.OooO00o();
            OooO00o2.OooO00o(false);
        }
    }

    @MainThread
    public void OooO0O0(T t) {
        OooO00o("setValue");
        this.OooO0O0++;
        this.f14391OooO0O0 = t;
        OooO00o((LiveData<T>.OooO0OO) null);
    }

    @MainThread
    public void OooO00o(@NonNull AbstractC7202o00oOo00 o00ooo00, @NonNull AbstractC7208o00oOoOo<? super T> o00ooooo) {
        OooO00o("observe");
        if (o00ooo00.getLifecycle().OooO00o() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(o00ooo00, o00ooooo);
            LiveData<T>.OooO0OO OooO00o2 = this.f14387OooO00o.m18155OooO00o(o00ooooo, (LiveData<T>.OooO0OO) lifecycleBoundObserver);
            if (OooO00o2 != null && !OooO00o2.OooO00o(o00ooo00)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (OooO00o2 == null) {
                o00ooo00.getLifecycle().OooO00o(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14671OooO0O0() {
        return this.f14387OooO00o.size() > 0;
    }

    @MainThread
    public void OooO00o(@NonNull AbstractC7208o00oOoOo<? super T> o00ooooo) {
        OooO00o("observeForever");
        OooO0O0 oooO0O0 = new OooO0O0(o00ooooo);
        LiveData<T>.OooO0OO OooO00o2 = this.f14387OooO00o.m18155OooO00o(o00ooooo, (LiveData<T>.OooO0OO) oooO0O0);
        if (OooO00o2 != null && (OooO00o2 instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (OooO00o2 == null) {
            oooO0O0.OooO00o(true);
        }
    }

    @MainThread
    public void OooO00o(@NonNull AbstractC7202o00oOo00 o00ooo00) {
        OooO00o("removeObservers");
        Iterator<Map.Entry<AbstractC7208o00oOoOo<? super T>, LiveData<T>.OooO0OO>> it = this.f14387OooO00o.iterator();
        while (it.hasNext()) {
            Map.Entry<AbstractC7208o00oOoOo<? super T>, LiveData<T>.OooO0OO> next = it.next();
            if (next.getValue().OooO00o(o00ooo00)) {
                OooO0O0((AbstractC7208o00oOoOo) next.getKey());
            }
        }
    }

    public void OooO00o(T t) {
        boolean z;
        synchronized (this.f14388OooO00o) {
            z = this.f14393OooO0OO == OooO0Oo;
            this.f14393OooO0OO = t;
        }
        if (z) {
            C6959o0000Oo0.OooO00o().OooO0OO(this.f14389OooO00o);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m14668OooO00o() {
        T t = (T) this.f14391OooO0O0;
        if (t != OooO0Oo) {
            return t;
        }
        return null;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14670OooO00o() {
        return this.OooO00o > 0;
    }

    public static void OooO00o(String str) {
        if (!C6959o0000Oo0.OooO00o().m18149OooO00o()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }
}
