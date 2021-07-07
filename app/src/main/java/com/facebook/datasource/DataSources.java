package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class DataSources {

    public static class ValueHolder<T> {
        @Nullable
        public T value;

        public ValueHolder() {
            this.value = null;
        }
    }

    public static <T> Supplier<DataSource<T>> getFailedDataSourceSupplier(final Throwable th) {
        return new Supplier<DataSource<T>>() {
            /* class com.facebook.datasource.DataSources.C04751 */

            @Override // com.facebook.common.internal.Supplier
            public DataSource<T> get() {
                return DataSources.immediateFailedDataSource(th);
            }
        };
    }

    public static <T> DataSource<T> immediateDataSource(T t) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setResult(t);
        return create;
    }

    public static <T> DataSource<T> immediateFailedDataSource(Throwable th) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setFailure(th);
        return create;
    }

    @Nullable
    public static <T> T waitForFinalResult(DataSource<T> dataSource) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ValueHolder valueHolder = new ValueHolder();
        final ValueHolder valueHolder2 = new ValueHolder();
        dataSource.subscribe(new DataSubscriber<T>() {
            /* class com.facebook.datasource.DataSources.C04762 */

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
                countDownLatch.countDown();
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                try {
                    valueHolder2.value = (T) dataSource.getFailureCause();
                } finally {
                    countDownLatch.countDown();
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.isFinished()) {
                    try {
                        valueHolder.value = dataSource.getResult();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
            }
        }, new Executor() {
            /* class com.facebook.datasource.DataSources.ExecutorC04773 */

            public void execute(Runnable runnable) {
                runnable.run();
            }
        });
        countDownLatch.await();
        T t = valueHolder2.value;
        if (t == null) {
            return valueHolder.value;
        }
        throw t;
    }
}
