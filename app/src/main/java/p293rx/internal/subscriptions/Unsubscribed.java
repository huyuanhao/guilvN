package p293rx.internal.subscriptions;

import com.p118pd.sdk.LlIiLii;

/* renamed from: rx.internal.subscriptions.Unsubscribed */
public enum Unsubscribed implements LlIiLii {
    INSTANCE;

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return true;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
    }
}
