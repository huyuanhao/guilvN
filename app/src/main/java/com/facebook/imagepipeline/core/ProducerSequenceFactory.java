package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.WebpSupportStatus;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.DiskCacheWriteProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.RemoveImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;

public class ProducerSequenceFactory {
    @VisibleForTesting
    public Producer<EncodedImage> mBackgroundLocalFileFetchToEncodedMemorySequence;
    @VisibleForTesting
    public Producer<EncodedImage> mBackgroundNetworkFetchToEncodedMemorySequence;
    @VisibleForTesting
    public Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> mBitmapPrepareSequences = new HashMap();
    @VisibleForTesting
    public Map<Producer<CloseableReference<CloseableImage>>, Producer<Void>> mCloseableImagePrefetchSequences = new HashMap();
    public Producer<EncodedImage> mCommonNetworkFetchToEncodedMemorySequence;
    public final ContentResolver mContentResolver;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mDataFetchSequence;
    public final boolean mDiskCacheEnabled;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalAssetFetchSequence;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalContentUriFetchSequence;
    @VisibleForTesting
    public Producer<CloseableReference<PooledByteBuffer>> mLocalFileEncodedImageProducerSequence;
    @VisibleForTesting
    public Producer<Void> mLocalFileFetchToEncodedMemoryPrefetchSequence;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalImageFileFetchSequence;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalResourceFetchSequence;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mLocalVideoFileFetchSequence;
    @VisibleForTesting
    public Producer<CloseableReference<PooledByteBuffer>> mNetworkEncodedImageProducerSequence;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mNetworkFetchSequence;
    @VisibleForTesting
    public Producer<Void> mNetworkFetchToEncodedMemoryPrefetchSequence;
    public final NetworkFetcher mNetworkFetcher;
    public final boolean mPartialImageCachingEnabled;
    @VisibleForTesting
    public Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> mPostprocessorSequences = new HashMap();
    public final ProducerFactory mProducerFactory;
    @VisibleForTesting
    public Producer<CloseableReference<CloseableImage>> mQualifiedResourceFetchSequence;
    public final boolean mResizeAndRotateEnabledForNetwork;
    public final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;
    public final boolean mUseBitmapPrepareToDraw;
    public final boolean mUseDownsamplingRatio;
    public final boolean mWebpSupportEnabled;

    public ProducerSequenceFactory(ContentResolver contentResolver, ProducerFactory producerFactory, NetworkFetcher networkFetcher, boolean z, boolean z2, ThreadHandoffProducerQueue threadHandoffProducerQueue, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.mContentResolver = contentResolver;
        this.mProducerFactory = producerFactory;
        this.mNetworkFetcher = networkFetcher;
        this.mResizeAndRotateEnabledForNetwork = z;
        this.mWebpSupportEnabled = z2;
        this.mThreadHandoffProducerQueue = threadHandoffProducerQueue;
        this.mUseDownsamplingRatio = z3;
        this.mUseBitmapPrepareToDraw = z4;
        this.mPartialImageCachingEnabled = z5;
        this.mDiskCacheEnabled = z6;
    }

    private synchronized Producer<EncodedImage> getBackgroundLocalFileFetchToEncodeMemorySequence() {
        if (this.mBackgroundLocalFileFetchToEncodedMemorySequence == null) {
            this.mBackgroundLocalFileFetchToEncodedMemorySequence = this.mProducerFactory.newBackgroundThreadHandoffProducer(newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.newLocalFileFetchProducer()), this.mThreadHandoffProducerQueue);
        }
        return this.mBackgroundLocalFileFetchToEncodedMemorySequence;
    }

    private synchronized Producer<EncodedImage> getBackgroundNetworkFetchToEncodedMemorySequence() {
        if (this.mBackgroundNetworkFetchToEncodedMemorySequence == null) {
            this.mBackgroundNetworkFetchToEncodedMemorySequence = this.mProducerFactory.newBackgroundThreadHandoffProducer(getCommonNetworkFetchToEncodedMemorySequence(), this.mThreadHandoffProducerQueue);
        }
        return this.mBackgroundNetworkFetchToEncodedMemorySequence;
    }

    private Producer<CloseableReference<CloseableImage>> getBasicDecodedImageSequence(ImageRequest imageRequest) {
        Preconditions.checkNotNull(imageRequest);
        Uri sourceUri = imageRequest.getSourceUri();
        Preconditions.checkNotNull(sourceUri, "Uri is null.");
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return getNetworkFetchSequence();
        }
        switch (sourceUriType) {
            case 2:
                return getLocalVideoFileFetchSequence();
            case 3:
                return getLocalImageFileFetchSequence();
            case 4:
                if (MediaUtils.isVideo(this.mContentResolver.getType(sourceUri))) {
                    return getLocalVideoFileFetchSequence();
                }
                return getLocalContentUriFetchSequence();
            case 5:
                return getLocalAssetFetchSequence();
            case 6:
                return getLocalResourceFetchSequence();
            case 7:
                return getDataFetchSequence();
            case 8:
                return getQualifiedResourceFetchSequence();
            default:
                throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + getShortenedUriString(sourceUri));
        }
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getBitmapPrepareSequence(Producer<CloseableReference<CloseableImage>> producer) {
        Producer<CloseableReference<CloseableImage>> producer2;
        producer2 = this.mBitmapPrepareSequences.get(producer);
        if (producer2 == null) {
            producer2 = this.mProducerFactory.newBitmapPrepareProducer(producer);
            this.mBitmapPrepareSequences.put(producer, producer2);
        }
        return producer2;
    }

    private synchronized Producer<EncodedImage> getCommonNetworkFetchToEncodedMemorySequence() {
        if (this.mCommonNetworkFetchToEncodedMemorySequence == null) {
            AddImageTransformMetaDataProducer newAddImageTransformMetaDataProducer = ProducerFactory.newAddImageTransformMetaDataProducer(newEncodedCacheMultiplexToTranscodeSequence(this.mProducerFactory.newNetworkFetchProducer(this.mNetworkFetcher)));
            this.mCommonNetworkFetchToEncodedMemorySequence = newAddImageTransformMetaDataProducer;
            this.mCommonNetworkFetchToEncodedMemorySequence = this.mProducerFactory.newResizeAndRotateProducer(newAddImageTransformMetaDataProducer, this.mResizeAndRotateEnabledForNetwork, this.mUseDownsamplingRatio);
        }
        return this.mCommonNetworkFetchToEncodedMemorySequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getDataFetchSequence() {
        if (this.mDataFetchSequence == null) {
            Producer<EncodedImage> newDataFetchProducer = this.mProducerFactory.newDataFetchProducer();
            if (WebpSupportStatus.sIsWebpSupportRequired && (!this.mWebpSupportEnabled || WebpSupportStatus.sWebpBitmapFactory == null)) {
                newDataFetchProducer = this.mProducerFactory.newWebpTranscodeProducer(newDataFetchProducer);
            }
            this.mDataFetchSequence = newBitmapCacheGetToDecodeSequence(this.mProducerFactory.newResizeAndRotateProducer(ProducerFactory.newAddImageTransformMetaDataProducer(newDataFetchProducer), true, this.mUseDownsamplingRatio));
        }
        return this.mDataFetchSequence;
    }

    private synchronized Producer<Void> getDecodedImagePrefetchSequence(Producer<CloseableReference<CloseableImage>> producer) {
        if (!this.mCloseableImagePrefetchSequences.containsKey(producer)) {
            this.mCloseableImagePrefetchSequences.put(producer, ProducerFactory.newSwallowResultProducer(producer));
        }
        return this.mCloseableImagePrefetchSequences.get(producer);
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalAssetFetchSequence() {
        if (this.mLocalAssetFetchSequence == null) {
            this.mLocalAssetFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalAssetFetchProducer());
        }
        return this.mLocalAssetFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalContentUriFetchSequence() {
        if (this.mLocalContentUriFetchSequence == null) {
            this.mLocalContentUriFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalContentUriFetchProducer(), new ThumbnailProducer[]{this.mProducerFactory.newLocalContentUriThumbnailFetchProducer(), this.mProducerFactory.newLocalExifThumbnailProducer()});
        }
        return this.mLocalContentUriFetchSequence;
    }

    private synchronized Producer<Void> getLocalFileFetchToEncodedMemoryPrefetchSequence() {
        if (this.mLocalFileFetchToEncodedMemoryPrefetchSequence == null) {
            this.mLocalFileFetchToEncodedMemoryPrefetchSequence = ProducerFactory.newSwallowResultProducer(getBackgroundLocalFileFetchToEncodeMemorySequence());
        }
        return this.mLocalFileFetchToEncodedMemoryPrefetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalImageFileFetchSequence() {
        if (this.mLocalImageFileFetchSequence == null) {
            this.mLocalImageFileFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalFileFetchProducer());
        }
        return this.mLocalImageFileFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalResourceFetchSequence() {
        if (this.mLocalResourceFetchSequence == null) {
            this.mLocalResourceFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newLocalResourceFetchProducer());
        }
        return this.mLocalResourceFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getLocalVideoFileFetchSequence() {
        if (this.mLocalVideoFileFetchSequence == null) {
            this.mLocalVideoFileFetchSequence = newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.newLocalVideoThumbnailProducer());
        }
        return this.mLocalVideoFileFetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getNetworkFetchSequence() {
        if (this.mNetworkFetchSequence == null) {
            this.mNetworkFetchSequence = newBitmapCacheGetToDecodeSequence(getCommonNetworkFetchToEncodedMemorySequence());
        }
        return this.mNetworkFetchSequence;
    }

    private synchronized Producer<Void> getNetworkFetchToEncodedMemoryPrefetchSequence() {
        if (this.mNetworkFetchToEncodedMemoryPrefetchSequence == null) {
            this.mNetworkFetchToEncodedMemoryPrefetchSequence = ProducerFactory.newSwallowResultProducer(getBackgroundNetworkFetchToEncodedMemorySequence());
        }
        return this.mNetworkFetchToEncodedMemoryPrefetchSequence;
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getPostprocessorSequence(Producer<CloseableReference<CloseableImage>> producer) {
        if (!this.mPostprocessorSequences.containsKey(producer)) {
            this.mPostprocessorSequences.put(producer, this.mProducerFactory.newPostprocessorBitmapMemoryCacheProducer(this.mProducerFactory.newPostprocessorProducer(producer)));
        }
        return this.mPostprocessorSequences.get(producer);
    }

    private synchronized Producer<CloseableReference<CloseableImage>> getQualifiedResourceFetchSequence() {
        if (this.mQualifiedResourceFetchSequence == null) {
            this.mQualifiedResourceFetchSequence = newBitmapCacheGetToLocalTransformSequence(this.mProducerFactory.newQualifiedResourceFetchProducer());
        }
        return this.mQualifiedResourceFetchSequence;
    }

    public static String getShortenedUriString(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToBitmapCacheSequence(Producer<CloseableReference<CloseableImage>> producer) {
        return this.mProducerFactory.newBitmapMemoryCacheGetProducer(this.mProducerFactory.newBackgroundThreadHandoffProducer(this.mProducerFactory.newBitmapMemoryCacheKeyMultiplexProducer(this.mProducerFactory.newBitmapMemoryCacheProducer(producer)), this.mThreadHandoffProducerQueue));
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToDecodeSequence(Producer<EncodedImage> producer) {
        return newBitmapCacheGetToBitmapCacheSequence(this.mProducerFactory.newDecodeProducer(producer));
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> producer) {
        return newBitmapCacheGetToLocalTransformSequence(producer, new ThumbnailProducer[]{this.mProducerFactory.newLocalExifThumbnailProducer()});
    }

    private Producer<EncodedImage> newDiskCacheSequence(Producer<EncodedImage> producer) {
        DiskCacheWriteProducer diskCacheWriteProducer;
        if (this.mPartialImageCachingEnabled) {
            diskCacheWriteProducer = this.mProducerFactory.newDiskCacheWriteProducer(this.mProducerFactory.newPartialDiskCacheProducer(producer));
        } else {
            diskCacheWriteProducer = this.mProducerFactory.newDiskCacheWriteProducer(producer);
        }
        return this.mProducerFactory.newDiskCacheReadProducer(diskCacheWriteProducer);
    }

    private Producer<EncodedImage> newEncodedCacheMultiplexToTranscodeSequence(Producer<EncodedImage> producer) {
        if (WebpSupportStatus.sIsWebpSupportRequired && (!this.mWebpSupportEnabled || WebpSupportStatus.sWebpBitmapFactory == null)) {
            producer = this.mProducerFactory.newWebpTranscodeProducer(producer);
        }
        if (this.mDiskCacheEnabled) {
            producer = newDiskCacheSequence(producer);
        }
        return this.mProducerFactory.newEncodedCacheKeyMultiplexProducer(this.mProducerFactory.newEncodedMemoryCacheProducer(producer));
    }

    private Producer<EncodedImage> newLocalThumbnailProducer(ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        return this.mProducerFactory.newResizeAndRotateProducer(this.mProducerFactory.newThumbnailBranchProducer(thumbnailProducerArr), true, this.mUseDownsamplingRatio);
    }

    private Producer<EncodedImage> newLocalTransformationsSequence(Producer<EncodedImage> producer, ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        return ProducerFactory.newBranchOnSeparateImagesProducer(newLocalThumbnailProducer(thumbnailProducerArr), this.mProducerFactory.newThrottlingProducer(this.mProducerFactory.newResizeAndRotateProducer(ProducerFactory.newAddImageTransformMetaDataProducer(producer), true, this.mUseDownsamplingRatio)));
    }

    public static void validateEncodedImageRequest(ImageRequest imageRequest) {
        Preconditions.checkNotNull(imageRequest);
        Preconditions.checkArgument(imageRequest.getLowestPermittedRequestLevel().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue());
    }

    public Producer<Void> getDecodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence = getBasicDecodedImageSequence(imageRequest);
        if (this.mUseBitmapPrepareToDraw) {
            basicDecodedImageSequence = getBitmapPrepareSequence(basicDecodedImageSequence);
        }
        return getDecodedImagePrefetchSequence(basicDecodedImageSequence);
    }

    public Producer<CloseableReference<CloseableImage>> getDecodedImageProducerSequence(ImageRequest imageRequest) {
        Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence = getBasicDecodedImageSequence(imageRequest);
        if (imageRequest.getPostprocessor() != null) {
            basicDecodedImageSequence = getPostprocessorSequence(basicDecodedImageSequence);
        }
        return this.mUseBitmapPrepareToDraw ? getBitmapPrepareSequence(basicDecodedImageSequence) : basicDecodedImageSequence;
    }

    public Producer<Void> getEncodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        validateEncodedImageRequest(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return getNetworkFetchToEncodedMemoryPrefetchSequence();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return getLocalFileFetchToEncodedMemoryPrefetchSequence();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + getShortenedUriString(sourceUri));
    }

    public Producer<CloseableReference<PooledByteBuffer>> getEncodedImageProducerSequence(ImageRequest imageRequest) {
        validateEncodedImageRequest(imageRequest);
        Uri sourceUri = imageRequest.getSourceUri();
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return getNetworkFetchEncodedImageProducerSequence();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return getLocalFileFetchEncodedImageProducerSequence();
        }
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + getShortenedUriString(sourceUri));
    }

    public Producer<CloseableReference<PooledByteBuffer>> getLocalFileFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (this.mLocalFileEncodedImageProducerSequence == null) {
                this.mLocalFileEncodedImageProducerSequence = new RemoveImageTransformMetaDataProducer(getBackgroundLocalFileFetchToEncodeMemorySequence());
            }
        }
        return this.mLocalFileEncodedImageProducerSequence;
    }

    public Producer<CloseableReference<PooledByteBuffer>> getNetworkFetchEncodedImageProducerSequence() {
        synchronized (this) {
            if (this.mNetworkEncodedImageProducerSequence == null) {
                this.mNetworkEncodedImageProducerSequence = new RemoveImageTransformMetaDataProducer(getBackgroundNetworkFetchToEncodedMemorySequence());
            }
        }
        return this.mNetworkEncodedImageProducerSequence;
    }

    private Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> producer, ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        return newBitmapCacheGetToDecodeSequence(newLocalTransformationsSequence(newEncodedCacheMultiplexToTranscodeSequence(producer), thumbnailProducerArr));
    }
}
