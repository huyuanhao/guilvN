package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.facebook.react.views.text.FontMetricsUtil;
import com.umeng.message.proguard.C3848l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.pd.sdk.oO000o00  reason: case insensitive filesystem */
public final class C7785oO000o00 {
    public static final int OooO00o = 10485760;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7647o0oOoOOo<DecodeFormat> f20825OooO00o = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO0O0 f20826OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20827OooO00o = "Downsampler";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Queue<BitmapFactory.Options> f20828OooO00o = oO0O0O00.m19524OooO00o(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set<String> f20829OooO00o = Collections.unmodifiableSet(new HashSet(Arrays.asList(f20830OooO0O0, f20832OooO0OO)));
    @Deprecated
    public static final C7647o0oOoOOo<DownsampleStrategy> OooO0O0 = DownsampleStrategy.f14839OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f20830OooO0O0 = "image/vnd.wap.wbmp";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Set<ImageHeaderParser.ImageType> f20831OooO0O0 = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    public static final C7647o0oOoOOo<Boolean> OooO0OO = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", (Object) false);

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f20832OooO0OO = "image/x-ico";
    public static final C7647o0oOoOOo<Boolean> OooO0Oo = C7647o0oOoOOo.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", (Object) false);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final DisplayMetrics f20833OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20834OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7711o0ooO0OO f20835OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7788oO000oO0 f20836OooO00o = C7788oO000oO0.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<ImageHeaderParser> f20837OooO00o;

    /* renamed from: com.pd.sdk.oO000o00$OooO00o */
    public class OooO00o implements OooO0O0 {
        @Override // com.p118pd.sdk.C7785oO000o00.OooO0O0
        public void OooO00o() {
        }

        @Override // com.p118pd.sdk.C7785oO000o00.OooO0O0
        public void OooO00o(AbstractC7711o0ooO0OO o0ooo0oo, Bitmap bitmap) {
        }
    }

    /* renamed from: com.pd.sdk.oO000o00$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o();

        void OooO00o(AbstractC7711o0ooO0OO o0ooo0oo, Bitmap bitmap) throws IOException;
    }

    public C7785oO000o00(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7707o0ooO00O o0ooo00o) {
        this.f20837OooO00o = list;
        this.f20833OooO00o = (DisplayMetrics) C7842oO0O0.OooO00o(displayMetrics);
        this.f20835OooO00o = (AbstractC7711o0ooO0OO) C7842oO0O0.OooO00o(o0ooo0oo);
        this.f20834OooO00o = (AbstractC7707o0ooO00O) C7842oO0O0.OooO00o(o0ooo00o);
    }

    public static int OooO0O0(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static int OooO0OO(double d) {
        return (int) (d + 0.5d);
    }

    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(InputStream inputStream, int i, int i2, C7648o0oOoOo o0ooooo) throws IOException {
        return OooO00o(inputStream, i, i2, o0ooooo, f20826OooO00o);
    }

    public boolean OooO00o(InputStream inputStream) {
        return true;
    }

    public boolean OooO00o(ByteBuffer byteBuffer) {
        return true;
    }

    public static void OooO0O0(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public AbstractC7700o0oo0oo0<Bitmap> OooO00o(InputStream inputStream, int i, int i2, C7648o0oOoOo o0ooooo, OooO0O0 oooO0O0) throws IOException {
        C7842oO0O0.OooO00o(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f20834OooO00o.OooO0O0(65536, byte[].class);
        BitmapFactory.Options OooO00o2 = OooO00o();
        OooO00o2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) o0ooooo.OooO00o(f20825OooO00o);
        try {
            return C7875oO0OOo0o.OooO00o(OooO00o(inputStream, OooO00o2, (DownsampleStrategy) o0ooooo.OooO00o(DownsampleStrategy.f14839OooO00o), decodeFormat, o0ooooo.OooO00o(OooO0Oo) != null && ((Boolean) o0ooooo.OooO00o(OooO0Oo)).booleanValue(), i, i2, ((Boolean) o0ooooo.OooO00o(OooO0OO)).booleanValue(), oooO0O0), this.f20835OooO00o);
        } finally {
            m19441OooO00o(OooO00o2);
            this.f20834OooO00o.OooO00o(bArr);
        }
    }

    private Bitmap OooO00o(InputStream inputStream, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, boolean z, int i, int i2, boolean z2, OooO0O0 oooO0O0) throws IOException {
        C7785oO000o00 oo000o00;
        int i3;
        int i4;
        int i5;
        long OooO00o2 = C7843oO0O00o.OooO00o();
        int[] OooO00o3 = m19443OooO00o(inputStream, options, oooO0O0, this.f20835OooO00o);
        boolean z3 = false;
        int i6 = OooO00o3[0];
        int i7 = OooO00o3[1];
        String str = options.outMimeType;
        boolean z4 = (i6 == -1 || i7 == -1) ? false : z;
        int OooO00o4 = C7645o0oOoOO0.OooO00o(this.f20837OooO00o, inputStream, this.f20834OooO00o);
        int OooO00o5 = C7790oO000oOo.OooO00o(OooO00o4);
        boolean OooO00o6 = C7790oO000oOo.m19447OooO00o(OooO00o4);
        int i8 = i == Integer.MIN_VALUE ? i6 : i;
        int i9 = i2 == Integer.MIN_VALUE ? i7 : i2;
        ImageHeaderParser.ImageType OooO00o7 = C7645o0oOoOO0.m19291OooO00o(this.f20837OooO00o, inputStream, this.f20834OooO00o);
        OooO00o(OooO00o7, inputStream, oooO0O0, this.f20835OooO00o, downsampleStrategy, OooO00o5, i6, i7, i8, i9, options);
        OooO00o(inputStream, decodeFormat, z4, OooO00o6, options, i8, i9);
        if (Build.VERSION.SDK_INT >= 19) {
            z3 = true;
        }
        if (options.inSampleSize == 1 || z3) {
            oo000o00 = this;
            if (oo000o00.OooO00o(OooO00o7)) {
                if (i6 < 0 || i7 < 0 || !z2 || !z3) {
                    float f = m19442OooO00o(options) ? ((float) options.inTargetDensity) / ((float) options.inDensity) : 1.0f;
                    int i10 = options.inSampleSize;
                    float f2 = (float) i10;
                    i5 = Math.round(((float) ((int) Math.ceil((double) (((float) i6) / f2)))) * f);
                    i4 = Math.round(((float) ((int) Math.ceil((double) (((float) i7) / f2)))) * f);
                    if (Log.isLoggable(f20827OooO00o, 2)) {
                        String str2 = "Calculated target [" + i5 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i4 + "] for source [" + i6 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i7 + "], sampleSize: " + i10 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f;
                    }
                } else {
                    i5 = i8;
                    i4 = i9;
                }
                if (i5 > 0 && i4 > 0) {
                    OooO00o(options, oo000o00.f20835OooO00o, i5, i4);
                }
            }
        } else {
            oo000o00 = this;
        }
        Bitmap OooO00o8 = OooO00o(inputStream, options, oooO0O0, oo000o00.f20835OooO00o);
        oooO0O0.OooO00o(oo000o00.f20835OooO00o, OooO00o8);
        if (Log.isLoggable(f20827OooO00o, 2)) {
            i3 = OooO00o4;
            OooO00o(i6, i7, str, options, OooO00o8, i, i2, OooO00o2);
        } else {
            i3 = OooO00o4;
        }
        Bitmap bitmap = null;
        if (OooO00o8 != null) {
            OooO00o8.setDensity(oo000o00.f20833OooO00o.densityDpi);
            bitmap = C7790oO000oOo.OooO00o(oo000o00.f20835OooO00o, OooO00o8, i3);
            if (!OooO00o8.equals(bitmap)) {
                oo000o00.f20835OooO00o.OooO00o(OooO00o8);
            }
        }
        return bitmap;
    }

    public static void OooO00o(ImageHeaderParser.ImageType imageType, InputStream inputStream, OooO0O0 oooO0O0, AbstractC7711o0ooO0OO o0ooo0oo, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        if (i2 > 0 && i3 > 0) {
            if (i == 90 || i == 270) {
                f = downsampleStrategy.OooO00o(i3, i2, i4, i5);
            } else {
                f = downsampleStrategy.OooO00o(i2, i3, i4, i5);
            }
            if (f > 0.0f) {
                DownsampleStrategy.SampleSizeRounding OooO00o2 = downsampleStrategy.m14997OooO00o(i2, i3, i4, i5);
                if (OooO00o2 != null) {
                    float f2 = (float) i2;
                    float f3 = (float) i3;
                    int OooO0OO2 = i2 / OooO0OO((double) (f * f2));
                    int OooO0OO3 = i3 / OooO0OO((double) (f * f3));
                    if (OooO00o2 == DownsampleStrategy.SampleSizeRounding.MEMORY) {
                        i6 = Math.max(OooO0OO2, OooO0OO3);
                    } else {
                        i6 = Math.min(OooO0OO2, OooO0OO3);
                    }
                    if (Build.VERSION.SDK_INT > 23 || !f20829OooO00o.contains(options.outMimeType)) {
                        i7 = Math.max(1, Integer.highestOneBit(i6));
                        if (OooO00o2 == DownsampleStrategy.SampleSizeRounding.MEMORY && ((float) i7) < 1.0f / f) {
                            i7 <<= 1;
                        }
                    } else {
                        i7 = 1;
                    }
                    options.inSampleSize = i7;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(i7, 8);
                        i8 = (int) Math.ceil((double) (f2 / min));
                        i9 = (int) Math.ceil((double) (f3 / min));
                        int i10 = i7 / 8;
                        if (i10 > 0) {
                            i8 /= i10;
                            i9 /= i10;
                        }
                    } else {
                        if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                            float f4 = (float) i7;
                            i8 = (int) Math.floor((double) (f2 / f4));
                            d = Math.floor((double) (f3 / f4));
                        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                float f5 = (float) i7;
                                i8 = Math.round(f2 / f5);
                                i9 = Math.round(f3 / f5);
                            } else {
                                float f6 = (float) i7;
                                i8 = (int) Math.floor((double) (f2 / f6));
                                d = Math.floor((double) (f3 / f6));
                            }
                        } else if (i2 % i7 == 0 && i3 % i7 == 0) {
                            i8 = i2 / i7;
                            i9 = i3 / i7;
                        } else {
                            int[] OooO00o3 = m19443OooO00o(inputStream, options, oooO0O0, o0ooo0oo);
                            int i11 = OooO00o3[0];
                            i9 = OooO00o3[1];
                            i8 = i11;
                        }
                        i9 = (int) d;
                    }
                    double OooO00o4 = (double) downsampleStrategy.OooO00o(i8, i9, i4, i5);
                    if (Build.VERSION.SDK_INT >= 19) {
                        options.inTargetDensity = OooO00o(OooO00o4);
                        options.inDensity = OooO0O0(OooO00o4);
                    }
                    if (m19442OooO00o(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable(f20827OooO00o, 2)) {
                        String str = "Calculate scaling, source: [" + i2 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i3 + "], target: [" + i4 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i5 + "], power of two scaled: [" + i8 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i9 + "], exact scale factor: " + f + ", power of 2 sample size: " + i7 + ", adjusted scale factor: " + OooO00o4 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + f + " from: " + downsampleStrategy + ", source: [" + i2 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i3 + "], target: [" + i4 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i5 + "]");
        } else if (Log.isLoggable(f20827OooO00o, 3)) {
            String str2 = "Unable to determine dimensions for: " + imageType + " with target [" + i4 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i5 + "]";
        }
    }

    public static int OooO00o(double d) {
        int OooO0O02 = OooO0O0(d);
        double d2 = (double) OooO0O02;
        Double.isNaN(d2);
        int OooO0OO2 = OooO0OO(d2 * d);
        double d3 = (double) (((float) OooO0OO2) / ((float) OooO0O02));
        Double.isNaN(d3);
        double d4 = (double) OooO0OO2;
        Double.isNaN(d4);
        return OooO0OO((d / d3) * d4);
    }

    private boolean OooO00o(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f20831OooO0O0.contains(imageType);
    }

    private void OooO00o(InputStream inputStream, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f20836OooO00o.OooO00o(i, i2, options, decodeFormat, z, z2)) {
            if (decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = C7645o0oOoOO0.m19291OooO00o(this.f20837OooO00o, inputStream, this.f20834OooO00o).hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable(f20827OooO00o, 3)) {
                    String str = "Cannot determine whether the image has alpha or not from header, format " + decodeFormat;
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m19443OooO00o(InputStream inputStream, BitmapFactory.Options options, OooO0O0 oooO0O0, AbstractC7711o0ooO0OO o0ooo0oo) throws IOException {
        options.inJustDecodeBounds = true;
        OooO00o(inputStream, options, oooO0O0, o0ooo0oo);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static Bitmap OooO00o(InputStream inputStream, BitmapFactory.Options options, OooO0O0 oooO0O0, AbstractC7711o0ooO0OO o0ooo0oo) throws IOException {
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            oooO0O0.OooO00o();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C7790oO000oOo.OooO00o().lock();
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            C7790oO000oOo.OooO00o().unlock();
            if (options.inJustDecodeBounds) {
                inputStream.reset();
            }
            return decodeStream;
        } catch (IllegalArgumentException e) {
            IOException OooO00o2 = OooO00o(e, i, i2, str, options);
            Log.isLoggable(f20827OooO00o, 3);
            if (options.inBitmap != null) {
                try {
                    inputStream.reset();
                    o0ooo0oo.OooO00o(options.inBitmap);
                    options.inBitmap = null;
                    Bitmap OooO00o3 = OooO00o(inputStream, options, oooO0O0, o0ooo0oo);
                    C7790oO000oOo.OooO00o().unlock();
                    return OooO00o3;
                } catch (IOException unused) {
                    throw OooO00o2;
                }
            } else {
                throw OooO00o2;
            }
        } catch (Throwable th) {
            C7790oO000oOo.OooO00o().unlock();
            throw th;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19442OooO00o(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    public static void OooO00o(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        String str2 = "Decoded " + OooO00o(bitmap) + " from [" + i + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i2 + "] " + str + " with inBitmap " + OooO00o(options) + " for [" + i3 + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C7843oO0O00o.OooO00o(j);
    }

    public static String OooO00o(BitmapFactory.Options options) {
        return OooO00o(options.inBitmap);
    }

    @Nullable
    @TargetApi(19)
    public static String OooO00o(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + C3848l.f10402t;
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    public static IOException OooO00o(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + OooO00o(options), illegalArgumentException);
    }

    @TargetApi(26)
    public static void OooO00o(BitmapFactory.Options options, AbstractC7711o0ooO0OO o0ooo0oo, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = o0ooo0oo.OooO0O0(i, i2, config);
    }

    public static synchronized BitmapFactory.Options OooO00o() {
        BitmapFactory.Options poll;
        synchronized (C7785oO000o00.class) {
            synchronized (f20828OooO00o) {
                poll = f20828OooO00o.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                OooO0O0(poll);
            }
        }
        return poll;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19441OooO00o(BitmapFactory.Options options) {
        OooO0O0(options);
        synchronized (f20828OooO00o) {
            f20828OooO00o.offer(options);
        }
    }
}
