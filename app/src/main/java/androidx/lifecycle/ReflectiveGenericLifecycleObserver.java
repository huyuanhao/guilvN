package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.p118pd.sdk.AbstractC7199o00oOOo0;
import com.p118pd.sdk.AbstractC7202o00oOo00;
import com.p118pd.sdk.C7194o00oOO;

public class ReflectiveGenericLifecycleObserver implements AbstractC7199o00oOOo0 {
    public final C7194o00oOO.OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f14397OooO00o;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f14397OooO00o = obj;
        this.OooO00o = C7194o00oOO.f19685OooO00o.m18685OooO00o((Class) obj.getClass());
    }

    @Override // com.p118pd.sdk.AbstractC7199o00oOOo0
    public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event) {
        this.OooO00o.OooO00o(o00ooo00, event, this.f14397OooO00o);
    }
}
