package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import javax.annotation.Nullable;

public class ImageDecodeOptionsBuilder {
    public Bitmap.Config mBitmapConfig = Bitmap.Config.ARGB_8888;
    @Nullable
    public ImageDecoder mCustomImageDecoder;
    public boolean mDecodeAllFrames;
    public boolean mDecodePreviewFrame;
    public boolean mForceStaticImage;
    public int mMinDecodeIntervalMs = 100;
    public boolean mUseLastFrameForPreview;

    public ImageDecodeOptions build() {
        return new ImageDecodeOptions(this);
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    @Nullable
    public ImageDecoder getCustomImageDecoder() {
        return this.mCustomImageDecoder;
    }

    public boolean getDecodeAllFrames() {
        return this.mDecodeAllFrames;
    }

    public boolean getDecodePreviewFrame() {
        return this.mDecodePreviewFrame;
    }

    public boolean getForceStaticImage() {
        return this.mForceStaticImage;
    }

    public int getMinDecodeIntervalMs() {
        return this.mMinDecodeIntervalMs;
    }

    public boolean getUseLastFrameForPreview() {
        return this.mUseLastFrameForPreview;
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        return this;
    }

    public ImageDecodeOptionsBuilder setCustomImageDecoder(@Nullable ImageDecoder imageDecoder) {
        this.mCustomImageDecoder = imageDecoder;
        return this;
    }

    public ImageDecodeOptionsBuilder setDecodeAllFrames(boolean z) {
        this.mDecodeAllFrames = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setDecodePreviewFrame(boolean z) {
        this.mDecodePreviewFrame = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setForceStaticImage(boolean z) {
        this.mForceStaticImage = z;
        return this;
    }

    public ImageDecodeOptionsBuilder setFrom(ImageDecodeOptions imageDecodeOptions) {
        this.mDecodePreviewFrame = imageDecodeOptions.decodePreviewFrame;
        this.mUseLastFrameForPreview = imageDecodeOptions.useLastFrameForPreview;
        this.mDecodeAllFrames = imageDecodeOptions.decodeAllFrames;
        this.mForceStaticImage = imageDecodeOptions.forceStaticImage;
        this.mBitmapConfig = imageDecodeOptions.bitmapConfig;
        this.mCustomImageDecoder = imageDecodeOptions.customImageDecoder;
        return this;
    }

    public ImageDecodeOptionsBuilder setMinDecodeIntervalMs(int i) {
        this.mMinDecodeIntervalMs = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setUseLastFrameForPreview(boolean z) {
        this.mUseLastFrameForPreview = z;
        return this;
    }
}
