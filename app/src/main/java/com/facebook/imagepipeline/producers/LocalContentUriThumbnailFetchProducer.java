package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.JfifUtil;
import com.umeng.message.proguard.C3848l;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class LocalContentUriThumbnailFetchProducer extends LocalFetchProducer implements ThumbnailProducer<EncodedImage> {
    public static final Rect MICRO_THUMBNAIL_DIMENSIONS = new Rect(0, 0, 96, 96);
    public static final Rect MINI_THUMBNAIL_DIMENSIONS = new Rect(0, 0, 512, 384);
    public static final int NO_THUMBNAIL = 0;
    public static final String PRODUCER_NAME = "LocalContentUriThumbnailFetchProducer";
    public static final String[] PROJECTION = {C3848l.f10389g, "_data"};
    public static final Class<?> TAG = LocalContentUriThumbnailFetchProducer.class;
    public static final String[] THUMBNAIL_PROJECTION = {"_data"};
    public final ContentResolver mContentResolver;

    public LocalContentUriThumbnailFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        this.mContentResolver = contentResolver;
    }

    @Nullable
    private EncodedImage getCameraImage(Uri uri, ResizeOptions resizeOptions) throws IOException {
        EncodedImage thumbnail;
        Cursor query = this.mContentResolver.query(uri, PROJECTION, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (resizeOptions == null || (thumbnail = getThumbnail(resizeOptions, query.getInt(query.getColumnIndex(C3848l.f10389g)))) == null) {
                query.close();
                return null;
            }
            thumbnail.setRotationAngle(getRotationAngle(string));
            query.close();
            return thumbnail;
        } finally {
            query.close();
        }
    }

    public static int getLength(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    public static int getRotationAngle(String str) {
        if (str != null) {
            try {
                return JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.f14146OooO0oo, 1));
            } catch (IOException e) {
                FLog.m872e(TAG, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.image.EncodedImage getThumbnail(com.facebook.imagepipeline.common.ResizeOptions r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            int r5 = getThumbnailKind(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ContentResolver r1 = r4.mContentResolver     // Catch:{ all -> 0x0053 }
            long r2 = (long) r6     // Catch:{ all -> 0x0053 }
            java.lang.String[] r6 = com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer.THUMBNAIL_PROJECTION     // Catch:{ all -> 0x0053 }
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r1, r2, r5, r6)     // Catch:{ all -> 0x0053 }
            if (r5 != 0) goto L_0x0019
            if (r5 == 0) goto L_0x0018
            r5.close()
        L_0x0018:
            return r0
        L_0x0019:
            r5.moveToFirst()     // Catch:{ all -> 0x0050 }
            int r6 = r5.getCount()     // Catch:{ all -> 0x0050 }
            if (r6 <= 0) goto L_0x004a
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0050 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0050 }
            r1.<init>(r6)     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            r0.<init>(r6)     // Catch:{ all -> 0x0050 }
            int r6 = getLength(r6)     // Catch:{ all -> 0x0050 }
            com.facebook.imagepipeline.image.EncodedImage r6 = r4.getEncodedImage(r0, r6)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0049
            r5.close()
        L_0x0049:
            return r6
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            r5.close()
        L_0x004f:
            return r0
        L_0x0050:
            r6 = move-exception
            r0 = r5
            goto L_0x0054
        L_0x0053:
            r6 = move-exception
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0.close()
        L_0x0059:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer.getThumbnail(com.facebook.imagepipeline.common.ResizeOptions, int):com.facebook.imagepipeline.image.EncodedImage");
    }

    public static int getThumbnailKind(ResizeOptions resizeOptions) {
        if (ThumbnailSizeChecker.isImageBigEnough(MICRO_THUMBNAIL_DIMENSIONS.width(), MICRO_THUMBNAIL_DIMENSIONS.height(), resizeOptions)) {
            return 3;
        }
        return ThumbnailSizeChecker.isImageBigEnough(MINI_THUMBNAIL_DIMENSIONS.width(), MINI_THUMBNAIL_DIMENSIONS.height(), resizeOptions) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.ThumbnailProducer
    public boolean canProvideImageForSize(ResizeOptions resizeOptions) {
        return ThumbnailSizeChecker.isImageBigEnough(MINI_THUMBNAIL_DIMENSIONS.width(), MINI_THUMBNAIL_DIMENSIONS.height(), resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    public EncodedImage getEncodedImage(ImageRequest imageRequest) throws IOException {
        EncodedImage cameraImage;
        Uri sourceUri = imageRequest.getSourceUri();
        if (!UriUtil.isLocalCameraUri(sourceUri) || (cameraImage = getCameraImage(sourceUri, imageRequest.getResizeOptions())) == null) {
            return null;
        }
        return cameraImage;
    }

    @Override // com.facebook.imagepipeline.producers.LocalFetchProducer
    public String getProducerName() {
        return PRODUCER_NAME;
    }
}
