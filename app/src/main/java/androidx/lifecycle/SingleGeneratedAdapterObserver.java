package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import com.p118pd.sdk.AbstractC7197o00oOOOo;
import com.p118pd.sdk.AbstractC7199o00oOOo0;
import com.p118pd.sdk.AbstractC7202o00oOo00;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleGeneratedAdapterObserver implements AbstractC7199o00oOOo0 {
    public final AbstractC7197o00oOOOo OooO00o;

    public SingleGeneratedAdapterObserver(AbstractC7197o00oOOOo o00ooooo) {
        this.OooO00o = o00ooooo;
    }

    @Override // com.p118pd.sdk.AbstractC7199o00oOOo0
    public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event) {
        this.OooO00o.OooO00o(o00ooo00, event, false, null);
        this.OooO00o.OooO00o(o00ooo00, event, true, null);
    }
}
