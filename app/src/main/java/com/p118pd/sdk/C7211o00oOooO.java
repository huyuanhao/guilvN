package com.p118pd.sdk;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.pd.sdk.o00oOooO  reason: case insensitive filesystem */
public class C7211o00oOooO extends Lifecycle {
    public static final String OooO00o = "LifecycleRegistry";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19706OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Lifecycle.State f19707OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6965o0000o0<AbstractC7200o00oOOoO, OooO0O0> f19708OooO00o = new C6965o0000o0<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final WeakReference<AbstractC7202o00oOo00> f19709OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<Lifecycle.State> f19710OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19711OooO00o = false;
    public boolean OooO0O0 = false;

    /* renamed from: com.pd.sdk.o00oOooO$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7211o00oOooO.OooO00o.<clinit>():void");
        }
    }

    /* renamed from: com.pd.sdk.o00oOooO$OooO0O0 */
    public static class OooO0O0 {
        public Lifecycle.State OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7199o00oOOo0 f19712OooO00o;

        public OooO0O0(AbstractC7200o00oOOoO o00ooooo, Lifecycle.State state) {
            this.f19712OooO00o = C7204o00oOo0o.OooO00o(o00ooooo);
            this.OooO00o = state;
        }

        public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event) {
            Lifecycle.State OooO00o2 = C7211o00oOooO.OooO00o(event);
            this.OooO00o = C7211o00oOooO.OooO00o(this.OooO00o, OooO00o2);
            this.f19712OooO00o.OooO00o(o00ooo00, event);
            this.OooO00o = OooO00o2;
        }
    }

    public C7211o00oOooO(@NonNull AbstractC7202o00oOo00 o00ooo00) {
        this.f19709OooO00o = new WeakReference<>(o00ooo00);
        this.f19707OooO00o = Lifecycle.State.INITIALIZED;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m18700OooO0O0(Lifecycle.State state) {
        if (this.f19707OooO00o != state) {
            this.f19707OooO00o = state;
            if (this.f19711OooO00o || this.f19706OooO00o != 0) {
                this.OooO0O0 = true;
                return;
            }
            this.f19711OooO00o = true;
            OooO0O0();
            this.f19711OooO00o = false;
        }
    }

    private void OooO0OO(Lifecycle.State state) {
        this.f19710OooO00o.add(state);
    }

    @MainThread
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18704OooO00o(@NonNull Lifecycle.State state) {
        m18700OooO0O0(state);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18703OooO00o(@NonNull Lifecycle.Event event) {
        m18700OooO0O0(OooO00o(event));
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18699OooO00o() {
        if (this.f19708OooO00o.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.f19708OooO00o.m18157OooO00o().getValue().OooO00o;
        Lifecycle.State state2 = this.f19708OooO00o.OooO0O0().getValue().OooO00o;
        if (state == state2 && this.f19707OooO00o == state2) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.Lifecycle
    private Lifecycle.State OooO00o(AbstractC7200o00oOOoO o00ooooo) {
        Map.Entry<AbstractC7200o00oOOoO, OooO0O0> OooO00o2 = this.f19708OooO00o.m18153OooO00o(o00ooooo);
        Lifecycle.State state = null;
        Lifecycle.State state2 = OooO00o2 != null ? OooO00o2.getValue().OooO00o : null;
        if (!this.f19710OooO00o.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f19710OooO00o;
            state = arrayList.get(arrayList.size() - 1);
        }
        return OooO00o(OooO00o(this.f19707OooO00o, state2), state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void OooO0O0(@NonNull AbstractC7200o00oOOoO o00ooooo) {
        this.f19708OooO00o.m18152OooO00o(o00ooooo);
    }

    public static Lifecycle.Event OooO0O0(Lifecycle.State state) {
        int i = OooO00o.OooO0O0[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Lifecycle.Event.ON_START;
            }
            if (i == 3) {
                return Lifecycle.Event.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
        }
        return Lifecycle.Event.ON_CREATE;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18705OooO00o(@NonNull AbstractC7200o00oOOoO o00ooooo) {
        AbstractC7202o00oOo00 o00ooo00;
        Lifecycle.State state = this.f19707OooO00o;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        OooO0O0 oooO0O0 = new OooO0O0(o00ooooo, state2);
        if (this.f19708OooO00o.OooO00o(o00ooooo, oooO0O0) == null && (o00ooo00 = this.f19709OooO00o.get()) != null) {
            boolean z = this.f19706OooO00o != 0 || this.f19711OooO00o;
            Lifecycle.State OooO00o2 = OooO00o(o00ooooo);
            this.f19706OooO00o++;
            while (oooO0O0.OooO00o.compareTo((Enum) OooO00o2) < 0 && this.f19708OooO00o.contains(o00ooooo)) {
                OooO0OO(oooO0O0.OooO00o);
                oooO0O0.OooO00o(o00ooo00, OooO0O0(oooO0O0.OooO00o));
                OooO00o();
                OooO00o2 = OooO00o(o00ooooo);
            }
            if (!z) {
                OooO0O0();
            }
            this.f19706OooO00o--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: com.pd.sdk.o0000o0<com.pd.sdk.o00oOOoO, com.pd.sdk.o00oOooO$OooO0O0> */
    /* JADX WARN: Multi-variable type inference failed */
    private void OooO0O0(AbstractC7202o00oOo00 o00ooo00) {
        C6966o0000o0O<K, V>.C6967OooO0Oo OooO00o2 = this.f19708OooO00o.OooO00o();
        while (OooO00o2.hasNext() && !this.OooO0O0) {
            Map.Entry entry = (Map.Entry) OooO00o2.next();
            OooO0O0 oooO0O0 = (OooO0O0) entry.getValue();
            while (oooO0O0.OooO00o.compareTo((Enum) this.f19707OooO00o) < 0 && !this.OooO0O0 && this.f19708OooO00o.contains(entry.getKey())) {
                OooO0OO(oooO0O0.OooO00o);
                oooO0O0.OooO00o(o00ooo00, OooO0O0(oooO0O0.OooO00o));
                OooO00o();
            }
        }
    }

    private void OooO0O0() {
        AbstractC7202o00oOo00 o00ooo00 = this.f19709OooO00o.get();
        if (o00ooo00 != null) {
            while (!m18699OooO00o()) {
                this.OooO0O0 = false;
                if (this.f19707OooO00o.compareTo((Enum) this.f19708OooO00o.m18157OooO00o().getValue().OooO00o) < 0) {
                    OooO00o(o00ooo00);
                }
                Map.Entry<AbstractC7200o00oOOoO, OooO0O0> OooO0O02 = this.f19708OooO00o.OooO0O0();
                if (!this.OooO0O0 && OooO0O02 != null && this.f19707OooO00o.compareTo((Enum) OooO0O02.getValue().OooO00o) > 0) {
                    OooO0O0(o00ooo00);
                }
            }
            this.OooO0O0 = false;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    private void OooO00o() {
        ArrayList<Lifecycle.State> arrayList = this.f19710OooO00o;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18701OooO00o() {
        return this.f19708OooO00o.size();
    }

    @Override // androidx.lifecycle.Lifecycle
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Lifecycle.State m18702OooO00o() {
        return this.f19707OooO00o;
    }

    public static Lifecycle.State OooO00o(Lifecycle.Event event) {
        switch (OooO00o.OooO00o[event.ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case 6:
                return Lifecycle.State.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    public static Lifecycle.Event OooO00o(Lifecycle.State state) {
        int i = OooO00o.OooO0O0[state.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return Lifecycle.Event.ON_DESTROY;
        } else {
            if (i == 3) {
                return Lifecycle.Event.ON_STOP;
            }
            if (i == 4) {
                return Lifecycle.Event.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
            throw new IllegalArgumentException();
        }
    }

    private void OooO00o(AbstractC7202o00oOo00 o00ooo00) {
        Iterator<Map.Entry<AbstractC7200o00oOOoO, OooO0O0>> OooO00o2 = this.f19708OooO00o.m18156OooO00o();
        while (OooO00o2.hasNext() && !this.OooO0O0) {
            Map.Entry<AbstractC7200o00oOOoO, OooO0O0> next = OooO00o2.next();
            OooO0O0 value = next.getValue();
            while (value.OooO00o.compareTo((Enum) this.f19707OooO00o) > 0 && !this.OooO0O0 && this.f19708OooO00o.contains(next.getKey())) {
                Lifecycle.Event OooO00o3 = OooO00o(value.OooO00o);
                OooO0OO(OooO00o(OooO00o3));
                value.OooO00o(o00ooo00, OooO00o3);
                OooO00o();
            }
        }
    }

    public static Lifecycle.State OooO00o(@NonNull Lifecycle.State state, @Nullable Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }
}
