package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    public Metadata zzap;
    public ByteBuffer zzaq;
    public Bitmap zzar;

    public static class Builder {
        public Frame zzas = new Frame();

        public Frame build() {
            if (this.zzas.zzaq != null || this.zzas.zzar != null) {
                return this.zzas;
            }
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        public Builder setBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zzas.zzar = bitmap;
            Metadata metadata = this.zzas.getMetadata();
            metadata.width = width;
            metadata.height = height;
            return this;
        }

        public Builder setId(int i) {
            this.zzas.getMetadata().f1003id = i;
            return this;
        }

        public Builder setImageData(ByteBuffer byteBuffer, int i, int i2, int i3) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i * i2) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
                this.zzas.zzaq = byteBuffer;
                Metadata metadata = this.zzas.getMetadata();
                metadata.width = i;
                metadata.height = i2;
                metadata.format = i3;
                return this;
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public Builder setRotation(int i) {
            this.zzas.getMetadata().rotation = i;
            return this;
        }

        public Builder setTimestampMillis(long j) {
            this.zzas.getMetadata().zzat = j;
            return this;
        }
    }

    public Frame() {
        this.zzap = new Metadata();
        this.zzaq = null;
        this.zzar = null;
    }

    public Bitmap getBitmap() {
        return this.zzar;
    }

    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.zzar;
        if (bitmap == null) {
            return this.zzaq;
        }
        int width = bitmap.getWidth();
        int height = this.zzar.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.zzar.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    public Metadata getMetadata() {
        return this.zzap;
    }

    public static class Metadata {
        public int format = -1;
        public int height;

        /* renamed from: id */
        public int f1003id;
        public int rotation;
        public int width;
        public long zzat;

        public Metadata() {
        }

        public int getFormat() {
            return this.format;
        }

        public int getHeight() {
            return this.height;
        }

        public int getId() {
            return this.f1003id;
        }

        public int getRotation() {
            return this.rotation;
        }

        public long getTimestampMillis() {
            return this.zzat;
        }

        public int getWidth() {
            return this.width;
        }

        public final void zzd() {
            if (this.rotation % 2 != 0) {
                int i = this.width;
                this.width = this.height;
                this.height = i;
            }
            this.rotation = 0;
        }

        public Metadata(Metadata metadata) {
            this.width = metadata.getWidth();
            this.height = metadata.getHeight();
            this.f1003id = metadata.getId();
            this.zzat = metadata.getTimestampMillis();
            this.rotation = metadata.getRotation();
        }
    }
}
