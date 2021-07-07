package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.p118pd.sdk.AbstractC7623o0oOOoOo;
import com.p118pd.sdk.AbstractC7644o0oOoOO;
import com.p118pd.sdk.AbstractC7655o0oOoo0O;
import com.p118pd.sdk.AbstractC7684o0oo0OOo;
import com.p118pd.sdk.C7622o0oOOoOO;
import com.p118pd.sdk.C7647o0oOoOOo;
import com.p118pd.sdk.C7658o0oOooOO;
import com.p118pd.sdk.C7824oO00o0oo;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import com.p118pd.sdk.oO0OOO0O;
import java.io.File;
import java.net.URL;

public class GlideRequest<TranscodeType> extends C7622o0oOOoOO<TranscodeType> implements Cloneable {
    public GlideRequest(@NonNull Class<TranscodeType> cls, @NonNull C7622o0oOOoOO<?> o0oooooo) {
        super(cls, o0oooooo);
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> centerCrop() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).centerCrop();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).centerCrop();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> centerInside() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).centerInside();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).centerInside();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> circleCrop() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).circleCrop();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).circleCrop();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> decode(@NonNull Class<?> cls) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).decode(cls);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).decode(cls);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).disallowHardwareConfig();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).disallowHardwareConfig();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> diskCacheStrategy(@NonNull AbstractC7684o0oo0OOo o0oo0ooo) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).diskCacheStrategy(o0oo0ooo);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).diskCacheStrategy(o0oo0ooo);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> dontAnimate() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).dontAnimate();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).dontAnimate();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> dontTransform() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).dontTransform();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).dontTransform();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).downsample(downsampleStrategy);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).downsample(downsampleStrategy);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).encodeFormat(compressFormat);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).encodeFormat(compressFormat);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> encodeQuality(@IntRange(from = 0, mo605to = 100) int i) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).encodeQuality(i);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).encodeQuality(i);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> fallback(@Nullable Drawable drawable) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).fallback(drawable);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).fallback(drawable);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> fitCenter() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).fitCenter();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).fitCenter();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> format(@NonNull DecodeFormat decodeFormat) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).format(decodeFormat);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).format(decodeFormat);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> frame(@IntRange(from = 0) long j) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).frame(j);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).frame(j);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).onlyRetrieveFromCache(z);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).onlyRetrieveFromCache(z);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCenterCrop();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCenterCrop();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalCenterInside() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCenterInside();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCenterInside();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalCircleCrop() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).optionalCircleCrop();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalCircleCrop();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalFitCenter() {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).optionalFitCenter();
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalFitCenter();
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> optionalTransform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).optionalTransform(o0oooo0o);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalTransform(o0oooo0o);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> override(int i, int i2) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).override(i, i2);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).override(i, i2);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> placeholder(@Nullable Drawable drawable) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).placeholder(drawable);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).placeholder(drawable);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> priority(@NonNull Priority priority) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).priority(priority);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).priority(priority);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public <T> GlideRequest<TranscodeType> set(@NonNull C7647o0oOoOOo<T> o0oooooo, @NonNull T t) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).set((C7647o0oOoOOo) o0oooooo, (Object) t);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).set((C7647o0oOoOOo) o0oooooo, (Object) t);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> signature(@NonNull AbstractC7644o0oOoOO o0ooooo) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).signature(o0ooooo);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).signature(o0ooooo);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> sizeMultiplier(@FloatRange(from = 0.0d, mo599to = 1.0d) float f) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).sizeMultiplier(f);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).sizeMultiplier(f);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> skipMemoryCache(boolean z) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).skipMemoryCache(z);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).skipMemoryCache(z);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> theme(@Nullable Resources.Theme theme) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).theme(theme);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).theme(theme);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> timeout(@IntRange(from = 0) int i) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).timeout(i);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).timeout(i);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> transform(@NonNull AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).transform(o0oooo0o);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).transform(o0oooo0o);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> transforms(@NonNull AbstractC7655o0oOoo0O<Bitmap>... o0oooo0oArr) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).transforms(o0oooo0oArr);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).transforms(o0oooo0oArr);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> useAnimationPool(boolean z) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).useAnimationPool(z);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).useAnimationPool(z);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean z) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).useUnlimitedSourceGeneratorsPool(z);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).useUnlimitedSourceGeneratorsPool(z);
        }
        return this;
    }

    public GlideRequest(@NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull C7658o0oOooOO o0oooooo, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(o0o0oo0o, o0oooooo, cls, context);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> addListener(@Nullable oO0OOO0O<TranscodeType> oo0ooo0o) {
        return (GlideRequest) super.addListener((oO0OOO0O) oo0ooo0o);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> apply(@NonNull C7824oO00o0oo oo00o0oo) {
        return (GlideRequest) super.apply(oo00o0oo);
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> error(@Nullable Drawable drawable) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).error(drawable);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).error(drawable);
        }
        return this;
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply(C7622o0oOOoOO.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> listener(@Nullable oO0OOO0O<TranscodeType> oo0ooo0o) {
        return (GlideRequest) super.listener((oO0OOO0O) oo0ooo0o);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> transition(@NonNull AbstractC7623o0oOOoOo<?, ? super TranscodeType> o0oooooo) {
        return (GlideRequest) super.transition((AbstractC7623o0oOOoOo) o0oooooo);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, java.lang.Object
    @CheckResult
    public GlideRequest<TranscodeType> clone() {
        return (GlideRequest) super.clone();
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> fallback(@DrawableRes int i) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).fallback(i);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).fallback(i);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public <T> GlideRequest<TranscodeType> optionalTransform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).optionalTransform((Class) cls, (AbstractC7655o0oOoo0O) o0oooo0o);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).optionalTransform((Class) cls, (AbstractC7655o0oOoo0O) o0oooo0o);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> override(int i) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).override(i);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).override(i);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> placeholder(@DrawableRes int i) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).placeholder(i);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).placeholder(i);
        }
        return this;
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> thumbnail(@Nullable C7622o0oOOoOO<TranscodeType> o0oooooo) {
        return (GlideRequest) super.thumbnail((C7622o0oOOoOO) o0oooooo);
    }

    @NonNull
    @CheckResult
    public <T> GlideRequest<TranscodeType> transform(@NonNull Class<T> cls, @NonNull AbstractC7655o0oOoo0O<T> o0oooo0o) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).transform((Class) cls, (AbstractC7655o0oOoo0O) o0oooo0o);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).transform((Class) cls, (AbstractC7655o0oOoo0O) o0oooo0o);
        }
        return this;
    }

    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> error(@DrawableRes int i) {
        if (getMutableOptions() instanceof GlideOptions) {
            this.requestOptions = ((GlideOptions) getMutableOptions()).error(i);
        } else {
            this.requestOptions = new GlideOptions().apply(this.requestOptions).error(i);
        }
        return this;
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @SafeVarargs
    @CheckResult
    public final GlideRequest<TranscodeType> thumbnail(@Nullable C7622o0oOOoOO<TranscodeType>... o0ooooooArr) {
        return (GlideRequest) super.thumbnail((C7622o0oOOoOO[]) o0ooooooArr);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> thumbnail(float f) {
        return (GlideRequest) super.thumbnail(f);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO
    @NonNull
    public GlideRequest<TranscodeType> error(@Nullable C7622o0oOOoOO<TranscodeType> o0oooooo) {
        return (GlideRequest) super.error((C7622o0oOOoOO) o0oooooo);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Object obj) {
        return (GlideRequest) super.load(obj);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Bitmap bitmap) {
        return (GlideRequest) super.load(bitmap);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Drawable drawable) {
        return (GlideRequest) super.load(drawable);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable String str) {
        return (GlideRequest) super.load(str);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable Uri uri) {
        return (GlideRequest) super.load(uri);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable File file) {
        return (GlideRequest) super.load(file);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable @DrawableRes @RawRes Integer num) {
        return (GlideRequest) super.load(num);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @CheckResult
    @Deprecated
    public GlideRequest<TranscodeType> load(@Nullable URL url) {
        return (GlideRequest) super.load(url);
    }

    @Override // com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.C7622o0oOOoOO, com.p118pd.sdk.AbstractC7610o0o0Ooo0
    @NonNull
    @CheckResult
    public GlideRequest<TranscodeType> load(@Nullable byte[] bArr) {
        return (GlideRequest) super.load(bArr);
    }
}
