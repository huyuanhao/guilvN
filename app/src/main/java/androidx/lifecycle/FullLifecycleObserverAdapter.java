package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.p118pd.sdk.AbstractC7196o00oOOOO;
import com.p118pd.sdk.AbstractC7199o00oOOo0;
import com.p118pd.sdk.AbstractC7202o00oOo00;

public class FullLifecycleObserverAdapter implements AbstractC7199o00oOOo0 {
    public final AbstractC7196o00oOOOO OooO00o;

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.OooO00o.<clinit>():void");
        }
    }

    public FullLifecycleObserverAdapter(AbstractC7196o00oOOOO o00ooooo) {
        this.OooO00o = o00ooooo;
    }

    @Override // com.p118pd.sdk.AbstractC7199o00oOOo0
    public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event) {
        switch (OooO00o.OooO00o[event.ordinal()]) {
            case 1:
                this.OooO00o.OooO0o(o00ooo00);
                return;
            case 2:
                this.OooO00o.OooO00o(o00ooo00);
                return;
            case 3:
                this.OooO00o.OooO0o0(o00ooo00);
                return;
            case 4:
                this.OooO00o.OooO0OO(o00ooo00);
                return;
            case 5:
                this.OooO00o.OooO0Oo(o00ooo00);
                return;
            case 6:
                this.OooO00o.OooO0O0(o00ooo00);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
