package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOO00O0 */
public abstract class oOOO00O0 implements AbstractC8210oOOoO0o0 {
    public final AbstractC8210oOOoO0o0 delegate;

    public oOOO00O0(AbstractC8210oOOoO0o0 ooooo0o0) {
        if (ooooo0o0 != null) {
            this.delegate = ooooo0o0;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final AbstractC8210oOOoO0o0 delegate() {
        return this.delegate;
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public C9193oooOoo timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + C3848l.f10401s + this.delegate.toString() + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public void write(OOOO000 oooo000, long j) throws IOException {
        this.delegate.write(oooo000, j);
    }
}
