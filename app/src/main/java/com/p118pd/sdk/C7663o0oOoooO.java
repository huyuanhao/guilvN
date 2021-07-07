package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC7661o0oOooo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oOoooO  reason: case insensitive filesystem */
public class C7663o0oOoooO {
    public static final AbstractC7661o0oOooo.OooO00o<?> OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<Class<?>, AbstractC7661o0oOooo.OooO00o<?>> f20541OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.o0oOoooO$OooO00o */
    public class OooO00o implements AbstractC7661o0oOooo.OooO00o<Object> {
        @Override // com.p118pd.sdk.AbstractC7661o0oOooo.OooO00o
        @NonNull
        public AbstractC7661o0oOooo<Object> OooO00o(@NonNull Object obj) {
            return new OooO0O0(obj);
        }

        @Override // com.p118pd.sdk.AbstractC7661o0oOooo.OooO00o
        @NonNull
        public Class<Object> OooO00o() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.pd.sdk.o0oOoooO$OooO0O0 */
    public static final class OooO0O0 implements AbstractC7661o0oOooo<Object> {
        public final Object OooO00o;

        public OooO0O0(@NonNull Object obj) {
            this.OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC7661o0oOooo, com.p118pd.sdk.AbstractC7661o0oOooo
        @NonNull
        public Object OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7661o0oOooo, com.p118pd.sdk.AbstractC7661o0oOooo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19299OooO00o() {
        }
    }

    public synchronized void OooO00o(@NonNull AbstractC7661o0oOooo.OooO00o<?> oooO00o) {
        this.f20541OooO00o.put(oooO00o.OooO00o(), oooO00o);
    }

    @NonNull
    public synchronized <T> AbstractC7661o0oOooo<T> OooO00o(@NonNull T t) {
        AbstractC7661o0oOooo.OooO00o<?> oooO00o;
        C7842oO0O0.OooO00o((Object) t);
        oooO00o = this.f20541OooO00o.get(t.getClass());
        if (oooO00o == null) {
            Iterator<AbstractC7661o0oOooo.OooO00o<?>> it = this.f20541OooO00o.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC7661o0oOooo.OooO00o<?> next = it.next();
                if (next.OooO00o().isAssignableFrom(t.getClass())) {
                    oooO00o = next;
                    break;
                }
            }
        }
        if (oooO00o == null) {
            oooO00o = OooO00o;
        }
        return (AbstractC7661o0oOooo<T>) oooO00o.OooO00o(t);
    }
}
