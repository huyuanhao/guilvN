package com.facebook.imagepipeline.datasource;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class CloseableProducerToDataSourceAdapter<T> extends AbstractProducerToDataSourceAdapter<CloseableReference<T>> {
    public CloseableProducerToDataSourceAdapter(Producer<CloseableReference<T>> producer, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        super(producer, settableProducerContext, requestListener);
    }

    public static <T> DataSource<CloseableReference<T>> create(Producer<CloseableReference<T>> producer, SettableProducerContext settableProducerContext, RequestListener requestListener) {
        return new CloseableProducerToDataSourceAdapter(producer, settableProducerContext, requestListener);
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public /* bridge */ /* synthetic */ void closeResult(Object obj) {
        closeResult((CloseableReference) ((CloseableReference) obj));
    }

    @Override // com.facebook.imagepipeline.datasource.AbstractProducerToDataSourceAdapter
    public /* bridge */ /* synthetic */ void onNewResultImpl(Object obj, int i) {
        onNewResultImpl((CloseableReference) ((CloseableReference) obj), i);
    }

    public void closeResult(CloseableReference<T> closeableReference) {
        CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
    }

    @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
    @Nullable
    public CloseableReference<T> getResult() {
        return CloseableReference.cloneOrNull((CloseableReference) super.getResult());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.facebook.imagepipeline.datasource.CloseableProducerToDataSourceAdapter<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void onNewResultImpl(CloseableReference<T> closeableReference, int i) {
        super.onNewResultImpl((Object) CloseableReference.cloneOrNull(closeableReference), i);
    }
}
