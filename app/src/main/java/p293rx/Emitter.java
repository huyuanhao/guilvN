package p293rx;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC6505lILLLII;
import com.p118pd.sdk.LlIiLii;

/* renamed from: rx.Emitter */
public interface Emitter<T> extends AbstractC5477Il11<T> {

    /* renamed from: rx.Emitter$BackpressureMode */
    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    long requested();

    void setCancellation(AbstractC6505lILLLII lilllii);

    void setSubscription(LlIiLii llIiLii);
}
