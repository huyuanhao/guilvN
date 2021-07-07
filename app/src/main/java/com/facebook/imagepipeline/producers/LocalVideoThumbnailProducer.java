package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.annotation.Nullable;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.bitmaps.SimpleBitmapReleaser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.concurrent.Executor;

public class LocalVideoThumbnailProducer implements Producer<CloseableReference<CloseableImage>> {
    @VisibleForTesting
    public static final String CREATED_THUMBNAIL = "createdThumbnail";
    public static final String PRODUCER_NAME = "VideoThumbnailProducer";
    public final ContentResolver mContentResolver;
    public final Executor mExecutor;

    public LocalVideoThumbnailProducer(Executor executor, ContentResolver contentResolver) {
        this.mExecutor = executor;
        this.mContentResolver = contentResolver;
    }

    public static int calculateKind(ImageRequest imageRequest) {
        return (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) ? 1 : 3;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Nullable
    private String getLocalFilePath(ImageRequest imageRequest) {
        String[] strArr;
        String str;
        Uri uri;
        Uri sourceUri = imageRequest.getSourceUri();
        if (UriUtil.isLocalFileUri(sourceUri)) {
            return imageRequest.getSourceFile().getPath();
        }
        if (UriUtil.isLocalContentUri(sourceUri)) {
            if (Build.VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(sourceUri.getAuthority())) {
                uri = sourceUri;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(sourceUri);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(Constants.COLON_SEPARATOR)[1]};
            }
            Cursor query = this.mContentResolver.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public void produceResults(Consumer<CloseableReference<CloseableImage>> consumer, ProducerContext producerContext) {
        final ProducerListener listener = producerContext.getListener();
        final String id = producerContext.getId();
        final ImageRequest imageRequest = producerContext.getImageRequest();
        final C05531 r9 = new StatefulProducerRunnable<CloseableReference<CloseableImage>>(consumer, PRODUCER_NAME, listener, id) {
            /* class com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer.C05531 */

            @Override // com.facebook.imagepipeline.producers.StatefulProducerRunnable, com.facebook.common.executors.StatefulRunnable
            public void onFailure(Exception exc) {
                super.onFailure(exc);
                listener.onUltimateProducerReached(id, LocalVideoThumbnailProducer.PRODUCER_NAME, false);
            }

            public void disposeResult(CloseableReference<CloseableImage> closeableReference) {
                CloseableReference.closeSafely(closeableReference);
            }

            public Map<String, String> getExtraMapOnSuccess(CloseableReference<CloseableImage> closeableReference) {
                return ImmutableMap.m845of("createdThumbnail", String.valueOf(closeableReference != null));
            }

            @Override // com.facebook.common.executors.StatefulRunnable
            public CloseableReference<CloseableImage> getResult() throws Exception {
                Bitmap createVideoThumbnail;
                String localFilePath = LocalVideoThumbnailProducer.this.getLocalFilePath(imageRequest);
                if (localFilePath == null || (createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(localFilePath, LocalVideoThumbnailProducer.calculateKind(imageRequest))) == null) {
                    return null;
                }
                return CloseableReference.m937of(new CloseableStaticBitmap(createVideoThumbnail, SimpleBitmapReleaser.getInstance(), ImmutableQualityInfo.FULL_QUALITY, 0));
            }

            public void onSuccess(CloseableReference<CloseableImage> closeableReference) {
                super.onSuccess((Object) closeableReference);
                listener.onUltimateProducerReached(id, LocalVideoThumbnailProducer.PRODUCER_NAME, closeableReference != null);
            }
        };
        producerContext.addCallbacks(new BaseProducerContextCallbacks() {
            /* class com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer.C05542 */

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
                r9.cancel();
            }
        });
        this.mExecutor.execute(r9);
    }
}
