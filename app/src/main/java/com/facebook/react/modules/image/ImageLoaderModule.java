package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;

@ReactModule(name = ImageLoaderModule.NAME)
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    public static final String ERROR_INVALID_URI = "E_INVALID_URI";
    public static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    public final Object mCallerContext;
    public final Object mEnqueuedRequestMonitor;
    public final SparseArray<DataSource<Void>> mEnqueuedRequests;

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    private void registerRequest(int i, DataSource<Void> dataSource) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, dataSource);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Nullable
    private DataSource<Void> removeRequest(int i) {
        DataSource<Void> dataSource;
        synchronized (this.mEnqueuedRequestMonitor) {
            dataSource = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return dataSource;
    }

    @ReactMethod
    public void abortRequest(int i) {
        DataSource<Void> removeRequest = removeRequest(i);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSize(String str, final Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        Fresco.getImagePipeline().fetchDecodedImage(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build(), this.mCallerContext).subscribe(new BaseDataSubscriber<CloseableReference<CloseableImage>>() {
            /* class com.facebook.react.modules.image.ImageLoaderModule.C07611 */

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.getFailureCause());
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
                if (dataSource.isFinished()) {
                    CloseableReference<CloseableImage> result = dataSource.getResult();
                    if (result != null) {
                        try {
                            CloseableImage closeableImage = result.get();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt("width", closeableImage.getWidth());
                            createMap.putInt("height", closeableImage.getHeight());
                            promise.resolve(createMap);
                        } catch (Exception e) {
                            promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                        } catch (Throwable th) {
                            CloseableReference.closeSafely(result);
                            throw th;
                        }
                        CloseableReference.closeSafely(result);
                        return;
                    }
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                }
            }
        }, CallerThreadExecutor.getInstance());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                DataSource<Void> valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void prefetchImage(String str, final int i, final Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        DataSource<Void> prefetchToDiskCache = Fresco.getImagePipeline().prefetchToDiskCache(ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build(), this.mCallerContext);
        C07622 r0 = new BaseDataSubscriber<Void>() {
            /* class com.facebook.react.modules.image.ImageLoaderModule.C07622 */

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onFailureImpl(DataSource<Void> dataSource) {
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    promise.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, dataSource.getFailureCause());
                } finally {
                    dataSource.close();
                }
            }

            @Override // com.facebook.datasource.BaseDataSubscriber
            public void onNewResultImpl(DataSource<Void> dataSource) {
                if (dataSource.isFinished()) {
                    try {
                        ImageLoaderModule.this.removeRequest(i);
                        promise.resolve(true);
                    } finally {
                        dataSource.close();
                    }
                }
            }
        };
        registerRequest(i, prefetchToDiskCache);
        prefetchToDiskCache.subscribe(r0, CallerThreadExecutor.getInstance());
    }

    @ReactMethod
    public void queryCache(final ReadableArray readableArray, final Promise promise) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.image.ImageLoaderModule.AsyncTaskC07633 */

            public void doInBackgroundGuarded(Void... voidArr) {
                WritableMap createMap = Arguments.createMap();
                ImagePipeline imagePipeline = Fresco.getImagePipeline();
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    Uri parse = Uri.parse(string);
                    if (imagePipeline.isInBitmapMemoryCache(parse)) {
                        createMap.putString(string, "memory");
                    } else if (imagePipeline.isInDiskCacheSync(parse)) {
                        createMap.putString(string, "disk");
                    }
                }
                promise.resolve(createMap);
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }
}
