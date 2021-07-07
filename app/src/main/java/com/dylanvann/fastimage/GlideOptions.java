package com.dylanvann.fastimage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.p118pd.sdk.AbstractC7644o0oOoOO;
import com.p118pd.sdk.AbstractC7655o0oOoo0O;
import com.p118pd.sdk.AbstractC7684o0oo0OOo;
import com.p118pd.sdk.C7647o0oOoOOo;
import com.p118pd.sdk.C7824oO00o0oo;

public final class GlideOptions extends C7824oO00o0oo implements Cloneable {
    public static GlideOptions centerCropTransform2;
    public static GlideOptions centerInsideTransform1;
    public static GlideOptions circleCropTransform3;
    public static GlideOptions fitCenterTransform0;
    public static GlideOptions noAnimation5;
    public static GlideOptions noTransformation4;

    @NonNull
    @CheckResult
    public static GlideOptions bitmapTransform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return new GlideOptions().transform(o0oooo0o);
    }

    @NonNull
    @CheckResult
    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    @NonNull
    @CheckResult
    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    @NonNull
    @CheckResult
    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    @NonNull
    @CheckResult
    public static GlideOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new GlideOptions().decode(cls);
    }

    @NonNull
    @CheckResult
    public static GlideOptions diskCacheStrategyOf(@NonNull AbstractC7684o0oo0OOo o0oo0ooo) {
        return new GlideOptions().diskCacheStrategy(o0oo0ooo);
    }

    @NonNull
    @CheckResult
    public static GlideOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new GlideOptions().downsample(downsampleStrategy);
    }

    @NonNull
    @CheckResult
    public static GlideOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat(compressFormat);
    }

    @NonNull
    @CheckResult
    public static GlideOptions encodeQualityOf(@IntRange(from = 0, mo605to = 100) int i) {
        return new GlideOptions().encodeQuality(i);
    }

    @NonNull
    @CheckResult
    public static GlideOptions errorOf(@Nullable Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    @NonNull
    @CheckResult
    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    @NonNull
    @CheckResult
    public static GlideOptions formatOf(@NonNull DecodeFormat decodeFormat) {
        return new GlideOptions().format(decodeFormat);
    }

    @NonNull
    @CheckResult
    public static GlideOptions frameOf(@IntRange(from = 0) long j) {
        return new GlideOptions().frame(j);
    }

    @NonNull
    @CheckResult
    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    @NonNull
    @CheckResult
    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    @NonNull
    @CheckResult
    public static <T> GlideOptions option(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull T t) {
        return new GlideOptions().set((C7647o0oOoOOo) o0oooooo, (Object) t);
    }

    @NonNull
    @CheckResult
    public static GlideOptions overrideOf(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return new GlideOptions().override(i, i2);
    }

    @NonNull
    @CheckResult
    public static GlideOptions placeholderOf(@Nullable Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    @NonNull
    @CheckResult
    public static GlideOptions priorityOf(@NonNull Priority priority) {
        return new GlideOptions().priority(priority);
    }

    @NonNull
    @CheckResult
    public static GlideOptions signatureOf(@NonNull AbstractC7644o0oOoOO o0ooooo) {
        return new GlideOptions().signature(o0ooooo);
    }

    @NonNull
    @CheckResult
    public static GlideOptions sizeMultiplierOf(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        return new GlideOptions().sizeMultiplier(f);
    }

    @NonNull
    @CheckResult
    public static GlideOptions skipMemoryCacheOf(boolean z) {
        return new GlideOptions().skipMemoryCache(z);
    }

    @NonNull
    @CheckResult
    public static GlideOptions timeoutOf(@IntRange(from = 0) int i) {
        return new GlideOptions().timeout(i);
    }

    @NonNull
    @CheckResult
    public static GlideOptions errorOf(@DrawableRes int i) {
        return new GlideOptions().error(i);
    }

    @NonNull
    @CheckResult
    public static GlideOptions overrideOf(@IntRange(from = 0) int i) {
        return new GlideOptions().override(i);
    }

    @NonNull
    @CheckResult
    public static GlideOptions placeholderOf(@DrawableRes int i) {
        return new GlideOptions().placeholder(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions apply(@NonNull C7824oO00o0oo oo00o0oo) {
        return (GlideOptions) super.apply(oo00o0oo);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    public final GlideOptions autoClone() {
        return (GlideOptions) super.autoClone();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions centerCrop() {
        return (GlideOptions) super.centerCrop();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions centerInside() {
        return (GlideOptions) super.centerInside();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions decode(@NonNull Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions disallowHardwareConfig() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions diskCacheStrategy(@NonNull AbstractC7684o0oo0OOo o0oo0ooo) {
        return (GlideOptions) super.diskCacheStrategy(o0oo0ooo);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions dontAnimate() {
        return (GlideOptions) super.dontAnimate();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return (GlideOptions) super.downsample(downsampleStrategy);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (GlideOptions) super.encodeFormat(compressFormat);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions encodeQuality(@IntRange(from = 0, mo605to = 100) int i) {
        return (GlideOptions) super.encodeQuality(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions fitCenter() {
        return (GlideOptions) super.fitCenter();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions format(@NonNull DecodeFormat decodeFormat) {
        return (GlideOptions) super.format(decodeFormat);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions frame(@IntRange(from = 0) long j) {
        return (GlideOptions) super.frame(j);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    public final GlideOptions lock() {
        return (GlideOptions) super.lock();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions onlyRetrieveFromCache(boolean z) {
        return (GlideOptions) super.onlyRetrieveFromCache(z);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions optionalCircleCrop() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions priority(@NonNull Priority priority) {
        return (GlideOptions) super.priority(priority);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final <T> GlideOptions set(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull T t) {
        return (GlideOptions) super.set((C7647o0oOoOOo) o0oooooo, (Object) t);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions signature(@NonNull AbstractC7644o0oOoOO o0ooooo) {
        return (GlideOptions) super.signature(o0ooooo);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions sizeMultiplier(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        return (GlideOptions) super.sizeMultiplier(f);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions skipMemoryCache(boolean z) {
        return (GlideOptions) super.skipMemoryCache(z);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions theme(@Nullable Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions timeout(@IntRange(from = 0) int i) {
        return (GlideOptions) super.timeout(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @SafeVarargs
    @CheckResult
    public final GlideOptions transforms(@NonNull AbstractC7655o0oOoo0O<Bitmap>... o0oooo0oArr) {
        return (GlideOptions) super.transforms(o0oooo0oArr);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions useAnimationPool(boolean z) {
        return (GlideOptions) super.useAnimationPool(z);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo, com.p118pd.sdk.C7824oO00o0oo, java.lang.Object
    @CheckResult
    public final GlideOptions clone() {
        return (GlideOptions) super.clone();
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions error(@Nullable Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions fallback(@Nullable Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions optionalTransform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return (GlideOptions) super.optionalTransform(o0oooo0o);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions override(int i, int i2) {
        return (GlideOptions) super.override(i, i2);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions placeholder(@Nullable Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions transform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        return (GlideOptions) super.transform(o0oooo0o);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions error(@DrawableRes int i) {
        return (GlideOptions) super.error(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions fallback(@DrawableRes int i) {
        return (GlideOptions) super.fallback(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final <T> GlideOptions optionalTransform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o) {
        return (GlideOptions) super.optionalTransform((Class) cls, (AbstractC7655o0oOoo0O) o0oooo0o);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions override(int i) {
        return (GlideOptions) super.override(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final GlideOptions placeholder(@DrawableRes int i) {
        return (GlideOptions) super.placeholder(i);
    }

    @Override // com.p118pd.sdk.C7824oO00o0oo
    @NonNull
    @CheckResult
    public final <T> GlideOptions transform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o) {
        return (GlideOptions) super.transform((Class) cls, (AbstractC7655o0oOoo0O) o0oooo0o);
    }
}
