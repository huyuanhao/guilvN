package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6695lilIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.i11iiILl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rx.internal.operators.OnSubscribeAutoConnect */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements C9349III.OooO00o<T> {
    public final AbstractC6153iL1l<? super LlIiLii> connection;
    public final int numberOfSubscribers;
    public final i11iiILl<? extends T> source;

    public OnSubscribeAutoConnect(i11iiILl<? extends T> i11iiill, int i, AbstractC6153iL1l<? super LlIiLii> il1l) {
        if (i > 0) {
            this.source = i11iiill;
            this.numberOfSubscribers = i;
            this.connection = il1l;
            return;
        }
        throw new IllegalArgumentException("numberOfSubscribers > 0 required");
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    public void call(AbstractC9508LiLi<? super T> r2) {
        this.source.OooO0O0(C6695lilIl.OooO00o((AbstractC9508LiLi) r2));
        if (incrementAndGet() == this.numberOfSubscribers) {
            this.source.OooO0O0(this.connection);
        }
    }
}
