package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.imagepipeline.image.ImageInfo;

public class DrawableWithIntrinsicSize extends ForwardingDrawable implements Drawable.Callback {
    public final ImageInfo mImageInfo;

    public DrawableWithIntrinsicSize(Drawable drawable, ImageInfo imageInfo) {
        super(drawable);
        this.mImageInfo = imageInfo;
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public int getIntrinsicHeight() {
        return this.mImageInfo.getHeight();
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable
    public int getIntrinsicWidth() {
        return this.mImageInfo.getWidth();
    }
}
