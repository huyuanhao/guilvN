package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class SettableDataSource<T> extends AbstractDataSource<CloseableReference<T>> {
    public static <V> SettableDataSource<V> create() {
        return new SettableDataSource<>();
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public /* bridge */ /* synthetic */ void closeResult(@Nullable Object obj) {
        closeResult((CloseableReference) ((CloseableReference) obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.facebook.imagepipeline.datasource.SettableDataSource<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean set(@Nullable CloseableReference<T> closeableReference) {
        return super.setResult(CloseableReference.cloneOrNull(closeableReference), true);
    }

    public boolean setException(Throwable th) {
        return super.setFailure(th);
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setProgress(float f) {
        return super.setProgress(f);
    }

    public void closeResult(@Nullable CloseableReference<T> closeableReference) {
        CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
    }

    @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
    @Nullable
    public CloseableReference<T> getResult() {
        return CloseableReference.cloneOrNull((CloseableReference) super.getResult());
    }
}
