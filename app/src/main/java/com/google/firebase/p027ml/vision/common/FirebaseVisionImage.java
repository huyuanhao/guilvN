package com.google.firebase.p027ml.vision.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzpv;
import com.google.android.gms.internal.firebase_ml.zzpx;
import com.google.android.gms.internal.firebase_ml.zzpy;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImageMetadata;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImage */
public class FirebaseVisionImage {
    public static zzpx zzaxa = zzpx.zznk();
    @Nullable
    public volatile Bitmap zzaxb;
    @Nullable
    public volatile ByteBuffer zzaxc;
    @Nullable
    public volatile FirebaseVisionImageMetadata zzaxd;
    @Nullable
    public volatile Frame zzaxe;
    @Nullable
    public volatile byte[] zzaxf;
    public final long zzaxg;

    public FirebaseVisionImage(@NonNull ByteBuffer byteBuffer, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.zzaxg = SystemClock.elapsedRealtime();
        this.zzaxc = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        this.zzaxd = (FirebaseVisionImageMetadata) Preconditions.checkNotNull(firebaseVisionImageMetadata);
    }

    public static FirebaseVisionImage fromBitmap(@NonNull Bitmap bitmap) {
        return new FirebaseVisionImage(bitmap);
    }

    public static FirebaseVisionImage fromByteArray(@NonNull byte[] bArr, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(bArr, firebaseVisionImageMetadata);
    }

    public static FirebaseVisionImage fromByteBuffer(@NonNull ByteBuffer byteBuffer, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(byteBuffer, firebaseVisionImageMetadata);
    }

    public static FirebaseVisionImage fromFilePath(@NonNull Context context, @NonNull Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        zzpy.zznl();
        return new FirebaseVisionImage(zzpy.zza(context.getContentResolver(), uri, 1024));
    }

    @RequiresApi(19)
    @TargetApi(19)
    public static FirebaseVisionImage fromMediaImage(@NonNull Image image, int i) {
        Preconditions.checkNotNull(image, "Please provide a valid image");
        Preconditions.checkArgument(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() != 256) {
            return new FirebaseVisionImage(zzpx.zza(planes, image.getWidth(), image.getHeight()), new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(image.getWidth()).setHeight(image.getHeight()).setRotation(i).build());
        }
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        if (i == 0) {
            return new FirebaseVisionImage(bArr);
        }
        return new FirebaseVisionImage(zza(BitmapFactory.decodeByteArray(bArr, 0, remaining), i));
    }

    public static Bitmap zza(Bitmap bitmap, int i) {
        int zzbm = zzpv.zzbm(i);
        if (zzbm == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) zzbm);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private final byte[] zzae(boolean z) {
        if (this.zzaxf != null) {
            return this.zzaxf;
        }
        synchronized (this) {
            if (this.zzaxf != null) {
                return this.zzaxf;
            } else if (this.zzaxc == null || (z && this.zzaxd.getRotation() != 0)) {
                byte[] zza = zzpx.zza(zznj());
                this.zzaxf = zza;
                return zza;
            } else {
                byte[] zza2 = zzpx.zza(this.zzaxc);
                int format = this.zzaxd.getFormat();
                if (format != 17) {
                    if (format == 842094169) {
                        zza2 = zzpx.zzf(zza2);
                    } else {
                        throw new IllegalStateException("Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12");
                    }
                }
                byte[] zza3 = zzpx.zza(zza2, this.zzaxd.getWidth(), this.zzaxd.getHeight());
                if (this.zzaxd.getRotation() == 0) {
                    this.zzaxf = zza3;
                }
                return zza3;
            }
        }
    }

    private final Bitmap zznj() {
        if (this.zzaxb != null) {
            return this.zzaxb;
        }
        synchronized (this) {
            if (this.zzaxb == null) {
                byte[] zzae = zzae(false);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzae, 0, zzae.length);
                if (this.zzaxd != null) {
                    decodeByteArray = zza(decodeByteArray, this.zzaxd.getRotation());
                }
                this.zzaxb = decodeByteArray;
            }
        }
        return this.zzaxb;
    }

    @KeepForSdk
    public Bitmap getBitmapForDebugging() {
        return zznj();
    }

    public final Pair<byte[], Float> zze(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr;
        if (this.zzaxd != null) {
            boolean z = this.zzaxd.getRotation() == 1 || this.zzaxd.getRotation() == 3;
            FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.zzaxd;
            i3 = z ? firebaseVisionImageMetadata.getHeight() : firebaseVisionImageMetadata.getWidth();
            i4 = z ? this.zzaxd.getWidth() : this.zzaxd.getHeight();
        } else {
            i3 = zznj().getWidth();
            i4 = zznj().getHeight();
        }
        float min = Math.min(((float) i) / ((float) i3), ((float) i2) / ((float) i4));
        if (min < 1.0f) {
            Bitmap zznj = zznj();
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            bArr = zzpx.zza(Bitmap.createBitmap(zznj, 0, 0, this.zzaxb.getWidth(), this.zzaxb.getHeight(), matrix, true));
        } else {
            bArr = zzae(true);
            min = 1.0f;
        }
        return Pair.create(bArr, Float.valueOf(min));
    }

    public FirebaseVisionImage(@NonNull byte[] bArr, @NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), firebaseVisionImageMetadata);
    }

    public final synchronized Frame zza(boolean z, boolean z2) {
        int i = 0;
        Preconditions.checkArgument(!z || !z2, "Can't restrict to bitmap-only and NV21 byte buffer-only");
        if (this.zzaxe == null) {
            Frame.Builder builder = new Frame.Builder();
            if (this.zzaxc == null || z) {
                builder.setBitmap(zznj());
            } else {
                int i2 = FirebaseVisionImageMetadata.IMAGE_FORMAT_YV12;
                if (z2 && this.zzaxd.getFormat() != 17) {
                    if (this.zzaxd.getFormat() == 842094169) {
                        this.zzaxc = ByteBuffer.wrap(zzpx.zzf(zzpx.zza(this.zzaxc)));
                        this.zzaxd = new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(this.zzaxd.getWidth()).setHeight(this.zzaxd.getHeight()).setRotation(this.zzaxd.getRotation()).build();
                    } else {
                        throw new IllegalStateException("Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12");
                    }
                }
                ByteBuffer byteBuffer = this.zzaxc;
                int width = this.zzaxd.getWidth();
                int height = this.zzaxd.getHeight();
                int format = this.zzaxd.getFormat();
                if (format == 17) {
                    i2 = 17;
                } else if (format != 842094169) {
                    i2 = 0;
                }
                builder.setImageData(byteBuffer, width, height, i2);
                int rotation = this.zzaxd.getRotation();
                if (rotation != 0) {
                    if (rotation == 1) {
                        i = 1;
                    } else if (rotation == 2) {
                        i = 2;
                    } else if (rotation == 3) {
                        i = 3;
                    } else {
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("Invalid rotation: ");
                        sb.append(rotation);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                builder.setRotation(i);
            }
            builder.setTimestampMillis(this.zzaxg);
            this.zzaxe = builder.build();
        }
        return this.zzaxe;
    }

    public FirebaseVisionImage(@NonNull Bitmap bitmap) {
        this.zzaxg = SystemClock.elapsedRealtime();
        this.zzaxb = (Bitmap) Preconditions.checkNotNull(bitmap);
    }

    public FirebaseVisionImage(byte[] bArr) {
        this.zzaxg = SystemClock.elapsedRealtime();
        this.zzaxf = (byte[]) Preconditions.checkNotNull(bArr);
    }
}
