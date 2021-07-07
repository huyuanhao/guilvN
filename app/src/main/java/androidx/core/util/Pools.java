package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class Pools {

    public interface OooO00o<T> {
        @Nullable
        T acquire();

        boolean release(@NonNull T t);
    }

    public static class OooO0O0<T> extends SimplePool<T> {
        public final Object OooO00o = new Object();

        public OooO0O0(int i) {
            super(i);
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.OooO00o
        public T acquire() {
            T t;
            synchronized (this.OooO00o) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.OooO00o
        public boolean release(@NonNull T t) {
            boolean release;
            synchronized (this.OooO00o) {
                release = super.release(t);
            }
            return release;
        }
    }

    public static class SimplePool<T> implements OooO00o<T> {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object[] f14042OooO00o;

        public SimplePool(int i) {
            if (i > 0) {
                this.f14042OooO00o = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean OooO00o(@NonNull T t) {
            for (int i = 0; i < this.OooO00o; i++) {
                if (this.f14042OooO00o[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.OooO00o
        public T acquire() {
            int i = this.OooO00o;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f14042OooO00o;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.OooO00o = i - 1;
            return t;
        }

        @Override // androidx.core.util.Pools.OooO00o
        public boolean release(@NonNull T t) {
            if (!OooO00o(t)) {
                int i = this.OooO00o;
                Object[] objArr = this.f14042OooO00o;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.OooO00o = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }
}
