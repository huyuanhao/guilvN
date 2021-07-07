package p293rx.internal.subscriptions;

import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.LlIiLii;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.subscriptions.SequentialSubscription */
public final class SequentialSubscription extends AtomicReference<LlIiLii> implements LlIiLii {
    public static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
    }

    public LlIiLii current() {
        LlIiLii llIiLii = (LlIiLii) super.get();
        return llIiLii == Unsubscribed.INSTANCE ? C9638ill.OooO0O0() : llIiLii;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return get() == Unsubscribed.INSTANCE;
    }

    public boolean replace(LlIiLii llIiLii) {
        LlIiLii llIiLii2;
        do {
            llIiLii2 = (LlIiLii) get();
            if (llIiLii2 == Unsubscribed.INSTANCE) {
                if (llIiLii == null) {
                    return false;
                }
                llIiLii.unsubscribe();
                return false;
            }
        } while (!compareAndSet(llIiLii2, llIiLii));
        return true;
    }

    public boolean replaceWeak(LlIiLii llIiLii) {
        LlIiLii llIiLii2 = (LlIiLii) get();
        if (llIiLii2 == Unsubscribed.INSTANCE) {
            if (llIiLii != null) {
                llIiLii.unsubscribe();
            }
            return false;
        } else if (compareAndSet(llIiLii2, llIiLii) || ((LlIiLii) get()) != Unsubscribed.INSTANCE) {
            return true;
        } else {
            if (llIiLii != null) {
                llIiLii.unsubscribe();
            }
            return false;
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        LlIiLii llIiLii;
        LlIiLii llIiLii2 = (LlIiLii) get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (llIiLii2 != unsubscribed && (llIiLii = (LlIiLii) getAndSet(unsubscribed)) != null && llIiLii != Unsubscribed.INSTANCE) {
            llIiLii.unsubscribe();
        }
    }

    public boolean update(LlIiLii llIiLii) {
        LlIiLii llIiLii2;
        do {
            llIiLii2 = (LlIiLii) get();
            if (llIiLii2 == Unsubscribed.INSTANCE) {
                if (llIiLii == null) {
                    return false;
                }
                llIiLii.unsubscribe();
                return false;
            }
        } while (!compareAndSet(llIiLii2, llIiLii));
        if (llIiLii2 == null) {
            return true;
        }
        llIiLii2.unsubscribe();
        return true;
    }

    public boolean updateWeak(LlIiLii llIiLii) {
        LlIiLii llIiLii2 = (LlIiLii) get();
        if (llIiLii2 == Unsubscribed.INSTANCE) {
            if (llIiLii != null) {
                llIiLii.unsubscribe();
            }
            return false;
        } else if (compareAndSet(llIiLii2, llIiLii)) {
            return true;
        } else {
            LlIiLii llIiLii3 = (LlIiLii) get();
            if (llIiLii != null) {
                llIiLii.unsubscribe();
            }
            if (llIiLii3 == Unsubscribed.INSTANCE) {
                return true;
            }
            return false;
        }
    }

    public SequentialSubscription(LlIiLii llIiLii) {
        lazySet(llIiLii);
    }
}
