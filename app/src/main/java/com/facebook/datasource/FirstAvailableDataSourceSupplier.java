package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.p118pd.sdk.C8412oOoo0OoO;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class FirstAvailableDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    public final List<Supplier<DataSource<T>>> mDataSourceSuppliers;

    @ThreadSafe
    public class FirstAvailableDataSource extends AbstractDataSource<T> {
        public DataSource<T> mCurrentDataSource = null;
        public DataSource<T> mDataSourceWithResult = null;
        public int mIndex = 0;

        public class InternalDataSubscriber implements DataSubscriber<T> {
            public InternalDataSubscriber() {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                FirstAvailableDataSource.this.onDataSourceFailed(dataSource);
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    FirstAvailableDataSource.this.onDataSourceNewResult(dataSource);
                } else if (dataSource.isFinished()) {
                    FirstAvailableDataSource.this.onDataSourceFailed(dataSource);
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
                FirstAvailableDataSource.this.setProgress(Math.max(FirstAvailableDataSource.this.getProgress(), dataSource.getProgress()));
            }
        }

        public FirstAvailableDataSource() {
            if (!startNextDataSource()) {
                setFailure(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        private synchronized boolean clearCurrentDataSource(DataSource<T> dataSource) {
            if (!isClosed()) {
                if (dataSource == this.mCurrentDataSource) {
                    this.mCurrentDataSource = null;
                    return true;
                }
            }
            return false;
        }

        private void closeSafely(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        @Nullable
        private synchronized DataSource<T> getDataSourceWithResult() {
            return this.mDataSourceWithResult;
        }

        @Nullable
        private synchronized Supplier<DataSource<T>> getNextSupplier() {
            if (isClosed() || this.mIndex >= FirstAvailableDataSourceSupplier.this.mDataSourceSuppliers.size()) {
                return null;
            }
            List list = FirstAvailableDataSourceSupplier.this.mDataSourceSuppliers;
            int i = this.mIndex;
            this.mIndex = i + 1;
            return (Supplier) list.get(i);
        }

        private void maybeSetDataSourceWithResult(DataSource<T> dataSource, boolean z) {
            DataSource<T> dataSource2;
            synchronized (this) {
                if (dataSource == this.mCurrentDataSource) {
                    if (dataSource != this.mDataSourceWithResult) {
                        if (this.mDataSourceWithResult != null) {
                            if (!z) {
                                dataSource2 = null;
                                closeSafely(dataSource2);
                            }
                        }
                        DataSource<T> dataSource3 = this.mDataSourceWithResult;
                        this.mDataSourceWithResult = dataSource;
                        dataSource2 = dataSource3;
                        closeSafely(dataSource2);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void onDataSourceFailed(DataSource<T> dataSource) {
            if (clearCurrentDataSource(dataSource)) {
                if (dataSource != getDataSourceWithResult()) {
                    closeSafely(dataSource);
                }
                if (!startNextDataSource()) {
                    setFailure(dataSource.getFailureCause());
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void onDataSourceNewResult(DataSource<T> dataSource) {
            maybeSetDataSourceWithResult(dataSource, dataSource.isFinished());
            if (dataSource == getDataSourceWithResult()) {
                setResult(null, dataSource.isFinished());
            }
        }

        private synchronized boolean setCurrentDataSource(DataSource<T> dataSource) {
            if (isClosed()) {
                return false;
            }
            this.mCurrentDataSource = dataSource;
            return true;
        }

        private boolean startNextDataSource() {
            Supplier<DataSource<T>> nextSupplier = getNextSupplier();
            DataSource<T> dataSource = nextSupplier != null ? nextSupplier.get() : null;
            if (!setCurrentDataSource(dataSource) || dataSource == null) {
                closeSafely(dataSource);
                return false;
            }
            dataSource.subscribe(new InternalDataSubscriber(), CallerThreadExecutor.getInstance());
            return true;
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.mCurrentDataSource;
                this.mCurrentDataSource = null;
                DataSource<T> dataSource2 = this.mDataSourceWithResult;
                this.mDataSourceWithResult = null;
                closeSafely(dataSource2);
                closeSafely(dataSource);
                return true;
            }
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        @Nullable
        public synchronized T getResult() {
            DataSource<T> dataSourceWithResult;
            dataSourceWithResult = getDataSourceWithResult();
            return dataSourceWithResult != null ? dataSourceWithResult.getResult() : null;
        }

        @Override // com.facebook.datasource.DataSource, com.facebook.datasource.AbstractDataSource
        public synchronized boolean hasResult() {
            DataSource<T> dataSourceWithResult;
            dataSourceWithResult = getDataSourceWithResult();
            return dataSourceWithResult != null && dataSourceWithResult.hasResult();
        }
    }

    public FirstAvailableDataSourceSupplier(List<Supplier<DataSource<T>>> list) {
        Preconditions.checkArgument(!list.isEmpty(), "List of suppliers is empty!");
        this.mDataSourceSuppliers = list;
    }

    public static <T> FirstAvailableDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> list) {
        return new FirstAvailableDataSourceSupplier<>(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirstAvailableDataSourceSupplier)) {
            return false;
        }
        return Objects.equal(this.mDataSourceSuppliers, ((FirstAvailableDataSourceSupplier) obj).mDataSourceSuppliers);
    }

    public int hashCode() {
        return this.mDataSourceSuppliers.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add(C8412oOoo0OoO.OooO0OO, this.mDataSourceSuppliers).toString();
    }

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
        return new FirstAvailableDataSource();
    }
}
