package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import com.p118pd.sdk.AbstractC7197o00oOOOo;
import com.p118pd.sdk.AbstractC7199o00oOOo0;
import com.p118pd.sdk.AbstractC7202o00oOo00;
import com.p118pd.sdk.C7205o00oOoO;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CompositeGeneratedAdaptersObserver implements AbstractC7199o00oOOo0 {
    public final AbstractC7197o00oOOOo[] OooO00o;

    public CompositeGeneratedAdaptersObserver(AbstractC7197o00oOOOo[] o00oooooArr) {
        this.OooO00o = o00oooooArr;
    }

    @Override // com.p118pd.sdk.AbstractC7199o00oOOo0
    public void OooO00o(AbstractC7202o00oOo00 o00ooo00, Lifecycle.Event event) {
        C7205o00oOoO o00oooo = new C7205o00oOoO();
        for (AbstractC7197o00oOOOo o00ooooo : this.OooO00o) {
            o00ooooo.OooO00o(o00ooo00, event, false, o00oooo);
        }
        for (AbstractC7197o00oOOOo o00ooooo2 : this.OooO00o) {
            o00ooooo2.OooO00o(o00ooo00, event, true, o00oooo);
        }
    }
}
