package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.OrientedDrawable;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

public class DefaultDrawableFactory implements DrawableFactory {
    public final DrawableFactory mAnimatedDrawableFactory;
    public final Resources mResources;

    public DefaultDrawableFactory(Resources resources, DrawableFactory drawableFactory) {
        this.mResources = resources;
        this.mAnimatedDrawableFactory = drawableFactory;
    }

    public static boolean hasTransformableExifOrientation(CloseableStaticBitmap closeableStaticBitmap) {
        if (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0) {
            return false;
        }
        return true;
    }

    public static boolean hasTransformableRotationAngle(CloseableStaticBitmap closeableStaticBitmap) {
        return (closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) ? false : true;
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public Drawable createDrawable(CloseableImage closeableImage) {
        if (closeableImage instanceof CloseableStaticBitmap) {
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.mResources, closeableStaticBitmap.getUnderlyingBitmap());
            if (hasTransformableRotationAngle(closeableStaticBitmap) || hasTransformableExifOrientation(closeableStaticBitmap)) {
                return new OrientedDrawable(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            }
            return bitmapDrawable;
        }
        DrawableFactory drawableFactory = this.mAnimatedDrawableFactory;
        if (drawableFactory == null || !drawableFactory.supportsImageType(closeableImage)) {
            return null;
        }
        return this.mAnimatedDrawableFactory.createDrawable(closeableImage);
    }

    @Override // com.facebook.imagepipeline.drawable.DrawableFactory
    public boolean supportsImageType(CloseableImage closeableImage) {
        return true;
    }
}
