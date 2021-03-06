package com.facebook.imagepipeline.decoder;

import com.facebook.imageformat.ImageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageDecoderConfig {
    public final Map<ImageFormat, ImageDecoder> mCustomImageDecoders;
    public final List<ImageFormat.FormatChecker> mCustomImageFormats;

    public static class Builder {
        public Map<ImageFormat, ImageDecoder> mCustomImageDecoders;
        public List<ImageFormat.FormatChecker> mCustomImageFormats;

        public Builder addDecodingCapability(ImageFormat imageFormat, ImageFormat.FormatChecker formatChecker, ImageDecoder imageDecoder) {
            if (this.mCustomImageFormats == null) {
                this.mCustomImageFormats = new ArrayList();
            }
            this.mCustomImageFormats.add(formatChecker);
            overrideDecoder(imageFormat, imageDecoder);
            return this;
        }

        public ImageDecoderConfig build() {
            return new ImageDecoderConfig(this);
        }

        public Builder overrideDecoder(ImageFormat imageFormat, ImageDecoder imageDecoder) {
            if (this.mCustomImageDecoders == null) {
                this.mCustomImageDecoders = new HashMap();
            }
            this.mCustomImageDecoders.put(imageFormat, imageDecoder);
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<ImageFormat, ImageDecoder> getCustomImageDecoders() {
        return this.mCustomImageDecoders;
    }

    public List<ImageFormat.FormatChecker> getCustomImageFormats() {
        return this.mCustomImageFormats;
    }

    public ImageDecoderConfig(Builder builder) {
        this.mCustomImageDecoders = builder.mCustomImageDecoders;
        this.mCustomImageFormats = builder.mCustomImageFormats;
    }
}
