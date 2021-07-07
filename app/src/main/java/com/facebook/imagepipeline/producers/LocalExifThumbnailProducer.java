package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferInputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class LocalExifThumbnailProducer implements ThumbnailProducer<EncodedImage> {
    public static final int COMMON_EXIF_THUMBNAIL_MAX_DIMENSION = 512;
    @VisibleForTesting
    public static final String CREATED_THUMBNAIL = "createdThumbnail";
    public static final String PRODUCER_NAME = "LocalExifThumbnailProducer";
    public final ContentResolver mContentResolver;
    public final Executor mExecutor;
    public final PooledByteBufferFactory mPooledByteBufferFactory;

    public LocalExifThumbnailProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        this.mExecutor = executor;
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
        this.mContentResolver = contentResolver;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private EncodedImage buildEncodedImage(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> decodeDimensions = BitmapUtil.decodeDimensions(new PooledByteBufferInputStream(pooledByteBuffer));
        int rotationAngle = getRotationAngle(exifInterface);
        int i = -1;
        int intValue = decodeDimensions != null ? ((Integer) decodeDimensions.first).intValue() : -1;
        if (decodeDimensions != null) {
            i = ((Integer) decodeDimensions.second).intValue();
        }
        CloseableReference of = CloseableReference.m937of(pooledByteBuffer);
        try {
            EncodedImage encodedImage = new EncodedImage(of);
            CloseableReference.closeSafely(of);
            encodedImage.setImageFormat(DefaultImageFormats.JPEG);
            encodedImage.setRotationAngle(rotationAngle);
            encodedImage.setWidth(intValue);
            encodedImage.setHeight(i);
            return encodedImage;
        } catch (Throwable th) {
            CloseableReference.closeSafely(of);
            throw th;
        }
    }

    private int getRotationAngle(ExifInterface exifInterface) {
        return JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt(exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.f14146OooO0oo)));
    }

    @Override // com.facebook.imagepipeline.producers.ThumbnailProducer
    public boolean canProvideImageForSize(ResizeOptions resizeOptions) {
        return ThumbnailSizeChecker.isImageBigEnough(512, 512, resizeOptions);
    }

    @VisibleForTesting
    public boolean canReadAsFile(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    @Nullable
    public ExifInterface getExifInterface(Uri uri) {
        String realPathFromUri = UriUtil.getRealPathFromUri(this.mContentResolver, uri);
        try {
            if (canReadAsFile(realPathFromUri)) {
                return new ExifInterface(realPathFromUri);
            }
            return null;
        } catch (IOException unused) {
            return null;
        } catch (StackOverflowError unused2) {
            FLog.m869e(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        final ImageRequest imageRequest = producerContext.getImageRequest();
        final C05491 r7 = new StatefulProducerRunnable<EncodedImage>(consumer, listener, PRODUCER_NAME, id) {
            /* class com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.C05491 */

            public void disposeResult(EncodedImage encodedImage) {
                EncodedImage.closeSafely(encodedImage);
            }

            public Map<String, String> getExtraMapOnSuccess(EncodedImage encodedImage) {
                return ImmutableMap.m845of("createdThumbnail", Boolean.toString(encodedImage != null));
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            public EncodedImage getResult() throws Exception {
                ExifInterface exifInterface = LocalExifThumbnailProducer.this.getExifInterface(imageRequest.getSourceUri());
                if (exifInterface == null || !exifInterface.hasThumbnail()) {
                    return null;
                }
                return LocalExifThumbnailProducer.this.buildEncodedImage(LocalExifThumbnailProducer.this.mPooledByteBufferFactory.newByteBuffer(exifInterface.getThumbnail()), exifInterface);
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            /* class com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.C05502 */

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
                r7.cancel();
            }
        });
        this.mExecutor.execute(r7);
    }
}
