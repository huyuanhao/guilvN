package p293rx.internal.subscriptions;

import com.p118pd.sdk.AbstractC6505lILLLII;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LlIiLii;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.subscriptions.CancellableSubscription */
public final class CancellableSubscription extends AtomicReference<AbstractC6505lILLLII> implements LlIiLii {
    public static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(AbstractC6505lILLLII lilllii) {
        super(lilllii);
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return get() == null;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        AbstractC6505lILLLII lilllii;
        if (get() != null && (lilllii = (AbstractC6505lILLLII) getAndSet(null)) != null) {
            try {
                lilllii.cancel();
            } catch (Exception e) {
                IIl11.m15447OooO00o((Throwable) e);
                C9714lli.m21756OooO00o((Throwable) e);
            }
        }
    }
}
