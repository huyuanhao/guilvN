package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LiL丨丨i  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9508LiLi<T> implements AbstractC5477Il11<T>, LlIiLii {
    public static final long NOT_SET = Long.MIN_VALUE;
    public AbstractC9465L1l1 producer;
    public long requested;
    public final AbstractC9508LiLi<?> subscriber;
    public final C9862ll subscriptions;

    public AbstractC9508LiLi() {
        this(null, false);
    }

    private void addToRequested(long j) {
        long j2 = this.requested;
        if (j2 == Long.MIN_VALUE) {
            this.requested = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j3;
        }
    }

    public final void add(LlIiLii llIiLii) {
        this.subscriptions.OooO00o(llIiLii);
    }

    @Override // com.p118pd.sdk.LlIiLii
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    public final void request(long j) {
        if (j >= 0) {
            synchronized (this) {
                if (this.producer != null) {
                    this.producer.request(j);
                    return;
                }
                addToRequested(j);
                return;
            }
        }
        throw new IllegalArgumentException("number requested cannot be negative: " + j);
    }

    public void setProducer(AbstractC9465L1l1 r5) {
        long j;
        boolean z;
        synchronized (this) {
            j = this.requested;
            this.producer = r5;
            z = this.subscriber != null && j == Long.MIN_VALUE;
        }
        if (z) {
            this.subscriber.setProducer(this.producer);
        } else if (j == Long.MIN_VALUE) {
            this.producer.request(Long.MAX_VALUE);
        } else {
            this.producer.request(j);
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    public AbstractC9508LiLi(AbstractC9508LiLi<?> r2) {
        this(r2, true);
    }

    public AbstractC9508LiLi(AbstractC9508LiLi<?> r3, boolean z) {
        this.requested = Long.MIN_VALUE;
        this.subscriber = r3;
        this.subscriptions = (!z || r3 == null) ? new C9862ll() : r3.subscriptions;
    }
}
