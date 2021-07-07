package com.google.firebase.p027ml.vision.common;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata */
public class FirebaseVisionImageMetadata {
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    public final int format;
    public final int height;
    public final int rotation;
    public final int width;

    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder */
    public static class Builder {
        public int format;
        public int height;
        public int rotation;
        public int width;

        public FirebaseVisionImageMetadata build() {
            return new FirebaseVisionImageMetadata(this.width, this.height, this.rotation, this.format);
        }

        public Builder setFormat(int i) {
            Preconditions.checkArgument(i == 842094169 || i == 17);
            this.format = i;
            return this;
        }

        public Builder setHeight(int i) {
            Preconditions.checkArgument(i > 0, "Image buffer height should be positive.");
            this.height = i;
            return this;
        }

        public Builder setRotation(int i) {
            boolean z = true;
            if (!(i == 0 || i == 1 || i == 2 || i == 3)) {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.rotation = i;
            return this;
        }

        public Builder setWidth(int i) {
            Preconditions.checkArgument(i > 0, "Image buffer width should be positive.");
            this.width = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$ImageFormat */
    public @interface ImageFormat {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Rotation */
    public @interface Rotation {
    }

    public FirebaseVisionImageMetadata(FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.width = firebaseVisionImageMetadata.getWidth();
        this.height = firebaseVisionImageMetadata.getHeight();
        this.format = firebaseVisionImageMetadata.getFormat();
        this.rotation = firebaseVisionImageMetadata.getRotation();
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getWidth() {
        return this.width;
    }

    public FirebaseVisionImageMetadata(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.format = i4;
    }
}
