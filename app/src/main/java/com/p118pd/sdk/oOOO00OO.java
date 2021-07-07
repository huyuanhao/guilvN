package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOO00OO */
public abstract class oOOO00OO implements AbstractC8930ooOOO0OO {
    public final AbstractC8930ooOOO0OO delegate;

    public oOOO00OO(AbstractC8930ooOOO0OO ooooo0oo) {
        if (ooooo0oo != null) {
            this.delegate = ooooo0oo;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final AbstractC8930ooOOO0OO delegate() {
        return this.delegate;
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public long read(OOOO000 oooo000, long j) throws IOException {
        return this.delegate.read(oooo000, j);
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public C9193oooOoo timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + C3848l.f10401s + this.delegate.toString() + C3848l.f10402t;
    }
}
