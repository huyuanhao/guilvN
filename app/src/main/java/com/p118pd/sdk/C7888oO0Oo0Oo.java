package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.p118pd.sdk.C7647o0oOoOOo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oO0Oo0Oo  reason: case insensitive filesystem */
public class C7888oO0Oo0Oo<T> implements AbstractC7650o0oOoOoO<T, Bitmap> {
    @VisibleForTesting
    public static final int OooO00o = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f20955OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7647o0oOoOOo<Long> f20956OooO00o = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new OooO00o());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20957OooO00o = "VideoDecoder";
    public static final C7647o0oOoOOo<Integer> OooO0O0 = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new OooO0O0());

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final C7889OooO0Oo f20958OooO0O0 = new C7889OooO0Oo();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20959OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7889OooO0Oo f20960OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7890OooO0o0<T> f20961OooO00o;

    /* renamed from: com.pd.sdk.oO0Oo0Oo$OooO00o */
    public class OooO00o implements C7647o0oOoOOo.OooO0O0<Long> {
        public final ByteBuffer OooO00o = ByteBuffer.allocate(8);

        public void OooO00o(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.OooO00o) {
                this.OooO00o.position(0);
                messageDigest.update(this.OooO00o.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.pd.sdk.oO0Oo0Oo$OooO0O0 */
    public class OooO0O0 implements C7647o0oOoOOo.OooO0O0<Integer> {
        public final ByteBuffer OooO00o = ByteBuffer.allocate(4);

        public void OooO00o(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.OooO00o) {
                    this.OooO00o.position(0);
                    messageDigest.update(this.OooO00o.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.oO0Oo0Oo$OooO0OO */
    public static final class OooO0OO implements AbstractC7890OooO0o0<AssetFileDescriptor> {
        public OooO0OO() {
        }

        public /* synthetic */ OooO0OO(OooO00o oooO00o) {
            this();
        }

        public void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO0Oo0Oo$OooO0Oo  reason: case insensitive filesystem */
    public static class C7889OooO0Oo {
        public MediaMetadataRetriever OooO00o() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.pd.sdk.oO0Oo0Oo$OooO0o */
    public static final class OooO0o implements AbstractC7890OooO0o0<ParcelFileDescriptor> {
        public void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    @VisibleForTesting
    /* renamed from: com.pd.sdk.oO0Oo0Oo$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC7890OooO0o0<T> {
        void OooO00o(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public C7888oO0Oo0Oo(AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7890OooO0o0<T> oooO0o0) {
        this(o0ooo0oo, oooO0o0, f20958OooO0O0);
    }

    public static AbstractC7650o0oOoOoO<AssetFileDescriptor, Bitmap> OooO00o(AbstractC7711o0ooO0OO o0ooo0oo) {
        return new C7888oO0Oo0Oo(o0ooo0oo, new OooO0OO(null));
    }

    public static AbstractC7650o0oOoOoO<ParcelFileDescriptor, Bitmap> OooO0O0(AbstractC7711o0ooO0OO o0ooo0oo) {
        return new C7888oO0Oo0Oo(o0ooo0oo, new OooO0o());
    }

    @Override // com.p118pd.sdk.AbstractC7650o0oOoOoO
    public boolean OooO00o(@NonNull T t, @NonNull C7648o0oOoOo o0ooooo) {
        return true;
    }

    @VisibleForTesting
    public C7888oO0Oo0Oo(AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7890OooO0o0<T> oooO0o0, C7889OooO0Oo oooO0Oo) {
        this.f20959OooO00o = o0ooo0oo;
        this.f20961OooO00o = oooO0o0;
        this.f20960OooO00o = oooO0Oo;
    }

    @TargetApi(27)
    public static Bitmap OooO0O0(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float OooO00o2 = downsampleStrategy.OooO00o(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * OooO00o2), Math.round(OooO00o2 * ((float) parseInt2)));
        } catch (Throwable unused) {
            Log.isLoggable(f20957OooO00o, 3);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.pd.sdk.o0oOoOo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.AbstractC7650o0oOoOoO
    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(@NonNull T t, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        long longValue = ((Long) o0ooooo.OooO00o(f20956OooO00o)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) o0ooooo.OooO00o(OooO0O0);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) o0ooooo.OooO00o(DownsampleStrategy.f14839OooO00o);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.OooO0oO;
            }
            MediaMetadataRetriever OooO00o2 = this.f20960OooO00o.OooO00o();
            try {
                this.f20961OooO00o.OooO00o(OooO00o2, t);
                Bitmap OooO00o3 = OooO00o(OooO00o2, longValue, num.intValue(), i, i2, downsampleStrategy);
                OooO00o2.release();
                return C7875oO0OOo0o.OooO00o(OooO00o3, this.f20959OooO00o);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                OooO00o2.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    @Nullable
    public static Bitmap OooO00o(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap OooO0O02 = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.OooO0o) ? null : OooO0O0(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return OooO0O02 == null ? OooO00o(mediaMetadataRetriever, j, i) : OooO0O02;
    }

    public static Bitmap OooO00o(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }
}
